/**
 */
package csm.tests;

import csm.CsmFactory;
import csm.ExternalService;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalServiceTest extends ActiveResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExternalServiceTest.class);
	}

	/**
	 * Constructs a new External Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this External Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExternalService getFixture() {
		return (ExternalService)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CsmFactory.eINSTANCE.createExternalService());
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

} //ExternalServiceTest
