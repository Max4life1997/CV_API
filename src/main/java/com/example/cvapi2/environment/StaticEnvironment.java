package com.example.cvapi2.environment;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class StaticEnvironment {

    public static Environment appEnv;

    Environment environment;

    StaticEnvironment(Environment environment) {
        this.environment = environment;
    }

    @PostConstruct
    private void init() {
        appEnv = this.environment;
    }

}
