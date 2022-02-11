package com.web.webDev.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User {
    @Id
    private String userId;

    private String userPassword;
    private String userName;
    private String userEmail;


}
