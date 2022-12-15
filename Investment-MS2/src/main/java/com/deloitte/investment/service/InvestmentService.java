package com.deloitte.investment.service;

import java.util.List;

import com.deloitte.investment.entity.Investments;




public interface InvestmentService {
	
	public List<Investments> getInvestById(Integer id);
	public List<Investments> getInvestments();
	public Investments addInvest(Investments invest);
	//public List<Investments> getInvestById2(Integer id);
//	public Investments updateInvest(Investments invest,Integer id);
	
//	public List<MutualFund> getMutualFundById(Integer m_id);
//	public List<MutualFund> getMutualFunds();
//	public List<Investments> getMutualFundById(Integer m_id);
	
}
