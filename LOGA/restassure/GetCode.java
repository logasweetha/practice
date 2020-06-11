package com.demo.restassure;

import org.junit.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import junit.framework.Assert;

public class GetCode {

	@Test
	public void testResponseCode(){
		
		 int code=get("http://dummy.restapiexample.com/api/v1/employees").getStatusCode();
		 System.out.println("status code is"+code);
		 Assert.assertEquals(200,code);
		 
		 
	}
	
	@Test
	public void test(){
		
		 String data=get("http://dummy.restapiexample.com/api/v1/employees").asString();
		 System.out.println("data is"+data);
		 long time=get("http://dummy.restapiexample.com/api/v1/employees").getTime();
		System.out.println("Response time is"+time);
	}
	
}
