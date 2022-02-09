package com.wjl.srb.core.service;

import com.wjl.srb.core.pojo.entity.LendReturn;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 还款记录表 服务类
 * </p>
 *
 * @author wangjialun
 * @since 2022-01-24
 */
public interface LendReturnService extends IService<LendReturn> {

    List<LendReturn> selectByLendId(Long lendId);
}
