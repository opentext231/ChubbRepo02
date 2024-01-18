/*
  This class has been generated by the Code Generator
*/

package com.worksitewsapppackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.eibus.util.logger.CordysLogger;
import com.eibus.util.logger.Severity;
import java.util.*;
import com.cordys.cpc.bsf.busobject.BSF;
import com.cordys.cpc.bsf.busobject.DMLStatement;
import com.cordys.cpc.bsf.busobject.BusObject;

public class WKSEnrollmentTask extends WKSEnrollmentTaskBase
{
private static CordysLogger logvar = CordysLogger.getCordysLogger(WKSEnrollmentTask.class);
public static CordysLogger logger=CordysLogger.getCordysLogger(WKSEnrollmentTask.class);
    public WKSEnrollmentTask()
    {
        this((BusObjectConfig)null);
    }

    public WKSEnrollmentTask(BusObjectConfig config)
    {
        super(config);
    }

    public static BusObjectIterator<com.worksitewsapppackage.WKSEnrollmentTask> getSameDataForSameDateFromWKSEnrollTasks(String group_number, String agent_code, String pay_mode, String location, String created_date, String product)
    {
        String querytext="select * from WKSEnrollmentTask where GroupNumber='"+group_number+"' and AgentCode='"+agent_code+"' and PayMode='"+pay_mode+"' and Location='"+location+"' and CreatedDate='"+created_date+"' and Product='"+product+"'";

QueryObject query = new QueryObject(querytext);

query.addParameter("GroupNumber", "WKSEnrollmentTask.GroupNumber", QueryObject.PARAM_STRING, group_number);
query.addParameter("AgentCode", "WKSEnrollmentTask.AgentCode", QueryObject.PARAM_STRING, agent_code);
query.addParameter("PayMode", "WKSEnrollmentTask.PayMode", QueryObject.PARAM_STRING, pay_mode);
query.addParameter("Location", "WKSEnrollmentTask.Location", QueryObject.PARAM_STRING, location);
query.addParameter("CreatedDate", "WKSEnrollmentTask.CreatedDate", QueryObject.PARAM_STRING, created_date);
query.addParameter("Product", "WKSEnrollmentTask.Product", QueryObject.PARAM_STRING, product);
query.setResultClass(WKSEnrollmentTask.class);
//logger.error("Method: ADL*********"+querytext);
// logvar._log("getError", Severity.INFO, null, "WKSEnrollCase: "+querytext);
return query.getObjects();
    }
 public static BusObjectIterator<com.worksitewsapppackage.WKSEnrollmentTask> getFileNameByTaskInstanceId(String taskInsId)
    {
        String querytext="select * from WKSEnrollmentTask where TaskInstanceId ='"+taskInsId+"' ";

QueryObject query = new QueryObject(querytext);

query.addParameter("TaskInstanceId", "WKSEnrollmentTask.TaskInstanceId", QueryObject.PARAM_STRING, taskInsId);
query.setResultClass(WKSEnrollmentTask.class);
return query.getObjects();
    }
public static com.worksitewsapppackage.WKSEnrollmentTask getWKSEnrollmentTaskByFileId(String FileId,String taskStatus)
    {
        String queryText = "select * from WKSEnrollmentTask where FileId ='"+FileId+"' and Status='"+taskStatus+"'";
        QueryObject query = new QueryObject(queryText);
        //query.addParameter("FileId", "WKSEnrollmentTask.FileId", QueryObject.PARAMString, new Long(FileId));//NOPMD
        query.setResultClass(WKSEnrollmentTask.class);
        return (WKSEnrollmentTask)query.getObject();
    }
public static BusObjectIterator<com.worksitewsapppackage.WKSEnrollmentTask> getFileNamesbyStatus()
    {
        //String queryText = "Select * from WKSEnrollmentTask where Status in ('SSIS Manual File','SSIS Bot File')";
        String queryText = "Select * from WKSEnrollmentTask where Status in ('SSIS Manual File','SSIS Bot File') and AEBOTBatch is NULL";		
        QueryObject query = new QueryObject(queryText);
        //query.addParameter("fromTaskId", "WKSEnrollmentTask.TaskId", QueryObject.PARAM_INT, new Integer(fromTaskId));
       // query.addParameter("toTaskId", "WKSEnrollmentTask.TaskId", QueryObject.PARAM_INT, new Integer(toTaskId));
        query.setResultClass(WKSEnrollmentTask.class);
        return query.getObjects();
    }
	public static BusObjectIterator<com.worksitewsapppackage.WKSEnrollmentTask> getCaseInstanceIdByCaseid(String taskid)
    {
        String queryText = "select wkscase.CaseID as CaseID ,wkscase.CaseInstanceId ,WKSTASK.TaskId TaskID "+
" FROM WKSEnrollmentTask WKSTASK inner JOIN WKSEnrollmentCase wkscase on WKSTASK.CaseId = wkscase.CaseID" +
        		" where TaskId = '"+taskid+"'";
        QueryObject query = new QueryObject(queryText);
        //query.addParameter("fromTaskId", "WKSEnrollmentTask.TaskId", QueryObject.PARAM_INT, new Integer(fromTaskId));
       // query.addParameter("toTaskId", "WKSEnrollmentTask.TaskId", QueryObject.PARAM_INT, new Integer(toTaskId));
        query.setResultClass(WKSEnrollmentTask.class);
        return query.getObjects();
    }

 public static BusObjectIterator<com.worksitewsapppackage.WKSEnrollmentTask> getWKSEnrollmentTaskByStatus(String Status)
    {
        String querytext="select * from WKSEnrollmentTask where Status ='"+Status +"' ";

QueryObject query = new QueryObject(querytext);

query.addParameter("Status", "WKSEnrollmentTask.Status", QueryObject.PARAM_STRING, Status);
query.setResultClass(WKSEnrollmentTask.class);
return query.getObjects();
    }
 public static int UpdateBatchNumberUsingTaskInsID(String BatchNumber, String TaskInstanceID)
	{
		DMLStatement dml = null;
		String queryText="update WKSEnrollmentTask set BatchNumber='"+BatchNumber+"' where TaskInstanceId='"+TaskInstanceID+"' ";
//BRELogger.error("ERROR_MESSAGE : "+queryText);		
dml = new DMLStatement(queryText);
//BRELogger.error("ERROR_MESSAGE : "+dml);	
		dml.execute();

		return (int)1;
	}
public static int UpdateTaskidToNull(String TaskInstanceID)
	{
		DMLStatement dml = null;
		String queryText="update WKSEnrollmentTask set TaskInstanceId='',Status='BOT Submitted' where TaskInstanceId='"+TaskInstanceID+"' ";
//BRELogger.error("ERROR_MESSAGE : "+queryText);		
dml = new DMLStatement(queryText);
//BRELogger.error("ERROR_MESSAGE : "+dml);	
		dml.execute();

		return (int)1;
	}

public static BusObjectIterator<com.worksitewsapppackage.WKSEnrollmentTask> getTriageFileResult(String FileId)
{
	String queryText = "select tasktype,filename,count as recordcount from WKSEnrollmentTask  where FileId='"+FileId+"' and tasktype in('Terminations','Reinstatement','Change') union all "+
			"select 'NB',filename,count as recordcount from WKSEnrollmentCase where fileid is not null and FileName like'%NB_%' and FileId='"+FileId+"'";
	QueryObject query = new QueryObject(queryText);
	query.setResultClass(WKSEnrollmentTask.class);
	return query.getObjects();
}
public static com.worksitewsapppackage.WKSEnrollmentTask getWKSEnrollmentTaskByCaseId(String caseId,String taskName)
    {
        String queryText = "select * from WKSEnrollmentTask where CaseId ='"+caseId+"' and TaskType='"+taskName+"'";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(WKSEnrollmentTask.class);
        return (WKSEnrollmentTask)query.getObject();
    }
protected void onBeforeInsert()
{
String userDN = BSF.getUser();
//this.setCreatedDate(new Date(new Date().getTime() - (new Date().getTimezoneOffset() * 60 * 1000)));
this.setCreatedBy(userDN.substring(3,userDN.indexOf(",")));
}
protected void onBeforeUpdate()
{
String userDN = BSF.getUser();
//this.setModifiedDate(new Date(new Date().getTime() - (new Date().getTimezoneOffset() * 60 * 1000)));
this.setModifiedBy(userDN.substring(3,userDN.indexOf(",")));
}
public static BusObjectIterator<com.worksitewsapppackage.WKSEnrollmentTask> getSameDataForSameDateforAEBOTFromWKSEnrollTasks(String GroupNumber, String AgentCode, String Location, String Product, String Created_time, String EffectiveDate, String Pay_Mode)
    {
        String querytext="select * from WKSEnrollmentTask where GroupNumber='"+GroupNumber+"' and AgentCode='"+AgentCode+"' and Location='"+Location+"' and Product='"+Product+"' and CreatedDate='"+Created_time+"' and EffectiveDate='"+EffectiveDate+"' and PayMode='"+Pay_Mode+"'";

QueryObject query = new QueryObject(querytext);

query.addParameter("GroupNumber", "WKSEnrollmentTask.GroupNumber", QueryObject.PARAM_STRING, GroupNumber);
query.addParameter("AgentCode", "WKSEnrollmentTask.AgentCode", QueryObject.PARAM_STRING, AgentCode);
query.addParameter("Location", "WKSEnrollmentTask.Location", QueryObject.PARAM_STRING, Location);
query.addParameter("Product", "WKSEnrollmentTask.Product", QueryObject.PARAM_STRING, Product);
query.addParameter("CreatedDate", "WKSEnrollmentTask.CreatedDate", QueryObject.PARAM_STRING, Created_time);
query.addParameter("EffectiveDate", "WKSEnrollmentTask.EffectiveDate", QueryObject.PARAM_STRING, EffectiveDate);
query.addParameter("PayMode", "WKSEnrollmentTask.PayMode", QueryObject.PARAM_STRING, Pay_Mode);
query.setResultClass(WKSEnrollmentTask.class);
//logger.error("Method: ADL*********"+querytext);
// logvar._log("getError", Severity.INFO, null, "WKSEnrollCase: "+querytext);
return query.getObjects();
    }
	public static BusObjectIterator<com.worksitewsapppackage.WKSEnrollmentTask> CheckRealBatchFilesCount(String CaseID)
    {
        String querytext="select (count(Taskid) - (select count(Taskid) from WKSEnrollmentTask where CaseId ='"+CaseID+"' and ErrorDescription='Success')) as SuccessTask  from WKSEnrollmentTask where CaseId ='"+CaseID+"'";
QueryObject query = new QueryObject(querytext);
        query. addParameter("CaseId", "WKSEnrollmentTask.CaseId", QueryObject.PARAM_STRING, CaseID);//NOPMD
        query.setResultClass(WKSEnrollmentTask.class);
		return query.getObjects();
    }
	 public static BusObjectIterator<com.worksitewsapppackage.WKSEnrollmentTask> GetFileNamebystatusforAEBOT(String CaseId)
    {
        String querytext="Select * from WKSEnrollmentTask where Status in ('SSIS Bot File') and CaseId = '"+CaseId+"'";
        QueryObject query = new QueryObject(querytext);
        query. addParameter("CaseId", "WKSEnrollmentTask.CaseId", QueryObject.PARAM_STRING, CaseId);//NOPMD
        query.setResultClass(WKSEnrollmentTask.class);
		return query.getObjects();
    }
	     
     public static int UpdateBatchStatususingTaskID(String ErrorDescription, String TaskID, String ProcessedDate)
    {
        DMLStatement dml = null;
		String queryText="update WKSEnrollmentTask set ProcessedDate = '"+ProcessedDate+"',ErrorDescription = '"+ErrorDescription+"' where TaskId = '"+TaskID+"' ";
       dml = new DMLStatement(queryText);
		dml.execute();

		return (int)1;
    }
	public static int UpdateBatchStatusforAEBOT(String ErrorDescription, String ProcessedDate, String TaskId)
    {
        DMLStatement dml = null;
		String queryText="update WKSEnrollmentTask set ErrorDescription = '"+ErrorDescription+"', ProcessedDate = '"+ProcessedDate+"' where TaskId = '"+TaskId+"' ";
//BRELogger.error("ERROR_MESSAGE : "+queryText);		
dml = new DMLStatement(queryText);
//BRELogger.error("ERROR_MESSAGE : "+dml);	
		dml.execute();

		return (int)1;
    }
	public static int UpdateBatchStatusforAEBOTforNBCase(String ErrorDescription, String ProcessedDate, String CaseId)
    {
         DMLStatement dml = null;
		String queryText="update WKSEnrollmentTask set ErrorDescription = '"+ErrorDescription+"', ProcessedDate = '"+ProcessedDate+"' where CaseId = '"+CaseId+"' ";
//BRELogger.error("ERROR_MESSAGE : "+queryText);		
dml = new DMLStatement(queryText);
//BRELogger.error("ERROR_MESSAGE : "+dml);	
		dml.execute();
		return (int)1;
    }
 public static BusObjectIterator<com.worksitewsapppackage.WKSEnrollmentTask> getdetailsByCaseID(String CaseId)
    {
        String querytext="Select * from WKSEnrollmentTask where CaseId = '"+CaseId+"'";
        QueryObject query = new QueryObject(querytext);
        query. addParameter("CaseId", "WKSEnrollmentTask.CaseId", QueryObject.PARAM_STRING, CaseId);//NOPMD
        query.setResultClass(WKSEnrollmentTask.class);
		return query.getObjects();
    }
}