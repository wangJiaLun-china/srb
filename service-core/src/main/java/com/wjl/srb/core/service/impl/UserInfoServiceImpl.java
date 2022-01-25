package com.wjl.srb.core.service.impl;

import com.wjl.srb.core.pojo.entity.UserInfo;
import com.wjl.srb.core.mapper.UserInfoMapper;
import com.wjl.srb.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author wangjialun
 * @since 2022-01-24
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
