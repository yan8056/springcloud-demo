- Service1：6001/6003
  - web
  - test
  - eureka-client
  - config
  - actuator

- Service2：6002
  - web
  - test
  - eureka-client
  - config
  - actuator

- Eureka：5000
  - eureka-server

- Config：7000
  - config-server

- ConsumerFeign：6005
  - openfeign
  - feign集成了ribbon负载均衡和hystrix熔断，替代了繁琐的resttemplate——只需要引入feign即可

- ConsumerRibbon：6006
  - hystrix
  - hystrix-javanica
  - ribbon

- Zuul：4000
  - eureka-client
  - hystrix
  - zuul

- 另外：

  - zipkin：链路追踪、bus：、consul：服务注册与发现及配置管理、gateway：网关、sleuth：分布式跟踪的自动配置、zookeeper：分布式一致性协调、

- Alibaba

  - Sentinel：流量降级、熔断降级、系统负载保护
  - Nacos：注册中心（eureka）、负载均衡（ribbon）、配置中心（config）

- 自动化部署：Jenkins

  - 下载war包：<http://mirrors.jenkins.io/war-stable/版本号/jenkins.war>

  - 命令行：`java -jar jenkins.war --httpPort=9000`

  - 浏览器访问：<http://localhost:9000/> 

  - 按提示输入密码

  - 安装插件。如果遇到无法连接到jenkins可访问<http://localhost:9000/pluginManager/advanced> 

    修改更新站点为：<http://updates.jenkins.io/update-center.json>仍然下载失败可更改为清华镜像库<https://mirrors.tuna.tsinghua.edu.cn/jenkins/updates/update-center.json> 

