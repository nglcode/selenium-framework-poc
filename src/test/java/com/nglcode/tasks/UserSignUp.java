package com.nglcode.tasks;

import com.nglcode.enums.Gender;
import com.nglcode.models.User;
import com.nglcode.pageObjects.SignUpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSignUp {

    @Autowired
    private SignUpServices signUpServices;

    public void withInfo(User user) {
        signUpServices.writeFirstName(user.getFirstName());
        signUpServices.writeLastName(user.getLastName());
        signUpServices.writeEmail(user.getEmail());
        signUpServices.writePhone(user.getPhone());
        signUpServices.writePassword(user.getPassword());
        signUpServices.writeConfirmPassword(user.getPasswordConfirmation());
        signUpServices.selectGender(user.getGender());
    }


}
