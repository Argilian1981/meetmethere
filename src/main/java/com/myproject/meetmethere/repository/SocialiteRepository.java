package com.myproject.meetmethere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.meetmethere.model.Socialite;

@Repository
public interface SocialiteRepository extends JpaRepository<Socialite, Integer>{

}
