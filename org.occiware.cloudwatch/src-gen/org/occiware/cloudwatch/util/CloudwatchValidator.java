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
package org.occiware.cloudwatch.util;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.occiware.cloudwatch.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.occiware.cloudwatch.CloudwatchPackage
 * @generated
 */
public class CloudwatchValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CloudwatchValidator INSTANCE = new CloudwatchValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.occiware.cloudwatch";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Cloudautomationmetric'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLOUDAUTOMATIONMETRIC__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Actionpublisher'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIONPUBLISHER__APPLIES_CONSTRAINT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCCIValidator occiValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudwatchValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CloudwatchPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CloudwatchPackage.JMX:
				return validateJmx((Jmx)value, diagnostics, context);
			case CloudwatchPackage.CLOUDAUTOMATIONMETRIC:
				return validateCloudautomationmetric((Cloudautomationmetric)value, diagnostics, context);
			case CloudwatchPackage.ACTIONPUBLISHER:
				return validateActionpublisher((Actionpublisher)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJmx(Jmx jmx, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(jmx, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(jmx, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(jmx, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(jmx, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(jmx, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(jmx, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(jmx, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(jmx, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(jmx, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(jmx, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(jmx, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(jmx, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(jmx, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudautomationmetric(Cloudautomationmetric cloudautomationmetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cloudautomationmetric, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cloudautomationmetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cloudautomationmetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cloudautomationmetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cloudautomationmetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cloudautomationmetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cloudautomationmetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cloudautomationmetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cloudautomationmetric, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudautomationmetric_appliesConstraint(cloudautomationmetric, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Cloudautomationmetric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudautomationmetric_appliesConstraint(Cloudautomationmetric cloudautomationmetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cloudautomationmetric.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionpublisher(Actionpublisher actionpublisher, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actionpublisher, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actionpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actionpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actionpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actionpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actionpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actionpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actionpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actionpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionpublisher_appliesConstraint(actionpublisher, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Actionpublisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionpublisher_appliesConstraint(Actionpublisher actionpublisher, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return actionpublisher.appliesConstraint(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CloudwatchValidator
