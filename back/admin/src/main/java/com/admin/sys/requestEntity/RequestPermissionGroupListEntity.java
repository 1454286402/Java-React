package com.admin.sys.requestEntity;

import com.common.utils.page.BasePageEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 管理组列表
 *
 * @author
 * @email
 * @date
 */
@Data
public class RequestPermissionGroupListEntity extends BasePageEntity {

    @ApiModelProperty(value = "组名")
    private String keyword;



}
