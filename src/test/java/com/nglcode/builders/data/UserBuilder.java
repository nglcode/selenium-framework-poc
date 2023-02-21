package com.nglcode.builders.data;

import com.nglcode.enums.Gender;
import com.nglcode.models.User;

public class UserBuilder {

    private User user;

    private UserBuilder() {
        user = User.builder().build();
    }
    public static UserBuilder anUser() {
        return new UserBuilder();
    }

    public UserBuilder but() {
        return withDefaultInfo();
    }

    public UserBuilder withDefaultInfo() {
        this.user = User.builder()
                .firstName("Marco")
                .lastName("Polo")
                .email("marco@polo.com")
                .gender(Gender.male)
                .phone("654987310")
                .password("foobar123")
                .passwordConfirmation("foobar123")
                .build();
        return this;
    }

    public UserBuilder withoutEmail() {
        user.setEmail("");
        return this;
    }

    public UserBuilder withoutPassword() {
        user.setPassword("");
        return this;
    }

    public User build() {
        return this.user;
    }
}
