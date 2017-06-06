package com.greenfox.spring.exam.model;


import java.util.concurrent.atomic.AtomicInteger;

public class Projects {

  private long id;
  private String nameOfProject;

  public Projects(String nameOfProject) {
    AtomicInteger count = new AtomicInteger(0);
    this.id = count.incrementAndGet();
    this.nameOfProject = nameOfProject;
  }
}
