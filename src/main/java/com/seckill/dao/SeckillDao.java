package com.seckill.dao;

import org.apache.ibatis.annotations.Param;
import com.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 秒杀库存DAO接口
 * 
 * @author minGW
 */
public interface SeckillDao {

	/**
	 * 减库存
	 * 
	 * @param seckillId
	 * @param killTime
	 * @return 如果影响行数等于>1，表示更新的记录行数
	 *
	 *  注解 @Param 可以帮助Mybatis 识别多个形参，只有一个参数时，Mybatis可以自动识别
	 *  因为java没有保存形参的记录:queryAll(int offset, int limit) -> queryAll(arg1,arg2)
	 */
	int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

	/**
	 * 根据id查询秒杀对象
	 * 
	 * @param seckillId
	 * @return
	 */
	Seckill queryById(long seckillId);

	/**
	 * 根据偏移量查询秒杀商品列表
	 * 
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * 使用存储过程执行秒杀
	 * 
	 * @param paramMap
	 */
	void killByProcedure(Map<String, Object> paramMap);

}
