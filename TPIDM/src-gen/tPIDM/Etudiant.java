/**
 */
package tPIDM;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Etudiant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tPIDM.Etudiant#getNom <em>Nom</em>}</li>
 *   <li>{@link tPIDM.Etudiant#getNaissance <em>Naissance</em>}</li>
 *   <li>{@link tPIDM.Etudiant#getMatiere <em>Matiere</em>}</li>
 *   <li>{@link tPIDM.Etudiant#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see tPIDM.TPIDMPackage#getEtudiant()
 * @model
 * @generated
 */
public interface Etudiant extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see tPIDM.TPIDMPackage#getEtudiant_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link tPIDM.Etudiant#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Naissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Naissance</em>' attribute.
	 * @see #setNaissance(Date)
	 * @see tPIDM.TPIDMPackage#getEtudiant_Naissance()
	 * @model dataType="tPIDM.Date"
	 * @generated
	 */
	Date getNaissance();

	/**
	 * Sets the value of the '{@link tPIDM.Etudiant#getNaissance <em>Naissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Naissance</em>' attribute.
	 * @see #getNaissance()
	 * @generated
	 */
	void setNaissance(Date value);

	/**
	 * Returns the value of the '<em><b>Matiere</b></em>' reference list.
	 * The list contents are of type {@link tPIDM.Matiere}.
	 * It is bidirectional and its opposite is '{@link tPIDM.Matiere#getEtudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matiere</em>' reference list.
	 * @see tPIDM.TPIDMPackage#getEtudiant_Matiere()
	 * @see tPIDM.Matiere#getEtudiant
	 * @model opposite="etudiant"
	 * @generated
	 */
	EList<Matiere> getMatiere();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' reference list.
	 * The list contents are of type {@link tPIDM.Note}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' reference list.
	 * @see tPIDM.TPIDMPackage#getEtudiant_Note()
	 * @model
	 * @generated
	 */
	EList<Note> getNote();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean estAdmis();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	int age();

} // Etudiant
