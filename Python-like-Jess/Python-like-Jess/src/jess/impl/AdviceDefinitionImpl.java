/**
 */
package jess.impl;

import java.util.Collection;

import jess.Advice;
import jess.AdviceDefinition;
import jess.Expression;
import jess.Ident;
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
 * An implementation of the model object '<em><b>Advice Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.AdviceDefinitionImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link jess.impl.AdviceDefinitionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link jess.impl.AdviceDefinitionImpl#getAdvice <em>Advice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdviceDefinitionImpl extends DefinitionExpImpl implements AdviceDefinition {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Advice DIRECTION_EDEFAULT = Advice.BEFORE;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Advice direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected Ident op;

	/**
	 * The cached value of the '{@link #getAdvice() <em>Advice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvice()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> advice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdviceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.ADVICE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Advice getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Advice newDirection) {
		Advice oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.ADVICE_DEFINITION__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ident getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp(Ident newOp, NotificationChain msgs) {
		Ident oldOp = op;
		op = newOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.ADVICE_DEFINITION__OP, oldOp, newOp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(Ident newOp) {
		if (newOp != op) {
			NotificationChain msgs = null;
			if (op != null)
				msgs = ((InternalEObject)op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.ADVICE_DEFINITION__OP, null, msgs);
			if (newOp != null)
				msgs = ((InternalEObject)newOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.ADVICE_DEFINITION__OP, null, msgs);
			msgs = basicSetOp(newOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.ADVICE_DEFINITION__OP, newOp, newOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getAdvice() {
		if (advice == null) {
			advice = new EObjectContainmentEList<Expression>(Expression.class, this, JessPackage.ADVICE_DEFINITION__ADVICE);
		}
		return advice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.ADVICE_DEFINITION__OP:
				return basicSetOp(null, msgs);
			case JessPackage.ADVICE_DEFINITION__ADVICE:
				return ((InternalEList<?>)getAdvice()).basicRemove(otherEnd, msgs);
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
			case JessPackage.ADVICE_DEFINITION__DIRECTION:
				return getDirection();
			case JessPackage.ADVICE_DEFINITION__OP:
				return getOp();
			case JessPackage.ADVICE_DEFINITION__ADVICE:
				return getAdvice();
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
			case JessPackage.ADVICE_DEFINITION__DIRECTION:
				setDirection((Advice)newValue);
				return;
			case JessPackage.ADVICE_DEFINITION__OP:
				setOp((Ident)newValue);
				return;
			case JessPackage.ADVICE_DEFINITION__ADVICE:
				getAdvice().clear();
				getAdvice().addAll((Collection<? extends Expression>)newValue);
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
			case JessPackage.ADVICE_DEFINITION__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case JessPackage.ADVICE_DEFINITION__OP:
				setOp((Ident)null);
				return;
			case JessPackage.ADVICE_DEFINITION__ADVICE:
				getAdvice().clear();
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
			case JessPackage.ADVICE_DEFINITION__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case JessPackage.ADVICE_DEFINITION__OP:
				return op != null;
			case JessPackage.ADVICE_DEFINITION__ADVICE:
				return advice != null && !advice.isEmpty();
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //AdviceDefinitionImpl
