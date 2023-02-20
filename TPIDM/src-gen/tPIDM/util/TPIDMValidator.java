/**
 */
package tPIDM.util;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import tPIDM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tPIDM.TPIDMPackage
 * @generated
 */
public class TPIDMValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TPIDMValidator INSTANCE = new TPIDMValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tPIDM";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'V1' of 'Departement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPARTEMENT__V1 = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'V' of 'Departement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPARTEMENT__V = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'V3' of 'Departement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPARTEMENT__V3 = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'V4' of 'Matiere'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATIERE__V4 = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPIDMValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return TPIDMPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case TPIDMPackage.UNIVERSITE:
			return validateUniversite((Universite) value, diagnostics, context);
		case TPIDMPackage.ENSEIGNANT:
			return validateEnseignant((Enseignant) value, diagnostics, context);
		case TPIDMPackage.DEPARTEMENT:
			return validateDepartement((Departement) value, diagnostics, context);
		case TPIDMPackage.NOTE:
			return validateNote((Note) value, diagnostics, context);
		case TPIDMPackage.ETUDIANT:
			return validateEtudiant((Etudiant) value, diagnostics, context);
		case TPIDMPackage.MATIERE:
			return validateMatiere((Matiere) value, diagnostics, context);
		case TPIDMPackage.TITRE:
			return validateTitre((Titre) value, diagnostics, context);
		case TPIDMPackage.DATE:
			return validateDate((Date) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversite(Universite universite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(universite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnseignant(Enseignant enseignant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enseignant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement(Departement departement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(departement, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDepartement_v3(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDepartement_v1(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDepartement_v(departement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the v3 constraint of '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement_v3(Departement departement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return departement.v3(diagnostics, context);
	}

	/**
	 * Validates the v1 constraint of '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement_v1(Departement departement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return departement.v1(diagnostics, context);
	}

	/**
	 * Validates the v constraint of '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement_v(Departement departement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return departement.v(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNote(Note note, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(note, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEtudiant(Etudiant etudiant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etudiant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatiere(Matiere matiere, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(matiere, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(matiere, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(matiere, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(matiere, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(matiere, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(matiere, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(matiere, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(matiere, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(matiere, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMatiere_v4(matiere, diagnostics, context);
		return result;
	}

	/**
	 * Validates the v4 constraint of '<em>Matiere</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatiere_v4(Matiere matiere, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return matiere.v4(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitre(Titre titre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(Date date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TPIDMValidator
