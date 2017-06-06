package com.greenfox.spring.exam;

import com.greenfox.spring.exam.model.Quiz;
import com.greenfox.spring.exam.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamApplication implements CommandLineRunner{


	@Autowired
	QuizRepository quizRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		quizRepository.save(new Quiz("When did your course start? (yyyy.mm.dd)","2017.03.13"));
		quizRepository.save(new Quiz("What type of dog Barbi has?","Whippet"));
		quizRepository.save(new Quiz("What is HerrNorbert's favourite color?","Green"));
		quizRepository.save(new Quiz("How many classes are learning at Green Fox Academy at this moment?","4"));
		quizRepository.save(new Quiz("How many mentors teach at Green Fox at this moment?","16"));
		quizRepository.save(new Quiz("What was the name of the first Green Fox class?","Vulpes"));
	}
}
