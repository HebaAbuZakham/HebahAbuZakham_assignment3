package apis;

import apis_helpers.PostAPIHelper;
import constants.ApiConstants;
import io.restassured.response.Response;
import org.json.JSONObject;

public class PostLogin {
    public static Response apiResponse;

    public static Response hitLoginAPI(String username, String password) {
        JSONObject jsonObject = new JSONObject("{\"grant_type\":\"password\",\"username\":" + "\"" + username + "\"" + ",\"password\":" + "\""
                + password + "\"," + "\"audience\":\"https://sit.maf-dev.auth0.com/api/v2/\",\"client_id\":\"l9DGyNKhON48e6BgTFAg17wWY78urJ4t\"" +
                ",\"client_secret\":\"yl9xlvv9N35GpLYDxBp22HLFvPv4_RrtPQxFhznSV2C5xqUYWVWqXl7qwdt2gq2f\"}");
        apiResponse = PostAPIHelper.post(ApiConstants.LOGIN_API, jsonObject);
        return apiResponse;
    }
}
