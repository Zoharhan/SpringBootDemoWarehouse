package com.zohar.springboot.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyServerConfig {

//    //注册三大组件
//    @Bean
//    public ServletRegistrationBean myServlet(){
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new MyServlet(),"/myServlet");
//        registrationBean.setLoadOnStartup(1);
//        return registrationBean;
//    }
//
//    @Bean
//    public FilterRegistrationBean myFilter(){
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        registrationBean.setFilter(new MyFilter());
//        registrationBean.setUrlPatterns(Arrays.asList("/hello","/myServlet"));
//        return registrationBean;
//    }
//
//    @Bean
//    public ServletListenerRegistrationBean myListener(){
//        ServletListenerRegistrationBean<MyListener> registrationBean = new ServletListenerRegistrationBean<>(new MyListener());
//        return registrationBean;
//    }

//
//    //配置嵌入式的Servlet容器
//    @Bean
//    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
//        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
//            //定制嵌入式的Servlet容器相关的规则
//            @Override
//            public void customize(ConfigurableWebServerFactory factory) {
//                factory.setPort(8081);
//            }
//        };
//    }

}
