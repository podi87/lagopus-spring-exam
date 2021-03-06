package com.greenfox.spring.exam.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
public class Question {

  private long id;
  private String question;

  public Question(long id, String question) {
    this.id = id;
    this.question = question;
  }

  public Question() {
  }

  @Override
  public String toString() {
    return "Question{" +
            "id=" + id +
            ", question='" + question + '\'' +
            '}';
  }
}
