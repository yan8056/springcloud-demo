package personal.gene.scdemofeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import personal.gene.scdemofeign.client.ServiceFeignClient;

@RestController
@RequestMapping("/index")
public class IndexController {
	
	@Autowired
	private ServiceFeignClient serviceFeignClient;

	@GetMapping()
	@ResponseBody
	public Object index() {
		return serviceFeignClient.index();
	}
}
