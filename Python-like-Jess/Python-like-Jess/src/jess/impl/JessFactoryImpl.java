/**
 */
package jess.impl;

import jess.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JessFactoryImpl extends EFactoryImpl implements JessFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JessFactory init() {
		try {
			JessFactory theJessFactory = (JessFactory)EPackage.Registry.INSTANCE.getEFactory(JessPackage.eNS_URI);
			if (theJessFactory != null) {
				return theJessFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JessFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JessPackage.ROOT: return createRoot();
			case JessPackage.INTEG: return createInteg();
			case JessPackage.FLOA: return createFloa();
			case JessPackage.STR: return createStr();
			case JessPackage.VALID_IDENTIFIER: return createValidIdentifier();
			case JessPackage.SLOT_NAME: return createSlotName();
			case JessPackage.JESS_VARIABLE: return createJessVariable();
			case JessPackage.TEMPLATE_EXPRESSION: return createTemplateExpression();
			case JessPackage.SLOT_OP: return createSlotOp();
			case JessPackage.GLOBAL_DEFINITION: return createGlobalDefinition();
			case JessPackage.VAR_DEFINITION: return createVarDefinition();
			case JessPackage.FUNCTION_DEFINITION: return createFunctionDefinition();
			case JessPackage.ADVICE_DEFINITION: return createAdviceDefinition();
			case JessPackage.UN_DEF_ADVICE: return createUnDefAdvice();
			case JessPackage.FACT_DEFINITION: return createFactDefinition();
			case JessPackage.RULE_DEFINITION: return createRuleDefinition();
			case JessPackage.DECLARE_RULE: return createDeclareRule();
			case JessPackage.MODULE_DEFINITION: return createModuleDefinition();
			case JessPackage.QUERY_DEFINITION: return createQueryDefinition();
			case JessPackage.DECLARE_VAR: return createDeclareVar();
			case JessPackage.TEMPLATE_DEFINITION: return createTemplateDefinition();
			case JessPackage.DECLARE_BLOC: return createDeclareBloc();
			case JessPackage.ASLOT_DEF: return createASlotDef();
			case JessPackage.SLOT_DEF: return createSlotDef();
			case JessPackage.MULTI_SLOT_DEF: return createMultiSlotDef();
			case JessPackage.SLOT_OPTIONS: return createSlotOptions();
			case JessPackage.WHILE_EXP: return createWhileExp();
			case JessPackage.FOR_EXP: return createForExp();
			case JessPackage.FOREACH_EXP: return createForeachExp();
			case JessPackage.FUNC_CALL: return createFuncCall();
			case JessPackage.ENGINE_EXP: return createEngineExp();
			case JessPackage.EXIT_EXP: return createExitExp();
			case JessPackage.IF_EXPRESSION: return createIfExpression();
			case JessPackage.CONDITION_ACTION: return createConditionAction();
			case JessPackage.ELIF_CONDITION_ACTION: return createElifConditionAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JessPackage.ADVICE:
				return createAdviceFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JessPackage.ADVICE:
				return convertAdviceToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integ createInteg() {
		IntegImpl integ = new IntegImpl();
		return integ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floa createFloa() {
		FloaImpl floa = new FloaImpl();
		return floa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Str createStr() {
		StrImpl str = new StrImpl();
		return str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidIdentifier createValidIdentifier() {
		ValidIdentifierImpl validIdentifier = new ValidIdentifierImpl();
		return validIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotName createSlotName() {
		SlotNameImpl slotName = new SlotNameImpl();
		return slotName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JessVariable createJessVariable() {
		JessVariableImpl jessVariable = new JessVariableImpl();
		return jessVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpression createTemplateExpression() {
		TemplateExpressionImpl templateExpression = new TemplateExpressionImpl();
		return templateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotOp createSlotOp() {
		SlotOpImpl slotOp = new SlotOpImpl();
		return slotOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalDefinition createGlobalDefinition() {
		GlobalDefinitionImpl globalDefinition = new GlobalDefinitionImpl();
		return globalDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDefinition createVarDefinition() {
		VarDefinitionImpl varDefinition = new VarDefinitionImpl();
		return varDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDefinition createFunctionDefinition() {
		FunctionDefinitionImpl functionDefinition = new FunctionDefinitionImpl();
		return functionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdviceDefinition createAdviceDefinition() {
		AdviceDefinitionImpl adviceDefinition = new AdviceDefinitionImpl();
		return adviceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnDefAdvice createUnDefAdvice() {
		UnDefAdviceImpl unDefAdvice = new UnDefAdviceImpl();
		return unDefAdvice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactDefinition createFactDefinition() {
		FactDefinitionImpl factDefinition = new FactDefinitionImpl();
		return factDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleDefinition createRuleDefinition() {
		RuleDefinitionImpl ruleDefinition = new RuleDefinitionImpl();
		return ruleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareRule createDeclareRule() {
		DeclareRuleImpl declareRule = new DeclareRuleImpl();
		return declareRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinition createModuleDefinition() {
		ModuleDefinitionImpl moduleDefinition = new ModuleDefinitionImpl();
		return moduleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryDefinition createQueryDefinition() {
		QueryDefinitionImpl queryDefinition = new QueryDefinitionImpl();
		return queryDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareVar createDeclareVar() {
		DeclareVarImpl declareVar = new DeclareVarImpl();
		return declareVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateDefinition createTemplateDefinition() {
		TemplateDefinitionImpl templateDefinition = new TemplateDefinitionImpl();
		return templateDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareBloc createDeclareBloc() {
		DeclareBlocImpl declareBloc = new DeclareBlocImpl();
		return declareBloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASlotDef createASlotDef() {
		ASlotDefImpl aSlotDef = new ASlotDefImpl();
		return aSlotDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotDef createSlotDef() {
		SlotDefImpl slotDef = new SlotDefImpl();
		return slotDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSlotDef createMultiSlotDef() {
		MultiSlotDefImpl multiSlotDef = new MultiSlotDefImpl();
		return multiSlotDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotOptions createSlotOptions() {
		SlotOptionsImpl slotOptions = new SlotOptionsImpl();
		return slotOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileExp createWhileExp() {
		WhileExpImpl whileExp = new WhileExpImpl();
		return whileExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForExp createForExp() {
		ForExpImpl forExp = new ForExpImpl();
		return forExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeachExp createForeachExp() {
		ForeachExpImpl foreachExp = new ForeachExpImpl();
		return foreachExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuncCall createFuncCall() {
		FuncCallImpl funcCall = new FuncCallImpl();
		return funcCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineExp createEngineExp() {
		EngineExpImpl engineExp = new EngineExpImpl();
		return engineExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitExp createExitExp() {
		ExitExpImpl exitExp = new ExitExpImpl();
		return exitExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExpression createIfExpression() {
		IfExpressionImpl ifExpression = new IfExpressionImpl();
		return ifExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionAction createConditionAction() {
		ConditionActionImpl conditionAction = new ConditionActionImpl();
		return conditionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElifConditionAction createElifConditionAction() {
		ElifConditionActionImpl elifConditionAction = new ElifConditionActionImpl();
		return elifConditionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Advice createAdviceFromString(EDataType eDataType, String initialValue) {
		Advice result = Advice.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdviceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JessPackage getJessPackage() {
		return (JessPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JessPackage getPackage() {
		return JessPackage.eINSTANCE;
	}

} //JessFactoryImpl
