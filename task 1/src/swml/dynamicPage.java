/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>dynamic Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link swml.dynamicPage#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see swml.swmlPackage#getdynamicPage()
 * @model abstract="true"
 * @generated
 */
public interface dynamicPage extends WebPage {
	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type</em>' reference.
	 * @see #setEntityType(Entity)
	 * @see swml.swmlPackage#getdynamicPage_EntityType()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntityType();

	/**
	 * Sets the value of the '{@link swml.dynamicPage#getEntityType <em>Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type</em>' reference.
	 * @see #getEntityType()
	 * @generated
	 */
	void setEntityType(Entity value);

} // dynamicPage
