package com.greenfox.spring.exam.controller;

import com.greenfox.spring.exam.model.*;
import com.greenfox.spring.exam.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@org.springframework.web.bind.annotation.RestController
public class RestController {


  @Autowired
  QuizRepository quizRepository;


  private List<Question> questionList = new ArrayList<>();
  private List<Answer> answerList = new ArrayList<>();
  private List<Projects> projectsList = new ArrayList<>();


  @RequestMapping(name = "/questions")
  public QuizQuestion getFiveQuestions() {
    Question question = new Question(1, "temp");
    int temp = 0;
    while (temp < 5) {
        long rand = getRandNum(quizRepository.count());
        question.setId(quizRepository.findOne(rand).getId());
        question.setQuestion(quizRepository.findOne(rand).getQuestion());
        if (!questionList.contains(question)) {
          questionList.add(question);
          temp++;
        }
    }
    return new QuizQuestion(questionList);
  }


  @RequestMapping(name = "/answers", method = RequestMethod.POST)
  public ProjectListClass getAnswers(@RequestBody QuizAnswer quizAnswer) {
    System.out.println(quizAnswer.getAnswers().size());
    for (int i = 0; i < quizAnswer.getAnswers().size(); i++) {
      if (quizAnswer.getAnswers().get(i).getId() == questionList.get(i).getId()) {
        AtomicInteger count = new AtomicInteger(0);
        Projects projects = new Projects("Question" + count.toString());
        projectsList.add(projects);
      }
    }
    return new ProjectListClass(projectsList);
  }


  public Long getRandNum(long input){
    return 1 + (long)(Math.random() * input);
  }

}
