package com.api.sys.dao;

import com.api.sys.entity.SysPermissionGroupEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

/**
 * 权限组
 * @author 
 * @email 
 * @date
 */
@Mapper
public interface SysPermissionGroupDao extends BaseMapper<SysPermissionGroupEntity> {
    /***
     * 权限组-列表
     * @return
     */
    List<SysPermissionGroupEntity> SysPermissionGroupList();

    /***
     * 权限组-列表-总数
     * @return
     */
    Integer SysPermissionGroupListTotal();
}
