package apis_helpers;

import custom_exceptions.InvalidRequestResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

public class GetAPIHelper {
    public static Response get(String apiURL, String Token) {
        if (RequestValidator.isNotNullOrEmpty(apiURL)) {
            return RestAssured.given().that().headers("Authorization", Token, "x-api-key", "GfqP7b2I99sUMkbxGEk5Xk56RscaWRuo").get(apiURL).thenReturn();
        } else
            try {
                throw new InvalidRequestResponse("Invalid request/response");
            } catch (InvalidRequestResponse e) {
                throw new RuntimeException(e);
            }
    }
}
