package com.example.cvapi2.test.api.user;

import com.example.cvapi2.data.constant.UserConstant;
import com.example.cvapi2.data.dto.User;
import com.example.cvapi2.steps.assertions.UserAssertionsStep;
import com.example.cvapi2.steps.requests.UserRequestStep;
import com.example.cvapi2.test.api.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserPositiveTest extends BaseTest {


    @Autowired
    UserRequestStep userRequestStep;

    @Autowired
    UserAssertionsStep userAssertionsStep;

    @Test
    public void checkUserByID() {
        UserConstant userConstant = new UserConstant();
        User testUser = userConstant.getTestUser();
        User responseUser = userRequestStep.getUserById(userConstant.getTestUser().getId(), requestSpec);

        userAssertionsStep.assertUser(testUser, responseUser);
    }

    @Test
    public void checkAllUser() {
        List<User> user = userRequestStep.getAllUsers(requestSpec);
    }

}
