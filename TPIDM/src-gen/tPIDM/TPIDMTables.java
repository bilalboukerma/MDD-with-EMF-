/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /TPIDM/model/tPIDM.ecore
 * using:
 *   /TPIDM/model/tPIDM.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package tPIDM;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import tPIDM.TPIDMPackage;
// import tPIDM.TPIDMTables;

/**
 * TPIDMTables provides the dispatch tables for the tPIDM for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class TPIDMTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(TPIDMPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_tPIDM = IdManager.getNsURIPackageId("http://www.example.org/tPIDM", null, TPIDMPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Departement = TPIDMTables.PACKid_http_c_s_s_www_example_org_s_tPIDM.getClassId("Departement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Enseignant = TPIDMTables.PACKid_http_c_s_s_www_example_org_s_tPIDM.getClassId("Enseignant", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Etudiant = TPIDMTables.PACKid_http_c_s_s_www_example_org_s_tPIDM.getClassId("Etudiant", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Matiere = TPIDMTables.PACKid_http_c_s_s_www_example_org_s_tPIDM.getClassId("Matiere", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Note = TPIDMTables.PACKid_http_c_s_s_www_example_org_s_tPIDM.getClassId("Note", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Universite = TPIDMTables.PACKid_http_c_s_s_www_example_org_s_tPIDM.getClassId("Universite", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_Date = TPIDMTables.PACKid_http_c_s_s_www_example_org_s_tPIDM.getDataTypeId("Date", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = TPIDMTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Titre = TPIDMTables.PACKid_http_c_s_s_www_example_org_s_tPIDM.getEnumerationId("Titre");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_40 = ValueUtil.integerValueOf("40");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Enseignant = TypeId.BAG.getSpecializedId(TPIDMTables.CLSSid_Enseignant, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Etudiant = TypeId.BAG.getSpecializedId(TPIDMTables.CLSSid_Etudiant, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Matiere = TypeId.BAG.getSpecializedId(TPIDMTables.CLSSid_Matiere, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_pr = TPIDMTables.ENUMid_Titre.getEnumerationLiteralId("pr");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Departement = TypeId.ORDERED_SET.getSpecializedId(TPIDMTables.CLSSid_Departement, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Enseignant = TypeId.ORDERED_SET.getSpecializedId(TPIDMTables.CLSSid_Enseignant, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Etudiant = TypeId.ORDERED_SET.getSpecializedId(TPIDMTables.CLSSid_Etudiant, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Etudiant_0 = TypeId.ORDERED_SET.getSpecializedId(TPIDMTables.CLSSid_Etudiant, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Matiere = TypeId.ORDERED_SET.getSpecializedId(TPIDMTables.CLSSid_Matiere, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Note = TypeId.ORDERED_SET.getSpecializedId(TPIDMTables.CLSSid_Note, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Enseignant = TypeId.SET.getSpecializedId(TPIDMTables.CLSSid_Enseignant, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			TPIDMTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TPIDMTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Date = new EcoreExecutorType("Date", PACKAGE, 0);
		public static final EcoreExecutorType _Departement = new EcoreExecutorType(TPIDMPackage.Literals.DEPARTEMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Enseignant = new EcoreExecutorType(TPIDMPackage.Literals.ENSEIGNANT, PACKAGE, 0);
		public static final EcoreExecutorType _Etudiant = new EcoreExecutorType(TPIDMPackage.Literals.ETUDIANT, PACKAGE, 0);
		public static final EcoreExecutorType _Matiere = new EcoreExecutorType(TPIDMPackage.Literals.MATIERE, PACKAGE, 0);
		public static final EcoreExecutorType _Note = new EcoreExecutorType(TPIDMPackage.Literals.NOTE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Titre = new EcoreExecutorEnumeration(TPIDMPackage.Literals.TITRE, PACKAGE, 0);
		public static final EcoreExecutorType _Universite = new EcoreExecutorType(TPIDMPackage.Literals.UNIVERSITE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Date,
			_Departement,
			_Enseignant,
			_Etudiant,
			_Matiere,
			_Note,
			_Titre,
			_Universite
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TPIDMTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Date__Date = new ExecutorFragment(Types._Date, TPIDMTables.Types._Date);
		private static final ExecutorFragment _Date__OclAny = new ExecutorFragment(Types._Date, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Date__OclComparable = new ExecutorFragment(Types._Date, OCLstdlibTables.Types._OclComparable);

		private static final ExecutorFragment _Departement__Departement = new ExecutorFragment(Types._Departement, TPIDMTables.Types._Departement);
		private static final ExecutorFragment _Departement__OclAny = new ExecutorFragment(Types._Departement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Departement__OclElement = new ExecutorFragment(Types._Departement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Enseignant__Enseignant = new ExecutorFragment(Types._Enseignant, TPIDMTables.Types._Enseignant);
		private static final ExecutorFragment _Enseignant__OclAny = new ExecutorFragment(Types._Enseignant, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Enseignant__OclElement = new ExecutorFragment(Types._Enseignant, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Etudiant__Etudiant = new ExecutorFragment(Types._Etudiant, TPIDMTables.Types._Etudiant);
		private static final ExecutorFragment _Etudiant__OclAny = new ExecutorFragment(Types._Etudiant, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Etudiant__OclElement = new ExecutorFragment(Types._Etudiant, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Matiere__Matiere = new ExecutorFragment(Types._Matiere, TPIDMTables.Types._Matiere);
		private static final ExecutorFragment _Matiere__OclAny = new ExecutorFragment(Types._Matiere, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Matiere__OclElement = new ExecutorFragment(Types._Matiere, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Note__Note = new ExecutorFragment(Types._Note, TPIDMTables.Types._Note);
		private static final ExecutorFragment _Note__OclAny = new ExecutorFragment(Types._Note, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Note__OclElement = new ExecutorFragment(Types._Note, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Titre__OclAny = new ExecutorFragment(Types._Titre, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Titre__OclElement = new ExecutorFragment(Types._Titre, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Titre__OclEnumeration = new ExecutorFragment(Types._Titre, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Titre__OclType = new ExecutorFragment(Types._Titre, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Titre__Titre = new ExecutorFragment(Types._Titre, TPIDMTables.Types._Titre);

		private static final ExecutorFragment _Universite__OclAny = new ExecutorFragment(Types._Universite, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Universite__OclElement = new ExecutorFragment(Types._Universite, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Universite__Universite = new ExecutorFragment(Types._Universite, TPIDMTables.Types._Universite);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TPIDMTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _EInt = TypeUtil.createParameterTypes(OCLstdlibTables.Types._Integer);
		public static final ParameterTypes _Enseignant = TypeUtil.createParameterTypes(TPIDMTables.Types._Enseignant);
		public static final ParameterTypes _Matiere = TypeUtil.createParameterTypes(TPIDMTables.Types._Matiere);
		public static final ParameterTypes _OclSelf = TypeUtil.createParameterTypes(OCLstdlibTables.Types._OclSelf);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TPIDMTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Date__compareTo = new ExecutorOperation("compareTo", Parameters._OclSelf, Types._Date,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Departement__ajouter = new ExecutorOperation("ajouter", Parameters._Enseignant, Types._Departement,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Enseignant__augmenterSal = new ExecutorOperation("augmenterSal", Parameters._EInt, Types._Enseignant,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Enseignant__enseigner = new ExecutorOperation("enseigner", Parameters._Matiere, Types._Enseignant,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Etudiant__age = new ExecutorOperation("age", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Etudiant,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Etudiant__estAdmis = new ExecutorOperation("estAdmis", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Etudiant,
			1, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TPIDMTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final ExecutorProperty _Departement__Nom = new EcoreExecutorProperty(TPIDMPackage.Literals.DEPARTEMENT__NOM, Types._Departement, 0);
		public static final ExecutorProperty _Departement__chef = new EcoreExecutorProperty(TPIDMPackage.Literals.DEPARTEMENT__CHEF, Types._Departement, 1);
		public static final ExecutorProperty _Departement__enseignant = new EcoreExecutorProperty(TPIDMPackage.Literals.DEPARTEMENT__ENSEIGNANT, Types._Departement, 2);
		public static final ExecutorProperty _Departement__Universite__departement = new ExecutorPropertyWithImplementation("Universite", Types._Departement, 3, new EcoreLibraryOppositeProperty(TPIDMPackage.Literals.UNIVERSITE__DEPARTEMENT));

		public static final ExecutorProperty _Enseignant__Age = new EcoreExecutorProperty(TPIDMPackage.Literals.ENSEIGNANT__AGE, Types._Enseignant, 0);
		public static final ExecutorProperty _Enseignant__Debut = new EcoreExecutorProperty(TPIDMPackage.Literals.ENSEIGNANT__DEBUT, Types._Enseignant, 1);
		public static final ExecutorProperty _Enseignant__Nom = new EcoreExecutorProperty(TPIDMPackage.Literals.ENSEIGNANT__NOM, Types._Enseignant, 2);
		public static final ExecutorProperty _Enseignant__Salaire = new EcoreExecutorProperty(TPIDMPackage.Literals.ENSEIGNANT__SALAIRE, Types._Enseignant, 3);
		public static final ExecutorProperty _Enseignant__enseigen = new EcoreExecutorProperty(TPIDMPackage.Literals.ENSEIGNANT__ENSEIGEN, Types._Enseignant, 4);
		public static final ExecutorProperty _Enseignant__titre = new EcoreExecutorProperty(TPIDMPackage.Literals.ENSEIGNANT__TITRE, Types._Enseignant, 5);
		public static final ExecutorProperty _Enseignant__Departement__chef = new ExecutorPropertyWithImplementation("Departement", Types._Enseignant, 6, new EcoreLibraryOppositeProperty(TPIDMPackage.Literals.DEPARTEMENT__CHEF));
		public static final ExecutorProperty _Enseignant__Departement__enseignant = new ExecutorPropertyWithImplementation("Departement", Types._Enseignant, 7, new EcoreLibraryOppositeProperty(TPIDMPackage.Literals.DEPARTEMENT__ENSEIGNANT));
		public static final ExecutorProperty _Enseignant__Matiere__matrie = new ExecutorPropertyWithImplementation("Matiere", Types._Enseignant, 8, new EcoreLibraryOppositeProperty(TPIDMPackage.Literals.MATIERE__MATRIE));

		public static final ExecutorProperty _Etudiant__Naissance = new EcoreExecutorProperty(TPIDMPackage.Literals.ETUDIANT__NAISSANCE, Types._Etudiant, 0);
		public static final ExecutorProperty _Etudiant__Nom = new EcoreExecutorProperty(TPIDMPackage.Literals.ETUDIANT__NOM, Types._Etudiant, 1);
		public static final ExecutorProperty _Etudiant__matiere = new EcoreExecutorProperty(TPIDMPackage.Literals.ETUDIANT__MATIERE, Types._Etudiant, 2);
		public static final ExecutorProperty _Etudiant__note = new EcoreExecutorProperty(TPIDMPackage.Literals.ETUDIANT__NOTE, Types._Etudiant, 3);
		public static final ExecutorProperty _Etudiant__Universite__etudiant = new ExecutorPropertyWithImplementation("Universite", Types._Etudiant, 4, new EcoreLibraryOppositeProperty(TPIDMPackage.Literals.UNIVERSITE__ETUDIANT));

		public static final ExecutorProperty _Matiere__Nom = new EcoreExecutorProperty(TPIDMPackage.Literals.MATIERE__NOM, Types._Matiere, 0);
		public static final ExecutorProperty _Matiere__etudiant = new EcoreExecutorProperty(TPIDMPackage.Literals.MATIERE__ETUDIANT, Types._Matiere, 1);
		public static final ExecutorProperty _Matiere__heures = new EcoreExecutorProperty(TPIDMPackage.Literals.MATIERE__HEURES, Types._Matiere, 2);
		public static final ExecutorProperty _Matiere__matrie = new EcoreExecutorProperty(TPIDMPackage.Literals.MATIERE__MATRIE, Types._Matiere, 3);
		public static final ExecutorProperty _Matiere__note = new EcoreExecutorProperty(TPIDMPackage.Literals.MATIERE__NOTE, Types._Matiere, 4);
		public static final ExecutorProperty _Matiere__Enseignant__enseigen = new ExecutorPropertyWithImplementation("Enseignant", Types._Matiere, 5, new EcoreLibraryOppositeProperty(TPIDMPackage.Literals.ENSEIGNANT__ENSEIGEN));

		public static final ExecutorProperty _Note__date = new EcoreExecutorProperty(TPIDMPackage.Literals.NOTE__DATE, Types._Note, 0);
		public static final ExecutorProperty _Note__valeur = new EcoreExecutorProperty(TPIDMPackage.Literals.NOTE__VALEUR, Types._Note, 1);
		public static final ExecutorProperty _Note__Etudiant__note = new ExecutorPropertyWithImplementation("Etudiant", Types._Note, 2, new EcoreLibraryOppositeProperty(TPIDMPackage.Literals.ETUDIANT__NOTE));
		public static final ExecutorProperty _Note__Matiere__note = new ExecutorPropertyWithImplementation("Matiere", Types._Note, 3, new EcoreLibraryOppositeProperty(TPIDMPackage.Literals.MATIERE__NOTE));

		public static final ExecutorProperty _Universite__Code = new EcoreExecutorProperty(TPIDMPackage.Literals.UNIVERSITE__CODE, Types._Universite, 0);
		public static final ExecutorProperty _Universite__Nom = new EcoreExecutorProperty(TPIDMPackage.Literals.UNIVERSITE__NOM, Types._Universite, 1);
		public static final ExecutorProperty _Universite__departement = new EcoreExecutorProperty(TPIDMPackage.Literals.UNIVERSITE__DEPARTEMENT, Types._Universite, 2);
		public static final ExecutorProperty _Universite__etudiant = new EcoreExecutorProperty(TPIDMPackage.Literals.UNIVERSITE__ETUDIANT, Types._Universite, 3);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TPIDMTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Date =
			{
				Fragments._Date__OclAny /* 0 */,
				Fragments._Date__OclComparable /* 1 */,
				Fragments._Date__Date /* 2 */
			};
		private static final int /*@NonNull*/ [] __Date = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Departement =
			{
				Fragments._Departement__OclAny /* 0 */,
				Fragments._Departement__OclElement /* 1 */,
				Fragments._Departement__Departement /* 2 */
			};
		private static final int /*@NonNull*/ [] __Departement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Enseignant =
			{
				Fragments._Enseignant__OclAny /* 0 */,
				Fragments._Enseignant__OclElement /* 1 */,
				Fragments._Enseignant__Enseignant /* 2 */
			};
		private static final int /*@NonNull*/ [] __Enseignant = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Etudiant =
			{
				Fragments._Etudiant__OclAny /* 0 */,
				Fragments._Etudiant__OclElement /* 1 */,
				Fragments._Etudiant__Etudiant /* 2 */
			};
		private static final int /*@NonNull*/ [] __Etudiant = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Matiere =
			{
				Fragments._Matiere__OclAny /* 0 */,
				Fragments._Matiere__OclElement /* 1 */,
				Fragments._Matiere__Matiere /* 2 */
			};
		private static final int /*@NonNull*/ [] __Matiere = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Note =
			{
				Fragments._Note__OclAny /* 0 */,
				Fragments._Note__OclElement /* 1 */,
				Fragments._Note__Note /* 2 */
			};
		private static final int /*@NonNull*/ [] __Note = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Titre =
			{
				Fragments._Titre__OclAny /* 0 */,
				Fragments._Titre__OclElement /* 1 */,
				Fragments._Titre__OclType /* 2 */,
				Fragments._Titre__OclEnumeration /* 3 */,
				Fragments._Titre__Titre /* 4 */
			};
		private static final int /*@NonNull*/ [] __Titre = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Universite =
			{
				Fragments._Universite__OclAny /* 0 */,
				Fragments._Universite__OclElement /* 1 */,
				Fragments._Universite__Universite /* 2 */
			};
		private static final int /*@NonNull*/ [] __Universite = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Date.initFragments(_Date, __Date);
			Types._Departement.initFragments(_Departement, __Departement);
			Types._Enseignant.initFragments(_Enseignant, __Enseignant);
			Types._Etudiant.initFragments(_Etudiant, __Etudiant);
			Types._Matiere.initFragments(_Matiere, __Matiere);
			Types._Note.initFragments(_Note, __Note);
			Types._Titre.initFragments(_Titre, __Titre);
			Types._Universite.initFragments(_Universite, __Universite);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TPIDMTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Date__Date = {
			TPIDMTables.Operations._Date__compareTo /* compareTo(OclSelf[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Date__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Date__OclComparable = {
			OCLstdlibTables.Operations._OclComparable___lt_ /* _'<'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclComparable___lt__eq_ /* _'<='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclComparable___gt_ /* _'>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclComparable___gt__eq_ /* _'>='(OclSelf[1]) */,
			TPIDMTables.Operations._Date__compareTo /* compareTo(OclSelf[1]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Departement__Departement = {
			TPIDMTables.Operations._Departement__ajouter /* ajouter(Enseignant[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Departement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Departement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Enseignant__Enseignant = {
			TPIDMTables.Operations._Enseignant__augmenterSal /* augmenterSal(EInt[1]) */,
			TPIDMTables.Operations._Enseignant__enseigner /* enseigner(Matiere[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Enseignant__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Enseignant__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Etudiant__Etudiant = {
			TPIDMTables.Operations._Etudiant__age /* age() */,
			TPIDMTables.Operations._Etudiant__estAdmis /* estAdmis() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Etudiant__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Etudiant__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Matiere__Matiere = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Matiere__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Matiere__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Note__Note = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Note__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Note__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Titre__Titre = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Titre__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Titre__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Titre__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Titre__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Universite__Universite = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Universite__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Universite__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Date__Date.initOperations(_Date__Date);
			Fragments._Date__OclAny.initOperations(_Date__OclAny);
			Fragments._Date__OclComparable.initOperations(_Date__OclComparable);

			Fragments._Departement__Departement.initOperations(_Departement__Departement);
			Fragments._Departement__OclAny.initOperations(_Departement__OclAny);
			Fragments._Departement__OclElement.initOperations(_Departement__OclElement);

			Fragments._Enseignant__Enseignant.initOperations(_Enseignant__Enseignant);
			Fragments._Enseignant__OclAny.initOperations(_Enseignant__OclAny);
			Fragments._Enseignant__OclElement.initOperations(_Enseignant__OclElement);

			Fragments._Etudiant__Etudiant.initOperations(_Etudiant__Etudiant);
			Fragments._Etudiant__OclAny.initOperations(_Etudiant__OclAny);
			Fragments._Etudiant__OclElement.initOperations(_Etudiant__OclElement);

			Fragments._Matiere__Matiere.initOperations(_Matiere__Matiere);
			Fragments._Matiere__OclAny.initOperations(_Matiere__OclAny);
			Fragments._Matiere__OclElement.initOperations(_Matiere__OclElement);

			Fragments._Note__Note.initOperations(_Note__Note);
			Fragments._Note__OclAny.initOperations(_Note__OclAny);
			Fragments._Note__OclElement.initOperations(_Note__OclElement);

			Fragments._Titre__OclAny.initOperations(_Titre__OclAny);
			Fragments._Titre__OclElement.initOperations(_Titre__OclElement);
			Fragments._Titre__OclEnumeration.initOperations(_Titre__OclEnumeration);
			Fragments._Titre__OclType.initOperations(_Titre__OclType);
			Fragments._Titre__Titre.initOperations(_Titre__Titre);

			Fragments._Universite__OclAny.initOperations(_Universite__OclAny);
			Fragments._Universite__OclElement.initOperations(_Universite__OclElement);
			Fragments._Universite__Universite.initOperations(_Universite__Universite);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TPIDMTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Date = {};

		private static final ExecutorProperty /*@NonNull*/ [] _Departement = {
			TPIDMTables.Properties._Departement__Nom,
			TPIDMTables.Properties._Departement__chef,
			TPIDMTables.Properties._Departement__enseignant,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Enseignant = {
			TPIDMTables.Properties._Enseignant__Age,
			TPIDMTables.Properties._Enseignant__Debut,
			TPIDMTables.Properties._Enseignant__Nom,
			TPIDMTables.Properties._Enseignant__Salaire,
			TPIDMTables.Properties._Enseignant__enseigen,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TPIDMTables.Properties._Enseignant__titre
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Etudiant = {
			TPIDMTables.Properties._Etudiant__Naissance,
			TPIDMTables.Properties._Etudiant__Nom,
			TPIDMTables.Properties._Etudiant__matiere,
			TPIDMTables.Properties._Etudiant__note,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Matiere = {
			TPIDMTables.Properties._Matiere__Nom,
			TPIDMTables.Properties._Matiere__etudiant,
			TPIDMTables.Properties._Matiere__heures,
			TPIDMTables.Properties._Matiere__matrie,
			TPIDMTables.Properties._Matiere__note,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Note = {
			TPIDMTables.Properties._Note__date,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TPIDMTables.Properties._Note__valeur
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Titre = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Universite = {
			TPIDMTables.Properties._Universite__Code,
			TPIDMTables.Properties._Universite__Nom,
			TPIDMTables.Properties._Universite__departement,
			TPIDMTables.Properties._Universite__etudiant,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Date__Date.initProperties(_Date);
			Fragments._Departement__Departement.initProperties(_Departement);
			Fragments._Enseignant__Enseignant.initProperties(_Enseignant);
			Fragments._Etudiant__Etudiant.initProperties(_Etudiant);
			Fragments._Matiere__Matiere.initProperties(_Matiere);
			Fragments._Note__Note.initProperties(_Note);
			Fragments._Titre__Titre.initProperties(_Titre);
			Fragments._Universite__Universite.initProperties(_Universite);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TPIDMTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _Titre__ma = new EcoreExecutorEnumerationLiteral(TPIDMPackage.Literals.TITRE.getEEnumLiteral("ma"), Types._Titre, 0);
		public static final EcoreExecutorEnumerationLiteral _Titre__mc = new EcoreExecutorEnumerationLiteral(TPIDMPackage.Literals.TITRE.getEEnumLiteral("mc"), Types._Titre, 1);
		public static final EcoreExecutorEnumerationLiteral _Titre__pr = new EcoreExecutorEnumerationLiteral(TPIDMPackage.Literals.TITRE.getEEnumLiteral("pr"), Types._Titre, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Titre = {
			_Titre__ma,
			_Titre__mc,
			_Titre__pr
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Titre.initLiterals(_Titre);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TPIDMTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new TPIDMTables();
	}

	private TPIDMTables() {
		super(TPIDMPackage.eNS_URI);
	}
}
