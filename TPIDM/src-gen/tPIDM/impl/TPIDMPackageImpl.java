/**
 */
package tPIDM.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tPIDM.Departement;
import tPIDM.Enseignant;
import tPIDM.Etudiant;
import tPIDM.Matiere;
import tPIDM.Note;
import tPIDM.TPIDMFactory;
import tPIDM.TPIDMPackage;
import tPIDM.Titre;
import tPIDM.Universite;

import tPIDM.util.TPIDMValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TPIDMPackageImpl extends EPackageImpl implements TPIDMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enseignantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etudiantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matiereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum titreEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

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
	 * @see tPIDM.TPIDMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TPIDMPackageImpl() {
		super(eNS_URI, TPIDMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TPIDMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TPIDMPackage init() {
		if (isInited)
			return (TPIDMPackage) EPackage.Registry.INSTANCE.getEPackage(TPIDMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTPIDMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TPIDMPackageImpl theTPIDMPackage = registeredTPIDMPackage instanceof TPIDMPackageImpl
				? (TPIDMPackageImpl) registeredTPIDMPackage
				: new TPIDMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTPIDMPackage.createPackageContents();

		// Initialize created meta-data
		theTPIDMPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theTPIDMPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return TPIDMValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theTPIDMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TPIDMPackage.eNS_URI, theTPIDMPackage);
		return theTPIDMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniversite() {
		return universiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniversite_Code() {
		return (EAttribute) universiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniversite_Nom() {
		return (EAttribute) universiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversite_Departement() {
		return (EReference) universiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversite_Etudiant() {
		return (EReference) universiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnseignant() {
		return enseignantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnseignant_Nom() {
		return (EAttribute) enseignantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnseignant_Age() {
		return (EAttribute) enseignantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnseignant_Debut() {
		return (EAttribute) enseignantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnseignant_Salaire() {
		return (EAttribute) enseignantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnseignant_Titre() {
		return (EAttribute) enseignantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnseignant_Enseigen() {
		return (EReference) enseignantEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnseignant__Enseigner__Matiere() {
		return enseignantEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnseignant__AugmenterSal__int() {
		return enseignantEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepartement() {
		return departementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartement_Nom() {
		return (EAttribute) departementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartement_Enseignant() {
		return (EReference) departementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartement_Chef() {
		return (EReference) departementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDepartement__Ajouter__Enseignant() {
		return departementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDepartement__V1__DiagnosticChain_Map() {
		return departementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDepartement__V__DiagnosticChain_Map() {
		return departementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDepartement__V3__DiagnosticChain_Map() {
		return departementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Date() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Valeur() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtudiant() {
		return etudiantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEtudiant_Nom() {
		return (EAttribute) etudiantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEtudiant_Naissance() {
		return (EAttribute) etudiantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtudiant_Matiere() {
		return (EReference) etudiantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtudiant_Note() {
		return (EReference) etudiantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEtudiant__EstAdmis() {
		return etudiantEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEtudiant__Age() {
		return etudiantEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatiere() {
		return matiereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatiere_Heures() {
		return (EAttribute) matiereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatiere_Nom() {
		return (EAttribute) matiereEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatiere_Etudiant() {
		return (EReference) matiereEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatiere_Note() {
		return (EReference) matiereEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatiere_Matrie() {
		return (EReference) matiereEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMatiere__V4__DiagnosticChain_Map() {
		return matiereEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTitre() {
		return titreEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPIDMFactory getTPIDMFactory() {
		return (TPIDMFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		universiteEClass = createEClass(UNIVERSITE);
		createEAttribute(universiteEClass, UNIVERSITE__CODE);
		createEAttribute(universiteEClass, UNIVERSITE__NOM);
		createEReference(universiteEClass, UNIVERSITE__DEPARTEMENT);
		createEReference(universiteEClass, UNIVERSITE__ETUDIANT);

		enseignantEClass = createEClass(ENSEIGNANT);
		createEAttribute(enseignantEClass, ENSEIGNANT__NOM);
		createEAttribute(enseignantEClass, ENSEIGNANT__AGE);
		createEAttribute(enseignantEClass, ENSEIGNANT__DEBUT);
		createEAttribute(enseignantEClass, ENSEIGNANT__SALAIRE);
		createEAttribute(enseignantEClass, ENSEIGNANT__TITRE);
		createEReference(enseignantEClass, ENSEIGNANT__ENSEIGEN);
		createEOperation(enseignantEClass, ENSEIGNANT___ENSEIGNER__MATIERE);
		createEOperation(enseignantEClass, ENSEIGNANT___AUGMENTER_SAL__INT);

		departementEClass = createEClass(DEPARTEMENT);
		createEAttribute(departementEClass, DEPARTEMENT__NOM);
		createEReference(departementEClass, DEPARTEMENT__ENSEIGNANT);
		createEReference(departementEClass, DEPARTEMENT__CHEF);
		createEOperation(departementEClass, DEPARTEMENT___AJOUTER__ENSEIGNANT);
		createEOperation(departementEClass, DEPARTEMENT___V1__DIAGNOSTICCHAIN_MAP);
		createEOperation(departementEClass, DEPARTEMENT___V__DIAGNOSTICCHAIN_MAP);
		createEOperation(departementEClass, DEPARTEMENT___V3__DIAGNOSTICCHAIN_MAP);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__DATE);
		createEAttribute(noteEClass, NOTE__VALEUR);

		etudiantEClass = createEClass(ETUDIANT);
		createEAttribute(etudiantEClass, ETUDIANT__NOM);
		createEAttribute(etudiantEClass, ETUDIANT__NAISSANCE);
		createEReference(etudiantEClass, ETUDIANT__MATIERE);
		createEReference(etudiantEClass, ETUDIANT__NOTE);
		createEOperation(etudiantEClass, ETUDIANT___EST_ADMIS);
		createEOperation(etudiantEClass, ETUDIANT___AGE);

		matiereEClass = createEClass(MATIERE);
		createEAttribute(matiereEClass, MATIERE__HEURES);
		createEAttribute(matiereEClass, MATIERE__NOM);
		createEReference(matiereEClass, MATIERE__ETUDIANT);
		createEReference(matiereEClass, MATIERE__NOTE);
		createEReference(matiereEClass, MATIERE__MATRIE);
		createEOperation(matiereEClass, MATIERE___V4__DIAGNOSTICCHAIN_MAP);

		// Create enums
		titreEEnum = createEEnum(TITRE);

		// Create data types
		dateEDataType = createEDataType(DATE);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(universiteEClass, Universite.class, "Universite", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniversite_Code(), ecorePackage.getEInt(), "Code", null, 1, 1, Universite.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniversite_Nom(), ecorePackage.getEString(), "Nom", null, 0, 1, Universite.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversite_Departement(), this.getDepartement(), null, "departement", null, 1, -1,
				Universite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversite_Etudiant(), this.getEtudiant(), null, "etudiant", null, 1, -1, Universite.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enseignantEClass, Enseignant.class, "Enseignant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnseignant_Nom(), ecorePackage.getEString(), "Nom", null, 0, 1, Enseignant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnseignant_Age(), ecorePackage.getEInt(), "Age", null, 1, 1, Enseignant.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnseignant_Debut(), this.getDate(), "Debut", null, 0, 1, Enseignant.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnseignant_Salaire(), ecorePackage.getEInt(), "Salaire", null, 1, 1, Enseignant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnseignant_Titre(), this.getTitre(), "titre", null, 0, 1, Enseignant.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnseignant_Enseigen(), this.getMatiere(), null, "enseigen", null, 0, -1, Enseignant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getEnseignant__Enseigner__Matiere(), null, "enseigner", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getMatiere(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnseignant__AugmenterSal__int(), ecorePackage.getEInt(), "augmenterSal", 1, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(departementEClass, Departement.class, "Departement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDepartement_Nom(), ecorePackage.getEString(), "Nom", null, 0, 1, Departement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartement_Enseignant(), this.getEnseignant(), null, "enseignant", null, 1, -1,
				Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartement_Chef(), this.getEnseignant(), null, "chef", null, 1, 1, Departement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDepartement__Ajouter__Enseignant(), null, "ajouter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnseignant(), "e", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDepartement__V1__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "v1", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDepartement__V__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "v", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDepartement__V3__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "v3", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNote_Date(), this.getDate(), "date", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Valeur(), ecorePackage.getEInt(), "valeur", null, 1, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(etudiantEClass, Etudiant.class, "Etudiant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEtudiant_Nom(), ecorePackage.getEString(), "Nom", null, 0, 1, Etudiant.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEtudiant_Naissance(), this.getDate(), "Naissance", null, 0, 1, Etudiant.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtudiant_Matiere(), this.getMatiere(), this.getMatiere_Etudiant(), "matiere", null, 0, -1,
				Etudiant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtudiant_Note(), this.getNote(), null, "note", null, 0, -1, Etudiant.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getEtudiant__EstAdmis(), ecorePackage.getEBoolean(), "estAdmis", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEtudiant__Age(), ecorePackage.getEInt(), "age", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(matiereEClass, Matiere.class, "Matiere", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatiere_Heures(), ecorePackage.getEInt(), "heures", null, 1, 1, Matiere.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatiere_Nom(), ecorePackage.getEString(), "Nom", null, 0, 1, Matiere.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatiere_Etudiant(), this.getEtudiant(), this.getEtudiant_Matiere(), "etudiant", null, 0, -1,
				Matiere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatiere_Note(), this.getNote(), null, "note", null, 0, -1, Matiere.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMatiere_Matrie(), this.getEnseignant(), null, "matrie", null, 1, -1, Matiere.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMatiere__V4__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "v4", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(titreEEnum, Titre.class, "Titre");
		addEEnumLiteral(titreEEnum, Titre.MA);
		addEEnumLiteral(titreEEnum, Titre.MC);
		addEEnumLiteral(titreEEnum, Titre.PR);

		// Initialize data types
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(departementEClass, source, new String[] { "constraints", "v3" });
		addAnnotation(matiereEClass, source, new String[] { "constraints", "v4" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getDepartement__V1__DiagnosticChain_Map(), source,
				new String[] { "body", "self.enseignant->forAll(e1,e2 : Enseignant|e1<>e2 implies e1.Nom<>e2.Nom)" });
		addAnnotation(getDepartement__V__DiagnosticChain_Map(), source,
				new String[] { "body", "self.chef->size()=1 and self.chef.Age>40" });
		addAnnotation(getDepartement__V3__DiagnosticChain_Map(), source,
				new String[] { "body", "self.enseignant->exists(e: Enseignant|e.titre = Titre::pr)" });
		addAnnotation(getMatiere__V4__DiagnosticChain_Map(), source,
				new String[] { "body", "self.matrie->notEmpty()" });
	}

} //TPIDMPackageImpl
