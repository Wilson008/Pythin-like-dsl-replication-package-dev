/**
 */
package demodsl.impl;

import demodsl.DemodslPackage;
import demodsl.HardwareComponent;
import demodsl.Root;
import demodsl.SoftwareComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link demodsl.impl.RootImpl#getHardwarecomponent <em>Hardwarecomponent</em>}</li>
 *   <li>{@link demodsl.impl.RootImpl#getSoftwarecomponent <em>Softwarecomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The cached value of the '{@link #getHardwarecomponent() <em>Hardwarecomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwarecomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareComponent> hardwarecomponent;

	/**
	 * The cached value of the '{@link #getSoftwarecomponent() <em>Softwarecomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwarecomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareComponent> softwarecomponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemodslPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareComponent> getSoftwarecomponent() {
		if (softwarecomponent == null) {
			softwarecomponent = new EObjectContainmentEList<SoftwareComponent>(SoftwareComponent.class, this, DemodslPackage.ROOT__SOFTWARECOMPONENT);
		}
		return softwarecomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareComponent> getHardwarecomponent() {
		if (hardwarecomponent == null) {
			hardwarecomponent = new EObjectContainmentEList<HardwareComponent>(HardwareComponent.class, this, DemodslPackage.ROOT__HARDWARECOMPONENT);
		}
		return hardwarecomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DemodslPackage.ROOT__HARDWARECOMPONENT:
				return ((InternalEList<?>)getHardwarecomponent()).basicRemove(otherEnd, msgs);
			case DemodslPackage.ROOT__SOFTWARECOMPONENT:
				return ((InternalEList<?>)getSoftwarecomponent()).basicRemove(otherEnd, msgs);
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
			case DemodslPackage.ROOT__HARDWARECOMPONENT:
				return getHardwarecomponent();
			case DemodslPackage.ROOT__SOFTWARECOMPONENT:
				return getSoftwarecomponent();
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
			case DemodslPackage.ROOT__HARDWARECOMPONENT:
				getHardwarecomponent().clear();
				getHardwarecomponent().addAll((Collection<? extends HardwareComponent>)newValue);
				return;
			case DemodslPackage.ROOT__SOFTWARECOMPONENT:
				getSoftwarecomponent().clear();
				getSoftwarecomponent().addAll((Collection<? extends SoftwareComponent>)newValue);
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
			case DemodslPackage.ROOT__HARDWARECOMPONENT:
				getHardwarecomponent().clear();
				return;
			case DemodslPackage.ROOT__SOFTWARECOMPONENT:
				getSoftwarecomponent().clear();
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
			case DemodslPackage.ROOT__HARDWARECOMPONENT:
				return hardwarecomponent != null && !hardwarecomponent.isEmpty();
			case DemodslPackage.ROOT__SOFTWARECOMPONENT:
				return softwarecomponent != null && !softwarecomponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
