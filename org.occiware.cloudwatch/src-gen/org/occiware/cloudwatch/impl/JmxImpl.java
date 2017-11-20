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
package org.occiware.cloudwatch.impl;

import org.eclipse.cmf.occi.monitoring.impl.SensorImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.cloudwatch.CloudwatchPackage;
import org.occiware.cloudwatch.Jmx;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jmx</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.cloudwatch.impl.JmxImpl#getNodeUrl <em>Node Url</em>}</li>
 *   <li>{@link org.occiware.cloudwatch.impl.JmxImpl#getCredentialsPath <em>Credentials Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JmxImpl extends SensorImpl implements Jmx {
	/**
	 * The default value of the '{@link #getNodeUrl() <em>Node Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeUrl() <em>Node Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeUrl()
	 * @generated
	 * @ordered
	 */
	protected String nodeUrl = NODE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredentialsPath() <em>Credentials Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentialsPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CREDENTIALS_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCredentialsPath() <em>Credentials Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentialsPath()
	 * @generated
	 * @ordered
	 */
	protected String credentialsPath = CREDENTIALS_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JmxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudwatchPackage.Literals.JMX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeUrl() {
		return nodeUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeUrl(String newNodeUrl) {
		String oldNodeUrl = nodeUrl;
		nodeUrl = newNodeUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudwatchPackage.JMX__NODE_URL, oldNodeUrl, nodeUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCredentialsPath() {
		return credentialsPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredentialsPath(String newCredentialsPath) {
		String oldCredentialsPath = credentialsPath;
		credentialsPath = newCredentialsPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudwatchPackage.JMX__CREDENTIALS_PATH, oldCredentialsPath, credentialsPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudwatchPackage.JMX__NODE_URL:
				return getNodeUrl();
			case CloudwatchPackage.JMX__CREDENTIALS_PATH:
				return getCredentialsPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CloudwatchPackage.JMX__NODE_URL:
				setNodeUrl((String)newValue);
				return;
			case CloudwatchPackage.JMX__CREDENTIALS_PATH:
				setCredentialsPath((String)newValue);
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
			case CloudwatchPackage.JMX__NODE_URL:
				setNodeUrl(NODE_URL_EDEFAULT);
				return;
			case CloudwatchPackage.JMX__CREDENTIALS_PATH:
				setCredentialsPath(CREDENTIALS_PATH_EDEFAULT);
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
			case CloudwatchPackage.JMX__NODE_URL:
				return NODE_URL_EDEFAULT == null ? nodeUrl != null : !NODE_URL_EDEFAULT.equals(nodeUrl);
			case CloudwatchPackage.JMX__CREDENTIALS_PATH:
				return CREDENTIALS_PATH_EDEFAULT == null ? credentialsPath != null : !CREDENTIALS_PATH_EDEFAULT.equals(credentialsPath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (NodeUrl: ");
		result.append(nodeUrl);
		result.append(", credentialsPath: ");
		result.append(credentialsPath);
		result.append(')');
		return result.toString();
	}

} //JmxImpl
