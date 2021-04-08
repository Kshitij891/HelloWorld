package com.example.demo;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SportsServicesImplTest 
{
    @Autowired
	private SportsServices service;
	
    @MockBean
    private SportsRepo repo;
	
	@Test
	public void getallsportstest() 
	{                                               //.collect() collect data from stream  and Collectors.toList() convert it into List
	  when(repo.findAll()).thenReturn(Stream.of(new Sports(101,"Bat","Cricket",100), new Sports(102,"Ball","FootBall",400)).collect(Collectors.toList()));
	  assertEquals(2,service.getallsports().size());
	}
	
	@Test
	public void addSportstest()                                
    {   
	    Sports ob=new Sports(105,"Bat","baseball",100);
	    when(repo.save(ob)).thenReturn(ob);
	    assertEquals(ob,service.addSports(ob));
	}
	
	@Test
	public void findIdtest()                                
    {   
	    Optional<Sports> ob=Optional.ofNullable(new Sports(105,"Bat","baseball",100));  //Since, ob is optional type it can store null or Sports.Optional.ofNullabale store new value in ob.
	    when(repo.findById(105)).thenReturn(ob);
	    assertEquals(ob,service.findId(105));
    }
	
	@Test
	public void Deletetest()
	{
	  Optional<Sports> s=Optional.ofNullable(new Sports(106,"hat","nall",100));
	  when(repo.findById(106)).thenReturn(s);
	  Optional<Sports> ob=service.findId(106);
	  service.deletebyid(106);
	  Optional<Sports> ob1=service.findId(106);
	  assertEquals(ob,ob1);
	  
//	  service.deletebyid(106);
//	  verify(repo,times(1)).deleteById(106);
	}
	

}
