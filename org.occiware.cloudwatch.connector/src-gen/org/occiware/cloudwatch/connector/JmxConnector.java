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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.occiware/monitoring/cloudwatch#
 * - term: jmx
 * - title: 
 */
public class JmxConnector extends org.occiware.cloudwatch.impl.JmxImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(JmxConnector.class);

	// Start of user code Jmxconnector_constructor
	/**
	 * Constructs a jmx connector.
	 */
	JmxConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code JmxocciCreate
	/**
	 * Called when this Jmx instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Jmx_occiRetrieve_method
	/**
	 * Called when this Jmx instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Jmx_occiUpdate_method
	/**
	 * Called when this Jmx instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code JmxocciDelete_method
	/**
	 * Called when this Jmx instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Jmx actions.
	//
}	
