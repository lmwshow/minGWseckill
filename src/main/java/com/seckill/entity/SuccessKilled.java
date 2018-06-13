package com.seckill.entity;

import java.util.Date;

/**
 * 成功秒杀实体
 * 
 * @author minGW
 */
public class SuccessKilled {

	private long seckillId;

	private long userPhone;

	private short state;

	private Date creteTime;

	// 变通
	// 多对一的复合属性，如何赋值 看Mybatis的实现
	private Seckill seckill;

	public long getSeckillId() {
		return seckillId;
	}

	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}

	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	public short getState() {
		return state;
	}

	public void setState(short state) {
		this.state = state;
	}

	public Date getCreteTime() {
		return creteTime;
	}

	public void setCreteTime(Date creteTime) {
		this.creteTime = creteTime;
	}

	public Seckill getSeckill() {
		return seckill;
	}

	public void setSeckill(Seckill seckill) {
		this.seckill = seckill;
	}

	@Override
	public String toString() {
		return "SuccessKilled [seckillId=" + seckillId + ", userPhone=" + userPhone + ", state=" + state
				+ ", creteTime=" + creteTime + "]";
	}

}
