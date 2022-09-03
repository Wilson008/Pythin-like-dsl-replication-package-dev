/**
 */
package jess.provider;


import java.util.Collection;
import java.util.List;

import jess.IfExpression;
import jess.JessFactory;
import jess.JessPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jess.IfExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfExpressionItemProvider extends UseFuncExpItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(JessPackage.Literals.IF_EXPRESSION__IFTHEN);
			childrenFeatures.add(JessPackage.Literals.IF_EXPRESSION__ELIFTHEN);
			childrenFeatures.add(JessPackage.Literals.IF_EXPRESSION__ELSE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns IfExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((IfExpression)object).getLocation();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_IfExpression_type") :
			getString("_UI_IfExpression_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(IfExpression.class)) {
			case JessPackage.IF_EXPRESSION__IFTHEN:
			case JessPackage.IF_EXPRESSION__ELIFTHEN:
			case JessPackage.IF_EXPRESSION__ELSE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__IFTHEN,
				 JessFactory.eINSTANCE.createConditionAction()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELIFTHEN,
				 JessFactory.eINSTANCE.createElifConditionAction()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createInteg()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createFloa()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createStr()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createValidIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createSlotName()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createJessVariable()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createTemplateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createGlobalDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createFunctionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createAdviceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createUnDefAdvice()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createFactDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createRuleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createModuleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createQueryDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createTemplateDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createWhileExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createForExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createForeachExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createFuncCall()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createEngineExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createExitExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.IF_EXPRESSION__ELSE,
				 JessFactory.eINSTANCE.createIfExpression()));
	}

}
