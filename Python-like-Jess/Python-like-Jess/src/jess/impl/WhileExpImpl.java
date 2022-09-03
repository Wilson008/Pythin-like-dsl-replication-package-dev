/**
 */
package jess.impl;

import java.util.Collection;

import jess.Expression;
import jess.JessPackage;
import jess.WhileExp;

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
 * An implementation of the model object '<em><b>While Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.WhileExpImpl#getHasDo <em>Has Do</em>}</li>
 *   <li>{@link jess.impl.WhileExpImpl#getBoolExp <em>Bool Exp</em>}</li>
 *   <li>{@link jess.impl.WhileExpImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileExpImpl extends UseFuncExpImpl implements WhileExp {
	/**
	 * The cached value of the '{@link #getHasDo() <em>Has Do</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDo()
	 * @generated
	 * @ordered
	 */
	protected Object hasDo;

	/**
	 * The cached value of the '{@link #getBoolExp() <em>Bool Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolExp()
	 * @generated
	 * @ordered
	 */
	protected Expression boolExp;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.WHILE_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getHasDo() {
		return hasDo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDo(Object newHasDo) {
		Object oldHasDo = hasDo;
		hasDo = newHasDo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.WHILE_EXP__HAS_DO, oldHasDo, hasDo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBoolExp() {
		return boolExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoolExp(Expression newBoolExp, NotificationChain msgs) {
		Expression oldBoolExp = boolExp;
		boolExp = newBoolExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.WHILE_EXP__BOOL_EXP, oldBoolExp, newBoolExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolExp(Expression newBoolExp) {
		if (newBoolExp != boolExp) {
			NotificationChain msgs = null;
			if (boolExp != null)
				msgs = ((InternalEObject)boolExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.WHILE_EXP__BOOL_EXP, null, msgs);
			if (newBoolExp != null)
				msgs = ((InternalEObject)newBoolExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.WHILE_EXP__BOOL_EXP, null, msgs);
			msgs = basicSetBoolExp(newBoolExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.WHILE_EXP__BOOL_EXP, newBoolExp, newBoolExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Expression>(Expression.class, this, JessPackage.WHILE_EXP__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.WHILE_EXP__BOOL_EXP:
				return basicSetBoolExp(null, msgs);
			case JessPackage.WHILE_EXP__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case JessPackage.WHILE_EXP__HAS_DO:
				return getHasDo();
			case JessPackage.WHILE_EXP__BOOL_EXP:
				return getBoolExp();
			case JessPackage.WHILE_EXP__ACTIONS:
				return getActions();
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
			case JessPackage.WHILE_EXP__HAS_DO:
				setHasDo(newValue);
				return;
			case JessPackage.WHILE_EXP__BOOL_EXP:
				setBoolExp((Expression)newValue);
				return;
			case JessPackage.WHILE_EXP__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Expression>)newValue);
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
			case JessPackage.WHILE_EXP__HAS_DO:
				setHasDo((Object)null);
				return;
			case JessPackage.WHILE_EXP__BOOL_EXP:
				setBoolExp((Expression)null);
				return;
			case JessPackage.WHILE_EXP__ACTIONS:
				getActions().clear();
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
			case JessPackage.WHILE_EXP__HAS_DO:
				return hasDo != null;
			case JessPackage.WHILE_EXP__BOOL_EXP:
				return boolExp != null;
			case JessPackage.WHILE_EXP__ACTIONS:
				return actions != null && !actions.isEmpty();
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
		result.append(" (hasDo: ");
		result.append(hasDo);
		result.append(')');
		return result.toString();
	}

} //WhileExpImpl
