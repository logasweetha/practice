package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
     
public class Api {

	final static String ROOT_URI = "http://dummy.restapiexample.com/api/v1";

	
	@Test
	public void test123() 
	{
		String Js="{"+
		           " \"id\": \"103\","+
		            "\"name\": \"Yuri Berry\","+
		            "\"salary\": \"675000\","+
		           " \"age\": \"40\","+
		          "  \"profile_image\": \"\""+
		       " }";
		
		Response postreponse=given().header("Content-Type","application/json").body(Js).when().post(ROOT_URI + "/create");
		assertEquals(200, postreponse.getStatusCode());
		System.out.println("post repose..."+postreponse.asString());

		//JsonPath postJsonPath=new JsonPath(postreponse.asString());
		//String post_response_id=postJsonPath.get("data.id");
		//String post_response_id=postJsonPath.get("data.id");
		//Response getresponse=given().contentType(ContentType.JSON).when().get(ROOT_URI+"/employees"+post_response_id);
		//assertEquals(200, getresponse.getStatusCode());
		//System.out.println("get response...."+getresponse.asString());

		
		JsonPath postjsonPath = new JsonPath(postreponse.asString());
		String post_response_id=postjsonPath.get("data.id");
		
		Response GETresponse = given().contentType(ContentType.JSON)
				.when().get(ROOT_URI + "/employee/"+post_response_id);
		//assertEquals(200, GETresponse.getStatusCode());

		System.out.println("Get repose..."+GETresponse.asString());

}
}
