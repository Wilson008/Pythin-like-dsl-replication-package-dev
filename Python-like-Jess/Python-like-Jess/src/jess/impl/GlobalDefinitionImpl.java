/**
 */
package jess.impl;

import java.util.Collection;

import jess.GlobalDefinition;
import jess.JessPackage;
import jess.VarDefinition;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.GlobalDefinitionImpl#getVarDef <em>Var Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalDefinitionImpl extends DefinitionExpImpl implements GlobalDefinition {
	/**
	 * The cached value of the '{@link #getVarDef() <em>Var Def</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarDef()
	 * @generated
	 * @ordered
	 */
	protected EList<VarDefinition> varDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.GLOBAL_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarDefinition> getVarDef() {
		if (varDef == null) {
			varDef = new EObjectContainmentEList<VarDefinition>(VarDefinition.class, this, JessPackage.GLOBAL_DEFINITION__VAR_DEF);
		}
		return varDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.GLOBAL_DEFINITION__VAR_DEF:
				return ((InternalEList<?>)getVarDef()).basicRemove(otherEnd, msgs);
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
			case JessPackage.GLOBAL_DEFINITION__VAR_DEF:
				return getVarDef();
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
			case JessPackage.GLOBAL_DEFINITION__VAR_DEF:
				getVarDef().clear();
				getVarDef().addAll((Collection<? extends VarDefinition>)newValue);
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
			case JessPackage.GLOBAL_DEFINITION__VAR_DEF:
				getVarDef().clear();
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
			case JessPackage.GLOBAL_DEFINITION__VAR_DEF:
				return varDef != null && !varDef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GlobalDefinitionImpl
