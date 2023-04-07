import api_objects.PromotionResponseObject;
import apis.GetPromotion;
import io.restassured.response.Response;
import mapper.PromotionMapper;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Helpers.Helper.validateJSONSchema;

public class PromotionAPITest extends LoginAPITest {

    @Test(description = "Verify Promotion API using the JSON schema ", priority = 1)
    public void verifyPromotionAPI() {
        GetPromotion getPromotion = new GetPromotion();
        int productId = 1;
        Response response = getPromotion.hitPromotionAPI(productId, token);
        Assert.assertFalse(response.getBody().toString().isEmpty());
        validateJSONSchema(response, "PromotionSchema.json");
        response.getBody().prettyPrint();
    }

    @Test(description = "Verify the using ID value is the used one in the request", priority = 2)
    public void verifyTheUsingIdInPromotionAPI() {
        GetPromotion getPromotion = new GetPromotion();
        int productId = 1;
        Response response = getPromotion.hitPromotionAPI(productId, token);
        Assert.assertFalse(response.getBody().toString().isEmpty());
        PromotionResponseObject promotionResponseObject = PromotionMapper.readObjectPromotion(response);
        Assert.assertEquals(productId, promotionResponseObject.getId().asInt());
        System.out.println(promotionResponseObject.getId().asInt());

    }
}

