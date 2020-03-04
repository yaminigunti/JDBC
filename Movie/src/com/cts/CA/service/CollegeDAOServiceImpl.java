package com.cts.CA.service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cts.CA.model.College;
import com.cts.CA.dao.ICollegeDAO;
import com.cts.CA.exception.CollegeException;

public class CollegeDAOServiceImpl implements ICollegeDAO {
	
	private ICollegeDAO bookDao;

	public ICollegeDAO getDAO(){
		return bookDao;
	}
	
	public CollegeDAOServiceImpl() throws CollegeException {
		CollegeDao=College
		// bookDao = new BookDAOStreamImpl();
		
	}
	
	public boolean isValidCname(String cname){
		
		/*
		 * First letter must be capital
		 * Followed by three digits
		 */
		Pattern cnamePattern = Pattern.compile("[A-Z]\\d{3}");
		Matcher cnameMatcher = cnamePattern.matcher(cname);
		
		return cnameMatcher.matches();
	}
	
	public boolean isValid(String sname){
		/*
		 * First Letter should be capital
		 * Minimum length is 4 chars
		 * Maximum length is 20 chars.		
		 */
		Pattern titlePattern = Pattern.compile("[A-Z]\\w{3,19}");
		Matcher titleMatcher = snamePattern.matcher(sname);
		
		return titleMatcher.matches();
	}
	
	public boolean isValidFee(double fee){
		/*
		 * Price is between 5000 and 50000
		 */
		return fee>=5000 && fee<=50000;
	}
	
	public boolean isValidJoinDate(LocalDate joinDate){
		/*
		 * join date should not be greater than the current day.
		 */
		LocalDate today = LocalDate.now();
		//return publishDate.isBefore(today) || publishDate.equals(today);
		return today.isAfter(joinDate) || joinDate.equals(today);
	}
	
	public boolean isValidBook(College college) throws CollegeException{
		boolean isValid=false;
		
		List<String> errMsgs = new ArrayList<>();
		
		if(!isValidCname(college.getCname()))
			errMsgs.add("bcode should start with a capital alphabet followed by 3 digits");
		
		if(!isValidsname(college.getSname()))
			errMsgs.add("Title must start with capital and must be in between 4 to 20 chars in length");
		
		if(!isValidFee(College.getFee()))
			errMsgs.add("Price must be between INR.5 and INR.5000");
		
		if(!isValidPublishDate(book.getPublishDate()))
			errMsgs.add("Publish Date should not be a future date");
		
		if(errMsgs.size()==0)
			isValid=true;
		else
			throw new CollegeException(errMsgs.toString());
		
		return isValid;
	}


	@Override
	public String add(Book book) throws BookStoreException {
		String bcode=null;
		if(book!=null && isValidBook(book)){
			bcode=bookDao.add(book);
		}
		return bcode;
	}

	@Override
	public boolean delete(String bcode) throws BookStoreException {
		boolean isDone=false;
		if(bcode!=null && isValidBcode(bcode)){
			bookDao.delete(bcode);
			isDone = true;
		}else{
			throw new BookStoreException("bcode should be a capital letter followed by 3 digits");
		}
		return isDone;
	}

	@Override
	public Book get(String bcode) throws BookStoreException {
		return bookDao.get(bcode);
	}

	@Override
	public List<Book> getAll() throws BookStoreException {
		return bookDao.getAll();
	}

	@Override
	public boolean update(Book book) throws BookStoreException {
		boolean isDone = false;
		
		if(book!=null && isValidBook(book)){
			isDone = bookDao.update(book);
		}
		
		return isDone;
	}


//	@Override
//	public void persist() throws BookStoreException {
//		bookDao.persist();
//	}

public class Icollegeservice {

}


@Override
public String add(College college) throws CollegeException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public College get(String cname) throw                    
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean update(College college) throws CollegeException {
	// TODO Auto-generated method stub
	return false;
}
