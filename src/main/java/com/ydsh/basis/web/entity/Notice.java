/**
 * @filename:Notice 2019-06-17 11:42:05
 * @project ydsh-saas-service-basis  V1.0
 * Copyright(c) 2020 姚仲杰 Co. Ltd. 
 * All right reserved. 
 */
package com.ydsh.basis.web.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**   
 * <p>代码自动生成，请勿修改</p>
 * 
 * <p>说明： 表注释实体类</P>
 * @version: V1.0
 * @author: 姚仲杰
 * 
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Notice implements Serializable {

	private static final long serialVersionUID = 1560742925458L;
	
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(name = "id" , value = "主键ID")
	private Long id;
	@ApiModelProperty(name = "deleteStatus" , value = "删除逻辑字段")
	private Integer status;
	@ApiModelProperty(name = "noticeTitle" , value = "公告标题")
	@NotNull(message = "公告标题不允许为空")
	private String noticeTitle;
	@ApiModelProperty(name = "noticeContent" , value = "公告内容")
	private String noticeContent;
	@ApiModelProperty(name = "noticeType" , value = "公告类型")
	@NotNull(message = "公告类型不允许为空")
	private String noticeType;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@ApiModelProperty(name = "beginTime" , value = "开始时间")
	private Date beginTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@ApiModelProperty(name = "endTime" , value = "结束时间")
	private Date endTime;
	@ApiModelProperty(name = "publishSystem" , value = "发布系统")
	@NotNull(message = "发布系统不允许为空")
	private String publishSystem;
	@ApiModelProperty(name = "publishRole" , value = "发布角色")
	@NotNull(message = "发布角色不允许为空")
	private String publishRole;
	@ApiModelProperty(name = "publishStatus" , value = "状态")
	private String publishStatus;
	@ApiModelProperty(name = "createId" , value = "创建人")
	private Long createId;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@ApiModelProperty(name = "createTime" , value = "创建时间")
	@TableField(fill= FieldFill.INSERT_UPDATE)
	private Date createTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@ApiModelProperty(name = "publishTime" , value = "发布时间")
	private Date publishTime;
	/**
	 * 新增的属性  不属于数据库字段
	 */
	@ApiModelProperty(name = "ids" , value = "批量操作的id集合")
	@TableField(exist = false)
	protected List<Integer> ids;

	@ApiModelProperty(name = "updateSign" , value = "删除为 removeNotice，发布为publish，关闭为 close，")
	@TableField(exist = false)
	private String updateSign;
}
