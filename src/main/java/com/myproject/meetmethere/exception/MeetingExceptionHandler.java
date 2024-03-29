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
public class MeetingExceptionHandler extends ResponseEntityExceptionHandler{

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllException(Exception ex , WebRequest request){
        MeetingExceptionResponse meetingExceptionResponse = new MeetingExceptionResponse(new Date() , ex.getMessage() ,
                request.getDescription(false));

        return new ResponseEntity(meetingExceptionResponse , HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(SocialiteNotFound.class)
    public final ResponseEntity<Object> handleSocialiteNotFoundException(SocialiteNotFound ex, WebRequest request){

        MeetingExceptionResponse meetingExceptionResponse = new MeetingExceptionResponse(new Date() , ex.getMessage() ,
                request.getDescription(false));

        return new ResponseEntity(meetingExceptionResponse, HttpStatus.NOT_FOUND);
    }



}
