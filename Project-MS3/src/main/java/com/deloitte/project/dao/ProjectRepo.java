package com.deloitte.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.deloitte.project.entity.Projects;

@Repository
public interface ProjectRepo extends JpaRepository<Projects,Integer> {

	List<Projects> findByStaffid(Integer staffid);
}
