/**
 */
package jess.impl;

import java.util.Collection;

import jess.DeclareRule;
import jess.Expression;
import jess.JessPackage;
import jess.RuleDefinition;
import jess.Str;
import jess.UseFuncExp;
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
 * An implementation of the model object '<em><b>Rule Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.RuleDefinitionImpl#getRuleName <em>Rule Name</em>}</li>
 *   <li>{@link jess.impl.RuleDefinitionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link jess.impl.RuleDefinitionImpl#getDeclare <em>Declare</em>}</li>
 *   <li>{@link jess.impl.RuleDefinitionImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link jess.impl.RuleDefinitionImpl#getFunctionCall <em>Function Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleDefinitionImpl extends DefinitionExpImpl implements RuleDefinition {
	/**
	 * The cached value of the '{@link #getRuleName() <em>Rule Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleName()
	 * @generated
	 * @ordered
	 */
	protected ValidIdentifier ruleName;

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
	 * The cached value of the '{@link #getDeclare() <em>Declare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclare()
	 * @generated
	 * @ordered
	 */
	protected DeclareRule declare;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> conditions;

	/**
	 * The cached value of the '{@link #getFunctionCall() <em>Function Call</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionCall()
	 * @generated
	 * @ordered
	 */
	protected EList<UseFuncExp> functionCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.RULE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidIdentifier getRuleName() {
		return ruleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleName(ValidIdentifier newRuleName, NotificationChain msgs) {
		ValidIdentifier oldRuleName = ruleName;
		ruleName = newRuleName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.RULE_DEFINITION__RULE_NAME, oldRuleName, newRuleName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleName(ValidIdentifier newRuleName) {
		if (newRuleName != ruleName) {
			NotificationChain msgs = null;
			if (ruleName != null)
				msgs = ((InternalEObject)ruleName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.RULE_DEFINITION__RULE_NAME, null, msgs);
			if (newRuleName != null)
				msgs = ((InternalEObject)newRuleName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.RULE_DEFINITION__RULE_NAME, null, msgs);
			msgs = basicSetRuleName(newRuleName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.RULE_DEFINITION__RULE_NAME, newRuleName, newRuleName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.RULE_DEFINITION__DOCUMENTATION, oldDocumentation, newDocumentation);
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
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.RULE_DEFINITION__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.RULE_DEFINITION__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.RULE_DEFINITION__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareRule getDeclare() {
		return declare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclare(DeclareRule newDeclare, NotificationChain msgs) {
		DeclareRule oldDeclare = declare;
		declare = newDeclare;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.RULE_DEFINITION__DECLARE, oldDeclare, newDeclare);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclare(DeclareRule newDeclare) {
		if (newDeclare != declare) {
			NotificationChain msgs = null;
			if (declare != null)
				msgs = ((InternalEObject)declare).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.RULE_DEFINITION__DECLARE, null, msgs);
			if (newDeclare != null)
				msgs = ((InternalEObject)newDeclare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.RULE_DEFINITION__DECLARE, null, msgs);
			msgs = basicSetDeclare(newDeclare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.RULE_DEFINITION__DECLARE, newDeclare, newDeclare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Expression>(Expression.class, this, JessPackage.RULE_DEFINITION__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseFuncExp> getFunctionCall() {
		if (functionCall == null) {
			functionCall = new EObjectContainmentEList<UseFuncExp>(UseFuncExp.class, this, JessPackage.RULE_DEFINITION__FUNCTION_CALL);
		}
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.RULE_DEFINITION__RULE_NAME:
				return basicSetRuleName(null, msgs);
			case JessPackage.RULE_DEFINITION__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case JessPackage.RULE_DEFINITION__DECLARE:
				return basicSetDeclare(null, msgs);
			case JessPackage.RULE_DEFINITION__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case JessPackage.RULE_DEFINITION__FUNCTION_CALL:
				return ((InternalEList<?>)getFunctionCall()).basicRemove(otherEnd, msgs);
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
			case JessPackage.RULE_DEFINITION__RULE_NAME:
				return getRuleName();
			case JessPackage.RULE_DEFINITION__DOCUMENTATION:
				return getDocumentation();
			case JessPackage.RULE_DEFINITION__DECLARE:
				return getDeclare();
			case JessPackage.RULE_DEFINITION__CONDITIONS:
				return getConditions();
			case JessPackage.RULE_DEFINITION__FUNCTION_CALL:
				return getFunctionCall();
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
			case JessPackage.RULE_DEFINITION__RULE_NAME:
				setRuleName((ValidIdentifier)newValue);
				return;
			case JessPackage.RULE_DEFINITION__DOCUMENTATION:
				setDocumentation((Str)newValue);
				return;
			case JessPackage.RULE_DEFINITION__DECLARE:
				setDeclare((DeclareRule)newValue);
				return;
			case JessPackage.RULE_DEFINITION__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Expression>)newValue);
				return;
			case JessPackage.RULE_DEFINITION__FUNCTION_CALL:
				getFunctionCall().clear();
				getFunctionCall().addAll((Collection<? extends UseFuncExp>)newValue);
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
			case JessPackage.RULE_DEFINITION__RULE_NAME:
				setRuleName((ValidIdentifier)null);
				return;
			case JessPackage.RULE_DEFINITION__DOCUMENTATION:
				setDocumentation((Str)null);
				return;
			case JessPackage.RULE_DEFINITION__DECLARE:
				setDeclare((DeclareRule)null);
				return;
			case JessPackage.RULE_DEFINITION__CONDITIONS:
				getConditions().clear();
				return;
			case JessPackage.RULE_DEFINITION__FUNCTION_CALL:
				getFunctionCall().clear();
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
			case JessPackage.RULE_DEFINITION__RULE_NAME:
				return ruleName != null;
			case JessPackage.RULE_DEFINITION__DOCUMENTATION:
				return documentation != null;
			case JessPackage.RULE_DEFINITION__DECLARE:
				return declare != null;
			case JessPackage.RULE_DEFINITION__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case JessPackage.RULE_DEFINITION__FUNCTION_CALL:
				return functionCall != null && !functionCall.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuleDefinitionImpl
