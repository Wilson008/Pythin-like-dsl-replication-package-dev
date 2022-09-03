/**
 */
package jess.util;

import jess.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jess.JessPackage
 * @generated
 */
public class JessAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JessPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JessAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JessPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JessSwitch<Adapter> modelSwitch =
		new JessSwitch<Adapter>() {
			@Override
			public Adapter caseLocatedElement(LocatedElement object) {
				return createLocatedElementAdapter();
			}
			@Override
			public Adapter caseRoot(Root object) {
				return createRootAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseInteg(Integ object) {
				return createIntegAdapter();
			}
			@Override
			public Adapter caseFloa(Floa object) {
				return createFloaAdapter();
			}
			@Override
			public Adapter caseStr(Str object) {
				return createStrAdapter();
			}
			@Override
			public Adapter caseIdent(Ident object) {
				return createIdentAdapter();
			}
			@Override
			public Adapter caseValidIdentifier(ValidIdentifier object) {
				return createValidIdentifierAdapter();
			}
			@Override
			public Adapter caseSlotName(SlotName object) {
				return createSlotNameAdapter();
			}
			@Override
			public Adapter caseJessVariable(JessVariable object) {
				return createJessVariableAdapter();
			}
			@Override
			public Adapter caseTemplateExpression(TemplateExpression object) {
				return createTemplateExpressionAdapter();
			}
			@Override
			public Adapter caseSlotOp(SlotOp object) {
				return createSlotOpAdapter();
			}
			@Override
			public Adapter caseDefinitionExp(DefinitionExp object) {
				return createDefinitionExpAdapter();
			}
			@Override
			public Adapter caseGlobalDefinition(GlobalDefinition object) {
				return createGlobalDefinitionAdapter();
			}
			@Override
			public Adapter caseVarDefinition(VarDefinition object) {
				return createVarDefinitionAdapter();
			}
			@Override
			public Adapter caseFunctionDefinition(FunctionDefinition object) {
				return createFunctionDefinitionAdapter();
			}
			@Override
			public Adapter caseAdviceDefinition(AdviceDefinition object) {
				return createAdviceDefinitionAdapter();
			}
			@Override
			public Adapter caseUnDefAdvice(UnDefAdvice object) {
				return createUnDefAdviceAdapter();
			}
			@Override
			public Adapter caseFactDefinition(FactDefinition object) {
				return createFactDefinitionAdapter();
			}
			@Override
			public Adapter caseRuleDefinition(RuleDefinition object) {
				return createRuleDefinitionAdapter();
			}
			@Override
			public Adapter caseDeclareRule(DeclareRule object) {
				return createDeclareRuleAdapter();
			}
			@Override
			public Adapter caseModuleDefinition(ModuleDefinition object) {
				return createModuleDefinitionAdapter();
			}
			@Override
			public Adapter caseQueryDefinition(QueryDefinition object) {
				return createQueryDefinitionAdapter();
			}
			@Override
			public Adapter caseDeclareVar(DeclareVar object) {
				return createDeclareVarAdapter();
			}
			@Override
			public Adapter caseTemplateDefinition(TemplateDefinition object) {
				return createTemplateDefinitionAdapter();
			}
			@Override
			public Adapter caseDeclareBloc(DeclareBloc object) {
				return createDeclareBlocAdapter();
			}
			@Override
			public Adapter caseASlotDef(ASlotDef object) {
				return createASlotDefAdapter();
			}
			@Override
			public Adapter caseSlotDef(SlotDef object) {
				return createSlotDefAdapter();
			}
			@Override
			public Adapter caseMultiSlotDef(MultiSlotDef object) {
				return createMultiSlotDefAdapter();
			}
			@Override
			public Adapter caseSlotOptions(SlotOptions object) {
				return createSlotOptionsAdapter();
			}
			@Override
			public Adapter caseUseFuncExp(UseFuncExp object) {
				return createUseFuncExpAdapter();
			}
			@Override
			public Adapter caseWhileExp(WhileExp object) {
				return createWhileExpAdapter();
			}
			@Override
			public Adapter caseForExp(ForExp object) {
				return createForExpAdapter();
			}
			@Override
			public Adapter caseForeachExp(ForeachExp object) {
				return createForeachExpAdapter();
			}
			@Override
			public Adapter caseFuncCall(FuncCall object) {
				return createFuncCallAdapter();
			}
			@Override
			public Adapter caseEngineExp(EngineExp object) {
				return createEngineExpAdapter();
			}
			@Override
			public Adapter caseExitExp(ExitExp object) {
				return createExitExpAdapter();
			}
			@Override
			public Adapter caseIfExpression(IfExpression object) {
				return createIfExpressionAdapter();
			}
			@Override
			public Adapter caseConditionAction(ConditionAction object) {
				return createConditionActionAdapter();
			}
			@Override
			public Adapter caseElifConditionAction(ElifConditionAction object) {
				return createElifConditionActionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link jess.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.LocatedElement
	 * @generated
	 */
	public Adapter createLocatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.Integ <em>Integ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.Integ
	 * @generated
	 */
	public Adapter createIntegAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.Floa <em>Floa</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.Floa
	 * @generated
	 */
	public Adapter createFloaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.Str <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.Str
	 * @generated
	 */
	public Adapter createStrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.Ident <em>Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.Ident
	 * @generated
	 */
	public Adapter createIdentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.ValidIdentifier <em>Valid Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.ValidIdentifier
	 * @generated
	 */
	public Adapter createValidIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.SlotName <em>Slot Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.SlotName
	 * @generated
	 */
	public Adapter createSlotNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.JessVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.JessVariable
	 * @generated
	 */
	public Adapter createJessVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.TemplateExpression <em>Template Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.TemplateExpression
	 * @generated
	 */
	public Adapter createTemplateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.SlotOp <em>Slot Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.SlotOp
	 * @generated
	 */
	public Adapter createSlotOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.DefinitionExp <em>Definition Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.DefinitionExp
	 * @generated
	 */
	public Adapter createDefinitionExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.GlobalDefinition <em>Global Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.GlobalDefinition
	 * @generated
	 */
	public Adapter createGlobalDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.VarDefinition <em>Var Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.VarDefinition
	 * @generated
	 */
	public Adapter createVarDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.FunctionDefinition <em>Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.FunctionDefinition
	 * @generated
	 */
	public Adapter createFunctionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.AdviceDefinition <em>Advice Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.AdviceDefinition
	 * @generated
	 */
	public Adapter createAdviceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.UnDefAdvice <em>Un Def Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.UnDefAdvice
	 * @generated
	 */
	public Adapter createUnDefAdviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.FactDefinition <em>Fact Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.FactDefinition
	 * @generated
	 */
	public Adapter createFactDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.RuleDefinition <em>Rule Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.RuleDefinition
	 * @generated
	 */
	public Adapter createRuleDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.DeclareRule <em>Declare Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.DeclareRule
	 * @generated
	 */
	public Adapter createDeclareRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.ModuleDefinition <em>Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.ModuleDefinition
	 * @generated
	 */
	public Adapter createModuleDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.QueryDefinition <em>Query Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.QueryDefinition
	 * @generated
	 */
	public Adapter createQueryDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.DeclareVar <em>Declare Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.DeclareVar
	 * @generated
	 */
	public Adapter createDeclareVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.TemplateDefinition <em>Template Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.TemplateDefinition
	 * @generated
	 */
	public Adapter createTemplateDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.DeclareBloc <em>Declare Bloc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.DeclareBloc
	 * @generated
	 */
	public Adapter createDeclareBlocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.ASlotDef <em>ASlot Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.ASlotDef
	 * @generated
	 */
	public Adapter createASlotDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.SlotDef <em>Slot Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.SlotDef
	 * @generated
	 */
	public Adapter createSlotDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.MultiSlotDef <em>Multi Slot Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.MultiSlotDef
	 * @generated
	 */
	public Adapter createMultiSlotDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.SlotOptions <em>Slot Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.SlotOptions
	 * @generated
	 */
	public Adapter createSlotOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.UseFuncExp <em>Use Func Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.UseFuncExp
	 * @generated
	 */
	public Adapter createUseFuncExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.WhileExp <em>While Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.WhileExp
	 * @generated
	 */
	public Adapter createWhileExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.ForExp <em>For Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.ForExp
	 * @generated
	 */
	public Adapter createForExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.ForeachExp <em>Foreach Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.ForeachExp
	 * @generated
	 */
	public Adapter createForeachExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.FuncCall <em>Func Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.FuncCall
	 * @generated
	 */
	public Adapter createFuncCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.EngineExp <em>Engine Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.EngineExp
	 * @generated
	 */
	public Adapter createEngineExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.ExitExp <em>Exit Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.ExitExp
	 * @generated
	 */
	public Adapter createExitExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.IfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.IfExpression
	 * @generated
	 */
	public Adapter createIfExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.ConditionAction <em>Condition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.ConditionAction
	 * @generated
	 */
	public Adapter createConditionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jess.ElifConditionAction <em>Elif Condition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jess.ElifConditionAction
	 * @generated
	 */
	public Adapter createElifConditionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JessAdapterFactory
