/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import swml.ContentModel;
import swml.HypertextModel;
import swml.WebModel;
import swml.swmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link swml.impl.WebModelImpl#getHypertextmodels <em>Hypertextmodels</em>}</li>
 *   <li>{@link swml.impl.WebModelImpl#getContentmodels <em>Contentmodels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebModelImpl extends EObjectImpl implements WebModel {
	/**
	 * The cached value of the '{@link #getHypertextmodels() <em>Hypertextmodels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypertextmodels()
	 * @generated
	 * @ordered
	 */
	protected EList<HypertextModel> hypertextmodels;

	/**
	 * The cached value of the '{@link #getContentmodels() <em>Contentmodels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentmodels()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentModel> contentmodels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return swmlPackage.Literals.WEB_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HypertextModel> getHypertextmodels() {
		if (hypertextmodels == null) {
			hypertextmodels = new EObjectContainmentEList<HypertextModel>(HypertextModel.class, this, swmlPackage.WEB_MODEL__HYPERTEXTMODELS);
		}
		return hypertextmodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentModel> getContentmodels() {
		if (contentmodels == null) {
			contentmodels = new EObjectContainmentEList<ContentModel>(ContentModel.class, this, swmlPackage.WEB_MODEL__CONTENTMODELS);
		}
		return contentmodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case swmlPackage.WEB_MODEL__HYPERTEXTMODELS:
				return ((InternalEList<?>)getHypertextmodels()).basicRemove(otherEnd, msgs);
			case swmlPackage.WEB_MODEL__CONTENTMODELS:
				return ((InternalEList<?>)getContentmodels()).basicRemove(otherEnd, msgs);
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
			case swmlPackage.WEB_MODEL__HYPERTEXTMODELS:
				return getHypertextmodels();
			case swmlPackage.WEB_MODEL__CONTENTMODELS:
				return getContentmodels();
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
			case swmlPackage.WEB_MODEL__HYPERTEXTMODELS:
				getHypertextmodels().clear();
				getHypertextmodels().addAll((Collection<? extends HypertextModel>)newValue);
				return;
			case swmlPackage.WEB_MODEL__CONTENTMODELS:
				getContentmodels().clear();
				getContentmodels().addAll((Collection<? extends ContentModel>)newValue);
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
			case swmlPackage.WEB_MODEL__HYPERTEXTMODELS:
				getHypertextmodels().clear();
				return;
			case swmlPackage.WEB_MODEL__CONTENTMODELS:
				getContentmodels().clear();
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
			case swmlPackage.WEB_MODEL__HYPERTEXTMODELS:
				return hypertextmodels != null && !hypertextmodels.isEmpty();
			case swmlPackage.WEB_MODEL__CONTENTMODELS:
				return contentmodels != null && !contentmodels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WebModelImpl
