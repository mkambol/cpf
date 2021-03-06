/*!
* Copyright 2002 - 2014 Webdetails, a Pentaho company.  All rights reserved.
* 
* This software was developed by Webdetails and is provided under the terms
* of the Mozilla Public License, Version 2.0, or any later version. You may not use
* this file except in compliance with the license. If you need a copy of the license,
* please go to  http://mozilla.org/MPL/2.0/. The Initial Developer is Webdetails.
*
* Software distributed under the Mozilla Public License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
* the license for the specific language governing your rights and limitations.
*/

package pt.webdetails.cpf.olap;

import javax.sql.DataSource;

import org.pentaho.platform.api.data.IDatasourceService;
import org.pentaho.platform.engine.core.system.PentahoSystem;
import org.pentaho.platform.plugin.action.mondrian.catalog.MondrianCatalog;


/**
 * @author pedro
 */
public class OlapUtils extends AbstractOlapUtils {

  @Override
  protected String getJndiFromCatalog( MondrianCatalog catalog ) {
    return catalog.getEffectiveDataSource().getJndi();
  }

  @Override
  protected DataSource getDatasourceImpl( String dataSourceName ) throws Exception {
    IDatasourceService datasourceService = PentahoSystem.getObjectFactory().get( IDatasourceService.class, null );
    return datasourceService.getDataSource( dataSourceName );
  }

}

