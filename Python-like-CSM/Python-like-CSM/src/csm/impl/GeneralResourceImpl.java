/**
 */
package csm.impl;

import csm.CsmPackage;
import csm.GeneralResource;
import csm.ResourceAcquire;
import csm.ResourceRelease;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link csm.impl.GeneralResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link csm.impl.GeneralResourceImpl#getResourceAcquire <em>Resource Acquire</em>}</li>
 *   <li>{@link csm.impl.GeneralResourceImpl#getResourceRelease <em>Resource Release</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneralResourceImpl extends MinimalEObjectImpl.Container implements GeneralResource {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResourceAcquire() <em>Resource Acquire</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAcquire()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceAcquire> resourceAcquire;

	/**
	 * The cached value of the '{@link #getResourceRelease() <em>Resource Release</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRelease()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceRelease> resourceRelease;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsmPackage.Literals.GENERAL_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsmPackage.GENERAL_RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceAcquire> getResourceAcquire() {
		if (resourceAcquire == null) {
			resourceAcquire = new EObjectWithInverseResolvingEList<ResourceAcquire>(ResourceAcquire.class, this, CsmPackage.GENERAL_RESOURCE__RESOURCE_ACQUIRE, CsmPackage.RESOURCE_ACQUIRE__GENERAL_RESOURCE);
		}
		return resourceAcquire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceRelease> getResourceRelease() {
		if (resourceRelease == null) {
			resourceRelease = new EObjectWithInverseResolvingEList<ResourceRelease>(ResourceRelease.class, this, CsmPackage.GENERAL_RESOURCE__RESOURCE_RELEASE, CsmPackage.RESOURCE_RELEASE__GENERAL_RESOURCE);
		}
		return resourceRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsmPackage.GENERAL_RESOURCE__RESOURCE_ACQUIRE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceAcquire()).basicAdd(otherEnd, msgs);
			case CsmPackage.GENERAL_RESOURCE__RESOURCE_RELEASE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceRelease()).basicAdd(otherEnd, msgs);
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
			case CsmPackage.GENERAL_RESOURCE__RESOURCE_ACQUIRE:
				return ((InternalEList<?>)getResourceAcquire()).basicRemove(otherEnd, msgs);
			case CsmPackage.GENERAL_RESOURCE__RESOURCE_RELEASE:
				return ((InternalEList<?>)getResourceRelease()).basicRemove(otherEnd, msgs);
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
			case CsmPackage.GENERAL_RESOURCE__NAME:
				return getName();
			case CsmPackage.GENERAL_RESOURCE__RESOURCE_ACQUIRE:
				return getResourceAcquire();
			case CsmPackage.GENERAL_RESOURCE__RESOURCE_RELEASE:
				return getResourceRelease();
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
			case CsmPackage.GENERAL_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case CsmPackage.GENERAL_RESOURCE__RESOURCE_ACQUIRE:
				getResourceAcquire().clear();
				getResourceAcquire().addAll((Collection<? extends ResourceAcquire>)newValue);
				return;
			case CsmPackage.GENERAL_RESOURCE__RESOURCE_RELEASE:
				getResourceRelease().clear();
				getResourceRelease().addAll((Collection<? extends ResourceRelease>)newValue);
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
			case CsmPackage.GENERAL_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CsmPackage.GENERAL_RESOURCE__RESOURCE_ACQUIRE:
				getResourceAcquire().clear();
				return;
			case CsmPackage.GENERAL_RESOURCE__RESOURCE_RELEASE:
				getResourceRelease().clear();
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
			case CsmPackage.GENERAL_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CsmPackage.GENERAL_RESOURCE__RESOURCE_ACQUIRE:
				return resourceAcquire != null && !resourceAcquire.isEmpty();
			case CsmPackage.GENERAL_RESOURCE__RESOURCE_RELEASE:
				return resourceRelease != null && !resourceRelease.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GeneralResourceImpl
