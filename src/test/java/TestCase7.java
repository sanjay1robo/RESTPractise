import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.HealthCheckResponseModel;

import static io.restassured.RestAssured.given;

public class TestCase7 {

    public static void main(String args[])
    {



        Response res = given()
            .auth().none().log().all()
            .header("Content-Type","application/json")
            .when()
            .get("http://localhost:3030/healthcheck")
            .then().extract().response();

        System.out.println(res.prettyPrint());

        System.out.println("===============================");

        HealthCheckResponseModel hm = given()
            .auth().none().log().all()
            .header("Content-Type","application/json")
        .when()
            .get("http://localhost:3030/healthcheck")
        .then().extract().response().getBody().as(HealthCheckResponseModel.class);

        System.out.println();


        System.out.println("Uptime : " + hm.getUptime() );
        System.out.println("Read only : " + hm.isReadOnly());
        System.out.println("Products : " + hm.getDoc().getProducts());
        System.out.println("Stores : " + hm.getDoc().getStores());
        System.out.println("Categories : " + hm.getDoc().getCategories());



    }

}

// request url : http://localhost:3030/healthcheck

// expected response body :

//{
//    "uptime": 5292.375,
//    "readonly": false,
//    "documents": {
//    "products": 51999,
//    "stores": 1561,
//    "categories": 4309
//    }
//    }

// errors encountered
// Please refer the Error history.txt file for more infomration on the error


