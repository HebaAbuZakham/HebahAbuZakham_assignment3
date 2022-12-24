package apis_helpers;

import custom_exceptions.InvalidRequestResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

public class PostAPIHelper {
    public static Response post(String apiURL, JSONObject requestBody) {
        if (RequestValidator.isNotNullOrEmpty(apiURL)) {
            return RestAssured.given().that().header("Content-Type", "application/json").body(requestBody.toString()).when().post(apiURL).thenReturn();
        } else
            try {
                throw new InvalidRequestResponse("Invalid request/response");
            } catch (InvalidRequestResponse e) {
                throw new RuntimeException(e);
            }
    }
}
