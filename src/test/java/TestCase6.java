import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TestCase6 {

    public static void main(String args[])
    {
        Response res = given()
            .auth().none().log().all()
            .header("content-type","application/json")
        .when()
            .get("http://localhost:3030/healthcheck")
        .then()
            .statusCode(200).extract().response();

        System.out.println(res.prettyPrint());

        JsonPath js = new JsonPath(res.asString());
        Integer categories = js.getInt("documents.categories");


        System.out.println("Extracted categories values :" + categories );
    }

}
