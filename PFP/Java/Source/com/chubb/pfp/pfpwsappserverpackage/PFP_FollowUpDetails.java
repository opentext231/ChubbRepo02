/*
  This class has been generated by the Code Generator
*/

package com.chubb.pfp.pfpwsappserverpackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;


public class PFP_FollowUpDetails extends PFP_FollowUpDetailsBase
{
    public PFP_FollowUpDetails()
    {
        this((BusObjectConfig)null);
    }

    public PFP_FollowUpDetails(BusObjectConfig config)
    {
        super(config);
    }

    public static BusObjectIterator<com.chubb.pfp.pfpwsappserverpackage.PFP_FollowUpDetails> GetPFPFollowUpByPolicyNumber(String PolicyNumber, String TaskInstanceID)
    {
       String queryText = "select * from \"PFP_FollowUpDetails\" where \"PolicyNumber\"=:PolicyNumber and \"TaskInstanceID\"=:TaskInstanceID  and  Status ='In Progress'";
        QueryObject query = new QueryObject(queryText);
        query. addParameter("PolicyNumber", "PFP_FollowUpDetails.PolicyNumber", QueryObject.PARAM_STRING, PolicyNumber);
    query. addParameter("TaskInstanceID", "PFP_FollowUpDetails.TaskInstanceID", QueryObject.PARAM_STRING, TaskInstanceID);   //NOPMD
        query.setResultClass(PFP_FollowUpDetails.class);
        //return (PFP_FollowUpDetails)query.getObject(); //To fetch single record
	return query.getObjects();  //To fetch Multiple records
    }

public static BusObjectIterator<com.chubb.pfp.pfpwsappserverpackage.PFP_FollowUpDetails> getPendingFollowUpTaskDetails()
    {
        String queryText = "SELECT * FROM PFP_FollowUpDetails WHERE convert(date,\"FollowupDate\")=convert(date,getdate())";
        QueryObject query = new QueryObject(queryText);       
        query.setResultClass(PFP_FollowUpDetails.class);        
        return query.getObjects();
    }

}
