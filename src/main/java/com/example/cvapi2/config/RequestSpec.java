package com.example.cvapi2.config;

import com.example.cvapi2.environment.Environment;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RequestSpec {

    @Autowired
    Environment environment;


    public RequestSpecification requestSpecification;

    public void testMeth() {
        System.out.println(environment.baseUrl);
    }

    RequestSpec(Environment environment) {
        this.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(environment.baseUrl)
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.BODY)
                .build();
    }

}
