package comapi.rest.api.helpers;

import static org.junit.Assert.assertEquals;

import javax.net.ssl.SSLEngineResult.Status;

import org.apache.http.HttpStatus;
import org.junit.Assert;
import org.junit.Test;

import comapi.rest.api.model.RestResponse;

public class TestGetMathod {
	
	@Test
	public void getPingAlive()
	{
		String url="http://localhost:8080/laptop-bag/webapi/prompt/ping/Hello";
		RestResponse respnse=RestApiHelper.performGetRequest(url, null);
		Assert.assertEquals(HttpStatus.SC_OK, respnse.getStatuscode());
		Assert.assertEquals("Hi! Hello", respnse.getBody());
		
	}

}
