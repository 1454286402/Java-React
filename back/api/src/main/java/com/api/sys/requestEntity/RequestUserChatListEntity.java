package com.api.sys.requestEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**

 * @description: 用户聊天记录列表

 */
@Data
@ApiModel
public class RequestUserChatListEntity {
    @NotBlank(message = "当前用户id不能为空")
    @ApiModelProperty(value = "当前用户id", required = true)
    private String currentUserId;

    @ApiModelProperty(value = "对方用户id")
    private String otherUserId;
}
