package com.example.cvapi2.data.constant;


import com.example.cvapi2.data.dto.User;
import com.example.cvapi2.data.dto.subdata.Address;
import com.example.cvapi2.data.dto.subdata.Company;
import com.example.cvapi2.data.dto.subdata.Geo;

public class UserConstant {

    static Geo testGeo = new Geo("-37.3159", "81.1496");
    static Address testAddress = new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874", testGeo);
    static Company testCompany = new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets");
    static public User testUser = new User(1, "Leanne Graham", "Bret", "Sincere@april.biz",
            testAddress, "1-770-736-8031 x56442", "hildegard.org", testCompany);


}
