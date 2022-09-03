/**
 */
package jess.impl;

import java.util.Collection;

import jess.Expression;
import jess.JessPackage;
import jess.SlotOptions;
import jess.ValidIdentifier;

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
 * An implementation of the model object '<em><b>Slot Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.SlotOptionsImpl#getType <em>Type</em>}</li>
 *   <li>{@link jess.impl.SlotOptionsImpl#getDef <em>Def</em>}</li>
 *   <li>{@link jess.impl.SlotOptionsImpl#getDefaultDyn <em>Default Dyn</em>}</li>
 *   <li>{@link jess.impl.SlotOptionsImpl#getAllowedValues <em>Allowed Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlotOptionsImpl extends LocatedElementImpl implements SlotOptions {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ValidIdentifier type;

	/**
	 * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDef()
	 * @generated
	 * @ordered
	 */
	protected Expression def;

	/**
	 * The cached value of the '{@link #getDefaultDyn() <em>Default Dyn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDyn()
	 * @generated
	 * @ordered
	 */
	protected Expression defaultDyn;

	/**
	 * The cached value of the '{@link #getAllowedValues() <em>Allowed Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> allowedValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.SLOT_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidIdentifier getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ValidIdentifier newType, NotificationChain msgs) {
		ValidIdentifier oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.SLOT_OPTIONS__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ValidIdentifier newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.SLOT_OPTIONS__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.SLOT_OPTIONS__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.SLOT_OPTIONS__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDef() {
		return def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDef(Expression newDef, NotificationChain msgs) {
		Expression oldDef = def;
		def = newDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.SLOT_OPTIONS__DEF, oldDef, newDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDef(Expression newDef) {
		if (newDef != def) {
			NotificationChain msgs = null;
			if (def != null)
				msgs = ((InternalEObject)def).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.SLOT_OPTIONS__DEF, null, msgs);
			if (newDef != null)
				msgs = ((InternalEObject)newDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.SLOT_OPTIONS__DEF, null, msgs);
			msgs = basicSetDef(newDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.SLOT_OPTIONS__DEF, newDef, newDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDefaultDyn() {
		return defaultDyn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultDyn(Expression newDefaultDyn, NotificationChain msgs) {
		Expression oldDefaultDyn = defaultDyn;
		defaultDyn = newDefaultDyn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.SLOT_OPTIONS__DEFAULT_DYN, oldDefaultDyn, newDefaultDyn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultDyn(Expression newDefaultDyn) {
		if (newDefaultDyn != defaultDyn) {
			NotificationChain msgs = null;
			if (defaultDyn != null)
				msgs = ((InternalEObject)defaultDyn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.SLOT_OPTIONS__DEFAULT_DYN, null, msgs);
			if (newDefaultDyn != null)
				msgs = ((InternalEObject)newDefaultDyn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.SLOT_OPTIONS__DEFAULT_DYN, null, msgs);
			msgs = basicSetDefaultDyn(newDefaultDyn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.SLOT_OPTIONS__DEFAULT_DYN, newDefaultDyn, newDefaultDyn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getAllowedValues() {
		if (allowedValues == null) {
			allowedValues = new EObjectContainmentEList<Expression>(Expression.class, this, JessPackage.SLOT_OPTIONS__ALLOWED_VALUES);
		}
		return allowedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.SLOT_OPTIONS__TYPE:
				return basicSetType(null, msgs);
			case JessPackage.SLOT_OPTIONS__DEF:
				return basicSetDef(null, msgs);
			case JessPackage.SLOT_OPTIONS__DEFAULT_DYN:
				return basicSetDefaultDyn(null, msgs);
			case JessPackage.SLOT_OPTIONS__ALLOWED_VALUES:
				return ((InternalEList<?>)getAllowedValues()).basicRemove(otherEnd, msgs);
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
			case JessPackage.SLOT_OPTIONS__TYPE:
				return getType();
			case JessPackage.SLOT_OPTIONS__DEF:
				return getDef();
			case JessPackage.SLOT_OPTIONS__DEFAULT_DYN:
				return getDefaultDyn();
			case JessPackage.SLOT_OPTIONS__ALLOWED_VALUES:
				return getAllowedValues();
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
			case JessPackage.SLOT_OPTIONS__TYPE:
				setType((ValidIdentifier)newValue);
				return;
			case JessPackage.SLOT_OPTIONS__DEF:
				setDef((Expression)newValue);
				return;
			case JessPackage.SLOT_OPTIONS__DEFAULT_DYN:
				setDefaultDyn((Expression)newValue);
				return;
			case JessPackage.SLOT_OPTIONS__ALLOWED_VALUES:
				getAllowedValues().clear();
				getAllowedValues().addAll((Collection<? extends Expression>)newValue);
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
			case JessPackage.SLOT_OPTIONS__TYPE:
				setType((ValidIdentifier)null);
				return;
			case JessPackage.SLOT_OPTIONS__DEF:
				setDef((Expression)null);
				return;
			case JessPackage.SLOT_OPTIONS__DEFAULT_DYN:
				setDefaultDyn((Expression)null);
				return;
			case JessPackage.SLOT_OPTIONS__ALLOWED_VALUES:
				getAllowedValues().clear();
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
			case JessPackage.SLOT_OPTIONS__TYPE:
				return type != null;
			case JessPackage.SLOT_OPTIONS__DEF:
				return def != null;
			case JessPackage.SLOT_OPTIONS__DEFAULT_DYN:
				return defaultDyn != null;
			case JessPackage.SLOT_OPTIONS__ALLOWED_VALUES:
				return allowedValues != null && !allowedValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SlotOptionsImpl
