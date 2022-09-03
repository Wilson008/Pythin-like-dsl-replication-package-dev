/**
 */
package jess.provider;


import java.util.Collection;
import java.util.List;

import jess.JessFactory;
import jess.JessPackage;
import jess.SlotOptions;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jess.SlotOptions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SlotOptionsItemProvider extends LocatedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotOptionsItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(JessPackage.Literals.SLOT_OPTIONS__TYPE);
			childrenFeatures.add(JessPackage.Literals.SLOT_OPTIONS__DEF);
			childrenFeatures.add(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN);
			childrenFeatures.add(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES);
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
	 * This returns SlotOptions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SlotOptions"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((SlotOptions)object).getLocation();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_SlotOptions_type") :
			getString("_UI_SlotOptions_type") + " " + label;
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

		switch (notification.getFeatureID(SlotOptions.class)) {
			case JessPackage.SLOT_OPTIONS__TYPE:
			case JessPackage.SLOT_OPTIONS__DEF:
			case JessPackage.SLOT_OPTIONS__DEFAULT_DYN:
			case JessPackage.SLOT_OPTIONS__ALLOWED_VALUES:
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
				(JessPackage.Literals.SLOT_OPTIONS__TYPE,
				 JessFactory.eINSTANCE.createValidIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createInteg()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createFloa()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createStr()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createValidIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createSlotName()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createJessVariable()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createTemplateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createGlobalDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createFunctionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createAdviceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createUnDefAdvice()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createFactDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createRuleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createModuleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createQueryDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createTemplateDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createWhileExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createForExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createForeachExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createFuncCall()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createEngineExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createExitExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEF,
				 JessFactory.eINSTANCE.createIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createInteg()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createFloa()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createStr()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createValidIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createSlotName()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createJessVariable()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createTemplateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createGlobalDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createFunctionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createAdviceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createUnDefAdvice()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createFactDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createRuleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createModuleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createQueryDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createTemplateDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createWhileExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createForExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createForeachExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createFuncCall()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createEngineExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createExitExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN,
				 JessFactory.eINSTANCE.createIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createInteg()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createFloa()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createStr()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createValidIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createSlotName()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createJessVariable()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createTemplateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createGlobalDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createFunctionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createAdviceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createUnDefAdvice()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createFactDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createRuleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createModuleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createQueryDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createTemplateDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createWhileExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createForExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createForeachExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createFuncCall()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createEngineExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
				 JessFactory.eINSTANCE.createExitExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES,
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
			childFeature == JessPackage.Literals.SLOT_OPTIONS__TYPE ||
			childFeature == JessPackage.Literals.SLOT_OPTIONS__DEF ||
			childFeature == JessPackage.Literals.SLOT_OPTIONS__DEFAULT_DYN ||
			childFeature == JessPackage.Literals.SLOT_OPTIONS__ALLOWED_VALUES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
