package xdu.backend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    LoginInterceptor loginInterceptor;

    @Autowired
    AdminLoginInterceptor adminLoginInterceptor;

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        List<String> irs = new ArrayList<>();
//        irs.add("/login");
//        irs.add("/register");
//        irs.add("/admin/**");
//        irs.add("/deletebook");
//        irs.add("/addbook");
//        irs.add("/lendout");
//        InterceptorRegistration interceptor = registry.addInterceptor(adminLoginInterceptor);
//        interceptor.addPathPatterns("/admin/**");
//        interceptor.excludePathPatterns("/admin/login");
//
//        InterceptorRegistration ir = registry.addInterceptor(loginInterceptor);
//        ir.addPathPatterns("/**");
//        ir.excludePathPatterns(irs);
//    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedHeaders("*")
                .allowedOriginPatterns("*")
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
                .maxAge(3600)
                .allowCredentials(true);
    }
}
