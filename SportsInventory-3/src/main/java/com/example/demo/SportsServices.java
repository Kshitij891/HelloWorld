package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;

/*No need of SportsServicesImpl file if you create class in this file intsead of interface and declare 
& define methods in this class. */

@Service
public interface SportsServices 
{
  public List<Sports> getallsports();
  public Sports addSports(Sports ob);
  public Optional<Sports> findId(int id);
  public void  deletebyid(int id);
}
