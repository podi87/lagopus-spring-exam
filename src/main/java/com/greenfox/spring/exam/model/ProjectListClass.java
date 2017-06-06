package com.greenfox.spring.exam.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

//
//@Entity
//@Table(name = "PROJECT")
@Getter
@Setter
public class ProjectListClass {

//  @Id
//  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private List<Projects> projectsList;

  public ProjectListClass(List<Projects> projectsList) {
    AtomicInteger count = new AtomicInteger(0);
    this.id = count.incrementAndGet();
    this.projectsList = projectsList;
  }

  public ProjectListClass() {
  }

  @Override
  public String toString() {
    return "ProjectListClass{" +
            "id=" + id +
            ", projectsList=" + projectsList +
            '}';
  }
}
