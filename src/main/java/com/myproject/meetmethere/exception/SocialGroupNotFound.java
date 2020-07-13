package com.myproject.meetmethere.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SocialGroupNotFound extends RuntimeException{
    public SocialGroupNotFound(String message) {
        super(message);
    }

}
