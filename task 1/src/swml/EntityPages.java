/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Pages</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link swml.EntityPages#getInnerPage <em>Inner Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see swml.swmlPackage#getEntityPages()
 * @model
 * @generated
 */
public interface EntityPages extends dynamicPage {
	/**
	 * Returns the value of the '<em><b>Inner Page</b></em>' reference list.
	 * The list contents are of type {@link swml.dynamicPage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Page</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Page</em>' reference list.
	 * @see swml.swmlPackage#getEntityPages_InnerPage()
	 * @model
	 * @generated
	 */
	EList<dynamicPage> getInnerPage();

} // EntityPages
