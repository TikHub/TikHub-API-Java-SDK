# KuaishouWebApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchHomePageInfoApiV1KuaishouWebFetchHomePageInfoGet**](KuaishouWebApiApi.md#fetchHomePageInfoApiV1KuaishouWebFetchHomePageInfoGet) | **GET** /api/v1/kuaishou/web/fetch_home_page_info | 获取主页信息数据/Get home page info data
[**fetchHomePageInfoApiV1KuaishouWebFetchHomePageInfoGet_0**](KuaishouWebApiApi.md#fetchHomePageInfoApiV1KuaishouWebFetchHomePageInfoGet_0) | **GET** /api/v1/kuaishou/web/fetch_home_page_info | 获取主页信息数据/Get home page info data
[**fetchHomePageVideoApiV1KuaishouWebFetchHomePageVideoGet**](KuaishouWebApiApi.md#fetchHomePageVideoApiV1KuaishouWebFetchHomePageVideoGet) | **GET** /api/v1/kuaishou/web/fetch_home_page_video | 获取主页视频数据/Get home page video data
[**fetchHomePageVideoApiV1KuaishouWebFetchHomePageVideoGet_0**](KuaishouWebApiApi.md#fetchHomePageVideoApiV1KuaishouWebFetchHomePageVideoGet_0) | **GET** /api/v1/kuaishou/web/fetch_home_page_video | 获取主页视频数据/Get home page video data
[**fetchOneVideoApiV1KuaishouWebFetchOneVideoGet**](KuaishouWebApiApi.md#fetchOneVideoApiV1KuaishouWebFetchOneVideoGet) | **GET** /api/v1/kuaishou/web/fetch_one_video | 获取单个作品数据/Get single video data
[**fetchOneVideoApiV1KuaishouWebFetchOneVideoGet_0**](KuaishouWebApiApi.md#fetchOneVideoApiV1KuaishouWebFetchOneVideoGet_0) | **GET** /api/v1/kuaishou/web/fetch_one_video | 获取单个作品数据/Get single video data
[**fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet**](KuaishouWebApiApi.md#fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet) | **GET** /api/v1/kuaishou/web/fetch_one_video_by_url | 根据链接获取单个作品数据/Fetch single video by URL
[**fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet_0**](KuaishouWebApiApi.md#fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet_0) | **GET** /api/v1/kuaishou/web/fetch_one_video_by_url | 根据链接获取单个作品数据/Fetch single video by URL
[**fetchOneVideoByUrlV2ApiV1KuaishouWebFetchOneVideoByUrlV2Get**](KuaishouWebApiApi.md#fetchOneVideoByUrlV2ApiV1KuaishouWebFetchOneVideoByUrlV2Get) | **GET** /api/v1/kuaishou/web/fetch_one_video_by_url_v2 | 根据链接获取单个作品数据V2/Fetch single video by URL V2
[**fetchOneVideoByUrlV2ApiV1KuaishouWebFetchOneVideoByUrlV2Get_0**](KuaishouWebApiApi.md#fetchOneVideoByUrlV2ApiV1KuaishouWebFetchOneVideoByUrlV2Get_0) | **GET** /api/v1/kuaishou/web/fetch_one_video_by_url_v2 | 根据链接获取单个作品数据V2/Fetch single video by URL V2
[**fetchOneVideoCommentApiV1KuaishouWebFetchOneVideoCommentGet**](KuaishouWebApiApi.md#fetchOneVideoCommentApiV1KuaishouWebFetchOneVideoCommentGet) | **GET** /api/v1/kuaishou/web/fetch_one_video_comment | 获取单个作品评论数据/Get single video comment data
[**fetchOneVideoCommentApiV1KuaishouWebFetchOneVideoCommentGet_0**](KuaishouWebApiApi.md#fetchOneVideoCommentApiV1KuaishouWebFetchOneVideoCommentGet_0) | **GET** /api/v1/kuaishou/web/fetch_one_video_comment | 获取单个作品评论数据/Get single video comment data
[**fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get**](KuaishouWebApiApi.md#fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get) | **GET** /api/v1/kuaishou/web/fetch_one_video_v2 | 快手单一视频查询接口V2/Kuaishou single video query API V2
[**fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get_0**](KuaishouWebApiApi.md#fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get_0) | **GET** /api/v1/kuaishou/web/fetch_one_video_v2 | 快手单一视频查询接口V2/Kuaishou single video query API V2


<a name="fetchHomePageInfoApiV1KuaishouWebFetchHomePageInfoGet"></a>
# **fetchHomePageInfoApiV1KuaishouWebFetchHomePageInfoGet**
> ResponseModel fetchHomePageInfoApiV1KuaishouWebFetchHomePageInfoGet(userId)

获取主页信息数据/Get home page info data

# [中文] ### 用途: - 获取主页信息数据 ### 参数: - user_id: 用户ID ### 返回: - 主页信息数据  # [English] ### Purpose: - Fetch home page info data ### Parameters: - user_id: User ID ### Returns: - Home page info data  # [示例/Example] user_id &#x3D; \&quot;3xduik3j7us2ge6\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KuaishouWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    KuaishouWebApiApi apiInstance = new KuaishouWebApiApi(defaultClient);
    String userId = 3xduik3j7us2ge6; // String | 
    try {
      ResponseModel result = apiInstance.fetchHomePageInfoApiV1KuaishouWebFetchHomePageInfoGet(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KuaishouWebApiApi#fetchHomePageInfoApiV1KuaishouWebFetchHomePageInfoGet");
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
 **userId** | **String**|  |

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

<a name="fetchHomePageInfoApiV1KuaishouWebFetchHomePageInfoGet_0"></a>
# **fetchHomePageInfoApiV1KuaishouWebFetchHomePageInfoGet_0**
> ResponseModel fetchHomePageInfoApiV1KuaishouWebFetchHomePageInfoGet_0(userId)

获取主页信息数据/Get home page info data

# [中文] ### 用途: - 获取主页信息数据 ### 参数: - user_id: 用户ID ### 返回: - 主页信息数据  # [English] ### Purpose: - Fetch home page info data ### Parameters: - user_id: User ID ### Returns: - Home page info data  # [示例/Example] user_id &#x3D; \&quot;3xduik3j7us2ge6\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KuaishouWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    KuaishouWebApiApi apiInstance = new KuaishouWebApiApi(defaultClient);
    String userId = 3xduik3j7us2ge6; // String | 
    try {
      ResponseModel result = apiInstance.fetchHomePageInfoApiV1KuaishouWebFetchHomePageInfoGet_0(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KuaishouWebApiApi#fetchHomePageInfoApiV1KuaishouWebFetchHomePageInfoGet_0");
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
 **userId** | **String**|  |

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

<a name="fetchHomePageVideoApiV1KuaishouWebFetchHomePageVideoGet"></a>
# **fetchHomePageVideoApiV1KuaishouWebFetchHomePageVideoGet**
> ResponseModel fetchHomePageVideoApiV1KuaishouWebFetchHomePageVideoGet(userId, pcursor)

获取主页视频数据/Get home page video data

# [中文] ### 用途: - 获取主页视频数据 ### 参数: - user_id: 用户ID - pcursor: 视频游标，第一次请求为空，后续请求使用返回响应中的pcursor值进行翻页。 ### 返回: - 视频数据  # [English] ### Purpose: - Fetch home page video data ### Parameters: - user_id: User ID - pcursor: Video cursor, empty for the first request, and use the pcursor value in the returned response for subsequent requests. ### Returns: - Videos data  # [示例/Example] user_id &#x3D; \&quot;3xduik3j7us2ge6\&quot; pcursor &#x3D; &#39;1.718349959396E12&#39;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KuaishouWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    KuaishouWebApiApi apiInstance = new KuaishouWebApiApi(defaultClient);
    String userId = 3xduik3j7us2ge6; // String | 
    String pcursor = "pcursor_example"; // String | 
    try {
      ResponseModel result = apiInstance.fetchHomePageVideoApiV1KuaishouWebFetchHomePageVideoGet(userId, pcursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KuaishouWebApiApi#fetchHomePageVideoApiV1KuaishouWebFetchHomePageVideoGet");
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
 **userId** | **String**|  |
 **pcursor** | **String**|  | [optional]

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

<a name="fetchHomePageVideoApiV1KuaishouWebFetchHomePageVideoGet_0"></a>
# **fetchHomePageVideoApiV1KuaishouWebFetchHomePageVideoGet_0**
> ResponseModel fetchHomePageVideoApiV1KuaishouWebFetchHomePageVideoGet_0(userId, pcursor)

获取主页视频数据/Get home page video data

# [中文] ### 用途: - 获取主页视频数据 ### 参数: - user_id: 用户ID - pcursor: 视频游标，第一次请求为空，后续请求使用返回响应中的pcursor值进行翻页。 ### 返回: - 视频数据  # [English] ### Purpose: - Fetch home page video data ### Parameters: - user_id: User ID - pcursor: Video cursor, empty for the first request, and use the pcursor value in the returned response for subsequent requests. ### Returns: - Videos data  # [示例/Example] user_id &#x3D; \&quot;3xduik3j7us2ge6\&quot; pcursor &#x3D; &#39;1.718349959396E12&#39;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KuaishouWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    KuaishouWebApiApi apiInstance = new KuaishouWebApiApi(defaultClient);
    String userId = 3xduik3j7us2ge6; // String | 
    String pcursor = "pcursor_example"; // String | 
    try {
      ResponseModel result = apiInstance.fetchHomePageVideoApiV1KuaishouWebFetchHomePageVideoGet_0(userId, pcursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KuaishouWebApiApi#fetchHomePageVideoApiV1KuaishouWebFetchHomePageVideoGet_0");
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
 **userId** | **String**|  |
 **pcursor** | **String**|  | [optional]

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

<a name="fetchOneVideoApiV1KuaishouWebFetchOneVideoGet"></a>
# **fetchOneVideoApiV1KuaishouWebFetchOneVideoGet**
> ResponseModel fetchOneVideoApiV1KuaishouWebFetchOneVideoGet(photoId)

获取单个作品数据/Get single video data

# [中文] ### 用途: - 获取单个作品数据，此接口不支持图文作品。 ### 参数: - photo_id: 作品ID ### 返回: - 视频数据  # [English] ### Purpose: - Fetch single video data, this interface does not support photo only posts. ### Parameters: - photo_id: Photo ID ### Returns: - Video data  # [示例/Example] photo_id &#x3D; \&quot;3x7gxp2zhgjv832\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KuaishouWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    KuaishouWebApiApi apiInstance = new KuaishouWebApiApi(defaultClient);
    String photoId = 3x7gxp2zhgjv832; // String | 
    try {
      ResponseModel result = apiInstance.fetchOneVideoApiV1KuaishouWebFetchOneVideoGet(photoId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KuaishouWebApiApi#fetchOneVideoApiV1KuaishouWebFetchOneVideoGet");
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
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

<a name="fetchOneVideoApiV1KuaishouWebFetchOneVideoGet_0"></a>
# **fetchOneVideoApiV1KuaishouWebFetchOneVideoGet_0**
> ResponseModel fetchOneVideoApiV1KuaishouWebFetchOneVideoGet_0(photoId)

获取单个作品数据/Get single video data

# [中文] ### 用途: - 获取单个作品数据，此接口不支持图文作品。 ### 参数: - photo_id: 作品ID ### 返回: - 视频数据  # [English] ### Purpose: - Fetch single video data, this interface does not support photo only posts. ### Parameters: - photo_id: Photo ID ### Returns: - Video data  # [示例/Example] photo_id &#x3D; \&quot;3x7gxp2zhgjv832\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KuaishouWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    KuaishouWebApiApi apiInstance = new KuaishouWebApiApi(defaultClient);
    String photoId = 3x7gxp2zhgjv832; // String | 
    try {
      ResponseModel result = apiInstance.fetchOneVideoApiV1KuaishouWebFetchOneVideoGet_0(photoId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KuaishouWebApiApi#fetchOneVideoApiV1KuaishouWebFetchOneVideoGet_0");
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
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

<a name="fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet"></a>
# **fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet**
> ResponseModel fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet(url)

根据链接获取单个作品数据/Fetch single video by URL

# [中文] ### 用途: - 根据链接获取单个作品数据 ### 参数: - url: 作品链接 ### 返回: - 视频数据  # [English] ### Purpose: - Fetch single video by URL ### Parameters: - url: Photo URL ### Returns: - Video data  # [示例/Example] url &#x3D; \&quot;https://v.kuaishou.com/GKTpYm\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KuaishouWebApiApi;

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
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

<a name="fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet_0"></a>
# **fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet_0**
> ResponseModel fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet_0(url)

根据链接获取单个作品数据/Fetch single video by URL

# [中文] ### 用途: - 根据链接获取单个作品数据 ### 参数: - url: 作品链接 ### 返回: - 视频数据  # [English] ### Purpose: - Fetch single video by URL ### Parameters: - url: Photo URL ### Returns: - Video data  # [示例/Example] url &#x3D; \&quot;https://v.kuaishou.com/GKTpYm\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KuaishouWebApiApi;

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
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

<a name="fetchOneVideoByUrlV2ApiV1KuaishouWebFetchOneVideoByUrlV2Get"></a>
# **fetchOneVideoByUrlV2ApiV1KuaishouWebFetchOneVideoByUrlV2Get**
> ResponseModel fetchOneVideoByUrlV2ApiV1KuaishouWebFetchOneVideoByUrlV2Get(url)

根据链接获取单个作品数据V2/Fetch single video by URL V2

# [中文] ### 用途: - 根据链接获取单个作品数据V2 ### 参数: - url: 作品链接 ### 返回: - 视频数据  # [English] ### Purpose: - Fetch single video by URL V2 ### Parameters: - url: Photo URL ### Returns: - Video data  # [示例/Example] url &#x3D; \&quot;https://v.kuaishou.com/GKTpYm\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KuaishouWebApiApi;

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
      ResponseModel result = apiInstance.fetchOneVideoByUrlV2ApiV1KuaishouWebFetchOneVideoByUrlV2Get(url);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KuaishouWebApiApi#fetchOneVideoByUrlV2ApiV1KuaishouWebFetchOneVideoByUrlV2Get");
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
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

<a name="fetchOneVideoByUrlV2ApiV1KuaishouWebFetchOneVideoByUrlV2Get_0"></a>
# **fetchOneVideoByUrlV2ApiV1KuaishouWebFetchOneVideoByUrlV2Get_0**
> ResponseModel fetchOneVideoByUrlV2ApiV1KuaishouWebFetchOneVideoByUrlV2Get_0(url)

根据链接获取单个作品数据V2/Fetch single video by URL V2

# [中文] ### 用途: - 根据链接获取单个作品数据V2 ### 参数: - url: 作品链接 ### 返回: - 视频数据  # [English] ### Purpose: - Fetch single video by URL V2 ### Parameters: - url: Photo URL ### Returns: - Video data  # [示例/Example] url &#x3D; \&quot;https://v.kuaishou.com/GKTpYm\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KuaishouWebApiApi;

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
      ResponseModel result = apiInstance.fetchOneVideoByUrlV2ApiV1KuaishouWebFetchOneVideoByUrlV2Get_0(url);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KuaishouWebApiApi#fetchOneVideoByUrlV2ApiV1KuaishouWebFetchOneVideoByUrlV2Get_0");
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
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

<a name="fetchOneVideoCommentApiV1KuaishouWebFetchOneVideoCommentGet"></a>
# **fetchOneVideoCommentApiV1KuaishouWebFetchOneVideoCommentGet**
> ResponseModel fetchOneVideoCommentApiV1KuaishouWebFetchOneVideoCommentGet(photoId, pcursor)

获取单个作品评论数据/Get single video comment data

# [中文] ### 用途: - 获取单个作品评论数据 ### 参数: - photo_id: 作品ID - pcursor: 评论游标，第一次请求为空，后续请求使用返回响应中的pcursor值进行翻页。 ### 返回: - 评论数据  # [English] ### Purpose: - Fetch single video comment data ### Parameters: - photo_id: Photo ID - pcursor: Comment cursor, empty for the first request, and use the pcursor value in the returned response for subsequent requests. ### Returns: - Comments data  # [示例/Example] photo_id &#x3D; \&quot;3x7gxp2zhgjv832\&quot; pcursor &#x3D; None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KuaishouWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    KuaishouWebApiApi apiInstance = new KuaishouWebApiApi(defaultClient);
    String photoId = 3x7gxp2zhgjv832; // String | 
    String pcursor = "pcursor_example"; // String | 
    try {
      ResponseModel result = apiInstance.fetchOneVideoCommentApiV1KuaishouWebFetchOneVideoCommentGet(photoId, pcursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KuaishouWebApiApi#fetchOneVideoCommentApiV1KuaishouWebFetchOneVideoCommentGet");
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
 **pcursor** | **String**|  | [optional]

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

<a name="fetchOneVideoCommentApiV1KuaishouWebFetchOneVideoCommentGet_0"></a>
# **fetchOneVideoCommentApiV1KuaishouWebFetchOneVideoCommentGet_0**
> ResponseModel fetchOneVideoCommentApiV1KuaishouWebFetchOneVideoCommentGet_0(photoId, pcursor)

获取单个作品评论数据/Get single video comment data

# [中文] ### 用途: - 获取单个作品评论数据 ### 参数: - photo_id: 作品ID - pcursor: 评论游标，第一次请求为空，后续请求使用返回响应中的pcursor值进行翻页。 ### 返回: - 评论数据  # [English] ### Purpose: - Fetch single video comment data ### Parameters: - photo_id: Photo ID - pcursor: Comment cursor, empty for the first request, and use the pcursor value in the returned response for subsequent requests. ### Returns: - Comments data  # [示例/Example] photo_id &#x3D; \&quot;3x7gxp2zhgjv832\&quot; pcursor &#x3D; None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KuaishouWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    KuaishouWebApiApi apiInstance = new KuaishouWebApiApi(defaultClient);
    String photoId = 3x7gxp2zhgjv832; // String | 
    String pcursor = "pcursor_example"; // String | 
    try {
      ResponseModel result = apiInstance.fetchOneVideoCommentApiV1KuaishouWebFetchOneVideoCommentGet_0(photoId, pcursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KuaishouWebApiApi#fetchOneVideoCommentApiV1KuaishouWebFetchOneVideoCommentGet_0");
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
 **pcursor** | **String**|  | [optional]

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

<a name="fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get"></a>
# **fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get**
> ResponseModel fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get(photoId, isLongVideo)

快手单一视频查询接口V2/Kuaishou single video query API V2

# [中文] ### 用途: - 快手单一视频查询接口V2，此接口支持图文作品。 ### 参数: - photo_id: 作品ID - isLongVideo: 是否长视频，默认为False ### 返回: - 视频数据  # [English] ### Purpose: - Kuaishou single video query API V2, this interface supports photo only posts. ### Parameters: - photo_id: Photo ID - isLongVideo: Is long video, default is False ### Returns: - Video data  # [示例/Example] photo_id &#x3D; \&quot;3xhuvvbqwqviwy6\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KuaishouWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    KuaishouWebApiApi apiInstance = new KuaishouWebApiApi(defaultClient);
    String photoId = 3xhuvvbqwqviwy6; // String | 
    Boolean isLongVideo = false; // Boolean | 
    try {
      ResponseModel result = apiInstance.fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get(photoId, isLongVideo);
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
 **isLongVideo** | **Boolean**|  | [optional] [default to false]

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

<a name="fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get_0"></a>
# **fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get_0**
> ResponseModel fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get_0(photoId, isLongVideo)

快手单一视频查询接口V2/Kuaishou single video query API V2

# [中文] ### 用途: - 快手单一视频查询接口V2，此接口支持图文作品。 ### 参数: - photo_id: 作品ID - isLongVideo: 是否长视频，默认为False ### 返回: - 视频数据  # [English] ### Purpose: - Kuaishou single video query API V2, this interface supports photo only posts. ### Parameters: - photo_id: Photo ID - isLongVideo: Is long video, default is False ### Returns: - Video data  # [示例/Example] photo_id &#x3D; \&quot;3xhuvvbqwqviwy6\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KuaishouWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    KuaishouWebApiApi apiInstance = new KuaishouWebApiApi(defaultClient);
    String photoId = 3xhuvvbqwqviwy6; // String | 
    Boolean isLongVideo = false; // Boolean | 
    try {
      ResponseModel result = apiInstance.fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get_0(photoId, isLongVideo);
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
 **isLongVideo** | **Boolean**|  | [optional] [default to false]

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

