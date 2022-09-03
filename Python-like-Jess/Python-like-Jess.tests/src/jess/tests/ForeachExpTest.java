/**
 */
package jess.tests;

import jess.ForeachExp;
import jess.JessFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Foreach Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForeachExpTest extends UseFuncExpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ForeachExpTest.class);
	}

	/**
	 * Constructs a new Foreach Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeachExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Foreach Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ForeachExp getFixture() {
		return (ForeachExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JessFactory.eINSTANCE.createForeachExp());
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

} //ForeachExpTest
