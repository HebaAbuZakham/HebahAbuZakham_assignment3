import api_objects.LoginResponseObject;
import apis.PostLogin;
import io.restassured.response.Response;
import mapper.LoginMapper;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Helpers.Helper.validateJSONSchema;

public class LoginAPITest {
    String token;

    @Test(description = "Verify Login API using the JSON schema and save token", priority = 1)
    public void verifyLoginAPI() {
        PostLogin postLogin = new PostLogin();
        Response response = postLogin.hitLoginAPI("hibaza987@gmail.com", "Test1234");
        Assert.assertFalse(response.getBody().toString().isEmpty());
        response.getBody().prettyPrint();
        validateJSONSchema(response, "LoginSchema.json");
        LoginResponseObject loginResponseObject = LoginMapper.readObjectLogin(response);
        token = "Bearer " + loginResponseObject.getAccessToken().asText();
        System.out.println(token);
    }
}
