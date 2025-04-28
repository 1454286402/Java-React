package com.admin.sys.requestEntity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 用户管理-删除
 *
 * @author
 * @email
 * @date
 */
@Data
public class RequestClientUserDeleteEntity {
    @NotBlank(message = "用户id不能为空")
    @ApiModelProperty(value = "用户id")
    private String userId;
}
