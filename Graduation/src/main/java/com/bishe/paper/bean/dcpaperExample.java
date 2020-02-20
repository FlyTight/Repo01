package com.bishe.paper.bean;

import java.util.ArrayList;
import java.util.List;

public class dcpaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public dcpaperExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andA3IsNull() {
            addCriterion("a3 is null");
            return (Criteria) this;
        }

        public Criteria andA3IsNotNull() {
            addCriterion("a3 is not null");
            return (Criteria) this;
        }

        public Criteria andA3EqualTo(String value) {
            addCriterion("a3 =", value, "a3");
            return (Criteria) this;
        }

        public Criteria andA3NotEqualTo(String value) {
            addCriterion("a3 <>", value, "a3");
            return (Criteria) this;
        }

        public Criteria andA3GreaterThan(String value) {
            addCriterion("a3 >", value, "a3");
            return (Criteria) this;
        }

        public Criteria andA3GreaterThanOrEqualTo(String value) {
            addCriterion("a3 >=", value, "a3");
            return (Criteria) this;
        }

        public Criteria andA3LessThan(String value) {
            addCriterion("a3 <", value, "a3");
            return (Criteria) this;
        }

        public Criteria andA3LessThanOrEqualTo(String value) {
            addCriterion("a3 <=", value, "a3");
            return (Criteria) this;
        }

        public Criteria andA3Like(String value) {
            addCriterion("a3 like", value, "a3");
            return (Criteria) this;
        }

        public Criteria andA3NotLike(String value) {
            addCriterion("a3 not like", value, "a3");
            return (Criteria) this;
        }

        public Criteria andA3In(List<String> values) {
            addCriterion("a3 in", values, "a3");
            return (Criteria) this;
        }

        public Criteria andA3NotIn(List<String> values) {
            addCriterion("a3 not in", values, "a3");
            return (Criteria) this;
        }

        public Criteria andA3Between(String value1, String value2) {
            addCriterion("a3 between", value1, value2, "a3");
            return (Criteria) this;
        }

        public Criteria andA3NotBetween(String value1, String value2) {
            addCriterion("a3 not between", value1, value2, "a3");
            return (Criteria) this;
        }

        public Criteria andA4IsNull() {
            addCriterion("a4 is null");
            return (Criteria) this;
        }

        public Criteria andA4IsNotNull() {
            addCriterion("a4 is not null");
            return (Criteria) this;
        }

        public Criteria andA4EqualTo(String value) {
            addCriterion("a4 =", value, "a4");
            return (Criteria) this;
        }

        public Criteria andA4NotEqualTo(String value) {
            addCriterion("a4 <>", value, "a4");
            return (Criteria) this;
        }

        public Criteria andA4GreaterThan(String value) {
            addCriterion("a4 >", value, "a4");
            return (Criteria) this;
        }

        public Criteria andA4GreaterThanOrEqualTo(String value) {
            addCriterion("a4 >=", value, "a4");
            return (Criteria) this;
        }

        public Criteria andA4LessThan(String value) {
            addCriterion("a4 <", value, "a4");
            return (Criteria) this;
        }

        public Criteria andA4LessThanOrEqualTo(String value) {
            addCriterion("a4 <=", value, "a4");
            return (Criteria) this;
        }

        public Criteria andA4Like(String value) {
            addCriterion("a4 like", value, "a4");
            return (Criteria) this;
        }

        public Criteria andA4NotLike(String value) {
            addCriterion("a4 not like", value, "a4");
            return (Criteria) this;
        }

        public Criteria andA4In(List<String> values) {
            addCriterion("a4 in", values, "a4");
            return (Criteria) this;
        }

        public Criteria andA4NotIn(List<String> values) {
            addCriterion("a4 not in", values, "a4");
            return (Criteria) this;
        }

        public Criteria andA4Between(String value1, String value2) {
            addCriterion("a4 between", value1, value2, "a4");
            return (Criteria) this;
        }

        public Criteria andA4NotBetween(String value1, String value2) {
            addCriterion("a4 not between", value1, value2, "a4");
            return (Criteria) this;
        }

        public Criteria andA5IsNull() {
            addCriterion("a5 is null");
            return (Criteria) this;
        }

        public Criteria andA5IsNotNull() {
            addCriterion("a5 is not null");
            return (Criteria) this;
        }

        public Criteria andA5EqualTo(String value) {
            addCriterion("a5 =", value, "a5");
            return (Criteria) this;
        }

        public Criteria andA5NotEqualTo(String value) {
            addCriterion("a5 <>", value, "a5");
            return (Criteria) this;
        }

        public Criteria andA5GreaterThan(String value) {
            addCriterion("a5 >", value, "a5");
            return (Criteria) this;
        }

        public Criteria andA5GreaterThanOrEqualTo(String value) {
            addCriterion("a5 >=", value, "a5");
            return (Criteria) this;
        }

        public Criteria andA5LessThan(String value) {
            addCriterion("a5 <", value, "a5");
            return (Criteria) this;
        }

        public Criteria andA5LessThanOrEqualTo(String value) {
            addCriterion("a5 <=", value, "a5");
            return (Criteria) this;
        }

        public Criteria andA5Like(String value) {
            addCriterion("a5 like", value, "a5");
            return (Criteria) this;
        }

        public Criteria andA5NotLike(String value) {
            addCriterion("a5 not like", value, "a5");
            return (Criteria) this;
        }

        public Criteria andA5In(List<String> values) {
            addCriterion("a5 in", values, "a5");
            return (Criteria) this;
        }

        public Criteria andA5NotIn(List<String> values) {
            addCriterion("a5 not in", values, "a5");
            return (Criteria) this;
        }

        public Criteria andA5Between(String value1, String value2) {
            addCriterion("a5 between", value1, value2, "a5");
            return (Criteria) this;
        }

        public Criteria andA5NotBetween(String value1, String value2) {
            addCriterion("a5 not between", value1, value2, "a5");
            return (Criteria) this;
        }

        public Criteria andA6IsNull() {
            addCriterion("a6 is null");
            return (Criteria) this;
        }

        public Criteria andA6IsNotNull() {
            addCriterion("a6 is not null");
            return (Criteria) this;
        }

        public Criteria andA6EqualTo(String value) {
            addCriterion("a6 =", value, "a6");
            return (Criteria) this;
        }

        public Criteria andA6NotEqualTo(String value) {
            addCriterion("a6 <>", value, "a6");
            return (Criteria) this;
        }

        public Criteria andA6GreaterThan(String value) {
            addCriterion("a6 >", value, "a6");
            return (Criteria) this;
        }

        public Criteria andA6GreaterThanOrEqualTo(String value) {
            addCriterion("a6 >=", value, "a6");
            return (Criteria) this;
        }

        public Criteria andA6LessThan(String value) {
            addCriterion("a6 <", value, "a6");
            return (Criteria) this;
        }

        public Criteria andA6LessThanOrEqualTo(String value) {
            addCriterion("a6 <=", value, "a6");
            return (Criteria) this;
        }

        public Criteria andA6Like(String value) {
            addCriterion("a6 like", value, "a6");
            return (Criteria) this;
        }

        public Criteria andA6NotLike(String value) {
            addCriterion("a6 not like", value, "a6");
            return (Criteria) this;
        }

        public Criteria andA6In(List<String> values) {
            addCriterion("a6 in", values, "a6");
            return (Criteria) this;
        }

        public Criteria andA6NotIn(List<String> values) {
            addCriterion("a6 not in", values, "a6");
            return (Criteria) this;
        }

        public Criteria andA6Between(String value1, String value2) {
            addCriterion("a6 between", value1, value2, "a6");
            return (Criteria) this;
        }

        public Criteria andA6NotBetween(String value1, String value2) {
            addCriterion("a6 not between", value1, value2, "a6");
            return (Criteria) this;
        }

        public Criteria andA7IsNull() {
            addCriterion("a7 is null");
            return (Criteria) this;
        }

        public Criteria andA7IsNotNull() {
            addCriterion("a7 is not null");
            return (Criteria) this;
        }

        public Criteria andA7EqualTo(String value) {
            addCriterion("a7 =", value, "a7");
            return (Criteria) this;
        }

        public Criteria andA7NotEqualTo(String value) {
            addCriterion("a7 <>", value, "a7");
            return (Criteria) this;
        }

        public Criteria andA7GreaterThan(String value) {
            addCriterion("a7 >", value, "a7");
            return (Criteria) this;
        }

        public Criteria andA7GreaterThanOrEqualTo(String value) {
            addCriterion("a7 >=", value, "a7");
            return (Criteria) this;
        }

        public Criteria andA7LessThan(String value) {
            addCriterion("a7 <", value, "a7");
            return (Criteria) this;
        }

        public Criteria andA7LessThanOrEqualTo(String value) {
            addCriterion("a7 <=", value, "a7");
            return (Criteria) this;
        }

        public Criteria andA7Like(String value) {
            addCriterion("a7 like", value, "a7");
            return (Criteria) this;
        }

        public Criteria andA7NotLike(String value) {
            addCriterion("a7 not like", value, "a7");
            return (Criteria) this;
        }

        public Criteria andA7In(List<String> values) {
            addCriterion("a7 in", values, "a7");
            return (Criteria) this;
        }

        public Criteria andA7NotIn(List<String> values) {
            addCriterion("a7 not in", values, "a7");
            return (Criteria) this;
        }

        public Criteria andA7Between(String value1, String value2) {
            addCriterion("a7 between", value1, value2, "a7");
            return (Criteria) this;
        }

        public Criteria andA7NotBetween(String value1, String value2) {
            addCriterion("a7 not between", value1, value2, "a7");
            return (Criteria) this;
        }

        public Criteria andA8IsNull() {
            addCriterion("a8 is null");
            return (Criteria) this;
        }

        public Criteria andA8IsNotNull() {
            addCriterion("a8 is not null");
            return (Criteria) this;
        }

        public Criteria andA8EqualTo(String value) {
            addCriterion("a8 =", value, "a8");
            return (Criteria) this;
        }

        public Criteria andA8NotEqualTo(String value) {
            addCriterion("a8 <>", value, "a8");
            return (Criteria) this;
        }

        public Criteria andA8GreaterThan(String value) {
            addCriterion("a8 >", value, "a8");
            return (Criteria) this;
        }

        public Criteria andA8GreaterThanOrEqualTo(String value) {
            addCriterion("a8 >=", value, "a8");
            return (Criteria) this;
        }

        public Criteria andA8LessThan(String value) {
            addCriterion("a8 <", value, "a8");
            return (Criteria) this;
        }

        public Criteria andA8LessThanOrEqualTo(String value) {
            addCriterion("a8 <=", value, "a8");
            return (Criteria) this;
        }

        public Criteria andA8Like(String value) {
            addCriterion("a8 like", value, "a8");
            return (Criteria) this;
        }

        public Criteria andA8NotLike(String value) {
            addCriterion("a8 not like", value, "a8");
            return (Criteria) this;
        }

        public Criteria andA8In(List<String> values) {
            addCriterion("a8 in", values, "a8");
            return (Criteria) this;
        }

        public Criteria andA8NotIn(List<String> values) {
            addCriterion("a8 not in", values, "a8");
            return (Criteria) this;
        }

        public Criteria andA8Between(String value1, String value2) {
            addCriterion("a8 between", value1, value2, "a8");
            return (Criteria) this;
        }

        public Criteria andA8NotBetween(String value1, String value2) {
            addCriterion("a8 not between", value1, value2, "a8");
            return (Criteria) this;
        }

        public Criteria andA9IsNull() {
            addCriterion("a9 is null");
            return (Criteria) this;
        }

        public Criteria andA9IsNotNull() {
            addCriterion("a9 is not null");
            return (Criteria) this;
        }

        public Criteria andA9EqualTo(String value) {
            addCriterion("a9 =", value, "a9");
            return (Criteria) this;
        }

        public Criteria andA9NotEqualTo(String value) {
            addCriterion("a9 <>", value, "a9");
            return (Criteria) this;
        }

        public Criteria andA9GreaterThan(String value) {
            addCriterion("a9 >", value, "a9");
            return (Criteria) this;
        }

        public Criteria andA9GreaterThanOrEqualTo(String value) {
            addCriterion("a9 >=", value, "a9");
            return (Criteria) this;
        }

        public Criteria andA9LessThan(String value) {
            addCriterion("a9 <", value, "a9");
            return (Criteria) this;
        }

        public Criteria andA9LessThanOrEqualTo(String value) {
            addCriterion("a9 <=", value, "a9");
            return (Criteria) this;
        }

        public Criteria andA9Like(String value) {
            addCriterion("a9 like", value, "a9");
            return (Criteria) this;
        }

        public Criteria andA9NotLike(String value) {
            addCriterion("a9 not like", value, "a9");
            return (Criteria) this;
        }

        public Criteria andA9In(List<String> values) {
            addCriterion("a9 in", values, "a9");
            return (Criteria) this;
        }

        public Criteria andA9NotIn(List<String> values) {
            addCriterion("a9 not in", values, "a9");
            return (Criteria) this;
        }

        public Criteria andA9Between(String value1, String value2) {
            addCriterion("a9 between", value1, value2, "a9");
            return (Criteria) this;
        }

        public Criteria andA9NotBetween(String value1, String value2) {
            addCriterion("a9 not between", value1, value2, "a9");
            return (Criteria) this;
        }

        public Criteria andA10IsNull() {
            addCriterion("a10 is null");
            return (Criteria) this;
        }

        public Criteria andA10IsNotNull() {
            addCriterion("a10 is not null");
            return (Criteria) this;
        }

        public Criteria andA10EqualTo(String value) {
            addCriterion("a10 =", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10NotEqualTo(String value) {
            addCriterion("a10 <>", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10GreaterThan(String value) {
            addCriterion("a10 >", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10GreaterThanOrEqualTo(String value) {
            addCriterion("a10 >=", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10LessThan(String value) {
            addCriterion("a10 <", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10LessThanOrEqualTo(String value) {
            addCriterion("a10 <=", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10Like(String value) {
            addCriterion("a10 like", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10NotLike(String value) {
            addCriterion("a10 not like", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10In(List<String> values) {
            addCriterion("a10 in", values, "a10");
            return (Criteria) this;
        }

        public Criteria andA10NotIn(List<String> values) {
            addCriterion("a10 not in", values, "a10");
            return (Criteria) this;
        }

        public Criteria andA10Between(String value1, String value2) {
            addCriterion("a10 between", value1, value2, "a10");
            return (Criteria) this;
        }

        public Criteria andA10NotBetween(String value1, String value2) {
            addCriterion("a10 not between", value1, value2, "a10");
            return (Criteria) this;
        }

        public Criteria andA11IsNull() {
            addCriterion("a11 is null");
            return (Criteria) this;
        }

        public Criteria andA11IsNotNull() {
            addCriterion("a11 is not null");
            return (Criteria) this;
        }

        public Criteria andA11EqualTo(String value) {
            addCriterion("a11 =", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11NotEqualTo(String value) {
            addCriterion("a11 <>", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11GreaterThan(String value) {
            addCriterion("a11 >", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11GreaterThanOrEqualTo(String value) {
            addCriterion("a11 >=", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11LessThan(String value) {
            addCriterion("a11 <", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11LessThanOrEqualTo(String value) {
            addCriterion("a11 <=", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11Like(String value) {
            addCriterion("a11 like", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11NotLike(String value) {
            addCriterion("a11 not like", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11In(List<String> values) {
            addCriterion("a11 in", values, "a11");
            return (Criteria) this;
        }

        public Criteria andA11NotIn(List<String> values) {
            addCriterion("a11 not in", values, "a11");
            return (Criteria) this;
        }

        public Criteria andA11Between(String value1, String value2) {
            addCriterion("a11 between", value1, value2, "a11");
            return (Criteria) this;
        }

        public Criteria andA11NotBetween(String value1, String value2) {
            addCriterion("a11 not between", value1, value2, "a11");
            return (Criteria) this;
        }

        public Criteria andA12IsNull() {
            addCriterion("a12 is null");
            return (Criteria) this;
        }

        public Criteria andA12IsNotNull() {
            addCriterion("a12 is not null");
            return (Criteria) this;
        }

        public Criteria andA12EqualTo(String value) {
            addCriterion("a12 =", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12NotEqualTo(String value) {
            addCriterion("a12 <>", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12GreaterThan(String value) {
            addCriterion("a12 >", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12GreaterThanOrEqualTo(String value) {
            addCriterion("a12 >=", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12LessThan(String value) {
            addCriterion("a12 <", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12LessThanOrEqualTo(String value) {
            addCriterion("a12 <=", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12Like(String value) {
            addCriterion("a12 like", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12NotLike(String value) {
            addCriterion("a12 not like", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12In(List<String> values) {
            addCriterion("a12 in", values, "a12");
            return (Criteria) this;
        }

        public Criteria andA12NotIn(List<String> values) {
            addCriterion("a12 not in", values, "a12");
            return (Criteria) this;
        }

        public Criteria andA12Between(String value1, String value2) {
            addCriterion("a12 between", value1, value2, "a12");
            return (Criteria) this;
        }

        public Criteria andA12NotBetween(String value1, String value2) {
            addCriterion("a12 not between", value1, value2, "a12");
            return (Criteria) this;
        }

        public Criteria andA13IsNull() {
            addCriterion("a13 is null");
            return (Criteria) this;
        }

        public Criteria andA13IsNotNull() {
            addCriterion("a13 is not null");
            return (Criteria) this;
        }

        public Criteria andA13EqualTo(String value) {
            addCriterion("a13 =", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13NotEqualTo(String value) {
            addCriterion("a13 <>", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13GreaterThan(String value) {
            addCriterion("a13 >", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13GreaterThanOrEqualTo(String value) {
            addCriterion("a13 >=", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13LessThan(String value) {
            addCriterion("a13 <", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13LessThanOrEqualTo(String value) {
            addCriterion("a13 <=", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13Like(String value) {
            addCriterion("a13 like", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13NotLike(String value) {
            addCriterion("a13 not like", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13In(List<String> values) {
            addCriterion("a13 in", values, "a13");
            return (Criteria) this;
        }

        public Criteria andA13NotIn(List<String> values) {
            addCriterion("a13 not in", values, "a13");
            return (Criteria) this;
        }

        public Criteria andA13Between(String value1, String value2) {
            addCriterion("a13 between", value1, value2, "a13");
            return (Criteria) this;
        }

        public Criteria andA13NotBetween(String value1, String value2) {
            addCriterion("a13 not between", value1, value2, "a13");
            return (Criteria) this;
        }

        public Criteria andA14IsNull() {
            addCriterion("a14 is null");
            return (Criteria) this;
        }

        public Criteria andA14IsNotNull() {
            addCriterion("a14 is not null");
            return (Criteria) this;
        }

        public Criteria andA14EqualTo(String value) {
            addCriterion("a14 =", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14NotEqualTo(String value) {
            addCriterion("a14 <>", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14GreaterThan(String value) {
            addCriterion("a14 >", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14GreaterThanOrEqualTo(String value) {
            addCriterion("a14 >=", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14LessThan(String value) {
            addCriterion("a14 <", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14LessThanOrEqualTo(String value) {
            addCriterion("a14 <=", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14Like(String value) {
            addCriterion("a14 like", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14NotLike(String value) {
            addCriterion("a14 not like", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14In(List<String> values) {
            addCriterion("a14 in", values, "a14");
            return (Criteria) this;
        }

        public Criteria andA14NotIn(List<String> values) {
            addCriterion("a14 not in", values, "a14");
            return (Criteria) this;
        }

        public Criteria andA14Between(String value1, String value2) {
            addCriterion("a14 between", value1, value2, "a14");
            return (Criteria) this;
        }

        public Criteria andA14NotBetween(String value1, String value2) {
            addCriterion("a14 not between", value1, value2, "a14");
            return (Criteria) this;
        }

        public Criteria andA15IsNull() {
            addCriterion("a15 is null");
            return (Criteria) this;
        }

        public Criteria andA15IsNotNull() {
            addCriterion("a15 is not null");
            return (Criteria) this;
        }

        public Criteria andA15EqualTo(String value) {
            addCriterion("a15 =", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15NotEqualTo(String value) {
            addCriterion("a15 <>", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15GreaterThan(String value) {
            addCriterion("a15 >", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15GreaterThanOrEqualTo(String value) {
            addCriterion("a15 >=", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15LessThan(String value) {
            addCriterion("a15 <", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15LessThanOrEqualTo(String value) {
            addCriterion("a15 <=", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15Like(String value) {
            addCriterion("a15 like", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15NotLike(String value) {
            addCriterion("a15 not like", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15In(List<String> values) {
            addCriterion("a15 in", values, "a15");
            return (Criteria) this;
        }

        public Criteria andA15NotIn(List<String> values) {
            addCriterion("a15 not in", values, "a15");
            return (Criteria) this;
        }

        public Criteria andA15Between(String value1, String value2) {
            addCriterion("a15 between", value1, value2, "a15");
            return (Criteria) this;
        }

        public Criteria andA15NotBetween(String value1, String value2) {
            addCriterion("a15 not between", value1, value2, "a15");
            return (Criteria) this;
        }

        public Criteria andA16IsNull() {
            addCriterion("a16 is null");
            return (Criteria) this;
        }

        public Criteria andA16IsNotNull() {
            addCriterion("a16 is not null");
            return (Criteria) this;
        }

        public Criteria andA16EqualTo(String value) {
            addCriterion("a16 =", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16NotEqualTo(String value) {
            addCriterion("a16 <>", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16GreaterThan(String value) {
            addCriterion("a16 >", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16GreaterThanOrEqualTo(String value) {
            addCriterion("a16 >=", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16LessThan(String value) {
            addCriterion("a16 <", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16LessThanOrEqualTo(String value) {
            addCriterion("a16 <=", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16Like(String value) {
            addCriterion("a16 like", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16NotLike(String value) {
            addCriterion("a16 not like", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16In(List<String> values) {
            addCriterion("a16 in", values, "a16");
            return (Criteria) this;
        }

        public Criteria andA16NotIn(List<String> values) {
            addCriterion("a16 not in", values, "a16");
            return (Criteria) this;
        }

        public Criteria andA16Between(String value1, String value2) {
            addCriterion("a16 between", value1, value2, "a16");
            return (Criteria) this;
        }

        public Criteria andA16NotBetween(String value1, String value2) {
            addCriterion("a16 not between", value1, value2, "a16");
            return (Criteria) this;
        }

        public Criteria andA17IsNull() {
            addCriterion("a17 is null");
            return (Criteria) this;
        }

        public Criteria andA17IsNotNull() {
            addCriterion("a17 is not null");
            return (Criteria) this;
        }

        public Criteria andA17EqualTo(String value) {
            addCriterion("a17 =", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17NotEqualTo(String value) {
            addCriterion("a17 <>", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17GreaterThan(String value) {
            addCriterion("a17 >", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17GreaterThanOrEqualTo(String value) {
            addCriterion("a17 >=", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17LessThan(String value) {
            addCriterion("a17 <", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17LessThanOrEqualTo(String value) {
            addCriterion("a17 <=", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17Like(String value) {
            addCriterion("a17 like", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17NotLike(String value) {
            addCriterion("a17 not like", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17In(List<String> values) {
            addCriterion("a17 in", values, "a17");
            return (Criteria) this;
        }

        public Criteria andA17NotIn(List<String> values) {
            addCriterion("a17 not in", values, "a17");
            return (Criteria) this;
        }

        public Criteria andA17Between(String value1, String value2) {
            addCriterion("a17 between", value1, value2, "a17");
            return (Criteria) this;
        }

        public Criteria andA17NotBetween(String value1, String value2) {
            addCriterion("a17 not between", value1, value2, "a17");
            return (Criteria) this;
        }

        public Criteria andA18IsNull() {
            addCriterion("a18 is null");
            return (Criteria) this;
        }

        public Criteria andA18IsNotNull() {
            addCriterion("a18 is not null");
            return (Criteria) this;
        }

        public Criteria andA18EqualTo(String value) {
            addCriterion("a18 =", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18NotEqualTo(String value) {
            addCriterion("a18 <>", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18GreaterThan(String value) {
            addCriterion("a18 >", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18GreaterThanOrEqualTo(String value) {
            addCriterion("a18 >=", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18LessThan(String value) {
            addCriterion("a18 <", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18LessThanOrEqualTo(String value) {
            addCriterion("a18 <=", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18Like(String value) {
            addCriterion("a18 like", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18NotLike(String value) {
            addCriterion("a18 not like", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18In(List<String> values) {
            addCriterion("a18 in", values, "a18");
            return (Criteria) this;
        }

        public Criteria andA18NotIn(List<String> values) {
            addCriterion("a18 not in", values, "a18");
            return (Criteria) this;
        }

        public Criteria andA18Between(String value1, String value2) {
            addCriterion("a18 between", value1, value2, "a18");
            return (Criteria) this;
        }

        public Criteria andA18NotBetween(String value1, String value2) {
            addCriterion("a18 not between", value1, value2, "a18");
            return (Criteria) this;
        }

        public Criteria andA19IsNull() {
            addCriterion("a19 is null");
            return (Criteria) this;
        }

        public Criteria andA19IsNotNull() {
            addCriterion("a19 is not null");
            return (Criteria) this;
        }

        public Criteria andA19EqualTo(String value) {
            addCriterion("a19 =", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19NotEqualTo(String value) {
            addCriterion("a19 <>", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19GreaterThan(String value) {
            addCriterion("a19 >", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19GreaterThanOrEqualTo(String value) {
            addCriterion("a19 >=", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19LessThan(String value) {
            addCriterion("a19 <", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19LessThanOrEqualTo(String value) {
            addCriterion("a19 <=", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19Like(String value) {
            addCriterion("a19 like", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19NotLike(String value) {
            addCriterion("a19 not like", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19In(List<String> values) {
            addCriterion("a19 in", values, "a19");
            return (Criteria) this;
        }

        public Criteria andA19NotIn(List<String> values) {
            addCriterion("a19 not in", values, "a19");
            return (Criteria) this;
        }

        public Criteria andA19Between(String value1, String value2) {
            addCriterion("a19 between", value1, value2, "a19");
            return (Criteria) this;
        }

        public Criteria andA19NotBetween(String value1, String value2) {
            addCriterion("a19 not between", value1, value2, "a19");
            return (Criteria) this;
        }

        public Criteria andA20IsNull() {
            addCriterion("a20 is null");
            return (Criteria) this;
        }

        public Criteria andA20IsNotNull() {
            addCriterion("a20 is not null");
            return (Criteria) this;
        }

        public Criteria andA20EqualTo(String value) {
            addCriterion("a20 =", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20NotEqualTo(String value) {
            addCriterion("a20 <>", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20GreaterThan(String value) {
            addCriterion("a20 >", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20GreaterThanOrEqualTo(String value) {
            addCriterion("a20 >=", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20LessThan(String value) {
            addCriterion("a20 <", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20LessThanOrEqualTo(String value) {
            addCriterion("a20 <=", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20Like(String value) {
            addCriterion("a20 like", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20NotLike(String value) {
            addCriterion("a20 not like", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20In(List<String> values) {
            addCriterion("a20 in", values, "a20");
            return (Criteria) this;
        }

        public Criteria andA20NotIn(List<String> values) {
            addCriterion("a20 not in", values, "a20");
            return (Criteria) this;
        }

        public Criteria andA20Between(String value1, String value2) {
            addCriterion("a20 between", value1, value2, "a20");
            return (Criteria) this;
        }

        public Criteria andA20NotBetween(String value1, String value2) {
            addCriterion("a20 not between", value1, value2, "a20");
            return (Criteria) this;
        }

        public Criteria andA21IsNull() {
            addCriterion("a21 is null");
            return (Criteria) this;
        }

        public Criteria andA21IsNotNull() {
            addCriterion("a21 is not null");
            return (Criteria) this;
        }

        public Criteria andA21EqualTo(String value) {
            addCriterion("a21 =", value, "a21");
            return (Criteria) this;
        }

        public Criteria andA21NotEqualTo(String value) {
            addCriterion("a21 <>", value, "a21");
            return (Criteria) this;
        }

        public Criteria andA21GreaterThan(String value) {
            addCriterion("a21 >", value, "a21");
            return (Criteria) this;
        }

        public Criteria andA21GreaterThanOrEqualTo(String value) {
            addCriterion("a21 >=", value, "a21");
            return (Criteria) this;
        }

        public Criteria andA21LessThan(String value) {
            addCriterion("a21 <", value, "a21");
            return (Criteria) this;
        }

        public Criteria andA21LessThanOrEqualTo(String value) {
            addCriterion("a21 <=", value, "a21");
            return (Criteria) this;
        }

        public Criteria andA21Like(String value) {
            addCriterion("a21 like", value, "a21");
            return (Criteria) this;
        }

        public Criteria andA21NotLike(String value) {
            addCriterion("a21 not like", value, "a21");
            return (Criteria) this;
        }

        public Criteria andA21In(List<String> values) {
            addCriterion("a21 in", values, "a21");
            return (Criteria) this;
        }

        public Criteria andA21NotIn(List<String> values) {
            addCriterion("a21 not in", values, "a21");
            return (Criteria) this;
        }

        public Criteria andA21Between(String value1, String value2) {
            addCriterion("a21 between", value1, value2, "a21");
            return (Criteria) this;
        }

        public Criteria andA21NotBetween(String value1, String value2) {
            addCriterion("a21 not between", value1, value2, "a21");
            return (Criteria) this;
        }

        public Criteria andA22IsNull() {
            addCriterion("a22 is null");
            return (Criteria) this;
        }

        public Criteria andA22IsNotNull() {
            addCriterion("a22 is not null");
            return (Criteria) this;
        }

        public Criteria andA22EqualTo(String value) {
            addCriterion("a22 =", value, "a22");
            return (Criteria) this;
        }

        public Criteria andA22NotEqualTo(String value) {
            addCriterion("a22 <>", value, "a22");
            return (Criteria) this;
        }

        public Criteria andA22GreaterThan(String value) {
            addCriterion("a22 >", value, "a22");
            return (Criteria) this;
        }

        public Criteria andA22GreaterThanOrEqualTo(String value) {
            addCriterion("a22 >=", value, "a22");
            return (Criteria) this;
        }

        public Criteria andA22LessThan(String value) {
            addCriterion("a22 <", value, "a22");
            return (Criteria) this;
        }

        public Criteria andA22LessThanOrEqualTo(String value) {
            addCriterion("a22 <=", value, "a22");
            return (Criteria) this;
        }

        public Criteria andA22Like(String value) {
            addCriterion("a22 like", value, "a22");
            return (Criteria) this;
        }

        public Criteria andA22NotLike(String value) {
            addCriterion("a22 not like", value, "a22");
            return (Criteria) this;
        }

        public Criteria andA22In(List<String> values) {
            addCriterion("a22 in", values, "a22");
            return (Criteria) this;
        }

        public Criteria andA22NotIn(List<String> values) {
            addCriterion("a22 not in", values, "a22");
            return (Criteria) this;
        }

        public Criteria andA22Between(String value1, String value2) {
            addCriterion("a22 between", value1, value2, "a22");
            return (Criteria) this;
        }

        public Criteria andA22NotBetween(String value1, String value2) {
            addCriterion("a22 not between", value1, value2, "a22");
            return (Criteria) this;
        }

        public Criteria andA23IsNull() {
            addCriterion("a23 is null");
            return (Criteria) this;
        }

        public Criteria andA23IsNotNull() {
            addCriterion("a23 is not null");
            return (Criteria) this;
        }

        public Criteria andA23EqualTo(String value) {
            addCriterion("a23 =", value, "a23");
            return (Criteria) this;
        }

        public Criteria andA23NotEqualTo(String value) {
            addCriterion("a23 <>", value, "a23");
            return (Criteria) this;
        }

        public Criteria andA23GreaterThan(String value) {
            addCriterion("a23 >", value, "a23");
            return (Criteria) this;
        }

        public Criteria andA23GreaterThanOrEqualTo(String value) {
            addCriterion("a23 >=", value, "a23");
            return (Criteria) this;
        }

        public Criteria andA23LessThan(String value) {
            addCriterion("a23 <", value, "a23");
            return (Criteria) this;
        }

        public Criteria andA23LessThanOrEqualTo(String value) {
            addCriterion("a23 <=", value, "a23");
            return (Criteria) this;
        }

        public Criteria andA23Like(String value) {
            addCriterion("a23 like", value, "a23");
            return (Criteria) this;
        }

        public Criteria andA23NotLike(String value) {
            addCriterion("a23 not like", value, "a23");
            return (Criteria) this;
        }

        public Criteria andA23In(List<String> values) {
            addCriterion("a23 in", values, "a23");
            return (Criteria) this;
        }

        public Criteria andA23NotIn(List<String> values) {
            addCriterion("a23 not in", values, "a23");
            return (Criteria) this;
        }

        public Criteria andA23Between(String value1, String value2) {
            addCriterion("a23 between", value1, value2, "a23");
            return (Criteria) this;
        }

        public Criteria andA23NotBetween(String value1, String value2) {
            addCriterion("a23 not between", value1, value2, "a23");
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