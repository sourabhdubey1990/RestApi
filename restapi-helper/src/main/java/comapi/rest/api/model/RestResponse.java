package comapi.rest.api.model;

public class RestResponse {
	private int statuscode;
	private String body;
	
	public int getStatuscode() {
		return statuscode;
	}
	public String getBody() {
		return body;
	}
	
	public RestResponse(int statuscode, String body) {
		super();
		this.statuscode = statuscode;
		this.body = body;
	}

	@Override
	public String toString() {
		return "RestResponse [statuscode=" + statuscode + ", body=" + body + "]";
	}
	
	
	
	
	
}
