/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 * Generated at Mon Nov 20 12:06:33 CET 2017 from platform:/resource/org.occiware.cloudwatch/model/cloudwatch.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.occiware.cloudwatch.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: cloudwatch
 * - scheme: http://org.occiware/monitoring/cloudwatch#
 */
public class ConnectorFactory extends org.occiware.cloudwatch.impl.CloudwatchFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.occiware/monitoring/cloudwatch#
	 * - term: jmx
	 * - title: 
	 */
	@Override
	public org.occiware.cloudwatch.Jmx createJmx() {
		return new JmxConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.occiware/monitoring/cloudwatch#
	 * - term: cloudautomationmetric
	 * - title: 
	 */
	@Override
	public org.occiware.cloudwatch.Cloudautomationmetric createCloudautomationmetric() {
		return new CloudautomationmetricConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.occiware/monitoring/cloudwatch#
	 * - term: actionpublisher
	 * - title: 
	 */
	@Override
	public org.occiware.cloudwatch.Actionpublisher createActionpublisher() {
		return new ActionpublisherConnector();
	}

}
