package com.biryaniwala.controller;



import java.util.List;
import java.util.Optional;

import com.biryaniwala.model.biryani;
import com.biryaniwala.service.biryaniservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class biryaniController {
	
	@Autowired
		private biryaniservice service;
	
			// >>Method to add one  birayani to DATABASE
			@RequestMapping (method=RequestMethod.POST,value="/biryani")
			public String addBiryani(@RequestBody biryani b1) {
			return service.addBiryani(b1);
			}
			//Method add multiple biryani to DB
			@RequestMapping (method=RequestMethod.POST,value="/biryani/addall")
			public String addAllBiryani(@RequestBody List<biryani> b1) {
			return service.addAllBiryani(b1);
			}
			
			//Method to reteive all biranis
			@RequestMapping(method=RequestMethod.GET,value="/biryani")
			public List<biryani> getAllBiryani(){
				return service.getAllBiryani();			
			}
			//Methodto reterive biryani with  Id
			@RequestMapping(method=RequestMethod.GET,value="/biryani/id/{id}")
			public Optional<biryani> geBiryaniById(@PathVariable int id) {
				return service.getBiryaniId(id);
			}
			//Method to retrive biryani with type
			@RequestMapping(method=RequestMethod.GET,value="/biryani/type/{btype}")
			public List<biryani> getBiryaniByType(@PathVariable String btype){
				return service.getBiryaniByType(btype);
			}
			// Method to retrive biryani in range
			@RequestMapping(method=RequestMethod.GET,value="/biryani/range/{bprice}")
			public List<biryani> getBiryaniByRange(@PathVariable int bprice){
				return service.getBiryaniByRange(bprice);
			}
			
}




