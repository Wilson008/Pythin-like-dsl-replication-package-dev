/**
 */
package jess.impl;

import jess.Expression;
import jess.JessPackage;
import jess.SlotName;
import jess.SlotOp;
import jess.ValidIdentifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.SlotOpImpl#getSlotIdent <em>Slot Ident</em>}</li>
 *   <li>{@link jess.impl.SlotOpImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link jess.impl.SlotOpImpl#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlotOpImpl extends LocatedElementImpl implements SlotOp {
	/**
	 * The cached value of the '{@link #getSlotIdent() <em>Slot Ident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotIdent()
	 * @generated
	 * @ordered
	 */
	protected SlotName slotIdent;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ValidIdentifier operator;

	/**
	 * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp()
	 * @generated
	 * @ordered
	 */
	protected Expression exp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.SLOT_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotName getSlotIdent() {
		return slotIdent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlotIdent(SlotName newSlotIdent, NotificationChain msgs) {
		SlotName oldSlotIdent = slotIdent;
		slotIdent = newSlotIdent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.SLOT_OP__SLOT_IDENT, oldSlotIdent, newSlotIdent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlotIdent(SlotName newSlotIdent) {
		if (newSlotIdent != slotIdent) {
			NotificationChain msgs = null;
			if (slotIdent != null)
				msgs = ((InternalEObject)slotIdent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.SLOT_OP__SLOT_IDENT, null, msgs);
			if (newSlotIdent != null)
				msgs = ((InternalEObject)newSlotIdent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.SLOT_OP__SLOT_IDENT, null, msgs);
			msgs = basicSetSlotIdent(newSlotIdent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.SLOT_OP__SLOT_IDENT, newSlotIdent, newSlotIdent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidIdentifier getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(ValidIdentifier newOperator, NotificationChain msgs) {
		ValidIdentifier oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.SLOT_OP__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(ValidIdentifier newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.SLOT_OP__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.SLOT_OP__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.SLOT_OP__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExp() {
		return exp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExp(Expression newExp, NotificationChain msgs) {
		Expression oldExp = exp;
		exp = newExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.SLOT_OP__EXP, oldExp, newExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExp(Expression newExp) {
		if (newExp != exp) {
			NotificationChain msgs = null;
			if (exp != null)
				msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.SLOT_OP__EXP, null, msgs);
			if (newExp != null)
				msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.SLOT_OP__EXP, null, msgs);
			msgs = basicSetExp(newExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.SLOT_OP__EXP, newExp, newExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.SLOT_OP__SLOT_IDENT:
				return basicSetSlotIdent(null, msgs);
			case JessPackage.SLOT_OP__OPERATOR:
				return basicSetOperator(null, msgs);
			case JessPackage.SLOT_OP__EXP:
				return basicSetExp(null, msgs);
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
			case JessPackage.SLOT_OP__SLOT_IDENT:
				return getSlotIdent();
			case JessPackage.SLOT_OP__OPERATOR:
				return getOperator();
			case JessPackage.SLOT_OP__EXP:
				return getExp();
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
			case JessPackage.SLOT_OP__SLOT_IDENT:
				setSlotIdent((SlotName)newValue);
				return;
			case JessPackage.SLOT_OP__OPERATOR:
				setOperator((ValidIdentifier)newValue);
				return;
			case JessPackage.SLOT_OP__EXP:
				setExp((Expression)newValue);
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
			case JessPackage.SLOT_OP__SLOT_IDENT:
				setSlotIdent((SlotName)null);
				return;
			case JessPackage.SLOT_OP__OPERATOR:
				setOperator((ValidIdentifier)null);
				return;
			case JessPackage.SLOT_OP__EXP:
				setExp((Expression)null);
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
			case JessPackage.SLOT_OP__SLOT_IDENT:
				return slotIdent != null;
			case JessPackage.SLOT_OP__OPERATOR:
				return operator != null;
			case JessPackage.SLOT_OP__EXP:
				return exp != null;
		}
		return super.eIsSet(featureID);
	}

} //SlotOpImpl
