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
 * A representation of the model object '<em><b>Tasks Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see todolistdiag.TodolistdiagPackage#getTasksManager()
 * @model
 * @generated
 */
public interface TasksManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Task createTask();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void editTask(Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteTask(Task task);

} // TasksManager
