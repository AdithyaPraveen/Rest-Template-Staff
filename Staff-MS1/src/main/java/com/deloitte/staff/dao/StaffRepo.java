package com.deloitte.staff.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.staff.entity.Staff;

@Repository
public interface StaffRepo  extends JpaRepository<Staff,Integer>{

}
