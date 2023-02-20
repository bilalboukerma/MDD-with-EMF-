/**
 */
package tPIDM.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tPIDM.Enseignant;
import tPIDM.Matiere;
import tPIDM.TPIDMPackage;
import tPIDM.Titre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enseignant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tPIDM.impl.EnseignantImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link tPIDM.impl.EnseignantImpl#getAge <em>Age</em>}</li>
 *   <li>{@link tPIDM.impl.EnseignantImpl#getDebut <em>Debut</em>}</li>
 *   <li>{@link tPIDM.impl.EnseignantImpl#getSalaire <em>Salaire</em>}</li>
 *   <li>{@link tPIDM.impl.EnseignantImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link tPIDM.impl.EnseignantImpl#getEnseigen <em>Enseigen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnseignantImpl extends MinimalEObjectImpl.Container implements Enseignant {
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
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDebut() <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebut()
	 * @generated
	 * @ordered
	 */
	protected static final Date DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebut() <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebut()
	 * @generated
	 * @ordered
	 */
	protected Date debut = DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalaire() <em>Salaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalaire()
	 * @generated
	 * @ordered
	 */
	protected static final int SALAIRE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSalaire() <em>Salaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalaire()
	 * @generated
	 * @ordered
	 */
	protected int salaire = SALAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected static final Titre TITRE_EDEFAULT = Titre.MA;

	/**
	 * The cached value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected Titre titre = TITRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnseigen() <em>Enseigen</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnseigen()
	 * @generated
	 * @ordered
	 */
	protected EList<Matiere> enseigen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnseignantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TPIDMPackage.Literals.ENSEIGNANT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TPIDMPackage.ENSEIGNANT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPIDMPackage.ENSEIGNANT__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDebut() {
		return debut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebut(Date newDebut) {
		Date oldDebut = debut;
		debut = newDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPIDMPackage.ENSEIGNANT__DEBUT, oldDebut, debut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSalaire() {
		return salaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalaire(int newSalaire) {
		int oldSalaire = salaire;
		salaire = newSalaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPIDMPackage.ENSEIGNANT__SALAIRE, oldSalaire,
					salaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Titre getTitre() {
		return titre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitre(Titre newTitre) {
		Titre oldTitre = titre;
		titre = newTitre == null ? TITRE_EDEFAULT : newTitre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPIDMPackage.ENSEIGNANT__TITRE, oldTitre, titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Matiere> getEnseigen() {
		if (enseigen == null) {
			enseigen = new EObjectResolvingEList<Matiere>(Matiere.class, this, TPIDMPackage.ENSEIGNANT__ENSEIGEN);
		}
		return enseigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void enseigner(final Matiere m) {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/tPIDM!Enseignant!enseigner(http://www.example.org/tPIDM!Matiere)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int augmenterSal(final int v) {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/tPIDM!Enseignant!augmenterSal(http://www.eclipse.org/emf/2002/Ecore!EInt)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TPIDMPackage.ENSEIGNANT__NOM:
			return getNom();
		case TPIDMPackage.ENSEIGNANT__AGE:
			return getAge();
		case TPIDMPackage.ENSEIGNANT__DEBUT:
			return getDebut();
		case TPIDMPackage.ENSEIGNANT__SALAIRE:
			return getSalaire();
		case TPIDMPackage.ENSEIGNANT__TITRE:
			return getTitre();
		case TPIDMPackage.ENSEIGNANT__ENSEIGEN:
			return getEnseigen();
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
		case TPIDMPackage.ENSEIGNANT__NOM:
			setNom((String) newValue);
			return;
		case TPIDMPackage.ENSEIGNANT__AGE:
			setAge((Integer) newValue);
			return;
		case TPIDMPackage.ENSEIGNANT__DEBUT:
			setDebut((Date) newValue);
			return;
		case TPIDMPackage.ENSEIGNANT__SALAIRE:
			setSalaire((Integer) newValue);
			return;
		case TPIDMPackage.ENSEIGNANT__TITRE:
			setTitre((Titre) newValue);
			return;
		case TPIDMPackage.ENSEIGNANT__ENSEIGEN:
			getEnseigen().clear();
			getEnseigen().addAll((Collection<? extends Matiere>) newValue);
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
		case TPIDMPackage.ENSEIGNANT__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case TPIDMPackage.ENSEIGNANT__AGE:
			setAge(AGE_EDEFAULT);
			return;
		case TPIDMPackage.ENSEIGNANT__DEBUT:
			setDebut(DEBUT_EDEFAULT);
			return;
		case TPIDMPackage.ENSEIGNANT__SALAIRE:
			setSalaire(SALAIRE_EDEFAULT);
			return;
		case TPIDMPackage.ENSEIGNANT__TITRE:
			setTitre(TITRE_EDEFAULT);
			return;
		case TPIDMPackage.ENSEIGNANT__ENSEIGEN:
			getEnseigen().clear();
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
		case TPIDMPackage.ENSEIGNANT__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case TPIDMPackage.ENSEIGNANT__AGE:
			return age != AGE_EDEFAULT;
		case TPIDMPackage.ENSEIGNANT__DEBUT:
			return DEBUT_EDEFAULT == null ? debut != null : !DEBUT_EDEFAULT.equals(debut);
		case TPIDMPackage.ENSEIGNANT__SALAIRE:
			return salaire != SALAIRE_EDEFAULT;
		case TPIDMPackage.ENSEIGNANT__TITRE:
			return titre != TITRE_EDEFAULT;
		case TPIDMPackage.ENSEIGNANT__ENSEIGEN:
			return enseigen != null && !enseigen.isEmpty();
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
		case TPIDMPackage.ENSEIGNANT___ENSEIGNER__MATIERE:
			enseigner((Matiere) arguments.get(0));
			return null;
		case TPIDMPackage.ENSEIGNANT___AUGMENTER_SAL__INT:
			return augmenterSal((Integer) arguments.get(0));
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
		result.append(", Age: ");
		result.append(age);
		result.append(", Debut: ");
		result.append(debut);
		result.append(", Salaire: ");
		result.append(salaire);
		result.append(", titre: ");
		result.append(titre);
		result.append(')');
		return result.toString();
	}

} //EnseignantImpl
