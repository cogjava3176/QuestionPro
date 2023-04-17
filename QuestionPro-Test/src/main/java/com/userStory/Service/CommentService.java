package com.userStory.Service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.userStory.Entity.Comment;
import com.userStory.repository.CommentRepository;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Cacheable(value = "comments", key = "#storyId")
    public List<Comment> getCommentsByStoryId(Long storyId) {
        return commentRepository.findByStoryIdOrderByChildCountDesc(storyId, PageRequest.of(0, 10));
    }
}
