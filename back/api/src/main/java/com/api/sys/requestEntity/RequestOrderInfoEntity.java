package com.api.sys.requestEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
@ApiModel
public class RequestOrderInfoEntity {

    @NotBlank(message = "订单id不能为空")
    @ApiModelProperty(value = "订单id,必填", hidden = true)
    private String orderId;

}
