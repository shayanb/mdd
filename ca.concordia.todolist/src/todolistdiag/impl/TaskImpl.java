/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import todolistdiag.Folder;
import todolistdiag.Importance;
import todolistdiag.Status;
import todolistdiag.Task;
import todolistdiag.TodolistdiagPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link todolistdiag.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link todolistdiag.impl.TaskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link todolistdiag.impl.TaskImpl#getImportanceLevel <em>Importance Level</em>}</li>
 *   <li>{@link todolistdiag.impl.TaskImpl#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link todolistdiag.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link todolistdiag.impl.TaskImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.NOT_STARTED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportanceLevel() <em>Importance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportanceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Importance IMPORTANCE_LEVEL_EDEFAULT = Importance.LOW;

	/**
	 * The cached value of the '{@link #getImportanceLevel() <em>Importance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportanceLevel()
	 * @generated
	 * @ordered
	 */
	protected Importance importanceLevel = IMPORTANCE_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBelongsTo() <em>Belongs To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Folder> belongsTo;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TodolistdiagPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.TASK__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Importance getImportanceLevel() {
		return importanceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportanceLevel(Importance newImportanceLevel) {
		Importance oldImportanceLevel = importanceLevel;
		importanceLevel = newImportanceLevel == null ? IMPORTANCE_LEVEL_EDEFAULT : newImportanceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.TASK__IMPORTANCE_LEVEL, oldImportanceLevel, importanceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Folder> getBelongsTo() {
		if (belongsTo == null) {
			belongsTo = new EObjectWithInverseResolvingEList.ManyInverse<Folder>(Folder.class, this, TodolistdiagPackage.TASK__BELONGS_TO, TodolistdiagPackage.FOLDER__CONTAINS);
		}
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.TASK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void statusNotStarted() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void statusInProgress() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void statusDone() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TodolistdiagPackage.TASK__BELONGS_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBelongsTo()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TodolistdiagPackage.TASK__BELONGS_TO:
				return ((InternalEList<?>)getBelongsTo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TodolistdiagPackage.TASK__NAME:
				return getName();
			case TodolistdiagPackage.TASK__STATUS:
				return getStatus();
			case TodolistdiagPackage.TASK__IMPORTANCE_LEVEL:
				return getImportanceLevel();
			case TodolistdiagPackage.TASK__BELONGS_TO:
				return getBelongsTo();
			case TodolistdiagPackage.TASK__DESCRIPTION:
				return getDescription();
			case TodolistdiagPackage.TASK__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TodolistdiagPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case TodolistdiagPackage.TASK__STATUS:
				setStatus((Status)newValue);
				return;
			case TodolistdiagPackage.TASK__IMPORTANCE_LEVEL:
				setImportanceLevel((Importance)newValue);
				return;
			case TodolistdiagPackage.TASK__BELONGS_TO:
				getBelongsTo().clear();
				getBelongsTo().addAll((Collection<? extends Folder>)newValue);
				return;
			case TodolistdiagPackage.TASK__DESCRIPTION:
				setDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TodolistdiagPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TodolistdiagPackage.TASK__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case TodolistdiagPackage.TASK__IMPORTANCE_LEVEL:
				setImportanceLevel(IMPORTANCE_LEVEL_EDEFAULT);
				return;
			case TodolistdiagPackage.TASK__BELONGS_TO:
				getBelongsTo().clear();
				return;
			case TodolistdiagPackage.TASK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TodolistdiagPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TodolistdiagPackage.TASK__STATUS:
				return status != STATUS_EDEFAULT;
			case TodolistdiagPackage.TASK__IMPORTANCE_LEVEL:
				return importanceLevel != IMPORTANCE_LEVEL_EDEFAULT;
			case TodolistdiagPackage.TASK__BELONGS_TO:
				return belongsTo != null && !belongsTo.isEmpty();
			case TodolistdiagPackage.TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TodolistdiagPackage.TASK__ID:
				return id != ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", status: ");
		result.append(status);
		result.append(", importanceLevel: ");
		result.append(importanceLevel);
		result.append(", description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
