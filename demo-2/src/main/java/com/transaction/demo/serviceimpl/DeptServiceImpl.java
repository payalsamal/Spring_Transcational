package com.transaction.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.transaction.demo.model.DeptModel;
import com.transaction.demo.repo.DeptRepo;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class DeptServiceImpl {
	
	@Autowired
	private DeptRepo deptRepo;
	
	
	public void deptSave(String deptName) {
		
		try {
			
			System.out.println("DeptServiceImpl : : "+org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive());
			System.out.println("DeptServiceImpl : : "+org.springframework.transaction.support.TransactionSynchronizationManager.getCurrentTransactionName());
	
			DeptModel save = deptRepo.save(DeptModel.builder().deptName(deptName).build());
			
			
			//throw new RuntimeException();
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
			
		}
		
		
		
		
	}

}
