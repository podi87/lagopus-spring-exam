package com.greenfox.spring.exam.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
public class QuizAnswer {

  private long id;
  private List<Answer> answerList;

  public QuizAnswer(List<Answer> answerList) {
    AtomicInteger count = new AtomicInteger(1);
    this.id = count.incrementAndGet();
    this.answerList = answerList;
  }

  public QuizAnswer() {
  }

  @Override
  public String toString() {
    return "QuizAnswer{" +
            "id=" + id +
            ", answerList=" + answerList +
            '}';
  }
}
