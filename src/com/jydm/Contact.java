package com.jydm;

import java.util.ArrayList;

public class Contact {
    private String name, phoneNum1;

    public Contact() {
        name = "First Last";
        phoneNum1 = null;
    }

    public Contact(String name, String phoneNum) {
        this.name = name;
        this.phoneNum1 = phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum1;
    }
}
