package com.deloitte.investment.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.investment.dao.InvestmentRepo;
import com.deloitte.investment.entity.Investments;

@Service
public class InvestmentServiceImpl implements InvestmentService{

	@Autowired
	private InvestmentRepo investrepo;
	@Override
	public List<Investments> getInvestById(Integer id) {
		
		return investrepo.findByStaffid(id);
	}

	@Override
	public List<Investments> getInvestments() {
		
		return investrepo.findAll();
	}

	@Override
	public Investments addInvest(Investments invest) {
		
		return investrepo.save(invest);
	}

	
//	@Override
//	public List<Investments> getMutualFundById(Integer m_id) {
//		
//		return investrepo.findById(m_id);
//	}

	
//	@Override
//	public Investments updateInvest(Investments invest, Integer id) {
//		Investments updateInvest=investrepo.findById(id).get();
//		
//		if(Objects.nonNull(invest.getInvestId()) && (invest.getInvestId()!=0))
//		{
//		updateInvest.setInvestId(invest.getInvestId());
//}
//if(Objects.nonNull(invest.getInvestAmt()) && (invest.getInvestAmt()!=0))
//{
//updateInvest.setInvestAmt(invest.getInvestAmt());;
//}
//if(Objects.nonNull(invest.getInvestType()) && !"".equalsIgnoreCase(invest.getInvestType()))
//{
//updateInvest.setInvestType(invest.getInvestType());;
//}
//return investrepo.save(updateInvest);
//	}
	}


