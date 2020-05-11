package cn.com.xinxin.sass.repository.dao;

import cn.com.xinxin.sass.repository.model.TagsDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TagsDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbg.generated
     */
    int insert(TagsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbg.generated
     */
    int insertSelective(TagsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbg.generated
     */
    TagsDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TagsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TagsDO record);

    /**
     * 查询接口
     * @param tagName
     * @return
     */
    List<TagsDO> selectByTagName( @Param("tagName") String tagName);


    List<TagsDO>  queryAllTagsByNameAndTenantId(@Param("tagName")String tagName,
                                                @Param("tenantId")String tenantId);

}