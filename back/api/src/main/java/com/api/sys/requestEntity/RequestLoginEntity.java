package com.api.sys.requestEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
@ApiModel
public class RequestLoginEntity {

    @NotBlank(message = "账号不能为空")
    @ApiModelProperty(value = "base64加密账号", required = true)
    private String account;

    @ApiModelProperty(value = "base64加密密码")
    private String password;

    @ApiModelProperty(value = "验证码")
    private String code;
}
