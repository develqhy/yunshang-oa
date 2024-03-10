package com.yunshang.oa.result;

import lombok.Data;

/**
 * @author: qhy
 * @date: 2024-03-03 14:45
 * @description: 统一结果返回类
 */
@Data
public class CommonResult<T> {

    private Integer code;
    private String msg;
    private T data;

    private CommonResult() {}

    // 封装返回的数据
    public static<T> CommonResult<T> build(T body, ResultCodeEnum resultCodeEnum) {

        CommonResult<T> result = new CommonResult<>();
        // 封装数据
        if (body != null) {
            result.setData(body);
        }
        // 状态码与返回提示信息
        result.setCode(resultCodeEnum.getCode());
        result.setMsg(resultCodeEnum.getMsg());
        return result;
    }

    // 成功
    public static<T> CommonResult<T> ok() {
        return build(null, ResultCodeEnum.SUCCESS);
    }
    public static<T> CommonResult<T> ok(T data) {
        return build(data, ResultCodeEnum.SUCCESS);
    }

    // 失败
    public static<T> CommonResult<T> fail() {
        return build(null, ResultCodeEnum.Fail);
    }
    public static<T> CommonResult<T> fail(T data) {
        return build(data, ResultCodeEnum.Fail);
    }

    public CommonResult<T> code(Integer code) {
        this.setCode(code);
        return this;
    }
    public CommonResult<T> msg(String msg) {
        this.setMsg(msg);
        return this;
    }

}
