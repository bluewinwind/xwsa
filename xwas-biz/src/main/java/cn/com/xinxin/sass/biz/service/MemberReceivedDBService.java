package cn.com.xinxin.sass.biz.service;

import cn.com.xinxin.sass.repository.model.MemberReceivedDO;

import java.util.List;

/**
 * @author: liuhangzhou
 * @created: 2020/4/21.
 * @updater:
 * @description: 成员信息暂存表数据库服务
 */
public interface MemberReceivedDBService {
    /**
     * 批量插入记录
     * @param memberReceivedDOS 记录
     * @return 插入成功条数
     */
    int insertBatch(List<MemberReceivedDO> memberReceivedDOS);
}
