/**
 */
package jess.impl;

import jess.DeclareRule;
import jess.Expression;
import jess.JessPackage;
import jess.ValidIdentifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declare Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.DeclareRuleImpl#getSalience <em>Salience</em>}</li>
 *   <li>{@link jess.impl.DeclareRuleImpl#getNodeIndexHash <em>Node Index Hash</em>}</li>
 *   <li>{@link jess.impl.DeclareRuleImpl#getAutoFocus <em>Auto Focus</em>}</li>
 *   <li>{@link jess.impl.DeclareRuleImpl#getNoLoop <em>No Loop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclareRuleImpl extends LocatedElementImpl implements DeclareRule {
	/**
	 * The cached value of the '{@link #getSalience() <em>Salience</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalience()
	 * @generated
	 * @ordered
	 */
	protected Expression salience;

	/**
	 * The cached value of the '{@link #getNodeIndexHash() <em>Node Index Hash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeIndexHash()
	 * @generated
	 * @ordered
	 */
	protected Expression nodeIndexHash;

	/**
	 * The cached value of the '{@link #getAutoFocus() <em>Auto Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoFocus()
	 * @generated
	 * @ordered
	 */
	protected ValidIdentifier autoFocus;

	/**
	 * The cached value of the '{@link #getNoLoop() <em>No Loop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoLoop()
	 * @generated
	 * @ordered
	 */
	protected ValidIdentifier noLoop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclareRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.DECLARE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSalience() {
		return salience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSalience(Expression newSalience, NotificationChain msgs) {
		Expression oldSalience = salience;
		salience = newSalience;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_RULE__SALIENCE, oldSalience, newSalience);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalience(Expression newSalience) {
		if (newSalience != salience) {
			NotificationChain msgs = null;
			if (salience != null)
				msgs = ((InternalEObject)salience).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_RULE__SALIENCE, null, msgs);
			if (newSalience != null)
				msgs = ((InternalEObject)newSalience).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_RULE__SALIENCE, null, msgs);
			msgs = basicSetSalience(newSalience, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_RULE__SALIENCE, newSalience, newSalience));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getNodeIndexHash() {
		return nodeIndexHash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeIndexHash(Expression newNodeIndexHash, NotificationChain msgs) {
		Expression oldNodeIndexHash = nodeIndexHash;
		nodeIndexHash = newNodeIndexHash;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_RULE__NODE_INDEX_HASH, oldNodeIndexHash, newNodeIndexHash);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeIndexHash(Expression newNodeIndexHash) {
		if (newNodeIndexHash != nodeIndexHash) {
			NotificationChain msgs = null;
			if (nodeIndexHash != null)
				msgs = ((InternalEObject)nodeIndexHash).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_RULE__NODE_INDEX_HASH, null, msgs);
			if (newNodeIndexHash != null)
				msgs = ((InternalEObject)newNodeIndexHash).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_RULE__NODE_INDEX_HASH, null, msgs);
			msgs = basicSetNodeIndexHash(newNodeIndexHash, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_RULE__NODE_INDEX_HASH, newNodeIndexHash, newNodeIndexHash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidIdentifier getAutoFocus() {
		return autoFocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutoFocus(ValidIdentifier newAutoFocus, NotificationChain msgs) {
		ValidIdentifier oldAutoFocus = autoFocus;
		autoFocus = newAutoFocus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_RULE__AUTO_FOCUS, oldAutoFocus, newAutoFocus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoFocus(ValidIdentifier newAutoFocus) {
		if (newAutoFocus != autoFocus) {
			NotificationChain msgs = null;
			if (autoFocus != null)
				msgs = ((InternalEObject)autoFocus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_RULE__AUTO_FOCUS, null, msgs);
			if (newAutoFocus != null)
				msgs = ((InternalEObject)newAutoFocus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_RULE__AUTO_FOCUS, null, msgs);
			msgs = basicSetAutoFocus(newAutoFocus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_RULE__AUTO_FOCUS, newAutoFocus, newAutoFocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidIdentifier getNoLoop() {
		return noLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoLoop(ValidIdentifier newNoLoop, NotificationChain msgs) {
		ValidIdentifier oldNoLoop = noLoop;
		noLoop = newNoLoop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_RULE__NO_LOOP, oldNoLoop, newNoLoop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoLoop(ValidIdentifier newNoLoop) {
		if (newNoLoop != noLoop) {
			NotificationChain msgs = null;
			if (noLoop != null)
				msgs = ((InternalEObject)noLoop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_RULE__NO_LOOP, null, msgs);
			if (newNoLoop != null)
				msgs = ((InternalEObject)newNoLoop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_RULE__NO_LOOP, null, msgs);
			msgs = basicSetNoLoop(newNoLoop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_RULE__NO_LOOP, newNoLoop, newNoLoop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.DECLARE_RULE__SALIENCE:
				return basicSetSalience(null, msgs);
			case JessPackage.DECLARE_RULE__NODE_INDEX_HASH:
				return basicSetNodeIndexHash(null, msgs);
			case JessPackage.DECLARE_RULE__AUTO_FOCUS:
				return basicSetAutoFocus(null, msgs);
			case JessPackage.DECLARE_RULE__NO_LOOP:
				return basicSetNoLoop(null, msgs);
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
			case JessPackage.DECLARE_RULE__SALIENCE:
				return getSalience();
			case JessPackage.DECLARE_RULE__NODE_INDEX_HASH:
				return getNodeIndexHash();
			case JessPackage.DECLARE_RULE__AUTO_FOCUS:
				return getAutoFocus();
			case JessPackage.DECLARE_RULE__NO_LOOP:
				return getNoLoop();
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
			case JessPackage.DECLARE_RULE__SALIENCE:
				setSalience((Expression)newValue);
				return;
			case JessPackage.DECLARE_RULE__NODE_INDEX_HASH:
				setNodeIndexHash((Expression)newValue);
				return;
			case JessPackage.DECLARE_RULE__AUTO_FOCUS:
				setAutoFocus((ValidIdentifier)newValue);
				return;
			case JessPackage.DECLARE_RULE__NO_LOOP:
				setNoLoop((ValidIdentifier)newValue);
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
			case JessPackage.DECLARE_RULE__SALIENCE:
				setSalience((Expression)null);
				return;
			case JessPackage.DECLARE_RULE__NODE_INDEX_HASH:
				setNodeIndexHash((Expression)null);
				return;
			case JessPackage.DECLARE_RULE__AUTO_FOCUS:
				setAutoFocus((ValidIdentifier)null);
				return;
			case JessPackage.DECLARE_RULE__NO_LOOP:
				setNoLoop((ValidIdentifier)null);
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
			case JessPackage.DECLARE_RULE__SALIENCE:
				return salience != null;
			case JessPackage.DECLARE_RULE__NODE_INDEX_HASH:
				return nodeIndexHash != null;
			case JessPackage.DECLARE_RULE__AUTO_FOCUS:
				return autoFocus != null;
			case JessPackage.DECLARE_RULE__NO_LOOP:
				return noLoop != null;
		}
		return super.eIsSet(featureID);
	}

} //DeclareRuleImpl
