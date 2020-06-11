package getRequest;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetData {
	@Test
	public void testResponseCode(){
		Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1");
		
		int code=resp.getStatusCode();
		System.out.println("status code is"+code);
		Assert.assertEquals(200, code);
	}
}
