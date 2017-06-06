package com.greenfox.spring.exam.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "QUIZ")
@Getter
@Setter
public class Quiz {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String question;
  private String answer;

  public Quiz(String question, String answer) {
    this.question = question;
    this.answer = answer;
  }

  public Quiz() {

  }

  @Override
  public String toString() {
    return "Quiz{" +
            "id=" + id +
            ", question='" + question + '\'' +
            ", answer='" + answer + '\'' +
            '}';
  }
}
