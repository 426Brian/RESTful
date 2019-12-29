package com.restful.restfuldemo.mapper;

import com.restful.restfuldemo.entity.Dept;
import com.restful.restfuldemo.entity.DeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    long countByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    int deleteByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    int deleteByPrimaryKey(Short deptno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    int insert(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    int insertSelective(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    List<Dept> selectByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    Dept selectByPrimaryKey(Short deptno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    int updateByExampleSelective(@Param("record") Dept record, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    int updateByExample(@Param("record") Dept record, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    int updateByPrimaryKeySelective(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPT
     *
     * @mbg.generated Wed Dec 19 12:36:02 CST 2018
     */
    int updateByPrimaryKey(Dept record);
}