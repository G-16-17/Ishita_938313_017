package com.learn.mavendemo.model;

import java.util.List;

public class Question {
	private int questionId;
	private String questionText;
	private List<String> answer;
	
	public Question() {
		
	}

	public Question(int questionId, String questionText, List<String> answer) {
		super();
		this.questionId = questionId;
		this.questionText = questionText;
		this.answer = answer;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public List<String> getAnswer() {
		return answer;
	}

	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionText=" + questionText + ", answer=" + answer + "]";
	}
	
	

}
