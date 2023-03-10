/**
 */
package tPIDM.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tPIDM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tPIDM.TPIDMPackage
 * @generated
 */
public class TPIDMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TPIDMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPIDMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TPIDMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPIDMSwitch<Adapter> modelSwitch = new TPIDMSwitch<Adapter>() {
		@Override
		public Adapter caseUniversite(Universite object) {
			return createUniversiteAdapter();
		}

		@Override
		public Adapter caseEnseignant(Enseignant object) {
			return createEnseignantAdapter();
		}

		@Override
		public Adapter caseDepartement(Departement object) {
			return createDepartementAdapter();
		}

		@Override
		public Adapter caseNote(Note object) {
			return createNoteAdapter();
		}

		@Override
		public Adapter caseEtudiant(Etudiant object) {
			return createEtudiantAdapter();
		}

		@Override
		public Adapter caseMatiere(Matiere object) {
			return createMatiereAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link tPIDM.Universite <em>Universite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tPIDM.Universite
	 * @generated
	 */
	public Adapter createUniversiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tPIDM.Enseignant <em>Enseignant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tPIDM.Enseignant
	 * @generated
	 */
	public Adapter createEnseignantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tPIDM.Departement <em>Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tPIDM.Departement
	 * @generated
	 */
	public Adapter createDepartementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tPIDM.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tPIDM.Note
	 * @generated
	 */
	public Adapter createNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tPIDM.Etudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tPIDM.Etudiant
	 * @generated
	 */
	public Adapter createEtudiantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tPIDM.Matiere <em>Matiere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tPIDM.Matiere
	 * @generated
	 */
	public Adapter createMatiereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TPIDMAdapterFactory
