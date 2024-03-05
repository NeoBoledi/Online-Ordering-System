package com.neothedeveloper.back_foodordering.response;

import com.neothedeveloper.back_foodordering.model.USER_ROLE;

import lombok.Data;

@Data
public class AuthResponse {

    private String jwt;
    private String message;
    private USER_ROLE role;
}
