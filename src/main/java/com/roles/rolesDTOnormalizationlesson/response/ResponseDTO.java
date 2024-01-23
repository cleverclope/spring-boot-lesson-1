package com.roles.rolesDTOnormalizationlesson.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDTO<T> {
        private String message;
        private boolean status = true;
        private T data;
    }
