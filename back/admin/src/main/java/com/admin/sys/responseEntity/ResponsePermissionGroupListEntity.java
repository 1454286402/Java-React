package com.admin.sys.responseEntity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 管理组 列表
 *
 * @author
 * @email
 * @date
 */
@Data
public class ResponsePermissionGroupListEntity {

    @ApiModelProperty(value = "序号")
    private int iid;

    @ApiModelProperty(value = "管理组id")
    private String permissionGroupId;

    @ApiModelProperty(value = "组名")
    private String name;

}
