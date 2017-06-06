package com.greenfox.spring.exam.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
public class Answer {

  private long id;
  private String answer;

  public Answer(long id, String answer) {
    this.id = id;
    this.answer = answer;
  }

  public Answer() {
  }
}
