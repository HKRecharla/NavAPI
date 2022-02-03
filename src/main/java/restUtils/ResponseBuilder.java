package restUtils;

import io.restassured.response.Response;

public class ResponseBuilder {

    public static String  responseReader(Response response){
        String res =response.asString();
        System.out.println("Response :: "+res);
        return res;
    }

    public static int statuscode(Response response){
        return response.getStatusCode();
    }
}
