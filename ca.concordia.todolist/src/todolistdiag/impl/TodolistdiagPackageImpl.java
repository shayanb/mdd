/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import todolistdiag.Folder;
import todolistdiag.FoldersManager;
import todolistdiag.Importance;
import todolistdiag.Status;
import todolistdiag.Task;
import todolistdiag.TasksManager;
import todolistdiag.TodolistdiagFactory;
import todolistdiag.TodolistdiagPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TodolistdiagPackageImpl extends EPackageImpl implements TodolistdiagPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tasksManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foldersManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum importanceEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see todolistdiag.TodolistdiagPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TodolistdiagPackageImpl() {
		super(eNS_URI, TodolistdiagFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TodolistdiagPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TodolistdiagPackage init() {
		if (isInited) return (TodolistdiagPackage)EPackage.Registry.INSTANCE.getEPackage(TodolistdiagPackage.eNS_URI);

		// Obtain or create and register package
		TodolistdiagPackageImpl theTodolistdiagPackage = (TodolistdiagPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TodolistdiagPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TodolistdiagPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTodolistdiagPackage.createPackageContents();

		// Initialize created meta-data
		theTodolistdiagPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTodolistdiagPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TodolistdiagPackage.eNS_URI, theTodolistdiagPackage);
		return theTodolistdiagPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Status() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_ImportanceLevel() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_BelongsTo() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Description() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Id() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolder() {
		return folderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolder_Contains() {
		return (EReference)folderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolder_ContainsSubFolders() {
		return (EReference)folderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFolder_Name() {
		return (EAttribute)folderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFolder_Id() {
		return (EAttribute)folderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTasksManager() {
		return tasksManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFoldersManager() {
		return foldersManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImportance() {
		return importanceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TodolistdiagFactory getTodolistdiagFactory() {
		return (TodolistdiagFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__STATUS);
		createEAttribute(taskEClass, TASK__IMPORTANCE_LEVEL);
		createEReference(taskEClass, TASK__BELONGS_TO);
		createEAttribute(taskEClass, TASK__DESCRIPTION);
		createEAttribute(taskEClass, TASK__ID);

		folderEClass = createEClass(FOLDER);
		createEReference(folderEClass, FOLDER__CONTAINS);
		createEReference(folderEClass, FOLDER__CONTAINS_SUB_FOLDERS);
		createEAttribute(folderEClass, FOLDER__NAME);
		createEAttribute(folderEClass, FOLDER__ID);

		tasksManagerEClass = createEClass(TASKS_MANAGER);

		foldersManagerEClass = createEClass(FOLDERS_MANAGER);

		// Create enums
		statusEEnum = createEEnum(STATUS);
		importanceEEnum = createEEnum(IMPORTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Status(), this.getStatus(), "status", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_ImportanceLevel(), this.getImportance(), "importanceLevel", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_BelongsTo(), this.getFolder(), this.getFolder_Contains(), "belongsTo", null, 1, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Description(), ecorePackage.getEString(), "description", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Id(), ecorePackage.getELong(), "id", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(taskEClass, null, "statusNotStarted", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(taskEClass, null, "statusInProgress", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(taskEClass, null, "statusDone", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(folderEClass, Folder.class, "Folder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFolder_Contains(), this.getTask(), this.getTask_BelongsTo(), "contains", null, 0, -1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFolder_ContainsSubFolders(), this.getFolder(), null, "containsSubFolders", null, 0, -1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFolder_Name(), ecorePackage.getEString(), "name", null, 1, 1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFolder_Id(), ecorePackage.getELong(), "id", null, 1, 1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tasksManagerEClass, TasksManager.class, "TasksManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(tasksManagerEClass, this.getTask(), "createTask", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(tasksManagerEClass, null, "editTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tasksManagerEClass, null, "deleteTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(foldersManagerEClass, FoldersManager.class, "FoldersManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(foldersManagerEClass, this.getFolder(), "createFolder", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(foldersManagerEClass, null, "editFolder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFolder(), "folder", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(foldersManagerEClass, null, "deleteFolder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFolder(), "folder", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.NOT_STARTED);
		addEEnumLiteral(statusEEnum, Status.IN_PROGRESS);
		addEEnumLiteral(statusEEnum, Status.DONE);

		initEEnum(importanceEEnum, Importance.class, "Importance");
		addEEnumLiteral(importanceEEnum, Importance.LOW);
		addEEnumLiteral(importanceEEnum, Importance.MEDIUM);
		addEEnumLiteral(importanceEEnum, Importance.HIGH);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (getFolder_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "namespace", ""
		   });
	}

} //TodolistdiagPackageImpl
