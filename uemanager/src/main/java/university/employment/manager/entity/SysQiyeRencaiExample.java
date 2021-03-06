package university.employment.manager.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysQiyeRencaiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysQiyeRencaiExample() {
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

        public Criteria andRcidIsNull() {
            addCriterion("rcid is null");
            return (Criteria) this;
        }

        public Criteria andRcidIsNotNull() {
            addCriterion("rcid is not null");
            return (Criteria) this;
        }

        public Criteria andRcidEqualTo(Integer value) {
            addCriterion("rcid =", value, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidNotEqualTo(Integer value) {
            addCriterion("rcid <>", value, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidGreaterThan(Integer value) {
            addCriterion("rcid >", value, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rcid >=", value, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidLessThan(Integer value) {
            addCriterion("rcid <", value, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidLessThanOrEqualTo(Integer value) {
            addCriterion("rcid <=", value, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidIn(List<Integer> values) {
            addCriterion("rcid in", values, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidNotIn(List<Integer> values) {
            addCriterion("rcid not in", values, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidBetween(Integer value1, Integer value2) {
            addCriterion("rcid between", value1, value2, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidNotBetween(Integer value1, Integer value2) {
            addCriterion("rcid not between", value1, value2, "rcid");
            return (Criteria) this;
        }

        public Criteria andQyidIsNull() {
            addCriterion("qyid is null");
            return (Criteria) this;
        }

        public Criteria andQyidIsNotNull() {
            addCriterion("qyid is not null");
            return (Criteria) this;
        }

        public Criteria andQyidEqualTo(Integer value) {
            addCriterion("qyid =", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidNotEqualTo(Integer value) {
            addCriterion("qyid <>", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidGreaterThan(Integer value) {
            addCriterion("qyid >", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("qyid >=", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidLessThan(Integer value) {
            addCriterion("qyid <", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidLessThanOrEqualTo(Integer value) {
            addCriterion("qyid <=", value, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidIn(List<Integer> values) {
            addCriterion("qyid in", values, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidNotIn(List<Integer> values) {
            addCriterion("qyid not in", values, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidBetween(Integer value1, Integer value2) {
            addCriterion("qyid between", value1, value2, "qyid");
            return (Criteria) this;
        }

        public Criteria andQyidNotBetween(Integer value1, Integer value2) {
            addCriterion("qyid not between", value1, value2, "qyid");
            return (Criteria) this;
        }

        public Criteria andStuidIsNull() {
            addCriterion("stuid is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("stuid is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Integer value) {
            addCriterion("stuid =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Integer value) {
            addCriterion("stuid <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Integer value) {
            addCriterion("stuid >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuid >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Integer value) {
            addCriterion("stuid <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Integer value) {
            addCriterion("stuid <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Integer> values) {
            addCriterion("stuid in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Integer> values) {
            addCriterion("stuid not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Integer value1, Integer value2) {
            addCriterion("stuid between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Integer value1, Integer value2) {
            addCriterion("stuid not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andZpidIsNull() {
            addCriterion("zpid is null");
            return (Criteria) this;
        }

        public Criteria andZpidIsNotNull() {
            addCriterion("zpid is not null");
            return (Criteria) this;
        }

        public Criteria andZpidEqualTo(Integer value) {
            addCriterion("zpid =", value, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidNotEqualTo(Integer value) {
            addCriterion("zpid <>", value, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidGreaterThan(Integer value) {
            addCriterion("zpid >", value, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zpid >=", value, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidLessThan(Integer value) {
            addCriterion("zpid <", value, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidLessThanOrEqualTo(Integer value) {
            addCriterion("zpid <=", value, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidIn(List<Integer> values) {
            addCriterion("zpid in", values, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidNotIn(List<Integer> values) {
            addCriterion("zpid not in", values, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidBetween(Integer value1, Integer value2) {
            addCriterion("zpid between", value1, value2, "zpid");
            return (Criteria) this;
        }

        public Criteria andZpidNotBetween(Integer value1, Integer value2) {
            addCriterion("zpid not between", value1, value2, "zpid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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