package com.api.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.api.sys.entity.ClientAreaTypeEntity;
import java.util.List;
import java.util.Map;


/**
 * 地区分类表
 * @author
 * @email
 * @date
 */
public interface ClientAreaTypeService extends IService<ClientAreaTypeEntity> {
    /**
    * 地区分类表-列表
    * @return
    */
    List<ClientAreaTypeEntity> clientAreaTypeList();
}

