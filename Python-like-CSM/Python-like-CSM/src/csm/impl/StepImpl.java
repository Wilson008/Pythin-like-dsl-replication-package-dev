/**
 */
package csm.impl;

import csm.ActiveResource;
import csm.CsmPackage;
import csm.PathConnection;
import csm.Step;
import csm.Workload;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link csm.impl.StepImpl#getName <em>Name</em>}</li>
 *   <li>{@link csm.impl.StepImpl#getPostPath <em>Post Path</em>}</li>
 *   <li>{@link csm.impl.StepImpl#getPrePath <em>Pre Path</em>}</li>
 *   <li>{@link csm.impl.StepImpl#getActiveResource <em>Active Resource</em>}</li>
 *   <li>{@link csm.impl.StepImpl#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StepImpl extends MinimalEObjectImpl.Container implements Step {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPostPath() <em>Post Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostPath()
	 * @generated
	 * @ordered
	 */
	protected PathConnection postPath;

	/**
	 * The cached value of the '{@link #getPrePath() <em>Pre Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrePath()
	 * @generated
	 * @ordered
	 */
	protected PathConnection prePath;

	/**
	 * The cached value of the '{@link #getActiveResource() <em>Active Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveResource()
	 * @generated
	 * @ordered
	 */
	protected ActiveResource activeResource;

	/**
	 * The cached value of the '{@link #getWorkload() <em>Workload</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkload()
	 * @generated
	 * @ordered
	 */
	protected EList<Workload> workload;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsmPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsmPackage.STEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathConnection getPostPath() {
		if (postPath != null && postPath.eIsProxy()) {
			InternalEObject oldPostPath = (InternalEObject)postPath;
			postPath = (PathConnection)eResolveProxy(oldPostPath);
			if (postPath != oldPostPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsmPackage.STEP__POST_PATH, oldPostPath, postPath));
			}
		}
		return postPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathConnection basicGetPostPath() {
		return postPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostPath(PathConnection newPostPath, NotificationChain msgs) {
		PathConnection oldPostPath = postPath;
		postPath = newPostPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsmPackage.STEP__POST_PATH, oldPostPath, newPostPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostPath(PathConnection newPostPath) {
		if (newPostPath != postPath) {
			NotificationChain msgs = null;
			if (postPath != null)
				msgs = ((InternalEObject)postPath).eInverseRemove(this, CsmPackage.PATH_CONNECTION__POST, PathConnection.class, msgs);
			if (newPostPath != null)
				msgs = ((InternalEObject)newPostPath).eInverseAdd(this, CsmPackage.PATH_CONNECTION__POST, PathConnection.class, msgs);
			msgs = basicSetPostPath(newPostPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsmPackage.STEP__POST_PATH, newPostPath, newPostPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathConnection getPrePath() {
		if (prePath != null && prePath.eIsProxy()) {
			InternalEObject oldPrePath = (InternalEObject)prePath;
			prePath = (PathConnection)eResolveProxy(oldPrePath);
			if (prePath != oldPrePath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsmPackage.STEP__PRE_PATH, oldPrePath, prePath));
			}
		}
		return prePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathConnection basicGetPrePath() {
		return prePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrePath(PathConnection newPrePath, NotificationChain msgs) {
		PathConnection oldPrePath = prePath;
		prePath = newPrePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsmPackage.STEP__PRE_PATH, oldPrePath, newPrePath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrePath(PathConnection newPrePath) {
		if (newPrePath != prePath) {
			NotificationChain msgs = null;
			if (prePath != null)
				msgs = ((InternalEObject)prePath).eInverseRemove(this, CsmPackage.PATH_CONNECTION__PRE, PathConnection.class, msgs);
			if (newPrePath != null)
				msgs = ((InternalEObject)newPrePath).eInverseAdd(this, CsmPackage.PATH_CONNECTION__PRE, PathConnection.class, msgs);
			msgs = basicSetPrePath(newPrePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsmPackage.STEP__PRE_PATH, newPrePath, newPrePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveResource getActiveResource() {
		if (activeResource != null && activeResource.eIsProxy()) {
			InternalEObject oldActiveResource = (InternalEObject)activeResource;
			activeResource = (ActiveResource)eResolveProxy(oldActiveResource);
			if (activeResource != oldActiveResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsmPackage.STEP__ACTIVE_RESOURCE, oldActiveResource, activeResource));
			}
		}
		return activeResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveResource basicGetActiveResource() {
		return activeResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActiveResource(ActiveResource newActiveResource, NotificationChain msgs) {
		ActiveResource oldActiveResource = activeResource;
		activeResource = newActiveResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsmPackage.STEP__ACTIVE_RESOURCE, oldActiveResource, newActiveResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveResource(ActiveResource newActiveResource) {
		if (newActiveResource != activeResource) {
			NotificationChain msgs = null;
			if (activeResource != null)
				msgs = ((InternalEObject)activeResource).eInverseRemove(this, CsmPackage.ACTIVE_RESOURCE__STEP, ActiveResource.class, msgs);
			if (newActiveResource != null)
				msgs = ((InternalEObject)newActiveResource).eInverseAdd(this, CsmPackage.ACTIVE_RESOURCE__STEP, ActiveResource.class, msgs);
			msgs = basicSetActiveResource(newActiveResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsmPackage.STEP__ACTIVE_RESOURCE, newActiveResource, newActiveResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workload> getWorkload() {
		if (workload == null) {
			workload = new EObjectContainmentEList<Workload>(Workload.class, this, CsmPackage.STEP__WORKLOAD);
		}
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsmPackage.STEP__POST_PATH:
				if (postPath != null)
					msgs = ((InternalEObject)postPath).eInverseRemove(this, CsmPackage.PATH_CONNECTION__POST, PathConnection.class, msgs);
				return basicSetPostPath((PathConnection)otherEnd, msgs);
			case CsmPackage.STEP__PRE_PATH:
				if (prePath != null)
					msgs = ((InternalEObject)prePath).eInverseRemove(this, CsmPackage.PATH_CONNECTION__PRE, PathConnection.class, msgs);
				return basicSetPrePath((PathConnection)otherEnd, msgs);
			case CsmPackage.STEP__ACTIVE_RESOURCE:
				if (activeResource != null)
					msgs = ((InternalEObject)activeResource).eInverseRemove(this, CsmPackage.ACTIVE_RESOURCE__STEP, ActiveResource.class, msgs);
				return basicSetActiveResource((ActiveResource)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsmPackage.STEP__POST_PATH:
				return basicSetPostPath(null, msgs);
			case CsmPackage.STEP__PRE_PATH:
				return basicSetPrePath(null, msgs);
			case CsmPackage.STEP__ACTIVE_RESOURCE:
				return basicSetActiveResource(null, msgs);
			case CsmPackage.STEP__WORKLOAD:
				return ((InternalEList<?>)getWorkload()).basicRemove(otherEnd, msgs);
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
			case CsmPackage.STEP__NAME:
				return getName();
			case CsmPackage.STEP__POST_PATH:
				if (resolve) return getPostPath();
				return basicGetPostPath();
			case CsmPackage.STEP__PRE_PATH:
				if (resolve) return getPrePath();
				return basicGetPrePath();
			case CsmPackage.STEP__ACTIVE_RESOURCE:
				if (resolve) return getActiveResource();
				return basicGetActiveResource();
			case CsmPackage.STEP__WORKLOAD:
				return getWorkload();
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
			case CsmPackage.STEP__NAME:
				setName((String)newValue);
				return;
			case CsmPackage.STEP__POST_PATH:
				setPostPath((PathConnection)newValue);
				return;
			case CsmPackage.STEP__PRE_PATH:
				setPrePath((PathConnection)newValue);
				return;
			case CsmPackage.STEP__ACTIVE_RESOURCE:
				setActiveResource((ActiveResource)newValue);
				return;
			case CsmPackage.STEP__WORKLOAD:
				getWorkload().clear();
				getWorkload().addAll((Collection<? extends Workload>)newValue);
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
			case CsmPackage.STEP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CsmPackage.STEP__POST_PATH:
				setPostPath((PathConnection)null);
				return;
			case CsmPackage.STEP__PRE_PATH:
				setPrePath((PathConnection)null);
				return;
			case CsmPackage.STEP__ACTIVE_RESOURCE:
				setActiveResource((ActiveResource)null);
				return;
			case CsmPackage.STEP__WORKLOAD:
				getWorkload().clear();
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
			case CsmPackage.STEP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CsmPackage.STEP__POST_PATH:
				return postPath != null;
			case CsmPackage.STEP__PRE_PATH:
				return prePath != null;
			case CsmPackage.STEP__ACTIVE_RESOURCE:
				return activeResource != null;
			case CsmPackage.STEP__WORKLOAD:
				return workload != null && !workload.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StepImpl
