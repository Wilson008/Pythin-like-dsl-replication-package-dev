/**
 */
package jess.provider;


import java.util.Collection;
import java.util.List;

import jess.DeclareRule;
import jess.JessFactory;
import jess.JessPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jess.DeclareRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclareRuleItemProvider extends LocatedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareRuleItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(JessPackage.Literals.DECLARE_RULE__SALIENCE);
			childrenFeatures.add(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH);
			childrenFeatures.add(JessPackage.Literals.DECLARE_RULE__AUTO_FOCUS);
			childrenFeatures.add(JessPackage.Literals.DECLARE_RULE__NO_LOOP);
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
	 * This returns DeclareRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DeclareRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((DeclareRule)object).getLocation();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_DeclareRule_type") :
			getString("_UI_DeclareRule_type") + " " + label;
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

		switch (notification.getFeatureID(DeclareRule.class)) {
			case JessPackage.DECLARE_RULE__SALIENCE:
			case JessPackage.DECLARE_RULE__NODE_INDEX_HASH:
			case JessPackage.DECLARE_RULE__AUTO_FOCUS:
			case JessPackage.DECLARE_RULE__NO_LOOP:
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
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createInteg()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createFloa()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createStr()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createValidIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createSlotName()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createJessVariable()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createTemplateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createGlobalDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createFunctionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createAdviceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createUnDefAdvice()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createFactDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createRuleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createModuleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createQueryDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createTemplateDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createWhileExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createForExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createForeachExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createFuncCall()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createEngineExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createExitExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__SALIENCE,
				 JessFactory.eINSTANCE.createIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createInteg()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createFloa()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createStr()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createValidIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createSlotName()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createJessVariable()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createTemplateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createGlobalDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createFunctionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createAdviceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createUnDefAdvice()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createFactDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createRuleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createModuleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createQueryDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createTemplateDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createWhileExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createForExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createForeachExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createFuncCall()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createEngineExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createExitExp()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH,
				 JessFactory.eINSTANCE.createIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__AUTO_FOCUS,
				 JessFactory.eINSTANCE.createValidIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(JessPackage.Literals.DECLARE_RULE__NO_LOOP,
				 JessFactory.eINSTANCE.createValidIdentifier()));
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
			childFeature == JessPackage.Literals.DECLARE_RULE__SALIENCE ||
			childFeature == JessPackage.Literals.DECLARE_RULE__NODE_INDEX_HASH ||
			childFeature == JessPackage.Literals.DECLARE_RULE__AUTO_FOCUS ||
			childFeature == JessPackage.Literals.DECLARE_RULE__NO_LOOP;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
