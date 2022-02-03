package restServices;

import com.google.gson.Gson;
import commonUtils.PropertyReader;
import globalConfig.Constants;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import restUtils.ResponseBuilder;
import restUtils.RestUSer;
import restUtils.model.createUser.CreateUserPayload;

public class UpdateUser {

    public static String buildUpdateUser(String name, String job,String id){
        String baseurl= PropertyReader.geValue(Constants.BASE_URL);

        System.out.println("Update url :: "+baseurl + Endpoints.UPDATEUSER+id);
        Response response = RestUSer.putCall(baseurl + Endpoints.UPDATEUSER+id, setUser(name, job));

        int status = ResponseBuilder.statuscode(response);

        if(status==200){
            JSONObject json = new JSONObject(ResponseBuilder.responseReader(response));
            //String responseName = json.getString("name");
            //Assert.assertEquals(responseName,name);
            //System.out.println("Actual Name : "+responseName+" ___ Expected name : "+name);
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
        System.out.println("Update User request  "+json); // we can use log4j
        return json;
    }

}
