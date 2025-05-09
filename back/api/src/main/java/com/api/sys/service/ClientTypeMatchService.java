package com.api.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.api.sys.entity.ClientTypeMatchEntity;
import java.util.List;
import java.util.Map;


/**
 * 房源配套类型表
 * @author
 * @email
 * @date
 */
public interface ClientTypeMatchService extends IService<ClientTypeMatchEntity> {
    /**
    * 房源配套类型表-列表
    * @return
    */
    List<ClientTypeMatchEntity> clientTypeMatchList();

}

