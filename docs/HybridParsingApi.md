# HybridParsingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hybridParsingSingleVideoApiV1HybridVideoDataGet**](HybridParsingApi.md#hybridParsingSingleVideoApiV1HybridVideoDataGet) | **GET** /api/v1/hybrid/video_data | 混合解析单一视频接口/Hybrid parsing single video endpoint
[**hybridParsingSingleVideoApiV1HybridVideoDataGet_0**](HybridParsingApi.md#hybridParsingSingleVideoApiV1HybridVideoDataGet_0) | **GET** /api/v1/hybrid/video_data | 混合解析单一视频接口/Hybrid parsing single video endpoint
[**hybridParsingSingleVideoApiV1HybridVideoDataGet_1**](HybridParsingApi.md#hybridParsingSingleVideoApiV1HybridVideoDataGet_1) | **GET** /api/v1/hybrid/video_data | 混合解析单一视频接口/Hybrid parsing single video endpoint


<a name="hybridParsingSingleVideoApiV1HybridVideoDataGet"></a>
# **hybridParsingSingleVideoApiV1HybridVideoDataGet**
> ResponseModel hybridParsingSingleVideoApiV1HybridVideoDataGet(url, minimal, base64Url)

混合解析单一视频接口/Hybrid parsing single video endpoint

# [中文] ### 用途: - 该接口用于解析抖音/TikTok单一视频的数据。 ### 参数: - &#x60;url&#x60;: 视频链接、分享链接、分享文本。 ### 返回: - &#x60;data&#x60;: 视频数据。  # [English] ### Purpose: - This endpoint is used to parse data of a single Douyin/TikTok video. ### Parameters: - &#x60;url&#x60;: Video link, share link, or share text. ### Returns: - &#x60;data&#x60;: Video data.  # [Example] url &#x3D; \&quot;https://v.douyin.com/L4FJNR3/\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HybridParsingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    HybridParsingApi apiInstance = new HybridParsingApi(defaultClient);
    String url = https://v.douyin.com/L4FJNR3/; // String | 
    Boolean minimal = false; // Boolean | 是否返回最小数据/Whether to return minimal data
    Boolean base64Url = false; // Boolean | 是否Base64编码提交URL/Base64 encoding URL
    try {
      ResponseModel result = apiInstance.hybridParsingSingleVideoApiV1HybridVideoDataGet(url, minimal, base64Url);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HybridParsingApi#hybridParsingSingleVideoApiV1HybridVideoDataGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**|  |
 **minimal** | **Boolean**| 是否返回最小数据/Whether to return minimal data | [optional] [default to false]
 **base64Url** | **Boolean**| 是否Base64编码提交URL/Base64 encoding URL | [optional] [default to false]

### Return type

[**ResponseModel**](ResponseModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

<a name="hybridParsingSingleVideoApiV1HybridVideoDataGet_0"></a>
# **hybridParsingSingleVideoApiV1HybridVideoDataGet_0**
> ResponseModel hybridParsingSingleVideoApiV1HybridVideoDataGet_0(url, minimal, base64Url)

混合解析单一视频接口/Hybrid parsing single video endpoint

# [中文] ### 用途: - 该接口用于解析抖音/TikTok单一视频的数据。 ### 参数: - &#x60;url&#x60;: 视频链接、分享链接、分享文本。 ### 返回: - &#x60;data&#x60;: 视频数据。  # [English] ### Purpose: - This endpoint is used to parse data of a single Douyin/TikTok video. ### Parameters: - &#x60;url&#x60;: Video link, share link, or share text. ### Returns: - &#x60;data&#x60;: Video data.  # [Example] url &#x3D; \&quot;https://v.douyin.com/L4FJNR3/\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HybridParsingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    HybridParsingApi apiInstance = new HybridParsingApi(defaultClient);
    String url = https://v.douyin.com/L4FJNR3/; // String | 
    Boolean minimal = false; // Boolean | 是否返回最小数据/Whether to return minimal data
    Boolean base64Url = false; // Boolean | 是否Base64编码提交URL/Base64 encoding URL
    try {
      ResponseModel result = apiInstance.hybridParsingSingleVideoApiV1HybridVideoDataGet_0(url, minimal, base64Url);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HybridParsingApi#hybridParsingSingleVideoApiV1HybridVideoDataGet_0");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**|  |
 **minimal** | **Boolean**| 是否返回最小数据/Whether to return minimal data | [optional] [default to false]
 **base64Url** | **Boolean**| 是否Base64编码提交URL/Base64 encoding URL | [optional] [default to false]

### Return type

[**ResponseModel**](ResponseModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

<a name="hybridParsingSingleVideoApiV1HybridVideoDataGet_1"></a>
# **hybridParsingSingleVideoApiV1HybridVideoDataGet_1**
> ResponseModel hybridParsingSingleVideoApiV1HybridVideoDataGet_1(url, minimal, base64Url)

混合解析单一视频接口/Hybrid parsing single video endpoint

# [中文] ### 用途: - 该接口用于解析抖音/TikTok单一视频的数据。 ### 参数: - &#x60;url&#x60;: 视频链接、分享链接、分享文本。 ### 返回: - &#x60;data&#x60;: 视频数据。  # [English] ### Purpose: - This endpoint is used to parse data of a single Douyin/TikTok video. ### Parameters: - &#x60;url&#x60;: Video link, share link, or share text. ### Returns: - &#x60;data&#x60;: Video data.  # [Example] url &#x3D; \&quot;https://v.douyin.com/L4FJNR3/\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HybridParsingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    HybridParsingApi apiInstance = new HybridParsingApi(defaultClient);
    String url = https://v.douyin.com/L4FJNR3/; // String | 
    Boolean minimal = false; // Boolean | 是否返回最小数据/Whether to return minimal data
    Boolean base64Url = false; // Boolean | 是否Base64编码提交URL/Base64 encoding URL
    try {
      ResponseModel result = apiInstance.hybridParsingSingleVideoApiV1HybridVideoDataGet_1(url, minimal, base64Url);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HybridParsingApi#hybridParsingSingleVideoApiV1HybridVideoDataGet_1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**|  |
 **minimal** | **Boolean**| 是否返回最小数据/Whether to return minimal data | [optional] [default to false]
 **base64Url** | **Boolean**| 是否Base64编码提交URL/Base64 encoding URL | [optional] [default to false]

### Return type

[**ResponseModel**](ResponseModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

