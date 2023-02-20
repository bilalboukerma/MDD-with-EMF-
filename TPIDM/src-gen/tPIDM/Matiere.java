/**
 */
package tPIDM;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matiere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tPIDM.Matiere#getHeures <em>Heures</em>}</li>
 *   <li>{@link tPIDM.Matiere#getNom <em>Nom</em>}</li>
 *   <li>{@link tPIDM.Matiere#getEtudiant <em>Etudiant</em>}</li>
 *   <li>{@link tPIDM.Matiere#getNote <em>Note</em>}</li>
 *   <li>{@link tPIDM.Matiere#getMatrie <em>Matrie</em>}</li>
 * </ul>
 *
 * @see tPIDM.TPIDMPackage#getMatiere()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='v4'"
 * @generated
 */
public interface Matiere extends EObject {
	/**
	 * Returns the value of the '<em><b>Heures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heures</em>' attribute.
	 * @see #setHeures(int)
	 * @see tPIDM.TPIDMPackage#getMatiere_Heures()
	 * @model required="true"
	 * @generated
	 */
	int getHeures();

	/**
	 * Sets the value of the '{@link tPIDM.Matiere#getHeures <em>Heures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heures</em>' attribute.
	 * @see #getHeures()
	 * @generated
	 */
	void setHeures(int value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see tPIDM.TPIDMPackage#getMatiere_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link tPIDM.Matiere#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Etudiant</b></em>' reference list.
	 * The list contents are of type {@link tPIDM.Etudiant}.
	 * It is bidirectional and its opposite is '{@link tPIDM.Etudiant#getMatiere <em>Matiere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etudiant</em>' reference list.
	 * @see tPIDM.TPIDMPackage#getMatiere_Etudiant()
	 * @see tPIDM.Etudiant#getMatiere
	 * @model opposite="matiere"
	 * @generated
	 */
	EList<Etudiant> getEtudiant();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' reference list.
	 * The list contents are of type {@link tPIDM.Note}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' reference list.
	 * @see tPIDM.TPIDMPackage#getMatiere_Note()
	 * @model
	 * @generated
	 */
	EList<Note> getNote();

	/**
	 * Returns the value of the '<em><b>Matrie</b></em>' containment reference list.
	 * The list contents are of type {@link tPIDM.Enseignant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrie</em>' containment reference list.
	 * @see tPIDM.TPIDMPackage#getMatiere_Matrie()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Enseignant> getMatrie();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.matrie-&gt;notEmpty()'"
	 * @generated
	 */
	boolean v4(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Matiere
