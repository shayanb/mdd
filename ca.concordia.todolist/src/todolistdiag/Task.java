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
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link todolistdiag.Task#getName <em>Name</em>}</li>
 *   <li>{@link todolistdiag.Task#getStatus <em>Status</em>}</li>
 *   <li>{@link todolistdiag.Task#getImportanceLevel <em>Importance Level</em>}</li>
 *   <li>{@link todolistdiag.Task#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link todolistdiag.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link todolistdiag.Task#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see todolistdiag.TodolistdiagPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
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
	 * @see todolistdiag.TodolistdiagPackage#getTask_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link todolistdiag.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link todolistdiag.Status}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see todolistdiag.Status
	 * @see #setStatus(Status)
	 * @see todolistdiag.TodolistdiagPackage#getTask_Status()
	 * @model required="true"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link todolistdiag.Task#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see todolistdiag.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Importance Level</b></em>' attribute.
	 * The literals are from the enumeration {@link todolistdiag.Importance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importance Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importance Level</em>' attribute.
	 * @see todolistdiag.Importance
	 * @see #setImportanceLevel(Importance)
	 * @see todolistdiag.TodolistdiagPackage#getTask_ImportanceLevel()
	 * @model required="true"
	 * @generated
	 */
	Importance getImportanceLevel();

	/**
	 * Sets the value of the '{@link todolistdiag.Task#getImportanceLevel <em>Importance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importance Level</em>' attribute.
	 * @see todolistdiag.Importance
	 * @see #getImportanceLevel()
	 * @generated
	 */
	void setImportanceLevel(Importance value);

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' reference list.
	 * The list contents are of type {@link todolistdiag.Folder}.
	 * It is bidirectional and its opposite is '{@link todolistdiag.Folder#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' reference list.
	 * @see todolistdiag.TodolistdiagPackage#getTask_BelongsTo()
	 * @see todolistdiag.Folder#getContains
	 * @model opposite="contains" required="true"
	 * @generated
	 */
	EList<Folder> getBelongsTo();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see todolistdiag.TodolistdiagPackage#getTask_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link todolistdiag.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see todolistdiag.TodolistdiagPackage#getTask_Id()
	 * @model id="true" required="true" changeable="false"
	 * @generated
	 */
	long getId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void statusNotStarted();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void statusInProgress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void statusDone();

} // Task
