# HealthCheckApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthCheckApiV1HealthCheckGet**](HealthCheckApi.md#healthCheckApiV1HealthCheckGet) | **GET** /api/v1/health/check | 检查服务器是否正确响应请求 / Check if the server responds to requests correctly
[**healthCheckApiV1HealthCheckGet_0**](HealthCheckApi.md#healthCheckApiV1HealthCheckGet_0) | **GET** /api/v1/health/check | 检查服务器是否正确响应请求 / Check if the server responds to requests correctly



## healthCheckApiV1HealthCheckGet

> HealthCheckResponse healthCheckApiV1HealthCheckGet()

检查服务器是否正确响应请求 / Check if the server responds to requests correctly

# [中文]  ### 用途说明:  - 检查服务器是否正确响应请求。  ### 参数说明:  - 无参数。  ### 返回结果:  - &#x60;status&#x60;: 服务器状态，正常为 &#x60;ok&#x60;。  # [English]  ### Purpose:  - Check if the server responds to requests correctly.  ### Parameter Description:  - No parameters.  ### Return Result:  - &#x60;status&#x60;: Server status, normal is &#x60;ok&#x60;.

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.HealthCheckApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        HealthCheckApi apiInstance = new HealthCheckApi(defaultClient);
        try {
            HealthCheckResponse result = apiInstance.healthCheckApiV1HealthCheckGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HealthCheckApi#healthCheckApiV1HealthCheckGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**HealthCheckResponse**](HealthCheckResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 服务器响应成功 / Server responds successfully |  -  |


## healthCheckApiV1HealthCheckGet_0

> HealthCheckResponse healthCheckApiV1HealthCheckGet_0()

检查服务器是否正确响应请求 / Check if the server responds to requests correctly

# [中文]  ### 用途说明:  - 检查服务器是否正确响应请求。  ### 参数说明:  - 无参数。  ### 返回结果:  - &#x60;status&#x60;: 服务器状态，正常为 &#x60;ok&#x60;。  # [English]  ### Purpose:  - Check if the server responds to requests correctly.  ### Parameter Description:  - No parameters.  ### Return Result:  - &#x60;status&#x60;: Server status, normal is &#x60;ok&#x60;.

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.HealthCheckApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        HealthCheckApi apiInstance = new HealthCheckApi(defaultClient);
        try {
            HealthCheckResponse result = apiInstance.healthCheckApiV1HealthCheckGet_0();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HealthCheckApi#healthCheckApiV1HealthCheckGet_0");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**HealthCheckResponse**](HealthCheckResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 服务器响应成功 / Server responds successfully |  -  |

