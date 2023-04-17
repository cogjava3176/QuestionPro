package com.userStory.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.userStory.Entity.Story;

public interface StoryRepository extends JpaRepository<Story, Long> {
	 @Query("SELECT s FROM Story s WHERE s.timeOfSubmission >= :time ORDER BY s.score DESC")
	    List<Story> findTopStoriesByTime(@Param("time") long time);
}


