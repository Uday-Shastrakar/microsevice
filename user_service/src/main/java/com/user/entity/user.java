package com.user.entity;

import java.util.ArrayList;

public class user {
    private Long userId;
    private String name;
    private String phone;

    list<contact> contacts=new ArrayList<>();

    public user(Long userId, String name, String phone, list<contact> contacts) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    public user(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public user() {

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public list<contact> getContacts() {
        return contacts;
    }

    public void setContacts(list<contact> contacts) {
        this.contacts = contacts;
    }
}
