package com.greenfox.spring.exam.repository;

import com.greenfox.spring.exam.model.Answer;
import org.springframework.data.repository.CrudRepository;


public interface AnswerRepository extends CrudRepository<Answer, Long> {
}
