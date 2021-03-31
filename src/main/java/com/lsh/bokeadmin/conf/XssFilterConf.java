package com.lsh.bokeadmin.conf;

import cn.hutool.core.util.StrUtil;
import com.lsh.birthdayadmin.filter.XssFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.DispatcherType;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class XssFilterConf {
    @Value("${xss.enabled}")
    private String enabled;
    @Value("${xss.excludes}")
    private String excludes;
    @Value("${xss.urlPatterns}")
    private String urlPatterns;
    
    @Bean
    public FilterRegistrationBean xssFilterRegistration() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setDispatcherTypes(DispatcherType.REQUEST);
        registrationBean.setFilter(new XssFilter());
        registrationBean.addUrlPatterns(StrUtil.split(urlPatterns,","));
        registrationBean.setName("XssFilter");
        registrationBean.setOrder(9999);
        Map<String,String> initParameters = new HashMap<>();
        initParameters.put("excludes",excludes);
        initParameters.put("enabled",enabled);
        registrationBean.setInitParameters(initParameters);
        return registrationBean;
    }
}
