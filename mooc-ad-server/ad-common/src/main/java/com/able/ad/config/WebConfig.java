package com.able.ad.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
@Slf4j
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void configureMessageConverters(
            List<HttpMessageConverter<?>> converters) {
        for (HttpMessageConverter<?> converter : converters) {
            log.info("转换器为:{}",converter);
        }
        converters.clear();
        //将java对象转成json对象
        converters.add(new MappingJackson2HttpMessageConverter());
    }
}
