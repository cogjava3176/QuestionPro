package com.userStory.Entity;

import jakarta.persistence.Entity;

@Entity
public class Story {

	
	private int id;
    private String title;
    private String url;
    private int score;
    private long submissionTime;
    private String user;
	public Story() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Story(int id, String title, String url, int score, long submissionTime, String user) {
		super();
		this.id = id;
		this.title = title;
		this.url = url;
		this.score = score;
		this.submissionTime = submissionTime;
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public long getSubmissionTime() {
		return submissionTime;
	}
	public void setSubmissionTime(long submissionTime) {
		this.submissionTime = submissionTime;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Story [id=" + id + ", title=" + title + ", url=" + url + ", score=" + score + ", submissionTime="
				+ submissionTime + ", user=" + user + "]";
	}
    
     
}
 