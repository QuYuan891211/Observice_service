package com.nmefc.observe_service.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuoyDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuoyDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andQueryTimeIsNull() {
            addCriterion("query_time is null");
            return (Criteria) this;
        }

        public Criteria andQueryTimeIsNotNull() {
            addCriterion("query_time is not null");
            return (Criteria) this;
        }

        public Criteria andQueryTimeEqualTo(Date value) {
            addCriterion("query_time =", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotEqualTo(Date value) {
            addCriterion("query_time <>", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeGreaterThan(Date value) {
            addCriterion("query_time >", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("query_time >=", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeLessThan(Date value) {
            addCriterion("query_time <", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeLessThanOrEqualTo(Date value) {
            addCriterion("query_time <=", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeIn(List<Date> values) {
            addCriterion("query_time in", values, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotIn(List<Date> values) {
            addCriterion("query_time not in", values, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeBetween(Date value1, Date value2) {
            addCriterion("query_time between", value1, value2, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotBetween(Date value1, Date value2) {
            addCriterion("query_time not between", value1, value2, "queryTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNull() {
            addCriterion("record_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNotNull() {
            addCriterion("record_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeEqualTo(String value) {
            addCriterion("record_time =", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotEqualTo(String value) {
            addCriterion("record_time <>", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThan(String value) {
            addCriterion("record_time >", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThanOrEqualTo(String value) {
            addCriterion("record_time >=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThan(String value) {
            addCriterion("record_time <", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThanOrEqualTo(String value) {
            addCriterion("record_time <=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLike(String value) {
            addCriterion("record_time like", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotLike(String value) {
            addCriterion("record_time not like", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIn(List<String> values) {
            addCriterion("record_time in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotIn(List<String> values) {
            addCriterion("record_time not in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeBetween(String value1, String value2) {
            addCriterion("record_time between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotBetween(String value1, String value2) {
            addCriterion("record_time not between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("site like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("site not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNull() {
            addCriterion("modified is null");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("modified is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedEqualTo(Date value) {
            addCriterion("modified =", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotEqualTo(Date value) {
            addCriterion("modified <>", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThan(Date value) {
            addCriterion("modified >", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("modified >=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThan(Date value) {
            addCriterion("modified <", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThanOrEqualTo(Date value) {
            addCriterion("modified <=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedIn(List<Date> values) {
            addCriterion("modified in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotIn(List<Date> values) {
            addCriterion("modified not in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedBetween(Date value1, Date value2) {
            addCriterion("modified between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotBetween(Date value1, Date value2) {
            addCriterion("modified not between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andWsIsNull() {
            addCriterion("ws is null");
            return (Criteria) this;
        }

        public Criteria andWsIsNotNull() {
            addCriterion("ws is not null");
            return (Criteria) this;
        }

        public Criteria andWsEqualTo(BigDecimal value) {
            addCriterion("ws =", value, "ws");
            return (Criteria) this;
        }

        public Criteria andWsNotEqualTo(BigDecimal value) {
            addCriterion("ws <>", value, "ws");
            return (Criteria) this;
        }

        public Criteria andWsGreaterThan(BigDecimal value) {
            addCriterion("ws >", value, "ws");
            return (Criteria) this;
        }

        public Criteria andWsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ws >=", value, "ws");
            return (Criteria) this;
        }

        public Criteria andWsLessThan(BigDecimal value) {
            addCriterion("ws <", value, "ws");
            return (Criteria) this;
        }

        public Criteria andWsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ws <=", value, "ws");
            return (Criteria) this;
        }

        public Criteria andWsIn(List<BigDecimal> values) {
            addCriterion("ws in", values, "ws");
            return (Criteria) this;
        }

        public Criteria andWsNotIn(List<BigDecimal> values) {
            addCriterion("ws not in", values, "ws");
            return (Criteria) this;
        }

        public Criteria andWsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ws between", value1, value2, "ws");
            return (Criteria) this;
        }

        public Criteria andWsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ws not between", value1, value2, "ws");
            return (Criteria) this;
        }

        public Criteria andWdIsNull() {
            addCriterion("wd is null");
            return (Criteria) this;
        }

        public Criteria andWdIsNotNull() {
            addCriterion("wd is not null");
            return (Criteria) this;
        }

        public Criteria andWdEqualTo(BigDecimal value) {
            addCriterion("wd =", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotEqualTo(BigDecimal value) {
            addCriterion("wd <>", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdGreaterThan(BigDecimal value) {
            addCriterion("wd >", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wd >=", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLessThan(BigDecimal value) {
            addCriterion("wd <", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wd <=", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdIn(List<BigDecimal> values) {
            addCriterion("wd in", values, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotIn(List<BigDecimal> values) {
            addCriterion("wd not in", values, "wd");
            return (Criteria) this;
        }

        public Criteria andWdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wd between", value1, value2, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wd not between", value1, value2, "wd");
            return (Criteria) this;
        }

        public Criteria andWsmIsNull() {
            addCriterion("wsm is null");
            return (Criteria) this;
        }

        public Criteria andWsmIsNotNull() {
            addCriterion("wsm is not null");
            return (Criteria) this;
        }

        public Criteria andWsmEqualTo(BigDecimal value) {
            addCriterion("wsm =", value, "wsm");
            return (Criteria) this;
        }

        public Criteria andWsmNotEqualTo(BigDecimal value) {
            addCriterion("wsm <>", value, "wsm");
            return (Criteria) this;
        }

        public Criteria andWsmGreaterThan(BigDecimal value) {
            addCriterion("wsm >", value, "wsm");
            return (Criteria) this;
        }

        public Criteria andWsmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wsm >=", value, "wsm");
            return (Criteria) this;
        }

        public Criteria andWsmLessThan(BigDecimal value) {
            addCriterion("wsm <", value, "wsm");
            return (Criteria) this;
        }

        public Criteria andWsmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wsm <=", value, "wsm");
            return (Criteria) this;
        }

        public Criteria andWsmIn(List<BigDecimal> values) {
            addCriterion("wsm in", values, "wsm");
            return (Criteria) this;
        }

        public Criteria andWsmNotIn(List<BigDecimal> values) {
            addCriterion("wsm not in", values, "wsm");
            return (Criteria) this;
        }

        public Criteria andWsmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wsm between", value1, value2, "wsm");
            return (Criteria) this;
        }

        public Criteria andWsmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wsm not between", value1, value2, "wsm");
            return (Criteria) this;
        }

        public Criteria andAttIsNull() {
            addCriterion("att is null");
            return (Criteria) this;
        }

        public Criteria andAttIsNotNull() {
            addCriterion("att is not null");
            return (Criteria) this;
        }

        public Criteria andAttEqualTo(BigDecimal value) {
            addCriterion("att =", value, "att");
            return (Criteria) this;
        }

        public Criteria andAttNotEqualTo(BigDecimal value) {
            addCriterion("att <>", value, "att");
            return (Criteria) this;
        }

        public Criteria andAttGreaterThan(BigDecimal value) {
            addCriterion("att >", value, "att");
            return (Criteria) this;
        }

        public Criteria andAttGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("att >=", value, "att");
            return (Criteria) this;
        }

        public Criteria andAttLessThan(BigDecimal value) {
            addCriterion("att <", value, "att");
            return (Criteria) this;
        }

        public Criteria andAttLessThanOrEqualTo(BigDecimal value) {
            addCriterion("att <=", value, "att");
            return (Criteria) this;
        }

        public Criteria andAttIn(List<BigDecimal> values) {
            addCriterion("att in", values, "att");
            return (Criteria) this;
        }

        public Criteria andAttNotIn(List<BigDecimal> values) {
            addCriterion("att not in", values, "att");
            return (Criteria) this;
        }

        public Criteria andAttBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("att between", value1, value2, "att");
            return (Criteria) this;
        }

        public Criteria andAttNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("att not between", value1, value2, "att");
            return (Criteria) this;
        }

        public Criteria andBpIsNull() {
            addCriterion("bp is null");
            return (Criteria) this;
        }

        public Criteria andBpIsNotNull() {
            addCriterion("bp is not null");
            return (Criteria) this;
        }

        public Criteria andBpEqualTo(BigDecimal value) {
            addCriterion("bp =", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpNotEqualTo(BigDecimal value) {
            addCriterion("bp <>", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpGreaterThan(BigDecimal value) {
            addCriterion("bp >", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bp >=", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpLessThan(BigDecimal value) {
            addCriterion("bp <", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bp <=", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpIn(List<BigDecimal> values) {
            addCriterion("bp in", values, "bp");
            return (Criteria) this;
        }

        public Criteria andBpNotIn(List<BigDecimal> values) {
            addCriterion("bp not in", values, "bp");
            return (Criteria) this;
        }

        public Criteria andBpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bp between", value1, value2, "bp");
            return (Criteria) this;
        }

        public Criteria andBpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bp not between", value1, value2, "bp");
            return (Criteria) this;
        }

        public Criteria andHuIsNull() {
            addCriterion("hu is null");
            return (Criteria) this;
        }

        public Criteria andHuIsNotNull() {
            addCriterion("hu is not null");
            return (Criteria) this;
        }

        public Criteria andHuEqualTo(BigDecimal value) {
            addCriterion("hu =", value, "hu");
            return (Criteria) this;
        }

        public Criteria andHuNotEqualTo(BigDecimal value) {
            addCriterion("hu <>", value, "hu");
            return (Criteria) this;
        }

        public Criteria andHuGreaterThan(BigDecimal value) {
            addCriterion("hu >", value, "hu");
            return (Criteria) this;
        }

        public Criteria andHuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hu >=", value, "hu");
            return (Criteria) this;
        }

        public Criteria andHuLessThan(BigDecimal value) {
            addCriterion("hu <", value, "hu");
            return (Criteria) this;
        }

        public Criteria andHuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hu <=", value, "hu");
            return (Criteria) this;
        }

        public Criteria andHuIn(List<BigDecimal> values) {
            addCriterion("hu in", values, "hu");
            return (Criteria) this;
        }

        public Criteria andHuNotIn(List<BigDecimal> values) {
            addCriterion("hu not in", values, "hu");
            return (Criteria) this;
        }

        public Criteria andHuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hu between", value1, value2, "hu");
            return (Criteria) this;
        }

        public Criteria andHuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hu not between", value1, value2, "hu");
            return (Criteria) this;
        }

        public Criteria andWtIsNull() {
            addCriterion("wt is null");
            return (Criteria) this;
        }

        public Criteria andWtIsNotNull() {
            addCriterion("wt is not null");
            return (Criteria) this;
        }

        public Criteria andWtEqualTo(BigDecimal value) {
            addCriterion("wt =", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtNotEqualTo(BigDecimal value) {
            addCriterion("wt <>", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtGreaterThan(BigDecimal value) {
            addCriterion("wt >", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wt >=", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtLessThan(BigDecimal value) {
            addCriterion("wt <", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wt <=", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtIn(List<BigDecimal> values) {
            addCriterion("wt in", values, "wt");
            return (Criteria) this;
        }

        public Criteria andWtNotIn(List<BigDecimal> values) {
            addCriterion("wt not in", values, "wt");
            return (Criteria) this;
        }

        public Criteria andWtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wt between", value1, value2, "wt");
            return (Criteria) this;
        }

        public Criteria andWtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wt not between", value1, value2, "wt");
            return (Criteria) this;
        }

        public Criteria andSlIsNull() {
            addCriterion("sl is null");
            return (Criteria) this;
        }

        public Criteria andSlIsNotNull() {
            addCriterion("sl is not null");
            return (Criteria) this;
        }

        public Criteria andSlEqualTo(BigDecimal value) {
            addCriterion("sl =", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotEqualTo(BigDecimal value) {
            addCriterion("sl <>", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThan(BigDecimal value) {
            addCriterion("sl >", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sl >=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThan(BigDecimal value) {
            addCriterion("sl <", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sl <=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlIn(List<BigDecimal> values) {
            addCriterion("sl in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotIn(List<BigDecimal> values) {
            addCriterion("sl not in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sl between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sl not between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andBgIsNull() {
            addCriterion("bg is null");
            return (Criteria) this;
        }

        public Criteria andBgIsNotNull() {
            addCriterion("bg is not null");
            return (Criteria) this;
        }

        public Criteria andBgEqualTo(BigDecimal value) {
            addCriterion("bg =", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgNotEqualTo(BigDecimal value) {
            addCriterion("bg <>", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgGreaterThan(BigDecimal value) {
            addCriterion("bg >", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bg >=", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgLessThan(BigDecimal value) {
            addCriterion("bg <", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bg <=", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgIn(List<BigDecimal> values) {
            addCriterion("bg in", values, "bg");
            return (Criteria) this;
        }

        public Criteria andBgNotIn(List<BigDecimal> values) {
            addCriterion("bg not in", values, "bg");
            return (Criteria) this;
        }

        public Criteria andBgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bg between", value1, value2, "bg");
            return (Criteria) this;
        }

        public Criteria andBgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bg not between", value1, value2, "bg");
            return (Criteria) this;
        }

        public Criteria andBxIsNull() {
            addCriterion("bx is null");
            return (Criteria) this;
        }

        public Criteria andBxIsNotNull() {
            addCriterion("bx is not null");
            return (Criteria) this;
        }

        public Criteria andBxEqualTo(BigDecimal value) {
            addCriterion("bx =", value, "bx");
            return (Criteria) this;
        }

        public Criteria andBxNotEqualTo(BigDecimal value) {
            addCriterion("bx <>", value, "bx");
            return (Criteria) this;
        }

        public Criteria andBxGreaterThan(BigDecimal value) {
            addCriterion("bx >", value, "bx");
            return (Criteria) this;
        }

        public Criteria andBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bx >=", value, "bx");
            return (Criteria) this;
        }

        public Criteria andBxLessThan(BigDecimal value) {
            addCriterion("bx <", value, "bx");
            return (Criteria) this;
        }

        public Criteria andBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bx <=", value, "bx");
            return (Criteria) this;
        }

        public Criteria andBxIn(List<BigDecimal> values) {
            addCriterion("bx in", values, "bx");
            return (Criteria) this;
        }

        public Criteria andBxNotIn(List<BigDecimal> values) {
            addCriterion("bx not in", values, "bx");
            return (Criteria) this;
        }

        public Criteria andBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bx between", value1, value2, "bx");
            return (Criteria) this;
        }

        public Criteria andBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bx not between", value1, value2, "bx");
            return (Criteria) this;
        }

        public Criteria andZqIsNull() {
            addCriterion("zq is null");
            return (Criteria) this;
        }

        public Criteria andZqIsNotNull() {
            addCriterion("zq is not null");
            return (Criteria) this;
        }

        public Criteria andZqEqualTo(BigDecimal value) {
            addCriterion("zq =", value, "zq");
            return (Criteria) this;
        }

        public Criteria andZqNotEqualTo(BigDecimal value) {
            addCriterion("zq <>", value, "zq");
            return (Criteria) this;
        }

        public Criteria andZqGreaterThan(BigDecimal value) {
            addCriterion("zq >", value, "zq");
            return (Criteria) this;
        }

        public Criteria andZqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zq >=", value, "zq");
            return (Criteria) this;
        }

        public Criteria andZqLessThan(BigDecimal value) {
            addCriterion("zq <", value, "zq");
            return (Criteria) this;
        }

        public Criteria andZqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zq <=", value, "zq");
            return (Criteria) this;
        }

        public Criteria andZqIn(List<BigDecimal> values) {
            addCriterion("zq in", values, "zq");
            return (Criteria) this;
        }

        public Criteria andZqNotIn(List<BigDecimal> values) {
            addCriterion("zq not in", values, "zq");
            return (Criteria) this;
        }

        public Criteria andZqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zq between", value1, value2, "zq");
            return (Criteria) this;
        }

        public Criteria andZqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zq not between", value1, value2, "zq");
            return (Criteria) this;
        }

        public Criteria andYbgIsNull() {
            addCriterion("ybg is null");
            return (Criteria) this;
        }

        public Criteria andYbgIsNotNull() {
            addCriterion("ybg is not null");
            return (Criteria) this;
        }

        public Criteria andYbgEqualTo(BigDecimal value) {
            addCriterion("ybg =", value, "ybg");
            return (Criteria) this;
        }

        public Criteria andYbgNotEqualTo(BigDecimal value) {
            addCriterion("ybg <>", value, "ybg");
            return (Criteria) this;
        }

        public Criteria andYbgGreaterThan(BigDecimal value) {
            addCriterion("ybg >", value, "ybg");
            return (Criteria) this;
        }

        public Criteria andYbgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ybg >=", value, "ybg");
            return (Criteria) this;
        }

        public Criteria andYbgLessThan(BigDecimal value) {
            addCriterion("ybg <", value, "ybg");
            return (Criteria) this;
        }

        public Criteria andYbgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ybg <=", value, "ybg");
            return (Criteria) this;
        }

        public Criteria andYbgIn(List<BigDecimal> values) {
            addCriterion("ybg in", values, "ybg");
            return (Criteria) this;
        }

        public Criteria andYbgNotIn(List<BigDecimal> values) {
            addCriterion("ybg not in", values, "ybg");
            return (Criteria) this;
        }

        public Criteria andYbgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ybg between", value1, value2, "ybg");
            return (Criteria) this;
        }

        public Criteria andYbgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ybg not between", value1, value2, "ybg");
            return (Criteria) this;
        }

        public Criteria andYzqIsNull() {
            addCriterion("yzq is null");
            return (Criteria) this;
        }

        public Criteria andYzqIsNotNull() {
            addCriterion("yzq is not null");
            return (Criteria) this;
        }

        public Criteria andYzqEqualTo(BigDecimal value) {
            addCriterion("yzq =", value, "yzq");
            return (Criteria) this;
        }

        public Criteria andYzqNotEqualTo(BigDecimal value) {
            addCriterion("yzq <>", value, "yzq");
            return (Criteria) this;
        }

        public Criteria andYzqGreaterThan(BigDecimal value) {
            addCriterion("yzq >", value, "yzq");
            return (Criteria) this;
        }

        public Criteria andYzqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yzq >=", value, "yzq");
            return (Criteria) this;
        }

        public Criteria andYzqLessThan(BigDecimal value) {
            addCriterion("yzq <", value, "yzq");
            return (Criteria) this;
        }

        public Criteria andYzqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yzq <=", value, "yzq");
            return (Criteria) this;
        }

        public Criteria andYzqIn(List<BigDecimal> values) {
            addCriterion("yzq in", values, "yzq");
            return (Criteria) this;
        }

        public Criteria andYzqNotIn(List<BigDecimal> values) {
            addCriterion("yzq not in", values, "yzq");
            return (Criteria) this;
        }

        public Criteria andYzqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yzq between", value1, value2, "yzq");
            return (Criteria) this;
        }

        public Criteria andYzqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yzq not between", value1, value2, "yzq");
            return (Criteria) this;
        }

        public Criteria andTenthbgIsNull() {
            addCriterion("tenthbg is null");
            return (Criteria) this;
        }

        public Criteria andTenthbgIsNotNull() {
            addCriterion("tenthbg is not null");
            return (Criteria) this;
        }

        public Criteria andTenthbgEqualTo(BigDecimal value) {
            addCriterion("tenthbg =", value, "tenthbg");
            return (Criteria) this;
        }

        public Criteria andTenthbgNotEqualTo(BigDecimal value) {
            addCriterion("tenthbg <>", value, "tenthbg");
            return (Criteria) this;
        }

        public Criteria andTenthbgGreaterThan(BigDecimal value) {
            addCriterion("tenthbg >", value, "tenthbg");
            return (Criteria) this;
        }

        public Criteria andTenthbgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tenthbg >=", value, "tenthbg");
            return (Criteria) this;
        }

        public Criteria andTenthbgLessThan(BigDecimal value) {
            addCriterion("tenthbg <", value, "tenthbg");
            return (Criteria) this;
        }

        public Criteria andTenthbgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tenthbg <=", value, "tenthbg");
            return (Criteria) this;
        }

        public Criteria andTenthbgIn(List<BigDecimal> values) {
            addCriterion("tenthbg in", values, "tenthbg");
            return (Criteria) this;
        }

        public Criteria andTenthbgNotIn(List<BigDecimal> values) {
            addCriterion("tenthbg not in", values, "tenthbg");
            return (Criteria) this;
        }

        public Criteria andTenthbgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tenthbg between", value1, value2, "tenthbg");
            return (Criteria) this;
        }

        public Criteria andTenthbgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tenthbg not between", value1, value2, "tenthbg");
            return (Criteria) this;
        }

        public Criteria andTenthzqIsNull() {
            addCriterion("tenthzq is null");
            return (Criteria) this;
        }

        public Criteria andTenthzqIsNotNull() {
            addCriterion("tenthzq is not null");
            return (Criteria) this;
        }

        public Criteria andTenthzqEqualTo(BigDecimal value) {
            addCriterion("tenthzq =", value, "tenthzq");
            return (Criteria) this;
        }

        public Criteria andTenthzqNotEqualTo(BigDecimal value) {
            addCriterion("tenthzq <>", value, "tenthzq");
            return (Criteria) this;
        }

        public Criteria andTenthzqGreaterThan(BigDecimal value) {
            addCriterion("tenthzq >", value, "tenthzq");
            return (Criteria) this;
        }

        public Criteria andTenthzqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tenthzq >=", value, "tenthzq");
            return (Criteria) this;
        }

        public Criteria andTenthzqLessThan(BigDecimal value) {
            addCriterion("tenthzq <", value, "tenthzq");
            return (Criteria) this;
        }

        public Criteria andTenthzqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tenthzq <=", value, "tenthzq");
            return (Criteria) this;
        }

        public Criteria andTenthzqIn(List<BigDecimal> values) {
            addCriterion("tenthzq in", values, "tenthzq");
            return (Criteria) this;
        }

        public Criteria andTenthzqNotIn(List<BigDecimal> values) {
            addCriterion("tenthzq not in", values, "tenthzq");
            return (Criteria) this;
        }

        public Criteria andTenthzqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tenthzq between", value1, value2, "tenthzq");
            return (Criteria) this;
        }

        public Criteria andTenthzqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tenthzq not between", value1, value2, "tenthzq");
            return (Criteria) this;
        }

        public Criteria andZbgIsNull() {
            addCriterion("zbg is null");
            return (Criteria) this;
        }

        public Criteria andZbgIsNotNull() {
            addCriterion("zbg is not null");
            return (Criteria) this;
        }

        public Criteria andZbgEqualTo(BigDecimal value) {
            addCriterion("zbg =", value, "zbg");
            return (Criteria) this;
        }

        public Criteria andZbgNotEqualTo(BigDecimal value) {
            addCriterion("zbg <>", value, "zbg");
            return (Criteria) this;
        }

        public Criteria andZbgGreaterThan(BigDecimal value) {
            addCriterion("zbg >", value, "zbg");
            return (Criteria) this;
        }

        public Criteria andZbgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zbg >=", value, "zbg");
            return (Criteria) this;
        }

        public Criteria andZbgLessThan(BigDecimal value) {
            addCriterion("zbg <", value, "zbg");
            return (Criteria) this;
        }

        public Criteria andZbgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zbg <=", value, "zbg");
            return (Criteria) this;
        }

        public Criteria andZbgIn(List<BigDecimal> values) {
            addCriterion("zbg in", values, "zbg");
            return (Criteria) this;
        }

        public Criteria andZbgNotIn(List<BigDecimal> values) {
            addCriterion("zbg not in", values, "zbg");
            return (Criteria) this;
        }

        public Criteria andZbgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zbg between", value1, value2, "zbg");
            return (Criteria) this;
        }

        public Criteria andZbgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zbg not between", value1, value2, "zbg");
            return (Criteria) this;
        }

        public Criteria andZzqIsNull() {
            addCriterion("zzq is null");
            return (Criteria) this;
        }

        public Criteria andZzqIsNotNull() {
            addCriterion("zzq is not null");
            return (Criteria) this;
        }

        public Criteria andZzqEqualTo(BigDecimal value) {
            addCriterion("zzq =", value, "zzq");
            return (Criteria) this;
        }

        public Criteria andZzqNotEqualTo(BigDecimal value) {
            addCriterion("zzq <>", value, "zzq");
            return (Criteria) this;
        }

        public Criteria andZzqGreaterThan(BigDecimal value) {
            addCriterion("zzq >", value, "zzq");
            return (Criteria) this;
        }

        public Criteria andZzqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zzq >=", value, "zzq");
            return (Criteria) this;
        }

        public Criteria andZzqLessThan(BigDecimal value) {
            addCriterion("zzq <", value, "zzq");
            return (Criteria) this;
        }

        public Criteria andZzqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zzq <=", value, "zzq");
            return (Criteria) this;
        }

        public Criteria andZzqIn(List<BigDecimal> values) {
            addCriterion("zzq in", values, "zzq");
            return (Criteria) this;
        }

        public Criteria andZzqNotIn(List<BigDecimal> values) {
            addCriterion("zzq not in", values, "zzq");
            return (Criteria) this;
        }

        public Criteria andZzqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zzq between", value1, value2, "zzq");
            return (Criteria) this;
        }

        public Criteria andZzqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zzq not between", value1, value2, "zzq");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}