/**
 */
package jess.impl;

import jess.ConditionAction;
import jess.ElifConditionAction;
import jess.JessPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elif Condition Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.ElifConditionActionImpl#getCondAct <em>Cond Act</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElifConditionActionImpl extends LocatedElementImpl implements ElifConditionAction {
	/**
	 * The cached value of the '{@link #getCondAct() <em>Cond Act</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondAct()
	 * @generated
	 * @ordered
	 */
	protected ConditionAction condAct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElifConditionActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.ELIF_CONDITION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionAction getCondAct() {
		return condAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondAct(ConditionAction newCondAct, NotificationChain msgs) {
		ConditionAction oldCondAct = condAct;
		condAct = newCondAct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.ELIF_CONDITION_ACTION__COND_ACT, oldCondAct, newCondAct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondAct(ConditionAction newCondAct) {
		if (newCondAct != condAct) {
			NotificationChain msgs = null;
			if (condAct != null)
				msgs = ((InternalEObject)condAct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.ELIF_CONDITION_ACTION__COND_ACT, null, msgs);
			if (newCondAct != null)
				msgs = ((InternalEObject)newCondAct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.ELIF_CONDITION_ACTION__COND_ACT, null, msgs);
			msgs = basicSetCondAct(newCondAct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.ELIF_CONDITION_ACTION__COND_ACT, newCondAct, newCondAct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.ELIF_CONDITION_ACTION__COND_ACT:
				return basicSetCondAct(null, msgs);
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
			case JessPackage.ELIF_CONDITION_ACTION__COND_ACT:
				return getCondAct();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JessPackage.ELIF_CONDITION_ACTION__COND_ACT:
				setCondAct((ConditionAction)newValue);
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
			case JessPackage.ELIF_CONDITION_ACTION__COND_ACT:
				setCondAct((ConditionAction)null);
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
			case JessPackage.ELIF_CONDITION_ACTION__COND_ACT:
				return condAct != null;
		}
		return super.eIsSet(featureID);
	}

} //ElifConditionActionImpl
