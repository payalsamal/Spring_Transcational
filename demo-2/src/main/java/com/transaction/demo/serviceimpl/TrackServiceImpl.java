package com.transaction.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.transaction.demo.model.EmpModel;
import com.transaction.demo.model.TrackModel;
import com.transaction.demo.repo.TrackRepo;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class TrackServiceImpl {

	@Autowired
	private TrackRepo trackRepo;

	public void saveTrack(String status, EmpModel model) {
		
	try {
		
		System.out.println("saveTrack : : "+org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println("saveTrack : : "+org.springframework.transaction.support.TransactionSynchronizationManager.getCurrentTransactionName());
		
		
		TrackModel save = trackRepo.save(TrackModel.builder().empName(model.getEmpName()).deptName(model.getDeptName()).status(status).build());
	//	throw new RuntimeException();
		
	}catch(Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
		
	}
		
	}

}
