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
 * A representation of the model object '<em><b>Hypertext Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link swml.HypertextModel#getWebPages <em>Web Pages</em>}</li>
 *   <li>{@link swml.HypertextModel#getHomepage <em>Homepage</em>}</li>
 * </ul>
 * </p>
 *
 * @see swml.swmlPackage#getHypertextModel()
 * @model
 * @generated
 */
public interface HypertextModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Web Pages</b></em>' containment reference list.
	 * The list contents are of type {@link swml.WebPage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Pages</em>' containment reference list.
	 * @see swml.swmlPackage#getHypertextModel_WebPages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WebPage> getWebPages();

	/**
	 * Returns the value of the '<em><b>Homepage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Homepage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Homepage</em>' reference.
	 * @see #setHomepage(staticPage)
	 * @see swml.swmlPackage#getHypertextModel_Homepage()
	 * @model required="true"
	 * @generated
	 */
	staticPage getHomepage();

	/**
	 * Sets the value of the '{@link swml.HypertextModel#getHomepage <em>Homepage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Homepage</em>' reference.
	 * @see #getHomepage()
	 * @generated
	 */
	void setHomepage(staticPage value);

} // HypertextModel
