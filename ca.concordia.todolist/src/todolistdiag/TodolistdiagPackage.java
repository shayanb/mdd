/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag;

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
 * @see todolistdiag.TodolistdiagFactory
 * @model kind="package"
 * @generated
 */
public interface TodolistdiagPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "todolistdiag";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://todolistdiag/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "todolistdiag";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TodolistdiagPackage eINSTANCE = todolistdiag.impl.TodolistdiagPackageImpl.init();

	/**
	 * The meta object id for the '{@link todolistdiag.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see todolistdiag.impl.TaskImpl
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Importance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IMPORTANCE_LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__BELONGS_TO = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = 5;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link todolistdiag.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see todolistdiag.impl.FolderImpl
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 1;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CONTAINS = 0;

	/**
	 * The feature id for the '<em><b>Contains Sub Folders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CONTAINS_SUB_FOLDERS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ID = 3;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link todolistdiag.impl.TasksManagerImpl <em>Tasks Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see todolistdiag.impl.TasksManagerImpl
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getTasksManager()
	 * @generated
	 */
	int TASKS_MANAGER = 2;

	/**
	 * The number of structural features of the '<em>Tasks Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link todolistdiag.impl.FoldersManagerImpl <em>Folders Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see todolistdiag.impl.FoldersManagerImpl
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getFoldersManager()
	 * @generated
	 */
	int FOLDERS_MANAGER = 3;

	/**
	 * The number of structural features of the '<em>Folders Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDERS_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link todolistdiag.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see todolistdiag.Status
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 4;

	/**
	 * The meta object id for the '{@link todolistdiag.Importance <em>Importance</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see todolistdiag.Importance
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getImportance()
	 * @generated
	 */
	int IMPORTANCE = 5;


	/**
	 * Returns the meta object for class '{@link todolistdiag.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see todolistdiag.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see todolistdiag.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.Task#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see todolistdiag.Task#getStatus()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Status();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.Task#getImportanceLevel <em>Importance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Importance Level</em>'.
	 * @see todolistdiag.Task#getImportanceLevel()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ImportanceLevel();

	/**
	 * Returns the meta object for the reference list '{@link todolistdiag.Task#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Belongs To</em>'.
	 * @see todolistdiag.Task#getBelongsTo()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_BelongsTo();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see todolistdiag.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.Task#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see todolistdiag.Task#getId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Id();

	/**
	 * Returns the meta object for class '{@link todolistdiag.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see todolistdiag.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the reference list '{@link todolistdiag.Folder#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see todolistdiag.Folder#getContains()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Contains();

	/**
	 * Returns the meta object for the reference list '{@link todolistdiag.Folder#getContainsSubFolders <em>Contains Sub Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Sub Folders</em>'.
	 * @see todolistdiag.Folder#getContainsSubFolders()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_ContainsSubFolders();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.Folder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see todolistdiag.Folder#getName()
	 * @see #getFolder()
	 * @generated
	 */
	EAttribute getFolder_Name();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.Folder#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see todolistdiag.Folder#getId()
	 * @see #getFolder()
	 * @generated
	 */
	EAttribute getFolder_Id();

	/**
	 * Returns the meta object for class '{@link todolistdiag.TasksManager <em>Tasks Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tasks Manager</em>'.
	 * @see todolistdiag.TasksManager
	 * @generated
	 */
	EClass getTasksManager();

	/**
	 * Returns the meta object for class '{@link todolistdiag.FoldersManager <em>Folders Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folders Manager</em>'.
	 * @see todolistdiag.FoldersManager
	 * @generated
	 */
	EClass getFoldersManager();

	/**
	 * Returns the meta object for enum '{@link todolistdiag.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see todolistdiag.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link todolistdiag.Importance <em>Importance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Importance</em>'.
	 * @see todolistdiag.Importance
	 * @generated
	 */
	EEnum getImportance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TodolistdiagFactory getTodolistdiagFactory();

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
		 * The meta object literal for the '{@link todolistdiag.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see todolistdiag.impl.TaskImpl
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__STATUS = eINSTANCE.getTask_Status();

		/**
		 * The meta object literal for the '<em><b>Importance Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IMPORTANCE_LEVEL = eINSTANCE.getTask_ImportanceLevel();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__BELONGS_TO = eINSTANCE.getTask_BelongsTo();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ID = eINSTANCE.getTask_Id();

		/**
		 * The meta object literal for the '{@link todolistdiag.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see todolistdiag.impl.FolderImpl
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__CONTAINS = eINSTANCE.getFolder_Contains();

		/**
		 * The meta object literal for the '<em><b>Contains Sub Folders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__CONTAINS_SUB_FOLDERS = eINSTANCE.getFolder_ContainsSubFolders();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER__NAME = eINSTANCE.getFolder_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER__ID = eINSTANCE.getFolder_Id();

		/**
		 * The meta object literal for the '{@link todolistdiag.impl.TasksManagerImpl <em>Tasks Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see todolistdiag.impl.TasksManagerImpl
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getTasksManager()
		 * @generated
		 */
		EClass TASKS_MANAGER = eINSTANCE.getTasksManager();

		/**
		 * The meta object literal for the '{@link todolistdiag.impl.FoldersManagerImpl <em>Folders Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see todolistdiag.impl.FoldersManagerImpl
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getFoldersManager()
		 * @generated
		 */
		EClass FOLDERS_MANAGER = eINSTANCE.getFoldersManager();

		/**
		 * The meta object literal for the '{@link todolistdiag.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see todolistdiag.Status
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link todolistdiag.Importance <em>Importance</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see todolistdiag.Importance
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getImportance()
		 * @generated
		 */
		EEnum IMPORTANCE = eINSTANCE.getImportance();

	}

} //TodolistdiagPackage
