package com.entity.model;

import com.entity.FangchanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 房产信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-02-05 14:22:24
 */
public class FangchanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 户型
	 */
	
	private String huxing;
		
	/**
	 * 房屋类型
	 */
	
	private String fangwuleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 面积
	 */
	
	private String mianji;
		
	/**
	 * 售价
	 */
	
	private Double shoujia;
		
	/**
	 * 房屋朝向
	 */
	
	private String fangwuchaoxiang;
		
	/**
	 * 装修情况
	 */
	
	private String zhuangxiuqingkuang;
		
	/**
	 * 楼层
	 */
	
	private String louceng;
		
	/**
	 * 建立时间
	 */
	
	private String jianlishijian;
		
	/**
	 * 房屋状态
	 */
	
	private String fangwuzhuangtai;
		
	/**
	 * 地理位置
	 */
	
	private String diliweizhi;
		
	/**
	 * 服务详情
	 */
	
	private String fuwuxiangqing;
		
	/**
	 * 经理账号
	 */
	
	private String jinglizhanghao;
		
	/**
	 * 经理姓名
	 */
	
	private String jinglixingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：户型
	 */
	 
	public void setHuxing(String huxing) {
		this.huxing = huxing;
	}
	
	/**
	 * 获取：户型
	 */
	public String getHuxing() {
		return huxing;
	}
				
	
	/**
	 * 设置：房屋类型
	 */
	 
	public void setFangwuleixing(String fangwuleixing) {
		this.fangwuleixing = fangwuleixing;
	}
	
	/**
	 * 获取：房屋类型
	 */
	public String getFangwuleixing() {
		return fangwuleixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：面积
	 */
	 
	public void setMianji(String mianji) {
		this.mianji = mianji;
	}
	
	/**
	 * 获取：面积
	 */
	public String getMianji() {
		return mianji;
	}
				
	
	/**
	 * 设置：售价
	 */
	 
	public void setShoujia(Double shoujia) {
		this.shoujia = shoujia;
	}
	
	/**
	 * 获取：售价
	 */
	public Double getShoujia() {
		return shoujia;
	}
				
	
	/**
	 * 设置：房屋朝向
	 */
	 
	public void setFangwuchaoxiang(String fangwuchaoxiang) {
		this.fangwuchaoxiang = fangwuchaoxiang;
	}
	
	/**
	 * 获取：房屋朝向
	 */
	public String getFangwuchaoxiang() {
		return fangwuchaoxiang;
	}
				
	
	/**
	 * 设置：装修情况
	 */
	 
	public void setZhuangxiuqingkuang(String zhuangxiuqingkuang) {
		this.zhuangxiuqingkuang = zhuangxiuqingkuang;
	}
	
	/**
	 * 获取：装修情况
	 */
	public String getZhuangxiuqingkuang() {
		return zhuangxiuqingkuang;
	}
				
	
	/**
	 * 设置：楼层
	 */
	 
	public void setLouceng(String louceng) {
		this.louceng = louceng;
	}
	
	/**
	 * 获取：楼层
	 */
	public String getLouceng() {
		return louceng;
	}
				
	
	/**
	 * 设置：建立时间
	 */
	 
	public void setJianlishijian(String jianlishijian) {
		this.jianlishijian = jianlishijian;
	}
	
	/**
	 * 获取：建立时间
	 */
	public String getJianlishijian() {
		return jianlishijian;
	}
				
	
	/**
	 * 设置：房屋状态
	 */
	 
	public void setFangwuzhuangtai(String fangwuzhuangtai) {
		this.fangwuzhuangtai = fangwuzhuangtai;
	}
	
	/**
	 * 获取：房屋状态
	 */
	public String getFangwuzhuangtai() {
		return fangwuzhuangtai;
	}
				
	
	/**
	 * 设置：地理位置
	 */
	 
	public void setDiliweizhi(String diliweizhi) {
		this.diliweizhi = diliweizhi;
	}
	
	/**
	 * 获取：地理位置
	 */
	public String getDiliweizhi() {
		return diliweizhi;
	}
				
	
	/**
	 * 设置：服务详情
	 */
	 
	public void setFuwuxiangqing(String fuwuxiangqing) {
		this.fuwuxiangqing = fuwuxiangqing;
	}
	
	/**
	 * 获取：服务详情
	 */
	public String getFuwuxiangqing() {
		return fuwuxiangqing;
	}
				
	
	/**
	 * 设置：经理账号
	 */
	 
	public void setJinglizhanghao(String jinglizhanghao) {
		this.jinglizhanghao = jinglizhanghao;
	}
	
	/**
	 * 获取：经理账号
	 */
	public String getJinglizhanghao() {
		return jinglizhanghao;
	}
				
	
	/**
	 * 设置：经理姓名
	 */
	 
	public void setJinglixingming(String jinglixingming) {
		this.jinglixingming = jinglixingming;
	}
	
	/**
	 * 获取：经理姓名
	 */
	public String getJinglixingming() {
		return jinglixingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
