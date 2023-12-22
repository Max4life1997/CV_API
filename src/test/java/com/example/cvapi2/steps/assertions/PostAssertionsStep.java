package com.example.cvapi2.steps.assertions;

import com.example.cvapi2.data.dto.Post;
import io.qameta.allure.Step;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.springframework.stereotype.Service;

@Service
public class PostAssertionsStep {

    @Step("Проверка POST")
    public void assertPost(Post basePost, Post responsePost) {
        SoftAssertions.assertSoftly(softly -> {
            Assertions.assertThat(basePost.getId()).isEqualTo(responsePost.getId());
            Assertions.assertThat(basePost.getUserId()).isEqualTo(responsePost.getUserId());
            Assertions.assertThat(basePost.getTitle()).isEqualTo(responsePost.getTitle());
            Assertions.assertThat(basePost.getBody()).isEqualTo(responsePost.getBody());
        });
    }

}
