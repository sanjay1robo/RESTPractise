import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TestCase1 {

    public static void main(String args[])
    {
        Response res = given()
            .when()
                .queryParam("$limit","2")
                .queryParam("$skip","0")
            .get("http://localhost:3030/products")
            .then().statusCode(200).extract().response();

        System.out.println(res.asString());
    }

}
