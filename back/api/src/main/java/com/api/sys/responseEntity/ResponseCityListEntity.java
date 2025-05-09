package com.api.sys.responseEntity;

import com.api.sys.entity.SysAreaEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel
public class ResponseCityListEntity {
    @ApiModelProperty(value = "城市列表")
    private List<SysAreaEntity> list;
    @ApiModelProperty(value = "拼音首字母")
    private String pingYin;
}
