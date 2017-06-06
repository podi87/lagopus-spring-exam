package com.greenfox.spring.exam.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Quiz {

  private String questionOrAnswer;

  public Quiz() {
  }

  public Quiz(String questionOrAnswer) {
    this.questionOrAnswer = questionOrAnswer;
  }
}
