package com.learn.springboot.springbootSimpleRest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@RequestMapping("/courses")
  public List<Course> retrieveSetOfCourses(){
	  return Arrays.asList(
			  new Course(1,"java","Ayush"),
			  new Course(2,"python","Punith")
			  );
  }
}
