package com.api.sys.requestEntity;

import com.common.utils.page.BasePageEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@ApiModel
public class RequestUserAmountRecordListEntity  extends BasePageEntity {
    @ApiModelProperty(value = "用户id",hidden = true)
    private String userId;

    @ApiModelProperty(value = "房源名称")
    private String houseName;

    @ApiModelProperty(value = "操作符（+或-）")
    private String operator;

}
