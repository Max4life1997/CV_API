package com.example.cvapi2.test.api.post;

import com.example.cvapi2.data.constant.PostConstant;
import com.example.cvapi2.data.dto.Post;
import com.example.cvapi2.steps.assertions.PostAssertionsStep;
import com.example.cvapi2.steps.requests.PostRequestStep;
import com.example.cvapi2.test.api.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@DisplayName("Публикации")
@Tag("posts")
public class PostPositiveTest extends BaseTest {


    @Autowired
    PostRequestStep postRequestStep;

    @Autowired
    PostAssertionsStep postAssertionsStep;

    @Test
    @DisplayName("Проверка вызова публицаии по ID")
    @Tag("byId")
    public void checkPostByID() {
        PostConstant postConstant = new PostConstant();
        Post testPost = postConstant.getTestPost();
        Post responsePost = postRequestStep.getPostById(testPost.getId(), requestSpec);

        postAssertionsStep.assertPost(testPost, responsePost);
    }


}
