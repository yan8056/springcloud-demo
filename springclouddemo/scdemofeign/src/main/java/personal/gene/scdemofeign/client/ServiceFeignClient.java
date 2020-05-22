package personal.gene.scdemofeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value="scdemo1", fallbackFactory=ServiceFallBack.class) // 此处fallback可为方法、类、类工厂等，但注意属性需对应
public interface ServiceFeignClient {

	@GetMapping("/index")
	public String index();
}
