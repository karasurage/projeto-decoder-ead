package com.ead.authuser.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.UUID;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

    private UUID userId;
    private String username;
    private String email;
    private String password;
    private String oldPasswod;
    private String fullName;
    private String phoneNumber;
    private String cpf;
    private String imageUrl;

}