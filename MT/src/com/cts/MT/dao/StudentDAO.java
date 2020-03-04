package com.cts.MT.dao;
	import java.util.List;

	import com.cts.MT.model.Student;
	import com.cts.MT.exception.StudentException;

	public interface StudentDAO {
		
			String add(Student s) throws StudentException;
			boolean delete(String sid)throws StudentException;
			Student get(String sid) throws StudentException;;
			List<Student> getAll() throws StudentException;;
			boolean update(Student s) throws StudentException;
			void persist()throws StudentException;
			


}
