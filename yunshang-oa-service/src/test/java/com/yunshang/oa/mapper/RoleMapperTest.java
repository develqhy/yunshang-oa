package com.yunshang.oa.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yunshang.oa.model.Role;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

/**
 * @author qhy
 * @create 2024-03-10 14:56
 */
@SpringBootTest
@Slf4j
class RoleMapperTest {

    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void queryAll() {
        List<Role> list = roleMapper.selectList(null);
        log.info("===查询结果: {}",list);
    }

    @Test
    public void add() {
        Role role = new Role();
        role.setRoleName("test1");
        role.setRoleCode("20111");
        role.setDescription("8888");
        int rows = roleMapper.insert(role);
        log.info("ID: {}",role.getId());
        log.info("===已添加{}条记录",rows);
    }

    @Test
    public void edit() {
        Role role = roleMapper.selectById(12);
        role.setRoleName("haha");
        int rows = roleMapper.updateById(role);
        log.info("===已修改{}条记录",rows);
    }

    @Test
    public void delRoleById() {
        int rows = roleMapper.deleteById(4);
        log.info("===已逻辑删除{}条记录",rows);
    }

    @Test
    public void delRoleByIds() {
        int result = roleMapper.deleteBatchIds(Arrays.asList(1,2,3));
        log.info("===批量删除{}条记录",result);

    }

    @Test
    public void queryById() {
        Role role = roleMapper.selectById(4);
        log.info("===查询结果: {}",role);
    }

    @Test
    public void conditionalQuery1() {

        LambdaQueryWrapper<Role> objectLambdaQueryWrapper = new LambdaQueryWrapper<>();
        objectLambdaQueryWrapper.eq(Role::getRoleName,"总经理");
        List<Role> list = roleMapper.selectList(objectLambdaQueryWrapper);
        log.info("===查询结果: {}",list);

    }

    @Test
    public void conditionalQuery2() {

        QueryWrapper<Role> objectQueryWrapper = new QueryWrapper<>();
        objectQueryWrapper.eq("role_name","总经理");
        List<Role> list = roleMapper.selectList(objectQueryWrapper);
        log.info("===查询结果: {}",list);

    }

}