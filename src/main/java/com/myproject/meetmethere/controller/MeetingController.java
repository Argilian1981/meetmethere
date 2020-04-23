package com.myproject.meetmethere.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.myproject.meetmethere.model.Socialite;
import com.myproject.meetmethere.service.MeetingService;

@RestController
public class MeetingController {
	
	@Autowired
	private MeetingService meetingService;
	
	@PostMapping(path = "/socialites")
	public ResponseEntity<Object> createSocialite(@RequestBody Socialite socialite){
		Socialite savedSocialite = meetingService.saveSocialite(socialite);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedSocialite.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}

}
