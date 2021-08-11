import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static io.restassured.RestAssured.given;

public class TestCase2 {

    public static void main(String args[])
    {
        HashMap<String,Object> hm = new HashMap<String, Object>();
        hm.put("name","AutomationProduct3");
        hm.put("type","AutomationProductType1");
        hm.put("price",1000);
        hm.put("shipping",150);
        hm.put("upc","AutomationUpc");
        hm.put("description","AutomationProductDescription");
        hm.put("manufacturer","AutomationProductManufacturer1");
        hm.put("model","AutomationProductModel");
        hm.put("url","AutomationProductURL");
        hm.put("image","AutomationProductImage");


        Response res = given()
            .auth().none().log().all()
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
            .body(hm)
            .when()
            .post("http://localhost:3030/products")
            .then()
            .extract().response();

        System.out.println(res.asString());

    }
}
