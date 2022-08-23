/**
 */
package demodsl.impl;

import demodsl.DemodslPackage;
import demodsl.GroupConnector;
import demodsl.PortGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link demodsl.impl.GroupConnectorImpl#getPortgroup <em>Portgroup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupConnectorImpl extends ConnectorImpl implements GroupConnector {
	/**
	 * The cached value of the '{@link #getPortgroup() <em>Portgroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortgroup()
	 * @generated
	 * @ordered
	 */
	protected EList<PortGroup> portgroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemodslPackage.Literals.GROUP_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortGroup> getPortgroup() {
		if (portgroup == null) {
			portgroup = new EObjectContainmentEList<PortGroup>(PortGroup.class, this, DemodslPackage.GROUP_CONNECTOR__PORTGROUP);
		}
		return portgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DemodslPackage.GROUP_CONNECTOR__PORTGROUP:
				return ((InternalEList<?>)getPortgroup()).basicRemove(otherEnd, msgs);
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
			case DemodslPackage.GROUP_CONNECTOR__PORTGROUP:
				return getPortgroup();
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
			case DemodslPackage.GROUP_CONNECTOR__PORTGROUP:
				getPortgroup().clear();
				getPortgroup().addAll((Collection<? extends PortGroup>)newValue);
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
			case DemodslPackage.GROUP_CONNECTOR__PORTGROUP:
				getPortgroup().clear();
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
			case DemodslPackage.GROUP_CONNECTOR__PORTGROUP:
				return portgroup != null && !portgroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupConnectorImpl
