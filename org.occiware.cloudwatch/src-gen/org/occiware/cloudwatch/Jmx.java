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

import org.eclipse.cmf.occi.monitoring.Sensor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jmx</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.cloudwatch.Jmx#getNodeUrl <em>Node Url</em>}</li>
 *   <li>{@link org.occiware.cloudwatch.Jmx#getCredentialsPath <em>Credentials Path</em>}</li>
 * </ul>
 *
 * @see org.occiware.cloudwatch.CloudwatchPackage#getJmx()
 * @model
 * @generated
 */
public interface Jmx extends Sensor {
	/**
	 * Returns the value of the '<em><b>Node Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This the JMX RMI URL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Url</em>' attribute.
	 * @see #setNodeUrl(String)
	 * @see org.occiware.cloudwatch.CloudwatchPackage#getJmx_NodeUrl()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware/monitoring/cloudwatch/ecore!Jmx!NodeUrl'"
	 * @generated
	 */
	String getNodeUrl();

	/**
	 * Sets the value of the '{@link org.occiware.cloudwatch.Jmx#getNodeUrl <em>Node Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Url</em>' attribute.
	 * @see #getNodeUrl()
	 * @generated
	 */
	void setNodeUrl(String value);

	/**
	 * Returns the value of the '<em><b>Credentials Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The path to access the user credentials
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Credentials Path</em>' attribute.
	 * @see #setCredentialsPath(String)
	 * @see org.occiware.cloudwatch.CloudwatchPackage#getJmx_CredentialsPath()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware/monitoring/cloudwatch/ecore!Jmx!credentialsPath'"
	 * @generated
	 */
	String getCredentialsPath();

	/**
	 * Sets the value of the '{@link org.occiware.cloudwatch.Jmx#getCredentialsPath <em>Credentials Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentials Path</em>' attribute.
	 * @see #getCredentialsPath()
	 * @generated
	 */
	void setCredentialsPath(String value);

} // Jmx
