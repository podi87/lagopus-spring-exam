package com.greenfox.spring.exam.repository;

import com.greenfox.spring.exam.model.Quiz;
import org.springframework.data.repository.CrudRepository;


public interface QuizRepository extends CrudRepository<Quiz, Long> {
}
