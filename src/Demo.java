import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Demo {
  @Test
  public void get_page() {	  
	  when().
	  	get("http://www.cnn.com").
	  then().
	  	statusCode(200);
  }
  
  @Test
  public void post_credentials() {
	  given().
	  	param("credential", "M@dn3ss!").
	  	param("principal", "capnmayhem@yahoo.com").
	  when().
	    post("https://audience.cnn.com/core/api/1/user/login").
	  then().
	    statusCode(220);
  }
}
