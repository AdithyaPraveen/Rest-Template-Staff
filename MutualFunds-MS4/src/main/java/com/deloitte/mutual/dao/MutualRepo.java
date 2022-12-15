package com.deloitte.mutual.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.mutual.entity.MutualFund;
@Repository
public interface MutualRepo extends JpaRepository<MutualFund,Integer> {

List<MutualFund> findByInvestId(Integer investId);
}
