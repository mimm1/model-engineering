/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import swml.Entity;
import swml.dynamicPage;
import swml.swmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>dynamic Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link swml.impl.dynamicPageImpl#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class dynamicPageImpl extends WebPageImpl implements dynamicPage {
	/**
	 * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityType()
	 * @generated
	 * @ordered
	 */
	protected Entity entityType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected dynamicPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return swmlPackage.Literals.DYNAMIC_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntityType() {
		if (entityType != null && entityType.eIsProxy()) {
			InternalEObject oldEntityType = (InternalEObject)entityType;
			entityType = (Entity)eResolveProxy(oldEntityType);
			if (entityType != oldEntityType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, swmlPackage.DYNAMIC_PAGE__ENTITY_TYPE, oldEntityType, entityType));
			}
		}
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntityType() {
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityType(Entity newEntityType) {
		Entity oldEntityType = entityType;
		entityType = newEntityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, swmlPackage.DYNAMIC_PAGE__ENTITY_TYPE, oldEntityType, entityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case swmlPackage.DYNAMIC_PAGE__ENTITY_TYPE:
				if (resolve) return getEntityType();
				return basicGetEntityType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case swmlPackage.DYNAMIC_PAGE__ENTITY_TYPE:
				setEntityType((Entity)newValue);
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
			case swmlPackage.DYNAMIC_PAGE__ENTITY_TYPE:
				setEntityType((Entity)null);
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
			case swmlPackage.DYNAMIC_PAGE__ENTITY_TYPE:
				return entityType != null;
		}
		return super.eIsSet(featureID);
	}

} //dynamicPageImpl
