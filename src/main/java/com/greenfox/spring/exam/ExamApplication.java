package com.greenfox.spring.exam;

import com.greenfox.spring.exam.model.Answer;
import com.greenfox.spring.exam.model.Question;
import com.greenfox.spring.exam.model.Quiz;
import com.greenfox.spring.exam.repository.AnswerRepository;
import com.greenfox.spring.exam.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamApplication implements CommandLineRunner{

	@Autowired
	QuestionRepository questionRepository;
	@Autowired
	AnswerRepository answerRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		questionRepository.save(new Question("When did your course start? (yyyy.mm.dd)"));
		answerRepository.save(new Answer("2017.03.13"));
		questionRepository.save(new Question("What type of dog Barbi has?"));
		answerRepository.save(new Answer("Whippet"));
		questionRepository.save(new Question("What is HerrNorbert's favourite color?"));
		answerRepository.save(new Answer("Green"));
		questionRepository.save(new Question("How many classes are learning at Green Fox Academy at this moment?"));
		answerRepository.save(new Answer("4"));
		questionRepository.save(new Question("How many mentors teach at Green Fox at this moment?"));
		answerRepository.save(new Answer("16"));
		questionRepository.save(new Question("What was the name of the first Green Fox class?"));
		answerRepository.save(new Answer("Vulpes"));
	}
}
