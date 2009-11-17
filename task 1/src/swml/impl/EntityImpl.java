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

import swml.Attribute;
import swml.Entity;
import swml.EnumTyp;
import swml.Reference;
import swml.swmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link swml.impl.EntityImpl#getEnumAttribute <em>Enum Attribute</em>}</li>
 *   <li>{@link swml.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link swml.impl.EntityImpl#getReferences <em>References</em>}</li>
 *   <li>{@link swml.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link swml.impl.EntityImpl#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends EObjectImpl implements Entity {
	/**
	 * The cached value of the '{@link #getEnumAttribute() <em>Enum Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumTyp> enumAttribute;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> references;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> child;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return swmlPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumTyp> getEnumAttribute() {
		if (enumAttribute == null) {
			enumAttribute = new EObjectContainmentEList<EnumTyp>(EnumTyp.class, this, swmlPackage.ENTITY__ENUM_ATTRIBUTE);
		}
		return enumAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, swmlPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<Reference>(Reference.class, this, swmlPackage.ENTITY__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, swmlPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getChild() {
		if (child == null) {
			child = new EObjectContainmentEList<Entity>(Entity.class, this, swmlPackage.ENTITY__CHILD);
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case swmlPackage.ENTITY__ENUM_ATTRIBUTE:
				return ((InternalEList<?>)getEnumAttribute()).basicRemove(otherEnd, msgs);
			case swmlPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case swmlPackage.ENTITY__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case swmlPackage.ENTITY__CHILD:
				return ((InternalEList<?>)getChild()).basicRemove(otherEnd, msgs);
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
			case swmlPackage.ENTITY__ENUM_ATTRIBUTE:
				return getEnumAttribute();
			case swmlPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case swmlPackage.ENTITY__REFERENCES:
				return getReferences();
			case swmlPackage.ENTITY__NAME:
				return getName();
			case swmlPackage.ENTITY__CHILD:
				return getChild();
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
			case swmlPackage.ENTITY__ENUM_ATTRIBUTE:
				getEnumAttribute().clear();
				getEnumAttribute().addAll((Collection<? extends EnumTyp>)newValue);
				return;
			case swmlPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case swmlPackage.ENTITY__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case swmlPackage.ENTITY__NAME:
				setName((String)newValue);
				return;
			case swmlPackage.ENTITY__CHILD:
				getChild().clear();
				getChild().addAll((Collection<? extends Entity>)newValue);
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
			case swmlPackage.ENTITY__ENUM_ATTRIBUTE:
				getEnumAttribute().clear();
				return;
			case swmlPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case swmlPackage.ENTITY__REFERENCES:
				getReferences().clear();
				return;
			case swmlPackage.ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case swmlPackage.ENTITY__CHILD:
				getChild().clear();
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
			case swmlPackage.ENTITY__ENUM_ATTRIBUTE:
				return enumAttribute != null && !enumAttribute.isEmpty();
			case swmlPackage.ENTITY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case swmlPackage.ENTITY__REFERENCES:
				return references != null && !references.isEmpty();
			case swmlPackage.ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case swmlPackage.ENTITY__CHILD:
				return child != null && !child.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
