package prac.jhkim.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import prac.jhkim.redis.service.RedisRepositoryService;

@SpringBootApplication
public class RedisApplication {

    public static void main(String[] args) {

        SpringApplication.run(RedisApplication.class, args);
    }

}
