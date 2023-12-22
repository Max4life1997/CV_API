package com.example.cvapi2.steps.requests;

import com.example.cvapi2.config.RequestSpec;
import com.example.cvapi2.data.constant.enums.StatusCode;
import com.example.cvapi2.data.dto.User;
import com.example.cvapi2.data.endPoints.UserEndPoints;
import com.example.cvapi2.helper.JsonDTOFormatter;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class UserRequestStep extends BaseRequestStep {

    @Autowired
    UserEndPoints userEndPoints;

    JsonDTOFormatter<User> jsonFormatter = new JsonDTOFormatter();

    @Step("Получить всех пользователей")
    public List<User> getAllUsers(RequestSpec requestSpec) {
        return jsonFormatter.transFormToListObject(doGetRequest(userEndPoints.GET_ALL_USERS, StatusCode.OK, requestSpec.requestSpecification), User.class);
    }

    @Step("Получить пользователя с ID: {id}")
    public User getUserById(int id, RequestSpec requestSpec) {
        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("id", String.valueOf(id));
        return jsonFormatter.transFormToObject(
                doGetRequestWithParam(userEndPoints.GET_USER_BY_ID, pathParams,
                        StatusCode.OK,
                        requestSpec.requestSpecification
                ), User.class);
    }

}
