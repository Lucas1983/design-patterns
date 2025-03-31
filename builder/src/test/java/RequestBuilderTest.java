import builder.Request;
import data.RequestBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RequestBuilderTest {

  @Test
  void testRequestBuilder() {
    // Create a RequestBuilder instance
    RequestBuilder requestBuilder = new RequestBuilder();

    // Build a request with URL, method, body, and headers
    Request request =
        requestBuilder
            .addUrl("http://example.com")
            .addMethod("GET")
            .addBody(null)
            .addHeader("Authorization", "Bearer token")
            .build();

    // Validate the request properties
    assertEquals("http://example.com", request.url());
    assertEquals("GET", request.method());
    assertNull(request.body());
    assertEquals("Bearer token", request.headers().get("Authorization"));
  }
}
