/**
 */
package csm.impl;

import csm.CsmPackage;
import csm.GeneralResource;
import csm.ResourceAcquire;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Acquire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link csm.impl.ResourceAcquireImpl#getGeneralResource <em>General Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceAcquireImpl extends StepImpl implements ResourceAcquire {
	/**
	 * The cached value of the '{@link #getGeneralResource() <em>General Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralResource()
	 * @generated
	 * @ordered
	 */
	protected GeneralResource generalResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceAcquireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsmPackage.Literals.RESOURCE_ACQUIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralResource getGeneralResource() {
		if (generalResource != null && generalResource.eIsProxy()) {
			InternalEObject oldGeneralResource = (InternalEObject)generalResource;
			generalResource = (GeneralResource)eResolveProxy(oldGeneralResource);
			if (generalResource != oldGeneralResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsmPackage.RESOURCE_ACQUIRE__GENERAL_RESOURCE, oldGeneralResource, generalResource));
			}
		}
		return generalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralResource basicGetGeneralResource() {
		return generalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralResource(GeneralResource newGeneralResource, NotificationChain msgs) {
		GeneralResource oldGeneralResource = generalResource;
		generalResource = newGeneralResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsmPackage.RESOURCE_ACQUIRE__GENERAL_RESOURCE, oldGeneralResource, newGeneralResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralResource(GeneralResource newGeneralResource) {
		if (newGeneralResource != generalResource) {
			NotificationChain msgs = null;
			if (generalResource != null)
				msgs = ((InternalEObject)generalResource).eInverseRemove(this, CsmPackage.GENERAL_RESOURCE__RESOURCE_ACQUIRE, GeneralResource.class, msgs);
			if (newGeneralResource != null)
				msgs = ((InternalEObject)newGeneralResource).eInverseAdd(this, CsmPackage.GENERAL_RESOURCE__RESOURCE_ACQUIRE, GeneralResource.class, msgs);
			msgs = basicSetGeneralResource(newGeneralResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsmPackage.RESOURCE_ACQUIRE__GENERAL_RESOURCE, newGeneralResource, newGeneralResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsmPackage.RESOURCE_ACQUIRE__GENERAL_RESOURCE:
				if (generalResource != null)
					msgs = ((InternalEObject)generalResource).eInverseRemove(this, CsmPackage.GENERAL_RESOURCE__RESOURCE_ACQUIRE, GeneralResource.class, msgs);
				return basicSetGeneralResource((GeneralResource)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsmPackage.RESOURCE_ACQUIRE__GENERAL_RESOURCE:
				return basicSetGeneralResource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsmPackage.RESOURCE_ACQUIRE__GENERAL_RESOURCE:
				if (resolve) return getGeneralResource();
				return basicGetGeneralResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CsmPackage.RESOURCE_ACQUIRE__GENERAL_RESOURCE:
				setGeneralResource((GeneralResource)newValue);
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
			case CsmPackage.RESOURCE_ACQUIRE__GENERAL_RESOURCE:
				setGeneralResource((GeneralResource)null);
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
			case CsmPackage.RESOURCE_ACQUIRE__GENERAL_RESOURCE:
				return generalResource != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceAcquireImpl
