/**
 */
package jess.impl;

import java.util.Collection;

import jess.Expression;
import jess.FunctionDefinition;
import jess.JessPackage;
import jess.JessVariable;
import jess.ValidIdentifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.FunctionDefinitionImpl#getFuncName <em>Func Name</em>}</li>
 *   <li>{@link jess.impl.FunctionDefinitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link jess.impl.FunctionDefinitionImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionDefinitionImpl extends DefinitionExpImpl implements FunctionDefinition {
	/**
	 * The cached value of the '{@link #getFuncName() <em>Func Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncName()
	 * @generated
	 * @ordered
	 */
	protected ValidIdentifier funcName;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<JessVariable> parameters;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> expressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.FUNCTION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidIdentifier getFuncName() {
		return funcName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuncName(ValidIdentifier newFuncName, NotificationChain msgs) {
		ValidIdentifier oldFuncName = funcName;
		funcName = newFuncName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.FUNCTION_DEFINITION__FUNC_NAME, oldFuncName, newFuncName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuncName(ValidIdentifier newFuncName) {
		if (newFuncName != funcName) {
			NotificationChain msgs = null;
			if (funcName != null)
				msgs = ((InternalEObject)funcName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.FUNCTION_DEFINITION__FUNC_NAME, null, msgs);
			if (newFuncName != null)
				msgs = ((InternalEObject)newFuncName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.FUNCTION_DEFINITION__FUNC_NAME, null, msgs);
			msgs = basicSetFuncName(newFuncName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.FUNCTION_DEFINITION__FUNC_NAME, newFuncName, newFuncName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JessVariable> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<JessVariable>(JessVariable.class, this, JessPackage.FUNCTION_DEFINITION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<Expression>(Expression.class, this, JessPackage.FUNCTION_DEFINITION__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.FUNCTION_DEFINITION__FUNC_NAME:
				return basicSetFuncName(null, msgs);
			case JessPackage.FUNCTION_DEFINITION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case JessPackage.FUNCTION_DEFINITION__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
			case JessPackage.FUNCTION_DEFINITION__FUNC_NAME:
				return getFuncName();
			case JessPackage.FUNCTION_DEFINITION__PARAMETERS:
				return getParameters();
			case JessPackage.FUNCTION_DEFINITION__EXPRESSIONS:
				return getExpressions();
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
			case JessPackage.FUNCTION_DEFINITION__FUNC_NAME:
				setFuncName((ValidIdentifier)newValue);
				return;
			case JessPackage.FUNCTION_DEFINITION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends JessVariable>)newValue);
				return;
			case JessPackage.FUNCTION_DEFINITION__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends Expression>)newValue);
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
			case JessPackage.FUNCTION_DEFINITION__FUNC_NAME:
				setFuncName((ValidIdentifier)null);
				return;
			case JessPackage.FUNCTION_DEFINITION__PARAMETERS:
				getParameters().clear();
				return;
			case JessPackage.FUNCTION_DEFINITION__EXPRESSIONS:
				getExpressions().clear();
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
			case JessPackage.FUNCTION_DEFINITION__FUNC_NAME:
				return funcName != null;
			case JessPackage.FUNCTION_DEFINITION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case JessPackage.FUNCTION_DEFINITION__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionDefinitionImpl
