/*
  This class has been generated by the Code Generator
*/

package com.cica.uw;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;
import com.eibus.util.logger.CordysLogger;
import com.eibus.util.logger.Severity;


public class SearchConfig extends SearchConfigBase
{
      public static CordysLogger logger=CordysLogger.getCordysLogger(SearchConfig.class);
    public SearchConfig()
    {
        this((BusObjectConfig)null);
    }

    public SearchConfig(BusObjectConfig config)
    {
        super(config);
    }
public static BusObjectIterator<com.cica.uw.SearchConfig> getSearchConfigObjsByTTypeNTname(String TaskType, String TaskName)
    {
        
        String queryText = "select * from \"SearchConfig\" where \"TaskType\"=:TaskType and CaseOrTaskName=:CaseOrTaskName";
         //String queryText = "select * from \"SearchConfig\" where CaseOrTaskName in(TaskName)";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("TaskType", "SearchConfig.TaskType", QueryObject.PARAM_STRING, TaskType);
        query.addParameter("CaseOrTaskName", "SearchConfig.CaseOrTaskName", QueryObject.PARAM_STRING,TaskName);
        query.setResultClass(SearchConfig.class);
        return query.getObjects();
       
    }
public static BusObjectIterator<com.cica.uw.SearchConfig> getSearchConfigTasks(String TaskName)
    {
        String queryText ="";
        if((!TaskName.equalsIgnoreCase(""))&&(!TaskName.equalsIgnoreCase("*")))
          queryText = "select DISTINCT CaseOrTaskName from \"SearchConfig\"  where UPPER(CaseOrTaskName) like UPPER('%"+TaskName+"%') order by CaseOrTaskName";
        else queryText = "select DISTINCT CaseOrTaskName from \"SearchConfig\"  order by CaseOrTaskName";
        QueryObject query = new QueryObject(queryText);
        
        query.setResultClass(SearchConfig.class);
        return query.getObjects();
    }
public static BusObjectIterator<com.cica.uw.SearchConfig> getSearchConfigElementsByTasks(String TasksList)
    {String queryText ="";
        if(TasksList.equalsIgnoreCase("")==false)
        {
        queryText = "select * from \"SearchConfig\" where CaseOrTaskName in('"+TasksList+"') order by ElementName";
        QueryObject query = new QueryObject(queryText);
        
        query.setResultClass(SearchConfig.class);
        return query.getObjects();
       }else return null;
    }
    public static BusObjectIterator<com.cica.uw.SearchConfig> getSearchConfigObjByTType(String TaskType, String TaskName)
    {
         String queryText ="";
 if((!TaskName.equalsIgnoreCase(""))&&(!TaskName.equalsIgnoreCase("*")))
{
          queryText = "select DISTINCT CaseOrTaskName from \"SearchConfig\"  where UPPER(CaseOrTaskName) like UPPER('%"+TaskName+"%') order by CaseOrTaskName";
}
		else if(TaskType.equals("BOTH"))
{
		 queryText = "select DISTINCT CaseOrTaskName from \"SearchConfig\"  order by CaseOrTaskName";
}
else if (TaskType.equals("PFP"))
{
		queryText = "select DISTINCT CaseOrTaskName from \"SearchConfig\"   where CaseOrTaskName like '%"+TaskType+"%'  order by CaseOrTaskName";
}
else 
{
		queryText = "select DISTINCT CaseOrTaskName from \"SearchConfig\"   where CaseOrTaskName not  like  '%PFP%'  order by CaseOrTaskName";
}

        QueryObject query = new QueryObject(queryText);
        query.addParameter("TaskType", "SearchConfig.TaskType", QueryObject.PARAM_STRING, TaskType);
        query.addParameter("TaskName", "SearchConfig.CaseOrTaskName", QueryObject.PARAM_STRING, TaskName);
        query.setResultClass(SearchConfig.class);
        //return (SearchConfig)query.getObject();
        return query.getObjects();
    }
	
	public static BusObjectIterator<com.cica.uw.SearchConfig> getSearchConfigbyTaskType(String TaskType)
    {
        String queryText ="";
		if(TaskType.equals("BOTH"))
{
		 queryText = "select DISTINCT CaseOrTaskName from \"SearchConfig\"  order by CaseOrTaskName";
                logger.error("BOTH");
}
else if (TaskType.equals("PFP"))
{
		queryText = "select DISTINCT CaseOrTaskName from \"SearchConfig\"   where CaseOrTaskName like '%"+TaskType+"%'  order by CaseOrTaskName";
                   logger.error("PFP");
}
else 
{
		queryText = "select DISTINCT CaseOrTaskName from \"SearchConfig\"   where CaseOrTaskName not  like  '%PFP%'  order by CaseOrTaskName";
                  logger.error("NON-PFP");
}

        QueryObject query = new QueryObject(queryText);
        query.setResultClass(SearchConfig.class);
        //return (SearchConfig)query.getObject();
        return query.getObjects();
    }

}
