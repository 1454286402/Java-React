package com.admin.sys.requestEntity;

import com.common.utils.page.BasePageEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 账号管理列表
 *
 * @author
 * @email
 * @date
 */
@Data
public class RequestUserListEntity extends BasePageEntity {

    @ApiModelProperty(value = "账号")
    private String keyword;

}
