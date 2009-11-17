/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import swml.KO;
import swml.OK;
import swml.UpdatePage;
import swml.swmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link swml.impl.UpdatePageImpl#getOKLink <em>OK Link</em>}</li>
 *   <li>{@link swml.impl.UpdatePageImpl#getKOLink <em>KO Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UpdatePageImpl extends EntityPagesImpl implements UpdatePage {
	/**
	 * The cached value of the '{@link #getOKLink() <em>OK Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOKLink()
	 * @generated
	 * @ordered
	 */
	protected OK okLink;

	/**
	 * The cached value of the '{@link #getKOLink() <em>KO Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKOLink()
	 * @generated
	 * @ordered
	 */
	protected KO koLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdatePageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return swmlPackage.Literals.UPDATE_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OK getOKLink() {
		return okLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOKLink(OK newOKLink, NotificationChain msgs) {
		OK oldOKLink = okLink;
		okLink = newOKLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, swmlPackage.UPDATE_PAGE__OK_LINK, oldOKLink, newOKLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOKLink(OK newOKLink) {
		if (newOKLink != okLink) {
			NotificationChain msgs = null;
			if (okLink != null)
				msgs = ((InternalEObject)okLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - swmlPackage.UPDATE_PAGE__OK_LINK, null, msgs);
			if (newOKLink != null)
				msgs = ((InternalEObject)newOKLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - swmlPackage.UPDATE_PAGE__OK_LINK, null, msgs);
			msgs = basicSetOKLink(newOKLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, swmlPackage.UPDATE_PAGE__OK_LINK, newOKLink, newOKLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KO getKOLink() {
		return koLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKOLink(KO newKOLink, NotificationChain msgs) {
		KO oldKOLink = koLink;
		koLink = newKOLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, swmlPackage.UPDATE_PAGE__KO_LINK, oldKOLink, newKOLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKOLink(KO newKOLink) {
		if (newKOLink != koLink) {
			NotificationChain msgs = null;
			if (koLink != null)
				msgs = ((InternalEObject)koLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - swmlPackage.UPDATE_PAGE__KO_LINK, null, msgs);
			if (newKOLink != null)
				msgs = ((InternalEObject)newKOLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - swmlPackage.UPDATE_PAGE__KO_LINK, null, msgs);
			msgs = basicSetKOLink(newKOLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, swmlPackage.UPDATE_PAGE__KO_LINK, newKOLink, newKOLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case swmlPackage.UPDATE_PAGE__OK_LINK:
				return basicSetOKLink(null, msgs);
			case swmlPackage.UPDATE_PAGE__KO_LINK:
				return basicSetKOLink(null, msgs);
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
			case swmlPackage.UPDATE_PAGE__OK_LINK:
				return getOKLink();
			case swmlPackage.UPDATE_PAGE__KO_LINK:
				return getKOLink();
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
			case swmlPackage.UPDATE_PAGE__OK_LINK:
				setOKLink((OK)newValue);
				return;
			case swmlPackage.UPDATE_PAGE__KO_LINK:
				setKOLink((KO)newValue);
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
			case swmlPackage.UPDATE_PAGE__OK_LINK:
				setOKLink((OK)null);
				return;
			case swmlPackage.UPDATE_PAGE__KO_LINK:
				setKOLink((KO)null);
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
			case swmlPackage.UPDATE_PAGE__OK_LINK:
				return okLink != null;
			case swmlPackage.UPDATE_PAGE__KO_LINK:
				return koLink != null;
		}
		return super.eIsSet(featureID);
	}

} //UpdatePageImpl
