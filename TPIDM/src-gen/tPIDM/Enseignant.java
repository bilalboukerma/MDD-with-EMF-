/**
 */
package tPIDM;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enseignant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tPIDM.Enseignant#getNom <em>Nom</em>}</li>
 *   <li>{@link tPIDM.Enseignant#getAge <em>Age</em>}</li>
 *   <li>{@link tPIDM.Enseignant#getDebut <em>Debut</em>}</li>
 *   <li>{@link tPIDM.Enseignant#getSalaire <em>Salaire</em>}</li>
 *   <li>{@link tPIDM.Enseignant#getTitre <em>Titre</em>}</li>
 *   <li>{@link tPIDM.Enseignant#getEnseigen <em>Enseigen</em>}</li>
 * </ul>
 *
 * @see tPIDM.TPIDMPackage#getEnseignant()
 * @model
 * @generated
 */
public interface Enseignant extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see tPIDM.TPIDMPackage#getEnseignant_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link tPIDM.Enseignant#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see tPIDM.TPIDMPackage#getEnseignant_Age()
	 * @model required="true"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link tPIDM.Enseignant#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut</em>' attribute.
	 * @see #setDebut(Date)
	 * @see tPIDM.TPIDMPackage#getEnseignant_Debut()
	 * @model dataType="tPIDM.Date"
	 * @generated
	 */
	Date getDebut();

	/**
	 * Sets the value of the '{@link tPIDM.Enseignant#getDebut <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut</em>' attribute.
	 * @see #getDebut()
	 * @generated
	 */
	void setDebut(Date value);

	/**
	 * Returns the value of the '<em><b>Salaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salaire</em>' attribute.
	 * @see #setSalaire(int)
	 * @see tPIDM.TPIDMPackage#getEnseignant_Salaire()
	 * @model required="true"
	 * @generated
	 */
	int getSalaire();

	/**
	 * Sets the value of the '{@link tPIDM.Enseignant#getSalaire <em>Salaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salaire</em>' attribute.
	 * @see #getSalaire()
	 * @generated
	 */
	void setSalaire(int value);

	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * The literals are from the enumeration {@link tPIDM.Titre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see tPIDM.Titre
	 * @see #setTitre(Titre)
	 * @see tPIDM.TPIDMPackage#getEnseignant_Titre()
	 * @model
	 * @generated
	 */
	Titre getTitre();

	/**
	 * Sets the value of the '{@link tPIDM.Enseignant#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see tPIDM.Titre
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(Titre value);

	/**
	 * Returns the value of the '<em><b>Enseigen</b></em>' reference list.
	 * The list contents are of type {@link tPIDM.Matiere}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enseigen</em>' reference list.
	 * @see tPIDM.TPIDMPackage#getEnseignant_Enseigen()
	 * @model
	 * @generated
	 */
	EList<Matiere> getEnseigen();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enseigner(Matiere m);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" vRequired="true"
	 * @generated
	 */
	int augmenterSal(int v);

} // Enseignant
