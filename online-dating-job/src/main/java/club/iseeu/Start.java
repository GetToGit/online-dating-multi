package club.iseeu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("club.iseeu.dao")
@SpringBootApplication

public class Start {
    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
    }
}