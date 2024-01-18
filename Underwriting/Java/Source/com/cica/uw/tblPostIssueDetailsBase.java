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


public abstract class tblPostIssueDetailsBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_ID = "ID";
    public final static String ATTR_PolicyNumber = "PolicyNumber";
    public final static String ATTR_IssueState = "IssueState";
    public final static String ATTR_PersonId = "PersonId";
    public final static String ATTR_DateCreated = "DateCreated";
    public final static String ATTR_ReceiveDate = "ReceiveDate";
    public final static String ATTR_ProductDescription = "ProductDescription";
    public final static String ATTR_FullProductDescription = "FullProductDescription";
    public final static String ATTR_DecisionDate = "DecisionDate";
    public final static String ATTR_CloseOutDate = "CloseOutDate";
    public final static String ATTR_ActivityType = "ActivityType";
    public final static String ATTR_CaseId = "CaseId";
    public final static String ATTR_Source = "Source";
    public final static String ATTR_SourceId = "SourceId";
    public final static String ATTR_TaskStatus = "TaskStatus";
    public final static String ATTR_TaskComment = "TaskComment";
    public final static String ATTR_TaskDecision = "TaskDecision";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(tblPostIssueDetails.class);
            s_classInfo.setTableName("tblPostIssueDetails");
            s_classInfo.setUIDElements(new String[]{ATTR_ID});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ID);
                ai.setJavaName(ATTR_ID);
                ai.setColumnName(ATTR_ID);
                ai.setAttributeClass(long.class);
                NumberValidator v = new NumberValidator(ATTR_ID);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_PolicyNumber);
                ai.setJavaName(ATTR_PolicyNumber);
                ai.setColumnName(ATTR_PolicyNumber);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_PolicyNumber);
                v.setMaxLength(8);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_IssueState);
                ai.setJavaName(ATTR_IssueState);
                ai.setColumnName(ATTR_IssueState);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_IssueState);
                v.setMaxLength(2);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_PersonId);
                ai.setJavaName(ATTR_PersonId);
                ai.setColumnName(ATTR_PersonId);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_PersonId);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_DateCreated);
                ai.setJavaName(ATTR_DateCreated);
                ai.setColumnName(ATTR_DateCreated);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ReceiveDate);
                ai.setJavaName(ATTR_ReceiveDate);
                ai.setColumnName(ATTR_ReceiveDate);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ProductDescription);
                ai.setJavaName(ATTR_ProductDescription);
                ai.setColumnName(ATTR_ProductDescription);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ProductDescription);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_FullProductDescription);
                ai.setJavaName(ATTR_FullProductDescription);
                ai.setColumnName(ATTR_FullProductDescription);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_FullProductDescription);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_DecisionDate);
                ai.setJavaName(ATTR_DecisionDate);
                ai.setColumnName(ATTR_DecisionDate);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CloseOutDate);
                ai.setJavaName(ATTR_CloseOutDate);
                ai.setColumnName(ATTR_CloseOutDate);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ActivityType);
                ai.setJavaName(ATTR_ActivityType);
                ai.setColumnName(ATTR_ActivityType);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ActivityType);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseId);
                ai.setJavaName(ATTR_CaseId);
                ai.setColumnName(ATTR_CaseId);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CaseId);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Source);
                ai.setJavaName(ATTR_Source);
                ai.setColumnName(ATTR_Source);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Source);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_SourceId);
                ai.setJavaName(ATTR_SourceId);
                ai.setColumnName(ATTR_SourceId);
                ai.setAttributeClass(long.class);
                NumberValidator v = new NumberValidator(ATTR_SourceId);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_TaskStatus);
                ai.setJavaName(ATTR_TaskStatus);
                ai.setColumnName(ATTR_TaskStatus);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_TaskStatus);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_TaskComment);
                ai.setJavaName(ATTR_TaskComment);
                ai.setColumnName(ATTR_TaskComment);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_TaskComment);
                v.setMaxLength(3000);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_TaskDecision);
                ai.setJavaName(ATTR_TaskDecision);
                ai.setColumnName(ATTR_TaskDecision);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_TaskDecision);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public tblPostIssueDetailsBase(BusObjectConfig config)
    {
        super(config);
    }

    public long getID()
    {
        return getLongProperty(ATTR_ID);
    }

    public void setID(long value)
    {
        setProperty(ATTR_ID, value, 0);
    }

    public String getPolicyNumber()
    {
        return getStringProperty(ATTR_PolicyNumber);
    }

    public void setPolicyNumber(String value)
    {
        setProperty(ATTR_PolicyNumber, value, 0);
    }

    public String getIssueState()
    {
        return getStringProperty(ATTR_IssueState);
    }

    public void setIssueState(String value)
    {
        setProperty(ATTR_IssueState, value, 0);
    }

    public String getPersonId()
    {
        return getStringProperty(ATTR_PersonId);
    }

    public void setPersonId(String value)
    {
        setProperty(ATTR_PersonId, value, 0);
    }

    public java.util.Date getDateCreated()
    {
        return getDateTimestampProperty(ATTR_DateCreated);
    }

    public void setDateCreated(java.util.Date value)
    {
        setProperty(ATTR_DateCreated, value, 0);
    }

    public java.util.Date getReceiveDate()
    {
        return getDateTimestampProperty(ATTR_ReceiveDate);
    }

    public void setReceiveDate(java.util.Date value)
    {
        setProperty(ATTR_ReceiveDate, value, 0);
    }

    public String getProductDescription()
    {
        return getStringProperty(ATTR_ProductDescription);
    }

    public void setProductDescription(String value)
    {
        setProperty(ATTR_ProductDescription, value, 0);
    }

    public String getFullProductDescription()
    {
        return getStringProperty(ATTR_FullProductDescription);
    }

    public void setFullProductDescription(String value)
    {
        setProperty(ATTR_FullProductDescription, value, 0);
    }

    public java.util.Date getDecisionDate()
    {
        return getDateTimestampProperty(ATTR_DecisionDate);
    }

    public void setDecisionDate(java.util.Date value)
    {
        setProperty(ATTR_DecisionDate, value, 0);
    }

    public java.util.Date getCloseOutDate()
    {
        return getDateTimestampProperty(ATTR_CloseOutDate);
    }

    public void setCloseOutDate(java.util.Date value)
    {
        setProperty(ATTR_CloseOutDate, value, 0);
    }

    public String getActivityType()
    {
        return getStringProperty(ATTR_ActivityType);
    }

    public void setActivityType(String value)
    {
        setProperty(ATTR_ActivityType, value, 0);
    }

    public String getCaseId()
    {
        return getStringProperty(ATTR_CaseId);
    }

    public void setCaseId(String value)
    {
        setProperty(ATTR_CaseId, value, 0);
    }

    public String getSource()
    {
        return getStringProperty(ATTR_Source);
    }

    public void setSource(String value)
    {
        setProperty(ATTR_Source, value, 0);
    }

    public long getSourceId()
    {
        return getLongProperty(ATTR_SourceId);
    }

    public void setSourceId(long value)
    {
        setProperty(ATTR_SourceId, value, 0);
    }

    public String getTaskStatus()
    {
        return getStringProperty(ATTR_TaskStatus);
    }

    public void setTaskStatus(String value)
    {
        setProperty(ATTR_TaskStatus, value, 0);
    }

    public String getTaskComment()
    {
        return getStringProperty(ATTR_TaskComment);
    }

    public void setTaskComment(String value)
    {
        setProperty(ATTR_TaskComment, value, 0);
    }

    public String getTaskDecision()
    {
        return getStringProperty(ATTR_TaskDecision);
    }

    public void setTaskDecision(String value)
    {
        setProperty(ATTR_TaskDecision, value, 0);
    }




    public static BusObjectIterator<com.cica.uw.tblPostIssueDetails> getNextTblPostIssueDetailsObjects(long ID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tblPostIssueDetails\" where (\"ID\" > :ID) order by \"ID\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("ID", "tblPostIssueDetails.ID", QueryObject.PARAM_INT, new Long(ID));//NOPMD
        query.setResultClass(tblPostIssueDetails.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tblPostIssueDetails> getPreviousTblPostIssueDetailsObjects(long ID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tblPostIssueDetails\" where (\"ID\" < :ID) order by \"ID\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("ID", "tblPostIssueDetails.ID", QueryObject.PARAM_INT, new Long(ID));//NOPMD
        query.setResultClass(tblPostIssueDetails.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static com.cica.uw.tblPostIssueDetails getTblPostIssueDetailsObject(long ID)
    {
        String queryText = "select * from \"tblPostIssueDetails\" where \"ID\" = :ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("ID", "tblPostIssueDetails.ID", QueryObject.PARAM_INT, new Long(ID));//NOPMD
        query.setResultClass(tblPostIssueDetails.class);
        return (tblPostIssueDetails)query.getObject();
    }

    public static BusObjectIterator<com.cica.uw.tblPostIssueDetails> getTblPostIssueDetailsObjects(long fromID, long toID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tblPostIssueDetails\" where \"ID\" between :fromID and :toID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromID", "tblPostIssueDetails.ID", QueryObject.PARAM_INT, new Long(fromID));
        query.addParameter("toID", "tblPostIssueDetails.ID", QueryObject.PARAM_INT, new Long(toID));
        query.setResultClass(tblPostIssueDetails.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tblPostIssueDetails> getTblPostIssueDetailsObjects(long fromID, long toID)
    {
        String queryText = "select * from \"tblPostIssueDetails\" where \"ID\" between :fromID and :toID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromID", "tblPostIssueDetails.ID", QueryObject.PARAM_INT, new Long(fromID));
        query.addParameter("toID", "tblPostIssueDetails.ID", QueryObject.PARAM_INT, new Long(toID));
        query.setResultClass(tblPostIssueDetails.class);
        return query.getObjects();
    }

}
