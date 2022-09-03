/**
 */
package csm.tests;

import csm.CsmFactory;
import csm.ResourceAcquire;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Acquire</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceAcquireTest extends StepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceAcquireTest.class);
	}

	/**
	 * Constructs a new Resource Acquire test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAcquireTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Acquire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceAcquire getFixture() {
		return (ResourceAcquire)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CsmFactory.eINSTANCE.createResourceAcquire());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ResourceAcquireTest
