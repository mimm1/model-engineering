/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import swml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class swmlFactoryImpl extends EFactoryImpl implements swmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static swmlFactory init() {
		try {
			swmlFactory theswmlFactory = (swmlFactory)EPackage.Registry.INSTANCE.getEFactory("http://swml/1.0"); 
			if (theswmlFactory != null) {
				return theswmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new swmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public swmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case swmlPackage.WEB_MODEL: return createWebModel();
			case swmlPackage.CONTENT_MODEL: return createContentModel();
			case swmlPackage.ENTITY: return createEntity();
			case swmlPackage.ENUM_TYP: return createEnumTyp();
			case swmlPackage.REFERENCE: return createReference();
			case swmlPackage.ATTRIBUTE: return createAttribute();
			case swmlPackage.LITERALS: return createLiterals();
			case swmlPackage.ENUMERATION: return createEnumeration();
			case swmlPackage.HYPERTEXT_MODEL: return createHypertextModel();
			case swmlPackage.LINK_JOIN_NODE: return createLinkJoinNode();
			case swmlPackage.STATIC_PAGE: return createstaticPage();
			case swmlPackage.ENTITY_PAGES: return createEntityPages();
			case swmlPackage.INDEX_PAGES: return createIndexPages();
			case swmlPackage.UPDATE_PAGE: return createUpdatePage();
			case swmlPackage.DELETE_PAGE: return createDeletePage();
			case swmlPackage.CREATE_PAGE: return createCreatePage();
			case swmlPackage.NON_CONTEXTUAL_LINKS: return createNonContextualLinks();
			case swmlPackage.CONTEXTUAL_LINKS: return createContextualLinks();
			case swmlPackage.OK: return createOK();
			case swmlPackage.KO: return createKO();
			case swmlPackage.LINK_PARAMATER: return createLinkParamater();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case swmlPackage.DATENTYP:
				return createDatentypFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case swmlPackage.DATENTYP:
				return convertDatentypToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebModel createWebModel() {
		WebModelImpl webModel = new WebModelImpl();
		return webModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentModel createContentModel() {
		ContentModelImpl contentModel = new ContentModelImpl();
		return contentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTyp createEnumTyp() {
		EnumTypImpl enumTyp = new EnumTypImpl();
		return enumTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literals createLiterals() {
		LiteralsImpl literals = new LiteralsImpl();
		return literals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypertextModel createHypertextModel() {
		HypertextModelImpl hypertextModel = new HypertextModelImpl();
		return hypertextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkJoinNode createLinkJoinNode() {
		LinkJoinNodeImpl linkJoinNode = new LinkJoinNodeImpl();
		return linkJoinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public staticPage createstaticPage() {
		staticPageImpl staticPage = new staticPageImpl();
		return staticPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityPages createEntityPages() {
		EntityPagesImpl entityPages = new EntityPagesImpl();
		return entityPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexPages createIndexPages() {
		IndexPagesImpl indexPages = new IndexPagesImpl();
		return indexPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdatePage createUpdatePage() {
		UpdatePageImpl updatePage = new UpdatePageImpl();
		return updatePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletePage createDeletePage() {
		DeletePageImpl deletePage = new DeletePageImpl();
		return deletePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreatePage createCreatePage() {
		CreatePageImpl createPage = new CreatePageImpl();
		return createPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonContextualLinks createNonContextualLinks() {
		NonContextualLinksImpl nonContextualLinks = new NonContextualLinksImpl();
		return nonContextualLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualLinks createContextualLinks() {
		ContextualLinksImpl contextualLinks = new ContextualLinksImpl();
		return contextualLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OK createOK() {
		OKImpl ok = new OKImpl();
		return ok;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KO createKO() {
		KOImpl ko = new KOImpl();
		return ko;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkParamater createLinkParamater() {
		LinkParamaterImpl linkParamater = new LinkParamaterImpl();
		return linkParamater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datentyp createDatentypFromString(EDataType eDataType, String initialValue) {
		Datentyp result = Datentyp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatentypToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public swmlPackage getswmlPackage() {
		return (swmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static swmlPackage getPackage() {
		return swmlPackage.eINSTANCE;
	}

} //swmlFactoryImpl
