package com.userStory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.userStory.Entity.Comment;
import com.userStory.Service.CommentService;

@RestController
@RequestMapping("/api")

public class CommentController {
	   private final CommentService commentService;

	    public CommentController(CommentService commentService) {
	        this.commentService = commentService;
	    }

	    @GetMapping("/comments")
	    public ResponseEntity<List<Comment>> getCommentsByStoryId(@RequestParam("storyId") Long storyId) {
	        List<Comment> comments = commentService.getCommentsByStoryId(storyId);
	        return ResponseEntity.ok(comments);
	    }}