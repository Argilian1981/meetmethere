package com.myproject.meetmethere.controller;

import com.myproject.meetmethere.exception.SocialGroupNotFound;
import com.myproject.meetmethere.model.SocialGroup;
import com.myproject.meetmethere.service.SocialGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class SocialGroupController {
    @Autowired
    private SocialGroupService socialGroupService;

    @PostMapping(path = "/socialgroups")
    public ResponseEntity<Object> createSocialGroup(@RequestBody SocialGroup socialGroup){
        SocialGroup savedSocialGroup = socialGroupService.saveSocialGroup(socialGroup);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedSocialGroup.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping(path = "/socialgroups/")
    public List<SocialGroup> findAllSocialGroups(){
        return socialGroupService.findAllSocialGroups();
    }

    @GetMapping(path = "/socialgroups/{id}")
    public SocialGroup findById(@PathVariable  int id){
        SocialGroup socialGroup = socialGroupService.findById(id);

        if(socialGroup == null){
            throw new SocialGroupNotFound("id = " + id );
        }

        return socialGroup;
    }

    @PostMapping(path = "/socialgroups/update")
    public ResponseEntity<Object> updateSocialGroup(@RequestBody SocialGroup socialGroup){
        SocialGroup savedSocialGroup = socialGroupService.saveSocialGroup(socialGroup);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedSocialGroup.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

}
