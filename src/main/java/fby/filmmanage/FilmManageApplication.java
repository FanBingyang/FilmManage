package fby.filmmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *  项目启动类
 */
//因为启动类和其他包没有在同一包下，所以在启动的时候要进行扫描
//@EntityScan("fby/filmmanage/entity")
//@EnableJpaRepositories(basePackages = {"fby.filmmanage.jpa"})
//@ComponentScan(basePackages = {"fby.filmmanage.controller", "fby.filmmanage.service", "fby.filmmanage.service.Impl"})
@EnableJpaAuditing         // 为@CreatDate等注解有效，在类上面添加该注解
@SpringBootApplication
public class FilmManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(FilmManageApplication.class, args);
    }
}
