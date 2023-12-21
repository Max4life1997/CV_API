package com.example.cvapi2.helper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.Step;

import java.util.Collections;
import java.util.List;

public class JsonDTOFormatter<T> {

    @Step("Конвертация объекта {tClass}")
    public T transFormToObject(String jsonObject, Class<T> tClass) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(jsonObject, tClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public List<T> transFormToListObject(String jsonObject, Class<T> tClass) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return Collections.singletonList(objectMapper.readValue(jsonObject, tClass));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
