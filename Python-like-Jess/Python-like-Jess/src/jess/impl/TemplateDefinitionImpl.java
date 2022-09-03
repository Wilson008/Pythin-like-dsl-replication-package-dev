/**
 */
package jess.impl;

import java.util.Collection;

import jess.ASlotDef;
import jess.DeclareBloc;
import jess.JessPackage;
import jess.Str;
import jess.TemplateDefinition;
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
 * An implementation of the model object '<em><b>Template Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.TemplateDefinitionImpl#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link jess.impl.TemplateDefinitionImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link jess.impl.TemplateDefinitionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link jess.impl.TemplateDefinitionImpl#getDeclareBloc <em>Declare Bloc</em>}</li>
 *   <li>{@link jess.impl.TemplateDefinitionImpl#getSlotDef <em>Slot Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateDefinitionImpl extends DefinitionExpImpl implements TemplateDefinition {
	/**
	 * The cached value of the '{@link #getTemplateName() <em>Template Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateName()
	 * @generated
	 * @ordered
	 */
	protected ValidIdentifier templateName;

	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidIdentifier> inherits;

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
	 * The cached value of the '{@link #getDeclareBloc() <em>Declare Bloc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclareBloc()
	 * @generated
	 * @ordered
	 */
	protected DeclareBloc declareBloc;

	/**
	 * The cached value of the '{@link #getSlotDef() <em>Slot Def</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotDef()
	 * @generated
	 * @ordered
	 */
	protected EList<ASlotDef> slotDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.TEMPLATE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidIdentifier getTemplateName() {
		return templateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateName(ValidIdentifier newTemplateName, NotificationChain msgs) {
		ValidIdentifier oldTemplateName = templateName;
		templateName = newTemplateName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME, oldTemplateName, newTemplateName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateName(ValidIdentifier newTemplateName) {
		if (newTemplateName != templateName) {
			NotificationChain msgs = null;
			if (templateName != null)
				msgs = ((InternalEObject)templateName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME, null, msgs);
			if (newTemplateName != null)
				msgs = ((InternalEObject)newTemplateName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME, null, msgs);
			msgs = basicSetTemplateName(newTemplateName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME, newTemplateName, newTemplateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValidIdentifier> getInherits() {
		if (inherits == null) {
			inherits = new EObjectContainmentEList<ValidIdentifier>(ValidIdentifier.class, this, JessPackage.TEMPLATE_DEFINITION__INHERITS);
		}
		return inherits;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.TEMPLATE_DEFINITION__DOCUMENTATION, oldDocumentation, newDocumentation);
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
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.TEMPLATE_DEFINITION__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.TEMPLATE_DEFINITION__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.TEMPLATE_DEFINITION__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareBloc getDeclareBloc() {
		return declareBloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclareBloc(DeclareBloc newDeclareBloc, NotificationChain msgs) {
		DeclareBloc oldDeclareBloc = declareBloc;
		declareBloc = newDeclareBloc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.TEMPLATE_DEFINITION__DECLARE_BLOC, oldDeclareBloc, newDeclareBloc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclareBloc(DeclareBloc newDeclareBloc) {
		if (newDeclareBloc != declareBloc) {
			NotificationChain msgs = null;
			if (declareBloc != null)
				msgs = ((InternalEObject)declareBloc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.TEMPLATE_DEFINITION__DECLARE_BLOC, null, msgs);
			if (newDeclareBloc != null)
				msgs = ((InternalEObject)newDeclareBloc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.TEMPLATE_DEFINITION__DECLARE_BLOC, null, msgs);
			msgs = basicSetDeclareBloc(newDeclareBloc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.TEMPLATE_DEFINITION__DECLARE_BLOC, newDeclareBloc, newDeclareBloc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ASlotDef> getSlotDef() {
		if (slotDef == null) {
			slotDef = new EObjectContainmentEList<ASlotDef>(ASlotDef.class, this, JessPackage.TEMPLATE_DEFINITION__SLOT_DEF);
		}
		return slotDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME:
				return basicSetTemplateName(null, msgs);
			case JessPackage.TEMPLATE_DEFINITION__INHERITS:
				return ((InternalEList<?>)getInherits()).basicRemove(otherEnd, msgs);
			case JessPackage.TEMPLATE_DEFINITION__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case JessPackage.TEMPLATE_DEFINITION__DECLARE_BLOC:
				return basicSetDeclareBloc(null, msgs);
			case JessPackage.TEMPLATE_DEFINITION__SLOT_DEF:
				return ((InternalEList<?>)getSlotDef()).basicRemove(otherEnd, msgs);
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
			case JessPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME:
				return getTemplateName();
			case JessPackage.TEMPLATE_DEFINITION__INHERITS:
				return getInherits();
			case JessPackage.TEMPLATE_DEFINITION__DOCUMENTATION:
				return getDocumentation();
			case JessPackage.TEMPLATE_DEFINITION__DECLARE_BLOC:
				return getDeclareBloc();
			case JessPackage.TEMPLATE_DEFINITION__SLOT_DEF:
				return getSlotDef();
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
			case JessPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME:
				setTemplateName((ValidIdentifier)newValue);
				return;
			case JessPackage.TEMPLATE_DEFINITION__INHERITS:
				getInherits().clear();
				getInherits().addAll((Collection<? extends ValidIdentifier>)newValue);
				return;
			case JessPackage.TEMPLATE_DEFINITION__DOCUMENTATION:
				setDocumentation((Str)newValue);
				return;
			case JessPackage.TEMPLATE_DEFINITION__DECLARE_BLOC:
				setDeclareBloc((DeclareBloc)newValue);
				return;
			case JessPackage.TEMPLATE_DEFINITION__SLOT_DEF:
				getSlotDef().clear();
				getSlotDef().addAll((Collection<? extends ASlotDef>)newValue);
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
			case JessPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME:
				setTemplateName((ValidIdentifier)null);
				return;
			case JessPackage.TEMPLATE_DEFINITION__INHERITS:
				getInherits().clear();
				return;
			case JessPackage.TEMPLATE_DEFINITION__DOCUMENTATION:
				setDocumentation((Str)null);
				return;
			case JessPackage.TEMPLATE_DEFINITION__DECLARE_BLOC:
				setDeclareBloc((DeclareBloc)null);
				return;
			case JessPackage.TEMPLATE_DEFINITION__SLOT_DEF:
				getSlotDef().clear();
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
			case JessPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME:
				return templateName != null;
			case JessPackage.TEMPLATE_DEFINITION__INHERITS:
				return inherits != null && !inherits.isEmpty();
			case JessPackage.TEMPLATE_DEFINITION__DOCUMENTATION:
				return documentation != null;
			case JessPackage.TEMPLATE_DEFINITION__DECLARE_BLOC:
				return declareBloc != null;
			case JessPackage.TEMPLATE_DEFINITION__SLOT_DEF:
				return slotDef != null && !slotDef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemplateDefinitionImpl
