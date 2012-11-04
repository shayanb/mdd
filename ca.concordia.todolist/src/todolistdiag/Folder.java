/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link todolistdiag.Folder#getContains <em>Contains</em>}</li>
 *   <li>{@link todolistdiag.Folder#getContainsSubFolders <em>Contains Sub Folders</em>}</li>
 *   <li>{@link todolistdiag.Folder#getName <em>Name</em>}</li>
 *   <li>{@link todolistdiag.Folder#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see todolistdiag.TodolistdiagPackage#getFolder()
 * @model
 * @generated
 */
public interface Folder extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link todolistdiag.Task}.
	 * It is bidirectional and its opposite is '{@link todolistdiag.Task#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see todolistdiag.TodolistdiagPackage#getFolder_Contains()
	 * @see todolistdiag.Task#getBelongsTo
	 * @model opposite="belongsTo"
	 * @generated
	 */
	EList<Task> getContains();

	/**
	 * Returns the value of the '<em><b>Contains Sub Folders</b></em>' reference list.
	 * The list contents are of type {@link todolistdiag.Folder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Sub Folders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Sub Folders</em>' reference list.
	 * @see todolistdiag.TodolistdiagPackage#getFolder_ContainsSubFolders()
	 * @model
	 * @generated
	 */
	EList<Folder> getContainsSubFolders();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see todolistdiag.TodolistdiagPackage#getFolder_Name()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' namespace=''"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link todolistdiag.Folder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see todolistdiag.TodolistdiagPackage#getFolder_Id()
	 * @model id="true" required="true" changeable="false"
	 * @generated
	 */
	long getId();

} // Folder
