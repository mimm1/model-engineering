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
 * A representation of the model object '<em><b>Link Join Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link swml.LinkJoinNode#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see swml.swmlPackage#getLinkJoinNode()
 * @model
 * @generated
 */
public interface LinkJoinNode extends WebPage {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link swml.LinkKat1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see swml.swmlPackage#getLinkJoinNode_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkKat1> getLinks();

} // LinkJoinNode
