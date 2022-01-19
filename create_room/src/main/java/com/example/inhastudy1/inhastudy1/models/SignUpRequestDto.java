package com.example.inhastudy1.inhastudy1.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class SignUpRequestDto {
    private String id;
    private String major;
    private Integer grade;
    private String username;
    private String password;
    private String sex;
    private String phoneNumber;
    private String email;
    private String checkLogin;
}
