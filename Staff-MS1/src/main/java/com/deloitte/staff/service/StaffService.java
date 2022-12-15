package com.deloitte.staff.service;

import java.util.List;

import com.deloitte.staff.entity.Staff;

public interface StaffService {
	
	public Staff getStaffById(Integer id);
	public List<Staff> getAllStaff();
	public Staff addStaff(Staff staff);
	public Staff updateStaff(Staff staff,Integer id);
	public void deleteStaff(Integer id);
	

}
