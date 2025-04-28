package com.api.sys.requestEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
@ApiModel
public class RequestClientUserInfoEntity {
    @NotBlank(message = "用户id不能为空")
    @ApiModelProperty(value = "用户id",required = true)
    private String userId;
}
