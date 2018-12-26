package by.peekhovsky.restview.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Rostislav Pekhovsky 2018
 */

@SpringBootApplication
@ComponentScan(basePackages = "by.peekhovsky.restview")
@EnableJpaRepositories(basePackages = "by.peekhovsky.restview.repository")
@EntityScan(basePackages = "by.peekhovsky.restview.model")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
