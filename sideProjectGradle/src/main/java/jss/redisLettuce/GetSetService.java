package jss.redisLettuce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class GetSetService {
	
	@Autowired
	RedisTemplate<String, Object> redisTemplate;
	
	public void test() {
		String result;
		String key = "test";
		String value = "1234";
		ValueOperations<String, Object> vop = redisTemplate.opsForValue();
		vop.set(key, value);
		result = (String) vop.get(key);
		System.out.println(result);
	}

}
