/**
 */
package jess.provider;


import java.util.Collection;
import java.util.List;

import jess.JessFactory;
import jess.JessPackage;
import jess.RuleDefinition;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jess.RuleDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleDefinitionItemProvider extends DefinitionExpItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleDefinitionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(JessPackage.Literals.RULE_DEFINITION__RULE_NAME);
			childrenFeatures.add(JessPackage.Literals.RULE_DEFINITION__DOCUMENTATION);
			childrenFeatures.add(JessPackage.Literals.RULE_DEFINITION__DECLARE);
			childrenFeatures.add(JessPackage.Literals.RULE_DEFINITION__CONDITIONS);
			childrenFeatures.add(JessPackage.Literals.RULE_DEFINITION__FUNCTION_CALL);
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
	 * This returns RuleDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RuleDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((RuleDefinition)object).getLocation();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_RuleDefinition_type") :
			getString("_UI_RuleDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(RuleDefinition.class)) {
			case JessPackage.RULE_DEFINITION__RULE_NAME:
			case JessPackage.RULE_DEFINITION__DOCUMENTATION:
			case JessPackage.RULE_DEFINITION__DECLARE:
			case JessPackage.RULE_DEFINITION__CONDITIONS:
			case JessPackage.RULE_DEFINITION__FUNCTION_CALL:
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
				(JessPackage.Literals.RULE_DEFINITION__RULE_NAME,
				 JessFactory.eINSTANCE.createValidIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__DOCUMENTATION,
				 JessFactory.eINSTANCE.createStr()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__DECLARE,
				 JessFactory.eINSTANCE.createDeclareRule()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createInteg()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createFloa()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createStr()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createValidIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createSlotName()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createJessVariable()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createTemplateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createGlobalDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createFunctionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createAdviceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createUnDefAdvice()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createFactDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createRuleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createModuleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createQueryDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createTemplateDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createWhileExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createForExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createForeachExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createFuncCall()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createEngineExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createExitExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__CONDITIONS,
				 JessFactory.eINSTANCE.createIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__FUNCTION_CALL,
				 JessFactory.eINSTANCE.createWhileExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__FUNCTION_CALL,
				 JessFactory.eINSTANCE.createForExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__FUNCTION_CALL,
				 JessFactory.eINSTANCE.createForeachExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__FUNCTION_CALL,
				 JessFactory.eINSTANCE.createFuncCall()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__FUNCTION_CALL,
				 JessFactory.eINSTANCE.createEngineExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__FUNCTION_CALL,
				 JessFactory.eINSTANCE.createExitExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.RULE_DEFINITION__FUNCTION_CALL,
				 JessFactory.eINSTANCE.createIfExpression()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == JessPackage.Literals.RULE_DEFINITION__RULE_NAME ||
			childFeature == JessPackage.Literals.RULE_DEFINITION__CONDITIONS ||
			childFeature == JessPackage.Literals.RULE_DEFINITION__DOCUMENTATION ||
			childFeature == JessPackage.Literals.RULE_DEFINITION__FUNCTION_CALL;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
