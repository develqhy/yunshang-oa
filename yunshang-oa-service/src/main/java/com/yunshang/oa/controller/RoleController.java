package com.yunshang.oa.controller;

import com.yunshang.oa.model.Role;
import com.yunshang.oa.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: qhy
 * @date: 2024-03-10 16:14
 */
@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/findAll")
    public List<Role> getAll() {
        return roleService.list();
    }

}
