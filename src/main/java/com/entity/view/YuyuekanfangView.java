package com.entity.view;

import com.entity.YuyuekanfangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 预约看房
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-05 14:22:25
 */
@TableName("yuyuekanfang")
public class YuyuekanfangView  extends YuyuekanfangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuyuekanfangView(){
	}
 
 	public YuyuekanfangView(YuyuekanfangEntity yuyuekanfangEntity){
 	try {
			BeanUtils.copyProperties(this, yuyuekanfangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
