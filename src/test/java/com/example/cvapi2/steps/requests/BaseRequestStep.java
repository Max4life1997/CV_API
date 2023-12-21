package com.example.cvapi2.steps.requests;

import com.example.cvapi2.data.constant.enums.StatusCode;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

import static io.restassured.RestAssured.given;

@Slf4j
public class BaseRequestStep {

    protected String doGetRequest(String endPoint, StatusCode statusCode, RequestSpecification requestSpec) {
        JsonPath jsonPath = new JsonPath(
                given()
                        .spec(requestSpec)
                        .when()
                        .get(endPoint)
                        .then()
                        .statusCode(statusCode.getStatusCode())
                        .log().all()
                        .extract().asString()
        );
        return jsonPath.prettify();
    }

    protected String doGetRequestWithParam(String endPoint, Map<String, String> pathParams, StatusCode statusCode, RequestSpecification requestSpec) {
        JsonPath jsonPath = new JsonPath(
                given()
                        .spec(requestSpec)
                        .when()
                        .pathParams(pathParams)
                        .get(endPoint)
                        .then()
                        .statusCode(statusCode.getStatusCode())
                        .log().all()
                        .extract().asString()
        );
        return jsonPath.prettify();
    }

    private static String doPostRequest(String endPoint, Object object, StatusCode statusCode,
                                        RequestSpecification requestSpec) {
        JsonPath jsonPath = new JsonPath(
                given()
                        .spec(requestSpec)
                        .when()
                        .body(object)
                        .post(endPoint)
                        .then()
                        .statusCode(statusCode.getStatusCode())
                        .log().all()
                        .extract().asString()
        );
        return jsonPath.prettify();

    }

    private static String doDeleteRequest(String endPoint, StatusCode statusCode, RequestSpecification requestSpec) {
        JsonPath jsonPath = new JsonPath(
                given()
                        .spec(requestSpec)
                        .when()
                        .delete(endPoint)
                        .then()
                        .statusCode(statusCode.getStatusCode())
                        .log().all()
                        .extract().asString()
        );
        return jsonPath.prettify();

    }
}
