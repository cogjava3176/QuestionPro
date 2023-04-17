package com.userStory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userStory.Entity.Story;
import com.userStory.Service.StoryService;

@RestController
@RequestMapping("/api/v0")

public class StoryController {
	private final StoryService storyService;

    public StoryController(StoryService storyService) {
        this.storyService = storyService;
    }

    @GetMapping("/top-stories")
    public ResponseEntity<List<Story>> getTopStories() {
        List<Story> stories = storyService.getTopStories();
        return ResponseEntity.ok(stories);
    }

    @GetMapping("/past-stories")
    public ResponseEntity<List<Story>> getPastStories() {
        List<Story> stories = storyService.getPastStories();
        return ResponseEntity.ok(stories);
    }

}
