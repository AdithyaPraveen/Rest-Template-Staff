package com.deloitte.investment.controller;

import java.util.ArrayList;
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
import org.springframework.web.client.RestTemplate;

import com.deloitte.investment.entity.Investments;
import com.deloitte.investment.model.FailureResponse;
import com.deloitte.investment.model.MutualFund;
import com.deloitte.investment.model.Response;
import com.deloitte.investment.service.InvestmentService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/investments")
public class InvestmentController {
	@Autowired
	private InvestmentService investmentService;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/getInvestments")
	@HystrixCommand(fallbackMethod = "mutualFailureFallback")
	public ResponseEntity<List<Investments>> getInvestments() {
		List<Investments> investmentList = investmentService.getInvestments();
		return new ResponseEntity<List<Investments>>(investmentList, HttpStatus.OK);
	}

	@GetMapping("/getInvestById/{s_id}")
	public ResponseEntity<?> getInvestById(@PathVariable("s_id") Integer s_id) {
		List<Investments> invest = investmentService.getInvestById(s_id);
		List<Response> res=new ArrayList();
		for(Investments in:invest)
		{
			List<MutualFund> mutualList = restTemplate.getForObject("http://localhost:8084/mutual/getMutualFundById/" + in.getInvestId(), List.class);
		    Response response = new Response(in, mutualList);
		    res.add(response);
		}
//		List<MutualFund> mutualList = restTemplate.getForObject("http://localhost:8084/mutual/getMutualFundById/" + s_id, List.class);
//		Response response = new Response(invest, mutualList);
//		return new ResponseEntity<Response>(response, HttpStatus.OK);

	return new ResponseEntity<List<Response>>(res,HttpStatus.OK);

	}

	public ResponseEntity<?> mutualFailureFallback(@PathVariable("id") Integer id) {
		List<Investments> invest = investmentService.getInvestById(id);
		FailureResponse response = new FailureResponse(invest, "Currently Mutual Fund Service is Down");
		return new ResponseEntity<FailureResponse>(response, HttpStatus.OK);

	}

	@PostMapping("/addInvest")
	public Investments addInvest(@RequestBody Investments invest) {
		return investmentService.addInvest(invest);
	}

}
