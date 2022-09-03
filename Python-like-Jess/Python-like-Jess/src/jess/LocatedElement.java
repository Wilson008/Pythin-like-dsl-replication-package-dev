/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Located Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.LocatedElement#getLocation <em>Location</em>}</li>
 *   <li>{@link jess.LocatedElement#getCommentsBefore <em>Comments Before</em>}</li>
 *   <li>{@link jess.LocatedElement#getCommentsAfter <em>Comments After</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getLocatedElement()
 * @model abstract="true"
 * @generated
 */
public interface LocatedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(Object)
	 * @see jess.JessPackage#getLocatedElement_Location()
	 * @model unique="false" dataType="primitivetypes.String" ordered="false"
	 * @generated
	 */
	Object getLocation();

	/**
	 * Sets the value of the '{@link jess.LocatedElement#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Object value);

	/**
	 * Returns the value of the '<em><b>Comments Before</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments Before</em>' attribute list.
	 * @see jess.JessPackage#getLocatedElement_CommentsBefore()
	 * @model unique="false" dataType="primitivetypes.String"
	 * @generated
	 */
	EList<Object> getCommentsBefore();

	/**
	 * Returns the value of the '<em><b>Comments After</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments After</em>' attribute list.
	 * @see jess.JessPackage#getLocatedElement_CommentsAfter()
	 * @model unique="false" dataType="primitivetypes.String"
	 * @generated
	 */
	EList<Object> getCommentsAfter();

} // LocatedElement
