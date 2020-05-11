package com.mutiny.demo.dao;

import com.mutiny.demo.pojo.LogCalculate;
import com.mutiny.demo.pojo.LogCalculateExample;
import java.util.List;

public interface LogCalculateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Log_Calculate
     *
     * @mbg.generated 2020-05-11 16:22:45
     */
    int deleteByPrimaryKey(Integer calculateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Log_Calculate
     *
     * @mbg.generated 2020-05-11 16:22:45
     */
    int insert(LogCalculate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Log_Calculate
     *
     * @mbg.generated 2020-05-11 16:22:45
     */
    int insertSelective(LogCalculate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Log_Calculate
     *
     * @mbg.generated 2020-05-11 16:22:45
     */
    List<LogCalculate> selectByExample(LogCalculateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Log_Calculate
     *
     * @mbg.generated 2020-05-11 16:22:45
     */
    LogCalculate selectByPrimaryKey(Integer calculateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Log_Calculate
     *
     * @mbg.generated 2020-05-11 16:22:45
     */
    int updateByPrimaryKeySelective(LogCalculate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Log_Calculate
     *
     * @mbg.generated 2020-05-11 16:22:45
     */
    int updateByPrimaryKey(LogCalculate record);
}