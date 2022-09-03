/**
 */
package jess.impl;

import java.util.Collection;

import jess.Expression;
import jess.FactDefinition;
import jess.JessPackage;
import jess.Str;
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
 * An implementation of the model object '<em><b>Fact Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.FactDefinitionImpl#getFactName <em>Fact Name</em>}</li>
 *   <li>{@link jess.impl.FactDefinitionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link jess.impl.FactDefinitionImpl#getFact <em>Fact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactDefinitionImpl extends DefinitionExpImpl implements FactDefinition {
	/**
	 * The cached value of the '{@link #getFactName() <em>Fact Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactName()
	 * @generated
	 * @ordered
	 */
	protected ValidIdentifier factName;

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
	 * The cached value of the '{@link #getFact() <em>Fact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFact()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> fact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.FACT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidIdentifier getFactName() {
		return factName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactName(ValidIdentifier newFactName, NotificationChain msgs) {
		ValidIdentifier oldFactName = factName;
		factName = newFactName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.FACT_DEFINITION__FACT_NAME, oldFactName, newFactName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactName(ValidIdentifier newFactName) {
		if (newFactName != factName) {
			NotificationChain msgs = null;
			if (factName != null)
				msgs = ((InternalEObject)factName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.FACT_DEFINITION__FACT_NAME, null, msgs);
			if (newFactName != null)
				msgs = ((InternalEObject)newFactName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.FACT_DEFINITION__FACT_NAME, null, msgs);
			msgs = basicSetFactName(newFactName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.FACT_DEFINITION__FACT_NAME, newFactName, newFactName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.FACT_DEFINITION__DOCUMENTATION, oldDocumentation, newDocumentation);
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
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.FACT_DEFINITION__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.FACT_DEFINITION__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.FACT_DEFINITION__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getFact() {
		if (fact == null) {
			fact = new EObjectContainmentEList<Expression>(Expression.class, this, JessPackage.FACT_DEFINITION__FACT);
		}
		return fact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.FACT_DEFINITION__FACT_NAME:
				return basicSetFactName(null, msgs);
			case JessPackage.FACT_DEFINITION__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case JessPackage.FACT_DEFINITION__FACT:
				return ((InternalEList<?>)getFact()).basicRemove(otherEnd, msgs);
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
			case JessPackage.FACT_DEFINITION__FACT_NAME:
				return getFactName();
			case JessPackage.FACT_DEFINITION__DOCUMENTATION:
				return getDocumentation();
			case JessPackage.FACT_DEFINITION__FACT:
				return getFact();
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
			case JessPackage.FACT_DEFINITION__FACT_NAME:
				setFactName((ValidIdentifier)newValue);
				return;
			case JessPackage.FACT_DEFINITION__DOCUMENTATION:
				setDocumentation((Str)newValue);
				return;
			case JessPackage.FACT_DEFINITION__FACT:
				getFact().clear();
				getFact().addAll((Collection<? extends Expression>)newValue);
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
			case JessPackage.FACT_DEFINITION__FACT_NAME:
				setFactName((ValidIdentifier)null);
				return;
			case JessPackage.FACT_DEFINITION__DOCUMENTATION:
				setDocumentation((Str)null);
				return;
			case JessPackage.FACT_DEFINITION__FACT:
				getFact().clear();
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
			case JessPackage.FACT_DEFINITION__FACT_NAME:
				return factName != null;
			case JessPackage.FACT_DEFINITION__DOCUMENTATION:
				return documentation != null;
			case JessPackage.FACT_DEFINITION__FACT:
				return fact != null && !fact.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FactDefinitionImpl
