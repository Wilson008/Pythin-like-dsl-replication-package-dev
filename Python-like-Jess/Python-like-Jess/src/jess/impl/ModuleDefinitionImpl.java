/**
 */
package jess.impl;

import jess.JessPackage;
import jess.ModuleDefinition;
import jess.Str;
import jess.ValidIdentifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.ModuleDefinitionImpl#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link jess.impl.ModuleDefinitionImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleDefinitionImpl extends DefinitionExpImpl implements ModuleDefinition {
	/**
	 * The cached value of the '{@link #getModuleName() <em>Module Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected ValidIdentifier moduleName;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected Str documentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.MODULE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidIdentifier getModuleName() {
		return moduleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleName(ValidIdentifier newModuleName, NotificationChain msgs) {
		ValidIdentifier oldModuleName = moduleName;
		moduleName = newModuleName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.MODULE_DEFINITION__MODULE_NAME, oldModuleName, newModuleName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleName(ValidIdentifier newModuleName) {
		if (newModuleName != moduleName) {
			NotificationChain msgs = null;
			if (moduleName != null)
				msgs = ((InternalEObject)moduleName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.MODULE_DEFINITION__MODULE_NAME, null, msgs);
			if (newModuleName != null)
				msgs = ((InternalEObject)newModuleName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.MODULE_DEFINITION__MODULE_NAME, null, msgs);
			msgs = basicSetModuleName(newModuleName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.MODULE_DEFINITION__MODULE_NAME, newModuleName, newModuleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Str getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(Str newDocumentation, NotificationChain msgs) {
		Str oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.MODULE_DEFINITION__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(Str newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.MODULE_DEFINITION__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.MODULE_DEFINITION__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.MODULE_DEFINITION__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.MODULE_DEFINITION__MODULE_NAME:
				return basicSetModuleName(null, msgs);
			case JessPackage.MODULE_DEFINITION__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
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
			case JessPackage.MODULE_DEFINITION__MODULE_NAME:
				return getModuleName();
			case JessPackage.MODULE_DEFINITION__DOCUMENTATION:
				return getDocumentation();
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
			case JessPackage.MODULE_DEFINITION__MODULE_NAME:
				setModuleName((ValidIdentifier)newValue);
				return;
			case JessPackage.MODULE_DEFINITION__DOCUMENTATION:
				setDocumentation((Str)newValue);
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
			case JessPackage.MODULE_DEFINITION__MODULE_NAME:
				setModuleName((ValidIdentifier)null);
				return;
			case JessPackage.MODULE_DEFINITION__DOCUMENTATION:
				setDocumentation((Str)null);
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
			case JessPackage.MODULE_DEFINITION__MODULE_NAME:
				return moduleName != null;
			case JessPackage.MODULE_DEFINITION__DOCUMENTATION:
				return documentation != null;
		}
		return super.eIsSet(featureID);
	}

} //ModuleDefinitionImpl
