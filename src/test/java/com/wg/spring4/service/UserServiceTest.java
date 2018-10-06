package com.wg.spring4.service;

import static org.testng.Assert.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;


@ContextConfiguration("classpath*:/applicationContext.xml")

public class UserServiceTest extends AbstractTestNGSpringContextTests{
	
	@Autowired
	UserService userService;
	
	@BeforeClass
	
	public void beforeClass()
	{
		System.out.println("#### the before class ####");
	}
	
	@Test
	public void testHasMatchCount()
	{
		boolean b=userService.hasMatchUser("admin", "123456");
		
		assertTrue(b);
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("#### the after class ####");
	}
	

}
