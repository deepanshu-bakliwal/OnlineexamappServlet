package com.lti.training.exam.servletjsp;

import java.util.List;

public class Question {
	private String question;
	private List<Option>options;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Question() {
		super();
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	public Question(String question, List<Option> options) {
		super();
		this.question = question;
		this.options = options;
	}

}
