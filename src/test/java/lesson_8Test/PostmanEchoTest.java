package lesson_8Test;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostmanEchoTest {
    @Test
    public void whenGetRequest_thenStatusCode200() {
        given()
                .baseUri("https://postman-echo.com")
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when().
                get("/get")
                .then().
                statusCode(200).and()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void whenPostRawTextRequest_thenStatusCode200() {
        String requestBody = "This is expected to be sent back as part of response body.";
        given().baseUri("https://postman-echo.com")
                .body(requestBody)
                .when().
                post("/post")
                .then().
                statusCode(200).and()
                .body("data", equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    public void whenPostFormDataRequest_thenStatusCode200() {
        String jsonString = """
                    {
                        "foo1": "bar1",
                        "foo2": "bar2"
                    }
                """;
        given().baseUri("https://postman-echo.com")
                .contentType("application/json")
                .body(jsonString)
                .when().
                post("/post")
                .then()
                .statusCode(200).and()
                .body("json.foo1", equalTo("bar1"))
                .body("json.foo2", equalTo("bar2"));
    }

    @Test
    public void whenPutRequest_thenStatusCode200() {
        String text = "This is expected to be sent back as part of response body";
        given().baseUri("https://postman-echo.com")
                .body(text)
                .when().put("/put")
                .then().statusCode(200).and()
                .body("data", equalTo(text));
    }

    @Test
    public void whenPatchRequest_thenStatusCode200() {
        String text = "This is expected to be sent back as part of response body";
        given().baseUri("https://postman-echo.com")
                .body(text)
                .when().patch("/patch")
                .then().statusCode(200).and()
                .body("data", equalTo(text));
    }

    @Test
    public void whenDeleteRequest_thenStatusCode200() {
        String text = "This is expected to be sent back as part of response body";
        given().baseUri("https://postman-echo.com")
                .body(text)
                .when().delete("/delete")
                .then().statusCode(200).and()
                .body("data", equalTo(text));
    }
}