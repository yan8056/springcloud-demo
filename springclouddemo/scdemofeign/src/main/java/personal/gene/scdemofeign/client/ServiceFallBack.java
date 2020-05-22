package personal.gene.scdemofeign.client;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;


@Component
public class ServiceFallBack implements FallbackFactory<ServiceFeignClient> {

	@Override
	public ServiceFeignClient create(Throwable cause) {
		// 可能会遇到以下问题，需要编写消息转换器
		// feign.codec.DecodeException: Could not extract response: no suitable HttpMessageConverter found for response type
		return new ServiceFeignClient() {
			@Override
			public String index() {
				return "使用Feign进行服务调用发生错误！";
			}
		};
	}

}
