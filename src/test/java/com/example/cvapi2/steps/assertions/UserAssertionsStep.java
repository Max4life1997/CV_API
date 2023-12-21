package com.example.cvapi2.steps.assertions;

import com.example.cvapi2.data.dto.User;
import io.qameta.allure.Step;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.springframework.stereotype.Component;

@Component
public class UserAssertionsStep {

    @Step("Проверка USER")
    public void assertUser(User baseUser, User responseUser) {
        SoftAssertions.assertSoftly(softly -> {
                    Assertions.assertThat(baseUser.getId()).isEqualTo(responseUser.getId());
                    Assertions.assertThat(baseUser.getName()).isEqualTo(responseUser.getName());
                    Assertions.assertThat(baseUser.getEmail()).isEqualTo(responseUser.getEmail());
                    Assertions.assertThat(baseUser.getWebsite()).isEqualTo(responseUser.getWebsite());
                    Assertions.assertThat(baseUser.getPhone()).isEqualTo(responseUser.getPhone());
                    Assertions.assertThat(baseUser.getAddress()).isEqualTo(responseUser.getAddress());
                    Assertions.assertThat(baseUser.getCompany()).isEqualTo(responseUser.getCompany());
                }
        );
    }

}
