package com.api.sys.requestEntity;

import com.api.sys.entity.SysNoticeEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@Data
@ApiModel
public class RequestNoticeDeleteEntity {
    @ApiModelProperty(value = "通知id", required = true)
    private List<String> noticeIds;
}
