package com.cts.MT.dao;

import com.cts.MT.model.Student;
import com.cts.MT.exception.StudentException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StudentDAOIOStreamImpl implements StudentDAO {
	public static final String DATA_STORE_FILE_NAME = "StudentManagementUI.dat";

	private Map<String, Student> Stu;

	public StudentDAOIOStreamImpl() throws StudentException {
		File file = new File(DATA_STORE_FILE_NAME);

		if (!file.exists()) {
			Stu = new TreeMap<>();
		} else {
			try (ObjectInputStream fin = new ObjectInputStream(
					new FileInputStream(DATA_STORE_FILE_NAME))) {

				Object obj = fin.readObject();

				if (obj instanceof Map) {
					Stu = (Map<String, Student>) Stu;
				} else {
					throw new StudentException("Not a valid DataStore");
				}
			} catch (IOException | ClassNotFoundException exp) {
				throw new StudentException("Loading Data Failed");
			}
		}
		}

	@Override
	public String add(Student s) throws StudentException {
		String sid = null;
		if (s != null) {
			sid= s.getSid();
			Stu.put(sid, s);	
		}
		return sid;
	}

	@Override
	public boolean delete(String sid) throws StudentException {
		boolean isDone = false;
		if (sid != null) {
			Stu.remove(sid);
			isDone = true;
		}
		return isDone;
	}


	@Override
	public Student get(String sid) throws StudentException {
		return Stu.get(sid);
		
	}	
		

	@Override
	public List<Student> getAll() throws StudentException {
		return new ArrayList<>(Stu.values());
	}

	public boolean update(Student s) throws StudentException {
		boolean isDone = false;
		if (s != null) {
			String sid = s.getSid();
			Stu.replace(sid, s);
			
		}
		return isDone;
		
	}


	
	public void persist() throws StudentException {
		try (ObjectOutputStream fout = new ObjectOutputStream(
				new FileOutputStream(DATA_STORE_FILE_NAME))) {
			fout.writeObject(Stu);
		} catch (IOException exp) {
			throw new StudentException("Saving Data Failed");
		}

	}
}

