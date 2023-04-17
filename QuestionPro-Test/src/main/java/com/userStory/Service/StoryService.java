package com.userStory.Service;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import com.userStory.Entity.Story;
import com.userStory.repository.StoryRepository;
import jakarta.persistence.Cacheable;

@Service
public class StoryService {

	 private final StoryRepository storyRepository;

	    public StoryService(StoryRepository storyRepository) {
	        this.storyRepository = storyRepository;
	    }

	    @Cacheable(value = "topStories")
	    public List<Story> getTopStories() {
	        long fifteenMinutesAgo = Instant.now().minus(Duration.ofMinutes(15)).getEpochSecond();
	        return storyRepository.findTopStoriesByTime(fifteenMinutesAgo);
	    }

	    @Cacheable(value = "pastStories")
	    public List<Story> getPastStories() {
	        return getTopStories();
	    }
}
