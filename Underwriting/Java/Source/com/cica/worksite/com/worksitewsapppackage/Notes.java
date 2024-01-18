/*
  This class has been generated by the Code Generator
*/

package com.worksitewsapppackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import java.util.*;
import com.cordys.cpc.bsf.busobject.BSF;


public class Notes extends NotesBase
{
    public Notes()
    {
        this((BusObjectConfig)null);
    }

    public Notes(BusObjectConfig config)
    {
        super(config);
    }

    public static BusObjectIterator<com.worksitewsapppackage.Notes> getNotesForPolicyNumber(String Policy_Number,String screen)
    {
        // TODO implement body
String queryText ="";
if(screen != null && !screen.trim().isEmpty()){
 queryText = "select * from \"Notes\" where (\"PolicyNumber\" = :Policy_Number) and Screen in("+screen+" )order by \"CreationTime\" desc";
}
else
{
queryText = "select * from \"Notes\" where (\"PolicyNumber\" = :Policy_Number) order by \"CreationTime\" desc";
}
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Policy_Number", "Notes.PolicyNumber", QueryObject.PARAM_STRING, Policy_Number);//NOPMD
        query.setResultClass(Notes.class);
        return query.getObjects();
       
    }
public static BusObjectIterator<com.worksitewsapppackage.Notes> getNotesDetailsByTaskId(String TaskId)
    {
        // TODO implement body
		String queryText ="";

		queryText = "select * from \"Notes\" where (\"TaskId\" = :TaskId) order by \"CreationTime\" desc";

        QueryObject query = new QueryObject(queryText);
        query.addParameter("TaskId", "Notes.TaskId", QueryObject.PARAM_STRING, TaskId);//NOPMD
        query.setResultClass(Notes.class);
        return query.getObjects();
       
    }
public static BusObjectIterator<com.worksitewsapppackage.Notes> getNotesByCaseInstanceId(String caseInstanceId,String screen)
{
	String queryText ="";
	if(screen != null && !screen.trim().isEmpty()){
		queryText = "select * from Notes where TaskId='"+caseInstanceId+"' and Screen in("+screen+" )order by CreationTime desc";
	}
	else
	{
		queryText = "select * from Notes where TaskId='"+caseInstanceId+"' order by CreationTime desc";
	}
	QueryObject query = new QueryObject(queryText);
	query.setResultClass(Notes.class);
	return query.getObjects();
   
}

protected void onBeforeInsert()
{
String userDN = BSF.getUser();
this.setCreationTime(new Date(new Date().getTime() - (new Date().getTimezoneOffset() * 60 * 1000)));
//this.setLoggedBy(userDN.substring(3,userDN.indexOf(",")));
}
protected void onBeforeUpdate()
{
String userDN = BSF.getUser();
this.setUpdatedOn(new Date(new Date().getTime() - (new Date().getTimezoneOffset() * 60 * 1000)));
this.setUpdatedBy(userDN.substring(3,userDN.indexOf(",")));
}

}
