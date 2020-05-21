package personal.gene.scdemofeign.client;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class ServiceFallBack implements FallbackFactory<ServiceFeignClient> {

	@Override
	public ServiceFeignClient create(Throwable cause) {
		return new ServiceFeignClient() {

			@Override
			public Object index() {
				return "使用Feign进行服务调用发生错误！";
			}
		};
	}

}
