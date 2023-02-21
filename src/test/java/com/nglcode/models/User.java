package com.nglcode.models;

import com.nglcode.enums.Gender;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private String firstName = "foo";
    private String lastName = "bar";
    private String email = "foo@gmail.com";
    private Gender gender = Gender.female;
    private String country = "Colombia";
    private String birthDay = "";
    private String birthMonth = "";
    private String birthYear = "";
    private String phone = "";
    private String password = "";
    private String passwordConfirmation = "";
    private String profile = "";

}
