package raven.github.spring.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * program: starter_demo
 * description:
 *
 * @author WuSz
 * @date 2020-03-27 21:50
 **/
@Configuration
@EnableConfigurationProperties(HttpProperties.class)
public class HttpAutoConfiguration {

    @Resource
    private HttpProperties httpProperties;

    @Bean
    @ConditionalOnMissingBean
    public HttpClient init() {
        HttpClient httpClient = new HttpClient();
        String url = httpProperties.getUrl();
        httpClient.setUrl(url);
        return httpClient;
    }

}
