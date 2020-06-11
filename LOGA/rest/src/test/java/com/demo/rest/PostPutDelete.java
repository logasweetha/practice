package com.demo.rest;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PostPutDelete {

	
	
	@Test
	public void test1() {

		RequestSpecification request=RestAssured.given();
		
		request.header("Content-Type","application/json");

		JSONObject json=new JSONObject();
		json.put("employee_name", "snake babu");
		json.put("employee_salary", "20000");
		json.put("employee_age", "30");
		
		request.body(json.toJSONString());
		Response resp=request.post("http://dummy.restapiexample.com/api/v1/create");
		int code=resp.getStatusCode();
		Assert.assertEquals(201, code);
		System.out.println("status code is"+code);
	}
}