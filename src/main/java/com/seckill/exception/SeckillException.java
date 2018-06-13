package com.seckill.exception;

/**
 * 秒杀相关业务异常(运行时异常)
 *
 * 事物只会对运行时异常进行回滚
 * 
 * @author minGW
 *
 *
 */
public class SeckillException extends RuntimeException {

	public SeckillException(String message) {
		super(message);
	}

	public SeckillException(String message, Throwable cause) {
		super(message, cause);
	}

}
