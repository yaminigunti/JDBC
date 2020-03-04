package com.cts.maven.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cts.maven.model.Hello;

public class TestHello {
	private Hello obj=new Hello();
	
	
	@Test
	public void testAddition() {
		int result=obj.addition(10, 20);
		assertEquals(3,result);
	}
	
	@Test
	public void testboolean() {
		boolean count=obj.check(3);
		assertEquals(true,count);
	}

}
