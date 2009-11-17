/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import swml.HypertextModel;
import swml.WebPage;
import swml.staticPage;
import swml.swmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hypertext Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link swml.impl.HypertextModelImpl#getWebPages <em>Web Pages</em>}</li>
 *   <li>{@link swml.impl.HypertextModelImpl#getHomepage <em>Homepage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HypertextModelImpl extends EObjectImpl implements HypertextModel {
	/**
	 * The cached value of the '{@link #getWebPages() <em>Web Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebPages()
	 * @generated
	 * @ordered
	 */
	protected EList<WebPage> webPages;

	/**
	 * The cached value of the '{@link #getHomepage() <em>Homepage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomepage()
	 * @generated
	 * @ordered
	 */
	protected staticPage homepage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HypertextModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return swmlPackage.Literals.HYPERTEXT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WebPage> getWebPages() {
		if (webPages == null) {
			webPages = new EObjectContainmentEList<WebPage>(WebPage.class, this, swmlPackage.HYPERTEXT_MODEL__WEB_PAGES);
		}
		return webPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public staticPage getHomepage() {
		if (homepage != null && homepage.eIsProxy()) {
			InternalEObject oldHomepage = (InternalEObject)homepage;
			homepage = (staticPage)eResolveProxy(oldHomepage);
			if (homepage != oldHomepage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, swmlPackage.HYPERTEXT_MODEL__HOMEPAGE, oldHomepage, homepage));
			}
		}
		return homepage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public staticPage basicGetHomepage() {
		return homepage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomepage(staticPage newHomepage) {
		staticPage oldHomepage = homepage;
		homepage = newHomepage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, swmlPackage.HYPERTEXT_MODEL__HOMEPAGE, oldHomepage, homepage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case swmlPackage.HYPERTEXT_MODEL__WEB_PAGES:
				return ((InternalEList<?>)getWebPages()).basicRemove(otherEnd, msgs);
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
			case swmlPackage.HYPERTEXT_MODEL__WEB_PAGES:
				return getWebPages();
			case swmlPackage.HYPERTEXT_MODEL__HOMEPAGE:
				if (resolve) return getHomepage();
				return basicGetHomepage();
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
			case swmlPackage.HYPERTEXT_MODEL__WEB_PAGES:
				getWebPages().clear();
				getWebPages().addAll((Collection<? extends WebPage>)newValue);
				return;
			case swmlPackage.HYPERTEXT_MODEL__HOMEPAGE:
				setHomepage((staticPage)newValue);
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
			case swmlPackage.HYPERTEXT_MODEL__WEB_PAGES:
				getWebPages().clear();
				return;
			case swmlPackage.HYPERTEXT_MODEL__HOMEPAGE:
				setHomepage((staticPage)null);
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
			case swmlPackage.HYPERTEXT_MODEL__WEB_PAGES:
				return webPages != null && !webPages.isEmpty();
			case swmlPackage.HYPERTEXT_MODEL__HOMEPAGE:
				return homepage != null;
		}
		return super.eIsSet(featureID);
	}

} //HypertextModelImpl
