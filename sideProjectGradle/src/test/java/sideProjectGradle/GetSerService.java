package sideProjectGradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class GetSerService {
	
	@Autowired
	RedisTemplate<String, Object> redisTemplate;
	
	public void test() {
		ValueOperations<String, Object> vop = redisTemplate.opsForValue();
		vop.set("jdkSerial", "jdk");
		String result = (String) vop.get("jdkSerial");
		System.out.println(result);
	}

}
