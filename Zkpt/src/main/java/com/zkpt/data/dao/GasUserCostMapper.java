package com.zkpt.data.dao;

import org.apache.ibatis.annotations.Mapper;

import com.zkpt.data.entity.GasUserCost;

@Mapper
public interface GasUserCostMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * mid_gas_user_cost
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * mid_gas_user_cost
     *
     * @mbggenerated
     */
    int insert(GasUserCost record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * mid_gas_user_cost
     *
     * @mbggenerated
     */
    int insertSelective(GasUserCost record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * mid_gas_user_cost
     *
     * @mbggenerated
     */
    GasUserCost selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * mid_gas_user_cost
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GasUserCost record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * mid_gas_user_cost
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GasUserCost record);
}
