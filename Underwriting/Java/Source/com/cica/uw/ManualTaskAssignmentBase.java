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


public abstract class ManualTaskAssignmentBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_Id = "Id";
    public final static String ATTR_TaskName = "TaskName";
    public final static String ATTR_TargetType = "TargetType";
    public final static String ATTR_DefaultAssignee = "DefaultAssignee";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(ManualTaskAssignment.class);
            s_classInfo.setTableName("ManualTaskAssignment");
            s_classInfo.setUIDElements(new String[]{ATTR_Id});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Id);
                ai.setJavaName(ATTR_Id);
                ai.setColumnName(ATTR_Id);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_Id);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_TaskName);
                ai.setJavaName(ATTR_TaskName);
                ai.setColumnName(ATTR_TaskName);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_TaskName);
                v.setMaxLength(150);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_TargetType);
                ai.setJavaName(ATTR_TargetType);
                ai.setColumnName(ATTR_TargetType);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_TargetType);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_DefaultAssignee);
                ai.setJavaName(ATTR_DefaultAssignee);
                ai.setColumnName(ATTR_DefaultAssignee);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_DefaultAssignee);
                v.setMaxLength(2147483647);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public ManualTaskAssignmentBase(BusObjectConfig config)
    {
        super(config);
    }

    public int getId()
    {
        return getIntProperty(ATTR_Id);
    }

    public void setId(int value)
    {
        setProperty(ATTR_Id, value, 0);
    }

    public String getTaskName()
    {
        return getStringProperty(ATTR_TaskName);
    }

    public void setTaskName(String value)
    {
        setProperty(ATTR_TaskName, value, 0);
    }

    public String getTargetType()
    {
        return getStringProperty(ATTR_TargetType);
    }

    public void setTargetType(String value)
    {
        setProperty(ATTR_TargetType, value, 0);
    }

    public String getDefaultAssignee()
    {
        return getStringProperty(ATTR_DefaultAssignee);
    }

    public void setDefaultAssignee(String value)
    {
        setProperty(ATTR_DefaultAssignee, value, 0);
    }

    public static com.cica.uw.ManualTaskAssignment getManualTaskAssignmentObject(int Id)
    {
        String queryText = "select * from \"ManualTaskAssignment\" where \"Id\" = :Id";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Id", "ManualTaskAssignment.Id", QueryObject.PARAM_INT, new Integer(Id));//NOPMD
        query.setResultClass(ManualTaskAssignment.class);
        return (ManualTaskAssignment)query.getObject();
    }

    public static BusObjectIterator<com.cica.uw.ManualTaskAssignment> getManualTaskAssignmentObjects(int fromId, int toId, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"ManualTaskAssignment\" where \"Id\" between :fromId and :toId";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromId", "ManualTaskAssignment.Id", QueryObject.PARAM_INT, new Integer(fromId));
        query.addParameter("toId", "ManualTaskAssignment.Id", QueryObject.PARAM_INT, new Integer(toId));
        query.setResultClass(ManualTaskAssignment.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.ManualTaskAssignment> getManualTaskAssignmentObjects(int fromId, int toId)
    {
        String queryText = "select * from \"ManualTaskAssignment\" where \"Id\" between :fromId and :toId";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromId", "ManualTaskAssignment.Id", QueryObject.PARAM_INT, new Integer(fromId));
        query.addParameter("toId", "ManualTaskAssignment.Id", QueryObject.PARAM_INT, new Integer(toId));
        query.setResultClass(ManualTaskAssignment.class);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.ManualTaskAssignment> getNextManualTaskAssignmentObjects(int Id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"ManualTaskAssignment\" where (\"Id\" > :Id) order by \"Id\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Id", "ManualTaskAssignment.Id", QueryObject.PARAM_INT, new Integer(Id));//NOPMD
        query.setResultClass(ManualTaskAssignment.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.ManualTaskAssignment> getPreviousManualTaskAssignmentObjects(int Id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"ManualTaskAssignment\" where (\"Id\" < :Id) order by \"Id\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Id", "ManualTaskAssignment.Id", QueryObject.PARAM_INT, new Integer(Id));//NOPMD
        query.setResultClass(ManualTaskAssignment.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

}