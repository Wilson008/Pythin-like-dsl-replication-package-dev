/**
 */
package jess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.Floa#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getFloa()
 * @model
 * @generated
 */
public interface Floa extends Expression {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(Object)
	 * @see jess.JessPackage#getFloa_Val()
	 * @model unique="false" dataType="primitivetypes.Double" required="true" ordered="false"
	 * @generated
	 */
	Object getVal();

	/**
	 * Sets the value of the '{@link jess.Floa#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(Object value);

} // Floa
