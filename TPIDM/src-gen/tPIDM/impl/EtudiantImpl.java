/**
 */
package tPIDM.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tPIDM.Etudiant;
import tPIDM.Matiere;
import tPIDM.Note;
import tPIDM.TPIDMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Etudiant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tPIDM.impl.EtudiantImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link tPIDM.impl.EtudiantImpl#getNaissance <em>Naissance</em>}</li>
 *   <li>{@link tPIDM.impl.EtudiantImpl#getMatiere <em>Matiere</em>}</li>
 *   <li>{@link tPIDM.impl.EtudiantImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EtudiantImpl extends MinimalEObjectImpl.Container implements Etudiant {
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
	 * The default value of the '{@link #getNaissance() <em>Naissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaissance()
	 * @generated
	 * @ordered
	 */
	protected static final Date NAISSANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNaissance() <em>Naissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaissance()
	 * @generated
	 * @ordered
	 */
	protected Date naissance = NAISSANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatiere() <em>Matiere</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatiere()
	 * @generated
	 * @ordered
	 */
	protected EList<Matiere> matiere;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Note> note;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtudiantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TPIDMPackage.Literals.ETUDIANT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TPIDMPackage.ETUDIANT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getNaissance() {
		return naissance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNaissance(Date newNaissance) {
		Date oldNaissance = naissance;
		naissance = newNaissance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPIDMPackage.ETUDIANT__NAISSANCE, oldNaissance,
					naissance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Matiere> getMatiere() {
		if (matiere == null) {
			matiere = new EObjectWithInverseResolvingEList.ManyInverse<Matiere>(Matiere.class, this,
					TPIDMPackage.ETUDIANT__MATIERE, TPIDMPackage.MATIERE__ETUDIANT);
		}
		return matiere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Note> getNote() {
		if (note == null) {
			note = new EObjectResolvingEList<Note>(Note.class, this, TPIDMPackage.ETUDIANT__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean estAdmis() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/tPIDM!Etudiant!estAdmis()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int age() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/tPIDM!Etudiant!age()
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
		case TPIDMPackage.ETUDIANT__MATIERE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMatiere()).basicAdd(otherEnd, msgs);
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
		case TPIDMPackage.ETUDIANT__MATIERE:
			return ((InternalEList<?>) getMatiere()).basicRemove(otherEnd, msgs);
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
		case TPIDMPackage.ETUDIANT__NOM:
			return getNom();
		case TPIDMPackage.ETUDIANT__NAISSANCE:
			return getNaissance();
		case TPIDMPackage.ETUDIANT__MATIERE:
			return getMatiere();
		case TPIDMPackage.ETUDIANT__NOTE:
			return getNote();
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
		case TPIDMPackage.ETUDIANT__NOM:
			setNom((String) newValue);
			return;
		case TPIDMPackage.ETUDIANT__NAISSANCE:
			setNaissance((Date) newValue);
			return;
		case TPIDMPackage.ETUDIANT__MATIERE:
			getMatiere().clear();
			getMatiere().addAll((Collection<? extends Matiere>) newValue);
			return;
		case TPIDMPackage.ETUDIANT__NOTE:
			getNote().clear();
			getNote().addAll((Collection<? extends Note>) newValue);
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
		case TPIDMPackage.ETUDIANT__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case TPIDMPackage.ETUDIANT__NAISSANCE:
			setNaissance(NAISSANCE_EDEFAULT);
			return;
		case TPIDMPackage.ETUDIANT__MATIERE:
			getMatiere().clear();
			return;
		case TPIDMPackage.ETUDIANT__NOTE:
			getNote().clear();
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
		case TPIDMPackage.ETUDIANT__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case TPIDMPackage.ETUDIANT__NAISSANCE:
			return NAISSANCE_EDEFAULT == null ? naissance != null : !NAISSANCE_EDEFAULT.equals(naissance);
		case TPIDMPackage.ETUDIANT__MATIERE:
			return matiere != null && !matiere.isEmpty();
		case TPIDMPackage.ETUDIANT__NOTE:
			return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TPIDMPackage.ETUDIANT___EST_ADMIS:
			return estAdmis();
		case TPIDMPackage.ETUDIANT___AGE:
			return age();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (Nom: ");
		result.append(nom);
		result.append(", Naissance: ");
		result.append(naissance);
		result.append(')');
		return result.toString();
	}

} //EtudiantImpl
