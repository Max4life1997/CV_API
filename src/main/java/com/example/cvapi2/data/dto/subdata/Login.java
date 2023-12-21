package com.example.cvapi2.data.dto.subdata;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Login {
    private String uuid;
    private String username;
    private String password;
    private String md5;
    private String sha1;
    private Date registered;
}
