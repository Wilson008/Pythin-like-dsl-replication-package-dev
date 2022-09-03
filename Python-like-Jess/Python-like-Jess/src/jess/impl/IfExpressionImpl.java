/**
 */
package jess.impl;

import java.util.Collection;

import jess.ConditionAction;
import jess.ElifConditionAction;
import jess.Expression;
import jess.IfExpression;
import jess.JessPackage;

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
 * An implementation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.IfExpressionImpl#getIfthen <em>Ifthen</em>}</li>
 *   <li>{@link jess.impl.IfExpressionImpl#getElifthen <em>Elifthen</em>}</li>
 *   <li>{@link jess.impl.IfExpressionImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfExpressionImpl extends UseFuncExpImpl implements IfExpression {
	/**
	 * The cached value of the '{@link #getIfthen() <em>Ifthen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfthen()
	 * @generated
	 * @ordered
	 */
	protected ConditionAction ifthen;

	/**
	 * The cached value of the '{@link #getElifthen() <em>Elifthen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElifthen()
	 * @generated
	 * @ordered
	 */
	protected EList<ElifConditionAction> elifthen;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> else_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.IF_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionAction getIfthen() {
		return ifthen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfthen(ConditionAction newIfthen, NotificationChain msgs) {
		ConditionAction oldIfthen = ifthen;
		ifthen = newIfthen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.IF_EXPRESSION__IFTHEN, oldIfthen, newIfthen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfthen(ConditionAction newIfthen) {
		if (newIfthen != ifthen) {
			NotificationChain msgs = null;
			if (ifthen != null)
				msgs = ((InternalEObject)ifthen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.IF_EXPRESSION__IFTHEN, null, msgs);
			if (newIfthen != null)
				msgs = ((InternalEObject)newIfthen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.IF_EXPRESSION__IFTHEN, null, msgs);
			msgs = basicSetIfthen(newIfthen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.IF_EXPRESSION__IFTHEN, newIfthen, newIfthen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElifConditionAction> getElifthen() {
		if (elifthen == null) {
			elifthen = new EObjectContainmentEList<ElifConditionAction>(ElifConditionAction.class, this, JessPackage.IF_EXPRESSION__ELIFTHEN);
		}
		return elifthen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getElse() {
		if (else_ == null) {
			else_ = new EObjectContainmentEList<Expression>(Expression.class, this, JessPackage.IF_EXPRESSION__ELSE);
		}
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.IF_EXPRESSION__IFTHEN:
				return basicSetIfthen(null, msgs);
			case JessPackage.IF_EXPRESSION__ELIFTHEN:
				return ((InternalEList<?>)getElifthen()).basicRemove(otherEnd, msgs);
			case JessPackage.IF_EXPRESSION__ELSE:
				return ((InternalEList<?>)getElse()).basicRemove(otherEnd, msgs);
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
			case JessPackage.IF_EXPRESSION__IFTHEN:
				return getIfthen();
			case JessPackage.IF_EXPRESSION__ELIFTHEN:
				return getElifthen();
			case JessPackage.IF_EXPRESSION__ELSE:
				return getElse();
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
			case JessPackage.IF_EXPRESSION__IFTHEN:
				setIfthen((ConditionAction)newValue);
				return;
			case JessPackage.IF_EXPRESSION__ELIFTHEN:
				getElifthen().clear();
				getElifthen().addAll((Collection<? extends ElifConditionAction>)newValue);
				return;
			case JessPackage.IF_EXPRESSION__ELSE:
				getElse().clear();
				getElse().addAll((Collection<? extends Expression>)newValue);
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
			case JessPackage.IF_EXPRESSION__IFTHEN:
				setIfthen((ConditionAction)null);
				return;
			case JessPackage.IF_EXPRESSION__ELIFTHEN:
				getElifthen().clear();
				return;
			case JessPackage.IF_EXPRESSION__ELSE:
				getElse().clear();
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
			case JessPackage.IF_EXPRESSION__IFTHEN:
				return ifthen != null;
			case JessPackage.IF_EXPRESSION__ELIFTHEN:
				return elifthen != null && !elifthen.isEmpty();
			case JessPackage.IF_EXPRESSION__ELSE:
				return else_ != null && !else_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfExpressionImpl
