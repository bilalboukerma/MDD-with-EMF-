/**
 */
package tPIDM.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

import tPIDM.Departement;
import tPIDM.Enseignant;
import tPIDM.TPIDMPackage;
import tPIDM.TPIDMTables;
import tPIDM.Titre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Departement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tPIDM.impl.DepartementImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link tPIDM.impl.DepartementImpl#getEnseignant <em>Enseignant</em>}</li>
 *   <li>{@link tPIDM.impl.DepartementImpl#getChef <em>Chef</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartementImpl extends MinimalEObjectImpl.Container implements Departement {
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
	 * The cached value of the '{@link #getEnseignant() <em>Enseignant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnseignant()
	 * @generated
	 * @ordered
	 */
	protected EList<Enseignant> enseignant;

	/**
	 * The cached value of the '{@link #getChef() <em>Chef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChef()
	 * @generated
	 * @ordered
	 */
	protected Enseignant chef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TPIDMPackage.Literals.DEPARTEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TPIDMPackage.DEPARTEMENT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enseignant> getEnseignant() {
		if (enseignant == null) {
			enseignant = new EObjectContainmentEList<Enseignant>(Enseignant.class, this,
					TPIDMPackage.DEPARTEMENT__ENSEIGNANT);
		}
		return enseignant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enseignant getChef() {
		return chef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChef(Enseignant newChef, NotificationChain msgs) {
		Enseignant oldChef = chef;
		chef = newChef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TPIDMPackage.DEPARTEMENT__CHEF, oldChef, newChef);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChef(Enseignant newChef) {
		if (newChef != chef) {
			NotificationChain msgs = null;
			if (chef != null)
				msgs = ((InternalEObject) chef).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TPIDMPackage.DEPARTEMENT__CHEF, null, msgs);
			if (newChef != null)
				msgs = ((InternalEObject) newChef).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TPIDMPackage.DEPARTEMENT__CHEF, null, msgs);
			msgs = basicSetChef(newChef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPIDMPackage.DEPARTEMENT__CHEF, newChef, newChef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ajouter(final Enseignant e) {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/tPIDM!Departement!ajouter(http://www.example.org/tPIDM!Enseignant)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean v1(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Departement::v1";
		try {
			/**
			 *
			 * inv v1:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.enseignant->forAll(e1, e2 | e1 <> e2 implies e1.Nom <> e2.Nom)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					TPIDMPackage.Literals.DEPARTEMENT___V1__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, TPIDMTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Enseignant> enseignant = this.getEnseignant();
					final /*@NonInvalid*/ OrderedSetValue BOXED_enseignant = idResolver
							.createOrderedSetOfAll(TPIDMTables.ORD_CLSSid_Enseignant, enseignant);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null,
							BOXED_enseignant);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension) TYPE_result_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor,
							TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 * e1 <> e2 implies e1.Nom <> e2.Nom
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_enseignant = (OrderedSetValue) sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object e1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object e2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Enseignant CAST_null = (Enseignant) e1;
								final /*@NonInvalid*/ Enseignant CAST_null_0 = (Enseignant) e2;
								final /*@NonInvalid*/ boolean ne = (CAST_null != null) ? !CAST_null.equals(CAST_null_0)
										: (CAST_null_0 != null);
								final /*@Thrown*/ Boolean implies;
								if (!ne) {
									implies = ValueUtil.TRUE_VALUE;
								} else {
									/*@Caught*/ Object CAUGHT_ne_0;
									try {
										if (CAST_null == null) {
											throw new InvalidValueException(
													"Null source for \'\'http://www.example.org/tPIDM\'::Enseignant::Nom\'");
										}
										final /*@Thrown*/ String Nom = CAST_null.getNom();
										if (CAST_null_0 == null) {
											throw new InvalidValueException(
													"Null source for \'\'http://www.example.org/tPIDM\'::Enseignant::Nom\'");
										}
										final /*@Thrown*/ String Nom_0 = CAST_null_0.getNom();
										final /*@Thrown*/ boolean ne_0 = (Nom != null) ? !Nom.equals(Nom_0)
												: (Nom_0 != null);
										CAUGHT_ne_0 = ne_0;
									} catch (Exception e) {
										CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_ne_0 == ValueUtil.TRUE_VALUE) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_ne_0 instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_ne_0;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							} catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_result_0 = new ExecutorMultipleIterationManager(executor,
							2, false, TypeId.BOOLEAN, BODY_result_0, BOXED_enseignant, ACC_result_0);
					final /*@Thrown*/ Boolean result = (Boolean) IMPL_result_0.evaluateIteration(MGR_result_0);
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, TPIDMTables.INT_0)
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
	public boolean v(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Departement::v";
		try {
			/**
			 *
			 * inv v:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.chef->size() = 1 and self.chef.Age > 40
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					TPIDMPackage.Literals.DEPARTEMENT___V__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, TPIDMTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ Enseignant chef_0 = this.getChef();
				final /*@NonInvalid*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
						TPIDMTables.SET_CLSSid_Enseignant, chef_0);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(oclAsSet);
				final /*@NonInvalid*/ boolean eq = size.equals(TPIDMTables.INT_1);
				final /*@NonInvalid*/ Boolean result;
				if (!eq) {
					result = ValueUtil.FALSE_VALUE;
				} else {
					final /*@NonInvalid*/ int Age = chef_0.getAge();
					final /*@NonInvalid*/ IntegerValue BOXED_Age = ValueUtil.integerValueOf(Age);
					final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
							.evaluate(executor, BOXED_Age, TPIDMTables.INT_40).booleanValue();
					if (!gt) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						result = ValueUtil.TRUE_VALUE;
					}
				}
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
	public boolean v3(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Departement::v3";
		try {
			/**
			 *
			 * inv v3:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.enseignant->exists(e | e.titre = Titre::pr)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					TPIDMPackage.Literals.DEPARTEMENT___V3__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, TPIDMTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<Enseignant> enseignant = this.getEnseignant();
				final /*@NonInvalid*/ OrderedSetValue BOXED_enseignant = idResolver
						.createOrderedSetOfAll(TPIDMTables.ORD_CLSSid_Enseignant, enseignant);
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_e_0 = BOXED_enseignant.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_e_0.hasNext()) {
						if (accumulator == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Enseignant e_0 = (Enseignant) ITERATOR_e_0.next();
					/**
					 * e.titre = Titre::pr
					 */
					final /*@NonInvalid*/ Titre titre = e_0.getTitre();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_titre = titre == null ? null
							: TPIDMTables.ENUMid_Titre.getEnumerationLiteralId(ClassUtil.nonNullState(titre.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_titre == TPIDMTables.ELITid_pr;
					//
					if (eq) { // Normal successful body evaluation result
						result = ValueUtil.TRUE_VALUE;
						break; // Stop immediately
					} else if (!eq) { // Normal unsuccessful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
					}
				}
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TPIDMPackage.DEPARTEMENT__ENSEIGNANT:
			return ((InternalEList<?>) getEnseignant()).basicRemove(otherEnd, msgs);
		case TPIDMPackage.DEPARTEMENT__CHEF:
			return basicSetChef(null, msgs);
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
		case TPIDMPackage.DEPARTEMENT__NOM:
			return getNom();
		case TPIDMPackage.DEPARTEMENT__ENSEIGNANT:
			return getEnseignant();
		case TPIDMPackage.DEPARTEMENT__CHEF:
			return getChef();
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
		case TPIDMPackage.DEPARTEMENT__NOM:
			setNom((String) newValue);
			return;
		case TPIDMPackage.DEPARTEMENT__ENSEIGNANT:
			getEnseignant().clear();
			getEnseignant().addAll((Collection<? extends Enseignant>) newValue);
			return;
		case TPIDMPackage.DEPARTEMENT__CHEF:
			setChef((Enseignant) newValue);
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
		case TPIDMPackage.DEPARTEMENT__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case TPIDMPackage.DEPARTEMENT__ENSEIGNANT:
			getEnseignant().clear();
			return;
		case TPIDMPackage.DEPARTEMENT__CHEF:
			setChef((Enseignant) null);
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
		case TPIDMPackage.DEPARTEMENT__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case TPIDMPackage.DEPARTEMENT__ENSEIGNANT:
			return enseignant != null && !enseignant.isEmpty();
		case TPIDMPackage.DEPARTEMENT__CHEF:
			return chef != null;
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
		case TPIDMPackage.DEPARTEMENT___AJOUTER__ENSEIGNANT:
			ajouter((Enseignant) arguments.get(0));
			return null;
		case TPIDMPackage.DEPARTEMENT___V1__DIAGNOSTICCHAIN_MAP:
			return v1((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case TPIDMPackage.DEPARTEMENT___V__DIAGNOSTICCHAIN_MAP:
			return v((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case TPIDMPackage.DEPARTEMENT___V3__DIAGNOSTICCHAIN_MAP:
			return v3((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (Nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //DepartementImpl
