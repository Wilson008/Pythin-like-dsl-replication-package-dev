/**
 */
package csm.impl;

import csm.CSM;
import csm.CsmPackage;
import csm.GeneralResource;
import csm.Message;
import csm.Scenarion;
import csm.Step;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link csm.impl.CSMImpl#getStep <em>Step</em>}</li>
 *   <li>{@link csm.impl.CSMImpl#getGeneralResource <em>General Resource</em>}</li>
 *   <li>{@link csm.impl.CSMImpl#getScenarion <em>Scenarion</em>}</li>
 *   <li>{@link csm.impl.CSMImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSMImpl extends MinimalEObjectImpl.Container implements CSM {
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
	 * The cached value of the '{@link #getGeneralResource() <em>General Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralResource()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralResource> generalResource;

	/**
	 * The cached value of the '{@link #getScenarion() <em>Scenarion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarion()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenarion> scenarion;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> message;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsmPackage.Literals.CSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<Step>(Step.class, this, CsmPackage.CSM__STEP);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralResource> getGeneralResource() {
		if (generalResource == null) {
			generalResource = new EObjectContainmentEList<GeneralResource>(GeneralResource.class, this, CsmPackage.CSM__GENERAL_RESOURCE);
		}
		return generalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenarion> getScenarion() {
		if (scenarion == null) {
			scenarion = new EObjectContainmentEList<Scenarion>(Scenarion.class, this, CsmPackage.CSM__SCENARION);
		}
		return scenarion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessage() {
		if (message == null) {
			message = new EObjectContainmentEList<Message>(Message.class, this, CsmPackage.CSM__MESSAGE);
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsmPackage.CSM__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
			case CsmPackage.CSM__GENERAL_RESOURCE:
				return ((InternalEList<?>)getGeneralResource()).basicRemove(otherEnd, msgs);
			case CsmPackage.CSM__SCENARION:
				return ((InternalEList<?>)getScenarion()).basicRemove(otherEnd, msgs);
			case CsmPackage.CSM__MESSAGE:
				return ((InternalEList<?>)getMessage()).basicRemove(otherEnd, msgs);
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
			case CsmPackage.CSM__STEP:
				return getStep();
			case CsmPackage.CSM__GENERAL_RESOURCE:
				return getGeneralResource();
			case CsmPackage.CSM__SCENARION:
				return getScenarion();
			case CsmPackage.CSM__MESSAGE:
				return getMessage();
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
			case CsmPackage.CSM__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
				return;
			case CsmPackage.CSM__GENERAL_RESOURCE:
				getGeneralResource().clear();
				getGeneralResource().addAll((Collection<? extends GeneralResource>)newValue);
				return;
			case CsmPackage.CSM__SCENARION:
				getScenarion().clear();
				getScenarion().addAll((Collection<? extends Scenarion>)newValue);
				return;
			case CsmPackage.CSM__MESSAGE:
				getMessage().clear();
				getMessage().addAll((Collection<? extends Message>)newValue);
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
			case CsmPackage.CSM__STEP:
				getStep().clear();
				return;
			case CsmPackage.CSM__GENERAL_RESOURCE:
				getGeneralResource().clear();
				return;
			case CsmPackage.CSM__SCENARION:
				getScenarion().clear();
				return;
			case CsmPackage.CSM__MESSAGE:
				getMessage().clear();
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
			case CsmPackage.CSM__STEP:
				return step != null && !step.isEmpty();
			case CsmPackage.CSM__GENERAL_RESOURCE:
				return generalResource != null && !generalResource.isEmpty();
			case CsmPackage.CSM__SCENARION:
				return scenarion != null && !scenarion.isEmpty();
			case CsmPackage.CSM__MESSAGE:
				return message != null && !message.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CSMImpl
