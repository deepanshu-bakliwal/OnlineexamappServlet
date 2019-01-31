package com.lti.training.exam.servletjsp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionBank {
	// QuestionBank contains all subjects
	private Map<String, List<Question>> questionBank;

	public QuestionBank() {
		questionBank = new HashMap<>();

	}

	public void addNewSubject(String subject) {
		questionBank.put(subject, new ArrayList<>());
	}

	public void addNewQuestion(String subject, Question question) {
		List<Question> questions = questionBank.get(subject);
		questions.add(question);
	}

	public List<Question> getQuestionsFor(String subject) {
		return questionBank.get(subject);
	}
}
