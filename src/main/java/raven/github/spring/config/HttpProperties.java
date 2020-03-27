package raven.github.spring.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * program: starter_demo
 * description: 配置信息
 *
 * @author WuSz
 * @date 2020-03-27 21:25
 **/
@ConfigurationProperties(prefix = "http")
@Setter
@Getter
public class HttpProperties {

    private String url = "https://github.com/";

}
