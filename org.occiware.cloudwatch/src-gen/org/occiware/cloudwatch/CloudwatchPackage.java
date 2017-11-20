/**
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
 */
package org.occiware.cloudwatch;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.monitoring.MonitoringPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.occiware.cloudwatch.CloudwatchFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 *        annotation="http://www.eclipse.org/OCL/Import core='http://schemas.ogf.org/occi/core/ecore' monitoring='http://schemas.ogf.org/occi/monitoring/ecore'"
 * @generated
 */
public interface CloudwatchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cloudwatch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.occiware/monitoring/cloudwatch/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cloudwatch";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudwatchPackage eINSTANCE = org.occiware.cloudwatch.impl.CloudwatchPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.occiware.cloudwatch.impl.JmxImpl <em>Jmx</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.cloudwatch.impl.JmxImpl
	 * @see org.occiware.cloudwatch.impl.CloudwatchPackageImpl#getJmx()
	 * @generated
	 */
	int JMX = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__ID = MonitoringPackage.SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__TITLE = MonitoringPackage.SENSOR__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__KIND = MonitoringPackage.SENSOR__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__LOCATION = MonitoringPackage.SENSOR__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__ATTRIBUTES = MonitoringPackage.SENSOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__MIXINS = MonitoringPackage.SENSOR__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__PARTS = MonitoringPackage.SENSOR__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__SUMMARY = MonitoringPackage.SENSOR__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__LINKS = MonitoringPackage.SENSOR__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__RLINKS = MonitoringPackage.SENSOR__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Sensor Timebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__OCCI_SENSOR_TIMEBASE = MonitoringPackage.SENSOR__OCCI_SENSOR_TIMEBASE;

	/**
	 * The feature id for the '<em><b>Occi Sensor Timestart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__OCCI_SENSOR_TIMESTART = MonitoringPackage.SENSOR__OCCI_SENSOR_TIMESTART;

	/**
	 * The feature id for the '<em><b>Occi Sensor Timestop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__OCCI_SENSOR_TIMESTOP = MonitoringPackage.SENSOR__OCCI_SENSOR_TIMESTOP;

	/**
	 * The feature id for the '<em><b>Occi Sensor Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__OCCI_SENSOR_PERIOD = MonitoringPackage.SENSOR__OCCI_SENSOR_PERIOD;

	/**
	 * The feature id for the '<em><b>Occi Sensor Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__OCCI_SENSOR_GRANULARITY = MonitoringPackage.SENSOR__OCCI_SENSOR_GRANULARITY;

	/**
	 * The feature id for the '<em><b>Occi Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__OCCI_SENSOR_ACCURACY = MonitoringPackage.SENSOR__OCCI_SENSOR_ACCURACY;

	/**
	 * The feature id for the '<em><b>Node Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__NODE_URL = MonitoringPackage.SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Credentials Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX__CREDENTIALS_PATH = MonitoringPackage.SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Jmx</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX_FEATURE_COUNT = MonitoringPackage.SENSOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX___OCCI_CREATE = MonitoringPackage.SENSOR___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX___OCCI_RETRIEVE = MonitoringPackage.SENSOR___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX___OCCI_UPDATE = MonitoringPackage.SENSOR___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX___OCCI_DELETE = MonitoringPackage.SENSOR___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Jmx</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMX_OPERATION_COUNT = MonitoringPackage.SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.cloudwatch.impl.CloudautomationmetricImpl <em>Cloudautomationmetric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.cloudwatch.impl.CloudautomationmetricImpl
	 * @see org.occiware.cloudwatch.impl.CloudwatchPackageImpl#getCloudautomationmetric()
	 * @generated
	 */
	int CLOUDAUTOMATIONMETRIC = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONMETRIC__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONMETRIC__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONMETRIC__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Metric Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONMETRIC__METRIC_NAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONMETRIC__METRIC = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cloudautomationmetric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONMETRIC_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONMETRIC___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cloudautomationmetric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDAUTOMATIONMETRIC_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.occiware.cloudwatch.impl.ActionpublisherImpl <em>Actionpublisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.cloudwatch.impl.ActionpublisherImpl
	 * @see org.occiware.cloudwatch.impl.CloudwatchPackageImpl#getActionpublisher()
	 * @generated
	 */
	int ACTIONPUBLISHER = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONPUBLISHER__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONPUBLISHER__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONPUBLISHER__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONPUBLISHER__ACTION_NAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actionpublisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONPUBLISHER_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONPUBLISHER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actionpublisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONPUBLISHER_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.occiware.cloudwatch.Jmx <em>Jmx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jmx</em>'.
	 * @see org.occiware.cloudwatch.Jmx
	 * @generated
	 */
	EClass getJmx();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.cloudwatch.Jmx#getNodeUrl <em>Node Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Url</em>'.
	 * @see org.occiware.cloudwatch.Jmx#getNodeUrl()
	 * @see #getJmx()
	 * @generated
	 */
	EAttribute getJmx_NodeUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.cloudwatch.Jmx#getCredentialsPath <em>Credentials Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credentials Path</em>'.
	 * @see org.occiware.cloudwatch.Jmx#getCredentialsPath()
	 * @see #getJmx()
	 * @generated
	 */
	EAttribute getJmx_CredentialsPath();

	/**
	 * Returns the meta object for class '{@link org.occiware.cloudwatch.Cloudautomationmetric <em>Cloudautomationmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloudautomationmetric</em>'.
	 * @see org.occiware.cloudwatch.Cloudautomationmetric
	 * @generated
	 */
	EClass getCloudautomationmetric();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.cloudwatch.Cloudautomationmetric#getMetricName <em>Metric Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric Name</em>'.
	 * @see org.occiware.cloudwatch.Cloudautomationmetric#getMetricName()
	 * @see #getCloudautomationmetric()
	 * @generated
	 */
	EAttribute getCloudautomationmetric_MetricName();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.cloudwatch.Cloudautomationmetric#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see org.occiware.cloudwatch.Cloudautomationmetric#getMetric()
	 * @see #getCloudautomationmetric()
	 * @generated
	 */
	EAttribute getCloudautomationmetric_Metric();

	/**
	 * Returns the meta object for the '{@link org.occiware.cloudwatch.Cloudautomationmetric#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.cloudwatch.Cloudautomationmetric#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCloudautomationmetric__AppliesConstraint__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.occiware.cloudwatch.Cloudautomationmetric#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.cloudwatch.Cloudautomationmetric#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCloudautomationmetric__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.cloudwatch.Actionpublisher <em>Actionpublisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actionpublisher</em>'.
	 * @see org.occiware.cloudwatch.Actionpublisher
	 * @generated
	 */
	EClass getActionpublisher();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.cloudwatch.Actionpublisher#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see org.occiware.cloudwatch.Actionpublisher#getActionName()
	 * @see #getActionpublisher()
	 * @generated
	 */
	EAttribute getActionpublisher_ActionName();

	/**
	 * Returns the meta object for the '{@link org.occiware.cloudwatch.Actionpublisher#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.cloudwatch.Actionpublisher#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getActionpublisher__AppliesConstraint__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.occiware.cloudwatch.Actionpublisher#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.cloudwatch.Actionpublisher#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getActionpublisher__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CloudwatchFactory getCloudwatchFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.occiware.cloudwatch.impl.JmxImpl <em>Jmx</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.cloudwatch.impl.JmxImpl
		 * @see org.occiware.cloudwatch.impl.CloudwatchPackageImpl#getJmx()
		 * @generated
		 */
		EClass JMX = eINSTANCE.getJmx();

		/**
		 * The meta object literal for the '<em><b>Node Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMX__NODE_URL = eINSTANCE.getJmx_NodeUrl();

		/**
		 * The meta object literal for the '<em><b>Credentials Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMX__CREDENTIALS_PATH = eINSTANCE.getJmx_CredentialsPath();

		/**
		 * The meta object literal for the '{@link org.occiware.cloudwatch.impl.CloudautomationmetricImpl <em>Cloudautomationmetric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.cloudwatch.impl.CloudautomationmetricImpl
		 * @see org.occiware.cloudwatch.impl.CloudwatchPackageImpl#getCloudautomationmetric()
		 * @generated
		 */
		EClass CLOUDAUTOMATIONMETRIC = eINSTANCE.getCloudautomationmetric();

		/**
		 * The meta object literal for the '<em><b>Metric Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDAUTOMATIONMETRIC__METRIC_NAME = eINSTANCE.getCloudautomationmetric_MetricName();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDAUTOMATIONMETRIC__METRIC = eINSTANCE.getCloudautomationmetric_Metric();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUDAUTOMATIONMETRIC___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getCloudautomationmetric__AppliesConstraint__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUDAUTOMATIONMETRIC___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCloudautomationmetric__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.cloudwatch.impl.ActionpublisherImpl <em>Actionpublisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.cloudwatch.impl.ActionpublisherImpl
		 * @see org.occiware.cloudwatch.impl.CloudwatchPackageImpl#getActionpublisher()
		 * @generated
		 */
		EClass ACTIONPUBLISHER = eINSTANCE.getActionpublisher();

		/**
		 * The meta object literal for the '<em><b>Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONPUBLISHER__ACTION_NAME = eINSTANCE.getActionpublisher_ActionName();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIONPUBLISHER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getActionpublisher__AppliesConstraint__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIONPUBLISHER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getActionpublisher__AppliesConstraint__DiagnosticChain_Map();

	}

} //CloudwatchPackage
