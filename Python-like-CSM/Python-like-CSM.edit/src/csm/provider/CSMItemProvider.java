/**
 */
package csm.provider;


import csm.CSM;
import csm.CsmFactory;
import csm.CsmPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link csm.CSM} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CSMItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CsmPackage.Literals.CSM__STEP);
			childrenFeatures.add(CsmPackage.Literals.CSM__GENERAL_RESOURCE);
			childrenFeatures.add(CsmPackage.Literals.CSM__SCENARION);
			childrenFeatures.add(CsmPackage.Literals.CSM__MESSAGE);
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
	 * This returns CSM.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CSM"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_CSM_type");
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

		switch (notification.getFeatureID(CSM.class)) {
			case CsmPackage.CSM__STEP:
			case CsmPackage.CSM__GENERAL_RESOURCE:
			case CsmPackage.CSM__SCENARION:
			case CsmPackage.CSM__MESSAGE:
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
				(CsmPackage.Literals.CSM__STEP,
				 CsmFactory.eINSTANCE.createStart()));

		newChildDescriptors.add
			(createChildParameter
				(CsmPackage.Literals.CSM__STEP,
				 CsmFactory.eINSTANCE.createStop()));

		newChildDescriptors.add
			(createChildParameter
				(CsmPackage.Literals.CSM__STEP,
				 CsmFactory.eINSTANCE.createResourceAcquire()));

		newChildDescriptors.add
			(createChildParameter
				(CsmPackage.Literals.CSM__STEP,
				 CsmFactory.eINSTANCE.createResourceRelease()));

		newChildDescriptors.add
			(createChildParameter
				(CsmPackage.Literals.CSM__GENERAL_RESOURCE,
				 CsmFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CsmPackage.Literals.CSM__GENERAL_RESOURCE,
				 CsmFactory.eINSTANCE.createProcessingResource()));

		newChildDescriptors.add
			(createChildParameter
				(CsmPackage.Literals.CSM__GENERAL_RESOURCE,
				 CsmFactory.eINSTANCE.createExternalService()));

		newChildDescriptors.add
			(createChildParameter
				(CsmPackage.Literals.CSM__SCENARION,
				 CsmFactory.eINSTANCE.createScenarion()));

		newChildDescriptors.add
			(createChildParameter
				(CsmPackage.Literals.CSM__MESSAGE,
				 CsmFactory.eINSTANCE.createMessage()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CSMEditPlugin.INSTANCE;
	}

}
