package com.greenfox.spring.exam.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "QUESTION")
@Getter
@Setter
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String question;

  public Question(String question) {
    this.question = question;
  }

  public Question() {
  }
}
