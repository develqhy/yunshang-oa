package com.yunshang.oa.controller;

import com.yunshang.oa.model.Role;
import com.yunshang.oa.result.CommonResult;
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
    public CommonResult getAll() {
        List<Role> list = roleService.list();
        return CommonResult.ok(list);
    }

}
