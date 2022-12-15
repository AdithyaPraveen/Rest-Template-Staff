package com.deloitte.mutual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.deloitte.mutual.entity.MutualFund;
import com.deloitte.mutual.service.MutualService;


@RestController
@RequestMapping("/mutual")
public class MutualController {
	@Autowired
	private MutualService mutualService;
	@GetMapping("/getMutualFunds")
	public ResponseEntity<List<MutualFund>> getMutualFunds(){
		List<MutualFund> MutualList=mutualService.getMutualFunds();
		return new ResponseEntity<List<MutualFund>>(MutualList,HttpStatus.OK);
	}
	@GetMapping("/getMutualFundById/{s_id}")
	public ResponseEntity<List<MutualFund>> getMutualFundById(@PathVariable("s_id") Integer s_id)
	{
		List<MutualFund> mutualList=mutualService.getMutualFundById(s_id);
		return new ResponseEntity<List<MutualFund>>(mutualList,HttpStatus.OK);
		
	}
	@PostMapping("/addMutualFund")
	public MutualFund addMutualFund(@RequestBody MutualFund mutual)
	{
		return mutualService.addMutualFund(mutual);
	}

}
