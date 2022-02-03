package restUtils;
import commonUtils.PropertyReader;
import globalConfig.Constants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;

public class RestUSer {

    static RequestSpecification requestSpecification=null;

    public static RequestSpecification buildRest(){
        return RestAssured.given();
    }

    public static RequestSpecification restInit(){
        if(requestSpecification==null){
            return buildRest();
        }
        return requestSpecification;
    }


    /**
     *
     * post
     * put
     * response
     * build request
     * send request
     *
     */

    public static Response postCall(String url,String body){
        return restInit().relaxedHTTPSValidation().when().body(body).post(url);
    }

    public static Response postCall(String url, String body, HashMap<String, Object> headers){
        return restInit().relaxedHTTPSValidation().when().body(body).post(url);
    }

    //update user
    public static Response putCall(String url,String body){
        //if nrequired we can map headers. parameters
        return restInit().relaxedHTTPSValidation().when().body(body).put(url);
    }




}
