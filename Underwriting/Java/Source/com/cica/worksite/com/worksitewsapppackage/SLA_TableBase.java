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


public abstract class SLA_TableBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_SNO = "SNO";
    public final static String ATTR_CaseTitle = "CaseTitle";
    public final static String ATTR_SLA = "SLA";
    public final static String ATTR_Status = "Status";
    public final static String ATTR_EffectiveDate = "EffectiveDate";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(SLA_Table.class);
            s_classInfo.setTableName("SLA_Table");
            s_classInfo.setUIDElements(new String[]{ATTR_SNO});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_SNO);
                ai.setJavaName(ATTR_SNO);
                ai.setColumnName(ATTR_SNO);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_SNO);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseTitle);
                ai.setJavaName(ATTR_CaseTitle);
                ai.setColumnName(ATTR_CaseTitle);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CaseTitle);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_SLA);
                ai.setJavaName(ATTR_SLA);
                ai.setColumnName(ATTR_SLA);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_SLA);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Status);
                ai.setJavaName(ATTR_Status);
                ai.setColumnName(ATTR_Status);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Status);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_EffectiveDate);
                ai.setJavaName(ATTR_EffectiveDate);
                ai.setColumnName(ATTR_EffectiveDate);
                ai.setAttributeClass(java.sql.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public SLA_TableBase(BusObjectConfig config)
    {
        super(config);
    }

    public int getSNO()
    {
        return getIntProperty(ATTR_SNO);
    }

    public void setSNO(int value)
    {
        setProperty(ATTR_SNO, value, 0);
    }

    public String getCaseTitle()
    {
        return getStringProperty(ATTR_CaseTitle);
    }

    public void setCaseTitle(String value)
    {
        setProperty(ATTR_CaseTitle, value, 0);
    }

    public String getSLA()
    {
        return getStringProperty(ATTR_SLA);
    }

    public void setSLA(String value)
    {
        setProperty(ATTR_SLA, value, 0);
    }

    public String getStatus()
    {
        return getStringProperty(ATTR_Status);
    }

    public void setStatus(String value)
    {
        setProperty(ATTR_Status, value, 0);
    }

    public java.sql.Date getEffectiveDate()
    {
        return getSqlDateProperty(ATTR_EffectiveDate);
    }

    public void setEffectiveDate(java.sql.Date value)
    {
        setProperty(ATTR_EffectiveDate, value, 0);
    }

    public static BusObjectIterator<com.worksitewsapppackage.SLA_Table> getNextSLA_TableObjects(int SNO, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SLA_Table\" where (\"SNO\" > :SNO) order by \"SNO\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("SNO", "SLA_Table.SNO", QueryObject.PARAM_INT, new Integer(SNO));//NOPMD
        query.setResultClass(SLA_Table.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.worksitewsapppackage.SLA_Table> getPreviousSLA_TableObjects(int SNO, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SLA_Table\" where (\"SNO\" < :SNO) order by \"SNO\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("SNO", "SLA_Table.SNO", QueryObject.PARAM_INT, new Integer(SNO));//NOPMD
        query.setResultClass(SLA_Table.class);
        query.setCursor(cursor);
        return query.getObjects();
    }


    public static com.worksitewsapppackage.SLA_Table getSLA_TableObject(int SNO)
    {
        String queryText = "select * from \"SLA_Table\" where \"SNO\" = :SNO";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("SNO", "SLA_Table.SNO", QueryObject.PARAM_INT, new Integer(SNO));//NOPMD
        query.setResultClass(SLA_Table.class);
        return (SLA_Table)query.getObject();
    }

    public static BusObjectIterator<com.worksitewsapppackage.SLA_Table> getSLA_TableObjects(int fromSNO, int toSNO, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SLA_Table\" where \"SNO\" between :fromSNO and :toSNO";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromSNO", "SLA_Table.SNO", QueryObject.PARAM_INT, new Integer(fromSNO));
        query.addParameter("toSNO", "SLA_Table.SNO", QueryObject.PARAM_INT, new Integer(toSNO));
        query.setResultClass(SLA_Table.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.worksitewsapppackage.SLA_Table> getSLA_TableObjects(int fromSNO, int toSNO)
    {
        String queryText = "select * from \"SLA_Table\" where \"SNO\" between :fromSNO and :toSNO";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromSNO", "SLA_Table.SNO", QueryObject.PARAM_INT, new Integer(fromSNO));
        query.addParameter("toSNO", "SLA_Table.SNO", QueryObject.PARAM_INT, new Integer(toSNO));
        query.setResultClass(SLA_Table.class);
        return query.getObjects();
    }

}
