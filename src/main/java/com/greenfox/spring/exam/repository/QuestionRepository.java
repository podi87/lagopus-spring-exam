package com.greenfox.spring.exam.repository;


import com.greenfox.spring.exam.model.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long> {
}
