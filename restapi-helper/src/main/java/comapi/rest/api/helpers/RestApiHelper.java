package comapi.rest.api.helpers;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import javax.management.RuntimeErrorException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import comapi.rest.api.model.RestResponse;

public class RestApiHelper {
	
	public static RestResponse performGetRequest(String url, Map <String,String> header)
	{
		try {
			return performGetRequest(new URI(url), header);
		} catch (URISyntaxException e) {

			throw new RuntimeException(e.getMessage(), e);
		}
	}
	public static RestResponse performGetRequest(URI uri, Map <String,String> header)
	{
		HttpGet get=new HttpGet(uri);
		try (CloseableHttpClient client= HttpClientBuilder.create().build();
				CloseableHttpResponse response= client.execute(get);)
		{
			ResponseHandler<String> body=new BasicResponseHandler();
			return new RestResponse(response.getStatusLine().getStatusCode(), body.handleResponse(response));
		} catch (Exception e)  
		{
			throw new RuntimeException(e.getMessage(), e);
		}
		
	}

}
