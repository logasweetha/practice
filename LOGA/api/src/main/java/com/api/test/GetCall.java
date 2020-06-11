package com.api.test;

import org.junit.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;




public class GetCall {

	
	
	@Test
	public void test_numberOfCircuits17(){
		given().
		when().
			get("http://ergast.com/api/f1/2017/circuits.json").
		then().
		assertThat().
			body("MRData.CircuitTable.Circuits", hasSize(20));
	}

	private ResponseAwareMatcher<Response> hasSize(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
