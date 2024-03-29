/*
  This class has been generated by the Code Generator
*/

package com.cica.uw;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.classinfo.RelationInfo_FK;
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class tbl_underwritring_Prod_vs_ReqBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_id = "id";
    public final static String ATTR_prodname = "prodname";
    public final static String ATTR_req_Mst_id = "req_Mst_id";
    private final static String REL_Req_Mst_idObject = "FK:tbl_underwritring_Prod_vs_Req[req_Mst_id]:tbl_underwriting_reqMst[req_Mst_id]";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(tbl_underwritring_Prod_vs_Req.class);
            s_classInfo.setTableName("tbl_underwritring_Prod_vs_Req");
            s_classInfo.setUIDElements(new String[]{ATTR_id});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_id);
                ai.setJavaName(ATTR_id);
                ai.setColumnName(ATTR_id);
                ai.setAttributeClass(long.class);
                NumberValidator v = new NumberValidator(ATTR_id);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_prodname);
                ai.setJavaName(ATTR_prodname);
                ai.setColumnName(ATTR_prodname);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_prodname);
                v.setMaxLength(400);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_req_Mst_id);
                ai.setJavaName(ATTR_req_Mst_id);
                ai.setColumnName(ATTR_req_Mst_id);
                ai.setAttributeClass(long.class);
                NumberValidator v = new NumberValidator(ATTR_req_Mst_id);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                // relation Req_Mst_idObject (FK:tbl_underwritring_Prod_vs_Req[req_Mst_id]:tbl_underwriting_reqMst[req_Mst_id])
                RelationInfo_FK ri = new RelationInfo_FK(REL_Req_Mst_idObject);
                ri.setName("Req_Mst_idObject");
                ri.setLocalAttributes(new String[]{ATTR_req_Mst_id});
                ri.setLocalIsPK(false);
                ri.setRelatedClass(com.cica.uw.tbl_underwriting_reqMst.class);
                ri.setRelatedAttributes(new String[]{"req_Mst_id"});//NOPMD
                ri.setRelatedIdentifier("FK:tbl_underwriting_reqMst[req_Mst_id]:tbl_underwritring_Prod_vs_Req[req_Mst_id]");
                ri.setLoadMethod("loadReq_Mst_idObject");
                s_classInfo.addRelationInfo(ri);
            }
        }
        return s_classInfo;
    }

    public tbl_underwritring_Prod_vs_ReqBase(BusObjectConfig config)
    {
        super(config);
    }

    public long getId()
    {
        return getLongProperty(ATTR_id);
    }

    public void setId(long value)
    {
        setProperty(ATTR_id, value, 0);
    }

    public String getProdname()
    {
        return getStringProperty(ATTR_prodname);
    }

    public void setProdname(String value)
    {
        setProperty(ATTR_prodname, value, 0);
    }

    public long getReq_Mst_id()
    {
        return getLongProperty(ATTR_req_Mst_id);
    }

    public void setReq_Mst_id(long value)
    {
        String[] relations = new String[]{REL_Req_Mst_idObject};
        this.updateSingleRelations(relations, false);
        setProperty(ATTR_req_Mst_id, value, 0);
        this.updateSingleRelations(relations, true);
    }

    public tbl_underwriting_reqMst getReq_Mst_idObject()
    {
        return (tbl_underwriting_reqMst)getSingleRelationObject(REL_Req_Mst_idObject);
    }
    public tbl_underwriting_reqMst loadReq_Mst_idObject()
    {
        String queryText = "select * from \"tbl_underwriting_reqMst\" where \"req_Mst_id\" = :req_Mst_id";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("req_Mst_id", "tbl_underwriting_reqMst.req_Mst_id", QueryObject.PARAM_INT, new Long(getReq_Mst_id()));//NOPMD
        query.setResultClass(tbl_underwriting_reqMst.class);
        return (tbl_underwriting_reqMst)query.getObject();
    }


    public void setReq_Mst_idObject(tbl_underwriting_reqMst a_tbl_underwriting_reqMst)
    {
        if (a_tbl_underwriting_reqMst == null)
        {
            this.setNull("req_Mst_id");
        }
        else
        {
            this.setReq_Mst_id(a_tbl_underwriting_reqMst.getReq_Mst_id());
        }
    }

    public void setNull(String element)
    {
        super.setNull(element);
        if (ATTR_req_Mst_id.equals(element))
        {
            this.updateSingleRelation(REL_Req_Mst_idObject, false);
        }
    }
    public static BusObjectIterator<com.cica.uw.tbl_underwritring_Prod_vs_Req> getNextTbl_underwritring_Prod_vs_ReqObjects(long Id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_underwritring_Prod_vs_Req\" where (\"id\" > :Id) order by \"id\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Id", "tbl_underwritring_Prod_vs_Req.id", QueryObject.PARAM_INT, new Long(Id));//NOPMD
        query.setResultClass(tbl_underwritring_Prod_vs_Req.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwritring_Prod_vs_Req> getPreviousTbl_underwritring_Prod_vs_ReqObjects(long Id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_underwritring_Prod_vs_Req\" where (\"id\" < :Id) order by \"id\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Id", "tbl_underwritring_Prod_vs_Req.id", QueryObject.PARAM_INT, new Long(Id));//NOPMD
        query.setResultClass(tbl_underwritring_Prod_vs_Req.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static com.cica.uw.tbl_underwritring_Prod_vs_Req getTbl_underwritring_Prod_vs_ReqObject(long Id)
    {
        String queryText = "select * from \"tbl_underwritring_Prod_vs_Req\" where \"id\" = :Id";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Id", "tbl_underwritring_Prod_vs_Req.id", QueryObject.PARAM_INT, new Long(Id));//NOPMD
        query.setResultClass(tbl_underwritring_Prod_vs_Req.class);
        return (tbl_underwritring_Prod_vs_Req)query.getObject();
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwritring_Prod_vs_Req> getTbl_underwritring_Prod_vs_ReqObjects(long fromId, long toId, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_underwritring_Prod_vs_Req\" where \"id\" between :fromId and :toId";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromId", "tbl_underwritring_Prod_vs_Req.id", QueryObject.PARAM_INT, new Long(fromId));
        query.addParameter("toId", "tbl_underwritring_Prod_vs_Req.id", QueryObject.PARAM_INT, new Long(toId));
        query.setResultClass(tbl_underwritring_Prod_vs_Req.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwritring_Prod_vs_Req> getTbl_underwritring_Prod_vs_ReqObjects(long fromId, long toId)
    {
        String queryText = "select * from \"tbl_underwritring_Prod_vs_Req\" where \"id\" between :fromId and :toId";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromId", "tbl_underwritring_Prod_vs_Req.id", QueryObject.PARAM_INT, new Long(fromId));
        query.addParameter("toId", "tbl_underwritring_Prod_vs_Req.id", QueryObject.PARAM_INT, new Long(toId));
        query.setResultClass(tbl_underwritring_Prod_vs_Req.class);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwritring_Prod_vs_Req> getTbl_underwritring_Prod_vs_ReqObjectsForreq_Mst_id(long Req_Mst_id)
    {
        String queryText = "select * from \"tbl_underwritring_Prod_vs_Req\" where \"req_Mst_id\" = :Req_Mst_id";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Req_Mst_id", "tbl_underwritring_Prod_vs_Req.req_Mst_id", QueryObject.PARAM_INT, new Long(Req_Mst_id));//NOPMD
        query.setResultClass(tbl_underwritring_Prod_vs_Req.class);
        return query.getObjects();
    }



}
