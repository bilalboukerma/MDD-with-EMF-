/**
 */
package tPIDM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tPIDM.Universite#getCode <em>Code</em>}</li>
 *   <li>{@link tPIDM.Universite#getNom <em>Nom</em>}</li>
 *   <li>{@link tPIDM.Universite#getDepartement <em>Departement</em>}</li>
 *   <li>{@link tPIDM.Universite#getEtudiant <em>Etudiant</em>}</li>
 * </ul>
 *
 * @see tPIDM.TPIDMPackage#getUniversite()
 * @model
 * @generated
 */
public interface Universite extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see tPIDM.TPIDMPackage#getUniversite_Code()
	 * @model required="true"
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link tPIDM.Universite#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see tPIDM.TPIDMPackage#getUniversite_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link tPIDM.Universite#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Departement</b></em>' containment reference list.
	 * The list contents are of type {@link tPIDM.Departement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departement</em>' containment reference list.
	 * @see tPIDM.TPIDMPackage#getUniversite_Departement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Departement> getDepartement();

	/**
	 * Returns the value of the '<em><b>Etudiant</b></em>' containment reference list.
	 * The list contents are of type {@link tPIDM.Etudiant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etudiant</em>' containment reference list.
	 * @see tPIDM.TPIDMPackage#getUniversite_Etudiant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Etudiant> getEtudiant();

} // Universite
