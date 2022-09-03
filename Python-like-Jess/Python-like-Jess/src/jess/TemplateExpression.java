/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.TemplateExpression#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link jess.TemplateExpression#getFirstSlot <em>First Slot</em>}</li>
 *   <li>{@link jess.TemplateExpression#getSlotOp <em>Slot Op</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getTemplateExpression()
 * @model
 * @generated
 */
public interface TemplateExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Template Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Name</em>' containment reference.
	 * @see #setTemplateName(ValidIdentifier)
	 * @see jess.JessPackage#getTemplateExpression_TemplateName()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getTemplateName();

	/**
	 * Sets the value of the '{@link jess.TemplateExpression#getTemplateName <em>Template Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Name</em>' containment reference.
	 * @see #getTemplateName()
	 * @generated
	 */
	void setTemplateName(ValidIdentifier value);

	/**
	 * Returns the value of the '<em><b>First Slot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Slot</em>' containment reference.
	 * @see #setFirstSlot(SlotOp)
	 * @see jess.JessPackage#getTemplateExpression_FirstSlot()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	SlotOp getFirstSlot();

	/**
	 * Sets the value of the '{@link jess.TemplateExpression#getFirstSlot <em>First Slot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Slot</em>' containment reference.
	 * @see #getFirstSlot()
	 * @generated
	 */
	void setFirstSlot(SlotOp value);

	/**
	 * Returns the value of the '<em><b>Slot Op</b></em>' containment reference list.
	 * The list contents are of type {@link jess.SlotOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Op</em>' containment reference list.
	 * @see jess.JessPackage#getTemplateExpression_SlotOp()
	 * @model containment="true"
	 * @generated
	 */
	EList<SlotOp> getSlotOp();

} // TemplateExpression
