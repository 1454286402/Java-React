package com.admin.sys.dao;

import com.admin.sys.entity.ClientUserChatEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

/**
 * 用户聊天记录表
 * @author
 * @email
 * @date
 */
@Mapper
public interface ClientUserChatDao extends BaseMapper<ClientUserChatEntity> {

}
