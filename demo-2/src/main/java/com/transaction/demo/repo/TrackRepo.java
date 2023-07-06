package com.transaction.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.demo.model.TrackModel;

public interface TrackRepo extends JpaRepository<TrackModel, Integer> {

}
