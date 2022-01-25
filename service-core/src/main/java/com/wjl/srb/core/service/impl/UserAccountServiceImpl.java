package com.wjl.srb.core.service.impl;

import com.wjl.srb.core.pojo.entity.UserAccount;
import com.wjl.srb.core.mapper.UserAccountMapper;
import com.wjl.srb.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author wangjialun
 * @since 2022-01-24
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
