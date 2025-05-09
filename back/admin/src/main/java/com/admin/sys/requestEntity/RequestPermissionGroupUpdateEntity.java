package com.admin.sys.requestEntity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 管理组 修改
 *
 * @author
 * @email
 * @date
 */
@Data
public class RequestPermissionGroupUpdateEntity {

    @NotBlank(message = "管理组id不能为空")
    @ApiModelProperty(value = "管理组id", required = true)
    private String permissionGroupId;

    @NotBlank(message = "管理组名不能为空")
    @ApiModelProperty(value = "管理组名", required = true)
    private String name;

    @NotBlank(message = "权限菜单id不能为空")
    @ApiModelProperty(value = "权限菜单id(多个逗号隔开)", required = true)
    private String menuId;

}
