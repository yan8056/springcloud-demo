package personal.gene.scdemoribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/index")
public class IndexController {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping()
	@ResponseBody
	@HystrixCommand(fallbackMethod="ribbonFallBack")
	public Object index() {
		return restTemplate.postForObject("http://scdemo1/index", null, Object.class);
	}
	
	public Object ribbonFallBack() {
		return "使用Ribbon+RestTemplate进行服务调用发生错误！";
	}
}
