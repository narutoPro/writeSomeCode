package edu.whut.cs.chende.entity;

import java.util.ArrayList;
import java.util.List;

public class Zhou256Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Zhou256Example() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("groupId is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupId is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(String value) {
            addCriterion("groupId =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(String value) {
            addCriterion("groupId <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(String value) {
            addCriterion("groupId >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(String value) {
            addCriterion("groupId >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(String value) {
            addCriterion("groupId <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(String value) {
            addCriterion("groupId <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLike(String value) {
            addCriterion("groupId like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotLike(String value) {
            addCriterion("groupId not like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<String> values) {
            addCriterion("groupId in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<String> values) {
            addCriterion("groupId not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(String value1, String value2) {
            addCriterion("groupId between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(String value1, String value2) {
            addCriterion("groupId not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria and学号IsNull() {
            addCriterion("学号 is null");
            return (Criteria) this;
        }

        public Criteria and学号IsNotNull() {
            addCriterion("学号 is not null");
            return (Criteria) this;
        }

        public Criteria and学号EqualTo(String value) {
            addCriterion("学号 =", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号NotEqualTo(String value) {
            addCriterion("学号 <>", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号GreaterThan(String value) {
            addCriterion("学号 >", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号GreaterThanOrEqualTo(String value) {
            addCriterion("学号 >=", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号LessThan(String value) {
            addCriterion("学号 <", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号LessThanOrEqualTo(String value) {
            addCriterion("学号 <=", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号Like(String value) {
            addCriterion("学号 like", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号NotLike(String value) {
            addCriterion("学号 not like", value, "学号");
            return (Criteria) this;
        }

        public Criteria and学号In(List<String> values) {
            addCriterion("学号 in", values, "学号");
            return (Criteria) this;
        }

        public Criteria and学号NotIn(List<String> values) {
            addCriterion("学号 not in", values, "学号");
            return (Criteria) this;
        }

        public Criteria and学号Between(String value1, String value2) {
            addCriterion("学号 between", value1, value2, "学号");
            return (Criteria) this;
        }

        public Criteria and学号NotBetween(String value1, String value2) {
            addCriterion("学号 not between", value1, value2, "学号");
            return (Criteria) this;
        }

        public Criteria and姓名IsNull() {
            addCriterion("姓名 is null");
            return (Criteria) this;
        }

        public Criteria and姓名IsNotNull() {
            addCriterion("姓名 is not null");
            return (Criteria) this;
        }

        public Criteria and姓名EqualTo(String value) {
            addCriterion("姓名 =", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名NotEqualTo(String value) {
            addCriterion("姓名 <>", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名GreaterThan(String value) {
            addCriterion("姓名 >", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名GreaterThanOrEqualTo(String value) {
            addCriterion("姓名 >=", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名LessThan(String value) {
            addCriterion("姓名 <", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名LessThanOrEqualTo(String value) {
            addCriterion("姓名 <=", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名Like(String value) {
            addCriterion("姓名 like", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名NotLike(String value) {
            addCriterion("姓名 not like", value, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名In(List<String> values) {
            addCriterion("姓名 in", values, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名NotIn(List<String> values) {
            addCriterion("姓名 not in", values, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名Between(String value1, String value2) {
            addCriterion("姓名 between", value1, value2, "姓名");
            return (Criteria) this;
        }

        public Criteria and姓名NotBetween(String value1, String value2) {
            addCriterion("姓名 not between", value1, value2, "姓名");
            return (Criteria) this;
        }

        public Criteria and专业班级IsNull() {
            addCriterion("专业班级 is null");
            return (Criteria) this;
        }

        public Criteria and专业班级IsNotNull() {
            addCriterion("专业班级 is not null");
            return (Criteria) this;
        }

        public Criteria and专业班级EqualTo(String value) {
            addCriterion("专业班级 =", value, "专业班级");
            return (Criteria) this;
        }

        public Criteria and专业班级NotEqualTo(String value) {
            addCriterion("专业班级 <>", value, "专业班级");
            return (Criteria) this;
        }

        public Criteria and专业班级GreaterThan(String value) {
            addCriterion("专业班级 >", value, "专业班级");
            return (Criteria) this;
        }

        public Criteria and专业班级GreaterThanOrEqualTo(String value) {
            addCriterion("专业班级 >=", value, "专业班级");
            return (Criteria) this;
        }

        public Criteria and专业班级LessThan(String value) {
            addCriterion("专业班级 <", value, "专业班级");
            return (Criteria) this;
        }

        public Criteria and专业班级LessThanOrEqualTo(String value) {
            addCriterion("专业班级 <=", value, "专业班级");
            return (Criteria) this;
        }

        public Criteria and专业班级Like(String value) {
            addCriterion("专业班级 like", value, "专业班级");
            return (Criteria) this;
        }

        public Criteria and专业班级NotLike(String value) {
            addCriterion("专业班级 not like", value, "专业班级");
            return (Criteria) this;
        }

        public Criteria and专业班级In(List<String> values) {
            addCriterion("专业班级 in", values, "专业班级");
            return (Criteria) this;
        }

        public Criteria and专业班级NotIn(List<String> values) {
            addCriterion("专业班级 not in", values, "专业班级");
            return (Criteria) this;
        }

        public Criteria and专业班级Between(String value1, String value2) {
            addCriterion("专业班级 between", value1, value2, "专业班级");
            return (Criteria) this;
        }

        public Criteria and专业班级NotBetween(String value1, String value2) {
            addCriterion("专业班级 not between", value1, value2, "专业班级");
            return (Criteria) this;
        }

        public Criteria and课前心得1IsNull() {
            addCriterion("课前心得1 is null");
            return (Criteria) this;
        }

        public Criteria and课前心得1IsNotNull() {
            addCriterion("课前心得1 is not null");
            return (Criteria) this;
        }

        public Criteria and课前心得1EqualTo(String value) {
            addCriterion("课前心得1 =", value, "课前心得1");
            return (Criteria) this;
        }

        public Criteria and课前心得1NotEqualTo(String value) {
            addCriterion("课前心得1 <>", value, "课前心得1");
            return (Criteria) this;
        }

        public Criteria and课前心得1GreaterThan(String value) {
            addCriterion("课前心得1 >", value, "课前心得1");
            return (Criteria) this;
        }

        public Criteria and课前心得1GreaterThanOrEqualTo(String value) {
            addCriterion("课前心得1 >=", value, "课前心得1");
            return (Criteria) this;
        }

        public Criteria and课前心得1LessThan(String value) {
            addCriterion("课前心得1 <", value, "课前心得1");
            return (Criteria) this;
        }

        public Criteria and课前心得1LessThanOrEqualTo(String value) {
            addCriterion("课前心得1 <=", value, "课前心得1");
            return (Criteria) this;
        }

        public Criteria and课前心得1Like(String value) {
            addCriterion("课前心得1 like", value, "课前心得1");
            return (Criteria) this;
        }

        public Criteria and课前心得1NotLike(String value) {
            addCriterion("课前心得1 not like", value, "课前心得1");
            return (Criteria) this;
        }

        public Criteria and课前心得1In(List<String> values) {
            addCriterion("课前心得1 in", values, "课前心得1");
            return (Criteria) this;
        }

        public Criteria and课前心得1NotIn(List<String> values) {
            addCriterion("课前心得1 not in", values, "课前心得1");
            return (Criteria) this;
        }

        public Criteria and课前心得1Between(String value1, String value2) {
            addCriterion("课前心得1 between", value1, value2, "课前心得1");
            return (Criteria) this;
        }

        public Criteria and课前心得1NotBetween(String value1, String value2) {
            addCriterion("课前心得1 not between", value1, value2, "课前心得1");
            return (Criteria) this;
        }

        public Criteria and课前心得2IsNull() {
            addCriterion("课前心得2 is null");
            return (Criteria) this;
        }

        public Criteria and课前心得2IsNotNull() {
            addCriterion("课前心得2 is not null");
            return (Criteria) this;
        }

        public Criteria and课前心得2EqualTo(String value) {
            addCriterion("课前心得2 =", value, "课前心得2");
            return (Criteria) this;
        }

        public Criteria and课前心得2NotEqualTo(String value) {
            addCriterion("课前心得2 <>", value, "课前心得2");
            return (Criteria) this;
        }

        public Criteria and课前心得2GreaterThan(String value) {
            addCriterion("课前心得2 >", value, "课前心得2");
            return (Criteria) this;
        }

        public Criteria and课前心得2GreaterThanOrEqualTo(String value) {
            addCriterion("课前心得2 >=", value, "课前心得2");
            return (Criteria) this;
        }

        public Criteria and课前心得2LessThan(String value) {
            addCriterion("课前心得2 <", value, "课前心得2");
            return (Criteria) this;
        }

        public Criteria and课前心得2LessThanOrEqualTo(String value) {
            addCriterion("课前心得2 <=", value, "课前心得2");
            return (Criteria) this;
        }

        public Criteria and课前心得2Like(String value) {
            addCriterion("课前心得2 like", value, "课前心得2");
            return (Criteria) this;
        }

        public Criteria and课前心得2NotLike(String value) {
            addCriterion("课前心得2 not like", value, "课前心得2");
            return (Criteria) this;
        }

        public Criteria and课前心得2In(List<String> values) {
            addCriterion("课前心得2 in", values, "课前心得2");
            return (Criteria) this;
        }

        public Criteria and课前心得2NotIn(List<String> values) {
            addCriterion("课前心得2 not in", values, "课前心得2");
            return (Criteria) this;
        }

        public Criteria and课前心得2Between(String value1, String value2) {
            addCriterion("课前心得2 between", value1, value2, "课前心得2");
            return (Criteria) this;
        }

        public Criteria and课前心得2NotBetween(String value1, String value2) {
            addCriterion("课前心得2 not between", value1, value2, "课前心得2");
            return (Criteria) this;
        }

        public Criteria and课前心得3IsNull() {
            addCriterion("课前心得3 is null");
            return (Criteria) this;
        }

        public Criteria and课前心得3IsNotNull() {
            addCriterion("课前心得3 is not null");
            return (Criteria) this;
        }

        public Criteria and课前心得3EqualTo(String value) {
            addCriterion("课前心得3 =", value, "课前心得3");
            return (Criteria) this;
        }

        public Criteria and课前心得3NotEqualTo(String value) {
            addCriterion("课前心得3 <>", value, "课前心得3");
            return (Criteria) this;
        }

        public Criteria and课前心得3GreaterThan(String value) {
            addCriterion("课前心得3 >", value, "课前心得3");
            return (Criteria) this;
        }

        public Criteria and课前心得3GreaterThanOrEqualTo(String value) {
            addCriterion("课前心得3 >=", value, "课前心得3");
            return (Criteria) this;
        }

        public Criteria and课前心得3LessThan(String value) {
            addCriterion("课前心得3 <", value, "课前心得3");
            return (Criteria) this;
        }

        public Criteria and课前心得3LessThanOrEqualTo(String value) {
            addCriterion("课前心得3 <=", value, "课前心得3");
            return (Criteria) this;
        }

        public Criteria and课前心得3Like(String value) {
            addCriterion("课前心得3 like", value, "课前心得3");
            return (Criteria) this;
        }

        public Criteria and课前心得3NotLike(String value) {
            addCriterion("课前心得3 not like", value, "课前心得3");
            return (Criteria) this;
        }

        public Criteria and课前心得3In(List<String> values) {
            addCriterion("课前心得3 in", values, "课前心得3");
            return (Criteria) this;
        }

        public Criteria and课前心得3NotIn(List<String> values) {
            addCriterion("课前心得3 not in", values, "课前心得3");
            return (Criteria) this;
        }

        public Criteria and课前心得3Between(String value1, String value2) {
            addCriterion("课前心得3 between", value1, value2, "课前心得3");
            return (Criteria) this;
        }

        public Criteria and课前心得3NotBetween(String value1, String value2) {
            addCriterion("课前心得3 not between", value1, value2, "课前心得3");
            return (Criteria) this;
        }

        public Criteria and课前心得4IsNull() {
            addCriterion("课前心得4 is null");
            return (Criteria) this;
        }

        public Criteria and课前心得4IsNotNull() {
            addCriterion("课前心得4 is not null");
            return (Criteria) this;
        }

        public Criteria and课前心得4EqualTo(String value) {
            addCriterion("课前心得4 =", value, "课前心得4");
            return (Criteria) this;
        }

        public Criteria and课前心得4NotEqualTo(String value) {
            addCriterion("课前心得4 <>", value, "课前心得4");
            return (Criteria) this;
        }

        public Criteria and课前心得4GreaterThan(String value) {
            addCriterion("课前心得4 >", value, "课前心得4");
            return (Criteria) this;
        }

        public Criteria and课前心得4GreaterThanOrEqualTo(String value) {
            addCriterion("课前心得4 >=", value, "课前心得4");
            return (Criteria) this;
        }

        public Criteria and课前心得4LessThan(String value) {
            addCriterion("课前心得4 <", value, "课前心得4");
            return (Criteria) this;
        }

        public Criteria and课前心得4LessThanOrEqualTo(String value) {
            addCriterion("课前心得4 <=", value, "课前心得4");
            return (Criteria) this;
        }

        public Criteria and课前心得4Like(String value) {
            addCriterion("课前心得4 like", value, "课前心得4");
            return (Criteria) this;
        }

        public Criteria and课前心得4NotLike(String value) {
            addCriterion("课前心得4 not like", value, "课前心得4");
            return (Criteria) this;
        }

        public Criteria and课前心得4In(List<String> values) {
            addCriterion("课前心得4 in", values, "课前心得4");
            return (Criteria) this;
        }

        public Criteria and课前心得4NotIn(List<String> values) {
            addCriterion("课前心得4 not in", values, "课前心得4");
            return (Criteria) this;
        }

        public Criteria and课前心得4Between(String value1, String value2) {
            addCriterion("课前心得4 between", value1, value2, "课前心得4");
            return (Criteria) this;
        }

        public Criteria and课前心得4NotBetween(String value1, String value2) {
            addCriterion("课前心得4 not between", value1, value2, "课前心得4");
            return (Criteria) this;
        }

        public Criteria and课前心得5IsNull() {
            addCriterion("课前心得5 is null");
            return (Criteria) this;
        }

        public Criteria and课前心得5IsNotNull() {
            addCriterion("课前心得5 is not null");
            return (Criteria) this;
        }

        public Criteria and课前心得5EqualTo(String value) {
            addCriterion("课前心得5 =", value, "课前心得5");
            return (Criteria) this;
        }

        public Criteria and课前心得5NotEqualTo(String value) {
            addCriterion("课前心得5 <>", value, "课前心得5");
            return (Criteria) this;
        }

        public Criteria and课前心得5GreaterThan(String value) {
            addCriterion("课前心得5 >", value, "课前心得5");
            return (Criteria) this;
        }

        public Criteria and课前心得5GreaterThanOrEqualTo(String value) {
            addCriterion("课前心得5 >=", value, "课前心得5");
            return (Criteria) this;
        }

        public Criteria and课前心得5LessThan(String value) {
            addCriterion("课前心得5 <", value, "课前心得5");
            return (Criteria) this;
        }

        public Criteria and课前心得5LessThanOrEqualTo(String value) {
            addCriterion("课前心得5 <=", value, "课前心得5");
            return (Criteria) this;
        }

        public Criteria and课前心得5Like(String value) {
            addCriterion("课前心得5 like", value, "课前心得5");
            return (Criteria) this;
        }

        public Criteria and课前心得5NotLike(String value) {
            addCriterion("课前心得5 not like", value, "课前心得5");
            return (Criteria) this;
        }

        public Criteria and课前心得5In(List<String> values) {
            addCriterion("课前心得5 in", values, "课前心得5");
            return (Criteria) this;
        }

        public Criteria and课前心得5NotIn(List<String> values) {
            addCriterion("课前心得5 not in", values, "课前心得5");
            return (Criteria) this;
        }

        public Criteria and课前心得5Between(String value1, String value2) {
            addCriterion("课前心得5 between", value1, value2, "课前心得5");
            return (Criteria) this;
        }

        public Criteria and课前心得5NotBetween(String value1, String value2) {
            addCriterion("课前心得5 not between", value1, value2, "课前心得5");
            return (Criteria) this;
        }

        public Criteria and课前心得6IsNull() {
            addCriterion("课前心得6 is null");
            return (Criteria) this;
        }

        public Criteria and课前心得6IsNotNull() {
            addCriterion("课前心得6 is not null");
            return (Criteria) this;
        }

        public Criteria and课前心得6EqualTo(String value) {
            addCriterion("课前心得6 =", value, "课前心得6");
            return (Criteria) this;
        }

        public Criteria and课前心得6NotEqualTo(String value) {
            addCriterion("课前心得6 <>", value, "课前心得6");
            return (Criteria) this;
        }

        public Criteria and课前心得6GreaterThan(String value) {
            addCriterion("课前心得6 >", value, "课前心得6");
            return (Criteria) this;
        }

        public Criteria and课前心得6GreaterThanOrEqualTo(String value) {
            addCriterion("课前心得6 >=", value, "课前心得6");
            return (Criteria) this;
        }

        public Criteria and课前心得6LessThan(String value) {
            addCriterion("课前心得6 <", value, "课前心得6");
            return (Criteria) this;
        }

        public Criteria and课前心得6LessThanOrEqualTo(String value) {
            addCriterion("课前心得6 <=", value, "课前心得6");
            return (Criteria) this;
        }

        public Criteria and课前心得6Like(String value) {
            addCriterion("课前心得6 like", value, "课前心得6");
            return (Criteria) this;
        }

        public Criteria and课前心得6NotLike(String value) {
            addCriterion("课前心得6 not like", value, "课前心得6");
            return (Criteria) this;
        }

        public Criteria and课前心得6In(List<String> values) {
            addCriterion("课前心得6 in", values, "课前心得6");
            return (Criteria) this;
        }

        public Criteria and课前心得6NotIn(List<String> values) {
            addCriterion("课前心得6 not in", values, "课前心得6");
            return (Criteria) this;
        }

        public Criteria and课前心得6Between(String value1, String value2) {
            addCriterion("课前心得6 between", value1, value2, "课前心得6");
            return (Criteria) this;
        }

        public Criteria and课前心得6NotBetween(String value1, String value2) {
            addCriterion("课前心得6 not between", value1, value2, "课前心得6");
            return (Criteria) this;
        }

        public Criteria and课前心得7IsNull() {
            addCriterion("课前心得7 is null");
            return (Criteria) this;
        }

        public Criteria and课前心得7IsNotNull() {
            addCriterion("课前心得7 is not null");
            return (Criteria) this;
        }

        public Criteria and课前心得7EqualTo(String value) {
            addCriterion("课前心得7 =", value, "课前心得7");
            return (Criteria) this;
        }

        public Criteria and课前心得7NotEqualTo(String value) {
            addCriterion("课前心得7 <>", value, "课前心得7");
            return (Criteria) this;
        }

        public Criteria and课前心得7GreaterThan(String value) {
            addCriterion("课前心得7 >", value, "课前心得7");
            return (Criteria) this;
        }

        public Criteria and课前心得7GreaterThanOrEqualTo(String value) {
            addCriterion("课前心得7 >=", value, "课前心得7");
            return (Criteria) this;
        }

        public Criteria and课前心得7LessThan(String value) {
            addCriterion("课前心得7 <", value, "课前心得7");
            return (Criteria) this;
        }

        public Criteria and课前心得7LessThanOrEqualTo(String value) {
            addCriterion("课前心得7 <=", value, "课前心得7");
            return (Criteria) this;
        }

        public Criteria and课前心得7Like(String value) {
            addCriterion("课前心得7 like", value, "课前心得7");
            return (Criteria) this;
        }

        public Criteria and课前心得7NotLike(String value) {
            addCriterion("课前心得7 not like", value, "课前心得7");
            return (Criteria) this;
        }

        public Criteria and课前心得7In(List<String> values) {
            addCriterion("课前心得7 in", values, "课前心得7");
            return (Criteria) this;
        }

        public Criteria and课前心得7NotIn(List<String> values) {
            addCriterion("课前心得7 not in", values, "课前心得7");
            return (Criteria) this;
        }

        public Criteria and课前心得7Between(String value1, String value2) {
            addCriterion("课前心得7 between", value1, value2, "课前心得7");
            return (Criteria) this;
        }

        public Criteria and课前心得7NotBetween(String value1, String value2) {
            addCriterion("课前心得7 not between", value1, value2, "课前心得7");
            return (Criteria) this;
        }

        public Criteria and课前心得8IsNull() {
            addCriterion("课前心得8 is null");
            return (Criteria) this;
        }

        public Criteria and课前心得8IsNotNull() {
            addCriterion("课前心得8 is not null");
            return (Criteria) this;
        }

        public Criteria and课前心得8EqualTo(String value) {
            addCriterion("课前心得8 =", value, "课前心得8");
            return (Criteria) this;
        }

        public Criteria and课前心得8NotEqualTo(String value) {
            addCriterion("课前心得8 <>", value, "课前心得8");
            return (Criteria) this;
        }

        public Criteria and课前心得8GreaterThan(String value) {
            addCriterion("课前心得8 >", value, "课前心得8");
            return (Criteria) this;
        }

        public Criteria and课前心得8GreaterThanOrEqualTo(String value) {
            addCriterion("课前心得8 >=", value, "课前心得8");
            return (Criteria) this;
        }

        public Criteria and课前心得8LessThan(String value) {
            addCriterion("课前心得8 <", value, "课前心得8");
            return (Criteria) this;
        }

        public Criteria and课前心得8LessThanOrEqualTo(String value) {
            addCriterion("课前心得8 <=", value, "课前心得8");
            return (Criteria) this;
        }

        public Criteria and课前心得8Like(String value) {
            addCriterion("课前心得8 like", value, "课前心得8");
            return (Criteria) this;
        }

        public Criteria and课前心得8NotLike(String value) {
            addCriterion("课前心得8 not like", value, "课前心得8");
            return (Criteria) this;
        }

        public Criteria and课前心得8In(List<String> values) {
            addCriterion("课前心得8 in", values, "课前心得8");
            return (Criteria) this;
        }

        public Criteria and课前心得8NotIn(List<String> values) {
            addCriterion("课前心得8 not in", values, "课前心得8");
            return (Criteria) this;
        }

        public Criteria and课前心得8Between(String value1, String value2) {
            addCriterion("课前心得8 between", value1, value2, "课前心得8");
            return (Criteria) this;
        }

        public Criteria and课前心得8NotBetween(String value1, String value2) {
            addCriterion("课前心得8 not between", value1, value2, "课前心得8");
            return (Criteria) this;
        }

        public Criteria and课前心得9IsNull() {
            addCriterion("课前心得9 is null");
            return (Criteria) this;
        }

        public Criteria and课前心得9IsNotNull() {
            addCriterion("课前心得9 is not null");
            return (Criteria) this;
        }

        public Criteria and课前心得9EqualTo(String value) {
            addCriterion("课前心得9 =", value, "课前心得9");
            return (Criteria) this;
        }

        public Criteria and课前心得9NotEqualTo(String value) {
            addCriterion("课前心得9 <>", value, "课前心得9");
            return (Criteria) this;
        }

        public Criteria and课前心得9GreaterThan(String value) {
            addCriterion("课前心得9 >", value, "课前心得9");
            return (Criteria) this;
        }

        public Criteria and课前心得9GreaterThanOrEqualTo(String value) {
            addCriterion("课前心得9 >=", value, "课前心得9");
            return (Criteria) this;
        }

        public Criteria and课前心得9LessThan(String value) {
            addCriterion("课前心得9 <", value, "课前心得9");
            return (Criteria) this;
        }

        public Criteria and课前心得9LessThanOrEqualTo(String value) {
            addCriterion("课前心得9 <=", value, "课前心得9");
            return (Criteria) this;
        }

        public Criteria and课前心得9Like(String value) {
            addCriterion("课前心得9 like", value, "课前心得9");
            return (Criteria) this;
        }

        public Criteria and课前心得9NotLike(String value) {
            addCriterion("课前心得9 not like", value, "课前心得9");
            return (Criteria) this;
        }

        public Criteria and课前心得9In(List<String> values) {
            addCriterion("课前心得9 in", values, "课前心得9");
            return (Criteria) this;
        }

        public Criteria and课前心得9NotIn(List<String> values) {
            addCriterion("课前心得9 not in", values, "课前心得9");
            return (Criteria) this;
        }

        public Criteria and课前心得9Between(String value1, String value2) {
            addCriterion("课前心得9 between", value1, value2, "课前心得9");
            return (Criteria) this;
        }

        public Criteria and课前心得9NotBetween(String value1, String value2) {
            addCriterion("课前心得9 not between", value1, value2, "课前心得9");
            return (Criteria) this;
        }

        public Criteria and课前心得10IsNull() {
            addCriterion("课前心得10 is null");
            return (Criteria) this;
        }

        public Criteria and课前心得10IsNotNull() {
            addCriterion("课前心得10 is not null");
            return (Criteria) this;
        }

        public Criteria and课前心得10EqualTo(String value) {
            addCriterion("课前心得10 =", value, "课前心得10");
            return (Criteria) this;
        }

        public Criteria and课前心得10NotEqualTo(String value) {
            addCriterion("课前心得10 <>", value, "课前心得10");
            return (Criteria) this;
        }

        public Criteria and课前心得10GreaterThan(String value) {
            addCriterion("课前心得10 >", value, "课前心得10");
            return (Criteria) this;
        }

        public Criteria and课前心得10GreaterThanOrEqualTo(String value) {
            addCriterion("课前心得10 >=", value, "课前心得10");
            return (Criteria) this;
        }

        public Criteria and课前心得10LessThan(String value) {
            addCriterion("课前心得10 <", value, "课前心得10");
            return (Criteria) this;
        }

        public Criteria and课前心得10LessThanOrEqualTo(String value) {
            addCriterion("课前心得10 <=", value, "课前心得10");
            return (Criteria) this;
        }

        public Criteria and课前心得10Like(String value) {
            addCriterion("课前心得10 like", value, "课前心得10");
            return (Criteria) this;
        }

        public Criteria and课前心得10NotLike(String value) {
            addCriterion("课前心得10 not like", value, "课前心得10");
            return (Criteria) this;
        }

        public Criteria and课前心得10In(List<String> values) {
            addCriterion("课前心得10 in", values, "课前心得10");
            return (Criteria) this;
        }

        public Criteria and课前心得10NotIn(List<String> values) {
            addCriterion("课前心得10 not in", values, "课前心得10");
            return (Criteria) this;
        }

        public Criteria and课前心得10Between(String value1, String value2) {
            addCriterion("课前心得10 between", value1, value2, "课前心得10");
            return (Criteria) this;
        }

        public Criteria and课前心得10NotBetween(String value1, String value2) {
            addCriterion("课前心得10 not between", value1, value2, "课前心得10");
            return (Criteria) this;
        }

        public Criteria and课前心得11IsNull() {
            addCriterion("课前心得11 is null");
            return (Criteria) this;
        }

        public Criteria and课前心得11IsNotNull() {
            addCriterion("课前心得11 is not null");
            return (Criteria) this;
        }

        public Criteria and课前心得11EqualTo(String value) {
            addCriterion("课前心得11 =", value, "课前心得11");
            return (Criteria) this;
        }

        public Criteria and课前心得11NotEqualTo(String value) {
            addCriterion("课前心得11 <>", value, "课前心得11");
            return (Criteria) this;
        }

        public Criteria and课前心得11GreaterThan(String value) {
            addCriterion("课前心得11 >", value, "课前心得11");
            return (Criteria) this;
        }

        public Criteria and课前心得11GreaterThanOrEqualTo(String value) {
            addCriterion("课前心得11 >=", value, "课前心得11");
            return (Criteria) this;
        }

        public Criteria and课前心得11LessThan(String value) {
            addCriterion("课前心得11 <", value, "课前心得11");
            return (Criteria) this;
        }

        public Criteria and课前心得11LessThanOrEqualTo(String value) {
            addCriterion("课前心得11 <=", value, "课前心得11");
            return (Criteria) this;
        }

        public Criteria and课前心得11Like(String value) {
            addCriterion("课前心得11 like", value, "课前心得11");
            return (Criteria) this;
        }

        public Criteria and课前心得11NotLike(String value) {
            addCriterion("课前心得11 not like", value, "课前心得11");
            return (Criteria) this;
        }

        public Criteria and课前心得11In(List<String> values) {
            addCriterion("课前心得11 in", values, "课前心得11");
            return (Criteria) this;
        }

        public Criteria and课前心得11NotIn(List<String> values) {
            addCriterion("课前心得11 not in", values, "课前心得11");
            return (Criteria) this;
        }

        public Criteria and课前心得11Between(String value1, String value2) {
            addCriterion("课前心得11 between", value1, value2, "课前心得11");
            return (Criteria) this;
        }

        public Criteria and课前心得11NotBetween(String value1, String value2) {
            addCriterion("课前心得11 not between", value1, value2, "课前心得11");
            return (Criteria) this;
        }

        public Criteria and课前心得12IsNull() {
            addCriterion("课前心得12 is null");
            return (Criteria) this;
        }

        public Criteria and课前心得12IsNotNull() {
            addCriterion("课前心得12 is not null");
            return (Criteria) this;
        }

        public Criteria and课前心得12EqualTo(String value) {
            addCriterion("课前心得12 =", value, "课前心得12");
            return (Criteria) this;
        }

        public Criteria and课前心得12NotEqualTo(String value) {
            addCriterion("课前心得12 <>", value, "课前心得12");
            return (Criteria) this;
        }

        public Criteria and课前心得12GreaterThan(String value) {
            addCriterion("课前心得12 >", value, "课前心得12");
            return (Criteria) this;
        }

        public Criteria and课前心得12GreaterThanOrEqualTo(String value) {
            addCriterion("课前心得12 >=", value, "课前心得12");
            return (Criteria) this;
        }

        public Criteria and课前心得12LessThan(String value) {
            addCriterion("课前心得12 <", value, "课前心得12");
            return (Criteria) this;
        }

        public Criteria and课前心得12LessThanOrEqualTo(String value) {
            addCriterion("课前心得12 <=", value, "课前心得12");
            return (Criteria) this;
        }

        public Criteria and课前心得12Like(String value) {
            addCriterion("课前心得12 like", value, "课前心得12");
            return (Criteria) this;
        }

        public Criteria and课前心得12NotLike(String value) {
            addCriterion("课前心得12 not like", value, "课前心得12");
            return (Criteria) this;
        }

        public Criteria and课前心得12In(List<String> values) {
            addCriterion("课前心得12 in", values, "课前心得12");
            return (Criteria) this;
        }

        public Criteria and课前心得12NotIn(List<String> values) {
            addCriterion("课前心得12 not in", values, "课前心得12");
            return (Criteria) this;
        }

        public Criteria and课前心得12Between(String value1, String value2) {
            addCriterion("课前心得12 between", value1, value2, "课前心得12");
            return (Criteria) this;
        }

        public Criteria and课前心得12NotBetween(String value1, String value2) {
            addCriterion("课前心得12 not between", value1, value2, "课前心得12");
            return (Criteria) this;
        }

        public Criteria and课后作业1IsNull() {
            addCriterion("课后作业1 is null");
            return (Criteria) this;
        }

        public Criteria and课后作业1IsNotNull() {
            addCriterion("课后作业1 is not null");
            return (Criteria) this;
        }

        public Criteria and课后作业1EqualTo(String value) {
            addCriterion("课后作业1 =", value, "课后作业1");
            return (Criteria) this;
        }

        public Criteria and课后作业1NotEqualTo(String value) {
            addCriterion("课后作业1 <>", value, "课后作业1");
            return (Criteria) this;
        }

        public Criteria and课后作业1GreaterThan(String value) {
            addCriterion("课后作业1 >", value, "课后作业1");
            return (Criteria) this;
        }

        public Criteria and课后作业1GreaterThanOrEqualTo(String value) {
            addCriterion("课后作业1 >=", value, "课后作业1");
            return (Criteria) this;
        }

        public Criteria and课后作业1LessThan(String value) {
            addCriterion("课后作业1 <", value, "课后作业1");
            return (Criteria) this;
        }

        public Criteria and课后作业1LessThanOrEqualTo(String value) {
            addCriterion("课后作业1 <=", value, "课后作业1");
            return (Criteria) this;
        }

        public Criteria and课后作业1Like(String value) {
            addCriterion("课后作业1 like", value, "课后作业1");
            return (Criteria) this;
        }

        public Criteria and课后作业1NotLike(String value) {
            addCriterion("课后作业1 not like", value, "课后作业1");
            return (Criteria) this;
        }

        public Criteria and课后作业1In(List<String> values) {
            addCriterion("课后作业1 in", values, "课后作业1");
            return (Criteria) this;
        }

        public Criteria and课后作业1NotIn(List<String> values) {
            addCriterion("课后作业1 not in", values, "课后作业1");
            return (Criteria) this;
        }

        public Criteria and课后作业1Between(String value1, String value2) {
            addCriterion("课后作业1 between", value1, value2, "课后作业1");
            return (Criteria) this;
        }

        public Criteria and课后作业1NotBetween(String value1, String value2) {
            addCriterion("课后作业1 not between", value1, value2, "课后作业1");
            return (Criteria) this;
        }

        public Criteria and课后作业2IsNull() {
            addCriterion("课后作业2 is null");
            return (Criteria) this;
        }

        public Criteria and课后作业2IsNotNull() {
            addCriterion("课后作业2 is not null");
            return (Criteria) this;
        }

        public Criteria and课后作业2EqualTo(String value) {
            addCriterion("课后作业2 =", value, "课后作业2");
            return (Criteria) this;
        }

        public Criteria and课后作业2NotEqualTo(String value) {
            addCriterion("课后作业2 <>", value, "课后作业2");
            return (Criteria) this;
        }

        public Criteria and课后作业2GreaterThan(String value) {
            addCriterion("课后作业2 >", value, "课后作业2");
            return (Criteria) this;
        }

        public Criteria and课后作业2GreaterThanOrEqualTo(String value) {
            addCriterion("课后作业2 >=", value, "课后作业2");
            return (Criteria) this;
        }

        public Criteria and课后作业2LessThan(String value) {
            addCriterion("课后作业2 <", value, "课后作业2");
            return (Criteria) this;
        }

        public Criteria and课后作业2LessThanOrEqualTo(String value) {
            addCriterion("课后作业2 <=", value, "课后作业2");
            return (Criteria) this;
        }

        public Criteria and课后作业2Like(String value) {
            addCriterion("课后作业2 like", value, "课后作业2");
            return (Criteria) this;
        }

        public Criteria and课后作业2NotLike(String value) {
            addCriterion("课后作业2 not like", value, "课后作业2");
            return (Criteria) this;
        }

        public Criteria and课后作业2In(List<String> values) {
            addCriterion("课后作业2 in", values, "课后作业2");
            return (Criteria) this;
        }

        public Criteria and课后作业2NotIn(List<String> values) {
            addCriterion("课后作业2 not in", values, "课后作业2");
            return (Criteria) this;
        }

        public Criteria and课后作业2Between(String value1, String value2) {
            addCriterion("课后作业2 between", value1, value2, "课后作业2");
            return (Criteria) this;
        }

        public Criteria and课后作业2NotBetween(String value1, String value2) {
            addCriterion("课后作业2 not between", value1, value2, "课后作业2");
            return (Criteria) this;
        }

        public Criteria and课后作业3IsNull() {
            addCriterion("课后作业3 is null");
            return (Criteria) this;
        }

        public Criteria and课后作业3IsNotNull() {
            addCriterion("课后作业3 is not null");
            return (Criteria) this;
        }

        public Criteria and课后作业3EqualTo(String value) {
            addCriterion("课后作业3 =", value, "课后作业3");
            return (Criteria) this;
        }

        public Criteria and课后作业3NotEqualTo(String value) {
            addCriterion("课后作业3 <>", value, "课后作业3");
            return (Criteria) this;
        }

        public Criteria and课后作业3GreaterThan(String value) {
            addCriterion("课后作业3 >", value, "课后作业3");
            return (Criteria) this;
        }

        public Criteria and课后作业3GreaterThanOrEqualTo(String value) {
            addCriterion("课后作业3 >=", value, "课后作业3");
            return (Criteria) this;
        }

        public Criteria and课后作业3LessThan(String value) {
            addCriterion("课后作业3 <", value, "课后作业3");
            return (Criteria) this;
        }

        public Criteria and课后作业3LessThanOrEqualTo(String value) {
            addCriterion("课后作业3 <=", value, "课后作业3");
            return (Criteria) this;
        }

        public Criteria and课后作业3Like(String value) {
            addCriterion("课后作业3 like", value, "课后作业3");
            return (Criteria) this;
        }

        public Criteria and课后作业3NotLike(String value) {
            addCriterion("课后作业3 not like", value, "课后作业3");
            return (Criteria) this;
        }

        public Criteria and课后作业3In(List<String> values) {
            addCriterion("课后作业3 in", values, "课后作业3");
            return (Criteria) this;
        }

        public Criteria and课后作业3NotIn(List<String> values) {
            addCriterion("课后作业3 not in", values, "课后作业3");
            return (Criteria) this;
        }

        public Criteria and课后作业3Between(String value1, String value2) {
            addCriterion("课后作业3 between", value1, value2, "课后作业3");
            return (Criteria) this;
        }

        public Criteria and课后作业3NotBetween(String value1, String value2) {
            addCriterion("课后作业3 not between", value1, value2, "课后作业3");
            return (Criteria) this;
        }

        public Criteria and课后作业4IsNull() {
            addCriterion("课后作业4 is null");
            return (Criteria) this;
        }

        public Criteria and课后作业4IsNotNull() {
            addCriterion("课后作业4 is not null");
            return (Criteria) this;
        }

        public Criteria and课后作业4EqualTo(String value) {
            addCriterion("课后作业4 =", value, "课后作业4");
            return (Criteria) this;
        }

        public Criteria and课后作业4NotEqualTo(String value) {
            addCriterion("课后作业4 <>", value, "课后作业4");
            return (Criteria) this;
        }

        public Criteria and课后作业4GreaterThan(String value) {
            addCriterion("课后作业4 >", value, "课后作业4");
            return (Criteria) this;
        }

        public Criteria and课后作业4GreaterThanOrEqualTo(String value) {
            addCriterion("课后作业4 >=", value, "课后作业4");
            return (Criteria) this;
        }

        public Criteria and课后作业4LessThan(String value) {
            addCriterion("课后作业4 <", value, "课后作业4");
            return (Criteria) this;
        }

        public Criteria and课后作业4LessThanOrEqualTo(String value) {
            addCriterion("课后作业4 <=", value, "课后作业4");
            return (Criteria) this;
        }

        public Criteria and课后作业4Like(String value) {
            addCriterion("课后作业4 like", value, "课后作业4");
            return (Criteria) this;
        }

        public Criteria and课后作业4NotLike(String value) {
            addCriterion("课后作业4 not like", value, "课后作业4");
            return (Criteria) this;
        }

        public Criteria and课后作业4In(List<String> values) {
            addCriterion("课后作业4 in", values, "课后作业4");
            return (Criteria) this;
        }

        public Criteria and课后作业4NotIn(List<String> values) {
            addCriterion("课后作业4 not in", values, "课后作业4");
            return (Criteria) this;
        }

        public Criteria and课后作业4Between(String value1, String value2) {
            addCriterion("课后作业4 between", value1, value2, "课后作业4");
            return (Criteria) this;
        }

        public Criteria and课后作业4NotBetween(String value1, String value2) {
            addCriterion("课后作业4 not between", value1, value2, "课后作业4");
            return (Criteria) this;
        }

        public Criteria and课后作业5IsNull() {
            addCriterion("课后作业5 is null");
            return (Criteria) this;
        }

        public Criteria and课后作业5IsNotNull() {
            addCriterion("课后作业5 is not null");
            return (Criteria) this;
        }

        public Criteria and课后作业5EqualTo(String value) {
            addCriterion("课后作业5 =", value, "课后作业5");
            return (Criteria) this;
        }

        public Criteria and课后作业5NotEqualTo(String value) {
            addCriterion("课后作业5 <>", value, "课后作业5");
            return (Criteria) this;
        }

        public Criteria and课后作业5GreaterThan(String value) {
            addCriterion("课后作业5 >", value, "课后作业5");
            return (Criteria) this;
        }

        public Criteria and课后作业5GreaterThanOrEqualTo(String value) {
            addCriterion("课后作业5 >=", value, "课后作业5");
            return (Criteria) this;
        }

        public Criteria and课后作业5LessThan(String value) {
            addCriterion("课后作业5 <", value, "课后作业5");
            return (Criteria) this;
        }

        public Criteria and课后作业5LessThanOrEqualTo(String value) {
            addCriterion("课后作业5 <=", value, "课后作业5");
            return (Criteria) this;
        }

        public Criteria and课后作业5Like(String value) {
            addCriterion("课后作业5 like", value, "课后作业5");
            return (Criteria) this;
        }

        public Criteria and课后作业5NotLike(String value) {
            addCriterion("课后作业5 not like", value, "课后作业5");
            return (Criteria) this;
        }

        public Criteria and课后作业5In(List<String> values) {
            addCriterion("课后作业5 in", values, "课后作业5");
            return (Criteria) this;
        }

        public Criteria and课后作业5NotIn(List<String> values) {
            addCriterion("课后作业5 not in", values, "课后作业5");
            return (Criteria) this;
        }

        public Criteria and课后作业5Between(String value1, String value2) {
            addCriterion("课后作业5 between", value1, value2, "课后作业5");
            return (Criteria) this;
        }

        public Criteria and课后作业5NotBetween(String value1, String value2) {
            addCriterion("课后作业5 not between", value1, value2, "课后作业5");
            return (Criteria) this;
        }

        public Criteria and课后作业6IsNull() {
            addCriterion("课后作业6 is null");
            return (Criteria) this;
        }

        public Criteria and课后作业6IsNotNull() {
            addCriterion("课后作业6 is not null");
            return (Criteria) this;
        }

        public Criteria and课后作业6EqualTo(String value) {
            addCriterion("课后作业6 =", value, "课后作业6");
            return (Criteria) this;
        }

        public Criteria and课后作业6NotEqualTo(String value) {
            addCriterion("课后作业6 <>", value, "课后作业6");
            return (Criteria) this;
        }

        public Criteria and课后作业6GreaterThan(String value) {
            addCriterion("课后作业6 >", value, "课后作业6");
            return (Criteria) this;
        }

        public Criteria and课后作业6GreaterThanOrEqualTo(String value) {
            addCriterion("课后作业6 >=", value, "课后作业6");
            return (Criteria) this;
        }

        public Criteria and课后作业6LessThan(String value) {
            addCriterion("课后作业6 <", value, "课后作业6");
            return (Criteria) this;
        }

        public Criteria and课后作业6LessThanOrEqualTo(String value) {
            addCriterion("课后作业6 <=", value, "课后作业6");
            return (Criteria) this;
        }

        public Criteria and课后作业6Like(String value) {
            addCriterion("课后作业6 like", value, "课后作业6");
            return (Criteria) this;
        }

        public Criteria and课后作业6NotLike(String value) {
            addCriterion("课后作业6 not like", value, "课后作业6");
            return (Criteria) this;
        }

        public Criteria and课后作业6In(List<String> values) {
            addCriterion("课后作业6 in", values, "课后作业6");
            return (Criteria) this;
        }

        public Criteria and课后作业6NotIn(List<String> values) {
            addCriterion("课后作业6 not in", values, "课后作业6");
            return (Criteria) this;
        }

        public Criteria and课后作业6Between(String value1, String value2) {
            addCriterion("课后作业6 between", value1, value2, "课后作业6");
            return (Criteria) this;
        }

        public Criteria and课后作业6NotBetween(String value1, String value2) {
            addCriterion("课后作业6 not between", value1, value2, "课后作业6");
            return (Criteria) this;
        }

        public Criteria and课后作业7IsNull() {
            addCriterion("课后作业7 is null");
            return (Criteria) this;
        }

        public Criteria and课后作业7IsNotNull() {
            addCriterion("课后作业7 is not null");
            return (Criteria) this;
        }

        public Criteria and课后作业7EqualTo(String value) {
            addCriterion("课后作业7 =", value, "课后作业7");
            return (Criteria) this;
        }

        public Criteria and课后作业7NotEqualTo(String value) {
            addCriterion("课后作业7 <>", value, "课后作业7");
            return (Criteria) this;
        }

        public Criteria and课后作业7GreaterThan(String value) {
            addCriterion("课后作业7 >", value, "课后作业7");
            return (Criteria) this;
        }

        public Criteria and课后作业7GreaterThanOrEqualTo(String value) {
            addCriterion("课后作业7 >=", value, "课后作业7");
            return (Criteria) this;
        }

        public Criteria and课后作业7LessThan(String value) {
            addCriterion("课后作业7 <", value, "课后作业7");
            return (Criteria) this;
        }

        public Criteria and课后作业7LessThanOrEqualTo(String value) {
            addCriterion("课后作业7 <=", value, "课后作业7");
            return (Criteria) this;
        }

        public Criteria and课后作业7Like(String value) {
            addCriterion("课后作业7 like", value, "课后作业7");
            return (Criteria) this;
        }

        public Criteria and课后作业7NotLike(String value) {
            addCriterion("课后作业7 not like", value, "课后作业7");
            return (Criteria) this;
        }

        public Criteria and课后作业7In(List<String> values) {
            addCriterion("课后作业7 in", values, "课后作业7");
            return (Criteria) this;
        }

        public Criteria and课后作业7NotIn(List<String> values) {
            addCriterion("课后作业7 not in", values, "课后作业7");
            return (Criteria) this;
        }

        public Criteria and课后作业7Between(String value1, String value2) {
            addCriterion("课后作业7 between", value1, value2, "课后作业7");
            return (Criteria) this;
        }

        public Criteria and课后作业7NotBetween(String value1, String value2) {
            addCriterion("课后作业7 not between", value1, value2, "课后作业7");
            return (Criteria) this;
        }

        public Criteria and课后作业8IsNull() {
            addCriterion("课后作业8 is null");
            return (Criteria) this;
        }

        public Criteria and课后作业8IsNotNull() {
            addCriterion("课后作业8 is not null");
            return (Criteria) this;
        }

        public Criteria and课后作业8EqualTo(String value) {
            addCriterion("课后作业8 =", value, "课后作业8");
            return (Criteria) this;
        }

        public Criteria and课后作业8NotEqualTo(String value) {
            addCriterion("课后作业8 <>", value, "课后作业8");
            return (Criteria) this;
        }

        public Criteria and课后作业8GreaterThan(String value) {
            addCriterion("课后作业8 >", value, "课后作业8");
            return (Criteria) this;
        }

        public Criteria and课后作业8GreaterThanOrEqualTo(String value) {
            addCriterion("课后作业8 >=", value, "课后作业8");
            return (Criteria) this;
        }

        public Criteria and课后作业8LessThan(String value) {
            addCriterion("课后作业8 <", value, "课后作业8");
            return (Criteria) this;
        }

        public Criteria and课后作业8LessThanOrEqualTo(String value) {
            addCriterion("课后作业8 <=", value, "课后作业8");
            return (Criteria) this;
        }

        public Criteria and课后作业8Like(String value) {
            addCriterion("课后作业8 like", value, "课后作业8");
            return (Criteria) this;
        }

        public Criteria and课后作业8NotLike(String value) {
            addCriterion("课后作业8 not like", value, "课后作业8");
            return (Criteria) this;
        }

        public Criteria and课后作业8In(List<String> values) {
            addCriterion("课后作业8 in", values, "课后作业8");
            return (Criteria) this;
        }

        public Criteria and课后作业8NotIn(List<String> values) {
            addCriterion("课后作业8 not in", values, "课后作业8");
            return (Criteria) this;
        }

        public Criteria and课后作业8Between(String value1, String value2) {
            addCriterion("课后作业8 between", value1, value2, "课后作业8");
            return (Criteria) this;
        }

        public Criteria and课后作业8NotBetween(String value1, String value2) {
            addCriterion("课后作业8 not between", value1, value2, "课后作业8");
            return (Criteria) this;
        }

        public Criteria and课后作业9IsNull() {
            addCriterion("课后作业9 is null");
            return (Criteria) this;
        }

        public Criteria and课后作业9IsNotNull() {
            addCriterion("课后作业9 is not null");
            return (Criteria) this;
        }

        public Criteria and课后作业9EqualTo(String value) {
            addCriterion("课后作业9 =", value, "课后作业9");
            return (Criteria) this;
        }

        public Criteria and课后作业9NotEqualTo(String value) {
            addCriterion("课后作业9 <>", value, "课后作业9");
            return (Criteria) this;
        }

        public Criteria and课后作业9GreaterThan(String value) {
            addCriterion("课后作业9 >", value, "课后作业9");
            return (Criteria) this;
        }

        public Criteria and课后作业9GreaterThanOrEqualTo(String value) {
            addCriterion("课后作业9 >=", value, "课后作业9");
            return (Criteria) this;
        }

        public Criteria and课后作业9LessThan(String value) {
            addCriterion("课后作业9 <", value, "课后作业9");
            return (Criteria) this;
        }

        public Criteria and课后作业9LessThanOrEqualTo(String value) {
            addCriterion("课后作业9 <=", value, "课后作业9");
            return (Criteria) this;
        }

        public Criteria and课后作业9Like(String value) {
            addCriterion("课后作业9 like", value, "课后作业9");
            return (Criteria) this;
        }

        public Criteria and课后作业9NotLike(String value) {
            addCriterion("课后作业9 not like", value, "课后作业9");
            return (Criteria) this;
        }

        public Criteria and课后作业9In(List<String> values) {
            addCriterion("课后作业9 in", values, "课后作业9");
            return (Criteria) this;
        }

        public Criteria and课后作业9NotIn(List<String> values) {
            addCriterion("课后作业9 not in", values, "课后作业9");
            return (Criteria) this;
        }

        public Criteria and课后作业9Between(String value1, String value2) {
            addCriterion("课后作业9 between", value1, value2, "课后作业9");
            return (Criteria) this;
        }

        public Criteria and课后作业9NotBetween(String value1, String value2) {
            addCriterion("课后作业9 not between", value1, value2, "课后作业9");
            return (Criteria) this;
        }

        public Criteria and课后作业10IsNull() {
            addCriterion("课后作业10 is null");
            return (Criteria) this;
        }

        public Criteria and课后作业10IsNotNull() {
            addCriterion("课后作业10 is not null");
            return (Criteria) this;
        }

        public Criteria and课后作业10EqualTo(String value) {
            addCriterion("课后作业10 =", value, "课后作业10");
            return (Criteria) this;
        }

        public Criteria and课后作业10NotEqualTo(String value) {
            addCriterion("课后作业10 <>", value, "课后作业10");
            return (Criteria) this;
        }

        public Criteria and课后作业10GreaterThan(String value) {
            addCriterion("课后作业10 >", value, "课后作业10");
            return (Criteria) this;
        }

        public Criteria and课后作业10GreaterThanOrEqualTo(String value) {
            addCriterion("课后作业10 >=", value, "课后作业10");
            return (Criteria) this;
        }

        public Criteria and课后作业10LessThan(String value) {
            addCriterion("课后作业10 <", value, "课后作业10");
            return (Criteria) this;
        }

        public Criteria and课后作业10LessThanOrEqualTo(String value) {
            addCriterion("课后作业10 <=", value, "课后作业10");
            return (Criteria) this;
        }

        public Criteria and课后作业10Like(String value) {
            addCriterion("课后作业10 like", value, "课后作业10");
            return (Criteria) this;
        }

        public Criteria and课后作业10NotLike(String value) {
            addCriterion("课后作业10 not like", value, "课后作业10");
            return (Criteria) this;
        }

        public Criteria and课后作业10In(List<String> values) {
            addCriterion("课后作业10 in", values, "课后作业10");
            return (Criteria) this;
        }

        public Criteria and课后作业10NotIn(List<String> values) {
            addCriterion("课后作业10 not in", values, "课后作业10");
            return (Criteria) this;
        }

        public Criteria and课后作业10Between(String value1, String value2) {
            addCriterion("课后作业10 between", value1, value2, "课后作业10");
            return (Criteria) this;
        }

        public Criteria and课后作业10NotBetween(String value1, String value2) {
            addCriterion("课后作业10 not between", value1, value2, "课后作业10");
            return (Criteria) this;
        }

        public Criteria and课后作业11IsNull() {
            addCriterion("课后作业11 is null");
            return (Criteria) this;
        }

        public Criteria and课后作业11IsNotNull() {
            addCriterion("课后作业11 is not null");
            return (Criteria) this;
        }

        public Criteria and课后作业11EqualTo(String value) {
            addCriterion("课后作业11 =", value, "课后作业11");
            return (Criteria) this;
        }

        public Criteria and课后作业11NotEqualTo(String value) {
            addCriterion("课后作业11 <>", value, "课后作业11");
            return (Criteria) this;
        }

        public Criteria and课后作业11GreaterThan(String value) {
            addCriterion("课后作业11 >", value, "课后作业11");
            return (Criteria) this;
        }

        public Criteria and课后作业11GreaterThanOrEqualTo(String value) {
            addCriterion("课后作业11 >=", value, "课后作业11");
            return (Criteria) this;
        }

        public Criteria and课后作业11LessThan(String value) {
            addCriterion("课后作业11 <", value, "课后作业11");
            return (Criteria) this;
        }

        public Criteria and课后作业11LessThanOrEqualTo(String value) {
            addCriterion("课后作业11 <=", value, "课后作业11");
            return (Criteria) this;
        }

        public Criteria and课后作业11Like(String value) {
            addCriterion("课后作业11 like", value, "课后作业11");
            return (Criteria) this;
        }

        public Criteria and课后作业11NotLike(String value) {
            addCriterion("课后作业11 not like", value, "课后作业11");
            return (Criteria) this;
        }

        public Criteria and课后作业11In(List<String> values) {
            addCriterion("课后作业11 in", values, "课后作业11");
            return (Criteria) this;
        }

        public Criteria and课后作业11NotIn(List<String> values) {
            addCriterion("课后作业11 not in", values, "课后作业11");
            return (Criteria) this;
        }

        public Criteria and课后作业11Between(String value1, String value2) {
            addCriterion("课后作业11 between", value1, value2, "课后作业11");
            return (Criteria) this;
        }

        public Criteria and课后作业11NotBetween(String value1, String value2) {
            addCriterion("课后作业11 not between", value1, value2, "课后作业11");
            return (Criteria) this;
        }

        public Criteria and课后作业12IsNull() {
            addCriterion("课后作业12 is null");
            return (Criteria) this;
        }

        public Criteria and课后作业12IsNotNull() {
            addCriterion("课后作业12 is not null");
            return (Criteria) this;
        }

        public Criteria and课后作业12EqualTo(String value) {
            addCriterion("课后作业12 =", value, "课后作业12");
            return (Criteria) this;
        }

        public Criteria and课后作业12NotEqualTo(String value) {
            addCriterion("课后作业12 <>", value, "课后作业12");
            return (Criteria) this;
        }

        public Criteria and课后作业12GreaterThan(String value) {
            addCriterion("课后作业12 >", value, "课后作业12");
            return (Criteria) this;
        }

        public Criteria and课后作业12GreaterThanOrEqualTo(String value) {
            addCriterion("课后作业12 >=", value, "课后作业12");
            return (Criteria) this;
        }

        public Criteria and课后作业12LessThan(String value) {
            addCriterion("课后作业12 <", value, "课后作业12");
            return (Criteria) this;
        }

        public Criteria and课后作业12LessThanOrEqualTo(String value) {
            addCriterion("课后作业12 <=", value, "课后作业12");
            return (Criteria) this;
        }

        public Criteria and课后作业12Like(String value) {
            addCriterion("课后作业12 like", value, "课后作业12");
            return (Criteria) this;
        }

        public Criteria and课后作业12NotLike(String value) {
            addCriterion("课后作业12 not like", value, "课后作业12");
            return (Criteria) this;
        }

        public Criteria and课后作业12In(List<String> values) {
            addCriterion("课后作业12 in", values, "课后作业12");
            return (Criteria) this;
        }

        public Criteria and课后作业12NotIn(List<String> values) {
            addCriterion("课后作业12 not in", values, "课后作业12");
            return (Criteria) this;
        }

        public Criteria and课后作业12Between(String value1, String value2) {
            addCriterion("课后作业12 between", value1, value2, "课后作业12");
            return (Criteria) this;
        }

        public Criteria and课后作业12NotBetween(String value1, String value2) {
            addCriterion("课后作业12 not between", value1, value2, "课后作业12");
            return (Criteria) this;
        }

        public Criteria and每周心得1IsNull() {
            addCriterion("每周心得1 is null");
            return (Criteria) this;
        }

        public Criteria and每周心得1IsNotNull() {
            addCriterion("每周心得1 is not null");
            return (Criteria) this;
        }

        public Criteria and每周心得1EqualTo(String value) {
            addCriterion("每周心得1 =", value, "每周心得1");
            return (Criteria) this;
        }

        public Criteria and每周心得1NotEqualTo(String value) {
            addCriterion("每周心得1 <>", value, "每周心得1");
            return (Criteria) this;
        }

        public Criteria and每周心得1GreaterThan(String value) {
            addCriterion("每周心得1 >", value, "每周心得1");
            return (Criteria) this;
        }

        public Criteria and每周心得1GreaterThanOrEqualTo(String value) {
            addCriterion("每周心得1 >=", value, "每周心得1");
            return (Criteria) this;
        }

        public Criteria and每周心得1LessThan(String value) {
            addCriterion("每周心得1 <", value, "每周心得1");
            return (Criteria) this;
        }

        public Criteria and每周心得1LessThanOrEqualTo(String value) {
            addCriterion("每周心得1 <=", value, "每周心得1");
            return (Criteria) this;
        }

        public Criteria and每周心得1Like(String value) {
            addCriterion("每周心得1 like", value, "每周心得1");
            return (Criteria) this;
        }

        public Criteria and每周心得1NotLike(String value) {
            addCriterion("每周心得1 not like", value, "每周心得1");
            return (Criteria) this;
        }

        public Criteria and每周心得1In(List<String> values) {
            addCriterion("每周心得1 in", values, "每周心得1");
            return (Criteria) this;
        }

        public Criteria and每周心得1NotIn(List<String> values) {
            addCriterion("每周心得1 not in", values, "每周心得1");
            return (Criteria) this;
        }

        public Criteria and每周心得1Between(String value1, String value2) {
            addCriterion("每周心得1 between", value1, value2, "每周心得1");
            return (Criteria) this;
        }

        public Criteria and每周心得1NotBetween(String value1, String value2) {
            addCriterion("每周心得1 not between", value1, value2, "每周心得1");
            return (Criteria) this;
        }

        public Criteria and每周心得2IsNull() {
            addCriterion("每周心得2 is null");
            return (Criteria) this;
        }

        public Criteria and每周心得2IsNotNull() {
            addCriterion("每周心得2 is not null");
            return (Criteria) this;
        }

        public Criteria and每周心得2EqualTo(String value) {
            addCriterion("每周心得2 =", value, "每周心得2");
            return (Criteria) this;
        }

        public Criteria and每周心得2NotEqualTo(String value) {
            addCriterion("每周心得2 <>", value, "每周心得2");
            return (Criteria) this;
        }

        public Criteria and每周心得2GreaterThan(String value) {
            addCriterion("每周心得2 >", value, "每周心得2");
            return (Criteria) this;
        }

        public Criteria and每周心得2GreaterThanOrEqualTo(String value) {
            addCriterion("每周心得2 >=", value, "每周心得2");
            return (Criteria) this;
        }

        public Criteria and每周心得2LessThan(String value) {
            addCriterion("每周心得2 <", value, "每周心得2");
            return (Criteria) this;
        }

        public Criteria and每周心得2LessThanOrEqualTo(String value) {
            addCriterion("每周心得2 <=", value, "每周心得2");
            return (Criteria) this;
        }

        public Criteria and每周心得2Like(String value) {
            addCriterion("每周心得2 like", value, "每周心得2");
            return (Criteria) this;
        }

        public Criteria and每周心得2NotLike(String value) {
            addCriterion("每周心得2 not like", value, "每周心得2");
            return (Criteria) this;
        }

        public Criteria and每周心得2In(List<String> values) {
            addCriterion("每周心得2 in", values, "每周心得2");
            return (Criteria) this;
        }

        public Criteria and每周心得2NotIn(List<String> values) {
            addCriterion("每周心得2 not in", values, "每周心得2");
            return (Criteria) this;
        }

        public Criteria and每周心得2Between(String value1, String value2) {
            addCriterion("每周心得2 between", value1, value2, "每周心得2");
            return (Criteria) this;
        }

        public Criteria and每周心得2NotBetween(String value1, String value2) {
            addCriterion("每周心得2 not between", value1, value2, "每周心得2");
            return (Criteria) this;
        }

        public Criteria and每周心得3IsNull() {
            addCriterion("每周心得3 is null");
            return (Criteria) this;
        }

        public Criteria and每周心得3IsNotNull() {
            addCriterion("每周心得3 is not null");
            return (Criteria) this;
        }

        public Criteria and每周心得3EqualTo(String value) {
            addCriterion("每周心得3 =", value, "每周心得3");
            return (Criteria) this;
        }

        public Criteria and每周心得3NotEqualTo(String value) {
            addCriterion("每周心得3 <>", value, "每周心得3");
            return (Criteria) this;
        }

        public Criteria and每周心得3GreaterThan(String value) {
            addCriterion("每周心得3 >", value, "每周心得3");
            return (Criteria) this;
        }

        public Criteria and每周心得3GreaterThanOrEqualTo(String value) {
            addCriterion("每周心得3 >=", value, "每周心得3");
            return (Criteria) this;
        }

        public Criteria and每周心得3LessThan(String value) {
            addCriterion("每周心得3 <", value, "每周心得3");
            return (Criteria) this;
        }

        public Criteria and每周心得3LessThanOrEqualTo(String value) {
            addCriterion("每周心得3 <=", value, "每周心得3");
            return (Criteria) this;
        }

        public Criteria and每周心得3Like(String value) {
            addCriterion("每周心得3 like", value, "每周心得3");
            return (Criteria) this;
        }

        public Criteria and每周心得3NotLike(String value) {
            addCriterion("每周心得3 not like", value, "每周心得3");
            return (Criteria) this;
        }

        public Criteria and每周心得3In(List<String> values) {
            addCriterion("每周心得3 in", values, "每周心得3");
            return (Criteria) this;
        }

        public Criteria and每周心得3NotIn(List<String> values) {
            addCriterion("每周心得3 not in", values, "每周心得3");
            return (Criteria) this;
        }

        public Criteria and每周心得3Between(String value1, String value2) {
            addCriterion("每周心得3 between", value1, value2, "每周心得3");
            return (Criteria) this;
        }

        public Criteria and每周心得3NotBetween(String value1, String value2) {
            addCriterion("每周心得3 not between", value1, value2, "每周心得3");
            return (Criteria) this;
        }

        public Criteria and每周心得4IsNull() {
            addCriterion("每周心得4 is null");
            return (Criteria) this;
        }

        public Criteria and每周心得4IsNotNull() {
            addCriterion("每周心得4 is not null");
            return (Criteria) this;
        }

        public Criteria and每周心得4EqualTo(String value) {
            addCriterion("每周心得4 =", value, "每周心得4");
            return (Criteria) this;
        }

        public Criteria and每周心得4NotEqualTo(String value) {
            addCriterion("每周心得4 <>", value, "每周心得4");
            return (Criteria) this;
        }

        public Criteria and每周心得4GreaterThan(String value) {
            addCriterion("每周心得4 >", value, "每周心得4");
            return (Criteria) this;
        }

        public Criteria and每周心得4GreaterThanOrEqualTo(String value) {
            addCriterion("每周心得4 >=", value, "每周心得4");
            return (Criteria) this;
        }

        public Criteria and每周心得4LessThan(String value) {
            addCriterion("每周心得4 <", value, "每周心得4");
            return (Criteria) this;
        }

        public Criteria and每周心得4LessThanOrEqualTo(String value) {
            addCriterion("每周心得4 <=", value, "每周心得4");
            return (Criteria) this;
        }

        public Criteria and每周心得4Like(String value) {
            addCriterion("每周心得4 like", value, "每周心得4");
            return (Criteria) this;
        }

        public Criteria and每周心得4NotLike(String value) {
            addCriterion("每周心得4 not like", value, "每周心得4");
            return (Criteria) this;
        }

        public Criteria and每周心得4In(List<String> values) {
            addCriterion("每周心得4 in", values, "每周心得4");
            return (Criteria) this;
        }

        public Criteria and每周心得4NotIn(List<String> values) {
            addCriterion("每周心得4 not in", values, "每周心得4");
            return (Criteria) this;
        }

        public Criteria and每周心得4Between(String value1, String value2) {
            addCriterion("每周心得4 between", value1, value2, "每周心得4");
            return (Criteria) this;
        }

        public Criteria and每周心得4NotBetween(String value1, String value2) {
            addCriterion("每周心得4 not between", value1, value2, "每周心得4");
            return (Criteria) this;
        }

        public Criteria and每周心得5IsNull() {
            addCriterion("每周心得5 is null");
            return (Criteria) this;
        }

        public Criteria and每周心得5IsNotNull() {
            addCriterion("每周心得5 is not null");
            return (Criteria) this;
        }

        public Criteria and每周心得5EqualTo(String value) {
            addCriterion("每周心得5 =", value, "每周心得5");
            return (Criteria) this;
        }

        public Criteria and每周心得5NotEqualTo(String value) {
            addCriterion("每周心得5 <>", value, "每周心得5");
            return (Criteria) this;
        }

        public Criteria and每周心得5GreaterThan(String value) {
            addCriterion("每周心得5 >", value, "每周心得5");
            return (Criteria) this;
        }

        public Criteria and每周心得5GreaterThanOrEqualTo(String value) {
            addCriterion("每周心得5 >=", value, "每周心得5");
            return (Criteria) this;
        }

        public Criteria and每周心得5LessThan(String value) {
            addCriterion("每周心得5 <", value, "每周心得5");
            return (Criteria) this;
        }

        public Criteria and每周心得5LessThanOrEqualTo(String value) {
            addCriterion("每周心得5 <=", value, "每周心得5");
            return (Criteria) this;
        }

        public Criteria and每周心得5Like(String value) {
            addCriterion("每周心得5 like", value, "每周心得5");
            return (Criteria) this;
        }

        public Criteria and每周心得5NotLike(String value) {
            addCriterion("每周心得5 not like", value, "每周心得5");
            return (Criteria) this;
        }

        public Criteria and每周心得5In(List<String> values) {
            addCriterion("每周心得5 in", values, "每周心得5");
            return (Criteria) this;
        }

        public Criteria and每周心得5NotIn(List<String> values) {
            addCriterion("每周心得5 not in", values, "每周心得5");
            return (Criteria) this;
        }

        public Criteria and每周心得5Between(String value1, String value2) {
            addCriterion("每周心得5 between", value1, value2, "每周心得5");
            return (Criteria) this;
        }

        public Criteria and每周心得5NotBetween(String value1, String value2) {
            addCriterion("每周心得5 not between", value1, value2, "每周心得5");
            return (Criteria) this;
        }

        public Criteria and每周心得6IsNull() {
            addCriterion("每周心得6 is null");
            return (Criteria) this;
        }

        public Criteria and每周心得6IsNotNull() {
            addCriterion("每周心得6 is not null");
            return (Criteria) this;
        }

        public Criteria and每周心得6EqualTo(String value) {
            addCriterion("每周心得6 =", value, "每周心得6");
            return (Criteria) this;
        }

        public Criteria and每周心得6NotEqualTo(String value) {
            addCriterion("每周心得6 <>", value, "每周心得6");
            return (Criteria) this;
        }

        public Criteria and每周心得6GreaterThan(String value) {
            addCriterion("每周心得6 >", value, "每周心得6");
            return (Criteria) this;
        }

        public Criteria and每周心得6GreaterThanOrEqualTo(String value) {
            addCriterion("每周心得6 >=", value, "每周心得6");
            return (Criteria) this;
        }

        public Criteria and每周心得6LessThan(String value) {
            addCriterion("每周心得6 <", value, "每周心得6");
            return (Criteria) this;
        }

        public Criteria and每周心得6LessThanOrEqualTo(String value) {
            addCriterion("每周心得6 <=", value, "每周心得6");
            return (Criteria) this;
        }

        public Criteria and每周心得6Like(String value) {
            addCriterion("每周心得6 like", value, "每周心得6");
            return (Criteria) this;
        }

        public Criteria and每周心得6NotLike(String value) {
            addCriterion("每周心得6 not like", value, "每周心得6");
            return (Criteria) this;
        }

        public Criteria and每周心得6In(List<String> values) {
            addCriterion("每周心得6 in", values, "每周心得6");
            return (Criteria) this;
        }

        public Criteria and每周心得6NotIn(List<String> values) {
            addCriterion("每周心得6 not in", values, "每周心得6");
            return (Criteria) this;
        }

        public Criteria and每周心得6Between(String value1, String value2) {
            addCriterion("每周心得6 between", value1, value2, "每周心得6");
            return (Criteria) this;
        }

        public Criteria and每周心得6NotBetween(String value1, String value2) {
            addCriterion("每周心得6 not between", value1, value2, "每周心得6");
            return (Criteria) this;
        }

        public Criteria and每周心得7IsNull() {
            addCriterion("每周心得7 is null");
            return (Criteria) this;
        }

        public Criteria and每周心得7IsNotNull() {
            addCriterion("每周心得7 is not null");
            return (Criteria) this;
        }

        public Criteria and每周心得7EqualTo(String value) {
            addCriterion("每周心得7 =", value, "每周心得7");
            return (Criteria) this;
        }

        public Criteria and每周心得7NotEqualTo(String value) {
            addCriterion("每周心得7 <>", value, "每周心得7");
            return (Criteria) this;
        }

        public Criteria and每周心得7GreaterThan(String value) {
            addCriterion("每周心得7 >", value, "每周心得7");
            return (Criteria) this;
        }

        public Criteria and每周心得7GreaterThanOrEqualTo(String value) {
            addCriterion("每周心得7 >=", value, "每周心得7");
            return (Criteria) this;
        }

        public Criteria and每周心得7LessThan(String value) {
            addCriterion("每周心得7 <", value, "每周心得7");
            return (Criteria) this;
        }

        public Criteria and每周心得7LessThanOrEqualTo(String value) {
            addCriterion("每周心得7 <=", value, "每周心得7");
            return (Criteria) this;
        }

        public Criteria and每周心得7Like(String value) {
            addCriterion("每周心得7 like", value, "每周心得7");
            return (Criteria) this;
        }

        public Criteria and每周心得7NotLike(String value) {
            addCriterion("每周心得7 not like", value, "每周心得7");
            return (Criteria) this;
        }

        public Criteria and每周心得7In(List<String> values) {
            addCriterion("每周心得7 in", values, "每周心得7");
            return (Criteria) this;
        }

        public Criteria and每周心得7NotIn(List<String> values) {
            addCriterion("每周心得7 not in", values, "每周心得7");
            return (Criteria) this;
        }

        public Criteria and每周心得7Between(String value1, String value2) {
            addCriterion("每周心得7 between", value1, value2, "每周心得7");
            return (Criteria) this;
        }

        public Criteria and每周心得7NotBetween(String value1, String value2) {
            addCriterion("每周心得7 not between", value1, value2, "每周心得7");
            return (Criteria) this;
        }

        public Criteria and每周心得8IsNull() {
            addCriterion("每周心得8 is null");
            return (Criteria) this;
        }

        public Criteria and每周心得8IsNotNull() {
            addCriterion("每周心得8 is not null");
            return (Criteria) this;
        }

        public Criteria and每周心得8EqualTo(String value) {
            addCriterion("每周心得8 =", value, "每周心得8");
            return (Criteria) this;
        }

        public Criteria and每周心得8NotEqualTo(String value) {
            addCriterion("每周心得8 <>", value, "每周心得8");
            return (Criteria) this;
        }

        public Criteria and每周心得8GreaterThan(String value) {
            addCriterion("每周心得8 >", value, "每周心得8");
            return (Criteria) this;
        }

        public Criteria and每周心得8GreaterThanOrEqualTo(String value) {
            addCriterion("每周心得8 >=", value, "每周心得8");
            return (Criteria) this;
        }

        public Criteria and每周心得8LessThan(String value) {
            addCriterion("每周心得8 <", value, "每周心得8");
            return (Criteria) this;
        }

        public Criteria and每周心得8LessThanOrEqualTo(String value) {
            addCriterion("每周心得8 <=", value, "每周心得8");
            return (Criteria) this;
        }

        public Criteria and每周心得8Like(String value) {
            addCriterion("每周心得8 like", value, "每周心得8");
            return (Criteria) this;
        }

        public Criteria and每周心得8NotLike(String value) {
            addCriterion("每周心得8 not like", value, "每周心得8");
            return (Criteria) this;
        }

        public Criteria and每周心得8In(List<String> values) {
            addCriterion("每周心得8 in", values, "每周心得8");
            return (Criteria) this;
        }

        public Criteria and每周心得8NotIn(List<String> values) {
            addCriterion("每周心得8 not in", values, "每周心得8");
            return (Criteria) this;
        }

        public Criteria and每周心得8Between(String value1, String value2) {
            addCriterion("每周心得8 between", value1, value2, "每周心得8");
            return (Criteria) this;
        }

        public Criteria and每周心得8NotBetween(String value1, String value2) {
            addCriterion("每周心得8 not between", value1, value2, "每周心得8");
            return (Criteria) this;
        }

        public Criteria and每周心得9IsNull() {
            addCriterion("每周心得9 is null");
            return (Criteria) this;
        }

        public Criteria and每周心得9IsNotNull() {
            addCriterion("每周心得9 is not null");
            return (Criteria) this;
        }

        public Criteria and每周心得9EqualTo(String value) {
            addCriterion("每周心得9 =", value, "每周心得9");
            return (Criteria) this;
        }

        public Criteria and每周心得9NotEqualTo(String value) {
            addCriterion("每周心得9 <>", value, "每周心得9");
            return (Criteria) this;
        }

        public Criteria and每周心得9GreaterThan(String value) {
            addCriterion("每周心得9 >", value, "每周心得9");
            return (Criteria) this;
        }

        public Criteria and每周心得9GreaterThanOrEqualTo(String value) {
            addCriterion("每周心得9 >=", value, "每周心得9");
            return (Criteria) this;
        }

        public Criteria and每周心得9LessThan(String value) {
            addCriterion("每周心得9 <", value, "每周心得9");
            return (Criteria) this;
        }

        public Criteria and每周心得9LessThanOrEqualTo(String value) {
            addCriterion("每周心得9 <=", value, "每周心得9");
            return (Criteria) this;
        }

        public Criteria and每周心得9Like(String value) {
            addCriterion("每周心得9 like", value, "每周心得9");
            return (Criteria) this;
        }

        public Criteria and每周心得9NotLike(String value) {
            addCriterion("每周心得9 not like", value, "每周心得9");
            return (Criteria) this;
        }

        public Criteria and每周心得9In(List<String> values) {
            addCriterion("每周心得9 in", values, "每周心得9");
            return (Criteria) this;
        }

        public Criteria and每周心得9NotIn(List<String> values) {
            addCriterion("每周心得9 not in", values, "每周心得9");
            return (Criteria) this;
        }

        public Criteria and每周心得9Between(String value1, String value2) {
            addCriterion("每周心得9 between", value1, value2, "每周心得9");
            return (Criteria) this;
        }

        public Criteria and每周心得9NotBetween(String value1, String value2) {
            addCriterion("每周心得9 not between", value1, value2, "每周心得9");
            return (Criteria) this;
        }

        public Criteria and每周心得10IsNull() {
            addCriterion("每周心得10 is null");
            return (Criteria) this;
        }

        public Criteria and每周心得10IsNotNull() {
            addCriterion("每周心得10 is not null");
            return (Criteria) this;
        }

        public Criteria and每周心得10EqualTo(String value) {
            addCriterion("每周心得10 =", value, "每周心得10");
            return (Criteria) this;
        }

        public Criteria and每周心得10NotEqualTo(String value) {
            addCriterion("每周心得10 <>", value, "每周心得10");
            return (Criteria) this;
        }

        public Criteria and每周心得10GreaterThan(String value) {
            addCriterion("每周心得10 >", value, "每周心得10");
            return (Criteria) this;
        }

        public Criteria and每周心得10GreaterThanOrEqualTo(String value) {
            addCriterion("每周心得10 >=", value, "每周心得10");
            return (Criteria) this;
        }

        public Criteria and每周心得10LessThan(String value) {
            addCriterion("每周心得10 <", value, "每周心得10");
            return (Criteria) this;
        }

        public Criteria and每周心得10LessThanOrEqualTo(String value) {
            addCriterion("每周心得10 <=", value, "每周心得10");
            return (Criteria) this;
        }

        public Criteria and每周心得10Like(String value) {
            addCriterion("每周心得10 like", value, "每周心得10");
            return (Criteria) this;
        }

        public Criteria and每周心得10NotLike(String value) {
            addCriterion("每周心得10 not like", value, "每周心得10");
            return (Criteria) this;
        }

        public Criteria and每周心得10In(List<String> values) {
            addCriterion("每周心得10 in", values, "每周心得10");
            return (Criteria) this;
        }

        public Criteria and每周心得10NotIn(List<String> values) {
            addCriterion("每周心得10 not in", values, "每周心得10");
            return (Criteria) this;
        }

        public Criteria and每周心得10Between(String value1, String value2) {
            addCriterion("每周心得10 between", value1, value2, "每周心得10");
            return (Criteria) this;
        }

        public Criteria and每周心得10NotBetween(String value1, String value2) {
            addCriterion("每周心得10 not between", value1, value2, "每周心得10");
            return (Criteria) this;
        }

        public Criteria and每周心得11IsNull() {
            addCriterion("每周心得11 is null");
            return (Criteria) this;
        }

        public Criteria and每周心得11IsNotNull() {
            addCriterion("每周心得11 is not null");
            return (Criteria) this;
        }

        public Criteria and每周心得11EqualTo(String value) {
            addCriterion("每周心得11 =", value, "每周心得11");
            return (Criteria) this;
        }

        public Criteria and每周心得11NotEqualTo(String value) {
            addCriterion("每周心得11 <>", value, "每周心得11");
            return (Criteria) this;
        }

        public Criteria and每周心得11GreaterThan(String value) {
            addCriterion("每周心得11 >", value, "每周心得11");
            return (Criteria) this;
        }

        public Criteria and每周心得11GreaterThanOrEqualTo(String value) {
            addCriterion("每周心得11 >=", value, "每周心得11");
            return (Criteria) this;
        }

        public Criteria and每周心得11LessThan(String value) {
            addCriterion("每周心得11 <", value, "每周心得11");
            return (Criteria) this;
        }

        public Criteria and每周心得11LessThanOrEqualTo(String value) {
            addCriterion("每周心得11 <=", value, "每周心得11");
            return (Criteria) this;
        }

        public Criteria and每周心得11Like(String value) {
            addCriterion("每周心得11 like", value, "每周心得11");
            return (Criteria) this;
        }

        public Criteria and每周心得11NotLike(String value) {
            addCriterion("每周心得11 not like", value, "每周心得11");
            return (Criteria) this;
        }

        public Criteria and每周心得11In(List<String> values) {
            addCriterion("每周心得11 in", values, "每周心得11");
            return (Criteria) this;
        }

        public Criteria and每周心得11NotIn(List<String> values) {
            addCriterion("每周心得11 not in", values, "每周心得11");
            return (Criteria) this;
        }

        public Criteria and每周心得11Between(String value1, String value2) {
            addCriterion("每周心得11 between", value1, value2, "每周心得11");
            return (Criteria) this;
        }

        public Criteria and每周心得11NotBetween(String value1, String value2) {
            addCriterion("每周心得11 not between", value1, value2, "每周心得11");
            return (Criteria) this;
        }

        public Criteria and每周心得12IsNull() {
            addCriterion("每周心得12 is null");
            return (Criteria) this;
        }

        public Criteria and每周心得12IsNotNull() {
            addCriterion("每周心得12 is not null");
            return (Criteria) this;
        }

        public Criteria and每周心得12EqualTo(String value) {
            addCriterion("每周心得12 =", value, "每周心得12");
            return (Criteria) this;
        }

        public Criteria and每周心得12NotEqualTo(String value) {
            addCriterion("每周心得12 <>", value, "每周心得12");
            return (Criteria) this;
        }

        public Criteria and每周心得12GreaterThan(String value) {
            addCriterion("每周心得12 >", value, "每周心得12");
            return (Criteria) this;
        }

        public Criteria and每周心得12GreaterThanOrEqualTo(String value) {
            addCriterion("每周心得12 >=", value, "每周心得12");
            return (Criteria) this;
        }

        public Criteria and每周心得12LessThan(String value) {
            addCriterion("每周心得12 <", value, "每周心得12");
            return (Criteria) this;
        }

        public Criteria and每周心得12LessThanOrEqualTo(String value) {
            addCriterion("每周心得12 <=", value, "每周心得12");
            return (Criteria) this;
        }

        public Criteria and每周心得12Like(String value) {
            addCriterion("每周心得12 like", value, "每周心得12");
            return (Criteria) this;
        }

        public Criteria and每周心得12NotLike(String value) {
            addCriterion("每周心得12 not like", value, "每周心得12");
            return (Criteria) this;
        }

        public Criteria and每周心得12In(List<String> values) {
            addCriterion("每周心得12 in", values, "每周心得12");
            return (Criteria) this;
        }

        public Criteria and每周心得12NotIn(List<String> values) {
            addCriterion("每周心得12 not in", values, "每周心得12");
            return (Criteria) this;
        }

        public Criteria and每周心得12Between(String value1, String value2) {
            addCriterion("每周心得12 between", value1, value2, "每周心得12");
            return (Criteria) this;
        }

        public Criteria and每周心得12NotBetween(String value1, String value2) {
            addCriterion("每周心得12 not between", value1, value2, "每周心得12");
            return (Criteria) this;
        }

        public Criteria and实验1IsNull() {
            addCriterion("实验1 is null");
            return (Criteria) this;
        }

        public Criteria and实验1IsNotNull() {
            addCriterion("实验1 is not null");
            return (Criteria) this;
        }

        public Criteria and实验1EqualTo(String value) {
            addCriterion("实验1 =", value, "实验1");
            return (Criteria) this;
        }

        public Criteria and实验1NotEqualTo(String value) {
            addCriterion("实验1 <>", value, "实验1");
            return (Criteria) this;
        }

        public Criteria and实验1GreaterThan(String value) {
            addCriterion("实验1 >", value, "实验1");
            return (Criteria) this;
        }

        public Criteria and实验1GreaterThanOrEqualTo(String value) {
            addCriterion("实验1 >=", value, "实验1");
            return (Criteria) this;
        }

        public Criteria and实验1LessThan(String value) {
            addCriterion("实验1 <", value, "实验1");
            return (Criteria) this;
        }

        public Criteria and实验1LessThanOrEqualTo(String value) {
            addCriterion("实验1 <=", value, "实验1");
            return (Criteria) this;
        }

        public Criteria and实验1Like(String value) {
            addCriterion("实验1 like", value, "实验1");
            return (Criteria) this;
        }

        public Criteria and实验1NotLike(String value) {
            addCriterion("实验1 not like", value, "实验1");
            return (Criteria) this;
        }

        public Criteria and实验1In(List<String> values) {
            addCriterion("实验1 in", values, "实验1");
            return (Criteria) this;
        }

        public Criteria and实验1NotIn(List<String> values) {
            addCriterion("实验1 not in", values, "实验1");
            return (Criteria) this;
        }

        public Criteria and实验1Between(String value1, String value2) {
            addCriterion("实验1 between", value1, value2, "实验1");
            return (Criteria) this;
        }

        public Criteria and实验1NotBetween(String value1, String value2) {
            addCriterion("实验1 not between", value1, value2, "实验1");
            return (Criteria) this;
        }

        public Criteria and实验测试IsNull() {
            addCriterion("实验测试 is null");
            return (Criteria) this;
        }

        public Criteria and实验测试IsNotNull() {
            addCriterion("实验测试 is not null");
            return (Criteria) this;
        }

        public Criteria and实验测试EqualTo(String value) {
            addCriterion("实验测试 =", value, "实验测试");
            return (Criteria) this;
        }

        public Criteria and实验测试NotEqualTo(String value) {
            addCriterion("实验测试 <>", value, "实验测试");
            return (Criteria) this;
        }

        public Criteria and实验测试GreaterThan(String value) {
            addCriterion("实验测试 >", value, "实验测试");
            return (Criteria) this;
        }

        public Criteria and实验测试GreaterThanOrEqualTo(String value) {
            addCriterion("实验测试 >=", value, "实验测试");
            return (Criteria) this;
        }

        public Criteria and实验测试LessThan(String value) {
            addCriterion("实验测试 <", value, "实验测试");
            return (Criteria) this;
        }

        public Criteria and实验测试LessThanOrEqualTo(String value) {
            addCriterion("实验测试 <=", value, "实验测试");
            return (Criteria) this;
        }

        public Criteria and实验测试Like(String value) {
            addCriterion("实验测试 like", value, "实验测试");
            return (Criteria) this;
        }

        public Criteria and实验测试NotLike(String value) {
            addCriterion("实验测试 not like", value, "实验测试");
            return (Criteria) this;
        }

        public Criteria and实验测试In(List<String> values) {
            addCriterion("实验测试 in", values, "实验测试");
            return (Criteria) this;
        }

        public Criteria and实验测试NotIn(List<String> values) {
            addCriterion("实验测试 not in", values, "实验测试");
            return (Criteria) this;
        }

        public Criteria and实验测试Between(String value1, String value2) {
            addCriterion("实验测试 between", value1, value2, "实验测试");
            return (Criteria) this;
        }

        public Criteria and实验测试NotBetween(String value1, String value2) {
            addCriterion("实验测试 not between", value1, value2, "实验测试");
            return (Criteria) this;
        }

        public Criteria and实验考试IsNull() {
            addCriterion("实验考试 is null");
            return (Criteria) this;
        }

        public Criteria and实验考试IsNotNull() {
            addCriterion("实验考试 is not null");
            return (Criteria) this;
        }

        public Criteria and实验考试EqualTo(String value) {
            addCriterion("实验考试 =", value, "实验考试");
            return (Criteria) this;
        }

        public Criteria and实验考试NotEqualTo(String value) {
            addCriterion("实验考试 <>", value, "实验考试");
            return (Criteria) this;
        }

        public Criteria and实验考试GreaterThan(String value) {
            addCriterion("实验考试 >", value, "实验考试");
            return (Criteria) this;
        }

        public Criteria and实验考试GreaterThanOrEqualTo(String value) {
            addCriterion("实验考试 >=", value, "实验考试");
            return (Criteria) this;
        }

        public Criteria and实验考试LessThan(String value) {
            addCriterion("实验考试 <", value, "实验考试");
            return (Criteria) this;
        }

        public Criteria and实验考试LessThanOrEqualTo(String value) {
            addCriterion("实验考试 <=", value, "实验考试");
            return (Criteria) this;
        }

        public Criteria and实验考试Like(String value) {
            addCriterion("实验考试 like", value, "实验考试");
            return (Criteria) this;
        }

        public Criteria and实验考试NotLike(String value) {
            addCriterion("实验考试 not like", value, "实验考试");
            return (Criteria) this;
        }

        public Criteria and实验考试In(List<String> values) {
            addCriterion("实验考试 in", values, "实验考试");
            return (Criteria) this;
        }

        public Criteria and实验考试NotIn(List<String> values) {
            addCriterion("实验考试 not in", values, "实验考试");
            return (Criteria) this;
        }

        public Criteria and实验考试Between(String value1, String value2) {
            addCriterion("实验考试 between", value1, value2, "实验考试");
            return (Criteria) this;
        }

        public Criteria and实验考试NotBetween(String value1, String value2) {
            addCriterion("实验考试 not between", value1, value2, "实验考试");
            return (Criteria) this;
        }

        public Criteria and每章总结1IsNull() {
            addCriterion("每章总结1 is null");
            return (Criteria) this;
        }

        public Criteria and每章总结1IsNotNull() {
            addCriterion("每章总结1 is not null");
            return (Criteria) this;
        }

        public Criteria and每章总结1EqualTo(String value) {
            addCriterion("每章总结1 =", value, "每章总结1");
            return (Criteria) this;
        }

        public Criteria and每章总结1NotEqualTo(String value) {
            addCriterion("每章总结1 <>", value, "每章总结1");
            return (Criteria) this;
        }

        public Criteria and每章总结1GreaterThan(String value) {
            addCriterion("每章总结1 >", value, "每章总结1");
            return (Criteria) this;
        }

        public Criteria and每章总结1GreaterThanOrEqualTo(String value) {
            addCriterion("每章总结1 >=", value, "每章总结1");
            return (Criteria) this;
        }

        public Criteria and每章总结1LessThan(String value) {
            addCriterion("每章总结1 <", value, "每章总结1");
            return (Criteria) this;
        }

        public Criteria and每章总结1LessThanOrEqualTo(String value) {
            addCriterion("每章总结1 <=", value, "每章总结1");
            return (Criteria) this;
        }

        public Criteria and每章总结1Like(String value) {
            addCriterion("每章总结1 like", value, "每章总结1");
            return (Criteria) this;
        }

        public Criteria and每章总结1NotLike(String value) {
            addCriterion("每章总结1 not like", value, "每章总结1");
            return (Criteria) this;
        }

        public Criteria and每章总结1In(List<String> values) {
            addCriterion("每章总结1 in", values, "每章总结1");
            return (Criteria) this;
        }

        public Criteria and每章总结1NotIn(List<String> values) {
            addCriterion("每章总结1 not in", values, "每章总结1");
            return (Criteria) this;
        }

        public Criteria and每章总结1Between(String value1, String value2) {
            addCriterion("每章总结1 between", value1, value2, "每章总结1");
            return (Criteria) this;
        }

        public Criteria and每章总结1NotBetween(String value1, String value2) {
            addCriterion("每章总结1 not between", value1, value2, "每章总结1");
            return (Criteria) this;
        }

        public Criteria and每章总结2IsNull() {
            addCriterion("每章总结2 is null");
            return (Criteria) this;
        }

        public Criteria and每章总结2IsNotNull() {
            addCriterion("每章总结2 is not null");
            return (Criteria) this;
        }

        public Criteria and每章总结2EqualTo(String value) {
            addCriterion("每章总结2 =", value, "每章总结2");
            return (Criteria) this;
        }

        public Criteria and每章总结2NotEqualTo(String value) {
            addCriterion("每章总结2 <>", value, "每章总结2");
            return (Criteria) this;
        }

        public Criteria and每章总结2GreaterThan(String value) {
            addCriterion("每章总结2 >", value, "每章总结2");
            return (Criteria) this;
        }

        public Criteria and每章总结2GreaterThanOrEqualTo(String value) {
            addCriterion("每章总结2 >=", value, "每章总结2");
            return (Criteria) this;
        }

        public Criteria and每章总结2LessThan(String value) {
            addCriterion("每章总结2 <", value, "每章总结2");
            return (Criteria) this;
        }

        public Criteria and每章总结2LessThanOrEqualTo(String value) {
            addCriterion("每章总结2 <=", value, "每章总结2");
            return (Criteria) this;
        }

        public Criteria and每章总结2Like(String value) {
            addCriterion("每章总结2 like", value, "每章总结2");
            return (Criteria) this;
        }

        public Criteria and每章总结2NotLike(String value) {
            addCriterion("每章总结2 not like", value, "每章总结2");
            return (Criteria) this;
        }

        public Criteria and每章总结2In(List<String> values) {
            addCriterion("每章总结2 in", values, "每章总结2");
            return (Criteria) this;
        }

        public Criteria and每章总结2NotIn(List<String> values) {
            addCriterion("每章总结2 not in", values, "每章总结2");
            return (Criteria) this;
        }

        public Criteria and每章总结2Between(String value1, String value2) {
            addCriterion("每章总结2 between", value1, value2, "每章总结2");
            return (Criteria) this;
        }

        public Criteria and每章总结2NotBetween(String value1, String value2) {
            addCriterion("每章总结2 not between", value1, value2, "每章总结2");
            return (Criteria) this;
        }

        public Criteria and每章总结3IsNull() {
            addCriterion("每章总结3 is null");
            return (Criteria) this;
        }

        public Criteria and每章总结3IsNotNull() {
            addCriterion("每章总结3 is not null");
            return (Criteria) this;
        }

        public Criteria and每章总结3EqualTo(String value) {
            addCriterion("每章总结3 =", value, "每章总结3");
            return (Criteria) this;
        }

        public Criteria and每章总结3NotEqualTo(String value) {
            addCriterion("每章总结3 <>", value, "每章总结3");
            return (Criteria) this;
        }

        public Criteria and每章总结3GreaterThan(String value) {
            addCriterion("每章总结3 >", value, "每章总结3");
            return (Criteria) this;
        }

        public Criteria and每章总结3GreaterThanOrEqualTo(String value) {
            addCriterion("每章总结3 >=", value, "每章总结3");
            return (Criteria) this;
        }

        public Criteria and每章总结3LessThan(String value) {
            addCriterion("每章总结3 <", value, "每章总结3");
            return (Criteria) this;
        }

        public Criteria and每章总结3LessThanOrEqualTo(String value) {
            addCriterion("每章总结3 <=", value, "每章总结3");
            return (Criteria) this;
        }

        public Criteria and每章总结3Like(String value) {
            addCriterion("每章总结3 like", value, "每章总结3");
            return (Criteria) this;
        }

        public Criteria and每章总结3NotLike(String value) {
            addCriterion("每章总结3 not like", value, "每章总结3");
            return (Criteria) this;
        }

        public Criteria and每章总结3In(List<String> values) {
            addCriterion("每章总结3 in", values, "每章总结3");
            return (Criteria) this;
        }

        public Criteria and每章总结3NotIn(List<String> values) {
            addCriterion("每章总结3 not in", values, "每章总结3");
            return (Criteria) this;
        }

        public Criteria and每章总结3Between(String value1, String value2) {
            addCriterion("每章总结3 between", value1, value2, "每章总结3");
            return (Criteria) this;
        }

        public Criteria and每章总结3NotBetween(String value1, String value2) {
            addCriterion("每章总结3 not between", value1, value2, "每章总结3");
            return (Criteria) this;
        }

        public Criteria and每章总结4IsNull() {
            addCriterion("每章总结4 is null");
            return (Criteria) this;
        }

        public Criteria and每章总结4IsNotNull() {
            addCriterion("每章总结4 is not null");
            return (Criteria) this;
        }

        public Criteria and每章总结4EqualTo(String value) {
            addCriterion("每章总结4 =", value, "每章总结4");
            return (Criteria) this;
        }

        public Criteria and每章总结4NotEqualTo(String value) {
            addCriterion("每章总结4 <>", value, "每章总结4");
            return (Criteria) this;
        }

        public Criteria and每章总结4GreaterThan(String value) {
            addCriterion("每章总结4 >", value, "每章总结4");
            return (Criteria) this;
        }

        public Criteria and每章总结4GreaterThanOrEqualTo(String value) {
            addCriterion("每章总结4 >=", value, "每章总结4");
            return (Criteria) this;
        }

        public Criteria and每章总结4LessThan(String value) {
            addCriterion("每章总结4 <", value, "每章总结4");
            return (Criteria) this;
        }

        public Criteria and每章总结4LessThanOrEqualTo(String value) {
            addCriterion("每章总结4 <=", value, "每章总结4");
            return (Criteria) this;
        }

        public Criteria and每章总结4Like(String value) {
            addCriterion("每章总结4 like", value, "每章总结4");
            return (Criteria) this;
        }

        public Criteria and每章总结4NotLike(String value) {
            addCriterion("每章总结4 not like", value, "每章总结4");
            return (Criteria) this;
        }

        public Criteria and每章总结4In(List<String> values) {
            addCriterion("每章总结4 in", values, "每章总结4");
            return (Criteria) this;
        }

        public Criteria and每章总结4NotIn(List<String> values) {
            addCriterion("每章总结4 not in", values, "每章总结4");
            return (Criteria) this;
        }

        public Criteria and每章总结4Between(String value1, String value2) {
            addCriterion("每章总结4 between", value1, value2, "每章总结4");
            return (Criteria) this;
        }

        public Criteria and每章总结4NotBetween(String value1, String value2) {
            addCriterion("每章总结4 not between", value1, value2, "每章总结4");
            return (Criteria) this;
        }

        public Criteria and每章总结5IsNull() {
            addCriterion("每章总结5 is null");
            return (Criteria) this;
        }

        public Criteria and每章总结5IsNotNull() {
            addCriterion("每章总结5 is not null");
            return (Criteria) this;
        }

        public Criteria and每章总结5EqualTo(String value) {
            addCriterion("每章总结5 =", value, "每章总结5");
            return (Criteria) this;
        }

        public Criteria and每章总结5NotEqualTo(String value) {
            addCriterion("每章总结5 <>", value, "每章总结5");
            return (Criteria) this;
        }

        public Criteria and每章总结5GreaterThan(String value) {
            addCriterion("每章总结5 >", value, "每章总结5");
            return (Criteria) this;
        }

        public Criteria and每章总结5GreaterThanOrEqualTo(String value) {
            addCriterion("每章总结5 >=", value, "每章总结5");
            return (Criteria) this;
        }

        public Criteria and每章总结5LessThan(String value) {
            addCriterion("每章总结5 <", value, "每章总结5");
            return (Criteria) this;
        }

        public Criteria and每章总结5LessThanOrEqualTo(String value) {
            addCriterion("每章总结5 <=", value, "每章总结5");
            return (Criteria) this;
        }

        public Criteria and每章总结5Like(String value) {
            addCriterion("每章总结5 like", value, "每章总结5");
            return (Criteria) this;
        }

        public Criteria and每章总结5NotLike(String value) {
            addCriterion("每章总结5 not like", value, "每章总结5");
            return (Criteria) this;
        }

        public Criteria and每章总结5In(List<String> values) {
            addCriterion("每章总结5 in", values, "每章总结5");
            return (Criteria) this;
        }

        public Criteria and每章总结5NotIn(List<String> values) {
            addCriterion("每章总结5 not in", values, "每章总结5");
            return (Criteria) this;
        }

        public Criteria and每章总结5Between(String value1, String value2) {
            addCriterion("每章总结5 between", value1, value2, "每章总结5");
            return (Criteria) this;
        }

        public Criteria and每章总结5NotBetween(String value1, String value2) {
            addCriterion("每章总结5 not between", value1, value2, "每章总结5");
            return (Criteria) this;
        }

        public Criteria and阶段练习1IsNull() {
            addCriterion("阶段练习1 is null");
            return (Criteria) this;
        }

        public Criteria and阶段练习1IsNotNull() {
            addCriterion("阶段练习1 is not null");
            return (Criteria) this;
        }

        public Criteria and阶段练习1EqualTo(String value) {
            addCriterion("阶段练习1 =", value, "阶段练习1");
            return (Criteria) this;
        }

        public Criteria and阶段练习1NotEqualTo(String value) {
            addCriterion("阶段练习1 <>", value, "阶段练习1");
            return (Criteria) this;
        }

        public Criteria and阶段练习1GreaterThan(String value) {
            addCriterion("阶段练习1 >", value, "阶段练习1");
            return (Criteria) this;
        }

        public Criteria and阶段练习1GreaterThanOrEqualTo(String value) {
            addCriterion("阶段练习1 >=", value, "阶段练习1");
            return (Criteria) this;
        }

        public Criteria and阶段练习1LessThan(String value) {
            addCriterion("阶段练习1 <", value, "阶段练习1");
            return (Criteria) this;
        }

        public Criteria and阶段练习1LessThanOrEqualTo(String value) {
            addCriterion("阶段练习1 <=", value, "阶段练习1");
            return (Criteria) this;
        }

        public Criteria and阶段练习1Like(String value) {
            addCriterion("阶段练习1 like", value, "阶段练习1");
            return (Criteria) this;
        }

        public Criteria and阶段练习1NotLike(String value) {
            addCriterion("阶段练习1 not like", value, "阶段练习1");
            return (Criteria) this;
        }

        public Criteria and阶段练习1In(List<String> values) {
            addCriterion("阶段练习1 in", values, "阶段练习1");
            return (Criteria) this;
        }

        public Criteria and阶段练习1NotIn(List<String> values) {
            addCriterion("阶段练习1 not in", values, "阶段练习1");
            return (Criteria) this;
        }

        public Criteria and阶段练习1Between(String value1, String value2) {
            addCriterion("阶段练习1 between", value1, value2, "阶段练习1");
            return (Criteria) this;
        }

        public Criteria and阶段练习1NotBetween(String value1, String value2) {
            addCriterion("阶段练习1 not between", value1, value2, "阶段练习1");
            return (Criteria) this;
        }

        public Criteria and阶段练习2IsNull() {
            addCriterion("阶段练习2 is null");
            return (Criteria) this;
        }

        public Criteria and阶段练习2IsNotNull() {
            addCriterion("阶段练习2 is not null");
            return (Criteria) this;
        }

        public Criteria and阶段练习2EqualTo(String value) {
            addCriterion("阶段练习2 =", value, "阶段练习2");
            return (Criteria) this;
        }

        public Criteria and阶段练习2NotEqualTo(String value) {
            addCriterion("阶段练习2 <>", value, "阶段练习2");
            return (Criteria) this;
        }

        public Criteria and阶段练习2GreaterThan(String value) {
            addCriterion("阶段练习2 >", value, "阶段练习2");
            return (Criteria) this;
        }

        public Criteria and阶段练习2GreaterThanOrEqualTo(String value) {
            addCriterion("阶段练习2 >=", value, "阶段练习2");
            return (Criteria) this;
        }

        public Criteria and阶段练习2LessThan(String value) {
            addCriterion("阶段练习2 <", value, "阶段练习2");
            return (Criteria) this;
        }

        public Criteria and阶段练习2LessThanOrEqualTo(String value) {
            addCriterion("阶段练习2 <=", value, "阶段练习2");
            return (Criteria) this;
        }

        public Criteria and阶段练习2Like(String value) {
            addCriterion("阶段练习2 like", value, "阶段练习2");
            return (Criteria) this;
        }

        public Criteria and阶段练习2NotLike(String value) {
            addCriterion("阶段练习2 not like", value, "阶段练习2");
            return (Criteria) this;
        }

        public Criteria and阶段练习2In(List<String> values) {
            addCriterion("阶段练习2 in", values, "阶段练习2");
            return (Criteria) this;
        }

        public Criteria and阶段练习2NotIn(List<String> values) {
            addCriterion("阶段练习2 not in", values, "阶段练习2");
            return (Criteria) this;
        }

        public Criteria and阶段练习2Between(String value1, String value2) {
            addCriterion("阶段练习2 between", value1, value2, "阶段练习2");
            return (Criteria) this;
        }

        public Criteria and阶段练习2NotBetween(String value1, String value2) {
            addCriterion("阶段练习2 not between", value1, value2, "阶段练习2");
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