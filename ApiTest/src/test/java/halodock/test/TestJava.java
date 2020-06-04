package halodock.test;

import org.json.JSONObject;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

public class TestJava {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getCountries("sds",2);
	}

	
	 static int getCountries(String s, int p) throws Exception {
	        HttpResponse<JsonNode> response;
	        String serviceUrl = "https://jsonmock.hackerrank.com/api/countries/search?name=%s";
	        String pathVarible = "&page=%s";
	        response = Unirest.get(String.format(serviceUrl, "un"))
	                .header("Content-Type", "application/json").asJson();
	        System.out.println(response.getBody());
	        JSONObject page = new JSONObject(response);
	        int count=0;
	        for(int i=0;i<response.getBody().getObject().getJSONArray("data").length();i++){
	            JSONObject animal = response.getBody().getObject().getJSONArray("data").getJSONObject(i);
	            animal.getString("name");
	            count++;
	        }
	        return count;
	        }
	    

}
