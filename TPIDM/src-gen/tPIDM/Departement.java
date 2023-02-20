/**
 */
package tPIDM;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Departement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tPIDM.Departement#getNom <em>Nom</em>}</li>
 *   <li>{@link tPIDM.Departement#getEnseignant <em>Enseignant</em>}</li>
 *   <li>{@link tPIDM.Departement#getChef <em>Chef</em>}</li>
 * </ul>
 *
 * @see tPIDM.TPIDMPackage#getDepartement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='v3'"
 * @generated
 */
public interface Departement extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see tPIDM.TPIDMPackage#getDepartement_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link tPIDM.Departement#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Enseignant</b></em>' containment reference list.
	 * The list contents are of type {@link tPIDM.Enseignant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enseignant</em>' containment reference list.
	 * @see tPIDM.TPIDMPackage#getDepartement_Enseignant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Enseignant> getEnseignant();

	/**
	 * Returns the value of the '<em><b>Chef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chef</em>' containment reference.
	 * @see #setChef(Enseignant)
	 * @see tPIDM.TPIDMPackage#getDepartement_Chef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Enseignant getChef();

	/**
	 * Sets the value of the '{@link tPIDM.Departement#getChef <em>Chef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chef</em>' containment reference.
	 * @see #getChef()
	 * @generated
	 */
	void setChef(Enseignant value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ajouter(Enseignant e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.enseignant-&gt;forAll(e1,e2 : Enseignant|e1&lt;&gt;e2 implies e1.Nom&lt;&gt;e2.Nom)'"
	 * @generated
	 */
	boolean v1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.chef-&gt;size()=1 and self.chef.Age&gt;40'"
	 * @generated
	 */
	boolean v(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.enseignant-&gt;exists(e: Enseignant|e.titre = Titre::pr)'"
	 * @generated
	 */
	boolean v3(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Departement
