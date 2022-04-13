package xdu.backend.pojo;

import java.util.ArrayList;
import java.util.List;

public class BorrowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowExample() {
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

        public Criteria andBook_idIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBook_idIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBook_idEqualTo(String value) {
            addCriterion("book_id =", value, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idNotEqualTo(String value) {
            addCriterion("book_id <>", value, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idGreaterThan(String value) {
            addCriterion("book_id >", value, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idGreaterThanOrEqualTo(String value) {
            addCriterion("book_id >=", value, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idLessThan(String value) {
            addCriterion("book_id <", value, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idLessThanOrEqualTo(String value) {
            addCriterion("book_id <=", value, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idLike(String value) {
            addCriterion("book_id like", value, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idNotLike(String value) {
            addCriterion("book_id not like", value, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idIn(List<String> values) {
            addCriterion("book_id in", values, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idNotIn(List<String> values) {
            addCriterion("book_id not in", values, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idBetween(String value1, String value2) {
            addCriterion("book_id between", value1, value2, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idNotBetween(String value1, String value2) {
            addCriterion("book_id not between", value1, value2, "book_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(String value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(String value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(String value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(String value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLike(String value) {
            addCriterion("user_id like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotLike(String value) {
            addCriterion("user_id not like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<String> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<String> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andData_fromIsNull() {
            addCriterion("data_from is null");
            return (Criteria) this;
        }

        public Criteria andData_fromIsNotNull() {
            addCriterion("data_from is not null");
            return (Criteria) this;
        }

        public Criteria andData_fromEqualTo(Integer value) {
            addCriterion("data_from =", value, "data_from");
            return (Criteria) this;
        }

        public Criteria andData_fromNotEqualTo(Integer value) {
            addCriterion("data_from <>", value, "data_from");
            return (Criteria) this;
        }

        public Criteria andData_fromGreaterThan(Integer value) {
            addCriterion("data_from >", value, "data_from");
            return (Criteria) this;
        }

        public Criteria andData_fromGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_from >=", value, "data_from");
            return (Criteria) this;
        }

        public Criteria andData_fromLessThan(Integer value) {
            addCriterion("data_from <", value, "data_from");
            return (Criteria) this;
        }

        public Criteria andData_fromLessThanOrEqualTo(Integer value) {
            addCriterion("data_from <=", value, "data_from");
            return (Criteria) this;
        }

        public Criteria andData_fromIn(List<Integer> values) {
            addCriterion("data_from in", values, "data_from");
            return (Criteria) this;
        }

        public Criteria andData_fromNotIn(List<Integer> values) {
            addCriterion("data_from not in", values, "data_from");
            return (Criteria) this;
        }

        public Criteria andData_fromBetween(Integer value1, Integer value2) {
            addCriterion("data_from between", value1, value2, "data_from");
            return (Criteria) this;
        }

        public Criteria andData_fromNotBetween(Integer value1, Integer value2) {
            addCriterion("data_from not between", value1, value2, "data_from");
            return (Criteria) this;
        }

        public Criteria andData_toIsNull() {
            addCriterion("data_to is null");
            return (Criteria) this;
        }

        public Criteria andData_toIsNotNull() {
            addCriterion("data_to is not null");
            return (Criteria) this;
        }

        public Criteria andData_toEqualTo(Integer value) {
            addCriterion("data_to =", value, "data_to");
            return (Criteria) this;
        }

        public Criteria andData_toNotEqualTo(Integer value) {
            addCriterion("data_to <>", value, "data_to");
            return (Criteria) this;
        }

        public Criteria andData_toGreaterThan(Integer value) {
            addCriterion("data_to >", value, "data_to");
            return (Criteria) this;
        }

        public Criteria andData_toGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_to >=", value, "data_to");
            return (Criteria) this;
        }

        public Criteria andData_toLessThan(Integer value) {
            addCriterion("data_to <", value, "data_to");
            return (Criteria) this;
        }

        public Criteria andData_toLessThanOrEqualTo(Integer value) {
            addCriterion("data_to <=", value, "data_to");
            return (Criteria) this;
        }

        public Criteria andData_toIn(List<Integer> values) {
            addCriterion("data_to in", values, "data_to");
            return (Criteria) this;
        }

        public Criteria andData_toNotIn(List<Integer> values) {
            addCriterion("data_to not in", values, "data_to");
            return (Criteria) this;
        }

        public Criteria andData_toBetween(Integer value1, Integer value2) {
            addCriterion("data_to between", value1, value2, "data_to");
            return (Criteria) this;
        }

        public Criteria andData_toNotBetween(Integer value1, Integer value2) {
            addCriterion("data_to not between", value1, value2, "data_to");
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