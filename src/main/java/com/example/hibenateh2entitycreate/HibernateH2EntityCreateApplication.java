package com.example.hibenateh2entitycreate;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class HibernateH2EntityCreateApplication {

    private final DbH2Initializer initializer;

    public static void main(String[] args) {
        SpringApplication.run(HibernateH2EntityCreateApplication.class, args);
    }

    @Bean
    InitializingBean initData() {
        log.debug("Initialize H2 sample data");
        return initializer::initSampleData;
    }

}
