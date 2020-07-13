package com.myproject.meetmethere.service;

import com.myproject.meetmethere.model.SocialGroup;
import com.myproject.meetmethere.repository.SocialGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SocialGroupService {
    @Autowired
    private SocialGroupRepository socialGroupRepository;

    public SocialGroup saveSocialGroup(SocialGroup socialGroup){
        return socialGroupRepository.save(socialGroup);
    }

    public List<SocialGroup> findAllSocialGroups(){
        return socialGroupRepository.findAll();
    }

    public SocialGroup findById(int id){
        Optional<SocialGroup> socialGroup = socialGroupRepository.findById(id);
        return socialGroup.get();
    }

    public void deleteSocialGroupById(int id){
        socialGroupRepository.deleteById(id);
    }

}
