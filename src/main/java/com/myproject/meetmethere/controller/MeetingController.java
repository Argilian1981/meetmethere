package com.myproject.meetmethere.controller;

import java.net.URI;
import java.util.List;

import com.myproject.meetmethere.exception.SocialiteNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.myproject.meetmethere.model.Socialite;
import com.myproject.meetmethere.service.SocialiteService;

@RestController
public class MeetingController {
	
	@Autowired
	private SocialiteService socialiteService;
	
	@PostMapping(path = "/socialites")
	public ResponseEntity<Object> saveSocialite(@RequestBody Socialite socialite){
		Socialite savedSocialite = socialiteService.saveSocialite(socialite);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedSocialite.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping(path = "/socialites")
	public List<Socialite> findAllSocialites(){
		return socialiteService.findAll();
	}
	
	@DeleteMapping(path = "/socialites/{id}")
	public void deleteSocialiteById(@PathVariable int id) {
		socialiteService.deleteById(id);
	}

	@GetMapping(path = "/socialites/{id}")
	public Socialite findById(@PathVariable int id){
		Socialite socialite = socialiteService.findById(id);

		if(socialite == null){
			throw new SocialiteNotFound("id = " + id );
		}

		return socialite;
	}

}
