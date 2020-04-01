package redisLettuce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

	@Autowired
	GetSetService getSetService;

	@RequestMapping(value = "/helloRedis")
	public String testController() {
		getSetService.test();
		
		return "hello";
	}

}
