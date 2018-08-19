package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {

public int findNumberOfNullMarks(Student data[])
{
 
	int c= 0;
	for (Student student : data) {
		if(student!=null){
			
		if(student.getMarks()==null || student.getMarks().length<=0 ){
			c++;
		}
		
		}
		
	}
	 return c;
	
	
	
}
public int findNumberOfNullNames(Student data [])
{
	int c= 0;
	for (Student student : data) {
		if(student!=null){
		if(student.getName()==null ){
			c++;
		}
		}
		
	}
	 return c;
                   
}
public int findNumberOfNullObjects(Student data [])
{
	int c= 0;
	for (Student student : data) {
		
		if(student==null){
			c++;
		}
		
	}
	 return c;
}

}
