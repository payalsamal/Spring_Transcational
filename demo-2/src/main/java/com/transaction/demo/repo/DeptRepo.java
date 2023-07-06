package com.transaction.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.demo.model.DeptModel;

public interface DeptRepo extends JpaRepository<DeptModel, Integer> {

}
