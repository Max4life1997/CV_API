package com.example.cvapi2.test.api;

import com.example.cvapi2.config.RequestSpec;
import com.example.cvapi2.environment.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BaseTest {


    @Autowired
    public Environment environment;

    @Autowired
    public RequestSpec requestSpec;

}
