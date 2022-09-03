/**
 */
package csm.impl;

import csm.CsmPackage;
import csm.PathConnection;
import csm.Scenarion;
import csm.Start;
import csm.Step;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenarion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link csm.impl.ScenarionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link csm.impl.ScenarionImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link csm.impl.ScenarionImpl#getPathconnection <em>Pathconnection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarionImpl extends MinimalEObjectImpl.Container implements Scenarion {
	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> step;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected EList<Start> root;

	/**
	 * The cached value of the '{@link #getPathconnection() <em>Pathconnection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathconnection()
	 * @generated
	 * @ordered
	 */
	protected EList<PathConnection> pathconnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsmPackage.Literals.SCENARION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<Step>(Step.class, this, CsmPackage.SCENARION__STEP);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Start> getRoot() {
		if (root == null) {
			root = new EObjectResolvingEList<Start>(Start.class, this, CsmPackage.SCENARION__ROOT);
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathConnection> getPathconnection() {
		if (pathconnection == null) {
			pathconnection = new EObjectContainmentEList<PathConnection>(PathConnection.class, this, CsmPackage.SCENARION__PATHCONNECTION);
		}
		return pathconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsmPackage.SCENARION__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
			case CsmPackage.SCENARION__PATHCONNECTION:
				return ((InternalEList<?>)getPathconnection()).basicRemove(otherEnd, msgs);
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
			case CsmPackage.SCENARION__STEP:
				return getStep();
			case CsmPackage.SCENARION__ROOT:
				return getRoot();
			case CsmPackage.SCENARION__PATHCONNECTION:
				return getPathconnection();
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
			case CsmPackage.SCENARION__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
				return;
			case CsmPackage.SCENARION__ROOT:
				getRoot().clear();
				getRoot().addAll((Collection<? extends Start>)newValue);
				return;
			case CsmPackage.SCENARION__PATHCONNECTION:
				getPathconnection().clear();
				getPathconnection().addAll((Collection<? extends PathConnection>)newValue);
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
			case CsmPackage.SCENARION__STEP:
				getStep().clear();
				return;
			case CsmPackage.SCENARION__ROOT:
				getRoot().clear();
				return;
			case CsmPackage.SCENARION__PATHCONNECTION:
				getPathconnection().clear();
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
			case CsmPackage.SCENARION__STEP:
				return step != null && !step.isEmpty();
			case CsmPackage.SCENARION__ROOT:
				return root != null && !root.isEmpty();
			case CsmPackage.SCENARION__PATHCONNECTION:
				return pathconnection != null && !pathconnection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScenarionImpl
