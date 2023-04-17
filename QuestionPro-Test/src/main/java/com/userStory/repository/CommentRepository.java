package com.userStory.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.userStory.Entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Query("SELECT c FROM Comment c WHERE c.story.id = :storyId ORDER BY c.childCommentCount DESC")
    List<Comment> findCommentsByStoryId(@Param("storyId") Long storyId, Pageable pageable);

	List<Comment> findByStoryIdOrderByChildCountDesc(Long storyId, PageRequest of);
}


