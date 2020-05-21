package personal.gene.scdemofeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value="scdemo1", fallback=ServiceFallBack.class)
public interface ServiceFeignClient {

	@GetMapping("/index")
	public Object index();
}
