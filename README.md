# springcloud
springcloud全家桶
eureka-server
eureka-client
config-server
config-server-client  通过config-server获取配置，通过eureka-server作为中间服务
eureka-server-cloud，eureka-server集群
feign使用，调用eureka的服务，脱离eureka调用，feign配置，手动构建feign，feign进行文件上传调用
hystrix断路器单独使用
feign结合hystrix使用
ribbon负载均衡器使用
hystrix-dashboard，断路器监控视图
turbine，通常结合hystrix-dashboard使用，断路器监控视图
sidecar，桥接非java语言的服务注册到eureka注册中心
zuul网关，反向代理服务名与url的匹配规则，反向代理相关配置，zuul过滤器使用，zuul整合hystrix回调函数使用。
zuul-regexp，网关反向代理路由利用正则表达式规则匹配。
