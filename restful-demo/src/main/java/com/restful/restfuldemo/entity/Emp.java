package com.restful.restfuldemo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Emp {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMP.EMPNO
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    private Short empno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMP.ENAME
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    private String ename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMP.JOB
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    private String job;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMP.MGR
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    private Short mgr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMP.HIREDATE
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    private Date hiredate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMP.SAL
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    private BigDecimal sal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMP.COMM
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    private BigDecimal comm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMP.DEPTNO
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    private Short deptno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMP.GENDER
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    private String gender;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMP.EMPNO
     *
     * @return the value of EMP.EMPNO
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public Short getEmpno() {
        return empno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMP.EMPNO
     *
     * @param empno the value for EMP.EMPNO
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public void setEmpno(Short empno) {
        this.empno = empno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMP.ENAME
     *
     * @return the value of EMP.ENAME
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public String getEname() {
        return ename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMP.ENAME
     *
     * @param ename the value for EMP.ENAME
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMP.JOB
     *
     * @return the value of EMP.JOB
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMP.JOB
     *
     * @param job the value for EMP.JOB
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMP.MGR
     *
     * @return the value of EMP.MGR
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public Short getMgr() {
        return mgr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMP.MGR
     *
     * @param mgr the value for EMP.MGR
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public void setMgr(Short mgr) {
        this.mgr = mgr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMP.HIREDATE
     *
     * @return the value of EMP.HIREDATE
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public Date getHiredate() {
        return hiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMP.HIREDATE
     *
     * @param hiredate the value for EMP.HIREDATE
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMP.SAL
     *
     * @return the value of EMP.SAL
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public BigDecimal getSal() {
        return sal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMP.SAL
     *
     * @param sal the value for EMP.SAL
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMP.COMM
     *
     * @return the value of EMP.COMM
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public BigDecimal getComm() {
        return comm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMP.COMM
     *
     * @param comm the value for EMP.COMM
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMP.DEPTNO
     *
     * @return the value of EMP.DEPTNO
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public Short getDeptno() {
        return deptno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMP.DEPTNO
     *
     * @param deptno the value for EMP.DEPTNO
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public void setDeptno(Short deptno) {
        this.deptno = deptno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMP.GENDER
     *
     * @return the value of EMP.GENDER
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMP.GENDER
     *
     * @param gender the value for EMP.GENDER
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }
}