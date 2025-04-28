package com.api.sys.responseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *
 * @description: 查询用户订单入账信息
 *
 */
@Data
@ApiModel
public class ResponseOrderMoneyEntity {

    @ApiModelProperty(value = "已入账")
    private String beenCredited;

    @ApiModelProperty(value = "待入账")
    private String pending;

}
