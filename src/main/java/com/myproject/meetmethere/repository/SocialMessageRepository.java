package com.myproject.meetmethere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.meetmethere.model.SocialMessage;

@Repository
public interface SocialMessageRepository extends JpaRepository<SocialMessage, Integer>{

}
