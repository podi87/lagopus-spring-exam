package com.greenfox.spring.exam.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
public class QuizAnswer {

  private long id;
  private List<Answer> answers;

  public QuizAnswer(List<Answer> answerList) {
    AtomicInteger count = new AtomicInteger(0);
    this.id = count.incrementAndGet();
    this.answers = answerList;
  }

  public QuizAnswer() {
  }

  @Override
  public String toString() {
    return "QuizAnswer{" +
            "id=" + id +
            ", answers=" + answers +
            '}';
  }
}
