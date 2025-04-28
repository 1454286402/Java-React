package com.api.sys.requestEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
@ApiModel
public class RequestCityListEntity {

    @ApiModelProperty(value = "是否按拼音排序,0否1是")
    private String orderByPingYin;

}
