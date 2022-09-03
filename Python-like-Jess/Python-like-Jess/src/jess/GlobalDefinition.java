/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.GlobalDefinition#getVarDef <em>Var Def</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getGlobalDefinition()
 * @model
 * @generated
 */
public interface GlobalDefinition extends DefinitionExp {
	/**
	 * Returns the value of the '<em><b>Var Def</b></em>' containment reference list.
	 * The list contents are of type {@link jess.VarDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Def</em>' containment reference list.
	 * @see jess.JessPackage#getGlobalDefinition_VarDef()
	 * @model containment="true"
	 * @generated
	 */
	EList<VarDefinition> getVarDef();

} // GlobalDefinition
