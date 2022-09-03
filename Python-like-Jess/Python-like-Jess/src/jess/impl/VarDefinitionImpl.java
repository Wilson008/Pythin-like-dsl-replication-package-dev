/**
 */
package jess.impl;

import jess.Expression;
import jess.JessPackage;
import jess.JessVariable;
import jess.ValidIdentifier;
import jess.VarDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.VarDefinitionImpl#getJessVar <em>Jess Var</em>}</li>
 *   <li>{@link jess.impl.VarDefinitionImpl#getEq <em>Eq</em>}</li>
 *   <li>{@link jess.impl.VarDefinitionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarDefinitionImpl extends LocatedElementImpl implements VarDefinition {
	/**
	 * The cached value of the '{@link #getJessVar() <em>Jess Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJessVar()
	 * @generated
	 * @ordered
	 */
	protected JessVariable jessVar;

	/**
	 * The cached value of the '{@link #getEq() <em>Eq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEq()
	 * @generated
	 * @ordered
	 */
	protected ValidIdentifier eq;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.VAR_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JessVariable getJessVar() {
		return jessVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJessVar(JessVariable newJessVar, NotificationChain msgs) {
		JessVariable oldJessVar = jessVar;
		jessVar = newJessVar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.VAR_DEFINITION__JESS_VAR, oldJessVar, newJessVar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJessVar(JessVariable newJessVar) {
		if (newJessVar != jessVar) {
			NotificationChain msgs = null;
			if (jessVar != null)
				msgs = ((InternalEObject)jessVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.VAR_DEFINITION__JESS_VAR, null, msgs);
			if (newJessVar != null)
				msgs = ((InternalEObject)newJessVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.VAR_DEFINITION__JESS_VAR, null, msgs);
			msgs = basicSetJessVar(newJessVar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.VAR_DEFINITION__JESS_VAR, newJessVar, newJessVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidIdentifier getEq() {
		return eq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEq(ValidIdentifier newEq, NotificationChain msgs) {
		ValidIdentifier oldEq = eq;
		eq = newEq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.VAR_DEFINITION__EQ, oldEq, newEq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEq(ValidIdentifier newEq) {
		if (newEq != eq) {
			NotificationChain msgs = null;
			if (eq != null)
				msgs = ((InternalEObject)eq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.VAR_DEFINITION__EQ, null, msgs);
			if (newEq != null)
				msgs = ((InternalEObject)newEq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.VAR_DEFINITION__EQ, null, msgs);
			msgs = basicSetEq(newEq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.VAR_DEFINITION__EQ, newEq, newEq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.VAR_DEFINITION__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.VAR_DEFINITION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.VAR_DEFINITION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.VAR_DEFINITION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.VAR_DEFINITION__JESS_VAR:
				return basicSetJessVar(null, msgs);
			case JessPackage.VAR_DEFINITION__EQ:
				return basicSetEq(null, msgs);
			case JessPackage.VAR_DEFINITION__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case JessPackage.VAR_DEFINITION__JESS_VAR:
				return getJessVar();
			case JessPackage.VAR_DEFINITION__EQ:
				return getEq();
			case JessPackage.VAR_DEFINITION__EXPRESSION:
				return getExpression();
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
			case JessPackage.VAR_DEFINITION__JESS_VAR:
				setJessVar((JessVariable)newValue);
				return;
			case JessPackage.VAR_DEFINITION__EQ:
				setEq((ValidIdentifier)newValue);
				return;
			case JessPackage.VAR_DEFINITION__EXPRESSION:
				setExpression((Expression)newValue);
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
			case JessPackage.VAR_DEFINITION__JESS_VAR:
				setJessVar((JessVariable)null);
				return;
			case JessPackage.VAR_DEFINITION__EQ:
				setEq((ValidIdentifier)null);
				return;
			case JessPackage.VAR_DEFINITION__EXPRESSION:
				setExpression((Expression)null);
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
			case JessPackage.VAR_DEFINITION__JESS_VAR:
				return jessVar != null;
			case JessPackage.VAR_DEFINITION__EQ:
				return eq != null;
			case JessPackage.VAR_DEFINITION__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}

} //VarDefinitionImpl
