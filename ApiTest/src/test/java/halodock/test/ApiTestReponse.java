package halodock.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import halodock.base.TestBase;
import responseData.ResponseData;

public class ApiTestReponse extends TestBase{
	TestBase testBase;
	String serviceUrl;


	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		testBase = new TestBase();
		serviceUrl = prop.getProperty("baseURL");
		

	}
	@Test(priority = 1)
	public void getWeatherLocationId() throws UnirestException, InterruptedException {
		HttpResponse<String> response;
		String endPointUrl = prop.getProperty("endPoint");
		response = Unirest.get(serviceUrl + String.format(endPointUrl, prop.getProperty("startDate"),prop.getProperty("endDate")))
				.header("Content-Type", "application/json").asString();
		System.out.println(response.getBody());
		ResponseData[] responseData=(new Gson().fromJson(response.getBody(),ResponseData[].class));
		for(int i=0;i<responseData.length;i++){
			System.out.println("Mission_Name-->"+responseData[i].getMission_name());
			System.out.println("Rocket_Name-->"+responseData[i].getRocket().getRocket_name());
			for(int j=0;j<responseData[i].getRocket().getFirst_stage().getCores().length;j++){
				if(responseData[i].getRocket().getFirst_stage().getCores()[j].getReused().equals("true")) {
					System.out.println("Core_Reused-->" + responseData[i].getRocket().getFirst_stage().getCores()[j].getReused());
					System.out.println("Core_Serial-->" + responseData[i].getRocket().getFirst_stage().getCores()[j].getCore_serial());
				}
			}
			for(int k=0;k<responseData[i].getRocket().getSecond_stage().getPayloads().length;k++){
				if(responseData[i].getRocket().getSecond_stage().getPayloads()[k].getReused().equals("true")) {
					System.out.println("Payload_Reused-->" + responseData[i].getRocket().getSecond_stage().getPayloads()[k].getReused());
					System.out.println("Payload_Id-->" + responseData[i].getRocket().getSecond_stage().getPayloads()[k].getPayload_id());
				}
			}

		}

	}
}
