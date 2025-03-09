# ToutiaoWebApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getArticleInfoApiV1ToutiaoWebGetArticleInfoGet**](ToutiaoWebApiApi.md#getArticleInfoApiV1ToutiaoWebGetArticleInfoGet) | **GET** /api/v1/toutiao/web/get_article_info | 获取指定文章的信息/Get information of specified article
[**getArticleInfoApiV1ToutiaoWebGetArticleInfoGet_0**](ToutiaoWebApiApi.md#getArticleInfoApiV1ToutiaoWebGetArticleInfoGet_0) | **GET** /api/v1/toutiao/web/get_article_info | 获取指定文章的信息/Get information of specified article
[**getVideoInfoApiV1ToutiaoWebGetVideoInfoGet**](ToutiaoWebApiApi.md#getVideoInfoApiV1ToutiaoWebGetVideoInfoGet) | **GET** /api/v1/toutiao/web/get_video_info | 获取指定视频的信息/Get information of specified video
[**getVideoInfoApiV1ToutiaoWebGetVideoInfoGet_0**](ToutiaoWebApiApi.md#getVideoInfoApiV1ToutiaoWebGetVideoInfoGet_0) | **GET** /api/v1/toutiao/web/get_video_info | 获取指定视频的信息/Get information of specified video



## getArticleInfoApiV1ToutiaoWebGetArticleInfoGet

> ResponseModel getArticleInfoApiV1ToutiaoWebGetArticleInfoGet(awemeId)

获取指定文章的信息/Get information of specified article

# [中文] ### 用途: - 获取指定文章的信息 ### 参数: - aweme_id: 作品ID，可以从链接中获取     - 例如: https://www.toutiao.com/article/7450114952884503059/ ### 返回: - 作品信息  # [English] ### Purpose: - Get information of specified post ### Parameters: - item_id: Post ID, can be obtained from the link     - For example: https://www.toutiao.com/article/7450114952884503059/ ### Return: - Post information  # [示例/Example] aweme_id &#x3D; \&quot;7450114952884503059\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.ToutiaoWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ToutiaoWebApiApi apiInstance = new ToutiaoWebApiApi(defaultClient);
        String awemeId = 7450114952884503059; // String | 作品ID/Post ID
        try {
            ResponseModel result = apiInstance.getArticleInfoApiV1ToutiaoWebGetArticleInfoGet(awemeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToutiaoWebApiApi#getArticleInfoApiV1ToutiaoWebGetArticleInfoGet");
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
 **awemeId** | **String**| 作品ID/Post ID |

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
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getArticleInfoApiV1ToutiaoWebGetArticleInfoGet_0

> ResponseModel getArticleInfoApiV1ToutiaoWebGetArticleInfoGet_0(awemeId)

获取指定文章的信息/Get information of specified article

# [中文] ### 用途: - 获取指定文章的信息 ### 参数: - aweme_id: 作品ID，可以从链接中获取     - 例如: https://www.toutiao.com/article/7450114952884503059/ ### 返回: - 作品信息  # [English] ### Purpose: - Get information of specified post ### Parameters: - item_id: Post ID, can be obtained from the link     - For example: https://www.toutiao.com/article/7450114952884503059/ ### Return: - Post information  # [示例/Example] aweme_id &#x3D; \&quot;7450114952884503059\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.ToutiaoWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ToutiaoWebApiApi apiInstance = new ToutiaoWebApiApi(defaultClient);
        String awemeId = 7450114952884503059; // String | 作品ID/Post ID
        try {
            ResponseModel result = apiInstance.getArticleInfoApiV1ToutiaoWebGetArticleInfoGet_0(awemeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToutiaoWebApiApi#getArticleInfoApiV1ToutiaoWebGetArticleInfoGet_0");
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
 **awemeId** | **String**| 作品ID/Post ID |

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
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getVideoInfoApiV1ToutiaoWebGetVideoInfoGet

> ResponseModel getVideoInfoApiV1ToutiaoWebGetVideoInfoGet(awemeId)

获取指定视频的信息/Get information of specified video

# [中文] ### 用途: - 获取指定视频的信息 ### 参数: - aweme_id: 作品ID，可以从链接中获取     - 例如: https://www.toutiao.com/video/7431543350882206242/ ### 返回: - 作品信息  # [English] ### Purpose: - Get information of specified video ### Parameters: - item_id: Post ID, can be obtained from the link     - For example: https://www.toutiao.com/video/7431543350882206242/ ### Return: - Post information  # [示例/Example] aweme_id &#x3D; \&quot;7431543350882206242\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.ToutiaoWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ToutiaoWebApiApi apiInstance = new ToutiaoWebApiApi(defaultClient);
        String awemeId = 7431543350882206242; // String | 作品ID/Post ID
        try {
            ResponseModel result = apiInstance.getVideoInfoApiV1ToutiaoWebGetVideoInfoGet(awemeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToutiaoWebApiApi#getVideoInfoApiV1ToutiaoWebGetVideoInfoGet");
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
 **awemeId** | **String**| 作品ID/Post ID |

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
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getVideoInfoApiV1ToutiaoWebGetVideoInfoGet_0

> ResponseModel getVideoInfoApiV1ToutiaoWebGetVideoInfoGet_0(awemeId)

获取指定视频的信息/Get information of specified video

# [中文] ### 用途: - 获取指定视频的信息 ### 参数: - aweme_id: 作品ID，可以从链接中获取     - 例如: https://www.toutiao.com/video/7431543350882206242/ ### 返回: - 作品信息  # [English] ### Purpose: - Get information of specified video ### Parameters: - item_id: Post ID, can be obtained from the link     - For example: https://www.toutiao.com/video/7431543350882206242/ ### Return: - Post information  # [示例/Example] aweme_id &#x3D; \&quot;7431543350882206242\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.ToutiaoWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ToutiaoWebApiApi apiInstance = new ToutiaoWebApiApi(defaultClient);
        String awemeId = 7431543350882206242; // String | 作品ID/Post ID
        try {
            ResponseModel result = apiInstance.getVideoInfoApiV1ToutiaoWebGetVideoInfoGet_0(awemeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToutiaoWebApiApi#getVideoInfoApiV1ToutiaoWebGetVideoInfoGet_0");
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
 **awemeId** | **String**| 作品ID/Post ID |

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
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

