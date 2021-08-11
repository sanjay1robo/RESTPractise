import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.AddProductsRequest;
import models.AddProductsResponse;

import static io.restassured.RestAssured.given;

public class TestCase5 {

public static void main(String args[])
{

    AddProductsRequest req = new AddProductsRequest();

    req.setName("AutomationProduct3");
    req.setType("AutomationProductType1");
    req.setPrice(1000);
    req.setShipping(150);
    req.setUpc("AutomationUpc");
    req.setDescription("AutomationProductDescription");
    req.setManufacturer("AutomationProductManufacturer1");
    req.setModel("AutomationProductModel");
    req.setUrl("AutomationProductURL");
    req.setImage("AutomationProductImage");


    AddProductsResponse ob = given()
        .auth().none().log().all()
        .header("Content-Type","application/json")
        .body(req)
        .contentType(ContentType.JSON)
        .when()
        .post("http://localhost:3030/products")
    .then()
        .statusCode(201)
        .extract().response().as(AddProductsResponse.class);

    if(ob.getName().equals("AutomationProduct3"))
    {
        System.out.println("Assertion passed");
    }
    else
    {
        System.out.println("Assertion failed");
    }

    System.out.println(ob.getId());
}

}
