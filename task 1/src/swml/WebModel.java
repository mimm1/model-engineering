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
 * A representation of the model object '<em><b>Web Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link swml.WebModel#getHypertextmodels <em>Hypertextmodels</em>}</li>
 *   <li>{@link swml.WebModel#getContentmodels <em>Contentmodels</em>}</li>
 * </ul>
 * </p>
 *
 * @see swml.swmlPackage#getWebModel()
 * @model
 * @generated
 */
public interface WebModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Hypertextmodels</b></em>' containment reference list.
	 * The list contents are of type {@link swml.HypertextModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypertextmodels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypertextmodels</em>' containment reference list.
	 * @see swml.swmlPackage#getWebModel_Hypertextmodels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<HypertextModel> getHypertextmodels();

	/**
	 * Returns the value of the '<em><b>Contentmodels</b></em>' containment reference list.
	 * The list contents are of type {@link swml.ContentModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contentmodels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contentmodels</em>' containment reference list.
	 * @see swml.swmlPackage#getWebModel_Contentmodels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ContentModel> getContentmodels();

} // WebModel
