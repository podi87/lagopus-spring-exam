package com.greenfox.spring.exam.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ANSWER")
@Getter
@Setter
public class Answer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String answer;

  public Answer(String answer) {
    this.answer = answer;
  }

  public Answer() {
  }
}
