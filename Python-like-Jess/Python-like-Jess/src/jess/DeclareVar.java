/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declare Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.DeclareVar#getVar <em>Var</em>}</li>
 *   <li>{@link jess.DeclareVar#getNode <em>Node</em>}</li>
 *   <li>{@link jess.DeclareVar#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getDeclareVar()
 * @model
 * @generated
 */
public interface DeclareVar extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference list.
	 * The list contents are of type {@link jess.JessVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' containment reference list.
	 * @see jess.JessPackage#getDeclareVar_Var()
	 * @model containment="true"
	 * @generated
	 */
	EList<JessVariable> getVar();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference.
	 * @see #setNode(Expression)
	 * @see jess.JessPackage#getDeclareVar_Node()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getNode();

	/**
	 * Sets the value of the '{@link jess.DeclareVar#getNode <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' containment reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Expression value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(Expression)
	 * @see jess.JessPackage#getDeclareVar_Max()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getMax();

	/**
	 * Sets the value of the '{@link jess.DeclareVar#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Expression value);

} // DeclareVar
