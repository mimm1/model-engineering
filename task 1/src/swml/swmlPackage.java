/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see swml.swmlFactory
 * @model kind="package"
 * @generated
 */
public interface swmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "swml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://swml/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "swml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	swmlPackage eINSTANCE = swml.impl.swmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link swml.impl.WebModelImpl <em>Web Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.WebModelImpl
	 * @see swml.impl.swmlPackageImpl#getWebModel()
	 * @generated
	 */
	int WEB_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Hypertextmodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_MODEL__HYPERTEXTMODELS = 0;

	/**
	 * The feature id for the '<em><b>Contentmodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_MODEL__CONTENTMODELS = 1;

	/**
	 * The number of structural features of the '<em>Web Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link swml.impl.ContentModelImpl <em>Content Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.ContentModelImpl
	 * @see swml.impl.swmlPackageImpl#getContentModel()
	 * @generated
	 */
	int CONTENT_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MODEL__ENUMERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MODEL__ENTITIES = 1;

	/**
	 * The number of structural features of the '<em>Content Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link swml.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.EntityImpl
	 * @see swml.impl.swmlPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Enum Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENUM_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REFERENCES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 3;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CHILD = 4;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link swml.impl.EnumTypImpl <em>Enum Typ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.EnumTypImpl
	 * @see swml.impl.swmlPackageImpl#getEnumTyp()
	 * @generated
	 */
	int ENUM_TYP = 3;

	/**
	 * The feature id for the '<em><b>Enums</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYP__ENUMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYP__NAME = 1;

	/**
	 * The number of structural features of the '<em>Enum Typ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link swml.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.ReferenceImpl
	 * @see swml.impl.swmlPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__OPPOSITE = 0;

	/**
	 * The feature id for the '<em><b>Ref To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REF_TO = 1;

	/**
	 * The feature id for the '<em><b>Rolename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ROLENAME = 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__LOWER_BOUND = 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__UPPER_BOUND = 4;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link swml.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.AttributeImpl
	 * @see swml.impl.swmlPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYP = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link swml.impl.LiteralsImpl <em>Literals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.LiteralsImpl
	 * @see swml.impl.swmlPackageImpl#getLiterals()
	 * @generated
	 */
	int LITERALS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERALS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Literals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERALS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link swml.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.EnumerationImpl
	 * @see swml.impl.swmlPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 7;

	/**
	 * The feature id for the '<em><b>Owned Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_LITERAL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link swml.impl.HypertextModelImpl <em>Hypertext Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.HypertextModelImpl
	 * @see swml.impl.swmlPackageImpl#getHypertextModel()
	 * @generated
	 */
	int HYPERTEXT_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Web Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_MODEL__WEB_PAGES = 0;

	/**
	 * The feature id for the '<em><b>Homepage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_MODEL__HOMEPAGE = 1;

	/**
	 * The number of structural features of the '<em>Hypertext Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link swml.impl.WebPageImpl <em>Web Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.WebPageImpl
	 * @see swml.impl.swmlPackageImpl#getWebPage()
	 * @generated
	 */
	int WEB_PAGE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__LINK = 1;

	/**
	 * The number of structural features of the '<em>Web Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link swml.impl.LinkJoinNodeImpl <em>Link Join Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.LinkJoinNodeImpl
	 * @see swml.impl.swmlPackageImpl#getLinkJoinNode()
	 * @generated
	 */
	int LINK_JOIN_NODE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_JOIN_NODE__NAME = WEB_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_JOIN_NODE__LINK = WEB_PAGE__LINK;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_JOIN_NODE__LINKS = WEB_PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_JOIN_NODE_FEATURE_COUNT = WEB_PAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link swml.impl.staticPageImpl <em>static Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.staticPageImpl
	 * @see swml.impl.swmlPackageImpl#getstaticPage()
	 * @generated
	 */
	int STATIC_PAGE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PAGE__NAME = WEB_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PAGE__LINK = WEB_PAGE__LINK;

	/**
	 * The number of structural features of the '<em>static Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PAGE_FEATURE_COUNT = WEB_PAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link swml.impl.dynamicPageImpl <em>dynamic Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.dynamicPageImpl
	 * @see swml.impl.swmlPackageImpl#getdynamicPage()
	 * @generated
	 */
	int DYNAMIC_PAGE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PAGE__NAME = WEB_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PAGE__LINK = WEB_PAGE__LINK;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PAGE__ENTITY_TYPE = WEB_PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>dynamic Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PAGE_FEATURE_COUNT = WEB_PAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link swml.impl.EntityPagesImpl <em>Entity Pages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.EntityPagesImpl
	 * @see swml.impl.swmlPackageImpl#getEntityPages()
	 * @generated
	 */
	int ENTITY_PAGES = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGES__NAME = DYNAMIC_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGES__LINK = DYNAMIC_PAGE__LINK;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGES__ENTITY_TYPE = DYNAMIC_PAGE__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Inner Page</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGES__INNER_PAGE = DYNAMIC_PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Pages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGES_FEATURE_COUNT = DYNAMIC_PAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link swml.impl.IndexPagesImpl <em>Index Pages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.IndexPagesImpl
	 * @see swml.impl.swmlPackageImpl#getIndexPages()
	 * @generated
	 */
	int INDEX_PAGES = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGES__NAME = DYNAMIC_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGES__LINK = DYNAMIC_PAGE__LINK;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGES__ENTITY_TYPE = DYNAMIC_PAGE__ENTITY_TYPE;

	/**
	 * The number of structural features of the '<em>Index Pages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGES_FEATURE_COUNT = DYNAMIC_PAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link swml.impl.UpdatePageImpl <em>Update Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.UpdatePageImpl
	 * @see swml.impl.swmlPackageImpl#getUpdatePage()
	 * @generated
	 */
	int UPDATE_PAGE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAGE__NAME = ENTITY_PAGES__NAME;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAGE__LINK = ENTITY_PAGES__LINK;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAGE__ENTITY_TYPE = ENTITY_PAGES__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Inner Page</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAGE__INNER_PAGE = ENTITY_PAGES__INNER_PAGE;

	/**
	 * The feature id for the '<em><b>OK Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAGE__OK_LINK = ENTITY_PAGES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>KO Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAGE__KO_LINK = ENTITY_PAGES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PAGE_FEATURE_COUNT = ENTITY_PAGES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link swml.impl.DeletePageImpl <em>Delete Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.DeletePageImpl
	 * @see swml.impl.swmlPackageImpl#getDeletePage()
	 * @generated
	 */
	int DELETE_PAGE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__NAME = ENTITY_PAGES__NAME;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__LINK = ENTITY_PAGES__LINK;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__ENTITY_TYPE = ENTITY_PAGES__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Inner Page</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__INNER_PAGE = ENTITY_PAGES__INNER_PAGE;

	/**
	 * The feature id for the '<em><b>OK Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__OK_LINK = ENTITY_PAGES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>KO Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__KO_LINK = ENTITY_PAGES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delete Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE_FEATURE_COUNT = ENTITY_PAGES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link swml.impl.CreatePageImpl <em>Create Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.CreatePageImpl
	 * @see swml.impl.swmlPackageImpl#getCreatePage()
	 * @generated
	 */
	int CREATE_PAGE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__NAME = ENTITY_PAGES__NAME;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__LINK = ENTITY_PAGES__LINK;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__ENTITY_TYPE = ENTITY_PAGES__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Inner Page</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__INNER_PAGE = ENTITY_PAGES__INNER_PAGE;

	/**
	 * The feature id for the '<em><b>OK Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__OK_LINK = ENTITY_PAGES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>KO Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__KO_LINK = ENTITY_PAGES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE_FEATURE_COUNT = ENTITY_PAGES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link swml.impl.LinksImpl <em>Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.LinksImpl
	 * @see swml.impl.swmlPackageImpl#getLinks()
	 * @generated
	 */
	int LINKS = 18;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__LINK = 0;

	/**
	 * The feature id for the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__TARGET_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__NAME = 2;

	/**
	 * The number of structural features of the '<em>Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link swml.impl.LinkKat2Impl <em>Link Kat2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.LinkKat2Impl
	 * @see swml.impl.swmlPackageImpl#getLinkKat2()
	 * @generated
	 */
	int LINK_KAT2 = 25;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_KAT2__LINK = LINKS__LINK;

	/**
	 * The feature id for the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_KAT2__TARGET_PAGE = LINKS__TARGET_PAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_KAT2__NAME = LINKS__NAME;

	/**
	 * The number of structural features of the '<em>Link Kat2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_KAT2_FEATURE_COUNT = LINKS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link swml.impl.NonContextualLinksImpl <em>Non Contextual Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.NonContextualLinksImpl
	 * @see swml.impl.swmlPackageImpl#getNonContextualLinks()
	 * @generated
	 */
	int NON_CONTEXTUAL_LINKS = 19;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONTEXTUAL_LINKS__LINK = LINK_KAT2__LINK;

	/**
	 * The feature id for the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONTEXTUAL_LINKS__TARGET_PAGE = LINK_KAT2__TARGET_PAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONTEXTUAL_LINKS__NAME = LINK_KAT2__NAME;

	/**
	 * The number of structural features of the '<em>Non Contextual Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONTEXTUAL_LINKS_FEATURE_COUNT = LINK_KAT2_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link swml.impl.ContextualLinksImpl <em>Contextual Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.ContextualLinksImpl
	 * @see swml.impl.swmlPackageImpl#getContextualLinks()
	 * @generated
	 */
	int CONTEXTUAL_LINKS = 20;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_LINKS__LINK = LINK_KAT2__LINK;

	/**
	 * The feature id for the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_LINKS__TARGET_PAGE = LINK_KAT2__TARGET_PAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_LINKS__NAME = LINK_KAT2__NAME;

	/**
	 * The number of structural features of the '<em>Contextual Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_LINKS_FEATURE_COUNT = LINK_KAT2_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link swml.impl.LinkKat1Impl <em>Link Kat1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.LinkKat1Impl
	 * @see swml.impl.swmlPackageImpl#getLinkKat1()
	 * @generated
	 */
	int LINK_KAT1 = 24;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_KAT1__LINK = LINKS__LINK;

	/**
	 * The feature id for the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_KAT1__TARGET_PAGE = LINKS__TARGET_PAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_KAT1__NAME = LINKS__NAME;

	/**
	 * The number of structural features of the '<em>Link Kat1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_KAT1_FEATURE_COUNT = LINKS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link swml.impl.OKImpl <em>OK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.OKImpl
	 * @see swml.impl.swmlPackageImpl#getOK()
	 * @generated
	 */
	int OK = 21;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK__LINK = LINK_KAT1__LINK;

	/**
	 * The feature id for the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK__TARGET_PAGE = LINK_KAT1__TARGET_PAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK__NAME = LINK_KAT1__NAME;

	/**
	 * The number of structural features of the '<em>OK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_FEATURE_COUNT = LINK_KAT1_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link swml.impl.KOImpl <em>KO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.KOImpl
	 * @see swml.impl.swmlPackageImpl#getKO()
	 * @generated
	 */
	int KO = 22;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KO__LINK = LINK_KAT1__LINK;

	/**
	 * The feature id for the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KO__TARGET_PAGE = LINK_KAT1__TARGET_PAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KO__NAME = LINK_KAT1__NAME;

	/**
	 * The number of structural features of the '<em>KO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KO_FEATURE_COUNT = LINK_KAT1_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link swml.impl.LinkParamaterImpl <em>Link Paramater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.impl.LinkParamaterImpl
	 * @see swml.impl.swmlPackageImpl#getLinkParamater()
	 * @generated
	 */
	int LINK_PARAMATER = 23;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PARAMATER__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Link Paramater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PARAMATER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link swml.Datentyp <em>Datentyp</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swml.Datentyp
	 * @see swml.impl.swmlPackageImpl#getDatentyp()
	 * @generated
	 */
	int DATENTYP = 26;


	/**
	 * Returns the meta object for class '{@link swml.WebModel <em>Web Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Model</em>'.
	 * @see swml.WebModel
	 * @generated
	 */
	EClass getWebModel();

	/**
	 * Returns the meta object for the containment reference list '{@link swml.WebModel#getHypertextmodels <em>Hypertextmodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hypertextmodels</em>'.
	 * @see swml.WebModel#getHypertextmodels()
	 * @see #getWebModel()
	 * @generated
	 */
	EReference getWebModel_Hypertextmodels();

	/**
	 * Returns the meta object for the containment reference list '{@link swml.WebModel#getContentmodels <em>Contentmodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contentmodels</em>'.
	 * @see swml.WebModel#getContentmodels()
	 * @see #getWebModel()
	 * @generated
	 */
	EReference getWebModel_Contentmodels();

	/**
	 * Returns the meta object for class '{@link swml.ContentModel <em>Content Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Model</em>'.
	 * @see swml.ContentModel
	 * @generated
	 */
	EClass getContentModel();

	/**
	 * Returns the meta object for the containment reference list '{@link swml.ContentModel#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerations</em>'.
	 * @see swml.ContentModel#getEnumerations()
	 * @see #getContentModel()
	 * @generated
	 */
	EReference getContentModel_Enumerations();

	/**
	 * Returns the meta object for the containment reference list '{@link swml.ContentModel#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see swml.ContentModel#getEntities()
	 * @see #getContentModel()
	 * @generated
	 */
	EReference getContentModel_Entities();

	/**
	 * Returns the meta object for class '{@link swml.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see swml.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link swml.Entity#getEnumAttribute <em>Enum Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Attribute</em>'.
	 * @see swml.Entity#getEnumAttribute()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_EnumAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link swml.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see swml.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link swml.Entity#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see swml.Entity#getReferences()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_References();

	/**
	 * Returns the meta object for the attribute '{@link swml.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see swml.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link swml.Entity#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see swml.Entity#getChild()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Child();

	/**
	 * Returns the meta object for class '{@link swml.EnumTyp <em>Enum Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Typ</em>'.
	 * @see swml.EnumTyp
	 * @generated
	 */
	EClass getEnumTyp();

	/**
	 * Returns the meta object for the reference '{@link swml.EnumTyp#getEnums <em>Enums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enums</em>'.
	 * @see swml.EnumTyp#getEnums()
	 * @see #getEnumTyp()
	 * @generated
	 */
	EReference getEnumTyp_Enums();

	/**
	 * Returns the meta object for the attribute '{@link swml.EnumTyp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see swml.EnumTyp#getName()
	 * @see #getEnumTyp()
	 * @generated
	 */
	EAttribute getEnumTyp_Name();

	/**
	 * Returns the meta object for class '{@link swml.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see swml.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link swml.Reference#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see swml.Reference#getOpposite()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Opposite();

	/**
	 * Returns the meta object for the reference '{@link swml.Reference#getRefTo <em>Ref To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref To</em>'.
	 * @see swml.Reference#getRefTo()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_RefTo();

	/**
	 * Returns the meta object for the attribute '{@link swml.Reference#getRolename <em>Rolename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rolename</em>'.
	 * @see swml.Reference#getRolename()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Rolename();

	/**
	 * Returns the meta object for the attribute '{@link swml.Reference#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see swml.Reference#getLowerBound()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link swml.Reference#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see swml.Reference#getUpperBound()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_UpperBound();

	/**
	 * Returns the meta object for class '{@link swml.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see swml.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link swml.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see swml.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link swml.Attribute#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typ</em>'.
	 * @see swml.Attribute#getTyp()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Typ();

	/**
	 * Returns the meta object for class '{@link swml.Literals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literals</em>'.
	 * @see swml.Literals
	 * @generated
	 */
	EClass getLiterals();

	/**
	 * Returns the meta object for the attribute '{@link swml.Literals#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see swml.Literals#getName()
	 * @see #getLiterals()
	 * @generated
	 */
	EAttribute getLiterals_Name();

	/**
	 * Returns the meta object for class '{@link swml.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see swml.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link swml.Enumeration#getOwnedLiteral <em>Owned Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Literal</em>'.
	 * @see swml.Enumeration#getOwnedLiteral()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_OwnedLiteral();

	/**
	 * Returns the meta object for the attribute '{@link swml.Enumeration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see swml.Enumeration#getName()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Name();

	/**
	 * Returns the meta object for class '{@link swml.HypertextModel <em>Hypertext Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypertext Model</em>'.
	 * @see swml.HypertextModel
	 * @generated
	 */
	EClass getHypertextModel();

	/**
	 * Returns the meta object for the containment reference list '{@link swml.HypertextModel#getWebPages <em>Web Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Web Pages</em>'.
	 * @see swml.HypertextModel#getWebPages()
	 * @see #getHypertextModel()
	 * @generated
	 */
	EReference getHypertextModel_WebPages();

	/**
	 * Returns the meta object for the reference '{@link swml.HypertextModel#getHomepage <em>Homepage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Homepage</em>'.
	 * @see swml.HypertextModel#getHomepage()
	 * @see #getHypertextModel()
	 * @generated
	 */
	EReference getHypertextModel_Homepage();

	/**
	 * Returns the meta object for class '{@link swml.WebPage <em>Web Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Page</em>'.
	 * @see swml.WebPage
	 * @generated
	 */
	EClass getWebPage();

	/**
	 * Returns the meta object for the attribute '{@link swml.WebPage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see swml.WebPage#getName()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link swml.WebPage#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see swml.WebPage#getLink()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_Link();

	/**
	 * Returns the meta object for class '{@link swml.LinkJoinNode <em>Link Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Join Node</em>'.
	 * @see swml.LinkJoinNode
	 * @generated
	 */
	EClass getLinkJoinNode();

	/**
	 * Returns the meta object for the containment reference list '{@link swml.LinkJoinNode#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see swml.LinkJoinNode#getLinks()
	 * @see #getLinkJoinNode()
	 * @generated
	 */
	EReference getLinkJoinNode_Links();

	/**
	 * Returns the meta object for class '{@link swml.staticPage <em>static Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>static Page</em>'.
	 * @see swml.staticPage
	 * @generated
	 */
	EClass getstaticPage();

	/**
	 * Returns the meta object for class '{@link swml.dynamicPage <em>dynamic Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>dynamic Page</em>'.
	 * @see swml.dynamicPage
	 * @generated
	 */
	EClass getdynamicPage();

	/**
	 * Returns the meta object for the reference '{@link swml.dynamicPage#getEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity Type</em>'.
	 * @see swml.dynamicPage#getEntityType()
	 * @see #getdynamicPage()
	 * @generated
	 */
	EReference getdynamicPage_EntityType();

	/**
	 * Returns the meta object for class '{@link swml.EntityPages <em>Entity Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Pages</em>'.
	 * @see swml.EntityPages
	 * @generated
	 */
	EClass getEntityPages();

	/**
	 * Returns the meta object for the reference list '{@link swml.EntityPages#getInnerPage <em>Inner Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inner Page</em>'.
	 * @see swml.EntityPages#getInnerPage()
	 * @see #getEntityPages()
	 * @generated
	 */
	EReference getEntityPages_InnerPage();

	/**
	 * Returns the meta object for class '{@link swml.IndexPages <em>Index Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Pages</em>'.
	 * @see swml.IndexPages
	 * @generated
	 */
	EClass getIndexPages();

	/**
	 * Returns the meta object for class '{@link swml.UpdatePage <em>Update Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Page</em>'.
	 * @see swml.UpdatePage
	 * @generated
	 */
	EClass getUpdatePage();

	/**
	 * Returns the meta object for the containment reference '{@link swml.UpdatePage#getOKLink <em>OK Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>OK Link</em>'.
	 * @see swml.UpdatePage#getOKLink()
	 * @see #getUpdatePage()
	 * @generated
	 */
	EReference getUpdatePage_OKLink();

	/**
	 * Returns the meta object for the containment reference '{@link swml.UpdatePage#getKOLink <em>KO Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>KO Link</em>'.
	 * @see swml.UpdatePage#getKOLink()
	 * @see #getUpdatePage()
	 * @generated
	 */
	EReference getUpdatePage_KOLink();

	/**
	 * Returns the meta object for class '{@link swml.DeletePage <em>Delete Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Page</em>'.
	 * @see swml.DeletePage
	 * @generated
	 */
	EClass getDeletePage();

	/**
	 * Returns the meta object for the containment reference '{@link swml.DeletePage#getOKLink <em>OK Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>OK Link</em>'.
	 * @see swml.DeletePage#getOKLink()
	 * @see #getDeletePage()
	 * @generated
	 */
	EReference getDeletePage_OKLink();

	/**
	 * Returns the meta object for the containment reference '{@link swml.DeletePage#getKOLink <em>KO Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>KO Link</em>'.
	 * @see swml.DeletePage#getKOLink()
	 * @see #getDeletePage()
	 * @generated
	 */
	EReference getDeletePage_KOLink();

	/**
	 * Returns the meta object for class '{@link swml.CreatePage <em>Create Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Page</em>'.
	 * @see swml.CreatePage
	 * @generated
	 */
	EClass getCreatePage();

	/**
	 * Returns the meta object for the containment reference '{@link swml.CreatePage#getOKLink <em>OK Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>OK Link</em>'.
	 * @see swml.CreatePage#getOKLink()
	 * @see #getCreatePage()
	 * @generated
	 */
	EReference getCreatePage_OKLink();

	/**
	 * Returns the meta object for the containment reference '{@link swml.CreatePage#getKOLink <em>KO Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>KO Link</em>'.
	 * @see swml.CreatePage#getKOLink()
	 * @see #getCreatePage()
	 * @generated
	 */
	EReference getCreatePage_KOLink();

	/**
	 * Returns the meta object for class '{@link swml.Links <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Links</em>'.
	 * @see swml.Links
	 * @generated
	 */
	EClass getLinks();

	/**
	 * Returns the meta object for the containment reference '{@link swml.Links#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see swml.Links#getLink()
	 * @see #getLinks()
	 * @generated
	 */
	EReference getLinks_Link();

	/**
	 * Returns the meta object for the reference '{@link swml.Links#getTargetPage <em>Target Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Page</em>'.
	 * @see swml.Links#getTargetPage()
	 * @see #getLinks()
	 * @generated
	 */
	EReference getLinks_TargetPage();

	/**
	 * Returns the meta object for the attribute '{@link swml.Links#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see swml.Links#getName()
	 * @see #getLinks()
	 * @generated
	 */
	EAttribute getLinks_Name();

	/**
	 * Returns the meta object for class '{@link swml.NonContextualLinks <em>Non Contextual Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Contextual Links</em>'.
	 * @see swml.NonContextualLinks
	 * @generated
	 */
	EClass getNonContextualLinks();

	/**
	 * Returns the meta object for class '{@link swml.ContextualLinks <em>Contextual Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contextual Links</em>'.
	 * @see swml.ContextualLinks
	 * @generated
	 */
	EClass getContextualLinks();

	/**
	 * Returns the meta object for class '{@link swml.OK <em>OK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OK</em>'.
	 * @see swml.OK
	 * @generated
	 */
	EClass getOK();

	/**
	 * Returns the meta object for class '{@link swml.KO <em>KO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KO</em>'.
	 * @see swml.KO
	 * @generated
	 */
	EClass getKO();

	/**
	 * Returns the meta object for class '{@link swml.LinkParamater <em>Link Paramater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Paramater</em>'.
	 * @see swml.LinkParamater
	 * @generated
	 */
	EClass getLinkParamater();

	/**
	 * Returns the meta object for the attribute '{@link swml.LinkParamater#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see swml.LinkParamater#getParameter()
	 * @see #getLinkParamater()
	 * @generated
	 */
	EAttribute getLinkParamater_Parameter();

	/**
	 * Returns the meta object for class '{@link swml.LinkKat1 <em>Link Kat1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Kat1</em>'.
	 * @see swml.LinkKat1
	 * @generated
	 */
	EClass getLinkKat1();

	/**
	 * Returns the meta object for class '{@link swml.LinkKat2 <em>Link Kat2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Kat2</em>'.
	 * @see swml.LinkKat2
	 * @generated
	 */
	EClass getLinkKat2();

	/**
	 * Returns the meta object for enum '{@link swml.Datentyp <em>Datentyp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datentyp</em>'.
	 * @see swml.Datentyp
	 * @generated
	 */
	EEnum getDatentyp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	swmlFactory getswmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link swml.impl.WebModelImpl <em>Web Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.WebModelImpl
		 * @see swml.impl.swmlPackageImpl#getWebModel()
		 * @generated
		 */
		EClass WEB_MODEL = eINSTANCE.getWebModel();

		/**
		 * The meta object literal for the '<em><b>Hypertextmodels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_MODEL__HYPERTEXTMODELS = eINSTANCE.getWebModel_Hypertextmodels();

		/**
		 * The meta object literal for the '<em><b>Contentmodels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_MODEL__CONTENTMODELS = eINSTANCE.getWebModel_Contentmodels();

		/**
		 * The meta object literal for the '{@link swml.impl.ContentModelImpl <em>Content Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.ContentModelImpl
		 * @see swml.impl.swmlPackageImpl#getContentModel()
		 * @generated
		 */
		EClass CONTENT_MODEL = eINSTANCE.getContentModel();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_MODEL__ENUMERATIONS = eINSTANCE.getContentModel_Enumerations();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_MODEL__ENTITIES = eINSTANCE.getContentModel_Entities();

		/**
		 * The meta object literal for the '{@link swml.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.EntityImpl
		 * @see swml.impl.swmlPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Enum Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENUM_ATTRIBUTE = eINSTANCE.getEntity_EnumAttribute();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__REFERENCES = eINSTANCE.getEntity_References();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__CHILD = eINSTANCE.getEntity_Child();

		/**
		 * The meta object literal for the '{@link swml.impl.EnumTypImpl <em>Enum Typ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.EnumTypImpl
		 * @see swml.impl.swmlPackageImpl#getEnumTyp()
		 * @generated
		 */
		EClass ENUM_TYP = eINSTANCE.getEnumTyp();

		/**
		 * The meta object literal for the '<em><b>Enums</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_TYP__ENUMS = eINSTANCE.getEnumTyp_Enums();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_TYP__NAME = eINSTANCE.getEnumTyp_Name();

		/**
		 * The meta object literal for the '{@link swml.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.ReferenceImpl
		 * @see swml.impl.swmlPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__OPPOSITE = eINSTANCE.getReference_Opposite();

		/**
		 * The meta object literal for the '<em><b>Ref To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REF_TO = eINSTANCE.getReference_RefTo();

		/**
		 * The meta object literal for the '<em><b>Rolename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__ROLENAME = eINSTANCE.getReference_Rolename();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__LOWER_BOUND = eINSTANCE.getReference_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__UPPER_BOUND = eINSTANCE.getReference_UpperBound();

		/**
		 * The meta object literal for the '{@link swml.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.AttributeImpl
		 * @see swml.impl.swmlPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYP = eINSTANCE.getAttribute_Typ();

		/**
		 * The meta object literal for the '{@link swml.impl.LiteralsImpl <em>Literals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.LiteralsImpl
		 * @see swml.impl.swmlPackageImpl#getLiterals()
		 * @generated
		 */
		EClass LITERALS = eINSTANCE.getLiterals();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERALS__NAME = eINSTANCE.getLiterals_Name();

		/**
		 * The meta object literal for the '{@link swml.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.EnumerationImpl
		 * @see swml.impl.swmlPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Owned Literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__OWNED_LITERAL = eINSTANCE.getEnumeration_OwnedLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__NAME = eINSTANCE.getEnumeration_Name();

		/**
		 * The meta object literal for the '{@link swml.impl.HypertextModelImpl <em>Hypertext Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.HypertextModelImpl
		 * @see swml.impl.swmlPackageImpl#getHypertextModel()
		 * @generated
		 */
		EClass HYPERTEXT_MODEL = eINSTANCE.getHypertextModel();

		/**
		 * The meta object literal for the '<em><b>Web Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPERTEXT_MODEL__WEB_PAGES = eINSTANCE.getHypertextModel_WebPages();

		/**
		 * The meta object literal for the '<em><b>Homepage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPERTEXT_MODEL__HOMEPAGE = eINSTANCE.getHypertextModel_Homepage();

		/**
		 * The meta object literal for the '{@link swml.impl.WebPageImpl <em>Web Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.WebPageImpl
		 * @see swml.impl.swmlPackageImpl#getWebPage()
		 * @generated
		 */
		EClass WEB_PAGE = eINSTANCE.getWebPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__NAME = eINSTANCE.getWebPage_Name();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__LINK = eINSTANCE.getWebPage_Link();

		/**
		 * The meta object literal for the '{@link swml.impl.LinkJoinNodeImpl <em>Link Join Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.LinkJoinNodeImpl
		 * @see swml.impl.swmlPackageImpl#getLinkJoinNode()
		 * @generated
		 */
		EClass LINK_JOIN_NODE = eINSTANCE.getLinkJoinNode();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_JOIN_NODE__LINKS = eINSTANCE.getLinkJoinNode_Links();

		/**
		 * The meta object literal for the '{@link swml.impl.staticPageImpl <em>static Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.staticPageImpl
		 * @see swml.impl.swmlPackageImpl#getstaticPage()
		 * @generated
		 */
		EClass STATIC_PAGE = eINSTANCE.getstaticPage();

		/**
		 * The meta object literal for the '{@link swml.impl.dynamicPageImpl <em>dynamic Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.dynamicPageImpl
		 * @see swml.impl.swmlPackageImpl#getdynamicPage()
		 * @generated
		 */
		EClass DYNAMIC_PAGE = eINSTANCE.getdynamicPage();

		/**
		 * The meta object literal for the '<em><b>Entity Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_PAGE__ENTITY_TYPE = eINSTANCE.getdynamicPage_EntityType();

		/**
		 * The meta object literal for the '{@link swml.impl.EntityPagesImpl <em>Entity Pages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.EntityPagesImpl
		 * @see swml.impl.swmlPackageImpl#getEntityPages()
		 * @generated
		 */
		EClass ENTITY_PAGES = eINSTANCE.getEntityPages();

		/**
		 * The meta object literal for the '<em><b>Inner Page</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_PAGES__INNER_PAGE = eINSTANCE.getEntityPages_InnerPage();

		/**
		 * The meta object literal for the '{@link swml.impl.IndexPagesImpl <em>Index Pages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.IndexPagesImpl
		 * @see swml.impl.swmlPackageImpl#getIndexPages()
		 * @generated
		 */
		EClass INDEX_PAGES = eINSTANCE.getIndexPages();

		/**
		 * The meta object literal for the '{@link swml.impl.UpdatePageImpl <em>Update Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.UpdatePageImpl
		 * @see swml.impl.swmlPackageImpl#getUpdatePage()
		 * @generated
		 */
		EClass UPDATE_PAGE = eINSTANCE.getUpdatePage();

		/**
		 * The meta object literal for the '<em><b>OK Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_PAGE__OK_LINK = eINSTANCE.getUpdatePage_OKLink();

		/**
		 * The meta object literal for the '<em><b>KO Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_PAGE__KO_LINK = eINSTANCE.getUpdatePage_KOLink();

		/**
		 * The meta object literal for the '{@link swml.impl.DeletePageImpl <em>Delete Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.DeletePageImpl
		 * @see swml.impl.swmlPackageImpl#getDeletePage()
		 * @generated
		 */
		EClass DELETE_PAGE = eINSTANCE.getDeletePage();

		/**
		 * The meta object literal for the '<em><b>OK Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_PAGE__OK_LINK = eINSTANCE.getDeletePage_OKLink();

		/**
		 * The meta object literal for the '<em><b>KO Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_PAGE__KO_LINK = eINSTANCE.getDeletePage_KOLink();

		/**
		 * The meta object literal for the '{@link swml.impl.CreatePageImpl <em>Create Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.CreatePageImpl
		 * @see swml.impl.swmlPackageImpl#getCreatePage()
		 * @generated
		 */
		EClass CREATE_PAGE = eINSTANCE.getCreatePage();

		/**
		 * The meta object literal for the '<em><b>OK Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_PAGE__OK_LINK = eINSTANCE.getCreatePage_OKLink();

		/**
		 * The meta object literal for the '<em><b>KO Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_PAGE__KO_LINK = eINSTANCE.getCreatePage_KOLink();

		/**
		 * The meta object literal for the '{@link swml.impl.LinksImpl <em>Links</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.LinksImpl
		 * @see swml.impl.swmlPackageImpl#getLinks()
		 * @generated
		 */
		EClass LINKS = eINSTANCE.getLinks();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKS__LINK = eINSTANCE.getLinks_Link();

		/**
		 * The meta object literal for the '<em><b>Target Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKS__TARGET_PAGE = eINSTANCE.getLinks_TargetPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINKS__NAME = eINSTANCE.getLinks_Name();

		/**
		 * The meta object literal for the '{@link swml.impl.NonContextualLinksImpl <em>Non Contextual Links</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.NonContextualLinksImpl
		 * @see swml.impl.swmlPackageImpl#getNonContextualLinks()
		 * @generated
		 */
		EClass NON_CONTEXTUAL_LINKS = eINSTANCE.getNonContextualLinks();

		/**
		 * The meta object literal for the '{@link swml.impl.ContextualLinksImpl <em>Contextual Links</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.ContextualLinksImpl
		 * @see swml.impl.swmlPackageImpl#getContextualLinks()
		 * @generated
		 */
		EClass CONTEXTUAL_LINKS = eINSTANCE.getContextualLinks();

		/**
		 * The meta object literal for the '{@link swml.impl.OKImpl <em>OK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.OKImpl
		 * @see swml.impl.swmlPackageImpl#getOK()
		 * @generated
		 */
		EClass OK = eINSTANCE.getOK();

		/**
		 * The meta object literal for the '{@link swml.impl.KOImpl <em>KO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.KOImpl
		 * @see swml.impl.swmlPackageImpl#getKO()
		 * @generated
		 */
		EClass KO = eINSTANCE.getKO();

		/**
		 * The meta object literal for the '{@link swml.impl.LinkParamaterImpl <em>Link Paramater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.LinkParamaterImpl
		 * @see swml.impl.swmlPackageImpl#getLinkParamater()
		 * @generated
		 */
		EClass LINK_PARAMATER = eINSTANCE.getLinkParamater();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_PARAMATER__PARAMETER = eINSTANCE.getLinkParamater_Parameter();

		/**
		 * The meta object literal for the '{@link swml.impl.LinkKat1Impl <em>Link Kat1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.LinkKat1Impl
		 * @see swml.impl.swmlPackageImpl#getLinkKat1()
		 * @generated
		 */
		EClass LINK_KAT1 = eINSTANCE.getLinkKat1();

		/**
		 * The meta object literal for the '{@link swml.impl.LinkKat2Impl <em>Link Kat2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.impl.LinkKat2Impl
		 * @see swml.impl.swmlPackageImpl#getLinkKat2()
		 * @generated
		 */
		EClass LINK_KAT2 = eINSTANCE.getLinkKat2();

		/**
		 * The meta object literal for the '{@link swml.Datentyp <em>Datentyp</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swml.Datentyp
		 * @see swml.impl.swmlPackageImpl#getDatentyp()
		 * @generated
		 */
		EEnum DATENTYP = eINSTANCE.getDatentyp();

	}

} //swmlPackage
