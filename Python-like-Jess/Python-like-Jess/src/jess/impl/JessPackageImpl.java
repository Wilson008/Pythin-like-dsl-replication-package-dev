/**
 */
package jess.impl;

import jess.ASlotDef;
import jess.Advice;
import jess.AdviceDefinition;
import jess.ConditionAction;
import jess.DeclareBloc;
import jess.DeclareRule;
import jess.DeclareVar;
import jess.DefinitionExp;
import jess.ElifConditionAction;
import jess.EngineExp;
import jess.ExitExp;
import jess.Expression;
import jess.FactDefinition;
import jess.Floa;
import jess.ForExp;
import jess.ForeachExp;
import jess.FuncCall;
import jess.FunctionDefinition;
import jess.GlobalDefinition;
import jess.Ident;
import jess.IfExpression;
import jess.Integ;
import jess.JessFactory;
import jess.JessPackage;
import jess.JessVariable;
import jess.LocatedElement;
import jess.ModuleDefinition;
import jess.MultiSlotDef;
import jess.QueryDefinition;
import jess.Root;
import jess.RuleDefinition;
import jess.SlotDef;
import jess.SlotName;
import jess.SlotOp;
import jess.SlotOptions;
import jess.Str;
import jess.TemplateDefinition;
import jess.TemplateExpression;
import jess.UnDefAdvice;
import jess.UseFuncExp;
import jess.ValidIdentifier;
import jess.VarDefinition;
import jess.WhileExp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import primitivetypes.PrimitivetypesPackage;

import primitivetypes.impl.PrimitivetypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JessPackageImpl extends EPackageImpl implements JessPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locatedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jessVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adviceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unDefAdviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declareRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declareVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declareBlocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aSlotDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiSlotDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useFuncExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreachExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elifConditionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adviceEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see jess.JessPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JessPackageImpl() {
		super(eNS_URI, JessFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link JessPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JessPackage init() {
		if (isInited) return (JessPackage)EPackage.Registry.INSTANCE.getEPackage(JessPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJessPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JessPackageImpl theJessPackage = registeredJessPackage instanceof JessPackageImpl ? (JessPackageImpl)registeredJessPackage : new JessPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI);
		PrimitivetypesPackageImpl thePrimitivetypesPackage = (PrimitivetypesPackageImpl)(registeredPackage instanceof PrimitivetypesPackageImpl ? registeredPackage : PrimitivetypesPackage.eINSTANCE);

		// Create package meta-data objects
		theJessPackage.createPackageContents();
		thePrimitivetypesPackage.createPackageContents();

		// Initialize created meta-data
		theJessPackage.initializePackageContents();
		thePrimitivetypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJessPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JessPackage.eNS_URI, theJessPackage);
		return theJessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocatedElement() {
		return locatedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocatedElement_Location() {
		return (EAttribute)locatedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocatedElement_CommentsBefore() {
		return (EAttribute)locatedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocatedElement_CommentsAfter() {
		return (EAttribute)locatedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Expressions() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteg() {
		return integEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteg_Val() {
		return (EAttribute)integEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloa() {
		return floaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloa_Val() {
		return (EAttribute)floaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStr() {
		return strEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStr_Val() {
		return (EAttribute)strEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdent() {
		return identEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidIdentifier() {
		return validIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidIdentifier_Val() {
		return (EAttribute)validIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlotName() {
		return slotNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlotName_Val() {
		return (EAttribute)slotNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJessVariable() {
		return jessVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJessVariable_Val() {
		return (EAttribute)jessVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpression() {
		return templateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpression_TemplateName() {
		return (EReference)templateExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpression_FirstSlot() {
		return (EReference)templateExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpression_SlotOp() {
		return (EReference)templateExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlotOp() {
		return slotOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlotOp_SlotIdent() {
		return (EReference)slotOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlotOp_Operator() {
		return (EReference)slotOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlotOp_Exp() {
		return (EReference)slotOpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionExp() {
		return definitionExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalDefinition() {
		return globalDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalDefinition_VarDef() {
		return (EReference)globalDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarDefinition() {
		return varDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarDefinition_JessVar() {
		return (EReference)varDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarDefinition_Eq() {
		return (EReference)varDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarDefinition_Expression() {
		return (EReference)varDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDefinition() {
		return functionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_FuncName() {
		return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_Parameters() {
		return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_Expressions() {
		return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdviceDefinition() {
		return adviceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdviceDefinition_Direction() {
		return (EAttribute)adviceDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdviceDefinition_Op() {
		return (EReference)adviceDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdviceDefinition_Advice() {
		return (EReference)adviceDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnDefAdvice() {
		return unDefAdviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnDefAdvice_Op() {
		return (EReference)unDefAdviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactDefinition() {
		return factDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactDefinition_FactName() {
		return (EReference)factDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactDefinition_Documentation() {
		return (EReference)factDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactDefinition_Fact() {
		return (EReference)factDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleDefinition() {
		return ruleDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleDefinition_RuleName() {
		return (EReference)ruleDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleDefinition_Documentation() {
		return (EReference)ruleDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleDefinition_Declare() {
		return (EReference)ruleDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleDefinition_Conditions() {
		return (EReference)ruleDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleDefinition_FunctionCall() {
		return (EReference)ruleDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclareRule() {
		return declareRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclareRule_Salience() {
		return (EReference)declareRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclareRule_NodeIndexHash() {
		return (EReference)declareRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclareRule_AutoFocus() {
		return (EReference)declareRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclareRule_NoLoop() {
		return (EReference)declareRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleDefinition() {
		return moduleDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDefinition_ModuleName() {
		return (EReference)moduleDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDefinition_Documentation() {
		return (EReference)moduleDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryDefinition() {
		return queryDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryDefinition_QueryName() {
		return (EReference)queryDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryDefinition_Documentation() {
		return (EReference)queryDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryDefinition_Declare() {
		return (EReference)queryDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryDefinition_Expressions() {
		return (EReference)queryDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclareVar() {
		return declareVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclareVar_Var() {
		return (EReference)declareVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclareVar_Node() {
		return (EReference)declareVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclareVar_Max() {
		return (EReference)declareVarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateDefinition() {
		return templateDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateDefinition_TemplateName() {
		return (EReference)templateDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateDefinition_Inherits() {
		return (EReference)templateDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateDefinition_Documentation() {
		return (EReference)templateDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateDefinition_DeclareBloc() {
		return (EReference)templateDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateDefinition_SlotDef() {
		return (EReference)templateDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclareBloc() {
		return declareBlocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclareBloc_SlotSpecific() {
		return (EReference)declareBlocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclareBloc_BackchainReaction() {
		return (EReference)declareBlocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclareBloc_FromClass() {
		return (EReference)declareBlocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclareBloc_IncludeVariable() {
		return (EReference)declareBlocEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclareBloc_Order() {
		return (EReference)declareBlocEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASlotDef() {
		return aSlotDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASlotDef_SlotName() {
		return (EReference)aSlotDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASlotDef_Optionals() {
		return (EReference)aSlotDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlotDef() {
		return slotDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiSlotDef() {
		return multiSlotDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlotOptions() {
		return slotOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlotOptions_Type() {
		return (EReference)slotOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlotOptions_Def() {
		return (EReference)slotOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlotOptions_DefaultDyn() {
		return (EReference)slotOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlotOptions_AllowedValues() {
		return (EReference)slotOptionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseFuncExp() {
		return useFuncExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileExp() {
		return whileExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhileExp_HasDo() {
		return (EAttribute)whileExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileExp_BoolExp() {
		return (EReference)whileExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileExp_Actions() {
		return (EReference)whileExpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForExp() {
		return forExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForExp_Initializer() {
		return (EReference)forExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForExp_Condition() {
		return (EReference)forExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForExp_Increment() {
		return (EReference)forExpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForExp_Expressions() {
		return (EReference)forExpEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForeachExp() {
		return foreachExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeachExp_Var() {
		return (EReference)foreachExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeachExp_List() {
		return (EReference)foreachExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeachExp_Expressions() {
		return (EReference)foreachExpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncCall() {
		return funcCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuncCall_FuncName() {
		return (EReference)funcCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuncCall_FuncParam() {
		return (EReference)funcCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineExp() {
		return engineExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExitExp() {
		return exitExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfExpression() {
		return ifExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExpression_Ifthen() {
		return (EReference)ifExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExpression_Elifthen() {
		return (EReference)ifExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExpression_Else() {
		return (EReference)ifExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionAction() {
		return conditionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionAction_Condition() {
		return (EReference)conditionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionAction_Actions() {
		return (EReference)conditionActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElifConditionAction() {
		return elifConditionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElifConditionAction_CondAct() {
		return (EReference)elifConditionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdvice() {
		return adviceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JessFactory getJessFactory() {
		return (JessFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		locatedElementEClass = createEClass(LOCATED_ELEMENT);
		createEAttribute(locatedElementEClass, LOCATED_ELEMENT__LOCATION);
		createEAttribute(locatedElementEClass, LOCATED_ELEMENT__COMMENTS_BEFORE);
		createEAttribute(locatedElementEClass, LOCATED_ELEMENT__COMMENTS_AFTER);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__EXPRESSIONS);

		expressionEClass = createEClass(EXPRESSION);

		integEClass = createEClass(INTEG);
		createEAttribute(integEClass, INTEG__VAL);

		floaEClass = createEClass(FLOA);
		createEAttribute(floaEClass, FLOA__VAL);

		strEClass = createEClass(STR);
		createEAttribute(strEClass, STR__VAL);

		identEClass = createEClass(IDENT);

		validIdentifierEClass = createEClass(VALID_IDENTIFIER);
		createEAttribute(validIdentifierEClass, VALID_IDENTIFIER__VAL);

		slotNameEClass = createEClass(SLOT_NAME);
		createEAttribute(slotNameEClass, SLOT_NAME__VAL);

		jessVariableEClass = createEClass(JESS_VARIABLE);
		createEAttribute(jessVariableEClass, JESS_VARIABLE__VAL);

		templateExpressionEClass = createEClass(TEMPLATE_EXPRESSION);
		createEReference(templateExpressionEClass, TEMPLATE_EXPRESSION__TEMPLATE_NAME);
		createEReference(templateExpressionEClass, TEMPLATE_EXPRESSION__FIRST_SLOT);
		createEReference(templateExpressionEClass, TEMPLATE_EXPRESSION__SLOT_OP);

		slotOpEClass = createEClass(SLOT_OP);
		createEReference(slotOpEClass, SLOT_OP__SLOT_IDENT);
		createEReference(slotOpEClass, SLOT_OP__OPERATOR);
		createEReference(slotOpEClass, SLOT_OP__EXP);

		definitionExpEClass = createEClass(DEFINITION_EXP);

		globalDefinitionEClass = createEClass(GLOBAL_DEFINITION);
		createEReference(globalDefinitionEClass, GLOBAL_DEFINITION__VAR_DEF);

		varDefinitionEClass = createEClass(VAR_DEFINITION);
		createEReference(varDefinitionEClass, VAR_DEFINITION__JESS_VAR);
		createEReference(varDefinitionEClass, VAR_DEFINITION__EQ);
		createEReference(varDefinitionEClass, VAR_DEFINITION__EXPRESSION);

		functionDefinitionEClass = createEClass(FUNCTION_DEFINITION);
		createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__FUNC_NAME);
		createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__PARAMETERS);
		createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__EXPRESSIONS);

		adviceDefinitionEClass = createEClass(ADVICE_DEFINITION);
		createEAttribute(adviceDefinitionEClass, ADVICE_DEFINITION__DIRECTION);
		createEReference(adviceDefinitionEClass, ADVICE_DEFINITION__OP);
		createEReference(adviceDefinitionEClass, ADVICE_DEFINITION__ADVICE);

		unDefAdviceEClass = createEClass(UN_DEF_ADVICE);
		createEReference(unDefAdviceEClass, UN_DEF_ADVICE__OP);

		factDefinitionEClass = createEClass(FACT_DEFINITION);
		createEReference(factDefinitionEClass, FACT_DEFINITION__FACT_NAME);
		createEReference(factDefinitionEClass, FACT_DEFINITION__DOCUMENTATION);
		createEReference(factDefinitionEClass, FACT_DEFINITION__FACT);

		ruleDefinitionEClass = createEClass(RULE_DEFINITION);
		createEReference(ruleDefinitionEClass, RULE_DEFINITION__RULE_NAME);
		createEReference(ruleDefinitionEClass, RULE_DEFINITION__DOCUMENTATION);
		createEReference(ruleDefinitionEClass, RULE_DEFINITION__DECLARE);
		createEReference(ruleDefinitionEClass, RULE_DEFINITION__CONDITIONS);
		createEReference(ruleDefinitionEClass, RULE_DEFINITION__FUNCTION_CALL);

		declareRuleEClass = createEClass(DECLARE_RULE);
		createEReference(declareRuleEClass, DECLARE_RULE__SALIENCE);
		createEReference(declareRuleEClass, DECLARE_RULE__NODE_INDEX_HASH);
		createEReference(declareRuleEClass, DECLARE_RULE__AUTO_FOCUS);
		createEReference(declareRuleEClass, DECLARE_RULE__NO_LOOP);

		moduleDefinitionEClass = createEClass(MODULE_DEFINITION);
		createEReference(moduleDefinitionEClass, MODULE_DEFINITION__MODULE_NAME);
		createEReference(moduleDefinitionEClass, MODULE_DEFINITION__DOCUMENTATION);

		queryDefinitionEClass = createEClass(QUERY_DEFINITION);
		createEReference(queryDefinitionEClass, QUERY_DEFINITION__QUERY_NAME);
		createEReference(queryDefinitionEClass, QUERY_DEFINITION__DOCUMENTATION);
		createEReference(queryDefinitionEClass, QUERY_DEFINITION__DECLARE);
		createEReference(queryDefinitionEClass, QUERY_DEFINITION__EXPRESSIONS);

		declareVarEClass = createEClass(DECLARE_VAR);
		createEReference(declareVarEClass, DECLARE_VAR__VAR);
		createEReference(declareVarEClass, DECLARE_VAR__NODE);
		createEReference(declareVarEClass, DECLARE_VAR__MAX);

		templateDefinitionEClass = createEClass(TEMPLATE_DEFINITION);
		createEReference(templateDefinitionEClass, TEMPLATE_DEFINITION__TEMPLATE_NAME);
		createEReference(templateDefinitionEClass, TEMPLATE_DEFINITION__INHERITS);
		createEReference(templateDefinitionEClass, TEMPLATE_DEFINITION__DOCUMENTATION);
		createEReference(templateDefinitionEClass, TEMPLATE_DEFINITION__DECLARE_BLOC);
		createEReference(templateDefinitionEClass, TEMPLATE_DEFINITION__SLOT_DEF);

		declareBlocEClass = createEClass(DECLARE_BLOC);
		createEReference(declareBlocEClass, DECLARE_BLOC__SLOT_SPECIFIC);
		createEReference(declareBlocEClass, DECLARE_BLOC__BACKCHAIN_REACTION);
		createEReference(declareBlocEClass, DECLARE_BLOC__FROM_CLASS);
		createEReference(declareBlocEClass, DECLARE_BLOC__INCLUDE_VARIABLE);
		createEReference(declareBlocEClass, DECLARE_BLOC__ORDER);

		aSlotDefEClass = createEClass(ASLOT_DEF);
		createEReference(aSlotDefEClass, ASLOT_DEF__SLOT_NAME);
		createEReference(aSlotDefEClass, ASLOT_DEF__OPTIONALS);

		slotDefEClass = createEClass(SLOT_DEF);

		multiSlotDefEClass = createEClass(MULTI_SLOT_DEF);

		slotOptionsEClass = createEClass(SLOT_OPTIONS);
		createEReference(slotOptionsEClass, SLOT_OPTIONS__TYPE);
		createEReference(slotOptionsEClass, SLOT_OPTIONS__DEF);
		createEReference(slotOptionsEClass, SLOT_OPTIONS__DEFAULT_DYN);
		createEReference(slotOptionsEClass, SLOT_OPTIONS__ALLOWED_VALUES);

		useFuncExpEClass = createEClass(USE_FUNC_EXP);

		whileExpEClass = createEClass(WHILE_EXP);
		createEAttribute(whileExpEClass, WHILE_EXP__HAS_DO);
		createEReference(whileExpEClass, WHILE_EXP__BOOL_EXP);
		createEReference(whileExpEClass, WHILE_EXP__ACTIONS);

		forExpEClass = createEClass(FOR_EXP);
		createEReference(forExpEClass, FOR_EXP__INITIALIZER);
		createEReference(forExpEClass, FOR_EXP__CONDITION);
		createEReference(forExpEClass, FOR_EXP__INCREMENT);
		createEReference(forExpEClass, FOR_EXP__EXPRESSIONS);

		foreachExpEClass = createEClass(FOREACH_EXP);
		createEReference(foreachExpEClass, FOREACH_EXP__VAR);
		createEReference(foreachExpEClass, FOREACH_EXP__LIST);
		createEReference(foreachExpEClass, FOREACH_EXP__EXPRESSIONS);

		funcCallEClass = createEClass(FUNC_CALL);
		createEReference(funcCallEClass, FUNC_CALL__FUNC_NAME);
		createEReference(funcCallEClass, FUNC_CALL__FUNC_PARAM);

		engineExpEClass = createEClass(ENGINE_EXP);

		exitExpEClass = createEClass(EXIT_EXP);

		ifExpressionEClass = createEClass(IF_EXPRESSION);
		createEReference(ifExpressionEClass, IF_EXPRESSION__IFTHEN);
		createEReference(ifExpressionEClass, IF_EXPRESSION__ELIFTHEN);
		createEReference(ifExpressionEClass, IF_EXPRESSION__ELSE);

		conditionActionEClass = createEClass(CONDITION_ACTION);
		createEReference(conditionActionEClass, CONDITION_ACTION__CONDITION);
		createEReference(conditionActionEClass, CONDITION_ACTION__ACTIONS);

		elifConditionActionEClass = createEClass(ELIF_CONDITION_ACTION);
		createEReference(elifConditionActionEClass, ELIF_CONDITION_ACTION__COND_ACT);

		// Create enums
		adviceEEnum = createEEnum(ADVICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PrimitivetypesPackage thePrimitivetypesPackage = (PrimitivetypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rootEClass.getESuperTypes().add(this.getLocatedElement());
		expressionEClass.getESuperTypes().add(this.getLocatedElement());
		integEClass.getESuperTypes().add(this.getExpression());
		floaEClass.getESuperTypes().add(this.getExpression());
		strEClass.getESuperTypes().add(this.getExpression());
		identEClass.getESuperTypes().add(this.getExpression());
		validIdentifierEClass.getESuperTypes().add(this.getIdent());
		slotNameEClass.getESuperTypes().add(this.getIdent());
		jessVariableEClass.getESuperTypes().add(this.getIdent());
		templateExpressionEClass.getESuperTypes().add(this.getExpression());
		slotOpEClass.getESuperTypes().add(this.getLocatedElement());
		definitionExpEClass.getESuperTypes().add(this.getExpression());
		globalDefinitionEClass.getESuperTypes().add(this.getDefinitionExp());
		varDefinitionEClass.getESuperTypes().add(this.getLocatedElement());
		functionDefinitionEClass.getESuperTypes().add(this.getDefinitionExp());
		adviceDefinitionEClass.getESuperTypes().add(this.getDefinitionExp());
		unDefAdviceEClass.getESuperTypes().add(this.getDefinitionExp());
		factDefinitionEClass.getESuperTypes().add(this.getDefinitionExp());
		ruleDefinitionEClass.getESuperTypes().add(this.getDefinitionExp());
		declareRuleEClass.getESuperTypes().add(this.getLocatedElement());
		moduleDefinitionEClass.getESuperTypes().add(this.getDefinitionExp());
		queryDefinitionEClass.getESuperTypes().add(this.getDefinitionExp());
		declareVarEClass.getESuperTypes().add(this.getLocatedElement());
		templateDefinitionEClass.getESuperTypes().add(this.getDefinitionExp());
		declareBlocEClass.getESuperTypes().add(this.getLocatedElement());
		aSlotDefEClass.getESuperTypes().add(this.getLocatedElement());
		slotDefEClass.getESuperTypes().add(this.getASlotDef());
		multiSlotDefEClass.getESuperTypes().add(this.getASlotDef());
		slotOptionsEClass.getESuperTypes().add(this.getLocatedElement());
		useFuncExpEClass.getESuperTypes().add(this.getExpression());
		whileExpEClass.getESuperTypes().add(this.getUseFuncExp());
		forExpEClass.getESuperTypes().add(this.getUseFuncExp());
		foreachExpEClass.getESuperTypes().add(this.getUseFuncExp());
		funcCallEClass.getESuperTypes().add(this.getUseFuncExp());
		engineExpEClass.getESuperTypes().add(this.getUseFuncExp());
		exitExpEClass.getESuperTypes().add(this.getUseFuncExp());
		ifExpressionEClass.getESuperTypes().add(this.getUseFuncExp());
		conditionActionEClass.getESuperTypes().add(this.getLocatedElement());
		elifConditionActionEClass.getESuperTypes().add(this.getLocatedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(locatedElementEClass, LocatedElement.class, "LocatedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocatedElement_Location(), thePrimitivetypesPackage.getString(), "location", null, 0, 1, LocatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocatedElement_CommentsBefore(), thePrimitivetypesPackage.getString(), "commentsBefore", null, 0, -1, LocatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocatedElement_CommentsAfter(), thePrimitivetypesPackage.getString(), "commentsAfter", null, 0, -1, LocatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integEClass, Integ.class, "Integ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteg_Val(), thePrimitivetypesPackage.getInteger(), "val", null, 1, 1, Integ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(floaEClass, Floa.class, "Floa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloa_Val(), thePrimitivetypesPackage.getDouble(), "val", null, 1, 1, Floa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(strEClass, Str.class, "Str", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStr_Val(), thePrimitivetypesPackage.getString(), "val", null, 1, 1, Str.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(identEClass, Ident.class, "Ident", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(validIdentifierEClass, ValidIdentifier.class, "ValidIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidIdentifier_Val(), thePrimitivetypesPackage.getString(), "val", null, 1, 1, ValidIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(slotNameEClass, SlotName.class, "SlotName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlotName_Val(), thePrimitivetypesPackage.getString(), "val", null, 1, 1, SlotName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(jessVariableEClass, JessVariable.class, "JessVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJessVariable_Val(), thePrimitivetypesPackage.getString(), "val", null, 1, 1, JessVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(templateExpressionEClass, TemplateExpression.class, "TemplateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpression_TemplateName(), this.getValidIdentifier(), null, "templateName", null, 1, 1, TemplateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateExpression_FirstSlot(), this.getSlotOp(), null, "firstSlot", null, 1, 1, TemplateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateExpression_SlotOp(), this.getSlotOp(), null, "slotOp", null, 0, -1, TemplateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slotOpEClass, SlotOp.class, "SlotOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlotOp_SlotIdent(), this.getSlotName(), null, "slotIdent", null, 1, 1, SlotOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSlotOp_Operator(), this.getValidIdentifier(), null, "operator", null, 1, 1, SlotOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSlotOp_Exp(), this.getExpression(), null, "exp", null, 1, 1, SlotOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(definitionExpEClass, DefinitionExp.class, "DefinitionExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(globalDefinitionEClass, GlobalDefinition.class, "GlobalDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalDefinition_VarDef(), this.getVarDefinition(), null, "varDef", null, 0, -1, GlobalDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varDefinitionEClass, VarDefinition.class, "VarDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVarDefinition_JessVar(), this.getJessVariable(), null, "jessVar", null, 1, 1, VarDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVarDefinition_Eq(), this.getValidIdentifier(), null, "eq", null, 1, 1, VarDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVarDefinition_Expression(), this.getExpression(), null, "expression", null, 1, 1, VarDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(functionDefinitionEClass, FunctionDefinition.class, "FunctionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionDefinition_FuncName(), this.getValidIdentifier(), null, "funcName", null, 1, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFunctionDefinition_Parameters(), this.getJessVariable(), null, "parameters", null, 0, -1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionDefinition_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adviceDefinitionEClass, AdviceDefinition.class, "AdviceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdviceDefinition_Direction(), this.getAdvice(), "direction", null, 1, 1, AdviceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdviceDefinition_Op(), this.getIdent(), null, "op", null, 1, 1, AdviceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdviceDefinition_Advice(), this.getExpression(), null, "advice", null, 0, -1, AdviceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unDefAdviceEClass, UnDefAdvice.class, "UnDefAdvice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnDefAdvice_Op(), this.getExpression(), null, "op", null, 1, 1, UnDefAdvice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(factDefinitionEClass, FactDefinition.class, "FactDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactDefinition_FactName(), this.getValidIdentifier(), null, "factName", null, 1, 1, FactDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFactDefinition_Documentation(), this.getStr(), null, "documentation", null, 0, 1, FactDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFactDefinition_Fact(), this.getExpression(), null, "fact", null, 0, -1, FactDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleDefinitionEClass, RuleDefinition.class, "RuleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleDefinition_RuleName(), this.getValidIdentifier(), null, "ruleName", null, 1, 1, RuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRuleDefinition_Documentation(), this.getStr(), null, "documentation", null, 0, 1, RuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRuleDefinition_Declare(), this.getDeclareRule(), null, "declare", null, 0, 1, RuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRuleDefinition_Conditions(), this.getExpression(), null, "conditions", null, 0, -1, RuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleDefinition_FunctionCall(), this.getUseFuncExp(), null, "functionCall", null, 0, -1, RuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declareRuleEClass, DeclareRule.class, "DeclareRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclareRule_Salience(), this.getExpression(), null, "salience", null, 0, 1, DeclareRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeclareRule_NodeIndexHash(), this.getExpression(), null, "nodeIndexHash", null, 0, 1, DeclareRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeclareRule_AutoFocus(), this.getValidIdentifier(), null, "autoFocus", null, 0, 1, DeclareRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeclareRule_NoLoop(), this.getValidIdentifier(), null, "noLoop", null, 0, 1, DeclareRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(moduleDefinitionEClass, ModuleDefinition.class, "ModuleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleDefinition_ModuleName(), this.getValidIdentifier(), null, "moduleName", null, 1, 1, ModuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModuleDefinition_Documentation(), this.getStr(), null, "documentation", null, 0, 1, ModuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(queryDefinitionEClass, QueryDefinition.class, "QueryDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryDefinition_QueryName(), this.getValidIdentifier(), null, "queryName", null, 1, 1, QueryDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQueryDefinition_Documentation(), this.getStr(), null, "documentation", null, 0, 1, QueryDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQueryDefinition_Declare(), this.getDeclareVar(), null, "declare", null, 0, 1, QueryDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQueryDefinition_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, QueryDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declareVarEClass, DeclareVar.class, "DeclareVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclareVar_Var(), this.getJessVariable(), null, "var", null, 0, -1, DeclareVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclareVar_Node(), this.getExpression(), null, "node", null, 1, 1, DeclareVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeclareVar_Max(), this.getExpression(), null, "max", null, 1, 1, DeclareVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(templateDefinitionEClass, TemplateDefinition.class, "TemplateDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateDefinition_TemplateName(), this.getValidIdentifier(), null, "templateName", null, 1, 1, TemplateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateDefinition_Inherits(), this.getValidIdentifier(), null, "inherits", null, 0, -1, TemplateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateDefinition_Documentation(), this.getStr(), null, "documentation", null, 0, 1, TemplateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateDefinition_DeclareBloc(), this.getDeclareBloc(), null, "declareBloc", null, 0, 1, TemplateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateDefinition_SlotDef(), this.getASlotDef(), null, "slotDef", null, 0, -1, TemplateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(declareBlocEClass, DeclareBloc.class, "DeclareBloc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclareBloc_SlotSpecific(), this.getValidIdentifier(), null, "slotSpecific", null, 0, 1, DeclareBloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeclareBloc_BackchainReaction(), this.getValidIdentifier(), null, "backchainReaction", null, 0, 1, DeclareBloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeclareBloc_FromClass(), this.getValidIdentifier(), null, "fromClass", null, 0, 1, DeclareBloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeclareBloc_IncludeVariable(), this.getValidIdentifier(), null, "includeVariable", null, 0, 1, DeclareBloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeclareBloc_Order(), this.getValidIdentifier(), null, "order", null, 0, 1, DeclareBloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aSlotDefEClass, ASlotDef.class, "ASlotDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getASlotDef_SlotName(), this.getSlotName(), null, "slotName", null, 1, 1, ASlotDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getASlotDef_Optionals(), this.getSlotOptions(), null, "optionals", null, 0, -1, ASlotDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slotDefEClass, SlotDef.class, "SlotDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiSlotDefEClass, MultiSlotDef.class, "MultiSlotDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(slotOptionsEClass, SlotOptions.class, "SlotOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlotOptions_Type(), this.getValidIdentifier(), null, "type", null, 1, 1, SlotOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSlotOptions_Def(), this.getExpression(), null, "def", null, 1, 1, SlotOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSlotOptions_DefaultDyn(), this.getExpression(), null, "defaultDyn", null, 1, 1, SlotOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSlotOptions_AllowedValues(), this.getExpression(), null, "allowedValues", null, 0, -1, SlotOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useFuncExpEClass, UseFuncExp.class, "UseFuncExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whileExpEClass, WhileExp.class, "WhileExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhileExp_HasDo(), thePrimitivetypesPackage.getBoolean(), "hasDo", null, 1, 1, WhileExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWhileExp_BoolExp(), this.getExpression(), null, "boolExp", null, 1, 1, WhileExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWhileExp_Actions(), this.getExpression(), null, "actions", null, 0, -1, WhileExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forExpEClass, ForExp.class, "ForExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForExp_Initializer(), this.getExpression(), null, "initializer", null, 1, 1, ForExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getForExp_Condition(), this.getExpression(), null, "condition", null, 1, 1, ForExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getForExp_Increment(), this.getExpression(), null, "increment", null, 1, 1, ForExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getForExp_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, ForExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foreachExpEClass, ForeachExp.class, "ForeachExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForeachExp_Var(), this.getJessVariable(), null, "var", null, 1, 1, ForeachExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getForeachExp_List(), this.getExpression(), null, "list", null, 1, 1, ForeachExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getForeachExp_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, ForeachExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funcCallEClass, FuncCall.class, "FuncCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFuncCall_FuncName(), this.getValidIdentifier(), null, "funcName", null, 1, 1, FuncCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFuncCall_FuncParam(), this.getExpression(), null, "funcParam", null, 0, -1, FuncCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(engineExpEClass, EngineExp.class, "EngineExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exitExpEClass, ExitExp.class, "ExitExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifExpressionEClass, IfExpression.class, "IfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfExpression_Ifthen(), this.getConditionAction(), null, "ifthen", null, 1, 1, IfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIfExpression_Elifthen(), this.getElifConditionAction(), null, "elifthen", null, 0, -1, IfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfExpression_Else(), this.getExpression(), null, "else", null, 0, -1, IfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conditionActionEClass, ConditionAction.class, "ConditionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionAction_Condition(), this.getExpression(), null, "condition", null, 1, 1, ConditionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConditionAction_Actions(), this.getExpression(), null, "actions", null, 0, -1, ConditionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elifConditionActionEClass, ElifConditionAction.class, "ElifConditionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElifConditionAction_CondAct(), this.getConditionAction(), null, "condAct", null, 1, 1, ElifConditionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(adviceEEnum, Advice.class, "Advice");
		addEEnumLiteral(adviceEEnum, Advice.BEFORE);
		addEEnumLiteral(adviceEEnum, Advice.AFTER);

		// Create resource
		createResource(eNS_URI);
	}

} //JessPackageImpl
