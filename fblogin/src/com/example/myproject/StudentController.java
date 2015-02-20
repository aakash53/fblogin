package com.example.myproject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;


@Controller
public class StudentController {
	

	@RequestMapping({"/index","/"})
	   public ModelAndView indexpage() {
	      return new ModelAndView("index");
	   }

	   
   @RequestMapping(value = "/student", method = RequestMethod.GET)
   public ModelAndView student() {
      return new ModelAndView("student", "command", new Student());
   }
   
   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("SpringWeb")Student student,HttpServletRequest req,HttpServletResponse res) throws IOException {
	   DatastoreService ds= DatastoreServiceFactory.getDatastoreService();  
	   String name=req.getParameter("name");
	  String age=req.getParameter("age");
	   String id=req.getParameter("id");
	   String branch=req.getParameter("branch");
	   String grade=req.getParameter("grade");
	   String university=req.getParameter("university");

	   //Adding to DataStore	
	   
	  // Key studentKey = KeyFactory.createKey("Student",id);
	    Entity e = new Entity("Student",id);
	  e.setProperty("name", name);
	  e.setProperty("age", age);
	  e.setProperty("id", id);
	  e.setProperty("branch", branch);
	  e.setProperty("grade", grade);
	  e.setProperty("university",university);
	  ds.put(e);
	  
	  
	  res.getWriter().print("Data Added");
      return "addsuccess";
   }
   
   @RequestMapping(value = "/seestudent", method = RequestMethod.GET)
   public ModelAndView viewstudent() {
	   DatastoreService ds= DatastoreServiceFactory.getDatastoreService();  
		List<Student> list=new ArrayList<Student>();   
	
	   Query q=new Query("Student");
	    PreparedQuery pq=ds.prepare(q);
	    for(Entity e1: pq.asIterable()){	
	    	   Student student=new Student();
	    	System.out.println(e1); 
	    	
	    	
	    	String uid=(String)e1.getProperty("id");
			  String uname=(String)e1.getProperty("name");
			  String ubranch=(String)e1.getProperty("branch");
			  String  uage=(String)e1.getProperty("age");
			  String univ=(String)e1.getProperty("university");
			  String ugrade=(String)e1.getProperty("grade");
			 
	
			  student.setName(uname);
			  student.setAge(Integer.parseInt(uage));
			  student.setBranch(ubranch);
			  student.setGrade(ugrade);
			  student.setId(Integer.parseInt(uid));
			  student.setUniversity(univ);
			   list.add(student);
		
	    }
	 
	   
	  ModelAndView mav=new ModelAndView();
	  mav.setViewName("showstudent");
	  mav.addObject("lists",list);
 	  // retrieve data in the database 
 	 
 		
 	  
 	 return mav;
   
   }   
   @SuppressWarnings("deprecation")
@RequestMapping(value = "/deleteStudent/{name}", method = RequestMethod.GET)
   public ModelAndView deleteStudent(@PathVariable String name) {
	   DatastoreService ds= DatastoreServiceFactory.getDatastoreService();
	   Query query = new Query("Student");
	    query.addFilter("name", FilterOperator.EQUAL,name);
	    PreparedQuery pq = ds.prepare(query);
	    Iterator<Entity> itr = pq.asIterator();
	 
	    //	System.out.println(e.getKey());
	    while(itr.hasNext())

	    		ds.delete(itr.next().getKey()); //delete it
	    return new ModelAndView("redirect:../seestudent");
   } 
   @SuppressWarnings("deprecation")
@RequestMapping(value="/updateStudent/{name}", method = RequestMethod.GET)
	public String getUpdateCustomerPage(@PathVariable String name, 
			HttpServletRequest request, ModelMap model) {

		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		Query query = new Query("Student");
		query.addFilter("name", FilterOperator.EQUAL, name);
		PreparedQuery pq = datastore.prepare(query);

		Entity e1 = pq.asSingleEntity();
		
		
		   Student student=new Student();
	    	System.out.println(e1); 
	    	
	    	
	    	String uid=(String)e1.getProperty("id");
			  String uname=(String)e1.getProperty("name");
			  String ubranch=(String)e1.getProperty("branch");
			  String  uage=(String)e1.getProperty("age");
			  String univ=(String)e1.getProperty("university");
			  String ugrade=(String)e1.getProperty("grade");
			 
	
			  student.setName(uname);
			  student.setAge(Integer.parseInt(uage));
			  student.setBranch(ubranch);
			  student.setGrade(ugrade);
			  student.setId(Integer.parseInt(uid));
			  student.setUniversity(univ);
		model.addAttribute("student",student);

		return "update";

	}
   
   @RequestMapping(value="/update", method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest req, ModelMap model) {
	   DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
	   String name=req.getParameter("name");
		  String age=req.getParameter("age");
		   String id=req.getParameter("id");
		   String branch=req.getParameter("branch");
		   String grade=req.getParameter("grade");
		   String university=req.getParameter("university");

		    Entity e = new Entity("Student",id);
		  e.setProperty("name", name);
		  e.setProperty("age", age);
		  e.setProperty("id", id);
		  e.setProperty("branch", branch);
		  e.setProperty("grade", grade);
		  e.setProperty("university",university);
		  ds.put(e);
		  
		  
		  return new ModelAndView("redirect:../seestudent");
	}
   
   
}