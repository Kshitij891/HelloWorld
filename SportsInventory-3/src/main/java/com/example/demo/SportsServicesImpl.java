package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SportsServicesImpl implements SportsServices
{   
	@Autowired
	SportsRepo repo; 
	
	
	public List<Sports> getallsports()
	{
		return repo.findAll();
	}
	
	 public Sports addSports(Sports s)                                  
     {   
	        repo.save(s);                                                             
	    	return s;
	 }
	 
	 public Optional<Sports> findId(int id)
	 {
		
			return repo.findById(id);
			
	 }
	 
	 public void deletebyid(int id)
	 {
		 repo.deleteById(id);
	 }
}
