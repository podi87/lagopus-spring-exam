package com.greenfox.spring.exam.controller;

import com.greenfox.spring.exam.model.Answer;
import com.greenfox.spring.exam.model.Question;
import com.greenfox.spring.exam.model.QuizQuestion;
import com.greenfox.spring.exam.repository.AnswerRepository;
import com.greenfox.spring.exam.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  AnswerRepository answerRepository;
  @Autowired
  QuestionRepository questionRepository;


  private List<Question> questionList = new ArrayList<>();
  private List<Answer> answerList = new ArrayList<>();

  @RequestMapping(name = "/questions")
  public QuizQuestion getFiveQuestions() {
    if (questionList.size() == 0 || answerList.size() == 0) {
      for (int i = 1; i < 6; i++) {
        questionList.add(questionRepository.findOne((long) i));
        answerList.add(answerRepository.findOne((long) i));
      }
    }
    return new QuizQuestion(questionList);
  }

//  @RequestMapping(name = "/answers", method = RequestMethod.POST)
//  public Answ
//
//
//  public Long getRandNum(long input){
//    return (long)(Math.random() * input);
//  }

}
