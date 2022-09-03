/**
 */
package csm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenarion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link csm.Scenarion#getStep <em>Step</em>}</li>
 *   <li>{@link csm.Scenarion#getRoot <em>Root</em>}</li>
 *   <li>{@link csm.Scenarion#getPathconnection <em>Pathconnection</em>}</li>
 * </ul>
 *
 * @see csm.CsmPackage#getScenarion()
 * @model
 * @generated
 */
public interface Scenarion extends EObject {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link csm.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see csm.CsmPackage#getScenarion_Step()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Step> getStep();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference list.
	 * The list contents are of type {@link csm.Start}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference list.
	 * @see csm.CsmPackage#getScenarion_Root()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Start> getRoot();

	/**
	 * Returns the value of the '<em><b>Pathconnection</b></em>' containment reference list.
	 * The list contents are of type {@link csm.PathConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathconnection</em>' containment reference list.
	 * @see csm.CsmPackage#getScenarion_Pathconnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathConnection> getPathconnection();

} // Scenarion
