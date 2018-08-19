package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

public String findGrade(Student studentObject)
{
	String z;

	int[] x= studentObject.getMarks();
	if(x[0]<35 || x[1]<35 || x[2]<35 )
	{
		z= "F";
	}
	
	else
	{
		int sum= x[0]+x[1]+x[2];
		if(sum<=150)
			z=  "D";
		else if(150 < sum & sum <= 200)
			z=  "C";
		else if(200 < sum & sum <=250)
			z=  "B";
		else 
			z=  "A";	
	}
	return z;
	
}
public String validate(Student studentObject)
throws NullStudentException, NullNameException, NullMarksArrayException
{
	
		if (studentObject==null)
	{
		throw new NullStudentException();
	}
	else if(studentObject.getName()=="" || studentObject.getName()== null )
        {
				
			throw new NullNameException();
		}
		else if(studentObject.getMarks()==null || studentObject.getMarks().length<=0)
	    {
		throw new NullMarksArrayException();
        }	
	String k;
	k=this.findGrade(studentObject);
	return k;
}

}
