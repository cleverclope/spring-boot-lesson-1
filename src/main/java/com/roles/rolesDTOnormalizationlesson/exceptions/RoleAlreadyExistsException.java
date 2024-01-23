package com.roles.rolesDTOnormalizationlesson.exceptions;

public class RoleAlreadyExistsException extends RuntimeException{

    public RoleAlreadyExistsException(String message) {
        super(message);
    }
}
