package com.api.sys.dao;

import com.api.sys.entity.ClientHouseMatchEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

/**
 * 房源配套关联表
 * @author
 * @email
 * @date
 */
@Mapper
public interface ClientHouseMatchDao extends BaseMapper<ClientHouseMatchEntity> {
    /***
     * 房源配套关联表-列表
     * @return
     */
    List<ClientHouseMatchEntity> ClientHouseMatchList();
}
