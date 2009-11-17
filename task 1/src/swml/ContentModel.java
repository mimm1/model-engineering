/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link swml.ContentModel#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link swml.ContentModel#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see swml.swmlPackage#getContentModel()
 * @model
 * @generated
 */
public interface ContentModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link swml.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see swml.swmlPackage#getContentModel_Enumerations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enumeration> getEnumerations();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link swml.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see swml.swmlPackage#getContentModel_Entities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Entity> getEntities();

} // ContentModel
