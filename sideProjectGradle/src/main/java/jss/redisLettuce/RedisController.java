package jss.redisLettuce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import redisLettuce.*;

@RestController
public class RedisController {

	@Autowired
	GetSetService getSetService;
	@Autowired
	DataService dataService;

	@RequestMapping(value = "/helloRedis", method = RequestMethod.GET)
	public Object testController(MyData myData) {
		System.out.println(myData.getName()+",   "+myData.getStudentId());
		dataService.test();
		
		return myData;
	}

}
