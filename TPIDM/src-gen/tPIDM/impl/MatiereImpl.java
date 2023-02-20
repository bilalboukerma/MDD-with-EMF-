/**
 */
package tPIDM.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import tPIDM.Enseignant;
import tPIDM.Etudiant;
import tPIDM.Matiere;
import tPIDM.Note;
import tPIDM.TPIDMPackage;
import tPIDM.TPIDMTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matiere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tPIDM.impl.MatiereImpl#getHeures <em>Heures</em>}</li>
 *   <li>{@link tPIDM.impl.MatiereImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link tPIDM.impl.MatiereImpl#getEtudiant <em>Etudiant</em>}</li>
 *   <li>{@link tPIDM.impl.MatiereImpl#getNote <em>Note</em>}</li>
 *   <li>{@link tPIDM.impl.MatiereImpl#getMatrie <em>Matrie</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatiereImpl extends MinimalEObjectImpl.Container implements Matiere {
	/**
	 * The default value of the '{@link #getHeures() <em>Heures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeures()
	 * @generated
	 * @ordered
	 */
	protected static final int HEURES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeures() <em>Heures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeures()
	 * @generated
	 * @ordered
	 */
	protected int heures = HEURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEtudiant() <em>Etudiant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtudiant()
	 * @generated
	 * @ordered
	 */
	protected EList<Etudiant> etudiant;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Note> note;

	/**
	 * The cached value of the '{@link #getMatrie() <em>Matrie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrie()
	 * @generated
	 * @ordered
	 */
	protected EList<Enseignant> matrie;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatiereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TPIDMPackage.Literals.MATIERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeures() {
		return heures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeures(int newHeures) {
		int oldHeures = heures;
		heures = newHeures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPIDMPackage.MATIERE__HEURES, oldHeures, heures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPIDMPackage.MATIERE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Etudiant> getEtudiant() {
		if (etudiant == null) {
			etudiant = new EObjectWithInverseResolvingEList.ManyInverse<Etudiant>(Etudiant.class, this,
					TPIDMPackage.MATIERE__ETUDIANT, TPIDMPackage.ETUDIANT__MATIERE);
		}
		return etudiant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Note> getNote() {
		if (note == null) {
			note = new EObjectResolvingEList<Note>(Note.class, this, TPIDMPackage.MATIERE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enseignant> getMatrie() {
		if (matrie == null) {
			matrie = new EObjectContainmentEList<Enseignant>(Enseignant.class, this, TPIDMPackage.MATIERE__MATRIE);
		}
		return matrie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean v4(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Matiere::v4";
		try {
			/**
			 *
			 * inv v4:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.matrie->notEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					TPIDMPackage.Literals.MATIERE___V4__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, TPIDMTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<Enseignant> matrie = this.getMatrie();
				final /*@NonInvalid*/ OrderedSetValue BOXED_matrie = idResolver
						.createOrderedSetOfAll(TPIDMTables.ORD_CLSSid_Enseignant, matrie);
				final /*@NonInvalid*/ boolean result = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_matrie)
						.booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, TPIDMTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TPIDMPackage.MATIERE__ETUDIANT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEtudiant()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TPIDMPackage.MATIERE__ETUDIANT:
			return ((InternalEList<?>) getEtudiant()).basicRemove(otherEnd, msgs);
		case TPIDMPackage.MATIERE__MATRIE:
			return ((InternalEList<?>) getMatrie()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TPIDMPackage.MATIERE__HEURES:
			return getHeures();
		case TPIDMPackage.MATIERE__NOM:
			return getNom();
		case TPIDMPackage.MATIERE__ETUDIANT:
			return getEtudiant();
		case TPIDMPackage.MATIERE__NOTE:
			return getNote();
		case TPIDMPackage.MATIERE__MATRIE:
			return getMatrie();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TPIDMPackage.MATIERE__HEURES:
			setHeures((Integer) newValue);
			return;
		case TPIDMPackage.MATIERE__NOM:
			setNom((String) newValue);
			return;
		case TPIDMPackage.MATIERE__ETUDIANT:
			getEtudiant().clear();
			getEtudiant().addAll((Collection<? extends Etudiant>) newValue);
			return;
		case TPIDMPackage.MATIERE__NOTE:
			getNote().clear();
			getNote().addAll((Collection<? extends Note>) newValue);
			return;
		case TPIDMPackage.MATIERE__MATRIE:
			getMatrie().clear();
			getMatrie().addAll((Collection<? extends Enseignant>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TPIDMPackage.MATIERE__HEURES:
			setHeures(HEURES_EDEFAULT);
			return;
		case TPIDMPackage.MATIERE__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case TPIDMPackage.MATIERE__ETUDIANT:
			getEtudiant().clear();
			return;
		case TPIDMPackage.MATIERE__NOTE:
			getNote().clear();
			return;
		case TPIDMPackage.MATIERE__MATRIE:
			getMatrie().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TPIDMPackage.MATIERE__HEURES:
			return heures != HEURES_EDEFAULT;
		case TPIDMPackage.MATIERE__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case TPIDMPackage.MATIERE__ETUDIANT:
			return etudiant != null && !etudiant.isEmpty();
		case TPIDMPackage.MATIERE__NOTE:
			return note != null && !note.isEmpty();
		case TPIDMPackage.MATIERE__MATRIE:
			return matrie != null && !matrie.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TPIDMPackage.MATIERE___V4__DIAGNOSTICCHAIN_MAP:
			return v4((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (heures: ");
		result.append(heures);
		result.append(", Nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //MatiereImpl
