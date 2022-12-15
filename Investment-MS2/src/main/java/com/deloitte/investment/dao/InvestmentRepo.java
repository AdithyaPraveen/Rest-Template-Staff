package com.deloitte.investment.dao;




import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.investment.entity.Investments;

@Repository
public interface InvestmentRepo extends JpaRepository<Investments,Integer>{
	
	List<Investments> findByStaffid(Integer id);


}
