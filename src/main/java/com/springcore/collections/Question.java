package com.springcore.collections;

import java.util.*;

public class Question 
{
	private int questionId;
	private String question;
	private List<String> answer;
	private Set<String> answer1;
	private Map<Integer,String> answer2;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	public Set<String> getAnswer1() {
		return answer1;
	}
	public void setAnswer1(Set<String> answer1) {
		this.answer1 = answer1;
	}
	public Map<Integer, String> getAnswer2() {
		return answer2;
	}
	public void setAnswer2(Map<Integer, String> answer2) {
		this.answer2 = answer2;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int questionId, String question, List<String> answer, Set<String> answer1,
			Map<Integer, String> answer2) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
		this.answer1 = answer1;
		this.answer2 = answer2;
	}
	
	
}
