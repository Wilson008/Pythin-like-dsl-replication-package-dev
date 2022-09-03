/**
 */
package jess.impl;

import java.util.Collection;

import jess.Expression;
import jess.FuncCall;
import jess.JessPackage;
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
 * An implementation of the model object '<em><b>Func Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.FuncCallImpl#getFuncName <em>Func Name</em>}</li>
 *   <li>{@link jess.impl.FuncCallImpl#getFuncParam <em>Func Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuncCallImpl extends UseFuncExpImpl implements FuncCall {
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
	 * The cached value of the '{@link #getFuncParam() <em>Func Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncParam()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> funcParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuncCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.FUNC_CALL;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.FUNC_CALL__FUNC_NAME, oldFuncName, newFuncName);
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
				msgs = ((InternalEObject)funcName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.FUNC_CALL__FUNC_NAME, null, msgs);
			if (newFuncName != null)
				msgs = ((InternalEObject)newFuncName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.FUNC_CALL__FUNC_NAME, null, msgs);
			msgs = basicSetFuncName(newFuncName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.FUNC_CALL__FUNC_NAME, newFuncName, newFuncName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getFuncParam() {
		if (funcParam == null) {
			funcParam = new EObjectContainmentEList<Expression>(Expression.class, this, JessPackage.FUNC_CALL__FUNC_PARAM);
		}
		return funcParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.FUNC_CALL__FUNC_NAME:
				return basicSetFuncName(null, msgs);
			case JessPackage.FUNC_CALL__FUNC_PARAM:
				return ((InternalEList<?>)getFuncParam()).basicRemove(otherEnd, msgs);
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
			case JessPackage.FUNC_CALL__FUNC_NAME:
				return getFuncName();
			case JessPackage.FUNC_CALL__FUNC_PARAM:
				return getFuncParam();
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
			case JessPackage.FUNC_CALL__FUNC_NAME:
				setFuncName((ValidIdentifier)newValue);
				return;
			case JessPackage.FUNC_CALL__FUNC_PARAM:
				getFuncParam().clear();
				getFuncParam().addAll((Collection<? extends Expression>)newValue);
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
			case JessPackage.FUNC_CALL__FUNC_NAME:
				setFuncName((ValidIdentifier)null);
				return;
			case JessPackage.FUNC_CALL__FUNC_PARAM:
				getFuncParam().clear();
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
			case JessPackage.FUNC_CALL__FUNC_NAME:
				return funcName != null;
			case JessPackage.FUNC_CALL__FUNC_PARAM:
				return funcParam != null && !funcParam.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FuncCallImpl
