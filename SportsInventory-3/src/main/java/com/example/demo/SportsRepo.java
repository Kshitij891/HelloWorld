package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SportsRepo extends JpaRepository<Sports, Integer> //< Entity class, PrimaryKey datatype>
{

   List<Sports> findByGame(String game);
//   
//   @Query("from Sports where sid > ?1")
//   List<Sports> Greaterid(int id); 
//   
   
   
   


}
