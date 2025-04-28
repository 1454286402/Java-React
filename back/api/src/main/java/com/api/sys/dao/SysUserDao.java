package com.api.sys.dao;

import com.api.sys.entity.SysUserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

/**
 * 系统管理员
 * @author
 * @email
 * @date
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {

}
