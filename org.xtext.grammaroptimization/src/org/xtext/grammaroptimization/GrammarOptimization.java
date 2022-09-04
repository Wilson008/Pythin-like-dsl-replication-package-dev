package org.xtext.grammaroptimization;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrammarOptimization {

	public class GrammarRule {
		public List<String> lines;
	}

	/**
	 * Main method (entry method) Note: The way to get path of xtext file is
	 * suitable for whom hasn't installed RCP
	 */
	public static void main(String[] args) {
		System.out.println("[Info]**************************************Start optimizing grammar!");
		// Get object of current class
		GrammarOptimization optimizer = new GrammarOptimization();

		File xtextFile = getProjectFile(optimizer);

		if (!xtextFile.exists()) {
			System.err.printf("[Error]**************************************File %s doesn't exist!\n", xtextFile.getName());
			System.err.println("[Error]**************Place check the name and path of the xtext file!");
			System.err.println("[Error]**********Please make sure you have generated xtext artifacts!");
			System.err.println("[Error]**********************************************Stop optimizing!");
			return;
		}

		// 1. Modify the xtext file
		if (!optimizer.optimizeXtext(xtextFile)) {
			System.err.println("[Error]*************************Failed to optimize xtext, so stopped!");
			return;
		}

		System.out.println("[Info]*************************Stop optimizing grammar! Successfully!");
	}

	private static File getProjectFile(GrammarOptimization optimizer) {
		
		File file = null;

		/***************************************************************************
		 * To uses:
		 * Please change the file path here according to your machine.
		 * *************************************************************************/
		String xtextFileName = "D:\\02.Git Repository\\DAT240\\Python-like-DSL\\DemoDSL\\org.xtext.demo.mydsl\\src\\org\\xtext\\demo\\mydsl\\MyDsl.xtext";
		file = new File(xtextFileName);
		
		return file;
	}

	/**
	 * Optimize xtext grammar as a whole
	 */
	public boolean optimizeXtext(File file) {

		try {
			// read whole content from xtext file
			String strOrigin = IOHelper.readFile(file);

			if (null == strOrigin || strOrigin.isEmpty()) {
				System.err.printf("[Error]************************Failed to read string from xtext file.\n");
				return false;
			}	

			// 0.1 Add rule for EString
			String strProcessed = addDefinitionOfEString(strOrigin);
			// 0.2 Modify or Add Datatype rules
			strProcessed = implementRules(strProcessed);
			
			// 1. Remove tab symbols (by replacing with four whitespace)
			strProcessed = replaceString(strProcessed, "\t", "    ");
			System.out.println("[Info] Finish removing tab symbols by replacing with four whitespace!");

			// 2. Remove brackets by replacing them with BEGIN and END
			strProcessed = removeBrackets(strProcessed);
			System.out.println("[Info]******Finish removing brackets by replacing with BEGIN and END.");

			// 3. Clarify BEGIN and END
			/***************************************************************************
			 * To uses:
			 * Please change the file path here according to your machine.
			 * *************************************************************************/
			String directoryName = "D:\\02.Git Repository\\eatxt\\plugins\\org.bumble.eatxt.grammaroptimization";
			strProcessed = clarifyBeginAndEnd(strProcessed, directoryName);
			System.out.println("[Info]*****************Finish clarifying BEGIN and END in xtext file.");

			// 4. Add import
			strProcessed = addImport(strProcessed);
			System.out.println("[Info]***********Finish adding import to the beginning of xtext file.");

			// 6. Remove commas
			strProcessed = removeComma(strProcessed);
			System.out.println("[Info]*********************************Finish removing comma symbols.");
			
			// write the optimized grammar back into the xtext file
			IOHelper.saveFile(file, strProcessed);
		} catch (IOException e) {
			System.err.printf("[Error] Failed to optimize the whole file, err: %s\n", e.getMessage());
			return false;
		}

		return true;
	}
	
	public boolean isLineOptional(String strLine) {
		boolean bRet = false;
		
		if (checkExistofString(strLine, ".*\\)(\\s)*\\?")) {
			bRet = true;
		}
		
		return bRet;
	}
	
	public String implementRules(String strInput) {
		String strOutput = null;
		
		// implement a rule for Integer
		strOutput = replaceString(strInput, "\\'Integer\\'\\s\\/\\*\\sTODO\\:\\s.*\\s\\*\\/\\;", "INT;");

		// implement a rule for Float
		strOutput = replaceString(strOutput, "Float returns Float:", "Float returns ecore\\:\\:EDouble\\:");
		strOutput = replaceString(strOutput, "\\'Float\\'\\s\\/\\*\\sTODO.*\\*\\/", "INT \\'\\.\\' INT");
		
		// implement a rule for String0
		strOutput = replaceString(strOutput, "\\'String\\'\\s\\/\\*\\sTODO.*\\*\\/", "ID");
		
		// implement a rule for Identifier
		strOutput = replaceString(strOutput, "\\'Identifier\\'\\s\\/\\*\\sTODO.*\\*\\/", "ID");
		
		// implement a rule for Boolean
		strOutput = replaceString(strOutput, "Boolean\\sreturns\\sBoolean", "Boolean returns ecore::EBoolean");
		strOutput = replaceString(strOutput, "\\'Boolean\\'\\s\\/\\*\\sTODO.*\\*\\/", "'true' | 'false'");
		
		return strOutput;
	}
	
	public String removeComma(String strInput) {
		String strOutput = null;
		
		strOutput = replaceString(strInput, "\",\"", "");
		
		return strOutput;
	}
	
	public String replaceString(String strInput, String strRegex, String strReplacement) {
		String strOutput = null;
		Pattern pattern = Pattern.compile(strRegex);
		Matcher matcher = pattern.matcher(strInput);

		if (matcher.find()) {
			strOutput = matcher.replaceAll(strReplacement);
		} else {
			System.err.printf("[Error] Failed to find strRegex: %s!\n", strRegex);
			strOutput = strInput;
		}

		return strOutput;
	}

	/**
	 * Specific optimization operation
	 */
	public String removeBrackets(String strInput) {
		String strOutput = "";

		// remove '{' and '}' from input string
		String regex1 = "([\'])([{])([\'])";
		String strTemp2 = strInput.replaceAll(regex1, "BEGIN");
		String regex2 = "([\'])([}])([\'])";
		strOutput = strTemp2.replaceAll(regex2, "END");

		return strOutput;
	}

	public String clarifyBeginAndEnd(String strInput, String directoryName) {
		String strOutput = "";

		String strReplaceEndFile = directoryName + "\\ClarificationTextforBEGINandEND.txt";

		// Create file object for replacement text
		File fileReplaceText = new File(strReplaceEndFile);

		if (!fileReplaceText.exists()) {
			System.err.printf("[Error]*******File ClarificationTextforBEGINandEND.txt doesn't exist!\n");
			System.err.printf("[Error]**************************Stop modifying formatter xtend file.\n");
			return null;
		}

		// read whole content from xtext file
		String strAddEnd = null;
		try {
			strAddEnd = IOHelper.readFile(fileReplaceText);
			String strRegex = "XBlockExpression\\sreturns";

			if (!checkExistofString(strInput, strRegex)) {
				strOutput = strInput + '\n' + strAddEnd;
			} else {
				System.out.printf("[Warning]********The definition of XBlockExpression is already exist.\n");
				strOutput = strInput;
			}
		} catch (IOException e) {
			System.err.printf("[Error] Failed to read text from ClarificationTextforBEGINandEND.txt!\n");
			return strInput;
		}

		return strOutput;
	}

	public String addImport(String strInput) {
		String strOutput = "";
		String strRegex = "org.eclipse.xtext.common.Terminals";
		String strReplace = "org.eclipse.xtext.xbase.Xbase" + '\n'
				+ "import \"http://www.eclipse.org/xtext/xbase/Xbase\" as xbase";

		strOutput = replaceString(strInput, strRegex, strReplace);
		return strOutput;
	}

	public String addDefinitionOfEString(String strInput) {
		String strOutput = "";

		String strRegex = "EString\\sreturns";

		if (checkExistofString(strInput, strRegex)) {
			return strInput;
		}

		// If doesn't, please add a definition for EString
		String strDefinition = "\n\nEString returns ecore::EString:\n    STRING | ID;\n";
		strOutput = strInput + strDefinition;
		return strOutput;
	}

	public boolean checkExistofString(String strInput, String strRegex) {
		boolean isExist = false;

		Pattern pattern = Pattern.compile(strRegex);
		Matcher matcher = pattern.matcher(strInput);

		if (matcher.find()) {
			isExist = true;
		}

		return isExist;
	}

	/**
	 * Optimize xtext grammar line by line
	 */
	public void OptimizeInLIne(String fileName) {
		File file = new File(fileName);
		List<String> listString = new ArrayList<String>();

		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);

			// read and process string line by line
			try {
				String strSource, strTarget;
				while ((strSource = br.readLine()) != null) {
					// remove '{' and '}' from input string
					strTarget = removeBrackets(strSource);

					// put the processed string into list
					listString.add(strTarget);
				}
			} catch (IOException e) {
				System.err.printf("[Error] Failed to read lines from file, err: %s\n", e.getMessage());
			}

			if (listString.isEmpty())
				return;

			// write the processed strings into the file (cover the origin text)
			BufferedWriter writer;
			try {
				writer = new BufferedWriter(new FileWriter(fileName));

				for (String strTemp : listString) {
					try {
						writer.write(strTemp + "\r\n");
					} catch (IOException e) {
						System.err.printf("[Error] Failed to write grammar back to xtext file, err: %s\n",
								e.getMessage());
					}
				}

				writer.flush();
				writer.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Get the second matching group of the regex in a specific string
	 */
	private String getTargetString(String strOrigin, Pattern pattern) {
		if (null == strOrigin || null == pattern)
			return null;

		Matcher matcher = pattern.matcher(strOrigin);

		if (matcher.find()) {
			return matcher.group(1);
		}

		return null;
	}
	
	private int getNumberofWhitespaceatHead(String strInput) {
		int number = 0;
		
		if (!strInput.isBlank() && !strInput.isEmpty()) {
			char[] cInput = strInput.toCharArray();
			
			if (cInput.length != 0) {
				for (int i = 0; i < cInput.length; i++) {
					if (cInput[i] == ' ')
						number++;
					// one tab symbol = four whitespace
					else if (cInput[i] == '\t')
						number += 4;
					else
						break;
				}
			}
		}
		
		return number;
	}

	/**
	 * test code
	 */
	public void test() {
		String EXAMPLE_TEST = " text	'{'";

		int nLine = 0;

		// print the origin text
		System.out.print(Integer.toString(nLine) + EXAMPLE_TEST + "\n");
		nLine++;

		// print the text after replacing tab symbol into whitespace
		Pattern replace1 = Pattern.compile("\t");
		Matcher matcher1 = replace1.matcher(EXAMPLE_TEST);
		System.out.print(Integer.toString(nLine) + matcher1.replaceAll("\\s\\s\\s\\s").toString() + "\n");
		nLine++;

		// print the text after removing '{'
		String regex = "([\'])([{])([\'])";
		System.out.print(Integer.toString(nLine));
		System.out.println(EXAMPLE_TEST.replaceAll(regex, " "));
		nLine++;
	}
}