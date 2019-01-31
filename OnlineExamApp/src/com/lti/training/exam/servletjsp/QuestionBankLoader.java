package com.lti.training.exam.servletjsp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionBankLoader {
	private QuestionBank questionBank;

	public QuestionBankLoader() {
		questionBank = new QuestionBank();
	}

	
	public List<Question> loadQuestionsOnJava() {
	
		questionBank.addNewSubject("java");
		Question q = new Question();
		q.setQuestion("What is object..?");
		List<Option> options = new ArrayList<>();
		Option o1 = new Option("Object is a real word entity", true);
		Option o2 = new Option("objectis classroom", false);
		Option o3 = new Option("object  is trend", false);
		Option o4 = new Option("none of your business", false);
		options.add(o1);
		options.add(o2);
		options.add(o3);
		options.add(o4);
		q.setOptions(options);
		questionBank.addNewQuestion("java", q);

		q = new Question();
		q.setQuestion("what is a class..?");
		options = new ArrayList<>();
		Option o5 = new Option("class is a temple", true);
		Option o6 = new Option("class is classroom", false);
		Option o7 = new Option("class is trend", false);
		Option o8 = new Option("none of your business", false);
		options.add(o5);
		options.add(o6);
		options.add(o7);
		options.add(o8);
		q.setOptions(options);
		questionBank.addNewQuestion("java", q);

		q = new Question();
		q.setQuestion("what is G1..?");
		options = new ArrayList<>();
		Option o9 = new Option("G1 is a temple", true);
		Option o10 = new Option("G1 is classroom", false);
		Option o11 = new Option("G1 is trend", false);
		Option o12 = new Option("none of your business", false);
		options.add(o9);
		options.add(o10);
		options.add(o11);
		options.add(o12);
		q.setOptions(options);
		questionBank.addNewQuestion("java", q);
        
		q = new Question();
		q.setQuestion("what is a class..?");
		options = new ArrayList<>();
		Option o13 = new Option("class is a temple", true);
		Option o14 = new Option("class is classroom", false);
		Option o15 = new Option("class is trend", false);
		Option o16 = new Option("none of your business", false);
		options.add(o13);
		options.add(o14);
		options.add(o15);
		options.add(o16);
		q.setOptions(options);
		questionBank.addNewQuestion("java", q);

		List<Question> questions=questionBank.getQuestionsFor("java");
	return questions;
	}
 


}
