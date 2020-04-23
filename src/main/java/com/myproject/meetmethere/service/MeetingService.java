package com.myproject.meetmethere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.meetmethere.model.Socialite;
import com.myproject.meetmethere.repository.SocialiteRepository;

@Service
public class MeetingService {
	
	@Autowired
	private SocialiteRepository socialiteRepository;
	
	public Socialite saveSocialite(Socialite socialite) {
		
		return socialiteRepository.save(socialite);
	}

}
