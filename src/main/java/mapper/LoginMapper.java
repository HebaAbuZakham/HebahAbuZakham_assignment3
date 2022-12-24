package mapper;

import api_objects.LoginResponseObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

public class LoginMapper {
    public static LoginResponseObject readObjectLogin(Response response) {
        LoginResponseObject loginResponseObject;
        String json = response.getBody().asString();
        ObjectMapper mapper = new ObjectMapper();
        try {
            loginResponseObject = mapper.readValue(json, LoginResponseObject.class);
            return loginResponseObject;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
