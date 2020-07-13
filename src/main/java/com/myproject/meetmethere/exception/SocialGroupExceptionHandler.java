package com.myproject.meetmethere.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class SocialGroupExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(SocialGroupNotFound.class)
    public final ResponseEntity<Object> handleSocialGroupNotFoundException(SocialGroupNotFound ex, WebRequest request){

        SocialGroupExceptionResponse socialGroupExceptionResponse = new SocialGroupExceptionResponse(new Date() , ex.getMessage() ,
                request.getDescription(false));

        return new ResponseEntity(socialGroupExceptionResponse, HttpStatus.NOT_FOUND);
    }

}
