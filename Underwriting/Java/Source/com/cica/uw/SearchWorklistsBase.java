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


public abstract class SearchWorklistsBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_Id = "Id";
    public final static String ATTR_Package = "Package";
    public final static String ATTR_WorkListName = "WorkListName";
    public final static String ATTR_WorkListDn = "WorkListDn";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(SearchWorklists.class);
            s_classInfo.setTableName("SearchWorklists");
            s_classInfo.setUIDElements(new String[]{ATTR_Id});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Id);
                ai.setJavaName(ATTR_Id);
                ai.setColumnName(ATTR_Id);
                ai.setAttributeClass(long.class);
                NumberValidator v = new NumberValidator(ATTR_Id);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Package);
                ai.setJavaName(ATTR_Package);
                ai.setColumnName(ATTR_Package);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Package);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_WorkListName);
                ai.setJavaName(ATTR_WorkListName);
                ai.setColumnName(ATTR_WorkListName);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_WorkListName);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_WorkListDn);
                ai.setJavaName(ATTR_WorkListDn);
                ai.setColumnName(ATTR_WorkListDn);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_WorkListDn);
                v.setMaxLength(500);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public SearchWorklistsBase(BusObjectConfig config)
    {
        super(config);
    }

    public long getId()
    {
        return getLongProperty(ATTR_Id);
    }

    public void setId(long value)
    {
        setProperty(ATTR_Id, value, 0);
    }

    public String getPackage()
    {
        return getStringProperty(ATTR_Package);
    }

    public void setPackage(String value)
    {
        setProperty(ATTR_Package, value, 0);
    }

    public String getWorkListName()
    {
        return getStringProperty(ATTR_WorkListName);
    }

    public void setWorkListName(String value)
    {
        setProperty(ATTR_WorkListName, value, 0);
    }

    public String getWorkListDn()
    {
        return getStringProperty(ATTR_WorkListDn);
    }

    public void setWorkListDn(String value)
    {
        setProperty(ATTR_WorkListDn, value, 0);
    }


    public static BusObjectIterator<com.cica.uw.SearchWorklists> getNextSearchWorklistsObjects(long Id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SearchWorklists\" where (\"Id\" > :Id) order by \"Id\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Id", "SearchWorklists.Id", QueryObject.PARAM_INT, new Long(Id));//NOPMD
        query.setResultClass(SearchWorklists.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.SearchWorklists> getPreviousSearchWorklistsObjects(long Id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SearchWorklists\" where (\"Id\" < :Id) order by \"Id\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Id", "SearchWorklists.Id", QueryObject.PARAM_INT, new Long(Id));//NOPMD
        query.setResultClass(SearchWorklists.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static com.cica.uw.SearchWorklists getSearchWorklistsObject(long Id)
    {
        String queryText = "select * from \"SearchWorklists\" where \"Id\" = :Id";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Id", "SearchWorklists.Id", QueryObject.PARAM_INT, new Long(Id));//NOPMD
        query.setResultClass(SearchWorklists.class);
        return (SearchWorklists)query.getObject();
    }

    public static BusObjectIterator<com.cica.uw.SearchWorklists> getSearchWorklistsObjects(long fromId, long toId, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SearchWorklists\" where \"Id\" between :fromId and :toId";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromId", "SearchWorklists.Id", QueryObject.PARAM_INT, new Long(fromId));
        query.addParameter("toId", "SearchWorklists.Id", QueryObject.PARAM_INT, new Long(toId));
        query.setResultClass(SearchWorklists.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.SearchWorklists> getSearchWorklistsObjects(long fromId, long toId)
    {
        String queryText = "select * from \"SearchWorklists\" where \"Id\" between :fromId and :toId";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromId", "SearchWorklists.Id", QueryObject.PARAM_INT, new Long(fromId));
        query.addParameter("toId", "SearchWorklists.Id", QueryObject.PARAM_INT, new Long(toId));
        query.setResultClass(SearchWorklists.class);
        return query.getObjects();
    }


}
