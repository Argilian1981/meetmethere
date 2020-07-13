package com.myproject.meetmethere.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.meetmethere.model.Socialite;
import com.myproject.meetmethere.repository.SocialiteRepository;

@Service
public class SocialiteService {
	
	@Autowired
	private SocialiteRepository socialiteRepository;
	
	public Socialite saveSocialite(Socialite socialite) {
		
		return socialiteRepository.save(socialite);
	}
	
	public List<Socialite> findAll(){
		return socialiteRepository.findAll();
	}
	
	public void deleteById(int id) {
		socialiteRepository.deleteById(id);
	}

	public Socialite findById(int id){
		Optional<Socialite> searchedSocialite = socialiteRepository.findById(id);
		return searchedSocialite.get();
	}

	public Socialite update(Socialite socialite){
		return socialiteRepository.save(socialite);
	}

}
