/*
  This class has been generated by the Code Generator
*/

package com.worksitewsapppackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class WKSEnrollmentCaseAssignmentBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_ID = "ID";
    public final static String ATTR_Worklist = "Worklist";
    public final static String ATTR_CaseId = "CaseId";
    public final static String ATTR_GroupNumber = "GroupNumber";
    public final static String ATTR_MasterAppNumber = "MasterAppNumber";
    public final static String ATTR_MasterAppID = "MasterAppID";
    public final static String ATTR_CaseInstanceId = "CaseInstanceId";
    public final static String ATTR_TaskInstanceID = "TaskInstanceID";
    public final static String ATTR_CaseAssignee = "CaseAssignee";
    public final static String ATTR_Status = "Status";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(WKSEnrollmentCaseAssignment.class);
            s_classInfo.setTableName("WKSEnrollmentCaseAssignment");
            s_classInfo.setUIDElements(new String[]{ATTR_ID});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ID);
                ai.setJavaName(ATTR_ID);
                ai.setColumnName(ATTR_ID);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_ID);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Worklist);
                ai.setJavaName(ATTR_Worklist);
                ai.setColumnName(ATTR_Worklist);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Worklist);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseId);
                ai.setJavaName(ATTR_CaseId);
                ai.setColumnName(ATTR_CaseId);
                ai.setAttributeClass(long.class);
                NumberValidator v = new NumberValidator(ATTR_CaseId);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_GroupNumber);
                ai.setJavaName(ATTR_GroupNumber);
                ai.setColumnName(ATTR_GroupNumber);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_GroupNumber);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_MasterAppNumber);
                ai.setJavaName(ATTR_MasterAppNumber);
                ai.setColumnName(ATTR_MasterAppNumber);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_MasterAppNumber);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_MasterAppID);
                ai.setJavaName(ATTR_MasterAppID);
                ai.setColumnName(ATTR_MasterAppID);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_MasterAppID);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseInstanceId);
                ai.setJavaName(ATTR_CaseInstanceId);
                ai.setColumnName(ATTR_CaseInstanceId);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CaseInstanceId);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_TaskInstanceID);
                ai.setJavaName(ATTR_TaskInstanceID);
                ai.setColumnName(ATTR_TaskInstanceID);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_TaskInstanceID);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseAssignee);
                ai.setJavaName(ATTR_CaseAssignee);
                ai.setColumnName(ATTR_CaseAssignee);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CaseAssignee);
                v.setMaxLength(500);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Status);
                ai.setJavaName(ATTR_Status);
                ai.setColumnName(ATTR_Status);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Status);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public WKSEnrollmentCaseAssignmentBase(BusObjectConfig config)
    {
        super(config);
    }

    public int getID()
    {
        return getIntProperty(ATTR_ID);
    }

    public void setID(int value)
    {
        setProperty(ATTR_ID, value, 0);
    }

    public String getWorklist()
    {
        return getStringProperty(ATTR_Worklist);
    }

    public void setWorklist(String value)
    {
        setProperty(ATTR_Worklist, value, 0);
    }

    public long getCaseId()
    {
        return getLongProperty(ATTR_CaseId);
    }

    public void setCaseId(long value)
    {
        setProperty(ATTR_CaseId, value, 0);
    }

    public String getGroupNumber()
    {
        return getStringProperty(ATTR_GroupNumber);
    }

    public void setGroupNumber(String value)
    {
        setProperty(ATTR_GroupNumber, value, 0);
    }

    public String getMasterAppNumber()
    {
        return getStringProperty(ATTR_MasterAppNumber);
    }

    public void setMasterAppNumber(String value)
    {
        setProperty(ATTR_MasterAppNumber, value, 0);
    }

    public String getMasterAppID()
    {
        return getStringProperty(ATTR_MasterAppID);
    }

    public void setMasterAppID(String value)
    {
        setProperty(ATTR_MasterAppID, value, 0);
    }

    public String getCaseInstanceId()
    {
        return getStringProperty(ATTR_CaseInstanceId);
    }

    public void setCaseInstanceId(String value)
    {
        setProperty(ATTR_CaseInstanceId, value, 0);
    }

    public String getTaskInstanceID()
    {
        return getStringProperty(ATTR_TaskInstanceID);
    }

    public void setTaskInstanceID(String value)
    {
        setProperty(ATTR_TaskInstanceID, value, 0);
    }

    public String getCaseAssignee()
    {
        return getStringProperty(ATTR_CaseAssignee);
    }

    public void setCaseAssignee(String value)
    {
        setProperty(ATTR_CaseAssignee, value, 0);
    }

    public String getStatus()
    {
        return getStringProperty(ATTR_Status);
    }

    public void setStatus(String value)
    {
        setProperty(ATTR_Status, value, 0);
    }


    public static BusObjectIterator<com.worksitewsapppackage.WKSEnrollmentCaseAssignment> getNextWKSEnrollmentCaseAssignmentObjects(int ID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"WKSEnrollmentCaseAssignment\" where (\"ID\" > :ID) order by \"ID\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("ID", "WKSEnrollmentCaseAssignment.ID", QueryObject.PARAM_INT, new Integer(ID));//NOPMD
        query.setResultClass(WKSEnrollmentCaseAssignment.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.worksitewsapppackage.WKSEnrollmentCaseAssignment> getPreviousWKSEnrollmentCaseAssignmentObjects(int ID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"WKSEnrollmentCaseAssignment\" where (\"ID\" < :ID) order by \"ID\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("ID", "WKSEnrollmentCaseAssignment.ID", QueryObject.PARAM_INT, new Integer(ID));//NOPMD
        query.setResultClass(WKSEnrollmentCaseAssignment.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static com.worksitewsapppackage.WKSEnrollmentCaseAssignment getWKSEnrollmentCaseAssignmentObject(int ID)
    {
        String queryText = "select * from \"WKSEnrollmentCaseAssignment\" where \"ID\" = :ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("ID", "WKSEnrollmentCaseAssignment.ID", QueryObject.PARAM_INT, new Integer(ID));//NOPMD
        query.setResultClass(WKSEnrollmentCaseAssignment.class);
        return (WKSEnrollmentCaseAssignment)query.getObject();
    }

    public static BusObjectIterator<com.worksitewsapppackage.WKSEnrollmentCaseAssignment> getWKSEnrollmentCaseAssignmentObjects(int fromID, int toID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"WKSEnrollmentCaseAssignment\" where \"ID\" between :fromID and :toID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromID", "WKSEnrollmentCaseAssignment.ID", QueryObject.PARAM_INT, new Integer(fromID));
        query.addParameter("toID", "WKSEnrollmentCaseAssignment.ID", QueryObject.PARAM_INT, new Integer(toID));
        query.setResultClass(WKSEnrollmentCaseAssignment.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.worksitewsapppackage.WKSEnrollmentCaseAssignment> getWKSEnrollmentCaseAssignmentObjects(int fromID, int toID)
    {
        String queryText = "select * from \"WKSEnrollmentCaseAssignment\" where \"ID\" between :fromID and :toID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromID", "WKSEnrollmentCaseAssignment.ID", QueryObject.PARAM_INT, new Integer(fromID));
        query.addParameter("toID", "WKSEnrollmentCaseAssignment.ID", QueryObject.PARAM_INT, new Integer(toID));
        query.setResultClass(WKSEnrollmentCaseAssignment.class);
        return query.getObjects();
    }

}