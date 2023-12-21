package com.example.cvapi2.test.api.user;

import com.example.cvapi2.environment.Environment;
import com.example.cvapi2.steps.requests.UserRequestStep;
import com.example.cvapi2.test.api.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserPositiveTest extends BaseTest {


    @Autowired
    UserRequestStep userRequestStep;

    @Autowired
    Environment environment;

//    @Autowired
//    UserAssertionsStep userAssertionsStep;

    @Test
    public void checkAllUser() {
//        List<User> user = userRequestStep.getAllUsers(requestSpec);
        System.out.println(environment.baseUrl);
    }

}
