package mapper;

import api_objects.PromotionResponseObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

public class PromotionMapper {
    public static PromotionResponseObject readObjectPromotion(Response response) {
        PromotionResponseObject promotionResponseObject;
        String json = response.getBody().asString();
        ObjectMapper mapper = new ObjectMapper();
        try {
            promotionResponseObject = mapper.readValue(json, PromotionResponseObject.class);
            return promotionResponseObject;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
