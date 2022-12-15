package com.deloitte.staff.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.staff.dao.StaffRepo;
import com.deloitte.staff.entity.Staff;
@Service
public class StaffServiceImpl implements StaffService {

	@Autowired
	private StaffRepo staffrepo;
	@Override
	public Staff getStaffById(Integer id) {
		
		return staffrepo.findById(id).get();
	}

	@Override
	public List<Staff> getAllStaff() {
		
		return staffrepo.findAll();
	}

	@Override
	public Staff addStaff(Staff staff) {
		
		return staffrepo.save(staff);
	}

	@Override
	public Staff updateStaff(Staff staff, Integer id) {
		Staff updateSt=staffrepo.findById(id).get();
		
		if(Objects.nonNull(staff.getStaffname()) && !"".equalsIgnoreCase(staff.getStaffname()))
		{
		updateSt.setStaffname(staff.getStaffname());
}
if(Objects.nonNull(staff.getStaffmail()) && !"".equalsIgnoreCase(staff.getStaffmail()))
{
updateSt.setStaffmail(staff.getStaffmail());;
}
if(Objects.nonNull(staff.getDept()) && !"".equalsIgnoreCase(staff.getDept()))
{
updateSt.setDept(staff.getDept());
}
return staffrepo.save(updateSt);
	}

	@Override
	public void deleteStaff(Integer id) {
		staffrepo.deleteById(id);
		
	}

}
