package com.userStory.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Comment {

	  @Id
	    private Long id;
	    private String text;
	    private LocalDateTime time;
	    private String by;
	    private int childCommentCount;
	    @ManyToOne
	    private Story story;
		public Comment() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Comment(Long id, String text, LocalDateTime time, String by, int childCommentCount, Story story) {
			super();
			this.id = id;
			this.text = text;
			this.time = time;
			this.by = by;
			this.childCommentCount = childCommentCount;
			this.story = story;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public LocalDateTime getTime() {
			return time;
		}
		public void setTime(LocalDateTime time) {
			this.time = time;
		}
		public String getBy() {
			return by;
		}
		public void setBy(String by) {
			this.by = by;
		}
		public int getChildCommentCount() {
			return childCommentCount;
		}
		public void setChildCommentCount(int childCommentCount) {
			this.childCommentCount = childCommentCount;
		}
		public Story getStory() {
			return story;
		}
		public void setStory(Story story) {
			this.story = story;
		}
		@Override
		public String toString() {
			return "Comment [id=" + id + ", text=" + text + ", time=" + time + ", by=" + by + ", childCommentCount="
					+ childCommentCount + ", story=" + story + "]";
		}

}
