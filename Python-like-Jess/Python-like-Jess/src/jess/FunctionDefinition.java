/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.FunctionDefinition#getFuncName <em>Func Name</em>}</li>
 *   <li>{@link jess.FunctionDefinition#getParameters <em>Parameters</em>}</li>
 *   <li>{@link jess.FunctionDefinition#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getFunctionDefinition()
 * @model
 * @generated
 */
public interface FunctionDefinition extends DefinitionExp {
	/**
	 * Returns the value of the '<em><b>Func Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func Name</em>' containment reference.
	 * @see #setFuncName(ValidIdentifier)
	 * @see jess.JessPackage#getFunctionDefinition_FuncName()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getFuncName();

	/**
	 * Sets the value of the '{@link jess.FunctionDefinition#getFuncName <em>Func Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Func Name</em>' containment reference.
	 * @see #getFuncName()
	 * @generated
	 */
	void setFuncName(ValidIdentifier value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link jess.JessVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see jess.JessPackage#getFunctionDefinition_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<JessVariable> getParameters();

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link jess.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see jess.JessPackage#getFunctionDefinition_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // FunctionDefinition
