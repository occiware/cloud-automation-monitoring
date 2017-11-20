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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.occiware.cloudwatch.CloudwatchPackage
 * @generated
 */
public interface CloudwatchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudwatchFactory eINSTANCE = org.occiware.cloudwatch.impl.CloudwatchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Jmx</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jmx</em>'.
	 * @generated
	 */
	Jmx createJmx();

	/**
	 * Returns a new object of class '<em>Cloudautomationmetric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloudautomationmetric</em>'.
	 * @generated
	 */
	Cloudautomationmetric createCloudautomationmetric();

	/**
	 * Returns a new object of class '<em>Actionpublisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actionpublisher</em>'.
	 * @generated
	 */
	Actionpublisher createActionpublisher();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CloudwatchPackage getCloudwatchPackage();

} //CloudwatchFactory
