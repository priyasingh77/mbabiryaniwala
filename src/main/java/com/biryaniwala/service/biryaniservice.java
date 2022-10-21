package com.biryaniwala.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.biryaniwala.model.biryani;
import com.biryaniwala.repository.biryanirepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class biryaniservice {
		@Autowired
		private biryanirepo repo;
		
		//Method to adding biryani 
		public String addBiryani(biryani b1) {
			repo.save(b1);
			return "Biryani added";
		}
		//Method to adding multiple biryanis
		public String addAllBiryani(List<biryani>blist) {
			repo.saveAll(blist);
			return "All biryanis added successfully";
		}
		//Method to retriving all biryani from DB
		
		public List<biryani> getAllBiryani(){
			List<biryani> allbiryani=new ArrayList<>();
			repo.findAll().forEach(allbiryani::add);
			return allbiryani;
		}
		//Method to retrive biryani details from DB using biryani Id
		public  Optional<biryani> getBiryaniId(int id) {
			return repo.findById(id);
		}
		//Method to retrive  biryani details form DB using biryani Type
		public List<biryani> getBiryaniByType( String btype){
			 return repo.findByBiryaniType(btype);
		}
		//Method to retrive  biryani details form DB using biryanrange
		public List<biryani>getBiryaniByRange(int bprice){
			return repo.findByBiryaniprice( bprice);
		}
}