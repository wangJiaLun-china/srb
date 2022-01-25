package com.wjl.srb.core.service.impl;

import com.wjl.srb.core.pojo.entity.UserLoginRecord;
import com.wjl.srb.core.mapper.UserLoginRecordMapper;
import com.wjl.srb.core.service.UserLoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author wangjialun
 * @since 2022-01-24
 */
@Service
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements UserLoginRecordService {

}
