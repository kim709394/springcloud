import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

/**
 * @author huangjie
 * @description
 * @date 2020/5/24
 */
public class ZuulRegexpApplication {

    /**
     * 利用服务名的正则表达式进行匹配反向代理，例如：
     * 服务名为：springcloud-feign-comsumer-version1
     * 则反向代理的路径是:/version1/springcloud-feign-comsumer-one/**
     * 如果无法匹配，将进行缺省，以完全匹配:/服务名/**
     * */
    @Bean
    public PatternServiceRouteMapper serviceRouteMapper() {
        return new PatternServiceRouteMapper(
                "(?<name>^.+)-(?<version>v.+$)",
                "${version}/${name}");
    }

    public static void main(String[] args) {
        SpringApplication.run(ZuulRegexpApplication.class);
    }
}
