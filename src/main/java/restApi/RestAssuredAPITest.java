package restApi;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestAssuredAPITest {
    private static String requestBody = "{\n" +
            "  \"title\": \"foo\",\n" +
            "  \"body\": \"bar\",\n" +
            "  \"userId\": \"1\" \n}";
    @Test
    public void GetBooksDetails() {
        RestAssured.baseURI = "https://flirb2cprod.b2clogin.com/flirb2cprod.onmicrosoft.com/oauth2/v2.0/token?p=B2C_1A_RayMarineROPC&response_type=token%20id_token&grant_type=password&client_id=6ad1fda7-90bb-4570-b2fb-cdc83f617964&scope=openid%206ad1fda7-90bb-4570-b2fb-cdc83f617964%20offline_access&username=sieutt%40nexlesoft.com&password=Sieu123%40";
        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .extract().response();

        System.out.println(response.asString());
        System.out.println(response.jsonPath().getString("body"));
    }
}
