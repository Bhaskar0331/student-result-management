package com.school.student.result.management.repos;

import com.school.student.result.management.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResultRepository extends JpaRepository<Result, Integer> {

    List<Result> findAll();
    Result findById(int id);

}
