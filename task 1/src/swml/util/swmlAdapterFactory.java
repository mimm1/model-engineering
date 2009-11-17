/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import swml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see swml.swmlPackage
 * @generated
 */
public class swmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static swmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public swmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = swmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected swmlSwitch<Adapter> modelSwitch =
		new swmlSwitch<Adapter>() {
			@Override
			public Adapter caseWebModel(WebModel object) {
				return createWebModelAdapter();
			}
			@Override
			public Adapter caseContentModel(ContentModel object) {
				return createContentModelAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseEnumTyp(EnumTyp object) {
				return createEnumTypAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseLiterals(Literals object) {
				return createLiteralsAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseHypertextModel(HypertextModel object) {
				return createHypertextModelAdapter();
			}
			@Override
			public Adapter caseWebPage(WebPage object) {
				return createWebPageAdapter();
			}
			@Override
			public Adapter caseLinkJoinNode(LinkJoinNode object) {
				return createLinkJoinNodeAdapter();
			}
			@Override
			public Adapter casestaticPage(staticPage object) {
				return createstaticPageAdapter();
			}
			@Override
			public Adapter casedynamicPage(dynamicPage object) {
				return createdynamicPageAdapter();
			}
			@Override
			public Adapter caseEntityPages(EntityPages object) {
				return createEntityPagesAdapter();
			}
			@Override
			public Adapter caseIndexPages(IndexPages object) {
				return createIndexPagesAdapter();
			}
			@Override
			public Adapter caseUpdatePage(UpdatePage object) {
				return createUpdatePageAdapter();
			}
			@Override
			public Adapter caseDeletePage(DeletePage object) {
				return createDeletePageAdapter();
			}
			@Override
			public Adapter caseCreatePage(CreatePage object) {
				return createCreatePageAdapter();
			}
			@Override
			public Adapter caseLinks(Links object) {
				return createLinksAdapter();
			}
			@Override
			public Adapter caseNonContextualLinks(NonContextualLinks object) {
				return createNonContextualLinksAdapter();
			}
			@Override
			public Adapter caseContextualLinks(ContextualLinks object) {
				return createContextualLinksAdapter();
			}
			@Override
			public Adapter caseOK(OK object) {
				return createOKAdapter();
			}
			@Override
			public Adapter caseKO(KO object) {
				return createKOAdapter();
			}
			@Override
			public Adapter caseLinkParamater(LinkParamater object) {
				return createLinkParamaterAdapter();
			}
			@Override
			public Adapter caseLinkKat1(LinkKat1 object) {
				return createLinkKat1Adapter();
			}
			@Override
			public Adapter caseLinkKat2(LinkKat2 object) {
				return createLinkKat2Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link swml.WebModel <em>Web Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.WebModel
	 * @generated
	 */
	public Adapter createWebModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.ContentModel <em>Content Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.ContentModel
	 * @generated
	 */
	public Adapter createContentModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.EnumTyp <em>Enum Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.EnumTyp
	 * @generated
	 */
	public Adapter createEnumTypAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.Literals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.Literals
	 * @generated
	 */
	public Adapter createLiteralsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.HypertextModel <em>Hypertext Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.HypertextModel
	 * @generated
	 */
	public Adapter createHypertextModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.WebPage <em>Web Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.WebPage
	 * @generated
	 */
	public Adapter createWebPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.LinkJoinNode <em>Link Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.LinkJoinNode
	 * @generated
	 */
	public Adapter createLinkJoinNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.staticPage <em>static Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.staticPage
	 * @generated
	 */
	public Adapter createstaticPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.dynamicPage <em>dynamic Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.dynamicPage
	 * @generated
	 */
	public Adapter createdynamicPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.EntityPages <em>Entity Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.EntityPages
	 * @generated
	 */
	public Adapter createEntityPagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.IndexPages <em>Index Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.IndexPages
	 * @generated
	 */
	public Adapter createIndexPagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.UpdatePage <em>Update Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.UpdatePage
	 * @generated
	 */
	public Adapter createUpdatePageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.DeletePage <em>Delete Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.DeletePage
	 * @generated
	 */
	public Adapter createDeletePageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.CreatePage <em>Create Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.CreatePage
	 * @generated
	 */
	public Adapter createCreatePageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.Links <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.Links
	 * @generated
	 */
	public Adapter createLinksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.NonContextualLinks <em>Non Contextual Links</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.NonContextualLinks
	 * @generated
	 */
	public Adapter createNonContextualLinksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.ContextualLinks <em>Contextual Links</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.ContextualLinks
	 * @generated
	 */
	public Adapter createContextualLinksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.OK <em>OK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.OK
	 * @generated
	 */
	public Adapter createOKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.KO <em>KO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.KO
	 * @generated
	 */
	public Adapter createKOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.LinkParamater <em>Link Paramater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.LinkParamater
	 * @generated
	 */
	public Adapter createLinkParamaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.LinkKat1 <em>Link Kat1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.LinkKat1
	 * @generated
	 */
	public Adapter createLinkKat1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link swml.LinkKat2 <em>Link Kat2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see swml.LinkKat2
	 * @generated
	 */
	public Adapter createLinkKat2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //swmlAdapterFactory
