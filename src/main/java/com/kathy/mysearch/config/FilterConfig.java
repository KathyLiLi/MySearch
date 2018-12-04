package com.kathy.mysearch.config;

import com.kathy.mysearch.filter.CROSFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class FilterConfig {
    
    @Bean
    public FilterRegistrationBean<CharacterEncodingFilter> addFilter() {

        FilterRegistrationBean<CharacterEncodingFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("encodingFilter");
        registrationBean.setFilter(new CharacterEncodingFilter("UTF-8"));
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean addCrosFilter() {

        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("crosFilter");
        registrationBean.setFilter(new CROSFilter());
        return registrationBean;
    }
}
