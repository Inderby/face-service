package com.example.wellibee;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableMongoRepositories("com.example.wellibee.repository")
@ComponentScan({
        "com.example.wellibee.*"
})
@EnableEncryptableProperties
@EnableWebMvc
public class WellibeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(WellibeeApplication.class, args);
    }

}
