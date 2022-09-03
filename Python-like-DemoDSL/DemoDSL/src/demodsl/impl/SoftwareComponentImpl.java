/**
 */
package demodsl.impl;

import demodsl.Connector;
import demodsl.DemodslPackage;
import demodsl.Node;
import demodsl.Port;
import demodsl.PortGroup;
import demodsl.SoftwareComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link demodsl.impl.SoftwareComponentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link demodsl.impl.SoftwareComponentImpl#getUUID <em>UUID</em>}</li>
 *   <li>{@link demodsl.impl.SoftwareComponentImpl#getPort <em>Port</em>}</li>
 *   <li>{@link demodsl.impl.SoftwareComponentImpl#getAllocatedTo <em>Allocated To</em>}</li>
 *   <li>{@link demodsl.impl.SoftwareComponentImpl#getPortgroup <em>Portgroup</em>}</li>
 *   <li>{@link demodsl.impl.SoftwareComponentImpl#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareComponentImpl extends MinimalEObjectImpl.Container implements SoftwareComponent {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUUID() <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUUID() <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * The cached value of the '{@link #getAllocatedTo() <em>Allocated To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedTo()
	 * @generated
	 * @ordered
	 */
	protected Node allocatedTo;

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
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemodslPackage.Literals.SOFTWARE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemodslPackage.SOFTWARE_COMPONENT__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUUID() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUUID(String newUUID) {
		String oldUUID = uuid;
		uuid = newUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemodslPackage.SOFTWARE_COMPONENT__UUID, oldUUID, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<Port>(Port.class, this, DemodslPackage.SOFTWARE_COMPONENT__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getAllocatedTo() {
		if (allocatedTo != null && allocatedTo.eIsProxy()) {
			InternalEObject oldAllocatedTo = (InternalEObject)allocatedTo;
			allocatedTo = (Node)eResolveProxy(oldAllocatedTo);
			if (allocatedTo != oldAllocatedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemodslPackage.SOFTWARE_COMPONENT__ALLOCATED_TO, oldAllocatedTo, allocatedTo));
			}
		}
		return allocatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetAllocatedTo() {
		return allocatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocatedTo(Node newAllocatedTo) {
		Node oldAllocatedTo = allocatedTo;
		allocatedTo = newAllocatedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemodslPackage.SOFTWARE_COMPONENT__ALLOCATED_TO, oldAllocatedTo, allocatedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortGroup> getPortgroup() {
		if (portgroup == null) {
			portgroup = new EObjectContainmentEList<PortGroup>(PortGroup.class, this, DemodslPackage.SOFTWARE_COMPONENT__PORTGROUP);
		}
		return portgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnector() {
		if (connector == null) {
			connector = new EObjectContainmentEList<Connector>(Connector.class, this, DemodslPackage.SOFTWARE_COMPONENT__CONNECTOR);
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DemodslPackage.SOFTWARE_COMPONENT__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case DemodslPackage.SOFTWARE_COMPONENT__PORTGROUP:
				return ((InternalEList<?>)getPortgroup()).basicRemove(otherEnd, msgs);
			case DemodslPackage.SOFTWARE_COMPONENT__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
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
			case DemodslPackage.SOFTWARE_COMPONENT__IDENTIFIER:
				return getIdentifier();
			case DemodslPackage.SOFTWARE_COMPONENT__UUID:
				return getUUID();
			case DemodslPackage.SOFTWARE_COMPONENT__PORT:
				return getPort();
			case DemodslPackage.SOFTWARE_COMPONENT__ALLOCATED_TO:
				if (resolve) return getAllocatedTo();
				return basicGetAllocatedTo();
			case DemodslPackage.SOFTWARE_COMPONENT__PORTGROUP:
				return getPortgroup();
			case DemodslPackage.SOFTWARE_COMPONENT__CONNECTOR:
				return getConnector();
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
			case DemodslPackage.SOFTWARE_COMPONENT__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case DemodslPackage.SOFTWARE_COMPONENT__UUID:
				setUUID((String)newValue);
				return;
			case DemodslPackage.SOFTWARE_COMPONENT__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Port>)newValue);
				return;
			case DemodslPackage.SOFTWARE_COMPONENT__ALLOCATED_TO:
				setAllocatedTo((Node)newValue);
				return;
			case DemodslPackage.SOFTWARE_COMPONENT__PORTGROUP:
				getPortgroup().clear();
				getPortgroup().addAll((Collection<? extends PortGroup>)newValue);
				return;
			case DemodslPackage.SOFTWARE_COMPONENT__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends Connector>)newValue);
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
			case DemodslPackage.SOFTWARE_COMPONENT__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case DemodslPackage.SOFTWARE_COMPONENT__UUID:
				setUUID(UUID_EDEFAULT);
				return;
			case DemodslPackage.SOFTWARE_COMPONENT__PORT:
				getPort().clear();
				return;
			case DemodslPackage.SOFTWARE_COMPONENT__ALLOCATED_TO:
				setAllocatedTo((Node)null);
				return;
			case DemodslPackage.SOFTWARE_COMPONENT__PORTGROUP:
				getPortgroup().clear();
				return;
			case DemodslPackage.SOFTWARE_COMPONENT__CONNECTOR:
				getConnector().clear();
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
			case DemodslPackage.SOFTWARE_COMPONENT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case DemodslPackage.SOFTWARE_COMPONENT__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case DemodslPackage.SOFTWARE_COMPONENT__PORT:
				return port != null && !port.isEmpty();
			case DemodslPackage.SOFTWARE_COMPONENT__ALLOCATED_TO:
				return allocatedTo != null;
			case DemodslPackage.SOFTWARE_COMPONENT__PORTGROUP:
				return portgroup != null && !portgroup.isEmpty();
			case DemodslPackage.SOFTWARE_COMPONENT__CONNECTOR:
				return connector != null && !connector.isEmpty();
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", UUID: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //SoftwareComponentImpl
