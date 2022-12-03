package com.user.entity;

public class contact {
    private Long cId;
    private String email;
    private String contactName;
    private Long userId;



    public contact(Long cId, String email, String contactName, Long userId) {
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
        this.userId = userId;
    }

    public contact() {

    }

    
}
