package com.example.cvapi2.test.api.user;

import com.example.cvapi2.data.constant.UserConstant;
import com.example.cvapi2.data.dto.User;
import com.example.cvapi2.steps.assertions.UserAssertionsStep;
import com.example.cvapi2.steps.requests.UserRequestStep;
import com.example.cvapi2.test.api.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@DisplayName("Пользователи")
@Tag("users")
public class UserPositiveTest extends BaseTest {


    @Autowired
    UserRequestStep userRequestStep;

    @Autowired
    UserAssertionsStep userAssertionsStep;

    @Test
    @DisplayName("Проверка вызова пользователя по ID")
    @Tag("byId")
    public void checkUserByID() {
        UserConstant userConstant = new UserConstant();
        User testUser = userConstant.getTestUser();
        User responseUser = userRequestStep.getUserById(userConstant.getTestUser().getId(), requestSpec);

        userAssertionsStep.assertUser(testUser, responseUser);
    }


}
