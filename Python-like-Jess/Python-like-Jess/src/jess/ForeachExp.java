/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreach Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.ForeachExp#getVar <em>Var</em>}</li>
 *   <li>{@link jess.ForeachExp#getList <em>List</em>}</li>
 *   <li>{@link jess.ForeachExp#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getForeachExp()
 * @model
 * @generated
 */
public interface ForeachExp extends UseFuncExp {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' containment reference.
	 * @see #setVar(JessVariable)
	 * @see jess.JessPackage#getForeachExp_Var()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	JessVariable getVar();

	/**
	 * Sets the value of the '{@link jess.ForeachExp#getVar <em>Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' containment reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(JessVariable value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(Expression)
	 * @see jess.JessPackage#getForeachExp_List()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getList();

	/**
	 * Sets the value of the '{@link jess.ForeachExp#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(Expression value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link jess.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see jess.JessPackage#getForeachExp_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // ForeachExp
