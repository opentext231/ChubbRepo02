/*
  This class has been generated by the Code Generator
*/

package com.worksitewsapppackage;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;

import com.cordys.cpc.bsf.busobject.BusObject;
import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;

import com.cordys.cpc.bsf.busobject.QueryObject;
import com.eibus.util.logger.CordysLogger;
import com.eibus.util.logger.Severity;
import com.eibus.xml.nom.Node;
import com.eibus.xml.xpath.XPath;


public class SFFieldsValidations extends SFFieldsValidationsBase
{
    public SFFieldsValidations()
    {
        this((BusObjectConfig)null);
    }

    public SFFieldsValidations(BusObjectConfig config)
    {
        super(config);
    }

    public static BusObjectIterator<com.worksitewsapppackage.SFFieldsValidations> GetDistinctHeaderNames()
    {
        String queryText = "Select distinct Tab from SFFieldsValidations";
        QueryObject query = new QueryObject(queryText);
     
        query.setResultClass(SFFieldsValidations.class);
        return query.getObjects();
    }

    private static CordysLogger logvar = CordysLogger.getCordysLogger(SFFieldsValidations.class);

    public static String getJsonStringSF(String screenName, int bpmInput) throws Exception
    {
logvar._log("getJsonStringSF", Severity.ERROR, null, "inside method --> bpminput: "+Node.writeToString(bpmInput, false));
    	if(!Node.isValidNode(bpmInput))
    	{
    		return "Not valid xml";
    	}
    	boolean validate = false;
        //int Node1 =  XPath.getFirstMatch(".//type", null, bpmInput);
        //String updatetype  =  Node.getDataWithDefault(Node1, "");
        
        JSONObject screenJson = new JSONObject();
        
        String query = "select Tab,GroupHeader from SFFieldsValidations WHERE Tab = '"+screenName+"' GROUP BY Tab,GroupHeader ORDER BY Tab,GroupHeader";
    	QueryObject queryObj = new QueryObject(query);
    	queryObj.setResultClass(SFFieldsValidations.class);
        
    	BusObjectIterator<SFFieldsValidations> screenSubScreenData = queryObj.getObjects();
        
        JSONObject subScreenJson = new JSONObject();
        
        //subScreenJson.put("Transaction", "Add");
        
    	while(screenSubScreenData.hasMoreElements()){
        
    		SFFieldsValidations screenSubscreen = screenSubScreenData.nextElement();
            
    		String query1 = "SELECT * FROM SFFieldsValidations WHERE Tab = '"+screenName+"' and GroupHeader = '"+screenSubscreen.getGroupHeader()+"'";
            
    		QueryObject queryObj1 = new QueryObject(query1);
    		queryObj1.setResultClass(SFFieldsValidations.class);
            
    		BusObjectIterator<SFFieldsValidations> tagsData = queryObj1.getObjects();
            
            
            JSONObject tagsJson = new JSONObject();
            
    		while(tagsData.hasMoreElements()){
                
                SFFieldsValidations tag = tagsData.nextElement();

                if(tag.getSourceField() != null && !tag.getSourceField().equals("") && !tag.getSourceField().isEmpty()){

                    int tagNode = XPath.getFirstMatch(".//"+tag.getSourceField(),null,bpmInput);//input column

                    //logvar._log("getJsonStringSF", Severity.ERROR, null, "inside do while --> tagNode: "+Node.writeToString(tagNode,false));

                    if(tagNode > 0){

                        tagsJson.put(tag.getField(),Node.getDataWithDefault(tagNode, ""));

                    }
                }
            };
            logvar._log("getJsonStringSF", Severity.ERROR, null, "tagJson: "+tagsJson.toString());
            if(!tagsJson.toString().equals("{}")){
            	
                subScreenJson.put(screenSubscreen.getGroupHeader(),tagsJson);
                validate =  true;
            }
    	}
    	//logvar._log("getJsonStringSF", Severity.ERROR, null, "subScreenJson: "+subScreenJson.toString());
    	//if(!subScreenJson.toString().equals("{}")){
    	    //if(validate && !screenName.equals("Test Test")&& !screenName.equals("Emp Loc Maintenance") ){
    	 if(validate){
    	   screenName = screenName.replaceAll("\\s+", "");
    	   
            screenJson.put(screenName,subScreenJson);
            logvar._log("getJsonStringSF", Severity.ERROR, null, "screenJson: "+screenJson.toString());
    	   
            return screenJson.toString();
        }
    	else{
    		screenName = screenName.replaceAll("\\s+", "");
    		return screenName;
    	}
    	//PartTimeIncome

}
		}