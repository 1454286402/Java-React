package com.api.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;


/**
 * 房源房型关联表
 *
 * @author
 * @email
 * @date
 */
@Data
@TableName("client_house_residence")
public class ClientHouseResidenceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增主键
	 */
	@TableId
	private Long id;
	/**
	 * 房源id（client_house表id）
	 */
	private Long houseId;
	/**
	 * 房型id（client_type_residence表id）
	 */
	private Long residenceId;
	/**
	 * 创建时间
	 */
	private LocalDateTime createTime;
	/**
	 * 更新时间
	 */
	private LocalDateTime updateTime;

}
