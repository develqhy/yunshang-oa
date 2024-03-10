package com.yunshang.oa.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: qhy
 * @date: 2024-03-10 14:27
 * @description: 角色实体
 */
@EqualsAndHashCode(callSuper = false)
@Data
@TableName("role")
public class Role extends BaseEntity{

    public static final long serialVersionUID = 1L;

    @TableField("role_name")
    private String roleName;
    @TableField("role_code")
    private String roleCode;
    @TableField("description")
    private String description;

}
