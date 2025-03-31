package data;

import builder.Request;
import java.util.HashMap;
import java.util.Map;

public class RequestBuilder {

  private final Map<String, String> headers = new HashMap<>();
  private String url = "";
  private String method = "";
  private Object body = null;

  public RequestBuilder addUrl(String url) {
    this.url = url;
    return this;
  }

  public RequestBuilder addMethod(String method) {
    this.method = method;
    return this;
  }

  public RequestBuilder addBody(Object body) {
    this.body = body;
    return this;
  }

  public RequestBuilder addHeader(String key, String value) {
    this.headers.put(key, value);
    return this;
  }

  public Request build() {
    return new Request(url, method, body, headers);
  }
}
