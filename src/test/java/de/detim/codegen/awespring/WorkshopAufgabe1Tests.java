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
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class WorkshopAufgabe1Tests {

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
    public void testRegions() {
        // @formatter:off
        given()
        .when()
            .get("/regions")
        .then()
            .body("_embedded.regions[0].regionName", is( "North America"))
            .body("_embedded.regions[1].regionName", is( "South America"))
            .body("_embedded.regions[2].regionName", is( "Europe"))
            .body("_embedded.regions[3].regionName", is( "Asia"))
            .body("_embedded.regions[4].regionName", is( "Australia"))
            .body("_embedded.regions[5].regionName", is( "Africa"));
        // @formatter:on
    }

    @Test
    public void testCountries() {
        // @formatter:off
        given()
        .when()
            .get("/countries")
        .then()
            .body("_embedded.countries[0].countryName", is( "Venezuela"))
            .body("_embedded.countries[1].countryName", is( "Brazil"))
            .body("_embedded.countries[2].countryName", is( "Poland"))
            .body("_embedded.countries[3].countryName", is( "United States"))
            .body("_embedded.countries[4].countryName", is( "Vietnam"))
            .body("_embedded.countries[5].countryName", is( "France"));
        // @formatter:on
    }

    @Test
    public void testLocations() {
        // @formatter:off
        given()
        .when()
            .get("/locations")
        .then()
            .body("_embedded.locations[0].city", is( "Asheville"))
            .body("_embedded.locations[1].city", is( "Brooklyn"))
            .body("_embedded.locations[2].city", is( "Charlotte"))
            .body("_embedded.locations[3].city", is( "Wilkes Barre"))
            .body("_embedded.locations[4].city", is( "Memphis"))
            .body("_embedded.locations[5].city", is( "Silver Spring"));
        // @formatter:on
    }
}
