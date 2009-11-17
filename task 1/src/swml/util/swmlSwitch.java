/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import swml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see swml.swmlPackage
 * @generated
 */
public class swmlSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static swmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public swmlSwitch() {
		if (modelPackage == null) {
			modelPackage = swmlPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case swmlPackage.WEB_MODEL: {
				WebModel webModel = (WebModel)theEObject;
				T result = caseWebModel(webModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.CONTENT_MODEL: {
				ContentModel contentModel = (ContentModel)theEObject;
				T result = caseContentModel(contentModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.ENUM_TYP: {
				EnumTyp enumTyp = (EnumTyp)theEObject;
				T result = caseEnumTyp(enumTyp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.LITERALS: {
				Literals literals = (Literals)theEObject;
				T result = caseLiterals(literals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.HYPERTEXT_MODEL: {
				HypertextModel hypertextModel = (HypertextModel)theEObject;
				T result = caseHypertextModel(hypertextModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.WEB_PAGE: {
				WebPage webPage = (WebPage)theEObject;
				T result = caseWebPage(webPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.LINK_JOIN_NODE: {
				LinkJoinNode linkJoinNode = (LinkJoinNode)theEObject;
				T result = caseLinkJoinNode(linkJoinNode);
				if (result == null) result = caseWebPage(linkJoinNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.STATIC_PAGE: {
				staticPage staticPage = (staticPage)theEObject;
				T result = casestaticPage(staticPage);
				if (result == null) result = caseWebPage(staticPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.DYNAMIC_PAGE: {
				dynamicPage dynamicPage = (dynamicPage)theEObject;
				T result = casedynamicPage(dynamicPage);
				if (result == null) result = caseWebPage(dynamicPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.ENTITY_PAGES: {
				EntityPages entityPages = (EntityPages)theEObject;
				T result = caseEntityPages(entityPages);
				if (result == null) result = casedynamicPage(entityPages);
				if (result == null) result = caseWebPage(entityPages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.INDEX_PAGES: {
				IndexPages indexPages = (IndexPages)theEObject;
				T result = caseIndexPages(indexPages);
				if (result == null) result = casedynamicPage(indexPages);
				if (result == null) result = caseWebPage(indexPages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.UPDATE_PAGE: {
				UpdatePage updatePage = (UpdatePage)theEObject;
				T result = caseUpdatePage(updatePage);
				if (result == null) result = caseEntityPages(updatePage);
				if (result == null) result = casedynamicPage(updatePage);
				if (result == null) result = caseWebPage(updatePage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.DELETE_PAGE: {
				DeletePage deletePage = (DeletePage)theEObject;
				T result = caseDeletePage(deletePage);
				if (result == null) result = caseEntityPages(deletePage);
				if (result == null) result = casedynamicPage(deletePage);
				if (result == null) result = caseWebPage(deletePage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.CREATE_PAGE: {
				CreatePage createPage = (CreatePage)theEObject;
				T result = caseCreatePage(createPage);
				if (result == null) result = caseEntityPages(createPage);
				if (result == null) result = casedynamicPage(createPage);
				if (result == null) result = caseWebPage(createPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.LINKS: {
				Links links = (Links)theEObject;
				T result = caseLinks(links);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.NON_CONTEXTUAL_LINKS: {
				NonContextualLinks nonContextualLinks = (NonContextualLinks)theEObject;
				T result = caseNonContextualLinks(nonContextualLinks);
				if (result == null) result = caseLinkKat2(nonContextualLinks);
				if (result == null) result = caseLinks(nonContextualLinks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.CONTEXTUAL_LINKS: {
				ContextualLinks contextualLinks = (ContextualLinks)theEObject;
				T result = caseContextualLinks(contextualLinks);
				if (result == null) result = caseLinkKat2(contextualLinks);
				if (result == null) result = caseLinks(contextualLinks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.OK: {
				OK ok = (OK)theEObject;
				T result = caseOK(ok);
				if (result == null) result = caseLinkKat1(ok);
				if (result == null) result = caseLinks(ok);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.KO: {
				KO ko = (KO)theEObject;
				T result = caseKO(ko);
				if (result == null) result = caseLinkKat1(ko);
				if (result == null) result = caseLinks(ko);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.LINK_PARAMATER: {
				LinkParamater linkParamater = (LinkParamater)theEObject;
				T result = caseLinkParamater(linkParamater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.LINK_KAT1: {
				LinkKat1 linkKat1 = (LinkKat1)theEObject;
				T result = caseLinkKat1(linkKat1);
				if (result == null) result = caseLinks(linkKat1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case swmlPackage.LINK_KAT2: {
				LinkKat2 linkKat2 = (LinkKat2)theEObject;
				T result = caseLinkKat2(linkKat2);
				if (result == null) result = caseLinks(linkKat2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebModel(WebModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentModel(ContentModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Typ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Typ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumTyp(EnumTyp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiterals(Literals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hypertext Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hypertext Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHypertextModel(HypertextModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebPage(WebPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Join Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkJoinNode(LinkJoinNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>static Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>static Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestaticPage(staticPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>dynamic Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>dynamic Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedynamicPage(dynamicPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Pages</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Pages</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityPages(EntityPages object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Pages</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Pages</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexPages(IndexPages object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdatePage(UpdatePage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeletePage(DeletePage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreatePage(CreatePage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Links</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Links</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinks(Links object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Contextual Links</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Contextual Links</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonContextualLinks(NonContextualLinks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contextual Links</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contextual Links</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextualLinks(ContextualLinks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OK</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OK</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOK(OK object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKO(KO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Paramater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Paramater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkParamater(LinkParamater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Kat1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Kat1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkKat1(LinkKat1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Kat2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Kat2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkKat2(LinkKat2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //swmlSwitch
