package com.api.sys.dao;

import com.api.sys.entity.ClientAreaTypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

/**
 * 地区分类表
 * @author
 * @email
 * @date
 */
@Mapper
public interface ClientAreaTypeDao extends BaseMapper<ClientAreaTypeEntity> {
    /***
     * 地区分类表-列表
     * @return
     */
    List<ClientAreaTypeEntity> clientAreaTypeList();
}
