/**
 */
package jess;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jess.JessPackage
 * @generated
 */
public interface JessFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JessFactory eINSTANCE = jess.impl.JessFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>Integ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integ</em>'.
	 * @generated
	 */
	Integ createInteg();

	/**
	 * Returns a new object of class '<em>Floa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floa</em>'.
	 * @generated
	 */
	Floa createFloa();

	/**
	 * Returns a new object of class '<em>Str</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Str</em>'.
	 * @generated
	 */
	Str createStr();

	/**
	 * Returns a new object of class '<em>Valid Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valid Identifier</em>'.
	 * @generated
	 */
	ValidIdentifier createValidIdentifier();

	/**
	 * Returns a new object of class '<em>Slot Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slot Name</em>'.
	 * @generated
	 */
	SlotName createSlotName();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	JessVariable createJessVariable();

	/**
	 * Returns a new object of class '<em>Template Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression</em>'.
	 * @generated
	 */
	TemplateExpression createTemplateExpression();

	/**
	 * Returns a new object of class '<em>Slot Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slot Op</em>'.
	 * @generated
	 */
	SlotOp createSlotOp();

	/**
	 * Returns a new object of class '<em>Global Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Definition</em>'.
	 * @generated
	 */
	GlobalDefinition createGlobalDefinition();

	/**
	 * Returns a new object of class '<em>Var Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Definition</em>'.
	 * @generated
	 */
	VarDefinition createVarDefinition();

	/**
	 * Returns a new object of class '<em>Function Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Definition</em>'.
	 * @generated
	 */
	FunctionDefinition createFunctionDefinition();

	/**
	 * Returns a new object of class '<em>Advice Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advice Definition</em>'.
	 * @generated
	 */
	AdviceDefinition createAdviceDefinition();

	/**
	 * Returns a new object of class '<em>Un Def Advice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Un Def Advice</em>'.
	 * @generated
	 */
	UnDefAdvice createUnDefAdvice();

	/**
	 * Returns a new object of class '<em>Fact Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fact Definition</em>'.
	 * @generated
	 */
	FactDefinition createFactDefinition();

	/**
	 * Returns a new object of class '<em>Rule Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Definition</em>'.
	 * @generated
	 */
	RuleDefinition createRuleDefinition();

	/**
	 * Returns a new object of class '<em>Declare Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declare Rule</em>'.
	 * @generated
	 */
	DeclareRule createDeclareRule();

	/**
	 * Returns a new object of class '<em>Module Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Definition</em>'.
	 * @generated
	 */
	ModuleDefinition createModuleDefinition();

	/**
	 * Returns a new object of class '<em>Query Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Definition</em>'.
	 * @generated
	 */
	QueryDefinition createQueryDefinition();

	/**
	 * Returns a new object of class '<em>Declare Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declare Var</em>'.
	 * @generated
	 */
	DeclareVar createDeclareVar();

	/**
	 * Returns a new object of class '<em>Template Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Definition</em>'.
	 * @generated
	 */
	TemplateDefinition createTemplateDefinition();

	/**
	 * Returns a new object of class '<em>Declare Bloc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declare Bloc</em>'.
	 * @generated
	 */
	DeclareBloc createDeclareBloc();

	/**
	 * Returns a new object of class '<em>ASlot Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ASlot Def</em>'.
	 * @generated
	 */
	ASlotDef createASlotDef();

	/**
	 * Returns a new object of class '<em>Slot Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slot Def</em>'.
	 * @generated
	 */
	SlotDef createSlotDef();

	/**
	 * Returns a new object of class '<em>Multi Slot Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Slot Def</em>'.
	 * @generated
	 */
	MultiSlotDef createMultiSlotDef();

	/**
	 * Returns a new object of class '<em>Slot Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slot Options</em>'.
	 * @generated
	 */
	SlotOptions createSlotOptions();

	/**
	 * Returns a new object of class '<em>While Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Exp</em>'.
	 * @generated
	 */
	WhileExp createWhileExp();

	/**
	 * Returns a new object of class '<em>For Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Exp</em>'.
	 * @generated
	 */
	ForExp createForExp();

	/**
	 * Returns a new object of class '<em>Foreach Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foreach Exp</em>'.
	 * @generated
	 */
	ForeachExp createForeachExp();

	/**
	 * Returns a new object of class '<em>Func Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Func Call</em>'.
	 * @generated
	 */
	FuncCall createFuncCall();

	/**
	 * Returns a new object of class '<em>Engine Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Engine Exp</em>'.
	 * @generated
	 */
	EngineExp createEngineExp();

	/**
	 * Returns a new object of class '<em>Exit Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Exp</em>'.
	 * @generated
	 */
	ExitExp createExitExp();

	/**
	 * Returns a new object of class '<em>If Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Expression</em>'.
	 * @generated
	 */
	IfExpression createIfExpression();

	/**
	 * Returns a new object of class '<em>Condition Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Action</em>'.
	 * @generated
	 */
	ConditionAction createConditionAction();

	/**
	 * Returns a new object of class '<em>Elif Condition Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elif Condition Action</em>'.
	 * @generated
	 */
	ElifConditionAction createElifConditionAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JessPackage getJessPackage();

} //JessFactory
