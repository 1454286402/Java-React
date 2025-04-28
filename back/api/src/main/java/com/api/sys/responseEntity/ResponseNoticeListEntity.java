package com.api.sys.responseEntity;

import com.api.sys.entity.SysNoticeEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**

 * @description: 用户通知列表

 */
@Data
@ApiModel
public class ResponseNoticeListEntity {
    @ApiModelProperty("通知列表")
    private List<SysNoticeEntity> list;
    @ApiModelProperty("未读消息总数")
    private int unReadTotal;
}
