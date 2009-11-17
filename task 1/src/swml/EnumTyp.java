/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Typ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link swml.EnumTyp#getEnums <em>Enums</em>}</li>
 *   <li>{@link swml.EnumTyp#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see swml.swmlPackage#getEnumTyp()
 * @model
 * @generated
 */
public interface EnumTyp extends EObject {
	/**
	 * Returns the value of the '<em><b>Enums</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enums</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enums</em>' reference.
	 * @see #setEnums(Enumeration)
	 * @see swml.swmlPackage#getEnumTyp_Enums()
	 * @model required="true"
	 * @generated
	 */
	Enumeration getEnums();

	/**
	 * Sets the value of the '{@link swml.EnumTyp#getEnums <em>Enums</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enums</em>' reference.
	 * @see #getEnums()
	 * @generated
	 */
	void setEnums(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see swml.swmlPackage#getEnumTyp_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link swml.EnumTyp#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EnumTyp
