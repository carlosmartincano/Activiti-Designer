/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *
 * </copyright>
 *
 *******************************************************************************/
package org.activiti.designer.property;

import org.activiti.bpmn.model.Activity;
import org.activiti.bpmn.model.ThrowEvent;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

public class PropertyAsyncFilter extends ActivitiPropertyFilter {

  @Override
  protected boolean accept(PictogramElement pe) {
  	Object bo = getBusinessObject(pe);
  	if(bo != null && bo instanceof Activity || bo instanceof ThrowEvent) {
      return true;
  	}
    return false;
  }
}
