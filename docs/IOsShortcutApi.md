# IOsShortcutApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShortcutApiV1IosShortcutShortcutGet**](IOsShortcutApi.md#getShortcutApiV1IosShortcutShortcutGet) | **GET** /api/v1/ios_shortcut/shortcut | 用于iOS快捷指令的版本更新信息/Version update information for iOS shortcuts
[**getShortcutApiV1IosShortcutShortcutGet_0**](IOsShortcutApi.md#getShortcutApiV1IosShortcutShortcutGet_0) | **GET** /api/v1/ios_shortcut/shortcut | 用于iOS快捷指令的版本更新信息/Version update information for iOS shortcuts



## getShortcutApiV1IosShortcutShortcutGet

> IOsShortcut getShortcutApiV1IosShortcutShortcutGet()

用于iOS快捷指令的版本更新信息/Version update information for iOS shortcuts

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.IOsShortcutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        IOsShortcutApi apiInstance = new IOsShortcutApi(defaultClient);
        try {
            IOsShortcut result = apiInstance.getShortcutApiV1IosShortcutShortcutGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IOsShortcutApi#getShortcutApiV1IosShortcutShortcutGet");
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

[**IOsShortcut**](IOsShortcut.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getShortcutApiV1IosShortcutShortcutGet_0

> IOsShortcut getShortcutApiV1IosShortcutShortcutGet_0()

用于iOS快捷指令的版本更新信息/Version update information for iOS shortcuts

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.IOsShortcutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        IOsShortcutApi apiInstance = new IOsShortcutApi(defaultClient);
        try {
            IOsShortcut result = apiInstance.getShortcutApiV1IosShortcutShortcutGet_0();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IOsShortcutApi#getShortcutApiV1IosShortcutShortcutGet_0");
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

[**IOsShortcut**](IOsShortcut.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

