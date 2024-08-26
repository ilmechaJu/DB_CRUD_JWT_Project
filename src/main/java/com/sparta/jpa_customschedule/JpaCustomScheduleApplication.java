package com.sparta.jpa_customschedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JpaCustomScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaCustomScheduleApplication.class, args);
    }

}
