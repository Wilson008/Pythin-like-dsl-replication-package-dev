/**
 */
package jess.tests;

import jess.JessFactory;
import jess.MultiSlotDef;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multi Slot Def</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiSlotDefTest extends ASlotDefTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MultiSlotDefTest.class);
	}

	/**
	 * Constructs a new Multi Slot Def test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSlotDefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Multi Slot Def test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MultiSlotDef getFixture() {
		return (MultiSlotDef)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JessFactory.eINSTANCE.createMultiSlotDef());
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

} //MultiSlotDefTest
