package com.liuyao.redis.test;

import java.util.Map;

import redis.clients.jedis.Jedis;

public class ConnectionTest {
	
	
	public static void main(String[] args) {

		Jedis jedis = new Jedis("www.chh520.pw");
		jedis.blpop(10, "list");
		Map<String,String> result = jedis.hgetAll("article:100");
		System.out.println(jedis.getrange("name", 0, -1));
		System.out.println(result);
	}
}
