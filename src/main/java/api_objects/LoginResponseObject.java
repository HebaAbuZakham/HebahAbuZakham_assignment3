package api_objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class LoginResponseObject {
    @JsonProperty("access_token")
    private JsonNode accessToken;
    @JsonProperty("scope")
    private JsonNode scope;
    @JsonProperty("expires_in")
    private JsonNode expiresIn;
    @JsonProperty("token_type")
    private JsonNode tokenType;

    public JsonNode getAccessToken() {
        return accessToken;
    }

    public JsonNode getScope() {
        return scope;
    }

    public JsonNode getExpiresIn() {
        return expiresIn;
    }

    public JsonNode getTokenType() {
        return tokenType;
    }
}
