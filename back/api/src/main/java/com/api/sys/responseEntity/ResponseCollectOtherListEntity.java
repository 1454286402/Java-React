package com.api.sys.responseEntity;

import com.api.sys.entity.SysAreaEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author
 * @description: 查询其他用户的收藏房源
 * @date
 */
@Data
@ApiModel
public class ResponseCollectOtherListEntity {
    @ApiModelProperty(value = "房源id")
    private List<Long> houseIds;
    @ApiModelProperty(value = "用户id")
    private Long userId;
}
