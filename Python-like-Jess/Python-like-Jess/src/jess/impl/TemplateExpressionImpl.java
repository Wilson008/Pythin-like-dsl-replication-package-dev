/**
 */
package jess.impl;

import java.util.Collection;

import jess.JessPackage;
import jess.SlotOp;
import jess.TemplateExpression;
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
 * An implementation of the model object '<em><b>Template Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jess.impl.TemplateExpressionImpl#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link jess.impl.TemplateExpressionImpl#getFirstSlot <em>First Slot</em>}</li>
 *   <li>{@link jess.impl.TemplateExpressionImpl#getSlotOp <em>Slot Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateExpressionImpl extends ExpressionImpl implements TemplateExpression {
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
	 * The cached value of the '{@link #getFirstSlot() <em>First Slot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstSlot()
	 * @generated
	 * @ordered
	 */
	protected SlotOp firstSlot;

	/**
	 * The cached value of the '{@link #getSlotOp() <em>Slot Op</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotOp()
	 * @generated
	 * @ordered
	 */
	protected EList<SlotOp> slotOp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JessPackage.Literals.TEMPLATE_EXPRESSION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.TEMPLATE_EXPRESSION__TEMPLATE_NAME, oldTemplateName, newTemplateName);
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
				msgs = ((InternalEObject)templateName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.TEMPLATE_EXPRESSION__TEMPLATE_NAME, null, msgs);
			if (newTemplateName != null)
				msgs = ((InternalEObject)newTemplateName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.TEMPLATE_EXPRESSION__TEMPLATE_NAME, null, msgs);
			msgs = basicSetTemplateName(newTemplateName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.TEMPLATE_EXPRESSION__TEMPLATE_NAME, newTemplateName, newTemplateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotOp getFirstSlot() {
		return firstSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstSlot(SlotOp newFirstSlot, NotificationChain msgs) {
		SlotOp oldFirstSlot = firstSlot;
		firstSlot = newFirstSlot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JessPackage.TEMPLATE_EXPRESSION__FIRST_SLOT, oldFirstSlot, newFirstSlot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstSlot(SlotOp newFirstSlot) {
		if (newFirstSlot != firstSlot) {
			NotificationChain msgs = null;
			if (firstSlot != null)
				msgs = ((InternalEObject)firstSlot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JessPackage.TEMPLATE_EXPRESSION__FIRST_SLOT, null, msgs);
			if (newFirstSlot != null)
				msgs = ((InternalEObject)newFirstSlot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JessPackage.TEMPLATE_EXPRESSION__FIRST_SLOT, null, msgs);
			msgs = basicSetFirstSlot(newFirstSlot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JessPackage.TEMPLATE_EXPRESSION__FIRST_SLOT, newFirstSlot, newFirstSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SlotOp> getSlotOp() {
		if (slotOp == null) {
			slotOp = new EObjectContainmentEList<SlotOp>(SlotOp.class, this, JessPackage.TEMPLATE_EXPRESSION__SLOT_OP);
		}
		return slotOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JessPackage.TEMPLATE_EXPRESSION__TEMPLATE_NAME:
				return basicSetTemplateName(null, msgs);
			case JessPackage.TEMPLATE_EXPRESSION__FIRST_SLOT:
				return basicSetFirstSlot(null, msgs);
			case JessPackage.TEMPLATE_EXPRESSION__SLOT_OP:
				return ((InternalEList<?>)getSlotOp()).basicRemove(otherEnd, msgs);
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
			case JessPackage.TEMPLATE_EXPRESSION__TEMPLATE_NAME:
				return getTemplateName();
			case JessPackage.TEMPLATE_EXPRESSION__FIRST_SLOT:
				return getFirstSlot();
			case JessPackage.TEMPLATE_EXPRESSION__SLOT_OP:
				return getSlotOp();
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
			case JessPackage.TEMPLATE_EXPRESSION__TEMPLATE_NAME:
				setTemplateName((ValidIdentifier)newValue);
				return;
			case JessPackage.TEMPLATE_EXPRESSION__FIRST_SLOT:
				setFirstSlot((SlotOp)newValue);
				return;
			case JessPackage.TEMPLATE_EXPRESSION__SLOT_OP:
				getSlotOp().clear();
				getSlotOp().addAll((Collection<? extends SlotOp>)newValue);
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
			case JessPackage.TEMPLATE_EXPRESSION__TEMPLATE_NAME:
				setTemplateName((ValidIdentifier)null);
				return;
			case JessPackage.TEMPLATE_EXPRESSION__FIRST_SLOT:
				setFirstSlot((SlotOp)null);
				return;
			case JessPackage.TEMPLATE_EXPRESSION__SLOT_OP:
				getSlotOp().clear();
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
			case JessPackage.TEMPLATE_EXPRESSION__TEMPLATE_NAME:
				return templateName != null;
			case JessPackage.TEMPLATE_EXPRESSION__FIRST_SLOT:
				return firstSlot != null;
			case JessPackage.TEMPLATE_EXPRESSION__SLOT_OP:
				return slotOp != null && !slotOp.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemplateExpressionImpl
