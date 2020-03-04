package com.cts.CA.dao;
import com.cts.CA.model.College;
import com.cts.CA.exception.CollegeException;

import java.util.List;

public interface ICollegeDAO {	
	String add(College college) throws CollegeException;
	boolean delete(String cname)throws CollegeException;
	College get(String cname) throws CollegeException;;
	List<College> getAll() throws CollegeException;;
	boolean update(College college) throws CollegeException;

}
