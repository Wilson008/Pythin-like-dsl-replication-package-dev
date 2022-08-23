/**
 */
package demodsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link demodsl.FunctionPort#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see demodsl.DemodslPackage#getFunctionPort()
 * @model
 * @generated
 */
public interface FunctionPort extends Port {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link demodsl.PortDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see demodsl.PortDirection
	 * @see #setDirection(PortDirection)
	 * @see demodsl.DemodslPackage#getFunctionPort_Direction()
	 * @model
	 * @generated
	 */
	PortDirection getDirection();

	/**
	 * Sets the value of the '{@link demodsl.FunctionPort#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see demodsl.PortDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(PortDirection value);

} // FunctionPort
