package personal.gene.scdemoconfig.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

	@GetMapping()
	@ResponseBody
	public Object index() {
		return "Welcome Scdemoconfig!";
	}
}
