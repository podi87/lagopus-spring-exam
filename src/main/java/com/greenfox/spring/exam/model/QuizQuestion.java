package com.greenfox.spring.exam.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
public class QuizQuestion {

  private long id;
  private List<Question> questions;

  public QuizQuestion(List<Question> questionList) {
    AtomicInteger count = new AtomicInteger(0);
    this.id = count.incrementAndGet();
    this.questions = questionList;
  }

  public QuizQuestion() {
  }

  @Override
  public String toString() {
    return "QuizQuestion{" +
            "id=" + id +
            ", questions=" + questions +
            '}';
  }
}