package com.example.cvapi2.environment;

import org.springframework.stereotype.Component;


@Component
public class StaticEnvironment {

    Environment environment;

    StaticEnvironment(Environment environment) {
        this.environment = environment;
    }

}
