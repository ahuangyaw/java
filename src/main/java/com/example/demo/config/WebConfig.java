package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * author : hwang
 * date : 2024/1/13 14:48
 * description : WebConfig
 * 跨域处理
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 设置允许跨域的路径
        registry.addMapping("/**") // 允许跨域访问的路径
                .allowedOrigins("http://localhost:5173/") // 允许跨域访问的源
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE") // 允许请求方法
                .maxAge(168000) // 预检间隔时间，单位为秒，此处设置为7天
                .allowedHeaders("*") // 允许头部设置
                .allowCredentials(true); // 是否发送cookie
    }

}
