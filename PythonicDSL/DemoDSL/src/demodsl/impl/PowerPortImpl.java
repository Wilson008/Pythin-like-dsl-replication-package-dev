/**
 */
package demodsl.impl;

import demodsl.DemodslPackage;
import demodsl.PowerPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link demodsl.impl.PowerPortImpl#getInputVoltage <em>Input Voltage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerPortImpl extends PortImpl implements PowerPort {
	/**
	 * The default value of the '{@link #getInputVoltage() <em>Input Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final int INPUT_VOLTAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInputVoltage() <em>Input Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVoltage()
	 * @generated
	 * @ordered
	 */
	protected int inputVoltage = INPUT_VOLTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemodslPackage.Literals.POWER_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInputVoltage() {
		return inputVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputVoltage(int newInputVoltage) {
		int oldInputVoltage = inputVoltage;
		inputVoltage = newInputVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemodslPackage.POWER_PORT__INPUT_VOLTAGE, oldInputVoltage, inputVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DemodslPackage.POWER_PORT__INPUT_VOLTAGE:
				return getInputVoltage();
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
			case DemodslPackage.POWER_PORT__INPUT_VOLTAGE:
				setInputVoltage((Integer)newValue);
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
			case DemodslPackage.POWER_PORT__INPUT_VOLTAGE:
				setInputVoltage(INPUT_VOLTAGE_EDEFAULT);
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
			case DemodslPackage.POWER_PORT__INPUT_VOLTAGE:
				return inputVoltage != INPUT_VOLTAGE_EDEFAULT;
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
		result.append(" (inputVoltage: ");
		result.append(inputVoltage);
		result.append(')');
		return result.toString();
	}

} //PowerPortImpl
