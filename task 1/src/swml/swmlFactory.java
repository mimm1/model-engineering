/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see swml.swmlPackage
 * @generated
 */
public interface swmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	swmlFactory eINSTANCE = swml.impl.swmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Web Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Model</em>'.
	 * @generated
	 */
	WebModel createWebModel();

	/**
	 * Returns a new object of class '<em>Content Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Model</em>'.
	 * @generated
	 */
	ContentModel createContentModel();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Enum Typ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Typ</em>'.
	 * @generated
	 */
	EnumTyp createEnumTyp();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Literals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literals</em>'.
	 * @generated
	 */
	Literals createLiterals();

	/**
	 * Returns a new object of class '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration</em>'.
	 * @generated
	 */
	Enumeration createEnumeration();

	/**
	 * Returns a new object of class '<em>Hypertext Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hypertext Model</em>'.
	 * @generated
	 */
	HypertextModel createHypertextModel();

	/**
	 * Returns a new object of class '<em>Link Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Join Node</em>'.
	 * @generated
	 */
	LinkJoinNode createLinkJoinNode();

	/**
	 * Returns a new object of class '<em>static Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>static Page</em>'.
	 * @generated
	 */
	staticPage createstaticPage();

	/**
	 * Returns a new object of class '<em>Entity Pages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Pages</em>'.
	 * @generated
	 */
	EntityPages createEntityPages();

	/**
	 * Returns a new object of class '<em>Index Pages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Pages</em>'.
	 * @generated
	 */
	IndexPages createIndexPages();

	/**
	 * Returns a new object of class '<em>Update Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Page</em>'.
	 * @generated
	 */
	UpdatePage createUpdatePage();

	/**
	 * Returns a new object of class '<em>Delete Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Page</em>'.
	 * @generated
	 */
	DeletePage createDeletePage();

	/**
	 * Returns a new object of class '<em>Create Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Page</em>'.
	 * @generated
	 */
	CreatePage createCreatePage();

	/**
	 * Returns a new object of class '<em>Non Contextual Links</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Contextual Links</em>'.
	 * @generated
	 */
	NonContextualLinks createNonContextualLinks();

	/**
	 * Returns a new object of class '<em>Contextual Links</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contextual Links</em>'.
	 * @generated
	 */
	ContextualLinks createContextualLinks();

	/**
	 * Returns a new object of class '<em>OK</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OK</em>'.
	 * @generated
	 */
	OK createOK();

	/**
	 * Returns a new object of class '<em>KO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KO</em>'.
	 * @generated
	 */
	KO createKO();

	/**
	 * Returns a new object of class '<em>Link Paramater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Paramater</em>'.
	 * @generated
	 */
	LinkParamater createLinkParamater();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	swmlPackage getswmlPackage();

} //swmlFactory
