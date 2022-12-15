package com.deloitte.mutual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.mutual.dao.MutualRepo;
import com.deloitte.mutual.entity.MutualFund;
@Service
public class MutualServiceImpl implements MutualService{

	@Autowired
	MutualRepo mutualRepo;
	@Override
	public List<MutualFund> getMutualFundById(Integer id) {
		
		return mutualRepo.findByInvestId(id);
	}

	@Override
	public List<MutualFund> getMutualFunds() {
		
		return mutualRepo.findAll();
	}

	@Override
	public MutualFund addMutualFund(MutualFund mutual) {
		
		return mutualRepo.save(mutual);
	}

}
