package com.myproject.meetmethere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.meetmethere.model.MeetingVenue;

@Repository
public interface MeetingVenueRepository extends JpaRepository<MeetingVenue, Integer>{

}
