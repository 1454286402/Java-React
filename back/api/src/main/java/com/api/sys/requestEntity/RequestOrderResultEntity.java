package com.api.sys.requestEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
@ApiModel
public class RequestOrderResultEntity {
    @NotBlank(message = "订单编号不能为空")
    @ApiModelProperty(value = "订单编号")
    private String out_trade_no;
}
