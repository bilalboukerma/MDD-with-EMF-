/**
 */
package tPIDM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tPIDM.Departement;
import tPIDM.Etudiant;
import tPIDM.TPIDMPackage;
import tPIDM.Universite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Universite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tPIDM.impl.UniversiteImpl#getCode <em>Code</em>}</li>
 *   <li>{@link tPIDM.impl.UniversiteImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link tPIDM.impl.UniversiteImpl#getDepartement <em>Departement</em>}</li>
 *   <li>{@link tPIDM.impl.UniversiteImpl#getEtudiant <em>Etudiant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversiteImpl extends MinimalEObjectImpl.Container implements Universite {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected int code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDepartement() <em>Departement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartement()
	 * @generated
	 * @ordered
	 */
	protected EList<Departement> departement;

	/**
	 * The cached value of the '{@link #getEtudiant() <em>Etudiant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtudiant()
	 * @generated
	 * @ordered
	 */
	protected EList<Etudiant> etudiant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TPIDMPackage.Literals.UNIVERSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(int newCode) {
		int oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPIDMPackage.UNIVERSITE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPIDMPackage.UNIVERSITE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Departement> getDepartement() {
		if (departement == null) {
			departement = new EObjectContainmentEList<Departement>(Departement.class, this,
					TPIDMPackage.UNIVERSITE__DEPARTEMENT);
		}
		return departement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Etudiant> getEtudiant() {
		if (etudiant == null) {
			etudiant = new EObjectContainmentEList<Etudiant>(Etudiant.class, this, TPIDMPackage.UNIVERSITE__ETUDIANT);
		}
		return etudiant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TPIDMPackage.UNIVERSITE__DEPARTEMENT:
			return ((InternalEList<?>) getDepartement()).basicRemove(otherEnd, msgs);
		case TPIDMPackage.UNIVERSITE__ETUDIANT:
			return ((InternalEList<?>) getEtudiant()).basicRemove(otherEnd, msgs);
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
		case TPIDMPackage.UNIVERSITE__CODE:
			return getCode();
		case TPIDMPackage.UNIVERSITE__NOM:
			return getNom();
		case TPIDMPackage.UNIVERSITE__DEPARTEMENT:
			return getDepartement();
		case TPIDMPackage.UNIVERSITE__ETUDIANT:
			return getEtudiant();
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
		case TPIDMPackage.UNIVERSITE__CODE:
			setCode((Integer) newValue);
			return;
		case TPIDMPackage.UNIVERSITE__NOM:
			setNom((String) newValue);
			return;
		case TPIDMPackage.UNIVERSITE__DEPARTEMENT:
			getDepartement().clear();
			getDepartement().addAll((Collection<? extends Departement>) newValue);
			return;
		case TPIDMPackage.UNIVERSITE__ETUDIANT:
			getEtudiant().clear();
			getEtudiant().addAll((Collection<? extends Etudiant>) newValue);
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
		case TPIDMPackage.UNIVERSITE__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case TPIDMPackage.UNIVERSITE__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case TPIDMPackage.UNIVERSITE__DEPARTEMENT:
			getDepartement().clear();
			return;
		case TPIDMPackage.UNIVERSITE__ETUDIANT:
			getEtudiant().clear();
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
		case TPIDMPackage.UNIVERSITE__CODE:
			return code != CODE_EDEFAULT;
		case TPIDMPackage.UNIVERSITE__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case TPIDMPackage.UNIVERSITE__DEPARTEMENT:
			return departement != null && !departement.isEmpty();
		case TPIDMPackage.UNIVERSITE__ETUDIANT:
			return etudiant != null && !etudiant.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Code: ");
		result.append(code);
		result.append(", Nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //UniversiteImpl
