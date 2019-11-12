package org.improving.pim;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMVC implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/images/**").addResourceLocations("classpath:/images/");
        registry.addResourceHandler("/CSS/**").addResourceLocations("classpath:/CSS/");
        registry.addResourceHandler("/bootstrap/**").addResourceLocations("classpath:/bootstrap/");
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
    }
//    @Bean
//    public ServletRegistrationBean exampleServletBean(){
//        ServletRegistrationBean bean = new ServletRegistrationBean(new ExampleServlet(), "/exampleServlet");
//        bean.setLoadOnStartup(1);
//        return bean;
//    }
}
