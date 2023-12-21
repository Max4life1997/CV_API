package com.example.cvapi2.data.dto;

import com.example.cvapi2.data.dto.subdata.Address;
import com.example.cvapi2.data.dto.subdata.Company;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
}
