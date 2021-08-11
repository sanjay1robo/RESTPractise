import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.File;

import static io.restassured.RestAssured.given;

public class TestCase4 {

    public static void main(String[] args)
    {
        Response res = given()
            .auth().none().log().all()
            .header("Content-Type","application/json")
            .body(new File("/Users/coviam/Documents/Automation/Catalog/CatalogAPI/untitled/src/main/resources/testcase4_dataFile.json"))
        .when()
            .post("http://localhost:3030/products")
        .then()
            .extract().response();

        System.out.println(res.asString());

        // method1
        System.out.println("ID :" + res.jsonPath().get("id"));
        System.out.println("ID :" + res.jsonPath().get("$"));

        JsonPath js = new JsonPath(res.asString());
        String idValue = js.getString("id");

        System.out.println("Complete json body extracton :" + js.get("$"));
        System.out.println("ID value extracted - type 1 :" + idValue);
        System.out.println("ID value extracted - type 2 :" + js.get("id"));

        System.out.println(res.getStatusCode());
    }
}
