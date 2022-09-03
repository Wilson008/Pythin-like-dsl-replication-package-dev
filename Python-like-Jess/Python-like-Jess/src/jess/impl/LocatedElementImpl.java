/**
 */
package jess.impl;

import java.util.Collection;

import jess.JessPackage;
import jess.LocatedElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Located Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.LocatedElementImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link jess.impl.LocatedElementImpl#getCommentsBefore <em>Comments Before</em>}</li>
 *   <li>{@link jess.impl.LocatedElementImpl#getCommentsAfter <em>Comments After</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LocatedElementImpl extends MinimalEObjectImpl.Container implements LocatedElement {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Object location;

	/**
	 * The cached value of the '{@link #getCommentsBefore() <em>Comments Before</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsBefore()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> commentsBefore;

	/**
	 * The cached value of the '{@link #getCommentsAfter() <em>Comments After</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsAfter()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> commentsAfter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocatedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.LOCATED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Object newLocation) {
		Object oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.LOCATED_ELEMENT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getCommentsBefore() {
		if (commentsBefore == null) {
			commentsBefore = new EDataTypeEList<Object>(Object.class, this, JessPackage.LOCATED_ELEMENT__COMMENTS_BEFORE);
		}
		return commentsBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getCommentsAfter() {
		if (commentsAfter == null) {
			commentsAfter = new EDataTypeEList<Object>(Object.class, this, JessPackage.LOCATED_ELEMENT__COMMENTS_AFTER);
		}
		return commentsAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JessPackage.LOCATED_ELEMENT__LOCATION:
				return getLocation();
			case JessPackage.LOCATED_ELEMENT__COMMENTS_BEFORE:
				return getCommentsBefore();
			case JessPackage.LOCATED_ELEMENT__COMMENTS_AFTER:
				return getCommentsAfter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JessPackage.LOCATED_ELEMENT__LOCATION:
				setLocation(newValue);
				return;
			case JessPackage.LOCATED_ELEMENT__COMMENTS_BEFORE:
				getCommentsBefore().clear();
				getCommentsBefore().addAll((Collection<? extends Object>)newValue);
				return;
			case JessPackage.LOCATED_ELEMENT__COMMENTS_AFTER:
				getCommentsAfter().clear();
				getCommentsAfter().addAll((Collection<? extends Object>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JessPackage.LOCATED_ELEMENT__LOCATION:
				setLocation((Object)null);
				return;
			case JessPackage.LOCATED_ELEMENT__COMMENTS_BEFORE:
				getCommentsBefore().clear();
				return;
			case JessPackage.LOCATED_ELEMENT__COMMENTS_AFTER:
				getCommentsAfter().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JessPackage.LOCATED_ELEMENT__LOCATION:
				return location != null;
			case JessPackage.LOCATED_ELEMENT__COMMENTS_BEFORE:
				return commentsBefore != null && !commentsBefore.isEmpty();
			case JessPackage.LOCATED_ELEMENT__COMMENTS_AFTER:
				return commentsAfter != null && !commentsAfter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (location: ");
		result.append(location);
		result.append(", commentsBefore: ");
		result.append(commentsBefore);
		result.append(", commentsAfter: ");
		result.append(commentsAfter);
		result.append(')');
		return result.toString();
	}

} //LocatedElementImpl
