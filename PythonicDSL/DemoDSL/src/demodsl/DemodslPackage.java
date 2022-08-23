/**
 */
package demodsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see demodsl.DemodslFactory
 * @model kind="package"
 * @generated
 */
public interface DemodslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "demodsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://mdse/demodsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "demodsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DemodslPackage eINSTANCE = demodsl.impl.DemodslPackageImpl.init();

	/**
	 * The meta object id for the '{@link demodsl.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demodsl.impl.RootImpl
	 * @see demodsl.impl.DemodslPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Hardwarecomponent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__HARDWARECOMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Softwarecomponent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__SOFTWARECOMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link demodsl.impl.HardwareComponentImpl <em>Hardware Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demodsl.impl.HardwareComponentImpl
	 * @see demodsl.impl.DemodslPackageImpl#getHardwareComponent()
	 * @generated
	 */
	int HARDWARE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT__UUID = 1;

	/**
	 * The number of structural features of the '<em>Hardware Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hardware Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link demodsl.impl.SoftwareComponentImpl <em>Software Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demodsl.impl.SoftwareComponentImpl
	 * @see demodsl.impl.DemodslPackageImpl#getSoftwareComponent()
	 * @generated
	 */
	int SOFTWARE_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__UUID = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__PORT = 2;

	/**
	 * The feature id for the '<em><b>Allocated To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__ALLOCATED_TO = 3;

	/**
	 * The feature id for the '<em><b>Portgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__PORTGROUP = 4;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__CONNECTOR = 5;

	/**
	 * The number of structural features of the '<em>Software Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Software Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link demodsl.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demodsl.impl.NodeImpl
	 * @see demodsl.impl.DemodslPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IDENTIFIER = HARDWARE_COMPONENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__UUID = HARDWARE_COMPONENT__UUID;

	/**
	 * The feature id for the '<em><b>Softwarecomponent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SOFTWARECOMPONENT = HARDWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = HARDWARE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = HARDWARE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link demodsl.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demodsl.impl.SensorImpl
	 * @see demodsl.impl.DemodslPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__IDENTIFIER = HARDWARE_COMPONENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__UUID = HARDWARE_COMPONENT__UUID;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = HARDWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = HARDWARE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link demodsl.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demodsl.impl.ActuatorImpl
	 * @see demodsl.impl.DemodslPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__IDENTIFIER = HARDWARE_COMPONENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__UUID = HARDWARE_COMPONENT__UUID;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = HARDWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = HARDWARE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link demodsl.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demodsl.impl.PortImpl
	 * @see demodsl.impl.DemodslPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link demodsl.impl.PowerPortImpl <em>Power Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demodsl.impl.PowerPortImpl
	 * @see demodsl.impl.DemodslPackageImpl#getPowerPort()
	 * @generated
	 */
	int POWER_PORT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Input Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_PORT__INPUT_VOLTAGE = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Power Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Power Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link demodsl.impl.FunctionPortImpl <em>Function Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demodsl.impl.FunctionPortImpl
	 * @see demodsl.impl.DemodslPackageImpl#getFunctionPort()
	 * @generated
	 */
	int FUNCTION_PORT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__DIRECTION = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link demodsl.impl.PortGroupImpl <em>Port Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demodsl.impl.PortGroupImpl
	 * @see demodsl.impl.DemodslPackageImpl#getPortGroup()
	 * @generated
	 */
	int PORT_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_GROUP__PORT = 1;

	/**
	 * The number of structural features of the '<em>Port Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link demodsl.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demodsl.impl.ConnectorImpl
	 * @see demodsl.impl.DemodslPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 10;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link demodsl.impl.PortConnectorImpl <em>Port Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demodsl.impl.PortConnectorImpl
	 * @see demodsl.impl.DemodslPackageImpl#getPortConnector()
	 * @generated
	 */
	int PORT_CONNECTOR = 11;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__PORT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link demodsl.impl.GroupConnectorImpl <em>Group Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demodsl.impl.GroupConnectorImpl
	 * @see demodsl.impl.DemodslPackageImpl#getGroupConnector()
	 * @generated
	 */
	int GROUP_CONNECTOR = 12;

	/**
	 * The feature id for the '<em><b>Portgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CONNECTOR__PORTGROUP = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link demodsl.PortDirection <em>Port Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demodsl.PortDirection
	 * @see demodsl.impl.DemodslPackageImpl#getPortDirection()
	 * @generated
	 */
	int PORT_DIRECTION = 13;


	/**
	 * Returns the meta object for class '{@link demodsl.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see demodsl.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link demodsl.Root#getSoftwarecomponent <em>Softwarecomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Softwarecomponent</em>'.
	 * @see demodsl.Root#getSoftwarecomponent()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Softwarecomponent();

	/**
	 * Returns the meta object for the containment reference list '{@link demodsl.Root#getHardwarecomponent <em>Hardwarecomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hardwarecomponent</em>'.
	 * @see demodsl.Root#getHardwarecomponent()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Hardwarecomponent();

	/**
	 * Returns the meta object for class '{@link demodsl.HardwareComponent <em>Hardware Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Component</em>'.
	 * @see demodsl.HardwareComponent
	 * @generated
	 */
	EClass getHardwareComponent();

	/**
	 * Returns the meta object for the attribute '{@link demodsl.HardwareComponent#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see demodsl.HardwareComponent#getIdentifier()
	 * @see #getHardwareComponent()
	 * @generated
	 */
	EAttribute getHardwareComponent_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link demodsl.HardwareComponent#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see demodsl.HardwareComponent#getUUID()
	 * @see #getHardwareComponent()
	 * @generated
	 */
	EAttribute getHardwareComponent_UUID();

	/**
	 * Returns the meta object for class '{@link demodsl.SoftwareComponent <em>Software Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Component</em>'.
	 * @see demodsl.SoftwareComponent
	 * @generated
	 */
	EClass getSoftwareComponent();

	/**
	 * Returns the meta object for the attribute '{@link demodsl.SoftwareComponent#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see demodsl.SoftwareComponent#getIdentifier()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EAttribute getSoftwareComponent_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link demodsl.SoftwareComponent#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see demodsl.SoftwareComponent#getUUID()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EAttribute getSoftwareComponent_UUID();

	/**
	 * Returns the meta object for the containment reference list '{@link demodsl.SoftwareComponent#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see demodsl.SoftwareComponent#getPort()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EReference getSoftwareComponent_Port();

	/**
	 * Returns the meta object for the reference '{@link demodsl.SoftwareComponent#getAllocatedTo <em>Allocated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocated To</em>'.
	 * @see demodsl.SoftwareComponent#getAllocatedTo()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EReference getSoftwareComponent_AllocatedTo();

	/**
	 * Returns the meta object for the containment reference list '{@link demodsl.SoftwareComponent#getPortgroup <em>Portgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portgroup</em>'.
	 * @see demodsl.SoftwareComponent#getPortgroup()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EReference getSoftwareComponent_Portgroup();

	/**
	 * Returns the meta object for the containment reference list '{@link demodsl.SoftwareComponent#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see demodsl.SoftwareComponent#getConnector()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EReference getSoftwareComponent_Connector();

	/**
	 * Returns the meta object for class '{@link demodsl.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see demodsl.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link demodsl.Node#getSoftwarecomponent <em>Softwarecomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Softwarecomponent</em>'.
	 * @see demodsl.Node#getSoftwarecomponent()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Softwarecomponent();

	/**
	 * Returns the meta object for class '{@link demodsl.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see demodsl.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link demodsl.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see demodsl.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link demodsl.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see demodsl.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link demodsl.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see demodsl.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for class '{@link demodsl.PowerPort <em>Power Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Port</em>'.
	 * @see demodsl.PowerPort
	 * @generated
	 */
	EClass getPowerPort();

	/**
	 * Returns the meta object for the attribute '{@link demodsl.PowerPort#getInputVoltage <em>Input Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Voltage</em>'.
	 * @see demodsl.PowerPort#getInputVoltage()
	 * @see #getPowerPort()
	 * @generated
	 */
	EAttribute getPowerPort_InputVoltage();

	/**
	 * Returns the meta object for class '{@link demodsl.FunctionPort <em>Function Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Port</em>'.
	 * @see demodsl.FunctionPort
	 * @generated
	 */
	EClass getFunctionPort();

	/**
	 * Returns the meta object for the attribute '{@link demodsl.FunctionPort#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see demodsl.FunctionPort#getDirection()
	 * @see #getFunctionPort()
	 * @generated
	 */
	EAttribute getFunctionPort_Direction();

	/**
	 * Returns the meta object for class '{@link demodsl.PortGroup <em>Port Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Group</em>'.
	 * @see demodsl.PortGroup
	 * @generated
	 */
	EClass getPortGroup();

	/**
	 * Returns the meta object for the attribute '{@link demodsl.PortGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see demodsl.PortGroup#getName()
	 * @see #getPortGroup()
	 * @generated
	 */
	EAttribute getPortGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link demodsl.PortGroup#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see demodsl.PortGroup#getPort()
	 * @see #getPortGroup()
	 * @generated
	 */
	EReference getPortGroup_Port();

	/**
	 * Returns the meta object for class '{@link demodsl.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see demodsl.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for class '{@link demodsl.PortConnector <em>Port Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connector</em>'.
	 * @see demodsl.PortConnector
	 * @generated
	 */
	EClass getPortConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link demodsl.PortConnector#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see demodsl.PortConnector#getPort()
	 * @see #getPortConnector()
	 * @generated
	 */
	EReference getPortConnector_Port();

	/**
	 * Returns the meta object for class '{@link demodsl.GroupConnector <em>Group Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Connector</em>'.
	 * @see demodsl.GroupConnector
	 * @generated
	 */
	EClass getGroupConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link demodsl.GroupConnector#getPortgroup <em>Portgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portgroup</em>'.
	 * @see demodsl.GroupConnector#getPortgroup()
	 * @see #getGroupConnector()
	 * @generated
	 */
	EReference getGroupConnector_Portgroup();

	/**
	 * Returns the meta object for enum '{@link demodsl.PortDirection <em>Port Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Direction</em>'.
	 * @see demodsl.PortDirection
	 * @generated
	 */
	EEnum getPortDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DemodslFactory getDemodslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link demodsl.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demodsl.impl.RootImpl
		 * @see demodsl.impl.DemodslPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Softwarecomponent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__SOFTWARECOMPONENT = eINSTANCE.getRoot_Softwarecomponent();

		/**
		 * The meta object literal for the '<em><b>Hardwarecomponent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__HARDWARECOMPONENT = eINSTANCE.getRoot_Hardwarecomponent();

		/**
		 * The meta object literal for the '{@link demodsl.impl.HardwareComponentImpl <em>Hardware Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demodsl.impl.HardwareComponentImpl
		 * @see demodsl.impl.DemodslPackageImpl#getHardwareComponent()
		 * @generated
		 */
		EClass HARDWARE_COMPONENT = eINSTANCE.getHardwareComponent();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_COMPONENT__IDENTIFIER = eINSTANCE.getHardwareComponent_Identifier();

		/**
		 * The meta object literal for the '<em><b>UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_COMPONENT__UUID = eINSTANCE.getHardwareComponent_UUID();

		/**
		 * The meta object literal for the '{@link demodsl.impl.SoftwareComponentImpl <em>Software Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demodsl.impl.SoftwareComponentImpl
		 * @see demodsl.impl.DemodslPackageImpl#getSoftwareComponent()
		 * @generated
		 */
		EClass SOFTWARE_COMPONENT = eINSTANCE.getSoftwareComponent();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_COMPONENT__IDENTIFIER = eINSTANCE.getSoftwareComponent_Identifier();

		/**
		 * The meta object literal for the '<em><b>UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_COMPONENT__UUID = eINSTANCE.getSoftwareComponent_UUID();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_COMPONENT__PORT = eINSTANCE.getSoftwareComponent_Port();

		/**
		 * The meta object literal for the '<em><b>Allocated To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_COMPONENT__ALLOCATED_TO = eINSTANCE.getSoftwareComponent_AllocatedTo();

		/**
		 * The meta object literal for the '<em><b>Portgroup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_COMPONENT__PORTGROUP = eINSTANCE.getSoftwareComponent_Portgroup();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_COMPONENT__CONNECTOR = eINSTANCE.getSoftwareComponent_Connector();

		/**
		 * The meta object literal for the '{@link demodsl.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demodsl.impl.NodeImpl
		 * @see demodsl.impl.DemodslPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Softwarecomponent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SOFTWARECOMPONENT = eINSTANCE.getNode_Softwarecomponent();

		/**
		 * The meta object literal for the '{@link demodsl.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demodsl.impl.SensorImpl
		 * @see demodsl.impl.DemodslPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link demodsl.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demodsl.impl.ActuatorImpl
		 * @see demodsl.impl.DemodslPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link demodsl.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demodsl.impl.PortImpl
		 * @see demodsl.impl.DemodslPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '{@link demodsl.impl.PowerPortImpl <em>Power Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demodsl.impl.PowerPortImpl
		 * @see demodsl.impl.DemodslPackageImpl#getPowerPort()
		 * @generated
		 */
		EClass POWER_PORT = eINSTANCE.getPowerPort();

		/**
		 * The meta object literal for the '<em><b>Input Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_PORT__INPUT_VOLTAGE = eINSTANCE.getPowerPort_InputVoltage();

		/**
		 * The meta object literal for the '{@link demodsl.impl.FunctionPortImpl <em>Function Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demodsl.impl.FunctionPortImpl
		 * @see demodsl.impl.DemodslPackageImpl#getFunctionPort()
		 * @generated
		 */
		EClass FUNCTION_PORT = eINSTANCE.getFunctionPort();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PORT__DIRECTION = eINSTANCE.getFunctionPort_Direction();

		/**
		 * The meta object literal for the '{@link demodsl.impl.PortGroupImpl <em>Port Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demodsl.impl.PortGroupImpl
		 * @see demodsl.impl.DemodslPackageImpl#getPortGroup()
		 * @generated
		 */
		EClass PORT_GROUP = eINSTANCE.getPortGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_GROUP__NAME = eINSTANCE.getPortGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_GROUP__PORT = eINSTANCE.getPortGroup_Port();

		/**
		 * The meta object literal for the '{@link demodsl.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demodsl.impl.ConnectorImpl
		 * @see demodsl.impl.DemodslPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '{@link demodsl.impl.PortConnectorImpl <em>Port Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demodsl.impl.PortConnectorImpl
		 * @see demodsl.impl.DemodslPackageImpl#getPortConnector()
		 * @generated
		 */
		EClass PORT_CONNECTOR = eINSTANCE.getPortConnector();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTOR__PORT = eINSTANCE.getPortConnector_Port();

		/**
		 * The meta object literal for the '{@link demodsl.impl.GroupConnectorImpl <em>Group Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demodsl.impl.GroupConnectorImpl
		 * @see demodsl.impl.DemodslPackageImpl#getGroupConnector()
		 * @generated
		 */
		EClass GROUP_CONNECTOR = eINSTANCE.getGroupConnector();

		/**
		 * The meta object literal for the '<em><b>Portgroup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_CONNECTOR__PORTGROUP = eINSTANCE.getGroupConnector_Portgroup();

		/**
		 * The meta object literal for the '{@link demodsl.PortDirection <em>Port Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demodsl.PortDirection
		 * @see demodsl.impl.DemodslPackageImpl#getPortDirection()
		 * @generated
		 */
		EEnum PORT_DIRECTION = eINSTANCE.getPortDirection();

	}

} //DemodslPackage
