package com.example.demo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SportsRepo extends JpaRepository<Sports, Integer>
{

   List<Sports> findByGame(String game);
   
   @Query("from Sports where sid > ?1")
   List<Sports> Greaterid(int id); 
   
   
   
   


}