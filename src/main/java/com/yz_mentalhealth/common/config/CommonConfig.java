package com.yz_mentalhealth.common.config;

import com.yz_mentalhealth.common.component.LoginHandlerInterceptor;
import com.yz_mentalhealth.common.component.zmgLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CommonConfig implements WebMvcConfigurer {

    /**
     * 视图映射
     * @param registry
     */
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("main");
    }

    /**
     * 注册拦截器
     * @param registry
     */
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).
                addPathPatterns("/**").
                excludePathPatterns("/index.html","/","/login/isLogin","/webjars/**","/asserts/**","/favicon.ico");
    }

    /**
     * 覆盖自带的localeResolver区域解析器
     * @return
     */
    @Bean
    public LocaleResolver localeResolver(){
        return new zmgLocaleResolver();
    }
}
