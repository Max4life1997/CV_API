package com.example.cvapi2.test.api;

import com.example.cvapi2.config.RequestSpec;
import com.example.cvapi2.environment.Environment;
import io.qameta.allure.Epic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Epic("Тестовый проект для CV")
public class BaseTest {


    @Autowired
    public Environment environment;

    @Autowired
    public RequestSpec requestSpec;


}
