package cn.com.xinxin.sass.repository.dao;

import cn.com.xinxin.sass.repository.model.MemberReceivedDO;

public interface MemberReceivedDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_received
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_received
     *
     * @mbg.generated
     */
    int insert(MemberReceivedDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_received
     *
     * @mbg.generated
     */
    int insertSelective(MemberReceivedDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_received
     *
     * @mbg.generated
     */
    MemberReceivedDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_received
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MemberReceivedDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_received
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MemberReceivedDO record);
}