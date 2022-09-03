/**
 */
package jess.impl;

import java.util.Collection;

import jess.DeclareVar;
import jess.Expression;
import jess.JessPackage;
import jess.QueryDefinition;
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
 * An implementation of the model object '<em><b>Query Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.QueryDefinitionImpl#getQueryName <em>Query Name</em>}</li>
 *   <li>{@link jess.impl.QueryDefinitionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link jess.impl.QueryDefinitionImpl#getDeclare <em>Declare</em>}</li>
 *   <li>{@link jess.impl.QueryDefinitionImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryDefinitionImpl extends DefinitionExpImpl implements QueryDefinition {
	/**
	 * The cached value of the '{@link #getQueryName() <em>Query Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryName()
	 * @generated
	 * @ordered
	 */
	protected ValidIdentifier queryName;

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
	protected DeclareVar declare;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> expressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.QUERY_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidIdentifier getQueryName() {
		return queryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryName(ValidIdentifier newQueryName, NotificationChain msgs) {
		ValidIdentifier oldQueryName = queryName;
		queryName = newQueryName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.QUERY_DEFINITION__QUERY_NAME, oldQueryName, newQueryName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryName(ValidIdentifier newQueryName) {
		if (newQueryName != queryName) {
			NotificationChain msgs = null;
			if (queryName != null)
				msgs = ((InternalEObject)queryName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.QUERY_DEFINITION__QUERY_NAME, null, msgs);
			if (newQueryName != null)
				msgs = ((InternalEObject)newQueryName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.QUERY_DEFINITION__QUERY_NAME, null, msgs);
			msgs = basicSetQueryName(newQueryName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.QUERY_DEFINITION__QUERY_NAME, newQueryName, newQueryName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.QUERY_DEFINITION__DOCUMENTATION, oldDocumentation, newDocumentation);
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
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.QUERY_DEFINITION__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.QUERY_DEFINITION__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.QUERY_DEFINITION__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareVar getDeclare() {
		return declare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclare(DeclareVar newDeclare, NotificationChain msgs) {
		DeclareVar oldDeclare = declare;
		declare = newDeclare;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.QUERY_DEFINITION__DECLARE, oldDeclare, newDeclare);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclare(DeclareVar newDeclare) {
		if (newDeclare != declare) {
			NotificationChain msgs = null;
			if (declare != null)
				msgs = ((InternalEObject)declare).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.QUERY_DEFINITION__DECLARE, null, msgs);
			if (newDeclare != null)
				msgs = ((InternalEObject)newDeclare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.QUERY_DEFINITION__DECLARE, null, msgs);
			msgs = basicSetDeclare(newDeclare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.QUERY_DEFINITION__DECLARE, newDeclare, newDeclare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<Expression>(Expression.class, this, JessPackage.QUERY_DEFINITION__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.QUERY_DEFINITION__QUERY_NAME:
				return basicSetQueryName(null, msgs);
			case JessPackage.QUERY_DEFINITION__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case JessPackage.QUERY_DEFINITION__DECLARE:
				return basicSetDeclare(null, msgs);
			case JessPackage.QUERY_DEFINITION__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
			case JessPackage.QUERY_DEFINITION__QUERY_NAME:
				return getQueryName();
			case JessPackage.QUERY_DEFINITION__DOCUMENTATION:
				return getDocumentation();
			case JessPackage.QUERY_DEFINITION__DECLARE:
				return getDeclare();
			case JessPackage.QUERY_DEFINITION__EXPRESSIONS:
				return getExpressions();
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
			case JessPackage.QUERY_DEFINITION__QUERY_NAME:
				setQueryName((ValidIdentifier)newValue);
				return;
			case JessPackage.QUERY_DEFINITION__DOCUMENTATION:
				setDocumentation((Str)newValue);
				return;
			case JessPackage.QUERY_DEFINITION__DECLARE:
				setDeclare((DeclareVar)newValue);
				return;
			case JessPackage.QUERY_DEFINITION__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends Expression>)newValue);
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
			case JessPackage.QUERY_DEFINITION__QUERY_NAME:
				setQueryName((ValidIdentifier)null);
				return;
			case JessPackage.QUERY_DEFINITION__DOCUMENTATION:
				setDocumentation((Str)null);
				return;
			case JessPackage.QUERY_DEFINITION__DECLARE:
				setDeclare((DeclareVar)null);
				return;
			case JessPackage.QUERY_DEFINITION__EXPRESSIONS:
				getExpressions().clear();
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
			case JessPackage.QUERY_DEFINITION__QUERY_NAME:
				return queryName != null;
			case JessPackage.QUERY_DEFINITION__DOCUMENTATION:
				return documentation != null;
			case JessPackage.QUERY_DEFINITION__DECLARE:
				return declare != null;
			case JessPackage.QUERY_DEFINITION__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QueryDefinitionImpl
