/**
 * 
 */
package comapi.rest.api.helpers;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import comapi.rest.api.model.RestResponse;

/**
 * @author Sourabh
 *
 */
public class getRequest {

	/**
	 * @param args
	 * Step 1 create HTTP get request
	 * Step 2 create the HTTP client
	 * Step 3 execute HTTP get request using HTTP client
	 * Step 4 catch the response of the request
	 * Step 5 display the response
	 */
	public static void main(String[] args) {
		
		/*HttpGet get= new HttpGet("http://localhost:8080/laptop-bag/webapi/prompt/ping/Hello");
		try(CloseableHttpClient client=HttpClientBuilder.create().build();
				CloseableHttpResponse responsse=client.execute(get);) 
		{
			StatusLine status=responsse.getStatusLine();
			System.out.println(status.getStatusCode());
			System.out.println(status.getProtocolVersion());
			
			Body Message
			 * body response handle is a interface and here we directly use its class
			 * which is basic responsehandler. we used handle response to get body string messages
			 * 
			 * 
			
			BasicResponseHandler body= new BasicResponseHandler();
			String bodymsg=body.handleResponse(responsse);
			System.out.println(bodymsg);
			
			RestResponse restResponse=new RestResponse(responsse.getStatusLine().getStatusCode(), body.handleResponse(responsse));
			System.out.println(restResponse.toString());
			
			
			
			
		} catch (Exception e) {
		e.printStackTrace();
		}*/
		RestResponse response= RestApiHelper.performGetRequest("http://localhost:8080/laptop-bag/webapi/prompt/ping/Hello", null);
		System.out.println(response.toString());
		

	}

}
