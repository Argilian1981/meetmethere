package com.myproject.meetmethere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.meetmethere.model.SocialGroup;

@Repository
public interface SocialGroupRepository extends JpaRepository<SocialGroup, Integer>{

}
