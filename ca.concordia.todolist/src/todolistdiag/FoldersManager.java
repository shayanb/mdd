/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folders Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see todolistdiag.TodolistdiagPackage#getFoldersManager()
 * @model
 * @generated
 */
public interface FoldersManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Folder createFolder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void editFolder(Folder folder);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteFolder(Folder folder);

} // FoldersManager
