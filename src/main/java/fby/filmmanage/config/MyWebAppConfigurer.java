package fby.filmmanage.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 程佩
 * @datatime 2019/10/22 9:57
 * 添加本地磁盘映射
 */
@Configuration
public class MyWebAppConfigurer implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resource/**").addResourceLocations("file:F:/MyProjectDatabase/FilmManage/");
//        registry.addResourceHandler("/movie/**").addResourceLocations("file:E:/static/");
    }
}
//取值：localhost:8080/image/test.png