/**
 */
package jess;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jess.JessFactory
 * @model kind="package"
 * @generated
 */
public interface JessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jess";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://python-like/jess";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jess";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JessPackage eINSTANCE = jess.impl.JessPackageImpl.init();

	/**
	 * The meta object id for the '{@link jess.impl.LocatedElementImpl <em>Located Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.LocatedElementImpl
	 * @see jess.impl.JessPackageImpl#getLocatedElement()
	 * @generated
	 */
	int LOCATED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__COMMENTS_BEFORE = 1;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__COMMENTS_AFTER = 2;

	/**
	 * The number of structural features of the '<em>Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jess.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.RootImpl
	 * @see jess.impl.JessPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__EXPRESSIONS = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.ExpressionImpl
	 * @see jess.impl.JessPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.IntegImpl <em>Integ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.IntegImpl
	 * @see jess.impl.JessPackageImpl#getInteg()
	 * @generated
	 */
	int INTEG = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEG__LOCATION = EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEG__COMMENTS_BEFORE = EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEG__COMMENTS_AFTER = EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEG__VAL = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEG_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEG_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.FloaImpl <em>Floa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.FloaImpl
	 * @see jess.impl.JessPackageImpl#getFloa()
	 * @generated
	 */
	int FLOA = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOA__LOCATION = EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOA__COMMENTS_BEFORE = EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOA__COMMENTS_AFTER = EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOA__VAL = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Floa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOA_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Floa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOA_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.StrImpl <em>Str</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.StrImpl
	 * @see jess.impl.JessPackageImpl#getStr()
	 * @generated
	 */
	int STR = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STR__LOCATION = EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STR__COMMENTS_BEFORE = EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STR__COMMENTS_AFTER = EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STR__VAL = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Str</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Str</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.IdentImpl <em>Ident</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.IdentImpl
	 * @see jess.impl.JessPackageImpl#getIdent()
	 * @generated
	 */
	int IDENT = 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENT__LOCATION = EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENT__COMMENTS_BEFORE = EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENT__COMMENTS_AFTER = EXPRESSION__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Ident</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ident</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.ValidIdentifierImpl <em>Valid Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.ValidIdentifierImpl
	 * @see jess.impl.JessPackageImpl#getValidIdentifier()
	 * @generated
	 */
	int VALID_IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_IDENTIFIER__LOCATION = IDENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_IDENTIFIER__COMMENTS_BEFORE = IDENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_IDENTIFIER__COMMENTS_AFTER = IDENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_IDENTIFIER__VAL = IDENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Valid Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_IDENTIFIER_FEATURE_COUNT = IDENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Valid Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_IDENTIFIER_OPERATION_COUNT = IDENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.SlotNameImpl <em>Slot Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.SlotNameImpl
	 * @see jess.impl.JessPackageImpl#getSlotName()
	 * @generated
	 */
	int SLOT_NAME = 8;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_NAME__LOCATION = IDENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_NAME__COMMENTS_BEFORE = IDENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_NAME__COMMENTS_AFTER = IDENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_NAME__VAL = IDENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Slot Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_NAME_FEATURE_COUNT = IDENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Slot Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_NAME_OPERATION_COUNT = IDENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.JessVariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.JessVariableImpl
	 * @see jess.impl.JessPackageImpl#getJessVariable()
	 * @generated
	 */
	int JESS_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JESS_VARIABLE__LOCATION = IDENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JESS_VARIABLE__COMMENTS_BEFORE = IDENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JESS_VARIABLE__COMMENTS_AFTER = IDENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JESS_VARIABLE__VAL = IDENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JESS_VARIABLE_FEATURE_COUNT = IDENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JESS_VARIABLE_OPERATION_COUNT = IDENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.TemplateExpressionImpl <em>Template Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.TemplateExpressionImpl
	 * @see jess.impl.JessPackageImpl#getTemplateExpression()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION__LOCATION = EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION__COMMENTS_BEFORE = EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION__COMMENTS_AFTER = EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Template Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION__TEMPLATE_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First Slot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION__FIRST_SLOT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Slot Op</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION__SLOT_OP = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Template Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Template Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.SlotOpImpl <em>Slot Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.SlotOpImpl
	 * @see jess.impl.JessPackageImpl#getSlotOp()
	 * @generated
	 */
	int SLOT_OP = 11;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OP__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OP__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OP__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Slot Ident</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OP__SLOT_IDENT = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OP__OPERATOR = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OP__EXP = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Slot Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OP_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Slot Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OP_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.DefinitionExpImpl <em>Definition Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.DefinitionExpImpl
	 * @see jess.impl.JessPackageImpl#getDefinitionExp()
	 * @generated
	 */
	int DEFINITION_EXP = 12;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_EXP__LOCATION = EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_EXP__COMMENTS_BEFORE = EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_EXP__COMMENTS_AFTER = EXPRESSION__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Definition Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Definition Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_EXP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.GlobalDefinitionImpl <em>Global Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.GlobalDefinitionImpl
	 * @see jess.impl.JessPackageImpl#getGlobalDefinition()
	 * @generated
	 */
	int GLOBAL_DEFINITION = 13;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_DEFINITION__LOCATION = DEFINITION_EXP__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_DEFINITION__COMMENTS_BEFORE = DEFINITION_EXP__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_DEFINITION__COMMENTS_AFTER = DEFINITION_EXP__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Var Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_DEFINITION__VAR_DEF = DEFINITION_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_DEFINITION_FEATURE_COUNT = DEFINITION_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Global Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_DEFINITION_OPERATION_COUNT = DEFINITION_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.VarDefinitionImpl <em>Var Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.VarDefinitionImpl
	 * @see jess.impl.JessPackageImpl#getVarDefinition()
	 * @generated
	 */
	int VAR_DEFINITION = 14;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEFINITION__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEFINITION__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEFINITION__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Jess Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEFINITION__JESS_VAR = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEFINITION__EQ = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEFINITION__EXPRESSION = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Var Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEFINITION_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Var Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEFINITION_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.FunctionDefinitionImpl
	 * @see jess.impl.JessPackageImpl#getFunctionDefinition()
	 * @generated
	 */
	int FUNCTION_DEFINITION = 15;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__LOCATION = DEFINITION_EXP__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__COMMENTS_BEFORE = DEFINITION_EXP__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__COMMENTS_AFTER = DEFINITION_EXP__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Func Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__FUNC_NAME = DEFINITION_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__PARAMETERS = DEFINITION_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__EXPRESSIONS = DEFINITION_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_FEATURE_COUNT = DEFINITION_EXP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_OPERATION_COUNT = DEFINITION_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.AdviceDefinitionImpl <em>Advice Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.AdviceDefinitionImpl
	 * @see jess.impl.JessPackageImpl#getAdviceDefinition()
	 * @generated
	 */
	int ADVICE_DEFINITION = 16;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_DEFINITION__LOCATION = DEFINITION_EXP__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_DEFINITION__COMMENTS_BEFORE = DEFINITION_EXP__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_DEFINITION__COMMENTS_AFTER = DEFINITION_EXP__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_DEFINITION__DIRECTION = DEFINITION_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_DEFINITION__OP = DEFINITION_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Advice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_DEFINITION__ADVICE = DEFINITION_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Advice Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_DEFINITION_FEATURE_COUNT = DEFINITION_EXP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Advice Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_DEFINITION_OPERATION_COUNT = DEFINITION_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.UnDefAdviceImpl <em>Un Def Advice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.UnDefAdviceImpl
	 * @see jess.impl.JessPackageImpl#getUnDefAdvice()
	 * @generated
	 */
	int UN_DEF_ADVICE = 17;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_DEF_ADVICE__LOCATION = DEFINITION_EXP__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_DEF_ADVICE__COMMENTS_BEFORE = DEFINITION_EXP__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_DEF_ADVICE__COMMENTS_AFTER = DEFINITION_EXP__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_DEF_ADVICE__OP = DEFINITION_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Un Def Advice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_DEF_ADVICE_FEATURE_COUNT = DEFINITION_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Un Def Advice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_DEF_ADVICE_OPERATION_COUNT = DEFINITION_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.FactDefinitionImpl <em>Fact Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.FactDefinitionImpl
	 * @see jess.impl.JessPackageImpl#getFactDefinition()
	 * @generated
	 */
	int FACT_DEFINITION = 18;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_DEFINITION__LOCATION = DEFINITION_EXP__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_DEFINITION__COMMENTS_BEFORE = DEFINITION_EXP__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_DEFINITION__COMMENTS_AFTER = DEFINITION_EXP__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Fact Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_DEFINITION__FACT_NAME = DEFINITION_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_DEFINITION__DOCUMENTATION = DEFINITION_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_DEFINITION__FACT = DEFINITION_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fact Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_DEFINITION_FEATURE_COUNT = DEFINITION_EXP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Fact Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_DEFINITION_OPERATION_COUNT = DEFINITION_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.RuleDefinitionImpl <em>Rule Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.RuleDefinitionImpl
	 * @see jess.impl.JessPackageImpl#getRuleDefinition()
	 * @generated
	 */
	int RULE_DEFINITION = 19;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEFINITION__LOCATION = DEFINITION_EXP__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEFINITION__COMMENTS_BEFORE = DEFINITION_EXP__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEFINITION__COMMENTS_AFTER = DEFINITION_EXP__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Rule Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEFINITION__RULE_NAME = DEFINITION_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEFINITION__DOCUMENTATION = DEFINITION_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEFINITION__DECLARE = DEFINITION_EXP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEFINITION__CONDITIONS = DEFINITION_EXP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Function Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEFINITION__FUNCTION_CALL = DEFINITION_EXP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rule Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEFINITION_FEATURE_COUNT = DEFINITION_EXP_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Rule Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEFINITION_OPERATION_COUNT = DEFINITION_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.DeclareRuleImpl <em>Declare Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.DeclareRuleImpl
	 * @see jess.impl.JessPackageImpl#getDeclareRule()
	 * @generated
	 */
	int DECLARE_RULE = 20;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RULE__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RULE__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RULE__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Salience</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RULE__SALIENCE = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Index Hash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RULE__NODE_INDEX_HASH = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Auto Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RULE__AUTO_FOCUS = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>No Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RULE__NO_LOOP = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Declare Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RULE_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Declare Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RULE_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.ModuleDefinitionImpl <em>Module Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.ModuleDefinitionImpl
	 * @see jess.impl.JessPackageImpl#getModuleDefinition()
	 * @generated
	 */
	int MODULE_DEFINITION = 21;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__LOCATION = DEFINITION_EXP__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__COMMENTS_BEFORE = DEFINITION_EXP__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__COMMENTS_AFTER = DEFINITION_EXP__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__MODULE_NAME = DEFINITION_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__DOCUMENTATION = DEFINITION_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Module Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION_FEATURE_COUNT = DEFINITION_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Module Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION_OPERATION_COUNT = DEFINITION_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.QueryDefinitionImpl <em>Query Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.QueryDefinitionImpl
	 * @see jess.impl.JessPackageImpl#getQueryDefinition()
	 * @generated
	 */
	int QUERY_DEFINITION = 22;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEFINITION__LOCATION = DEFINITION_EXP__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEFINITION__COMMENTS_BEFORE = DEFINITION_EXP__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEFINITION__COMMENTS_AFTER = DEFINITION_EXP__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Query Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEFINITION__QUERY_NAME = DEFINITION_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEFINITION__DOCUMENTATION = DEFINITION_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEFINITION__DECLARE = DEFINITION_EXP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEFINITION__EXPRESSIONS = DEFINITION_EXP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Query Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEFINITION_FEATURE_COUNT = DEFINITION_EXP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Query Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEFINITION_OPERATION_COUNT = DEFINITION_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.DeclareVarImpl <em>Declare Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.DeclareVarImpl
	 * @see jess.impl.JessPackageImpl#getDeclareVar()
	 * @generated
	 */
	int DECLARE_VAR = 23;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_VAR__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_VAR__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_VAR__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_VAR__VAR = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_VAR__NODE = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_VAR__MAX = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Declare Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_VAR_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Declare Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_VAR_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.TemplateDefinitionImpl <em>Template Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.TemplateDefinitionImpl
	 * @see jess.impl.JessPackageImpl#getTemplateDefinition()
	 * @generated
	 */
	int TEMPLATE_DEFINITION = 24;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEFINITION__LOCATION = DEFINITION_EXP__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEFINITION__COMMENTS_BEFORE = DEFINITION_EXP__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEFINITION__COMMENTS_AFTER = DEFINITION_EXP__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Template Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEFINITION__TEMPLATE_NAME = DEFINITION_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEFINITION__INHERITS = DEFINITION_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEFINITION__DOCUMENTATION = DEFINITION_EXP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Declare Bloc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEFINITION__DECLARE_BLOC = DEFINITION_EXP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Slot Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEFINITION__SLOT_DEF = DEFINITION_EXP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Template Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEFINITION_FEATURE_COUNT = DEFINITION_EXP_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Template Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEFINITION_OPERATION_COUNT = DEFINITION_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.DeclareBlocImpl <em>Declare Bloc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.DeclareBlocImpl
	 * @see jess.impl.JessPackageImpl#getDeclareBloc()
	 * @generated
	 */
	int DECLARE_BLOC = 25;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_BLOC__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_BLOC__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_BLOC__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Slot Specific</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_BLOC__SLOT_SPECIFIC = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Backchain Reaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_BLOC__BACKCHAIN_REACTION = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_BLOC__FROM_CLASS = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Include Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_BLOC__INCLUDE_VARIABLE = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_BLOC__ORDER = LOCATED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Declare Bloc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_BLOC_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Declare Bloc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_BLOC_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.ASlotDefImpl <em>ASlot Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.ASlotDefImpl
	 * @see jess.impl.JessPackageImpl#getASlotDef()
	 * @generated
	 */
	int ASLOT_DEF = 26;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASLOT_DEF__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASLOT_DEF__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASLOT_DEF__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Slot Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASLOT_DEF__SLOT_NAME = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optionals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASLOT_DEF__OPTIONALS = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ASlot Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASLOT_DEF_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ASlot Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASLOT_DEF_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.SlotDefImpl <em>Slot Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.SlotDefImpl
	 * @see jess.impl.JessPackageImpl#getSlotDef()
	 * @generated
	 */
	int SLOT_DEF = 27;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_DEF__LOCATION = ASLOT_DEF__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_DEF__COMMENTS_BEFORE = ASLOT_DEF__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_DEF__COMMENTS_AFTER = ASLOT_DEF__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Slot Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_DEF__SLOT_NAME = ASLOT_DEF__SLOT_NAME;

	/**
	 * The feature id for the '<em><b>Optionals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_DEF__OPTIONALS = ASLOT_DEF__OPTIONALS;

	/**
	 * The number of structural features of the '<em>Slot Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_DEF_FEATURE_COUNT = ASLOT_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Slot Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_DEF_OPERATION_COUNT = ASLOT_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.MultiSlotDefImpl <em>Multi Slot Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.MultiSlotDefImpl
	 * @see jess.impl.JessPackageImpl#getMultiSlotDef()
	 * @generated
	 */
	int MULTI_SLOT_DEF = 28;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SLOT_DEF__LOCATION = ASLOT_DEF__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SLOT_DEF__COMMENTS_BEFORE = ASLOT_DEF__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SLOT_DEF__COMMENTS_AFTER = ASLOT_DEF__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Slot Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SLOT_DEF__SLOT_NAME = ASLOT_DEF__SLOT_NAME;

	/**
	 * The feature id for the '<em><b>Optionals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SLOT_DEF__OPTIONALS = ASLOT_DEF__OPTIONALS;

	/**
	 * The number of structural features of the '<em>Multi Slot Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SLOT_DEF_FEATURE_COUNT = ASLOT_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Slot Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SLOT_DEF_OPERATION_COUNT = ASLOT_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.SlotOptionsImpl <em>Slot Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.SlotOptionsImpl
	 * @see jess.impl.JessPackageImpl#getSlotOptions()
	 * @generated
	 */
	int SLOT_OPTIONS = 29;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPTIONS__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPTIONS__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPTIONS__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPTIONS__TYPE = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPTIONS__DEF = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Dyn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPTIONS__DEFAULT_DYN = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allowed Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPTIONS__ALLOWED_VALUES = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Slot Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPTIONS_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Slot Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPTIONS_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.UseFuncExpImpl <em>Use Func Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.UseFuncExpImpl
	 * @see jess.impl.JessPackageImpl#getUseFuncExp()
	 * @generated
	 */
	int USE_FUNC_EXP = 30;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_FUNC_EXP__LOCATION = EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_FUNC_EXP__COMMENTS_BEFORE = EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_FUNC_EXP__COMMENTS_AFTER = EXPRESSION__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Use Func Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_FUNC_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Use Func Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_FUNC_EXP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.WhileExpImpl <em>While Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.WhileExpImpl
	 * @see jess.impl.JessPackageImpl#getWhileExp()
	 * @generated
	 */
	int WHILE_EXP = 31;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__LOCATION = USE_FUNC_EXP__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__COMMENTS_BEFORE = USE_FUNC_EXP__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__COMMENTS_AFTER = USE_FUNC_EXP__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Has Do</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__HAS_DO = USE_FUNC_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bool Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__BOOL_EXP = USE_FUNC_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__ACTIONS = USE_FUNC_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>While Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_FEATURE_COUNT = USE_FUNC_EXP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>While Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_OPERATION_COUNT = USE_FUNC_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.ForExpImpl <em>For Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.ForExpImpl
	 * @see jess.impl.JessPackageImpl#getForExp()
	 * @generated
	 */
	int FOR_EXP = 32;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__LOCATION = USE_FUNC_EXP__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__COMMENTS_BEFORE = USE_FUNC_EXP__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__COMMENTS_AFTER = USE_FUNC_EXP__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__INITIALIZER = USE_FUNC_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__CONDITION = USE_FUNC_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__INCREMENT = USE_FUNC_EXP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__EXPRESSIONS = USE_FUNC_EXP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>For Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_FEATURE_COUNT = USE_FUNC_EXP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>For Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_OPERATION_COUNT = USE_FUNC_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.ForeachExpImpl <em>Foreach Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.ForeachExpImpl
	 * @see jess.impl.JessPackageImpl#getForeachExp()
	 * @generated
	 */
	int FOREACH_EXP = 33;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_EXP__LOCATION = USE_FUNC_EXP__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_EXP__COMMENTS_BEFORE = USE_FUNC_EXP__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_EXP__COMMENTS_AFTER = USE_FUNC_EXP__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_EXP__VAR = USE_FUNC_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_EXP__LIST = USE_FUNC_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_EXP__EXPRESSIONS = USE_FUNC_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Foreach Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_EXP_FEATURE_COUNT = USE_FUNC_EXP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Foreach Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_EXP_OPERATION_COUNT = USE_FUNC_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.FuncCallImpl <em>Func Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.FuncCallImpl
	 * @see jess.impl.JessPackageImpl#getFuncCall()
	 * @generated
	 */
	int FUNC_CALL = 34;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNC_CALL__LOCATION = USE_FUNC_EXP__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNC_CALL__COMMENTS_BEFORE = USE_FUNC_EXP__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNC_CALL__COMMENTS_AFTER = USE_FUNC_EXP__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Func Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNC_CALL__FUNC_NAME = USE_FUNC_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Func Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNC_CALL__FUNC_PARAM = USE_FUNC_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Func Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNC_CALL_FEATURE_COUNT = USE_FUNC_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Func Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNC_CALL_OPERATION_COUNT = USE_FUNC_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.EngineExpImpl <em>Engine Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.EngineExpImpl
	 * @see jess.impl.JessPackageImpl#getEngineExp()
	 * @generated
	 */
	int ENGINE_EXP = 35;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_EXP__LOCATION = USE_FUNC_EXP__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_EXP__COMMENTS_BEFORE = USE_FUNC_EXP__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_EXP__COMMENTS_AFTER = USE_FUNC_EXP__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Engine Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_EXP_FEATURE_COUNT = USE_FUNC_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Engine Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_EXP_OPERATION_COUNT = USE_FUNC_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.ExitExpImpl <em>Exit Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.ExitExpImpl
	 * @see jess.impl.JessPackageImpl#getExitExp()
	 * @generated
	 */
	int EXIT_EXP = 36;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EXP__LOCATION = USE_FUNC_EXP__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EXP__COMMENTS_BEFORE = USE_FUNC_EXP__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EXP__COMMENTS_AFTER = USE_FUNC_EXP__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Exit Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EXP_FEATURE_COUNT = USE_FUNC_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exit Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EXP_OPERATION_COUNT = USE_FUNC_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.IfExpressionImpl <em>If Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.IfExpressionImpl
	 * @see jess.impl.JessPackageImpl#getIfExpression()
	 * @generated
	 */
	int IF_EXPRESSION = 37;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__LOCATION = USE_FUNC_EXP__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__COMMENTS_BEFORE = USE_FUNC_EXP__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__COMMENTS_AFTER = USE_FUNC_EXP__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Ifthen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__IFTHEN = USE_FUNC_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elifthen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__ELIFTHEN = USE_FUNC_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__ELSE = USE_FUNC_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION_FEATURE_COUNT = USE_FUNC_EXP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION_OPERATION_COUNT = USE_FUNC_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.ConditionActionImpl <em>Condition Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.ConditionActionImpl
	 * @see jess.impl.JessPackageImpl#getConditionAction()
	 * @generated
	 */
	int CONDITION_ACTION = 38;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION__CONDITION = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION__ACTIONS = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Condition Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ACTION_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.impl.ElifConditionActionImpl <em>Elif Condition Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.impl.ElifConditionActionImpl
	 * @see jess.impl.JessPackageImpl#getElifConditionAction()
	 * @generated
	 */
	int ELIF_CONDITION_ACTION = 39;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIF_CONDITION_ACTION__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIF_CONDITION_ACTION__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIF_CONDITION_ACTION__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Cond Act</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIF_CONDITION_ACTION__COND_ACT = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elif Condition Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIF_CONDITION_ACTION_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Elif Condition Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIF_CONDITION_ACTION_OPERATION_COUNT = LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jess.Advice <em>Advice</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jess.Advice
	 * @see jess.impl.JessPackageImpl#getAdvice()
	 * @generated
	 */
	int ADVICE = 40;


	/**
	 * Returns the meta object for class '{@link jess.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Located Element</em>'.
	 * @see jess.LocatedElement
	 * @generated
	 */
	EClass getLocatedElement();

	/**
	 * Returns the meta object for the attribute '{@link jess.LocatedElement#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see jess.LocatedElement#getLocation()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_Location();

	/**
	 * Returns the meta object for the attribute list '{@link jess.LocatedElement#getCommentsBefore <em>Comments Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comments Before</em>'.
	 * @see jess.LocatedElement#getCommentsBefore()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_CommentsBefore();

	/**
	 * Returns the meta object for the attribute list '{@link jess.LocatedElement#getCommentsAfter <em>Comments After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comments After</em>'.
	 * @see jess.LocatedElement#getCommentsAfter()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_CommentsAfter();

	/**
	 * Returns the meta object for class '{@link jess.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see jess.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.Root#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see jess.Root#getExpressions()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Expressions();

	/**
	 * Returns the meta object for class '{@link jess.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see jess.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link jess.Integ <em>Integ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integ</em>'.
	 * @see jess.Integ
	 * @generated
	 */
	EClass getInteg();

	/**
	 * Returns the meta object for the attribute '{@link jess.Integ#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see jess.Integ#getVal()
	 * @see #getInteg()
	 * @generated
	 */
	EAttribute getInteg_Val();

	/**
	 * Returns the meta object for class '{@link jess.Floa <em>Floa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floa</em>'.
	 * @see jess.Floa
	 * @generated
	 */
	EClass getFloa();

	/**
	 * Returns the meta object for the attribute '{@link jess.Floa#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see jess.Floa#getVal()
	 * @see #getFloa()
	 * @generated
	 */
	EAttribute getFloa_Val();

	/**
	 * Returns the meta object for class '{@link jess.Str <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Str</em>'.
	 * @see jess.Str
	 * @generated
	 */
	EClass getStr();

	/**
	 * Returns the meta object for the attribute '{@link jess.Str#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see jess.Str#getVal()
	 * @see #getStr()
	 * @generated
	 */
	EAttribute getStr_Val();

	/**
	 * Returns the meta object for class '{@link jess.Ident <em>Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ident</em>'.
	 * @see jess.Ident
	 * @generated
	 */
	EClass getIdent();

	/**
	 * Returns the meta object for class '{@link jess.ValidIdentifier <em>Valid Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Identifier</em>'.
	 * @see jess.ValidIdentifier
	 * @generated
	 */
	EClass getValidIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link jess.ValidIdentifier#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see jess.ValidIdentifier#getVal()
	 * @see #getValidIdentifier()
	 * @generated
	 */
	EAttribute getValidIdentifier_Val();

	/**
	 * Returns the meta object for class '{@link jess.SlotName <em>Slot Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot Name</em>'.
	 * @see jess.SlotName
	 * @generated
	 */
	EClass getSlotName();

	/**
	 * Returns the meta object for the attribute '{@link jess.SlotName#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see jess.SlotName#getVal()
	 * @see #getSlotName()
	 * @generated
	 */
	EAttribute getSlotName_Val();

	/**
	 * Returns the meta object for class '{@link jess.JessVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see jess.JessVariable
	 * @generated
	 */
	EClass getJessVariable();

	/**
	 * Returns the meta object for the attribute '{@link jess.JessVariable#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see jess.JessVariable#getVal()
	 * @see #getJessVariable()
	 * @generated
	 */
	EAttribute getJessVariable_Val();

	/**
	 * Returns the meta object for class '{@link jess.TemplateExpression <em>Template Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression</em>'.
	 * @see jess.TemplateExpression
	 * @generated
	 */
	EClass getTemplateExpression();

	/**
	 * Returns the meta object for the containment reference '{@link jess.TemplateExpression#getTemplateName <em>Template Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Name</em>'.
	 * @see jess.TemplateExpression#getTemplateName()
	 * @see #getTemplateExpression()
	 * @generated
	 */
	EReference getTemplateExpression_TemplateName();

	/**
	 * Returns the meta object for the containment reference '{@link jess.TemplateExpression#getFirstSlot <em>First Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Slot</em>'.
	 * @see jess.TemplateExpression#getFirstSlot()
	 * @see #getTemplateExpression()
	 * @generated
	 */
	EReference getTemplateExpression_FirstSlot();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.TemplateExpression#getSlotOp <em>Slot Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot Op</em>'.
	 * @see jess.TemplateExpression#getSlotOp()
	 * @see #getTemplateExpression()
	 * @generated
	 */
	EReference getTemplateExpression_SlotOp();

	/**
	 * Returns the meta object for class '{@link jess.SlotOp <em>Slot Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot Op</em>'.
	 * @see jess.SlotOp
	 * @generated
	 */
	EClass getSlotOp();

	/**
	 * Returns the meta object for the containment reference '{@link jess.SlotOp#getSlotIdent <em>Slot Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slot Ident</em>'.
	 * @see jess.SlotOp#getSlotIdent()
	 * @see #getSlotOp()
	 * @generated
	 */
	EReference getSlotOp_SlotIdent();

	/**
	 * Returns the meta object for the containment reference '{@link jess.SlotOp#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see jess.SlotOp#getOperator()
	 * @see #getSlotOp()
	 * @generated
	 */
	EReference getSlotOp_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link jess.SlotOp#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see jess.SlotOp#getExp()
	 * @see #getSlotOp()
	 * @generated
	 */
	EReference getSlotOp_Exp();

	/**
	 * Returns the meta object for class '{@link jess.DefinitionExp <em>Definition Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Exp</em>'.
	 * @see jess.DefinitionExp
	 * @generated
	 */
	EClass getDefinitionExp();

	/**
	 * Returns the meta object for class '{@link jess.GlobalDefinition <em>Global Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Definition</em>'.
	 * @see jess.GlobalDefinition
	 * @generated
	 */
	EClass getGlobalDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.GlobalDefinition#getVarDef <em>Var Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var Def</em>'.
	 * @see jess.GlobalDefinition#getVarDef()
	 * @see #getGlobalDefinition()
	 * @generated
	 */
	EReference getGlobalDefinition_VarDef();

	/**
	 * Returns the meta object for class '{@link jess.VarDefinition <em>Var Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Definition</em>'.
	 * @see jess.VarDefinition
	 * @generated
	 */
	EClass getVarDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jess.VarDefinition#getJessVar <em>Jess Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jess Var</em>'.
	 * @see jess.VarDefinition#getJessVar()
	 * @see #getVarDefinition()
	 * @generated
	 */
	EReference getVarDefinition_JessVar();

	/**
	 * Returns the meta object for the containment reference '{@link jess.VarDefinition#getEq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eq</em>'.
	 * @see jess.VarDefinition#getEq()
	 * @see #getVarDefinition()
	 * @generated
	 */
	EReference getVarDefinition_Eq();

	/**
	 * Returns the meta object for the containment reference '{@link jess.VarDefinition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see jess.VarDefinition#getExpression()
	 * @see #getVarDefinition()
	 * @generated
	 */
	EReference getVarDefinition_Expression();

	/**
	 * Returns the meta object for class '{@link jess.FunctionDefinition <em>Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Definition</em>'.
	 * @see jess.FunctionDefinition
	 * @generated
	 */
	EClass getFunctionDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jess.FunctionDefinition#getFuncName <em>Func Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Func Name</em>'.
	 * @see jess.FunctionDefinition#getFuncName()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_FuncName();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.FunctionDefinition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see jess.FunctionDefinition#getParameters()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.FunctionDefinition#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see jess.FunctionDefinition#getExpressions()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Expressions();

	/**
	 * Returns the meta object for class '{@link jess.AdviceDefinition <em>Advice Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advice Definition</em>'.
	 * @see jess.AdviceDefinition
	 * @generated
	 */
	EClass getAdviceDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jess.AdviceDefinition#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see jess.AdviceDefinition#getDirection()
	 * @see #getAdviceDefinition()
	 * @generated
	 */
	EAttribute getAdviceDefinition_Direction();

	/**
	 * Returns the meta object for the containment reference '{@link jess.AdviceDefinition#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see jess.AdviceDefinition#getOp()
	 * @see #getAdviceDefinition()
	 * @generated
	 */
	EReference getAdviceDefinition_Op();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.AdviceDefinition#getAdvice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Advice</em>'.
	 * @see jess.AdviceDefinition#getAdvice()
	 * @see #getAdviceDefinition()
	 * @generated
	 */
	EReference getAdviceDefinition_Advice();

	/**
	 * Returns the meta object for class '{@link jess.UnDefAdvice <em>Un Def Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Un Def Advice</em>'.
	 * @see jess.UnDefAdvice
	 * @generated
	 */
	EClass getUnDefAdvice();

	/**
	 * Returns the meta object for the containment reference '{@link jess.UnDefAdvice#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see jess.UnDefAdvice#getOp()
	 * @see #getUnDefAdvice()
	 * @generated
	 */
	EReference getUnDefAdvice_Op();

	/**
	 * Returns the meta object for class '{@link jess.FactDefinition <em>Fact Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact Definition</em>'.
	 * @see jess.FactDefinition
	 * @generated
	 */
	EClass getFactDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jess.FactDefinition#getFactName <em>Fact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fact Name</em>'.
	 * @see jess.FactDefinition#getFactName()
	 * @see #getFactDefinition()
	 * @generated
	 */
	EReference getFactDefinition_FactName();

	/**
	 * Returns the meta object for the containment reference '{@link jess.FactDefinition#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see jess.FactDefinition#getDocumentation()
	 * @see #getFactDefinition()
	 * @generated
	 */
	EReference getFactDefinition_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.FactDefinition#getFact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fact</em>'.
	 * @see jess.FactDefinition#getFact()
	 * @see #getFactDefinition()
	 * @generated
	 */
	EReference getFactDefinition_Fact();

	/**
	 * Returns the meta object for class '{@link jess.RuleDefinition <em>Rule Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Definition</em>'.
	 * @see jess.RuleDefinition
	 * @generated
	 */
	EClass getRuleDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jess.RuleDefinition#getRuleName <em>Rule Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule Name</em>'.
	 * @see jess.RuleDefinition#getRuleName()
	 * @see #getRuleDefinition()
	 * @generated
	 */
	EReference getRuleDefinition_RuleName();

	/**
	 * Returns the meta object for the containment reference '{@link jess.RuleDefinition#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see jess.RuleDefinition#getDocumentation()
	 * @see #getRuleDefinition()
	 * @generated
	 */
	EReference getRuleDefinition_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link jess.RuleDefinition#getDeclare <em>Declare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declare</em>'.
	 * @see jess.RuleDefinition#getDeclare()
	 * @see #getRuleDefinition()
	 * @generated
	 */
	EReference getRuleDefinition_Declare();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.RuleDefinition#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see jess.RuleDefinition#getConditions()
	 * @see #getRuleDefinition()
	 * @generated
	 */
	EReference getRuleDefinition_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.RuleDefinition#getFunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Call</em>'.
	 * @see jess.RuleDefinition#getFunctionCall()
	 * @see #getRuleDefinition()
	 * @generated
	 */
	EReference getRuleDefinition_FunctionCall();

	/**
	 * Returns the meta object for class '{@link jess.DeclareRule <em>Declare Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declare Rule</em>'.
	 * @see jess.DeclareRule
	 * @generated
	 */
	EClass getDeclareRule();

	/**
	 * Returns the meta object for the containment reference '{@link jess.DeclareRule#getSalience <em>Salience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Salience</em>'.
	 * @see jess.DeclareRule#getSalience()
	 * @see #getDeclareRule()
	 * @generated
	 */
	EReference getDeclareRule_Salience();

	/**
	 * Returns the meta object for the containment reference '{@link jess.DeclareRule#getNodeIndexHash <em>Node Index Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node Index Hash</em>'.
	 * @see jess.DeclareRule#getNodeIndexHash()
	 * @see #getDeclareRule()
	 * @generated
	 */
	EReference getDeclareRule_NodeIndexHash();

	/**
	 * Returns the meta object for the containment reference '{@link jess.DeclareRule#getAutoFocus <em>Auto Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Focus</em>'.
	 * @see jess.DeclareRule#getAutoFocus()
	 * @see #getDeclareRule()
	 * @generated
	 */
	EReference getDeclareRule_AutoFocus();

	/**
	 * Returns the meta object for the containment reference '{@link jess.DeclareRule#getNoLoop <em>No Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No Loop</em>'.
	 * @see jess.DeclareRule#getNoLoop()
	 * @see #getDeclareRule()
	 * @generated
	 */
	EReference getDeclareRule_NoLoop();

	/**
	 * Returns the meta object for class '{@link jess.ModuleDefinition <em>Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Definition</em>'.
	 * @see jess.ModuleDefinition
	 * @generated
	 */
	EClass getModuleDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jess.ModuleDefinition#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Name</em>'.
	 * @see jess.ModuleDefinition#getModuleName()
	 * @see #getModuleDefinition()
	 * @generated
	 */
	EReference getModuleDefinition_ModuleName();

	/**
	 * Returns the meta object for the containment reference '{@link jess.ModuleDefinition#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see jess.ModuleDefinition#getDocumentation()
	 * @see #getModuleDefinition()
	 * @generated
	 */
	EReference getModuleDefinition_Documentation();

	/**
	 * Returns the meta object for class '{@link jess.QueryDefinition <em>Query Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Definition</em>'.
	 * @see jess.QueryDefinition
	 * @generated
	 */
	EClass getQueryDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jess.QueryDefinition#getQueryName <em>Query Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Name</em>'.
	 * @see jess.QueryDefinition#getQueryName()
	 * @see #getQueryDefinition()
	 * @generated
	 */
	EReference getQueryDefinition_QueryName();

	/**
	 * Returns the meta object for the containment reference '{@link jess.QueryDefinition#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see jess.QueryDefinition#getDocumentation()
	 * @see #getQueryDefinition()
	 * @generated
	 */
	EReference getQueryDefinition_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link jess.QueryDefinition#getDeclare <em>Declare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declare</em>'.
	 * @see jess.QueryDefinition#getDeclare()
	 * @see #getQueryDefinition()
	 * @generated
	 */
	EReference getQueryDefinition_Declare();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.QueryDefinition#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see jess.QueryDefinition#getExpressions()
	 * @see #getQueryDefinition()
	 * @generated
	 */
	EReference getQueryDefinition_Expressions();

	/**
	 * Returns the meta object for class '{@link jess.DeclareVar <em>Declare Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declare Var</em>'.
	 * @see jess.DeclareVar
	 * @generated
	 */
	EClass getDeclareVar();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.DeclareVar#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see jess.DeclareVar#getVar()
	 * @see #getDeclareVar()
	 * @generated
	 */
	EReference getDeclareVar_Var();

	/**
	 * Returns the meta object for the containment reference '{@link jess.DeclareVar#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see jess.DeclareVar#getNode()
	 * @see #getDeclareVar()
	 * @generated
	 */
	EReference getDeclareVar_Node();

	/**
	 * Returns the meta object for the containment reference '{@link jess.DeclareVar#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see jess.DeclareVar#getMax()
	 * @see #getDeclareVar()
	 * @generated
	 */
	EReference getDeclareVar_Max();

	/**
	 * Returns the meta object for class '{@link jess.TemplateDefinition <em>Template Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Definition</em>'.
	 * @see jess.TemplateDefinition
	 * @generated
	 */
	EClass getTemplateDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jess.TemplateDefinition#getTemplateName <em>Template Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Name</em>'.
	 * @see jess.TemplateDefinition#getTemplateName()
	 * @see #getTemplateDefinition()
	 * @generated
	 */
	EReference getTemplateDefinition_TemplateName();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.TemplateDefinition#getInherits <em>Inherits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inherits</em>'.
	 * @see jess.TemplateDefinition#getInherits()
	 * @see #getTemplateDefinition()
	 * @generated
	 */
	EReference getTemplateDefinition_Inherits();

	/**
	 * Returns the meta object for the containment reference '{@link jess.TemplateDefinition#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see jess.TemplateDefinition#getDocumentation()
	 * @see #getTemplateDefinition()
	 * @generated
	 */
	EReference getTemplateDefinition_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link jess.TemplateDefinition#getDeclareBloc <em>Declare Bloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declare Bloc</em>'.
	 * @see jess.TemplateDefinition#getDeclareBloc()
	 * @see #getTemplateDefinition()
	 * @generated
	 */
	EReference getTemplateDefinition_DeclareBloc();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.TemplateDefinition#getSlotDef <em>Slot Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot Def</em>'.
	 * @see jess.TemplateDefinition#getSlotDef()
	 * @see #getTemplateDefinition()
	 * @generated
	 */
	EReference getTemplateDefinition_SlotDef();

	/**
	 * Returns the meta object for class '{@link jess.DeclareBloc <em>Declare Bloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declare Bloc</em>'.
	 * @see jess.DeclareBloc
	 * @generated
	 */
	EClass getDeclareBloc();

	/**
	 * Returns the meta object for the containment reference '{@link jess.DeclareBloc#getSlotSpecific <em>Slot Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slot Specific</em>'.
	 * @see jess.DeclareBloc#getSlotSpecific()
	 * @see #getDeclareBloc()
	 * @generated
	 */
	EReference getDeclareBloc_SlotSpecific();

	/**
	 * Returns the meta object for the containment reference '{@link jess.DeclareBloc#getBackchainReaction <em>Backchain Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Backchain Reaction</em>'.
	 * @see jess.DeclareBloc#getBackchainReaction()
	 * @see #getDeclareBloc()
	 * @generated
	 */
	EReference getDeclareBloc_BackchainReaction();

	/**
	 * Returns the meta object for the containment reference '{@link jess.DeclareBloc#getFromClass <em>From Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Class</em>'.
	 * @see jess.DeclareBloc#getFromClass()
	 * @see #getDeclareBloc()
	 * @generated
	 */
	EReference getDeclareBloc_FromClass();

	/**
	 * Returns the meta object for the containment reference '{@link jess.DeclareBloc#getIncludeVariable <em>Include Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Include Variable</em>'.
	 * @see jess.DeclareBloc#getIncludeVariable()
	 * @see #getDeclareBloc()
	 * @generated
	 */
	EReference getDeclareBloc_IncludeVariable();

	/**
	 * Returns the meta object for the containment reference '{@link jess.DeclareBloc#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Order</em>'.
	 * @see jess.DeclareBloc#getOrder()
	 * @see #getDeclareBloc()
	 * @generated
	 */
	EReference getDeclareBloc_Order();

	/**
	 * Returns the meta object for class '{@link jess.ASlotDef <em>ASlot Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASlot Def</em>'.
	 * @see jess.ASlotDef
	 * @generated
	 */
	EClass getASlotDef();

	/**
	 * Returns the meta object for the containment reference '{@link jess.ASlotDef#getSlotName <em>Slot Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slot Name</em>'.
	 * @see jess.ASlotDef#getSlotName()
	 * @see #getASlotDef()
	 * @generated
	 */
	EReference getASlotDef_SlotName();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.ASlotDef#getOptionals <em>Optionals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optionals</em>'.
	 * @see jess.ASlotDef#getOptionals()
	 * @see #getASlotDef()
	 * @generated
	 */
	EReference getASlotDef_Optionals();

	/**
	 * Returns the meta object for class '{@link jess.SlotDef <em>Slot Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot Def</em>'.
	 * @see jess.SlotDef
	 * @generated
	 */
	EClass getSlotDef();

	/**
	 * Returns the meta object for class '{@link jess.MultiSlotDef <em>Multi Slot Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Slot Def</em>'.
	 * @see jess.MultiSlotDef
	 * @generated
	 */
	EClass getMultiSlotDef();

	/**
	 * Returns the meta object for class '{@link jess.SlotOptions <em>Slot Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot Options</em>'.
	 * @see jess.SlotOptions
	 * @generated
	 */
	EClass getSlotOptions();

	/**
	 * Returns the meta object for the containment reference '{@link jess.SlotOptions#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see jess.SlotOptions#getType()
	 * @see #getSlotOptions()
	 * @generated
	 */
	EReference getSlotOptions_Type();

	/**
	 * Returns the meta object for the containment reference '{@link jess.SlotOptions#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Def</em>'.
	 * @see jess.SlotOptions#getDef()
	 * @see #getSlotOptions()
	 * @generated
	 */
	EReference getSlotOptions_Def();

	/**
	 * Returns the meta object for the containment reference '{@link jess.SlotOptions#getDefaultDyn <em>Default Dyn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Dyn</em>'.
	 * @see jess.SlotOptions#getDefaultDyn()
	 * @see #getSlotOptions()
	 * @generated
	 */
	EReference getSlotOptions_DefaultDyn();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.SlotOptions#getAllowedValues <em>Allowed Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allowed Values</em>'.
	 * @see jess.SlotOptions#getAllowedValues()
	 * @see #getSlotOptions()
	 * @generated
	 */
	EReference getSlotOptions_AllowedValues();

	/**
	 * Returns the meta object for class '{@link jess.UseFuncExp <em>Use Func Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Func Exp</em>'.
	 * @see jess.UseFuncExp
	 * @generated
	 */
	EClass getUseFuncExp();

	/**
	 * Returns the meta object for class '{@link jess.WhileExp <em>While Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Exp</em>'.
	 * @see jess.WhileExp
	 * @generated
	 */
	EClass getWhileExp();

	/**
	 * Returns the meta object for the attribute '{@link jess.WhileExp#getHasDo <em>Has Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Do</em>'.
	 * @see jess.WhileExp#getHasDo()
	 * @see #getWhileExp()
	 * @generated
	 */
	EAttribute getWhileExp_HasDo();

	/**
	 * Returns the meta object for the containment reference '{@link jess.WhileExp#getBoolExp <em>Bool Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bool Exp</em>'.
	 * @see jess.WhileExp#getBoolExp()
	 * @see #getWhileExp()
	 * @generated
	 */
	EReference getWhileExp_BoolExp();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.WhileExp#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see jess.WhileExp#getActions()
	 * @see #getWhileExp()
	 * @generated
	 */
	EReference getWhileExp_Actions();

	/**
	 * Returns the meta object for class '{@link jess.ForExp <em>For Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Exp</em>'.
	 * @see jess.ForExp
	 * @generated
	 */
	EClass getForExp();

	/**
	 * Returns the meta object for the containment reference '{@link jess.ForExp#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initializer</em>'.
	 * @see jess.ForExp#getInitializer()
	 * @see #getForExp()
	 * @generated
	 */
	EReference getForExp_Initializer();

	/**
	 * Returns the meta object for the containment reference '{@link jess.ForExp#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see jess.ForExp#getCondition()
	 * @see #getForExp()
	 * @generated
	 */
	EReference getForExp_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link jess.ForExp#getIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Increment</em>'.
	 * @see jess.ForExp#getIncrement()
	 * @see #getForExp()
	 * @generated
	 */
	EReference getForExp_Increment();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.ForExp#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see jess.ForExp#getExpressions()
	 * @see #getForExp()
	 * @generated
	 */
	EReference getForExp_Expressions();

	/**
	 * Returns the meta object for class '{@link jess.ForeachExp <em>Foreach Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreach Exp</em>'.
	 * @see jess.ForeachExp
	 * @generated
	 */
	EClass getForeachExp();

	/**
	 * Returns the meta object for the containment reference '{@link jess.ForeachExp#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var</em>'.
	 * @see jess.ForeachExp#getVar()
	 * @see #getForeachExp()
	 * @generated
	 */
	EReference getForeachExp_Var();

	/**
	 * Returns the meta object for the containment reference '{@link jess.ForeachExp#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see jess.ForeachExp#getList()
	 * @see #getForeachExp()
	 * @generated
	 */
	EReference getForeachExp_List();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.ForeachExp#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see jess.ForeachExp#getExpressions()
	 * @see #getForeachExp()
	 * @generated
	 */
	EReference getForeachExp_Expressions();

	/**
	 * Returns the meta object for class '{@link jess.FuncCall <em>Func Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Func Call</em>'.
	 * @see jess.FuncCall
	 * @generated
	 */
	EClass getFuncCall();

	/**
	 * Returns the meta object for the containment reference '{@link jess.FuncCall#getFuncName <em>Func Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Func Name</em>'.
	 * @see jess.FuncCall#getFuncName()
	 * @see #getFuncCall()
	 * @generated
	 */
	EReference getFuncCall_FuncName();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.FuncCall#getFuncParam <em>Func Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Func Param</em>'.
	 * @see jess.FuncCall#getFuncParam()
	 * @see #getFuncCall()
	 * @generated
	 */
	EReference getFuncCall_FuncParam();

	/**
	 * Returns the meta object for class '{@link jess.EngineExp <em>Engine Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engine Exp</em>'.
	 * @see jess.EngineExp
	 * @generated
	 */
	EClass getEngineExp();

	/**
	 * Returns the meta object for class '{@link jess.ExitExp <em>Exit Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Exp</em>'.
	 * @see jess.ExitExp
	 * @generated
	 */
	EClass getExitExp();

	/**
	 * Returns the meta object for class '{@link jess.IfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Expression</em>'.
	 * @see jess.IfExpression
	 * @generated
	 */
	EClass getIfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link jess.IfExpression#getIfthen <em>Ifthen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ifthen</em>'.
	 * @see jess.IfExpression#getIfthen()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_Ifthen();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.IfExpression#getElifthen <em>Elifthen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elifthen</em>'.
	 * @see jess.IfExpression#getElifthen()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_Elifthen();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.IfExpression#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else</em>'.
	 * @see jess.IfExpression#getElse()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_Else();

	/**
	 * Returns the meta object for class '{@link jess.ConditionAction <em>Condition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Action</em>'.
	 * @see jess.ConditionAction
	 * @generated
	 */
	EClass getConditionAction();

	/**
	 * Returns the meta object for the containment reference '{@link jess.ConditionAction#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see jess.ConditionAction#getCondition()
	 * @see #getConditionAction()
	 * @generated
	 */
	EReference getConditionAction_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link jess.ConditionAction#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see jess.ConditionAction#getActions()
	 * @see #getConditionAction()
	 * @generated
	 */
	EReference getConditionAction_Actions();

	/**
	 * Returns the meta object for class '{@link jess.ElifConditionAction <em>Elif Condition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elif Condition Action</em>'.
	 * @see jess.ElifConditionAction
	 * @generated
	 */
	EClass getElifConditionAction();

	/**
	 * Returns the meta object for the containment reference '{@link jess.ElifConditionAction#getCondAct <em>Cond Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond Act</em>'.
	 * @see jess.ElifConditionAction#getCondAct()
	 * @see #getElifConditionAction()
	 * @generated
	 */
	EReference getElifConditionAction_CondAct();

	/**
	 * Returns the meta object for enum '{@link jess.Advice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Advice</em>'.
	 * @see jess.Advice
	 * @generated
	 */
	EEnum getAdvice();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JessFactory getJessFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jess.impl.LocatedElementImpl <em>Located Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.LocatedElementImpl
		 * @see jess.impl.JessPackageImpl#getLocatedElement()
		 * @generated
		 */
		EClass LOCATED_ELEMENT = eINSTANCE.getLocatedElement();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__LOCATION = eINSTANCE.getLocatedElement_Location();

		/**
		 * The meta object literal for the '<em><b>Comments Before</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__COMMENTS_BEFORE = eINSTANCE.getLocatedElement_CommentsBefore();

		/**
		 * The meta object literal for the '<em><b>Comments After</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__COMMENTS_AFTER = eINSTANCE.getLocatedElement_CommentsAfter();

		/**
		 * The meta object literal for the '{@link jess.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.RootImpl
		 * @see jess.impl.JessPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__EXPRESSIONS = eINSTANCE.getRoot_Expressions();

		/**
		 * The meta object literal for the '{@link jess.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.ExpressionImpl
		 * @see jess.impl.JessPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link jess.impl.IntegImpl <em>Integ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.IntegImpl
		 * @see jess.impl.JessPackageImpl#getInteg()
		 * @generated
		 */
		EClass INTEG = eINSTANCE.getInteg();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEG__VAL = eINSTANCE.getInteg_Val();

		/**
		 * The meta object literal for the '{@link jess.impl.FloaImpl <em>Floa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.FloaImpl
		 * @see jess.impl.JessPackageImpl#getFloa()
		 * @generated
		 */
		EClass FLOA = eINSTANCE.getFloa();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOA__VAL = eINSTANCE.getFloa_Val();

		/**
		 * The meta object literal for the '{@link jess.impl.StrImpl <em>Str</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.StrImpl
		 * @see jess.impl.JessPackageImpl#getStr()
		 * @generated
		 */
		EClass STR = eINSTANCE.getStr();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STR__VAL = eINSTANCE.getStr_Val();

		/**
		 * The meta object literal for the '{@link jess.impl.IdentImpl <em>Ident</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.IdentImpl
		 * @see jess.impl.JessPackageImpl#getIdent()
		 * @generated
		 */
		EClass IDENT = eINSTANCE.getIdent();

		/**
		 * The meta object literal for the '{@link jess.impl.ValidIdentifierImpl <em>Valid Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.ValidIdentifierImpl
		 * @see jess.impl.JessPackageImpl#getValidIdentifier()
		 * @generated
		 */
		EClass VALID_IDENTIFIER = eINSTANCE.getValidIdentifier();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALID_IDENTIFIER__VAL = eINSTANCE.getValidIdentifier_Val();

		/**
		 * The meta object literal for the '{@link jess.impl.SlotNameImpl <em>Slot Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.SlotNameImpl
		 * @see jess.impl.JessPackageImpl#getSlotName()
		 * @generated
		 */
		EClass SLOT_NAME = eINSTANCE.getSlotName();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT_NAME__VAL = eINSTANCE.getSlotName_Val();

		/**
		 * The meta object literal for the '{@link jess.impl.JessVariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.JessVariableImpl
		 * @see jess.impl.JessPackageImpl#getJessVariable()
		 * @generated
		 */
		EClass JESS_VARIABLE = eINSTANCE.getJessVariable();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JESS_VARIABLE__VAL = eINSTANCE.getJessVariable_Val();

		/**
		 * The meta object literal for the '{@link jess.impl.TemplateExpressionImpl <em>Template Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.TemplateExpressionImpl
		 * @see jess.impl.JessPackageImpl#getTemplateExpression()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION = eINSTANCE.getTemplateExpression();

		/**
		 * The meta object literal for the '<em><b>Template Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION__TEMPLATE_NAME = eINSTANCE.getTemplateExpression_TemplateName();

		/**
		 * The meta object literal for the '<em><b>First Slot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION__FIRST_SLOT = eINSTANCE.getTemplateExpression_FirstSlot();

		/**
		 * The meta object literal for the '<em><b>Slot Op</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION__SLOT_OP = eINSTANCE.getTemplateExpression_SlotOp();

		/**
		 * The meta object literal for the '{@link jess.impl.SlotOpImpl <em>Slot Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.SlotOpImpl
		 * @see jess.impl.JessPackageImpl#getSlotOp()
		 * @generated
		 */
		EClass SLOT_OP = eINSTANCE.getSlotOp();

		/**
		 * The meta object literal for the '<em><b>Slot Ident</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_OP__SLOT_IDENT = eINSTANCE.getSlotOp_SlotIdent();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_OP__OPERATOR = eINSTANCE.getSlotOp_Operator();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_OP__EXP = eINSTANCE.getSlotOp_Exp();

		/**
		 * The meta object literal for the '{@link jess.impl.DefinitionExpImpl <em>Definition Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.DefinitionExpImpl
		 * @see jess.impl.JessPackageImpl#getDefinitionExp()
		 * @generated
		 */
		EClass DEFINITION_EXP = eINSTANCE.getDefinitionExp();

		/**
		 * The meta object literal for the '{@link jess.impl.GlobalDefinitionImpl <em>Global Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.GlobalDefinitionImpl
		 * @see jess.impl.JessPackageImpl#getGlobalDefinition()
		 * @generated
		 */
		EClass GLOBAL_DEFINITION = eINSTANCE.getGlobalDefinition();

		/**
		 * The meta object literal for the '<em><b>Var Def</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_DEFINITION__VAR_DEF = eINSTANCE.getGlobalDefinition_VarDef();

		/**
		 * The meta object literal for the '{@link jess.impl.VarDefinitionImpl <em>Var Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.VarDefinitionImpl
		 * @see jess.impl.JessPackageImpl#getVarDefinition()
		 * @generated
		 */
		EClass VAR_DEFINITION = eINSTANCE.getVarDefinition();

		/**
		 * The meta object literal for the '<em><b>Jess Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_DEFINITION__JESS_VAR = eINSTANCE.getVarDefinition_JessVar();

		/**
		 * The meta object literal for the '<em><b>Eq</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_DEFINITION__EQ = eINSTANCE.getVarDefinition_Eq();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_DEFINITION__EXPRESSION = eINSTANCE.getVarDefinition_Expression();

		/**
		 * The meta object literal for the '{@link jess.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.FunctionDefinitionImpl
		 * @see jess.impl.JessPackageImpl#getFunctionDefinition()
		 * @generated
		 */
		EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

		/**
		 * The meta object literal for the '<em><b>Func Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__FUNC_NAME = eINSTANCE.getFunctionDefinition_FuncName();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__PARAMETERS = eINSTANCE.getFunctionDefinition_Parameters();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__EXPRESSIONS = eINSTANCE.getFunctionDefinition_Expressions();

		/**
		 * The meta object literal for the '{@link jess.impl.AdviceDefinitionImpl <em>Advice Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.AdviceDefinitionImpl
		 * @see jess.impl.JessPackageImpl#getAdviceDefinition()
		 * @generated
		 */
		EClass ADVICE_DEFINITION = eINSTANCE.getAdviceDefinition();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVICE_DEFINITION__DIRECTION = eINSTANCE.getAdviceDefinition_Direction();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVICE_DEFINITION__OP = eINSTANCE.getAdviceDefinition_Op();

		/**
		 * The meta object literal for the '<em><b>Advice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVICE_DEFINITION__ADVICE = eINSTANCE.getAdviceDefinition_Advice();

		/**
		 * The meta object literal for the '{@link jess.impl.UnDefAdviceImpl <em>Un Def Advice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.UnDefAdviceImpl
		 * @see jess.impl.JessPackageImpl#getUnDefAdvice()
		 * @generated
		 */
		EClass UN_DEF_ADVICE = eINSTANCE.getUnDefAdvice();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UN_DEF_ADVICE__OP = eINSTANCE.getUnDefAdvice_Op();

		/**
		 * The meta object literal for the '{@link jess.impl.FactDefinitionImpl <em>Fact Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.FactDefinitionImpl
		 * @see jess.impl.JessPackageImpl#getFactDefinition()
		 * @generated
		 */
		EClass FACT_DEFINITION = eINSTANCE.getFactDefinition();

		/**
		 * The meta object literal for the '<em><b>Fact Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT_DEFINITION__FACT_NAME = eINSTANCE.getFactDefinition_FactName();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT_DEFINITION__DOCUMENTATION = eINSTANCE.getFactDefinition_Documentation();

		/**
		 * The meta object literal for the '<em><b>Fact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT_DEFINITION__FACT = eINSTANCE.getFactDefinition_Fact();

		/**
		 * The meta object literal for the '{@link jess.impl.RuleDefinitionImpl <em>Rule Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.RuleDefinitionImpl
		 * @see jess.impl.JessPackageImpl#getRuleDefinition()
		 * @generated
		 */
		EClass RULE_DEFINITION = eINSTANCE.getRuleDefinition();

		/**
		 * The meta object literal for the '<em><b>Rule Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_DEFINITION__RULE_NAME = eINSTANCE.getRuleDefinition_RuleName();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_DEFINITION__DOCUMENTATION = eINSTANCE.getRuleDefinition_Documentation();

		/**
		 * The meta object literal for the '<em><b>Declare</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_DEFINITION__DECLARE = eINSTANCE.getRuleDefinition_Declare();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_DEFINITION__CONDITIONS = eINSTANCE.getRuleDefinition_Conditions();

		/**
		 * The meta object literal for the '<em><b>Function Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_DEFINITION__FUNCTION_CALL = eINSTANCE.getRuleDefinition_FunctionCall();

		/**
		 * The meta object literal for the '{@link jess.impl.DeclareRuleImpl <em>Declare Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.DeclareRuleImpl
		 * @see jess.impl.JessPackageImpl#getDeclareRule()
		 * @generated
		 */
		EClass DECLARE_RULE = eINSTANCE.getDeclareRule();

		/**
		 * The meta object literal for the '<em><b>Salience</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARE_RULE__SALIENCE = eINSTANCE.getDeclareRule_Salience();

		/**
		 * The meta object literal for the '<em><b>Node Index Hash</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARE_RULE__NODE_INDEX_HASH = eINSTANCE.getDeclareRule_NodeIndexHash();

		/**
		 * The meta object literal for the '<em><b>Auto Focus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARE_RULE__AUTO_FOCUS = eINSTANCE.getDeclareRule_AutoFocus();

		/**
		 * The meta object literal for the '<em><b>No Loop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARE_RULE__NO_LOOP = eINSTANCE.getDeclareRule_NoLoop();

		/**
		 * The meta object literal for the '{@link jess.impl.ModuleDefinitionImpl <em>Module Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.ModuleDefinitionImpl
		 * @see jess.impl.JessPackageImpl#getModuleDefinition()
		 * @generated
		 */
		EClass MODULE_DEFINITION = eINSTANCE.getModuleDefinition();

		/**
		 * The meta object literal for the '<em><b>Module Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEFINITION__MODULE_NAME = eINSTANCE.getModuleDefinition_ModuleName();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEFINITION__DOCUMENTATION = eINSTANCE.getModuleDefinition_Documentation();

		/**
		 * The meta object literal for the '{@link jess.impl.QueryDefinitionImpl <em>Query Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.QueryDefinitionImpl
		 * @see jess.impl.JessPackageImpl#getQueryDefinition()
		 * @generated
		 */
		EClass QUERY_DEFINITION = eINSTANCE.getQueryDefinition();

		/**
		 * The meta object literal for the '<em><b>Query Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_DEFINITION__QUERY_NAME = eINSTANCE.getQueryDefinition_QueryName();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_DEFINITION__DOCUMENTATION = eINSTANCE.getQueryDefinition_Documentation();

		/**
		 * The meta object literal for the '<em><b>Declare</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_DEFINITION__DECLARE = eINSTANCE.getQueryDefinition_Declare();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_DEFINITION__EXPRESSIONS = eINSTANCE.getQueryDefinition_Expressions();

		/**
		 * The meta object literal for the '{@link jess.impl.DeclareVarImpl <em>Declare Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.DeclareVarImpl
		 * @see jess.impl.JessPackageImpl#getDeclareVar()
		 * @generated
		 */
		EClass DECLARE_VAR = eINSTANCE.getDeclareVar();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARE_VAR__VAR = eINSTANCE.getDeclareVar_Var();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARE_VAR__NODE = eINSTANCE.getDeclareVar_Node();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARE_VAR__MAX = eINSTANCE.getDeclareVar_Max();

		/**
		 * The meta object literal for the '{@link jess.impl.TemplateDefinitionImpl <em>Template Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.TemplateDefinitionImpl
		 * @see jess.impl.JessPackageImpl#getTemplateDefinition()
		 * @generated
		 */
		EClass TEMPLATE_DEFINITION = eINSTANCE.getTemplateDefinition();

		/**
		 * The meta object literal for the '<em><b>Template Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_DEFINITION__TEMPLATE_NAME = eINSTANCE.getTemplateDefinition_TemplateName();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_DEFINITION__INHERITS = eINSTANCE.getTemplateDefinition_Inherits();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_DEFINITION__DOCUMENTATION = eINSTANCE.getTemplateDefinition_Documentation();

		/**
		 * The meta object literal for the '<em><b>Declare Bloc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_DEFINITION__DECLARE_BLOC = eINSTANCE.getTemplateDefinition_DeclareBloc();

		/**
		 * The meta object literal for the '<em><b>Slot Def</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_DEFINITION__SLOT_DEF = eINSTANCE.getTemplateDefinition_SlotDef();

		/**
		 * The meta object literal for the '{@link jess.impl.DeclareBlocImpl <em>Declare Bloc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.DeclareBlocImpl
		 * @see jess.impl.JessPackageImpl#getDeclareBloc()
		 * @generated
		 */
		EClass DECLARE_BLOC = eINSTANCE.getDeclareBloc();

		/**
		 * The meta object literal for the '<em><b>Slot Specific</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARE_BLOC__SLOT_SPECIFIC = eINSTANCE.getDeclareBloc_SlotSpecific();

		/**
		 * The meta object literal for the '<em><b>Backchain Reaction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARE_BLOC__BACKCHAIN_REACTION = eINSTANCE.getDeclareBloc_BackchainReaction();

		/**
		 * The meta object literal for the '<em><b>From Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARE_BLOC__FROM_CLASS = eINSTANCE.getDeclareBloc_FromClass();

		/**
		 * The meta object literal for the '<em><b>Include Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARE_BLOC__INCLUDE_VARIABLE = eINSTANCE.getDeclareBloc_IncludeVariable();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARE_BLOC__ORDER = eINSTANCE.getDeclareBloc_Order();

		/**
		 * The meta object literal for the '{@link jess.impl.ASlotDefImpl <em>ASlot Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.ASlotDefImpl
		 * @see jess.impl.JessPackageImpl#getASlotDef()
		 * @generated
		 */
		EClass ASLOT_DEF = eINSTANCE.getASlotDef();

		/**
		 * The meta object literal for the '<em><b>Slot Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASLOT_DEF__SLOT_NAME = eINSTANCE.getASlotDef_SlotName();

		/**
		 * The meta object literal for the '<em><b>Optionals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASLOT_DEF__OPTIONALS = eINSTANCE.getASlotDef_Optionals();

		/**
		 * The meta object literal for the '{@link jess.impl.SlotDefImpl <em>Slot Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.SlotDefImpl
		 * @see jess.impl.JessPackageImpl#getSlotDef()
		 * @generated
		 */
		EClass SLOT_DEF = eINSTANCE.getSlotDef();

		/**
		 * The meta object literal for the '{@link jess.impl.MultiSlotDefImpl <em>Multi Slot Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.MultiSlotDefImpl
		 * @see jess.impl.JessPackageImpl#getMultiSlotDef()
		 * @generated
		 */
		EClass MULTI_SLOT_DEF = eINSTANCE.getMultiSlotDef();

		/**
		 * The meta object literal for the '{@link jess.impl.SlotOptionsImpl <em>Slot Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.SlotOptionsImpl
		 * @see jess.impl.JessPackageImpl#getSlotOptions()
		 * @generated
		 */
		EClass SLOT_OPTIONS = eINSTANCE.getSlotOptions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_OPTIONS__TYPE = eINSTANCE.getSlotOptions_Type();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_OPTIONS__DEF = eINSTANCE.getSlotOptions_Def();

		/**
		 * The meta object literal for the '<em><b>Default Dyn</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_OPTIONS__DEFAULT_DYN = eINSTANCE.getSlotOptions_DefaultDyn();

		/**
		 * The meta object literal for the '<em><b>Allowed Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_OPTIONS__ALLOWED_VALUES = eINSTANCE.getSlotOptions_AllowedValues();

		/**
		 * The meta object literal for the '{@link jess.impl.UseFuncExpImpl <em>Use Func Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.UseFuncExpImpl
		 * @see jess.impl.JessPackageImpl#getUseFuncExp()
		 * @generated
		 */
		EClass USE_FUNC_EXP = eINSTANCE.getUseFuncExp();

		/**
		 * The meta object literal for the '{@link jess.impl.WhileExpImpl <em>While Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.WhileExpImpl
		 * @see jess.impl.JessPackageImpl#getWhileExp()
		 * @generated
		 */
		EClass WHILE_EXP = eINSTANCE.getWhileExp();

		/**
		 * The meta object literal for the '<em><b>Has Do</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHILE_EXP__HAS_DO = eINSTANCE.getWhileExp_HasDo();

		/**
		 * The meta object literal for the '<em><b>Bool Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_EXP__BOOL_EXP = eINSTANCE.getWhileExp_BoolExp();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_EXP__ACTIONS = eINSTANCE.getWhileExp_Actions();

		/**
		 * The meta object literal for the '{@link jess.impl.ForExpImpl <em>For Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.ForExpImpl
		 * @see jess.impl.JessPackageImpl#getForExp()
		 * @generated
		 */
		EClass FOR_EXP = eINSTANCE.getForExp();

		/**
		 * The meta object literal for the '<em><b>Initializer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EXP__INITIALIZER = eINSTANCE.getForExp_Initializer();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EXP__CONDITION = eINSTANCE.getForExp_Condition();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EXP__INCREMENT = eINSTANCE.getForExp_Increment();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EXP__EXPRESSIONS = eINSTANCE.getForExp_Expressions();

		/**
		 * The meta object literal for the '{@link jess.impl.ForeachExpImpl <em>Foreach Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.ForeachExpImpl
		 * @see jess.impl.JessPackageImpl#getForeachExp()
		 * @generated
		 */
		EClass FOREACH_EXP = eINSTANCE.getForeachExp();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREACH_EXP__VAR = eINSTANCE.getForeachExp_Var();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREACH_EXP__LIST = eINSTANCE.getForeachExp_List();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREACH_EXP__EXPRESSIONS = eINSTANCE.getForeachExp_Expressions();

		/**
		 * The meta object literal for the '{@link jess.impl.FuncCallImpl <em>Func Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.FuncCallImpl
		 * @see jess.impl.JessPackageImpl#getFuncCall()
		 * @generated
		 */
		EClass FUNC_CALL = eINSTANCE.getFuncCall();

		/**
		 * The meta object literal for the '<em><b>Func Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNC_CALL__FUNC_NAME = eINSTANCE.getFuncCall_FuncName();

		/**
		 * The meta object literal for the '<em><b>Func Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNC_CALL__FUNC_PARAM = eINSTANCE.getFuncCall_FuncParam();

		/**
		 * The meta object literal for the '{@link jess.impl.EngineExpImpl <em>Engine Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.EngineExpImpl
		 * @see jess.impl.JessPackageImpl#getEngineExp()
		 * @generated
		 */
		EClass ENGINE_EXP = eINSTANCE.getEngineExp();

		/**
		 * The meta object literal for the '{@link jess.impl.ExitExpImpl <em>Exit Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.ExitExpImpl
		 * @see jess.impl.JessPackageImpl#getExitExp()
		 * @generated
		 */
		EClass EXIT_EXP = eINSTANCE.getExitExp();

		/**
		 * The meta object literal for the '{@link jess.impl.IfExpressionImpl <em>If Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.IfExpressionImpl
		 * @see jess.impl.JessPackageImpl#getIfExpression()
		 * @generated
		 */
		EClass IF_EXPRESSION = eINSTANCE.getIfExpression();

		/**
		 * The meta object literal for the '<em><b>Ifthen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__IFTHEN = eINSTANCE.getIfExpression_Ifthen();

		/**
		 * The meta object literal for the '<em><b>Elifthen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__ELIFTHEN = eINSTANCE.getIfExpression_Elifthen();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__ELSE = eINSTANCE.getIfExpression_Else();

		/**
		 * The meta object literal for the '{@link jess.impl.ConditionActionImpl <em>Condition Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.ConditionActionImpl
		 * @see jess.impl.JessPackageImpl#getConditionAction()
		 * @generated
		 */
		EClass CONDITION_ACTION = eINSTANCE.getConditionAction();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ACTION__CONDITION = eINSTANCE.getConditionAction_Condition();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ACTION__ACTIONS = eINSTANCE.getConditionAction_Actions();

		/**
		 * The meta object literal for the '{@link jess.impl.ElifConditionActionImpl <em>Elif Condition Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.impl.ElifConditionActionImpl
		 * @see jess.impl.JessPackageImpl#getElifConditionAction()
		 * @generated
		 */
		EClass ELIF_CONDITION_ACTION = eINSTANCE.getElifConditionAction();

		/**
		 * The meta object literal for the '<em><b>Cond Act</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELIF_CONDITION_ACTION__COND_ACT = eINSTANCE.getElifConditionAction_CondAct();

		/**
		 * The meta object literal for the '{@link jess.Advice <em>Advice</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jess.Advice
		 * @see jess.impl.JessPackageImpl#getAdvice()
		 * @generated
		 */
		EEnum ADVICE = eINSTANCE.getAdvice();

	}

} //JessPackage
