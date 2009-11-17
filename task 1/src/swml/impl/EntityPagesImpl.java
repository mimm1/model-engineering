/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import swml.EntityPages;
import swml.dynamicPage;
import swml.swmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Pages</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link swml.impl.EntityPagesImpl#getInnerPage <em>Inner Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityPagesImpl extends dynamicPageImpl implements EntityPages {
	/**
	 * The cached value of the '{@link #getInnerPage() <em>Inner Page</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerPage()
	 * @generated
	 * @ordered
	 */
	protected EList<dynamicPage> innerPage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityPagesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return swmlPackage.Literals.ENTITY_PAGES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<dynamicPage> getInnerPage() {
		if (innerPage == null) {
			innerPage = new EObjectResolvingEList<dynamicPage>(dynamicPage.class, this, swmlPackage.ENTITY_PAGES__INNER_PAGE);
		}
		return innerPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case swmlPackage.ENTITY_PAGES__INNER_PAGE:
				return getInnerPage();
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
			case swmlPackage.ENTITY_PAGES__INNER_PAGE:
				getInnerPage().clear();
				getInnerPage().addAll((Collection<? extends dynamicPage>)newValue);
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
			case swmlPackage.ENTITY_PAGES__INNER_PAGE:
				getInnerPage().clear();
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
			case swmlPackage.ENTITY_PAGES__INNER_PAGE:
				return innerPage != null && !innerPage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityPagesImpl
