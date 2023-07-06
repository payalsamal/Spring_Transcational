package com.transaction.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.demo.model.EmpModel;

public interface EmpRepo extends JpaRepository<EmpModel, Integer> {

}
