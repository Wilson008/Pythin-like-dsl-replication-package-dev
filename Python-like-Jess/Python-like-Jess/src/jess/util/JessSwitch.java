/**
 */
package jess.util;

import jess.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jess.JessPackage
 * @generated
 */
public class JessSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JessPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JessSwitch() {
		if (modelPackage == null) {
			modelPackage = JessPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JessPackage.LOCATED_ELEMENT: {
				LocatedElement locatedElement = (LocatedElement)theEObject;
				T result = caseLocatedElement(locatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = caseLocatedElement(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseLocatedElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.INTEG: {
				Integ integ = (Integ)theEObject;
				T result = caseInteg(integ);
				if (result == null) result = caseExpression(integ);
				if (result == null) result = caseLocatedElement(integ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.FLOA: {
				Floa floa = (Floa)theEObject;
				T result = caseFloa(floa);
				if (result == null) result = caseExpression(floa);
				if (result == null) result = caseLocatedElement(floa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.STR: {
				Str str = (Str)theEObject;
				T result = caseStr(str);
				if (result == null) result = caseExpression(str);
				if (result == null) result = caseLocatedElement(str);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.IDENT: {
				Ident ident = (Ident)theEObject;
				T result = caseIdent(ident);
				if (result == null) result = caseExpression(ident);
				if (result == null) result = caseLocatedElement(ident);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.VALID_IDENTIFIER: {
				ValidIdentifier validIdentifier = (ValidIdentifier)theEObject;
				T result = caseValidIdentifier(validIdentifier);
				if (result == null) result = caseIdent(validIdentifier);
				if (result == null) result = caseExpression(validIdentifier);
				if (result == null) result = caseLocatedElement(validIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.SLOT_NAME: {
				SlotName slotName = (SlotName)theEObject;
				T result = caseSlotName(slotName);
				if (result == null) result = caseIdent(slotName);
				if (result == null) result = caseExpression(slotName);
				if (result == null) result = caseLocatedElement(slotName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.JESS_VARIABLE: {
				JessVariable jessVariable = (JessVariable)theEObject;
				T result = caseJessVariable(jessVariable);
				if (result == null) result = caseIdent(jessVariable);
				if (result == null) result = caseExpression(jessVariable);
				if (result == null) result = caseLocatedElement(jessVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.TEMPLATE_EXPRESSION: {
				TemplateExpression templateExpression = (TemplateExpression)theEObject;
				T result = caseTemplateExpression(templateExpression);
				if (result == null) result = caseExpression(templateExpression);
				if (result == null) result = caseLocatedElement(templateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.SLOT_OP: {
				SlotOp slotOp = (SlotOp)theEObject;
				T result = caseSlotOp(slotOp);
				if (result == null) result = caseLocatedElement(slotOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.DEFINITION_EXP: {
				DefinitionExp definitionExp = (DefinitionExp)theEObject;
				T result = caseDefinitionExp(definitionExp);
				if (result == null) result = caseExpression(definitionExp);
				if (result == null) result = caseLocatedElement(definitionExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.GLOBAL_DEFINITION: {
				GlobalDefinition globalDefinition = (GlobalDefinition)theEObject;
				T result = caseGlobalDefinition(globalDefinition);
				if (result == null) result = caseDefinitionExp(globalDefinition);
				if (result == null) result = caseExpression(globalDefinition);
				if (result == null) result = caseLocatedElement(globalDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.VAR_DEFINITION: {
				VarDefinition varDefinition = (VarDefinition)theEObject;
				T result = caseVarDefinition(varDefinition);
				if (result == null) result = caseLocatedElement(varDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.FUNCTION_DEFINITION: {
				FunctionDefinition functionDefinition = (FunctionDefinition)theEObject;
				T result = caseFunctionDefinition(functionDefinition);
				if (result == null) result = caseDefinitionExp(functionDefinition);
				if (result == null) result = caseExpression(functionDefinition);
				if (result == null) result = caseLocatedElement(functionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.ADVICE_DEFINITION: {
				AdviceDefinition adviceDefinition = (AdviceDefinition)theEObject;
				T result = caseAdviceDefinition(adviceDefinition);
				if (result == null) result = caseDefinitionExp(adviceDefinition);
				if (result == null) result = caseExpression(adviceDefinition);
				if (result == null) result = caseLocatedElement(adviceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.UN_DEF_ADVICE: {
				UnDefAdvice unDefAdvice = (UnDefAdvice)theEObject;
				T result = caseUnDefAdvice(unDefAdvice);
				if (result == null) result = caseDefinitionExp(unDefAdvice);
				if (result == null) result = caseExpression(unDefAdvice);
				if (result == null) result = caseLocatedElement(unDefAdvice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.FACT_DEFINITION: {
				FactDefinition factDefinition = (FactDefinition)theEObject;
				T result = caseFactDefinition(factDefinition);
				if (result == null) result = caseDefinitionExp(factDefinition);
				if (result == null) result = caseExpression(factDefinition);
				if (result == null) result = caseLocatedElement(factDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.RULE_DEFINITION: {
				RuleDefinition ruleDefinition = (RuleDefinition)theEObject;
				T result = caseRuleDefinition(ruleDefinition);
				if (result == null) result = caseDefinitionExp(ruleDefinition);
				if (result == null) result = caseExpression(ruleDefinition);
				if (result == null) result = caseLocatedElement(ruleDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.DECLARE_RULE: {
				DeclareRule declareRule = (DeclareRule)theEObject;
				T result = caseDeclareRule(declareRule);
				if (result == null) result = caseLocatedElement(declareRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.MODULE_DEFINITION: {
				ModuleDefinition moduleDefinition = (ModuleDefinition)theEObject;
				T result = caseModuleDefinition(moduleDefinition);
				if (result == null) result = caseDefinitionExp(moduleDefinition);
				if (result == null) result = caseExpression(moduleDefinition);
				if (result == null) result = caseLocatedElement(moduleDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.QUERY_DEFINITION: {
				QueryDefinition queryDefinition = (QueryDefinition)theEObject;
				T result = caseQueryDefinition(queryDefinition);
				if (result == null) result = caseDefinitionExp(queryDefinition);
				if (result == null) result = caseExpression(queryDefinition);
				if (result == null) result = caseLocatedElement(queryDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.DECLARE_VAR: {
				DeclareVar declareVar = (DeclareVar)theEObject;
				T result = caseDeclareVar(declareVar);
				if (result == null) result = caseLocatedElement(declareVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.TEMPLATE_DEFINITION: {
				TemplateDefinition templateDefinition = (TemplateDefinition)theEObject;
				T result = caseTemplateDefinition(templateDefinition);
				if (result == null) result = caseDefinitionExp(templateDefinition);
				if (result == null) result = caseExpression(templateDefinition);
				if (result == null) result = caseLocatedElement(templateDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.DECLARE_BLOC: {
				DeclareBloc declareBloc = (DeclareBloc)theEObject;
				T result = caseDeclareBloc(declareBloc);
				if (result == null) result = caseLocatedElement(declareBloc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.ASLOT_DEF: {
				ASlotDef aSlotDef = (ASlotDef)theEObject;
				T result = caseASlotDef(aSlotDef);
				if (result == null) result = caseLocatedElement(aSlotDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.SLOT_DEF: {
				SlotDef slotDef = (SlotDef)theEObject;
				T result = caseSlotDef(slotDef);
				if (result == null) result = caseASlotDef(slotDef);
				if (result == null) result = caseLocatedElement(slotDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.MULTI_SLOT_DEF: {
				MultiSlotDef multiSlotDef = (MultiSlotDef)theEObject;
				T result = caseMultiSlotDef(multiSlotDef);
				if (result == null) result = caseASlotDef(multiSlotDef);
				if (result == null) result = caseLocatedElement(multiSlotDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.SLOT_OPTIONS: {
				SlotOptions slotOptions = (SlotOptions)theEObject;
				T result = caseSlotOptions(slotOptions);
				if (result == null) result = caseLocatedElement(slotOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.USE_FUNC_EXP: {
				UseFuncExp useFuncExp = (UseFuncExp)theEObject;
				T result = caseUseFuncExp(useFuncExp);
				if (result == null) result = caseExpression(useFuncExp);
				if (result == null) result = caseLocatedElement(useFuncExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.WHILE_EXP: {
				WhileExp whileExp = (WhileExp)theEObject;
				T result = caseWhileExp(whileExp);
				if (result == null) result = caseUseFuncExp(whileExp);
				if (result == null) result = caseExpression(whileExp);
				if (result == null) result = caseLocatedElement(whileExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.FOR_EXP: {
				ForExp forExp = (ForExp)theEObject;
				T result = caseForExp(forExp);
				if (result == null) result = caseUseFuncExp(forExp);
				if (result == null) result = caseExpression(forExp);
				if (result == null) result = caseLocatedElement(forExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.FOREACH_EXP: {
				ForeachExp foreachExp = (ForeachExp)theEObject;
				T result = caseForeachExp(foreachExp);
				if (result == null) result = caseUseFuncExp(foreachExp);
				if (result == null) result = caseExpression(foreachExp);
				if (result == null) result = caseLocatedElement(foreachExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.FUNC_CALL: {
				FuncCall funcCall = (FuncCall)theEObject;
				T result = caseFuncCall(funcCall);
				if (result == null) result = caseUseFuncExp(funcCall);
				if (result == null) result = caseExpression(funcCall);
				if (result == null) result = caseLocatedElement(funcCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.ENGINE_EXP: {
				EngineExp engineExp = (EngineExp)theEObject;
				T result = caseEngineExp(engineExp);
				if (result == null) result = caseUseFuncExp(engineExp);
				if (result == null) result = caseExpression(engineExp);
				if (result == null) result = caseLocatedElement(engineExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.EXIT_EXP: {
				ExitExp exitExp = (ExitExp)theEObject;
				T result = caseExitExp(exitExp);
				if (result == null) result = caseUseFuncExp(exitExp);
				if (result == null) result = caseExpression(exitExp);
				if (result == null) result = caseLocatedElement(exitExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.IF_EXPRESSION: {
				IfExpression ifExpression = (IfExpression)theEObject;
				T result = caseIfExpression(ifExpression);
				if (result == null) result = caseUseFuncExp(ifExpression);
				if (result == null) result = caseExpression(ifExpression);
				if (result == null) result = caseLocatedElement(ifExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.CONDITION_ACTION: {
				ConditionAction conditionAction = (ConditionAction)theEObject;
				T result = caseConditionAction(conditionAction);
				if (result == null) result = caseLocatedElement(conditionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JessPackage.ELIF_CONDITION_ACTION: {
				ElifConditionAction elifConditionAction = (ElifConditionAction)theEObject;
				T result = caseElifConditionAction(elifConditionAction);
				if (result == null) result = caseLocatedElement(elifConditionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedElement(LocatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteg(Integ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloa(Floa object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Str</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Str</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStr(Str object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ident</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ident</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdent(Ident object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidIdentifier(ValidIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlotName(SlotName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJessVariable(JessVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpression(TemplateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlotOp(SlotOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionExp(DefinitionExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalDefinition(GlobalDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarDefinition(VarDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDefinition(FunctionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advice Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advice Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdviceDefinition(AdviceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Un Def Advice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Un Def Advice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnDefAdvice(UnDefAdvice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactDefinition(FactDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleDefinition(RuleDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declare Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declare Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclareRule(DeclareRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinition(ModuleDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryDefinition(QueryDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declare Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declare Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclareVar(DeclareVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateDefinition(TemplateDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declare Bloc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declare Bloc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclareBloc(DeclareBloc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASlot Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASlot Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASlotDef(ASlotDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlotDef(SlotDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Slot Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Slot Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiSlotDef(MultiSlotDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlotOptions(SlotOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Func Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Func Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseFuncExp(UseFuncExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileExp(WhileExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForExp(ForExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foreach Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foreach Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForeachExp(ForeachExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Func Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Func Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncCall(FuncCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineExp(EngineExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitExp(ExitExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfExpression(IfExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionAction(ConditionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elif Condition Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elif Condition Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElifConditionAction(ElifConditionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JessSwitch
