package com.yunshang.oa.service;

import com.yunshang.oa.model.Role;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author qhy
 * @create 2024-03-10 16:06
 */
@SpringBootTest
class RoleServiceTest {

    @Autowired
    private RoleService roleService;

    @Test
    public void list() {

        List<Role> list = roleService.list();
        for (Role role : list) {
            System.out.println(role);
        }

    }

}