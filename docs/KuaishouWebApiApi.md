# KuaishouWebApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet**](KuaishouWebApiApi.md#fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet) | **GET** /api/v1/kuaishou/web/fetch_one_video_by_url | 根据链接获取单个作品数据/Fetch single video by URL
[**fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet_0**](KuaishouWebApiApi.md#fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet_0) | **GET** /api/v1/kuaishou/web/fetch_one_video_by_url | 根据链接获取单个作品数据/Fetch single video by URL
[**fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get**](KuaishouWebApiApi.md#fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get) | **GET** /api/v1/kuaishou/web/fetch_one_video_v2 | 快手单一视频查询接口V2/Kuaishou single video query API V2
[**fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get_0**](KuaishouWebApiApi.md#fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get_0) | **GET** /api/v1/kuaishou/web/fetch_one_video_v2 | 快手单一视频查询接口V2/Kuaishou single video query API V2



## fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet

> ResponseModel fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet(url)

根据链接获取单个作品数据/Fetch single video by URL

# [中文] ### 用途: - 根据链接获取单个作品数据 ### 参数: - url: 作品链接 ### 返回: - 视频数据  # [English] ### Purpose: - Fetch single video by URL ### Parameters: - url: Photo URL ### Returns: - Video data  # [示例/Example] url &#x3D; \&quot;https://v.kuaishou.com/GKTpYm\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.KuaishouWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        KuaishouWebApiApi apiInstance = new KuaishouWebApiApi(defaultClient);
        String url = https://v.kuaishou.com/GKTpYm; // String | 
        try {
            ResponseModel result = apiInstance.fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet(url);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KuaishouWebApiApi#fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet");
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


## fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet_0

> ResponseModel fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet_0(url)

根据链接获取单个作品数据/Fetch single video by URL

# [中文] ### 用途: - 根据链接获取单个作品数据 ### 参数: - url: 作品链接 ### 返回: - 视频数据  # [English] ### Purpose: - Fetch single video by URL ### Parameters: - url: Photo URL ### Returns: - Video data  # [示例/Example] url &#x3D; \&quot;https://v.kuaishou.com/GKTpYm\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.KuaishouWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        KuaishouWebApiApi apiInstance = new KuaishouWebApiApi(defaultClient);
        String url = https://v.kuaishou.com/GKTpYm; // String | 
        try {
            ResponseModel result = apiInstance.fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet_0(url);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KuaishouWebApiApi#fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet_0");
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


## fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get

> ResponseModel fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get(photoId)

快手单一视频查询接口V2/Kuaishou single video query API V2

# [中文] ### 用途: - 快手单一视频查询接口V2 ### 参数: - photo_id: 作品ID，作品ID可以从作品链接中提取 ### 返回: - 视频数据  # [English] ### Purpose: - Kuaishou single video query API V2 ### Parameters: - photo_id: Photo ID, the photo ID can be extracted from the photo link ### Returns: - Video data  # [示例/Example] photo_id &#x3D; \&quot;3xtdqvdnqd3psuc\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.KuaishouWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        KuaishouWebApiApi apiInstance = new KuaishouWebApiApi(defaultClient);
        String photoId = 3xtdqvdnqd3psuc; // String | 
        try {
            ResponseModel result = apiInstance.fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get(photoId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KuaishouWebApiApi#fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get");
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
 **photoId** | **String**|  |

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


## fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get_0

> ResponseModel fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get_0(photoId)

快手单一视频查询接口V2/Kuaishou single video query API V2

# [中文] ### 用途: - 快手单一视频查询接口V2 ### 参数: - photo_id: 作品ID，作品ID可以从作品链接中提取 ### 返回: - 视频数据  # [English] ### Purpose: - Kuaishou single video query API V2 ### Parameters: - photo_id: Photo ID, the photo ID can be extracted from the photo link ### Returns: - Video data  # [示例/Example] photo_id &#x3D; \&quot;3xtdqvdnqd3psuc\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.KuaishouWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        KuaishouWebApiApi apiInstance = new KuaishouWebApiApi(defaultClient);
        String photoId = 3xtdqvdnqd3psuc; // String | 
        try {
            ResponseModel result = apiInstance.fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get_0(photoId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KuaishouWebApiApi#fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get_0");
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
 **photoId** | **String**|  |

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

