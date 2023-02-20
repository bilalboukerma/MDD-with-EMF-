/**
 */
package tPIDM;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tPIDM.Note#getDate <em>Date</em>}</li>
 *   <li>{@link tPIDM.Note#getValeur <em>Valeur</em>}</li>
 * </ul>
 *
 * @see tPIDM.TPIDMPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see tPIDM.TPIDMPackage#getNote_Date()
	 * @model dataType="tPIDM.Date"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link tPIDM.Note#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #setValeur(int)
	 * @see tPIDM.TPIDMPackage#getNote_Valeur()
	 * @model required="true"
	 * @generated
	 */
	int getValeur();

	/**
	 * Sets the value of the '{@link tPIDM.Note#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(int value);

} // Note
