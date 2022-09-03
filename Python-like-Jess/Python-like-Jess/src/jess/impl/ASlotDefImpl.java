/**
 */
package jess.impl;

import java.util.Collection;

import jess.ASlotDef;
import jess.JessPackage;
import jess.SlotName;
import jess.SlotOptions;

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
 * An implementation of the model object '<em><b>ASlot Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.ASlotDefImpl#getSlotName <em>Slot Name</em>}</li>
 *   <li>{@link jess.impl.ASlotDefImpl#getOptionals <em>Optionals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ASlotDefImpl extends LocatedElementImpl implements ASlotDef {
	/**
	 * The cached value of the '{@link #getSlotName() <em>Slot Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotName()
	 * @generated
	 * @ordered
	 */
	protected SlotName slotName;

	/**
	 * The cached value of the '{@link #getOptionals() <em>Optionals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionals()
	 * @generated
	 * @ordered
	 */
	protected EList<SlotOptions> optionals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASlotDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.ASLOT_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotName getSlotName() {
		return slotName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlotName(SlotName newSlotName, NotificationChain msgs) {
		SlotName oldSlotName = slotName;
		slotName = newSlotName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.ASLOT_DEF__SLOT_NAME, oldSlotName, newSlotName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlotName(SlotName newSlotName) {
		if (newSlotName != slotName) {
			NotificationChain msgs = null;
			if (slotName != null)
				msgs = ((InternalEObject)slotName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.ASLOT_DEF__SLOT_NAME, null, msgs);
			if (newSlotName != null)
				msgs = ((InternalEObject)newSlotName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.ASLOT_DEF__SLOT_NAME, null, msgs);
			msgs = basicSetSlotName(newSlotName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.ASLOT_DEF__SLOT_NAME, newSlotName, newSlotName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SlotOptions> getOptionals() {
		if (optionals == null) {
			optionals = new EObjectContainmentEList<SlotOptions>(SlotOptions.class, this, JessPackage.ASLOT_DEF__OPTIONALS);
		}
		return optionals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.ASLOT_DEF__SLOT_NAME:
				return basicSetSlotName(null, msgs);
			case JessPackage.ASLOT_DEF__OPTIONALS:
				return ((InternalEList<?>)getOptionals()).basicRemove(otherEnd, msgs);
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
			case JessPackage.ASLOT_DEF__SLOT_NAME:
				return getSlotName();
			case JessPackage.ASLOT_DEF__OPTIONALS:
				return getOptionals();
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
			case JessPackage.ASLOT_DEF__SLOT_NAME:
				setSlotName((SlotName)newValue);
				return;
			case JessPackage.ASLOT_DEF__OPTIONALS:
				getOptionals().clear();
				getOptionals().addAll((Collection<? extends SlotOptions>)newValue);
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
			case JessPackage.ASLOT_DEF__SLOT_NAME:
				setSlotName((SlotName)null);
				return;
			case JessPackage.ASLOT_DEF__OPTIONALS:
				getOptionals().clear();
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
			case JessPackage.ASLOT_DEF__SLOT_NAME:
				return slotName != null;
			case JessPackage.ASLOT_DEF__OPTIONALS:
				return optionals != null && !optionals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ASlotDefImpl
