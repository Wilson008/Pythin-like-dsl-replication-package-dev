/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advice Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.AdviceDefinition#getDirection <em>Direction</em>}</li>
 *   <li>{@link jess.AdviceDefinition#getOp <em>Op</em>}</li>
 *   <li>{@link jess.AdviceDefinition#getAdvice <em>Advice</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getAdviceDefinition()
 * @model
 * @generated
 */
public interface AdviceDefinition extends DefinitionExp {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link jess.Advice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see jess.Advice
	 * @see #setDirection(Advice)
	 * @see jess.JessPackage#getAdviceDefinition_Direction()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Advice getDirection();

	/**
	 * Sets the value of the '{@link jess.AdviceDefinition#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see jess.Advice
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Advice value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(Ident)
	 * @see jess.JessPackage#getAdviceDefinition_Op()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Ident getOp();

	/**
	 * Sets the value of the '{@link jess.AdviceDefinition#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Ident value);

	/**
	 * Returns the value of the '<em><b>Advice</b></em>' containment reference list.
	 * The list contents are of type {@link jess.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advice</em>' containment reference list.
	 * @see jess.JessPackage#getAdviceDefinition_Advice()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getAdvice();

} // AdviceDefinition
