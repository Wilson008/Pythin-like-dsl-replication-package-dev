/**
 */
package jess.impl;

import jess.DeclareBloc;
import jess.JessPackage;
import jess.ValidIdentifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declare Bloc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.DeclareBlocImpl#getSlotSpecific <em>Slot Specific</em>}</li>
 *   <li>{@link jess.impl.DeclareBlocImpl#getBackchainReaction <em>Backchain Reaction</em>}</li>
 *   <li>{@link jess.impl.DeclareBlocImpl#getFromClass <em>From Class</em>}</li>
 *   <li>{@link jess.impl.DeclareBlocImpl#getIncludeVariable <em>Include Variable</em>}</li>
 *   <li>{@link jess.impl.DeclareBlocImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclareBlocImpl extends LocatedElementImpl implements DeclareBloc {
	/**
	 * The cached value of the '{@link #getSlotSpecific() <em>Slot Specific</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotSpecific()
	 * @generated
	 * @ordered
	 */
	protected ValidIdentifier slotSpecific;

	/**
	 * The cached value of the '{@link #getBackchainReaction() <em>Backchain Reaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackchainReaction()
	 * @generated
	 * @ordered
	 */
	protected ValidIdentifier backchainReaction;

	/**
	 * The cached value of the '{@link #getFromClass() <em>From Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromClass()
	 * @generated
	 * @ordered
	 */
	protected ValidIdentifier fromClass;

	/**
	 * The cached value of the '{@link #getIncludeVariable() <em>Include Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeVariable()
	 * @generated
	 * @ordered
	 */
	protected ValidIdentifier includeVariable;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected ValidIdentifier order;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclareBlocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.DECLARE_BLOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidIdentifier getSlotSpecific() {
		return slotSpecific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlotSpecific(ValidIdentifier newSlotSpecific, NotificationChain msgs) {
		ValidIdentifier oldSlotSpecific = slotSpecific;
		slotSpecific = newSlotSpecific;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_BLOC__SLOT_SPECIFIC, oldSlotSpecific, newSlotSpecific);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlotSpecific(ValidIdentifier newSlotSpecific) {
		if (newSlotSpecific != slotSpecific) {
			NotificationChain msgs = null;
			if (slotSpecific != null)
				msgs = ((InternalEObject)slotSpecific).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_BLOC__SLOT_SPECIFIC, null, msgs);
			if (newSlotSpecific != null)
				msgs = ((InternalEObject)newSlotSpecific).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_BLOC__SLOT_SPECIFIC, null, msgs);
			msgs = basicSetSlotSpecific(newSlotSpecific, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_BLOC__SLOT_SPECIFIC, newSlotSpecific, newSlotSpecific));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidIdentifier getBackchainReaction() {
		return backchainReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackchainReaction(ValidIdentifier newBackchainReaction, NotificationChain msgs) {
		ValidIdentifier oldBackchainReaction = backchainReaction;
		backchainReaction = newBackchainReaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_BLOC__BACKCHAIN_REACTION, oldBackchainReaction, newBackchainReaction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackchainReaction(ValidIdentifier newBackchainReaction) {
		if (newBackchainReaction != backchainReaction) {
			NotificationChain msgs = null;
			if (backchainReaction != null)
				msgs = ((InternalEObject)backchainReaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_BLOC__BACKCHAIN_REACTION, null, msgs);
			if (newBackchainReaction != null)
				msgs = ((InternalEObject)newBackchainReaction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_BLOC__BACKCHAIN_REACTION, null, msgs);
			msgs = basicSetBackchainReaction(newBackchainReaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_BLOC__BACKCHAIN_REACTION, newBackchainReaction, newBackchainReaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidIdentifier getFromClass() {
		return fromClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromClass(ValidIdentifier newFromClass, NotificationChain msgs) {
		ValidIdentifier oldFromClass = fromClass;
		fromClass = newFromClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_BLOC__FROM_CLASS, oldFromClass, newFromClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromClass(ValidIdentifier newFromClass) {
		if (newFromClass != fromClass) {
			NotificationChain msgs = null;
			if (fromClass != null)
				msgs = ((InternalEObject)fromClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_BLOC__FROM_CLASS, null, msgs);
			if (newFromClass != null)
				msgs = ((InternalEObject)newFromClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_BLOC__FROM_CLASS, null, msgs);
			msgs = basicSetFromClass(newFromClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_BLOC__FROM_CLASS, newFromClass, newFromClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidIdentifier getIncludeVariable() {
		return includeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludeVariable(ValidIdentifier newIncludeVariable, NotificationChain msgs) {
		ValidIdentifier oldIncludeVariable = includeVariable;
		includeVariable = newIncludeVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_BLOC__INCLUDE_VARIABLE, oldIncludeVariable, newIncludeVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeVariable(ValidIdentifier newIncludeVariable) {
		if (newIncludeVariable != includeVariable) {
			NotificationChain msgs = null;
			if (includeVariable != null)
				msgs = ((InternalEObject)includeVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_BLOC__INCLUDE_VARIABLE, null, msgs);
			if (newIncludeVariable != null)
				msgs = ((InternalEObject)newIncludeVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_BLOC__INCLUDE_VARIABLE, null, msgs);
			msgs = basicSetIncludeVariable(newIncludeVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_BLOC__INCLUDE_VARIABLE, newIncludeVariable, newIncludeVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidIdentifier getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrder(ValidIdentifier newOrder, NotificationChain msgs) {
		ValidIdentifier oldOrder = order;
		order = newOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_BLOC__ORDER, oldOrder, newOrder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(ValidIdentifier newOrder) {
		if (newOrder != order) {
			NotificationChain msgs = null;
			if (order != null)
				msgs = ((InternalEObject)order).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_BLOC__ORDER, null, msgs);
			if (newOrder != null)
				msgs = ((InternalEObject)newOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.DECLARE_BLOC__ORDER, null, msgs);
			msgs = basicSetOrder(newOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.DECLARE_BLOC__ORDER, newOrder, newOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.DECLARE_BLOC__SLOT_SPECIFIC:
				return basicSetSlotSpecific(null, msgs);
			case JessPackage.DECLARE_BLOC__BACKCHAIN_REACTION:
				return basicSetBackchainReaction(null, msgs);
			case JessPackage.DECLARE_BLOC__FROM_CLASS:
				return basicSetFromClass(null, msgs);
			case JessPackage.DECLARE_BLOC__INCLUDE_VARIABLE:
				return basicSetIncludeVariable(null, msgs);
			case JessPackage.DECLARE_BLOC__ORDER:
				return basicSetOrder(null, msgs);
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
			case JessPackage.DECLARE_BLOC__SLOT_SPECIFIC:
				return getSlotSpecific();
			case JessPackage.DECLARE_BLOC__BACKCHAIN_REACTION:
				return getBackchainReaction();
			case JessPackage.DECLARE_BLOC__FROM_CLASS:
				return getFromClass();
			case JessPackage.DECLARE_BLOC__INCLUDE_VARIABLE:
				return getIncludeVariable();
			case JessPackage.DECLARE_BLOC__ORDER:
				return getOrder();
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
			case JessPackage.DECLARE_BLOC__SLOT_SPECIFIC:
				setSlotSpecific((ValidIdentifier)newValue);
				return;
			case JessPackage.DECLARE_BLOC__BACKCHAIN_REACTION:
				setBackchainReaction((ValidIdentifier)newValue);
				return;
			case JessPackage.DECLARE_BLOC__FROM_CLASS:
				setFromClass((ValidIdentifier)newValue);
				return;
			case JessPackage.DECLARE_BLOC__INCLUDE_VARIABLE:
				setIncludeVariable((ValidIdentifier)newValue);
				return;
			case JessPackage.DECLARE_BLOC__ORDER:
				setOrder((ValidIdentifier)newValue);
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
			case JessPackage.DECLARE_BLOC__SLOT_SPECIFIC:
				setSlotSpecific((ValidIdentifier)null);
				return;
			case JessPackage.DECLARE_BLOC__BACKCHAIN_REACTION:
				setBackchainReaction((ValidIdentifier)null);
				return;
			case JessPackage.DECLARE_BLOC__FROM_CLASS:
				setFromClass((ValidIdentifier)null);
				return;
			case JessPackage.DECLARE_BLOC__INCLUDE_VARIABLE:
				setIncludeVariable((ValidIdentifier)null);
				return;
			case JessPackage.DECLARE_BLOC__ORDER:
				setOrder((ValidIdentifier)null);
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
			case JessPackage.DECLARE_BLOC__SLOT_SPECIFIC:
				return slotSpecific != null;
			case JessPackage.DECLARE_BLOC__BACKCHAIN_REACTION:
				return backchainReaction != null;
			case JessPackage.DECLARE_BLOC__FROM_CLASS:
				return fromClass != null;
			case JessPackage.DECLARE_BLOC__INCLUDE_VARIABLE:
				return includeVariable != null;
			case JessPackage.DECLARE_BLOC__ORDER:
				return order != null;
		}
		return super.eIsSet(featureID);
	}

} //DeclareBlocImpl
