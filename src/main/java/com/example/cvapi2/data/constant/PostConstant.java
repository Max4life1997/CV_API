package com.example.cvapi2.data.constant;


import com.example.cvapi2.data.dto.Post;
import lombok.Getter;

@Getter
public class PostConstant {

    private final Post testPost = new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
            "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");

}
