package com.mutiny.demo.dao;

import com.mutiny.demo.pojo.DefaultData;
import com.mutiny.demo.pojo.DefaultDataExample;
import java.util.List;

public interface DefaultDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    int deleteByPrimaryKey(Integer defaultmoduleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    int insert(DefaultData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    int insertSelective(DefaultData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    List<DefaultData> selectByExample(DefaultDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    DefaultData selectByPrimaryKey(Integer defaultmoduleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    int updateByPrimaryKeySelective(DefaultData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:58:28
     */
    int updateByPrimaryKey(DefaultData record);
}