package com.example.cvapi2.steps.requests;

import com.example.cvapi2.config.RequestSpec;
import com.example.cvapi2.data.constant.enums.StatusCode;
import com.example.cvapi2.data.dto.Post;
import com.example.cvapi2.data.endPoints.PostEndPoints;
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
public class PostRequestStep extends BaseRequestStep {

    @Autowired
    PostEndPoints postEndPoints;

    JsonDTOFormatter<Post> jsonFormatter = new JsonDTOFormatter();

    @Step("Получение всех публикаций")
    public List<Post> getAllPosts(RequestSpec requestSpec) {
        return jsonFormatter.transFormToListObject(doGetRequest(postEndPoints.GET_ALL_POSTS, StatusCode.OK, requestSpec.requestSpecification), Post.class);
    }

    @Step("Получить публикацию с ID: {id}")
    public Post getPostById(int id, RequestSpec requestSpec) {
        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("id", String.valueOf(id));
        return jsonFormatter.transFormToObject(
                doGetRequestWithParam(postEndPoints.GET_POST_BY_ID, pathParams,
                        StatusCode.OK,
                        requestSpec.requestSpecification
                ), Post.class);
    }

}
