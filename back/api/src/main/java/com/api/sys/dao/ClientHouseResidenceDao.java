package com.api.sys.dao;

import com.api.sys.entity.ClientHouseResidenceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

/**
 * 房源房型关联表
 * @author
 * @email
 * @date
 */
@Mapper
public interface ClientHouseResidenceDao extends BaseMapper<ClientHouseResidenceEntity> {

}
