package fby.filmmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 *  项目启动类
 */
//因为启动类和其他包没有在同一包下，所以在启动的时候要进行扫描
//@EntityScan("fby.filmmanage.entity")
//@EnableJpaRepositories(basePackages = {"fby.filmmanage.jpa"})
//@ComponentScan(basePackages = {"fby.filmmanage.controller", "fby.filmmanage.service", "fby.filmmanage.service.Impl"})
@EnableJpaAuditing         // 为@CreatDate等注解有效，在类上面添加该注解
@SpringBootApplication
public class FilmManageApplication{
//    打包成war包时开启
//public class FilmManageApplication extends SpringBootServletInitializer{
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
////        return builder.sources(FilmManageApplication.class);
//        return super.configure(builder);
//    }

    public static void main(String[] args) {
        SpringApplication.run(FilmManageApplication.class, args);
    }
}
