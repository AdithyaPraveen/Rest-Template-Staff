package com.deloitte.staff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.deloitte.staff.model.FailureResponse;

import com.deloitte.staff.entity.Staff;
import com.deloitte.staff.model.Investments;
import com.deloitte.staff.model.Projects;
import com.deloitte.staff.model.Response;
import com.deloitte.staff.service.StaffService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	private StaffService staffService;
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/get/{id}")
	
	public ResponseEntity<?> getStaffById(@PathVariable("id") Integer id) {
		Staff staff = staffService.getStaffById(id);
		List<Investments> investmentlist = restTemplate.getForObject("http://localhost:8082/investments/getInvestById/" + id, List.class);
		List<Projects> projectlist = restTemplate.getForObject("http://localhost:8083/projects/getProjectById/" + id, List.class);

		Response response=new Response(staff,investmentlist,projectlist);
		return new ResponseEntity<Response>(response,HttpStatus.OK);

	}
	@HystrixCommand(fallbackMethod ="investmentFailureFallback")
	public ResponseEntity<?>investmentFailureFallback(@PathVariable("id")Integer id)
	{
		Staff staff=staffService.getStaffById(id);
		FailureResponse fail=new FailureResponse(staff,"Currently Investment Service is Down");
		return new ResponseEntity<FailureResponse>(fail,HttpStatus.OK);
		
	}
	
//	@GetMapping("/get/{id}")
//	public Staff getStaffById(@PathVariable Integer id)
//	{
//		return staffService.getStaffById(id);
//	}
	@GetMapping("/getAll")
	public ResponseEntity<List<Staff>> getAllStaff()
	{
		List<Staff> staffList= staffService.getAllStaff();
		//List<Investments> investmentlist = restTemplate.getForObject("http://localhost:8082/investments/getInvestments", List.class);
		return new ResponseEntity<List<Staff>>(staffList,HttpStatus.OK);
		
	}
	@PostMapping("/addStaff")
	public Staff addStaff(@RequestBody Staff staff)
	{
		return staffService.addStaff(staff);
	}
	@PutMapping("/updateStaff/{Id}")
	public Staff updateStaff(@RequestBody Staff staff,@PathVariable("Id") Integer id) 
	{
		return staffService.updateStaff(staff, id);
	}
	@DeleteMapping("/deleteStaff/{Id}")
	public String deleteStaff(@PathVariable("Id") Integer id)
	{
		staffService.deleteStaff(id);
		return "Staff Deleted with Id is "+id;
	}
	
}
