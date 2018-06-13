package com.seckill.service;


import com.seckill.dto.Exposer;
import com.seckill.dto.SeckillExecution;
import com.seckill.entity.Seckill;
import com.seckill.exception.RepeatKillException;
import com.seckill.exception.SeckillCloseException;
import com.seckill.exception.SeckillException;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 * 
 * @author minGW
 */
public interface SeckillService {

	/**
	 * 查询所有秒杀记录
	 * 
	 * @return
	 */
	List<Seckill> getSeckillList();

	/**
	 * 查询单个秒杀记录
	 * 
	 * @param seckillId
	 * @return
	 */
	Seckill getById(long seckillId);

	/**
	 * 秒杀开启时输出秒杀接口地址，否则输出系统时间和秒杀时间
	 * 避免提前暴露接口,这里需要的数据与业务不相关，用Entity不合适。
	 * 所以需要DTO，数据传输层
	 * @param seckillId
	 * @return
	 */
	Exposer exportSeckillUrl(long seckillId);

	/**
	 * 执行秒杀操作
	 * 
	 * @param seckillId
	 * @param userPhone
	 * @param md5
	 * @return
	 * @throws SeckillException
	 * @throws RepeatKillException
	 * @throws SeckillCloseException
     *
     * 站在使用者的角度，抛出具体异常
	 */
	SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
			throws SeckillException, RepeatKillException, SeckillCloseException;

	/**
	 * 执行秒杀操作by存储过程
	 * 
	 * @param seckillId
	 * @param userPhone
	 * @param md5
	 * @return
	 * @throws SeckillException
	 * @throws RepeatKillException
	 * @throws SeckillCloseException
	 */
	SeckillExecution executeSeckillProcedure(long seckillId, long userPhone, String md5)
			throws SeckillException, RepeatKillException, SeckillCloseException;

}
