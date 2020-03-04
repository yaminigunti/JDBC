package com.cts.MT.dao;

public interface IQueryMapper {

	public static final String ADD_STUDENT_QRY = 
			"INSERT INTO stu(sid,  sname, joindate ,fee) VALUES(?,?,?,?)";
	public static final String MODIFY_STUDENT_QRY = 
			"UPDATE stu SET sname=?,fee=?,joindate=? WHERE sid=?";
	public static final String DEL_STUDENT_QRY = 
			"DELETE FROM stu WHERE sid=?";
	public static final String GET_ALL_STUDENT_QRY = 
			"SELECT * FROM stu";
	public static final String GET_STUDENT_QRY = 
			"SELECT * FROM stu WHERE sid=?";
}

