package com.deloitte.mutual.service;

import java.util.List;

import com.deloitte.mutual.entity.MutualFund;

public interface MutualService {
	
	public List<MutualFund> getMutualFundById(Integer id);
	public List<MutualFund> getMutualFunds();
	public MutualFund addMutualFund(MutualFund mutual);

}
