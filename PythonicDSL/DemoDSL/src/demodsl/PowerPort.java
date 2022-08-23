/**
 */
package demodsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link demodsl.PowerPort#getInputVoltage <em>Input Voltage</em>}</li>
 * </ul>
 *
 * @see demodsl.DemodslPackage#getPowerPort()
 * @model
 * @generated
 */
public interface PowerPort extends Port {
	/**
	 * Returns the value of the '<em><b>Input Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Voltage</em>' attribute.
	 * @see #setInputVoltage(int)
	 * @see demodsl.DemodslPackage#getPowerPort_InputVoltage()
	 * @model
	 * @generated
	 */
	int getInputVoltage();

	/**
	 * Sets the value of the '{@link demodsl.PowerPort#getInputVoltage <em>Input Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Voltage</em>' attribute.
	 * @see #getInputVoltage()
	 * @generated
	 */
	void setInputVoltage(int value);

} // PowerPort
