package com.example.cvapi2.data.endPoints;

import org.springframework.stereotype.Component;

@Component
public final class PostEndPoints extends EndPointsBase {

    public final String GET_ALL_POSTS = POSTS;
    public final String GET_POST_BY_ID = POSTS + SLASH + PARAM_ID;
}
