/**
 */
package jess.impl;

import java.util.Collection;

import jess.Expression;
import jess.ForeachExp;
import jess.JessPackage;
import jess.JessVariable;

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
 * An implementation of the model object '<em><b>Foreach Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.ForeachExpImpl#getVar <em>Var</em>}</li>
 *   <li>{@link jess.impl.ForeachExpImpl#getList <em>List</em>}</li>
 *   <li>{@link jess.impl.ForeachExpImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeachExpImpl extends UseFuncExpImpl implements ForeachExp {
	/**
	 * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected JessVariable var;

	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected Expression list;

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
	protected ForeachExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.FOREACH_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JessVariable getVar() {
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVar(JessVariable newVar, NotificationChain msgs) {
		JessVariable oldVar = var;
		var = newVar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.FOREACH_EXP__VAR, oldVar, newVar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVar(JessVariable newVar) {
		if (newVar != var) {
			NotificationChain msgs = null;
			if (var != null)
				msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.FOREACH_EXP__VAR, null, msgs);
			if (newVar != null)
				msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.FOREACH_EXP__VAR, null, msgs);
			msgs = basicSetVar(newVar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.FOREACH_EXP__VAR, newVar, newVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getList() {
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(Expression newList, NotificationChain msgs) {
		Expression oldList = list;
		list = newList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.FOREACH_EXP__LIST, oldList, newList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(Expression newList) {
		if (newList != list) {
			NotificationChain msgs = null;
			if (list != null)
				msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.FOREACH_EXP__LIST, null, msgs);
			if (newList != null)
				msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.FOREACH_EXP__LIST, null, msgs);
			msgs = basicSetList(newList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.FOREACH_EXP__LIST, newList, newList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<Expression>(Expression.class, this, JessPackage.FOREACH_EXP__EXPRESSIONS);
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
			case JessPackage.FOREACH_EXP__VAR:
				return basicSetVar(null, msgs);
			case JessPackage.FOREACH_EXP__LIST:
				return basicSetList(null, msgs);
			case JessPackage.FOREACH_EXP__EXPRESSIONS:
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
			case JessPackage.FOREACH_EXP__VAR:
				return getVar();
			case JessPackage.FOREACH_EXP__LIST:
				return getList();
			case JessPackage.FOREACH_EXP__EXPRESSIONS:
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
			case JessPackage.FOREACH_EXP__VAR:
				setVar((JessVariable)newValue);
				return;
			case JessPackage.FOREACH_EXP__LIST:
				setList((Expression)newValue);
				return;
			case JessPackage.FOREACH_EXP__EXPRESSIONS:
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
			case JessPackage.FOREACH_EXP__VAR:
				setVar((JessVariable)null);
				return;
			case JessPackage.FOREACH_EXP__LIST:
				setList((Expression)null);
				return;
			case JessPackage.FOREACH_EXP__EXPRESSIONS:
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
			case JessPackage.FOREACH_EXP__VAR:
				return var != null;
			case JessPackage.FOREACH_EXP__LIST:
				return list != null;
			case JessPackage.FOREACH_EXP__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForeachExpImpl
