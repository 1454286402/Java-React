package com.admin.sys.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户管理-excel导入模板实体类
 * @Auther
 * @Date
 **/
@Data
public class ClientUserImportEntity {

    @ExcelProperty("账号")
    private String account;

    @ExcelProperty(value = "昵称")
    private String nickName;

    @ExcelProperty("姓名")
    private String name;

    @ExcelProperty("手机号")
    private String phone;

    @ExcelProperty("性别(0男 1女)")
    private String sex;

    @ExcelProperty("找回密码邮箱")
    private String email;
}
