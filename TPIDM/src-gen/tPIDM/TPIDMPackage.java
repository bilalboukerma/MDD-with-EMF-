/**
 */
package tPIDM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tPIDM.TPIDMFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface TPIDMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tPIDM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tPIDM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tPIDM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TPIDMPackage eINSTANCE = tPIDM.impl.TPIDMPackageImpl.init();

	/**
	 * The meta object id for the '{@link tPIDM.impl.UniversiteImpl <em>Universite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tPIDM.impl.UniversiteImpl
	 * @see tPIDM.impl.TPIDMPackageImpl#getUniversite()
	 * @generated
	 */
	int UNIVERSITE = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Departement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITE__DEPARTEMENT = 2;

	/**
	 * The feature id for the '<em><b>Etudiant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITE__ETUDIANT = 3;

	/**
	 * The number of structural features of the '<em>Universite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Universite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tPIDM.impl.EnseignantImpl <em>Enseignant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tPIDM.impl.EnseignantImpl
	 * @see tPIDM.impl.TPIDMPackageImpl#getEnseignant()
	 * @generated
	 */
	int ENSEIGNANT = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__AGE = 1;

	/**
	 * The feature id for the '<em><b>Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__DEBUT = 2;

	/**
	 * The feature id for the '<em><b>Salaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__SALAIRE = 3;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__TITRE = 4;

	/**
	 * The feature id for the '<em><b>Enseigen</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__ENSEIGEN = 5;

	/**
	 * The number of structural features of the '<em>Enseignant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Enseigner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT___ENSEIGNER__MATIERE = 0;

	/**
	 * The operation id for the '<em>Augmenter Sal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT___AUGMENTER_SAL__INT = 1;

	/**
	 * The number of operations of the '<em>Enseignant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link tPIDM.impl.DepartementImpl <em>Departement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tPIDM.impl.DepartementImpl
	 * @see tPIDM.impl.TPIDMPackageImpl#getDepartement()
	 * @generated
	 */
	int DEPARTEMENT = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Enseignant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__ENSEIGNANT = 1;

	/**
	 * The feature id for the '<em><b>Chef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__CHEF = 2;

	/**
	 * The number of structural features of the '<em>Departement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Ajouter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___AJOUTER__ENSEIGNANT = 0;

	/**
	 * The operation id for the '<em>V1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___V1__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>V</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___V__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>V3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___V3__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>Departement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link tPIDM.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tPIDM.impl.NoteImpl
	 * @see tPIDM.impl.TPIDMPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__VALEUR = 1;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tPIDM.impl.EtudiantImpl <em>Etudiant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tPIDM.impl.EtudiantImpl
	 * @see tPIDM.impl.TPIDMPackageImpl#getEtudiant()
	 * @generated
	 */
	int ETUDIANT = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Naissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__NAISSANCE = 1;

	/**
	 * The feature id for the '<em><b>Matiere</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__MATIERE = 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__NOTE = 3;

	/**
	 * The number of structural features of the '<em>Etudiant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Est Admis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT___EST_ADMIS = 0;

	/**
	 * The operation id for the '<em>Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT___AGE = 1;

	/**
	 * The number of operations of the '<em>Etudiant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link tPIDM.impl.MatiereImpl <em>Matiere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tPIDM.impl.MatiereImpl
	 * @see tPIDM.impl.TPIDMPackageImpl#getMatiere()
	 * @generated
	 */
	int MATIERE = 5;

	/**
	 * The feature id for the '<em><b>Heures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE__HEURES = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Etudiant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE__ETUDIANT = 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE__NOTE = 3;

	/**
	 * The feature id for the '<em><b>Matrie</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE__MATRIE = 4;

	/**
	 * The number of structural features of the '<em>Matiere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>V4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE___V4__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Matiere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tPIDM.Titre <em>Titre</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tPIDM.Titre
	 * @see tPIDM.impl.TPIDMPackageImpl#getTitre()
	 * @generated
	 */
	int TITRE = 6;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see tPIDM.impl.TPIDMPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 7;

	/**
	 * Returns the meta object for class '{@link tPIDM.Universite <em>Universite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universite</em>'.
	 * @see tPIDM.Universite
	 * @generated
	 */
	EClass getUniversite();

	/**
	 * Returns the meta object for the attribute '{@link tPIDM.Universite#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tPIDM.Universite#getCode()
	 * @see #getUniversite()
	 * @generated
	 */
	EAttribute getUniversite_Code();

	/**
	 * Returns the meta object for the attribute '{@link tPIDM.Universite#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see tPIDM.Universite#getNom()
	 * @see #getUniversite()
	 * @generated
	 */
	EAttribute getUniversite_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link tPIDM.Universite#getDepartement <em>Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Departement</em>'.
	 * @see tPIDM.Universite#getDepartement()
	 * @see #getUniversite()
	 * @generated
	 */
	EReference getUniversite_Departement();

	/**
	 * Returns the meta object for the containment reference list '{@link tPIDM.Universite#getEtudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Etudiant</em>'.
	 * @see tPIDM.Universite#getEtudiant()
	 * @see #getUniversite()
	 * @generated
	 */
	EReference getUniversite_Etudiant();

	/**
	 * Returns the meta object for class '{@link tPIDM.Enseignant <em>Enseignant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enseignant</em>'.
	 * @see tPIDM.Enseignant
	 * @generated
	 */
	EClass getEnseignant();

	/**
	 * Returns the meta object for the attribute '{@link tPIDM.Enseignant#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see tPIDM.Enseignant#getNom()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Nom();

	/**
	 * Returns the meta object for the attribute '{@link tPIDM.Enseignant#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see tPIDM.Enseignant#getAge()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Age();

	/**
	 * Returns the meta object for the attribute '{@link tPIDM.Enseignant#getDebut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debut</em>'.
	 * @see tPIDM.Enseignant#getDebut()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Debut();

	/**
	 * Returns the meta object for the attribute '{@link tPIDM.Enseignant#getSalaire <em>Salaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salaire</em>'.
	 * @see tPIDM.Enseignant#getSalaire()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Salaire();

	/**
	 * Returns the meta object for the attribute '{@link tPIDM.Enseignant#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see tPIDM.Enseignant#getTitre()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Titre();

	/**
	 * Returns the meta object for the reference list '{@link tPIDM.Enseignant#getEnseigen <em>Enseigen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enseigen</em>'.
	 * @see tPIDM.Enseignant#getEnseigen()
	 * @see #getEnseignant()
	 * @generated
	 */
	EReference getEnseignant_Enseigen();

	/**
	 * Returns the meta object for the '{@link tPIDM.Enseignant#enseigner(tPIDM.Matiere) <em>Enseigner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enseigner</em>' operation.
	 * @see tPIDM.Enseignant#enseigner(tPIDM.Matiere)
	 * @generated
	 */
	EOperation getEnseignant__Enseigner__Matiere();

	/**
	 * Returns the meta object for the '{@link tPIDM.Enseignant#augmenterSal(int) <em>Augmenter Sal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Augmenter Sal</em>' operation.
	 * @see tPIDM.Enseignant#augmenterSal(int)
	 * @generated
	 */
	EOperation getEnseignant__AugmenterSal__int();

	/**
	 * Returns the meta object for class '{@link tPIDM.Departement <em>Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Departement</em>'.
	 * @see tPIDM.Departement
	 * @generated
	 */
	EClass getDepartement();

	/**
	 * Returns the meta object for the attribute '{@link tPIDM.Departement#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see tPIDM.Departement#getNom()
	 * @see #getDepartement()
	 * @generated
	 */
	EAttribute getDepartement_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link tPIDM.Departement#getEnseignant <em>Enseignant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enseignant</em>'.
	 * @see tPIDM.Departement#getEnseignant()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_Enseignant();

	/**
	 * Returns the meta object for the containment reference '{@link tPIDM.Departement#getChef <em>Chef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chef</em>'.
	 * @see tPIDM.Departement#getChef()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_Chef();

	/**
	 * Returns the meta object for the '{@link tPIDM.Departement#ajouter(tPIDM.Enseignant) <em>Ajouter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ajouter</em>' operation.
	 * @see tPIDM.Departement#ajouter(tPIDM.Enseignant)
	 * @generated
	 */
	EOperation getDepartement__Ajouter__Enseignant();

	/**
	 * Returns the meta object for the '{@link tPIDM.Departement#v1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>V1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>V1</em>' operation.
	 * @see tPIDM.Departement#v1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDepartement__V1__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link tPIDM.Departement#v(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>V</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>V</em>' operation.
	 * @see tPIDM.Departement#v(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDepartement__V__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link tPIDM.Departement#v3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>V3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>V3</em>' operation.
	 * @see tPIDM.Departement#v3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDepartement__V3__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link tPIDM.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see tPIDM.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link tPIDM.Note#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see tPIDM.Note#getDate()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Date();

	/**
	 * Returns the meta object for the attribute '{@link tPIDM.Note#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see tPIDM.Note#getValeur()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Valeur();

	/**
	 * Returns the meta object for class '{@link tPIDM.Etudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etudiant</em>'.
	 * @see tPIDM.Etudiant
	 * @generated
	 */
	EClass getEtudiant();

	/**
	 * Returns the meta object for the attribute '{@link tPIDM.Etudiant#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see tPIDM.Etudiant#getNom()
	 * @see #getEtudiant()
	 * @generated
	 */
	EAttribute getEtudiant_Nom();

	/**
	 * Returns the meta object for the attribute '{@link tPIDM.Etudiant#getNaissance <em>Naissance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Naissance</em>'.
	 * @see tPIDM.Etudiant#getNaissance()
	 * @see #getEtudiant()
	 * @generated
	 */
	EAttribute getEtudiant_Naissance();

	/**
	 * Returns the meta object for the reference list '{@link tPIDM.Etudiant#getMatiere <em>Matiere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Matiere</em>'.
	 * @see tPIDM.Etudiant#getMatiere()
	 * @see #getEtudiant()
	 * @generated
	 */
	EReference getEtudiant_Matiere();

	/**
	 * Returns the meta object for the reference list '{@link tPIDM.Etudiant#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Note</em>'.
	 * @see tPIDM.Etudiant#getNote()
	 * @see #getEtudiant()
	 * @generated
	 */
	EReference getEtudiant_Note();

	/**
	 * Returns the meta object for the '{@link tPIDM.Etudiant#estAdmis() <em>Est Admis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Admis</em>' operation.
	 * @see tPIDM.Etudiant#estAdmis()
	 * @generated
	 */
	EOperation getEtudiant__EstAdmis();

	/**
	 * Returns the meta object for the '{@link tPIDM.Etudiant#age() <em>Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Age</em>' operation.
	 * @see tPIDM.Etudiant#age()
	 * @generated
	 */
	EOperation getEtudiant__Age();

	/**
	 * Returns the meta object for class '{@link tPIDM.Matiere <em>Matiere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matiere</em>'.
	 * @see tPIDM.Matiere
	 * @generated
	 */
	EClass getMatiere();

	/**
	 * Returns the meta object for the attribute '{@link tPIDM.Matiere#getHeures <em>Heures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heures</em>'.
	 * @see tPIDM.Matiere#getHeures()
	 * @see #getMatiere()
	 * @generated
	 */
	EAttribute getMatiere_Heures();

	/**
	 * Returns the meta object for the attribute '{@link tPIDM.Matiere#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see tPIDM.Matiere#getNom()
	 * @see #getMatiere()
	 * @generated
	 */
	EAttribute getMatiere_Nom();

	/**
	 * Returns the meta object for the reference list '{@link tPIDM.Matiere#getEtudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Etudiant</em>'.
	 * @see tPIDM.Matiere#getEtudiant()
	 * @see #getMatiere()
	 * @generated
	 */
	EReference getMatiere_Etudiant();

	/**
	 * Returns the meta object for the reference list '{@link tPIDM.Matiere#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Note</em>'.
	 * @see tPIDM.Matiere#getNote()
	 * @see #getMatiere()
	 * @generated
	 */
	EReference getMatiere_Note();

	/**
	 * Returns the meta object for the containment reference list '{@link tPIDM.Matiere#getMatrie <em>Matrie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matrie</em>'.
	 * @see tPIDM.Matiere#getMatrie()
	 * @see #getMatiere()
	 * @generated
	 */
	EReference getMatiere_Matrie();

	/**
	 * Returns the meta object for the '{@link tPIDM.Matiere#v4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>V4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>V4</em>' operation.
	 * @see tPIDM.Matiere#v4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMatiere__V4__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link tPIDM.Titre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Titre</em>'.
	 * @see tPIDM.Titre
	 * @generated
	 */
	EEnum getTitre();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TPIDMFactory getTPIDMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tPIDM.impl.UniversiteImpl <em>Universite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tPIDM.impl.UniversiteImpl
		 * @see tPIDM.impl.TPIDMPackageImpl#getUniversite()
		 * @generated
		 */
		EClass UNIVERSITE = eINSTANCE.getUniversite();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITE__CODE = eINSTANCE.getUniversite_Code();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITE__NOM = eINSTANCE.getUniversite_Nom();

		/**
		 * The meta object literal for the '<em><b>Departement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITE__DEPARTEMENT = eINSTANCE.getUniversite_Departement();

		/**
		 * The meta object literal for the '<em><b>Etudiant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITE__ETUDIANT = eINSTANCE.getUniversite_Etudiant();

		/**
		 * The meta object literal for the '{@link tPIDM.impl.EnseignantImpl <em>Enseignant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tPIDM.impl.EnseignantImpl
		 * @see tPIDM.impl.TPIDMPackageImpl#getEnseignant()
		 * @generated
		 */
		EClass ENSEIGNANT = eINSTANCE.getEnseignant();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__NOM = eINSTANCE.getEnseignant_Nom();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__AGE = eINSTANCE.getEnseignant_Age();

		/**
		 * The meta object literal for the '<em><b>Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__DEBUT = eINSTANCE.getEnseignant_Debut();

		/**
		 * The meta object literal for the '<em><b>Salaire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__SALAIRE = eINSTANCE.getEnseignant_Salaire();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__TITRE = eINSTANCE.getEnseignant_Titre();

		/**
		 * The meta object literal for the '<em><b>Enseigen</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSEIGNANT__ENSEIGEN = eINSTANCE.getEnseignant_Enseigen();

		/**
		 * The meta object literal for the '<em><b>Enseigner</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENSEIGNANT___ENSEIGNER__MATIERE = eINSTANCE.getEnseignant__Enseigner__Matiere();

		/**
		 * The meta object literal for the '<em><b>Augmenter Sal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENSEIGNANT___AUGMENTER_SAL__INT = eINSTANCE.getEnseignant__AugmenterSal__int();

		/**
		 * The meta object literal for the '{@link tPIDM.impl.DepartementImpl <em>Departement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tPIDM.impl.DepartementImpl
		 * @see tPIDM.impl.TPIDMPackageImpl#getDepartement()
		 * @generated
		 */
		EClass DEPARTEMENT = eINSTANCE.getDepartement();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTEMENT__NOM = eINSTANCE.getDepartement_Nom();

		/**
		 * The meta object literal for the '<em><b>Enseignant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__ENSEIGNANT = eINSTANCE.getDepartement_Enseignant();

		/**
		 * The meta object literal for the '<em><b>Chef</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__CHEF = eINSTANCE.getDepartement_Chef();

		/**
		 * The meta object literal for the '<em><b>Ajouter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___AJOUTER__ENSEIGNANT = eINSTANCE.getDepartement__Ajouter__Enseignant();

		/**
		 * The meta object literal for the '<em><b>V1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___V1__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDepartement__V1__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>V</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___V__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDepartement__V__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>V3</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___V3__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDepartement__V3__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link tPIDM.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tPIDM.impl.NoteImpl
		 * @see tPIDM.impl.TPIDMPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DATE = eINSTANCE.getNote_Date();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__VALEUR = eINSTANCE.getNote_Valeur();

		/**
		 * The meta object literal for the '{@link tPIDM.impl.EtudiantImpl <em>Etudiant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tPIDM.impl.EtudiantImpl
		 * @see tPIDM.impl.TPIDMPackageImpl#getEtudiant()
		 * @generated
		 */
		EClass ETUDIANT = eINSTANCE.getEtudiant();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETUDIANT__NOM = eINSTANCE.getEtudiant_Nom();

		/**
		 * The meta object literal for the '<em><b>Naissance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETUDIANT__NAISSANCE = eINSTANCE.getEtudiant_Naissance();

		/**
		 * The meta object literal for the '<em><b>Matiere</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETUDIANT__MATIERE = eINSTANCE.getEtudiant_Matiere();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETUDIANT__NOTE = eINSTANCE.getEtudiant_Note();

		/**
		 * The meta object literal for the '<em><b>Est Admis</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ETUDIANT___EST_ADMIS = eINSTANCE.getEtudiant__EstAdmis();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ETUDIANT___AGE = eINSTANCE.getEtudiant__Age();

		/**
		 * The meta object literal for the '{@link tPIDM.impl.MatiereImpl <em>Matiere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tPIDM.impl.MatiereImpl
		 * @see tPIDM.impl.TPIDMPackageImpl#getMatiere()
		 * @generated
		 */
		EClass MATIERE = eINSTANCE.getMatiere();

		/**
		 * The meta object literal for the '<em><b>Heures</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATIERE__HEURES = eINSTANCE.getMatiere_Heures();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATIERE__NOM = eINSTANCE.getMatiere_Nom();

		/**
		 * The meta object literal for the '<em><b>Etudiant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATIERE__ETUDIANT = eINSTANCE.getMatiere_Etudiant();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATIERE__NOTE = eINSTANCE.getMatiere_Note();

		/**
		 * The meta object literal for the '<em><b>Matrie</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATIERE__MATRIE = eINSTANCE.getMatiere_Matrie();

		/**
		 * The meta object literal for the '<em><b>V4</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATIERE___V4__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMatiere__V4__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link tPIDM.Titre <em>Titre</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tPIDM.Titre
		 * @see tPIDM.impl.TPIDMPackageImpl#getTitre()
		 * @generated
		 */
		EEnum TITRE = eINSTANCE.getTitre();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see tPIDM.impl.TPIDMPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} //TPIDMPackage
