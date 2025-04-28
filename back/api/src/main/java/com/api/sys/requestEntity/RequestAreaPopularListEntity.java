package com.api.sys.requestEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author
 * @description: 用户常用地区-列表
 * @date
 */
@Data
@ApiModel
public class RequestAreaPopularListEntity {

    @NotBlank(message = "所属地区分类id不能为空")
    @ApiModelProperty(value = "所属地区分类id",required = true)
    private String areaTypeId;

    @NotBlank(message = "所属城市编码不能为空")
    @ApiModelProperty(value = "所属城市编码",required = true)
    private String treeCode;

}
