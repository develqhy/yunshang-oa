package com.yunshang.oa.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yunshang.oa.mapper.RoleMapper;
import com.yunshang.oa.model.Role;
import com.yunshang.oa.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * @author: qhy
 * @date: 2024-03-10 16:03
 * @description: 角色管理业务层
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper,Role> implements RoleService {
}
