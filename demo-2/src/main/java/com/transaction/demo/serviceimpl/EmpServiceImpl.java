package com.transaction.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.transaction.demo.model.EmpModel;
import com.transaction.demo.repo.EmpRepo;

@Service
@Transactional
public class EmpServiceImpl {

	@Autowired
	private TrackServiceImpl trackServiceImpl;

	@Autowired
	private DeptServiceImpl deptServiceImpl;

	@Autowired
	private EmpRepo empRepo;

	public String saveEmployee(EmpModel model) {

		try {
			
			System.out.println(
					"saveEmployee : : " + org.springframework.transaction.support.TransactionSynchronizationManager
							.isActualTransactionActive());
			System.out.println(
					"saveEmployee : : " + org.springframework.transaction.support.TransactionSynchronizationManager
							.getCurrentTransactionName());

			deptServiceImpl.deptSave(model.getDeptName());

			empRepo.save(EmpModel.builder().empName(model.getEmpName()).empMail(model.getEmpMail())
					.deptName(model.getDeptName()).build());
			
			throw new RuntimeException();
			
			//trackServiceImpl.saveTrack("success", model);
			

		} catch (Exception e) {
			e.printStackTrace();
			trackServiceImpl.saveTrack("fail", model);
			throw new RuntimeException();
		}

		//return "Saved !!";

	}

}
