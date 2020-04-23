package com.myproject.meetmethere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.meetmethere.model.SocialEvent;

@Repository
public interface SocialEventRepository extends JpaRepository<SocialEvent, Integer>{

}
