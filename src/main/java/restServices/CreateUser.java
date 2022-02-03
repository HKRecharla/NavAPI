package restServices;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import commonUtils.Jsonutil;
import commonUtils.PropertyReader;
import globalConfig.Constants;
import io.restassured.response.Response;
import org.json.JSONObject;
import restUtils.RequestBuilder;
import restUtils.ResponseBuilder;
import restUtils.RestUSer;
import restUtils.model.createUser.CreateUserPayload;
import restUtils.model.createUser.CreateUser_Response;

public class CreateUser {


    public static String buildCreateUser(String name, String job){
        String baseurl= PropertyReader.geValue(Constants.BASE_URL);
        System.out.println("Create URl :: "+baseurl + Endpoints.CREATEUSER);

        Response response = RestUSer.postCall(baseurl + Endpoints.CREATEUSER, setUser(name, job));

        int status = ResponseBuilder.statuscode(response);
        String id="";
        if(status==201){
            JSONObject json = new JSONObject(ResponseBuilder.responseReader(response));
            id = json.getString("id");
           // Jsonutil.convertStringtoObject(responseReader(response), CreateUser_Response.class);
        }
        return id;

    }


    public static String setUser(String name,String job){
        // can read name from CSV, EXCEL or JSON
        CreateUserPayload user = new CreateUserPayload();
        user.setName(name);
        user.setJob(job);
        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println("Create User request  "+json); // we can use log4j
        return json;
    }



}
