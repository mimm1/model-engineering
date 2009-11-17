/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link swml.DeletePage#getOKLink <em>OK Link</em>}</li>
 *   <li>{@link swml.DeletePage#getKOLink <em>KO Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see swml.swmlPackage#getDeletePage()
 * @model
 * @generated
 */
public interface DeletePage extends EntityPages {
	/**
	 * Returns the value of the '<em><b>OK Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OK Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OK Link</em>' containment reference.
	 * @see #setOKLink(OK)
	 * @see swml.swmlPackage#getDeletePage_OKLink()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OK getOKLink();

	/**
	 * Sets the value of the '{@link swml.DeletePage#getOKLink <em>OK Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OK Link</em>' containment reference.
	 * @see #getOKLink()
	 * @generated
	 */
	void setOKLink(OK value);

	/**
	 * Returns the value of the '<em><b>KO Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>KO Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KO Link</em>' containment reference.
	 * @see #setKOLink(KO)
	 * @see swml.swmlPackage#getDeletePage_KOLink()
	 * @model containment="true" required="true"
	 * @generated
	 */
	KO getKOLink();

	/**
	 * Sets the value of the '{@link swml.DeletePage#getKOLink <em>KO Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KO Link</em>' containment reference.
	 * @see #getKOLink()
	 * @generated
	 */
	void setKOLink(KO value);

} // DeletePage
