/*******************************************************************************
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.occiware.cloudwatch/model/cloudwatch.ecore
 * using:
 *   /org.occiware.cloudwatch/model/cloudwatch.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.occiware.cloudwatch;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.monitoring.MonitoringTables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.occiware.cloudwatch.CloudwatchTables;

/**
 * CloudwatchTables provides the dispatch tables for the cloudwatch for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class CloudwatchTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(CloudwatchPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_org_occiware_s_monitoring_s_cloudwatch_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://org.occiware/monitoring/cloudwatch/ecore", null, org.occiware.cloudwatch.CloudwatchPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_monitoring_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/monitoring/ecore", null, org.eclipse.cmf.occi.monitoring.MonitoringPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Actionpublisher = org.occiware.cloudwatch.CloudwatchTables.PACKid_http_c_s_s_org_occiware_s_monitoring_s_cloudwatch_s_ecore.getClassId("Actionpublisher", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.occiware.cloudwatch.CloudwatchTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Cloudautomationmetric = org.occiware.cloudwatch.CloudwatchTables.PACKid_http_c_s_s_org_occiware_s_monitoring_s_cloudwatch_s_ecore.getClassId("Cloudautomationmetric", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Collector = org.occiware.cloudwatch.CloudwatchTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_monitoring_s_ecore.getClassId("Collector", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.occiware.cloudwatch.CloudwatchTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Jmx = org.occiware.cloudwatch.CloudwatchTables.PACKid_http_c_s_s_org_occiware_s_monitoring_s_cloudwatch_s_ecore.getClassId("Jmx", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Actionpublisher_c_c_appliesConstraint = "Actionpublisher::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Cloudautomationmetric_c_c_appliesConstraint = "Cloudautomationmetric::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			CloudwatchTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudwatchTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Actionpublisher = new EcoreExecutorType(CloudwatchPackage.Literals.ACTIONPUBLISHER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cloudautomationmetric = new EcoreExecutorType(CloudwatchPackage.Literals.CLOUDAUTOMATIONMETRIC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Jmx = new EcoreExecutorType(CloudwatchPackage.Literals.JMX, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Actionpublisher,
			_Cloudautomationmetric,
			_Jmx
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudwatchTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Actionpublisher__Actionpublisher = new ExecutorFragment(Types._Actionpublisher, CloudwatchTables.Types._Actionpublisher);
		private static final /*@NonNull*/ ExecutorFragment _Actionpublisher__MixinBase = new ExecutorFragment(Types._Actionpublisher, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Actionpublisher__OclAny = new ExecutorFragment(Types._Actionpublisher, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Actionpublisher__OclElement = new ExecutorFragment(Types._Actionpublisher, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationmetric__Cloudautomationmetric = new ExecutorFragment(Types._Cloudautomationmetric, CloudwatchTables.Types._Cloudautomationmetric);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationmetric__MixinBase = new ExecutorFragment(Types._Cloudautomationmetric, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationmetric__OclAny = new ExecutorFragment(Types._Cloudautomationmetric, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cloudautomationmetric__OclElement = new ExecutorFragment(Types._Cloudautomationmetric, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Jmx__Entity = new ExecutorFragment(Types._Jmx, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Jmx__Jmx = new ExecutorFragment(Types._Jmx, CloudwatchTables.Types._Jmx);
		private static final /*@NonNull*/ ExecutorFragment _Jmx__OclAny = new ExecutorFragment(Types._Jmx, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Jmx__OclElement = new ExecutorFragment(Types._Jmx, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Jmx__Resource = new ExecutorFragment(Types._Jmx, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Jmx__Sensor = new ExecutorFragment(Types._Jmx, MonitoringTables.Types._Sensor);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudwatchTables::Fragments and all preceding sub-packages.
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


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudwatchTables::Parameters and all preceding sub-packages.
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

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudwatchTables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _Actionpublisher__actionName = new EcoreExecutorProperty(CloudwatchPackage.Literals.ACTIONPUBLISHER__ACTION_NAME, Types._Actionpublisher, 0);

		public static final /*@NonNull*/ ExecutorProperty _Cloudautomationmetric__metric = new EcoreExecutorProperty(CloudwatchPackage.Literals.CLOUDAUTOMATIONMETRIC__METRIC, Types._Cloudautomationmetric, 0);
		public static final /*@NonNull*/ ExecutorProperty _Cloudautomationmetric__metricName = new EcoreExecutorProperty(CloudwatchPackage.Literals.CLOUDAUTOMATIONMETRIC__METRIC_NAME, Types._Cloudautomationmetric, 1);

		public static final /*@NonNull*/ ExecutorProperty _Jmx__NodeUrl = new EcoreExecutorProperty(CloudwatchPackage.Literals.JMX__NODE_URL, Types._Jmx, 0);
		public static final /*@NonNull*/ ExecutorProperty _Jmx__credentialsPath = new EcoreExecutorProperty(CloudwatchPackage.Literals.JMX__CREDENTIALS_PATH, Types._Jmx, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudwatchTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Actionpublisher =
		{
			Fragments._Actionpublisher__OclAny /* 0 */,
			Fragments._Actionpublisher__OclElement /* 1 */,
			Fragments._Actionpublisher__MixinBase /* 2 */,
			Fragments._Actionpublisher__Actionpublisher /* 3 */
		};
		private static final int /*@NonNull*/ [] __Actionpublisher = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cloudautomationmetric =
		{
			Fragments._Cloudautomationmetric__OclAny /* 0 */,
			Fragments._Cloudautomationmetric__OclElement /* 1 */,
			Fragments._Cloudautomationmetric__MixinBase /* 2 */,
			Fragments._Cloudautomationmetric__Cloudautomationmetric /* 3 */
		};
		private static final int /*@NonNull*/ [] __Cloudautomationmetric = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Jmx =
		{
			Fragments._Jmx__OclAny /* 0 */,
			Fragments._Jmx__OclElement /* 1 */,
			Fragments._Jmx__Entity /* 2 */,
			Fragments._Jmx__Resource /* 3 */,
			Fragments._Jmx__Sensor /* 4 */,
			Fragments._Jmx__Jmx /* 5 */
		};
		private static final int /*@NonNull*/ [] __Jmx = { 1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Actionpublisher.initFragments(_Actionpublisher, __Actionpublisher);
			Types._Cloudautomationmetric.initFragments(_Cloudautomationmetric, __Cloudautomationmetric);
			Types._Jmx.initFragments(_Jmx, __Jmx);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudwatchTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actionpublisher__Actionpublisher = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actionpublisher__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actionpublisher__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actionpublisher__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationmetric__Cloudautomationmetric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationmetric__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationmetric__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudautomationmetric__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Jmx__Jmx = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Jmx__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Jmx__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Jmx__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Jmx__Resource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Jmx__Sensor = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Actionpublisher__Actionpublisher.initOperations(_Actionpublisher__Actionpublisher);
			Fragments._Actionpublisher__MixinBase.initOperations(_Actionpublisher__MixinBase);
			Fragments._Actionpublisher__OclAny.initOperations(_Actionpublisher__OclAny);
			Fragments._Actionpublisher__OclElement.initOperations(_Actionpublisher__OclElement);

			Fragments._Cloudautomationmetric__Cloudautomationmetric.initOperations(_Cloudautomationmetric__Cloudautomationmetric);
			Fragments._Cloudautomationmetric__MixinBase.initOperations(_Cloudautomationmetric__MixinBase);
			Fragments._Cloudautomationmetric__OclAny.initOperations(_Cloudautomationmetric__OclAny);
			Fragments._Cloudautomationmetric__OclElement.initOperations(_Cloudautomationmetric__OclElement);

			Fragments._Jmx__Entity.initOperations(_Jmx__Entity);
			Fragments._Jmx__Jmx.initOperations(_Jmx__Jmx);
			Fragments._Jmx__OclAny.initOperations(_Jmx__OclAny);
			Fragments._Jmx__OclElement.initOperations(_Jmx__OclElement);
			Fragments._Jmx__Resource.initOperations(_Jmx__Resource);
			Fragments._Jmx__Sensor.initOperations(_Jmx__Sensor);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudwatchTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Actionpublisher = {
			CloudwatchTables.Properties._Actionpublisher__actionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cloudautomationmetric = {
			CloudwatchTables.Properties._Cloudautomationmetric__metric,
			CloudwatchTables.Properties._Cloudautomationmetric__metricName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Jmx = {
			CloudwatchTables.Properties._Jmx__NodeUrl,
			CloudwatchTables.Properties._Jmx__credentialsPath
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Actionpublisher__Actionpublisher.initProperties(_Actionpublisher);
			Fragments._Cloudautomationmetric__Cloudautomationmetric.initProperties(_Cloudautomationmetric);
			Fragments._Jmx__Jmx.initProperties(_Jmx);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudwatchTables::FragmentProperties and all preceding sub-packages.
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

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudwatchTables::EnumerationLiterals and all preceding sub-packages.
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
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
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
	public static void init() {}
}
