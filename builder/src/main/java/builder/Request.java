package builder;

import java.util.Map;

public record Request(String url, String method, Object body, Map<String, String> headers) {}
