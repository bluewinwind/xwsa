package cn.com.xinxin.sass.repository.dao;

import cn.com.xinxin.sass.repository.model.OrgBaseInfoDO;
import org.apache.ibatis.annotations.Param;

public interface OrgBaseInfoDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_base_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_base_info
     *
     * @mbg.generated
     */
    int insert(OrgBaseInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_base_info
     *
     * @mbg.generated
     */
    int insertSelective(OrgBaseInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_base_info
     *
     * @mbg.generated
     */
    OrgBaseInfoDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_base_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OrgBaseInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_base_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OrgBaseInfoDO record);

    /**
     * 通过机构id查询
     * @param orgId 机构id
     * @return 机构基础信息
     */
    OrgBaseInfoDO selectByOrgId(@Param(value = "orgId") String orgId);
}