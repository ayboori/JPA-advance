package com.sparta.jpaadvance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // 있어야 Timestamp 사용 가능!
public class JpaAdvanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaAdvanceApplication.class, args);
    }

}
