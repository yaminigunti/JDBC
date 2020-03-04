package com.cts.CA.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cts.CA.exception.CollegeException;
import com.cts.CA.model.College;
public class CollegeDAOCollectionImpl  implements ICollegeDAO{
private Map<String, College> colleges;
	
	public CollegeDAOCollectionImpl() {
		colleges = new TreeMap<>();
	}
	
	@Override
	public String add(College college) throws CollegeException {
		String cname = null;
		if (college != null) {
			cname = college.getCname();
			colleges.put(cname, college);	
		}
		return cname;
	}
	
	@Override
	public boolean delete(String cname) throws CollegeException {
		boolean isDone = false;
		if (cname != null) {
			colleges.remove(cname);
			isDone = true;
		}
		return isDone;
	}
	
	@Override
	public College get(String cname) throws CollegeException {
		return colleges.get(cname);
	}
	

	@Override
	public List<College> getAll() throws CollegeException {
		return new ArrayList<>(colleges.values());
	}
	
	@Override
	public boolean update(College book) throws CollegeException {
		boolean isDone = false;
		if (book != null) {
			String bcode = book.getCname();
			colleges.replace(bcode, book);
			
		}
		return isDone;
	}


}
