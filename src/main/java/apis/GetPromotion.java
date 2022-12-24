package apis;

import apis_helpers.GetAPIHelper;
import io.restassured.response.Response;


public class GetPromotion {
    public static Response apiResponse;

    public static Response hitPromotionAPI(int product_id, String Token) {
        apiResponse = GetAPIHelper.get("https://maf-holding-dev.apigee.net/v1/share/promote-sections/" + product_id, Token);
        return apiResponse;
    }
}
