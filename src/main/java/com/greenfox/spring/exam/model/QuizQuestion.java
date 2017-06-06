package com.greenfox.spring.exam.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
public class QuizQuestion {

  private long id;
  private List<Question> questionList;

  public QuizQuestion(List<Question> questionList) {
    AtomicInteger count = new AtomicInteger(1);
    this.id = count.incrementAndGet();
    this.questionList = questionList;
  }

  public QuizQuestion() {
  }

  @Override
  public String toString() {
    return "QuizQuestion{" +
            "id=" + id +
            ", questionList=" + questionList +
            '}';
  }
}