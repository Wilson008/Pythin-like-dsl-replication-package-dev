/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Func Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.FuncCall#getFuncName <em>Func Name</em>}</li>
 *   <li>{@link jess.FuncCall#getFuncParam <em>Func Param</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getFuncCall()
 * @model
 * @generated
 */
public interface FuncCall extends UseFuncExp {
	/**
	 * Returns the value of the '<em><b>Func Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func Name</em>' containment reference.
	 * @see #setFuncName(ValidIdentifier)
	 * @see jess.JessPackage#getFuncCall_FuncName()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getFuncName();

	/**
	 * Sets the value of the '{@link jess.FuncCall#getFuncName <em>Func Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Func Name</em>' containment reference.
	 * @see #getFuncName()
	 * @generated
	 */
	void setFuncName(ValidIdentifier value);

	/**
	 * Returns the value of the '<em><b>Func Param</b></em>' containment reference list.
	 * The list contents are of type {@link jess.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func Param</em>' containment reference list.
	 * @see jess.JessPackage#getFuncCall_FuncParam()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getFuncParam();

} // FuncCall
