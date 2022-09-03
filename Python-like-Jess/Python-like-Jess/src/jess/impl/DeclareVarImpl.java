/**
 */
package jess.impl;

import java.util.Collection;

import jess.DeclareVar;
import jess.Expression;
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
 * An implementation of the model object '<em><b>Declare Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.DeclareVarImpl#getVar <em>Var</em>}</li>
 *   <li>{@link jess.impl.DeclareVarImpl#getNode <em>Node</em>}</li>
 *   <li>{@link jess.impl.DeclareVarImpl#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclareVarImpl extends LocatedElementImpl implements DeclareVar {
	/**
	 * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected EList<JessVariable> var;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected Expression node;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected Expression max;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclareVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.DECLARE_VAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JessVariable> getVar() {
		if (var == null) {
			var = new EObjectContainmentEList<JessVariable>(JessVariable.class, this, JessPackage.DECLARE_VAR__VAR);
		}
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(Expression newNode, NotificationChain msgs) {
		Expression oldNode = node;
		node = newNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_VAR__NODE, oldNode, newNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Expression newNode) {
		if (newNode != node) {
			NotificationChain msgs = null;
			if (node != null)
				msgs = ((InternalEObject)node).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_VAR__NODE, null, msgs);
			if (newNode != null)
				msgs = ((InternalEObject)newNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_VAR__NODE, null, msgs);
			msgs = basicSetNode(newNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_VAR__NODE, newNode, newNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(Expression newMax, NotificationChain msgs) {
		Expression oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_VAR__MAX, oldMax, newMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(Expression newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_VAR__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_VAR__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_VAR__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.DECLARE_VAR__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case JessPackage.DECLARE_VAR__NODE:
				return basicSetNode(null, msgs);
			case JessPackage.DECLARE_VAR__MAX:
				return basicSetMax(null, msgs);
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
			case JessPackage.DECLARE_VAR__VAR:
				return getVar();
			case JessPackage.DECLARE_VAR__NODE:
				return getNode();
			case JessPackage.DECLARE_VAR__MAX:
				return getMax();
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
			case JessPackage.DECLARE_VAR__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends JessVariable>)newValue);
				return;
			case JessPackage.DECLARE_VAR__NODE:
				setNode((Expression)newValue);
				return;
			case JessPackage.DECLARE_VAR__MAX:
				setMax((Expression)newValue);
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
			case JessPackage.DECLARE_VAR__VAR:
				getVar().clear();
				return;
			case JessPackage.DECLARE_VAR__NODE:
				setNode((Expression)null);
				return;
			case JessPackage.DECLARE_VAR__MAX:
				setMax((Expression)null);
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
			case JessPackage.DECLARE_VAR__VAR:
				return var != null && !var.isEmpty();
			case JessPackage.DECLARE_VAR__NODE:
				return node != null;
			case JessPackage.DECLARE_VAR__MAX:
				return max != null;
		}
		return super.eIsSet(featureID);
	}

} //DeclareVarImpl
