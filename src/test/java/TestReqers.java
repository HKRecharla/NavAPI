import org.testng.annotations.Test;
import restServices.CreateUser;
import restServices.UpdateUser;
import restUtils.RestUSer;

public class TestReqers {


    @Test
    public void testReqres(){

        String id = CreateUser.buildCreateUser("Hari","leader");
        System.out.println("Create user id :: "+id);
        UpdateUser.buildUpdateUser("Krishna","Leader",id);
    }
}
