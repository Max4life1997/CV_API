package com.example.cvapi2.data.endPoints;

import org.springframework.stereotype.Component;

@Component
public final class UserEndPoints extends EndPointsBase {

    public final String GET_ALL_USERS = USERS;
    public final String GET_USER_BY_ID = USERS + SLASH + PARAM_ID;
}
