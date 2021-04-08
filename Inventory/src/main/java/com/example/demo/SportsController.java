package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SportsController 
{   
    @Autowired
	SportsRepo repo;                                                         //Help to access methods of interface SportsRepo
    
    
    /*Show all data */
    @GetMapping("/sports")                                                   //Whenever return type is string i expects that we are returning view name but we are returning data  
    public List<Sports> getalldata()                                        // so we write @Response body     
	 {   	
		 return (List<Sports>) repo.findAll();  
	
	 }
 
	
    
    /*Add data into database */                                                               //consumes will tell that it accept user input only in json format
    @PostMapping(path="/sports", consumes= {"application/json"})                      //The @ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.
	 public Sports addSports(@RequestBody Sports s)                                  /*If you are sending raw data in Json format you write @RequestBody*/
     {   
	        repo.save(s);                                                             //Save data in database addded by user
	    	return s;
	 }
	 
	
	 
	 /*Get data by id*/
     // @RequestMapping("/sports/102")                                           ---> Dont make sense bcoz we neeed to make method for every id
	 @GetMapping("/sports/{sid}")                                                    // { } give output for any sid
	 public java.util.Optional<Sports> getdata(@PathVariable("sid") int sid)
	 {
		 return repo.findById(sid);      
	 }
	 
	 /*Delete particular record by id*/
	 @DeleteMapping("/sports/{sid}")
	 public String deleteSport(@PathVariable("sid") int sid)
	 {
		 repo.deleteById(sid);
		 return "Deleted";
		 
	 }
	 
	 /*Update particular record*/
	 @PutMapping(path="/sports/{sid}", consumes= {"application/json"})
     public Sports updateSport(@RequestBody Sports s,@PathVariable("sid") int sid)
     {
    	 java.util.Optional<Sports> ss=repo.findById(sid);  //data of id found from database.
    	 Sports gg=ss.get(); //Data from Option class Sports object moved to Normal Sports class object.
    	 //Data moved from user input to databse

//     	 gg.setSid(sid); -----------------------> No need to write this as you are accessing record using sid , u cant change its value
//    	 gg.setGame(s.getGame());
//  	 gg.setPrice(s.getPrice());
    	 
    	 if(s.getEquipment()!=null) {gg.setEquipment(s.getEquipment());} 
    	 if(s.getGame()!=null) {gg.setGame(s.getGame());} 
     	 if(s.getPrice()!=0) {gg.setPrice(s.getPrice());}    //If you dont pass any value for price in database 0 is stored and not null since it is int value.
    	 return repo.save(gg);     //new data saved
    	
     }
	 
	 /*Get data by game name*/
	 @GetMapping("/getsports/{game}")
	 public List<Sports> getdatabygame1(@PathVariable("game") String game)
	 {
		
		 return (List<Sports>)repo.findByGame(game);
		
	 }
	 
	 /* Get data for greater than particular id */
	 @GetMapping("/sp/{i}")
	 public List<Sports> getdataby(@PathVariable("i") int id)
	 {
		
		 return(List<Sports>)repo.Greaterid(id); 
		
	 }
	 

	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
//	 
//	 	@RequestMapping("/")
//		public String home()
//		{
//	    	return "home.jsp";  
//		}
//	//	
//		 @RequestMapping("/addSports")
//		    public String addSports( Sports s)
//			{   
//		        repo.save(s);                                            //Save data in database addded by yser
//		    	return "home.jsp";
//			}
	//	
	 
//	 @RequestMapping("/getdatabyId")
//	    public ModelAndView getdatabyId(@RequestParam("sid")int sid)
//		{   
//		    ModelAndView mv=new ModelAndView("showdata.jsp");        //send view
//		    Sports obj=repo.findById(sid).orElse(new Sports());     // data is extracted from database which is in object form so we made obj
//		    mv.addObject("id1",obj);                                //send data. id1 is name that we will be using on .jsp file to refer obj
//	        return mv;                                             //  mv= view + data
//		}
//	 
//	 @RequestMapping("/getdatabygame")
//	    public ModelAndView getdatabygame(@RequestParam("game")String g)
//		{   
//		    ModelAndView mv=new ModelAndView("showdata.jsp");
//		    List<Sports> obj=repo.findByGame(g);      //data extracted will be of List format so made refrence variable of List
//		    mv.addObject("g1",obj);
//	        return mv;
//		}
	 

	
	 
	 
	 
	 
}
