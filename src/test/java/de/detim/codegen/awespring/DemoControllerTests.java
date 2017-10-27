package de.detim.codegen.awespring;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class DemoControllerTests {

    @Value("${local.server.port}")
    int port;

    @BeforeClass
    public static void setup() {
        SpringBuddyApplication.generateByteCode();
    }

    @Before
    public void setupTest() {
        RestAssured.port = this.port;
    }

    @Test
    public void testDemoEndpoint() {
        // @formatter:off
        given()
        .when()
            .get("/demo")
        .then()
            .body(equalTo( "Hello SpringBuddies!"));
        // @formatter:on
    }

    @Test
    public void testOmedEndpoint() {
        // @formatter:off
        given()
        .when()
            .get("/omed")
        .then()
            .body(equalTo( "Hello SpringBuddies!"));
        // @formatter:on
    }

}
