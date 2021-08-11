import io.restassured.response.Response;
import org.json.JSONException;
import org.json.JSONObject;


import static io.restassured.RestAssured.given;

public class TestCase3 {

    public static void main(String args[]) throws JSONException {
            JSONObject js = new JSONObject();
            js.put("name","AutomationProduct3" );
            js.put("type","AutomationProductType1");
            js.put("price",1000);
            js.put("shipping",150);
            js.put("upc","AutomationUpc");
            js.put("description","AutomationProductDescription");
            js.put("manufacturer","AutomationProductManufacturer1");
            js.put("model","AutomationProductModel");
            js.put("url","AutomationProductURL");
            js.put("image","AutomationProductImage");


        Response res = given()
            .log().all()
            .header("Content-Type","application/json")
            .body(js.toString())
            .when()
            .post("http://localhost:3030/products")
            .then()
            .statusCode(201)
            .extract().response();

        System.out.println(res.asString());

    }
}
