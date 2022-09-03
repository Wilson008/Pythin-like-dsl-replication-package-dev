/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.TemplateDefinition#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link jess.TemplateDefinition#getInherits <em>Inherits</em>}</li>
 *   <li>{@link jess.TemplateDefinition#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link jess.TemplateDefinition#getDeclareBloc <em>Declare Bloc</em>}</li>
 *   <li>{@link jess.TemplateDefinition#getSlotDef <em>Slot Def</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getTemplateDefinition()
 * @model
 * @generated
 */
public interface TemplateDefinition extends DefinitionExp {
	/**
	 * Returns the value of the '<em><b>Template Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Name</em>' containment reference.
	 * @see #setTemplateName(ValidIdentifier)
	 * @see jess.JessPackage#getTemplateDefinition_TemplateName()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getTemplateName();

	/**
	 * Sets the value of the '{@link jess.TemplateDefinition#getTemplateName <em>Template Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Name</em>' containment reference.
	 * @see #getTemplateName()
	 * @generated
	 */
	void setTemplateName(ValidIdentifier value);

	/**
	 * Returns the value of the '<em><b>Inherits</b></em>' containment reference list.
	 * The list contents are of type {@link jess.ValidIdentifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherits</em>' containment reference list.
	 * @see jess.JessPackage#getTemplateDefinition_Inherits()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValidIdentifier> getInherits();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Str)
	 * @see jess.JessPackage#getTemplateDefinition_Documentation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Str getDocumentation();

	/**
	 * Sets the value of the '{@link jess.TemplateDefinition#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Str value);

	/**
	 * Returns the value of the '<em><b>Declare Bloc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declare Bloc</em>' containment reference.
	 * @see #setDeclareBloc(DeclareBloc)
	 * @see jess.JessPackage#getTemplateDefinition_DeclareBloc()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DeclareBloc getDeclareBloc();

	/**
	 * Sets the value of the '{@link jess.TemplateDefinition#getDeclareBloc <em>Declare Bloc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declare Bloc</em>' containment reference.
	 * @see #getDeclareBloc()
	 * @generated
	 */
	void setDeclareBloc(DeclareBloc value);

	/**
	 * Returns the value of the '<em><b>Slot Def</b></em>' containment reference list.
	 * The list contents are of type {@link jess.ASlotDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Def</em>' containment reference list.
	 * @see jess.JessPackage#getTemplateDefinition_SlotDef()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ASlotDef> getSlotDef();

} // TemplateDefinition
