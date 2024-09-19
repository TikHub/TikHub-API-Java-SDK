# WeiboWebApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchPostDetailApiV1WeiboWebFetchPostDetailGet**](WeiboWebApiApi.md#fetchPostDetailApiV1WeiboWebFetchPostDetailGet) | **GET** /api/v1/weibo/web/fetch_post_detail | 获取单个作品数据/Get single video data
[**fetchPostDetailApiV1WeiboWebFetchPostDetailGet_0**](WeiboWebApiApi.md#fetchPostDetailApiV1WeiboWebFetchPostDetailGet_0) | **GET** /api/v1/weibo/web/fetch_post_detail | 获取单个作品数据/Get single video data
[**fetchUserInfoApiV1WeiboWebFetchUserInfoGet**](WeiboWebApiApi.md#fetchUserInfoApiV1WeiboWebFetchUserInfoGet) | **GET** /api/v1/weibo/web/fetch_user_info | 获取用户信息/Get user information
[**fetchUserInfoApiV1WeiboWebFetchUserInfoGet_0**](WeiboWebApiApi.md#fetchUserInfoApiV1WeiboWebFetchUserInfoGet_0) | **GET** /api/v1/weibo/web/fetch_user_info | 获取用户信息/Get user information
[**fetchUserPostsApiV1WeiboWebFetchUserPostsGet**](WeiboWebApiApi.md#fetchUserPostsApiV1WeiboWebFetchUserPostsGet) | **GET** /api/v1/weibo/web/fetch_user_posts | 获取微博用户文章数据/Get Weibo user article data
[**fetchUserPostsApiV1WeiboWebFetchUserPostsGet_0**](WeiboWebApiApi.md#fetchUserPostsApiV1WeiboWebFetchUserPostsGet_0) | **GET** /api/v1/weibo/web/fetch_user_posts | 获取微博用户文章数据/Get Weibo user article data


<a name="fetchPostDetailApiV1WeiboWebFetchPostDetailGet"></a>
# **fetchPostDetailApiV1WeiboWebFetchPostDetailGet**
> ResponseModel fetchPostDetailApiV1WeiboWebFetchPostDetailGet(id)

获取单个作品数据/Get single video data

# [中文] ### 用途: - 获取单个作品数据 ### 参数: - id: 作品id ### 返回: - 作品数据  # [English] ### Purpose: - Get single video data ### Parameters: - id: Post id ### Return: - Post data  # [示例/Example] itemId &#x3D; \&quot;5008127060086127\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WeiboWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    WeiboWebApiApi apiInstance = new WeiboWebApiApi(defaultClient);
    String id = 5008127060086127; // String | 作品id/Post id
    try {
      ResponseModel result = apiInstance.fetchPostDetailApiV1WeiboWebFetchPostDetailGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WeiboWebApiApi#fetchPostDetailApiV1WeiboWebFetchPostDetailGet");
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
 **id** | **String**| 作品id/Post id |

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

<a name="fetchPostDetailApiV1WeiboWebFetchPostDetailGet_0"></a>
# **fetchPostDetailApiV1WeiboWebFetchPostDetailGet_0**
> ResponseModel fetchPostDetailApiV1WeiboWebFetchPostDetailGet_0(id)

获取单个作品数据/Get single video data

# [中文] ### 用途: - 获取单个作品数据 ### 参数: - id: 作品id ### 返回: - 作品数据  # [English] ### Purpose: - Get single video data ### Parameters: - id: Post id ### Return: - Post data  # [示例/Example] itemId &#x3D; \&quot;5008127060086127\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WeiboWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    WeiboWebApiApi apiInstance = new WeiboWebApiApi(defaultClient);
    String id = 5008127060086127; // String | 作品id/Post id
    try {
      ResponseModel result = apiInstance.fetchPostDetailApiV1WeiboWebFetchPostDetailGet_0(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WeiboWebApiApi#fetchPostDetailApiV1WeiboWebFetchPostDetailGet_0");
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
 **id** | **String**| 作品id/Post id |

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

<a name="fetchUserInfoApiV1WeiboWebFetchUserInfoGet"></a>
# **fetchUserInfoApiV1WeiboWebFetchUserInfoGet**
> ResponseModel fetchUserInfoApiV1WeiboWebFetchUserInfoGet(uid)

获取用户信息/Get user information

# [中文] ### 用途: - 获取用户信息 ### 参数: - uid: 用户id ### 返回: - 用户信息  # [English] ### Purpose: - Get user information ### Parameters: - uid: User id ### Return: - User information  # [示例/Example] uid &#x3D; \&quot;7277477906\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WeiboWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    WeiboWebApiApi apiInstance = new WeiboWebApiApi(defaultClient);
    String uid = 7277477906; // String | 用户id/User id
    try {
      ResponseModel result = apiInstance.fetchUserInfoApiV1WeiboWebFetchUserInfoGet(uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WeiboWebApiApi#fetchUserInfoApiV1WeiboWebFetchUserInfoGet");
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
 **uid** | **String**| 用户id/User id |

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

<a name="fetchUserInfoApiV1WeiboWebFetchUserInfoGet_0"></a>
# **fetchUserInfoApiV1WeiboWebFetchUserInfoGet_0**
> ResponseModel fetchUserInfoApiV1WeiboWebFetchUserInfoGet_0(uid)

获取用户信息/Get user information

# [中文] ### 用途: - 获取用户信息 ### 参数: - uid: 用户id ### 返回: - 用户信息  # [English] ### Purpose: - Get user information ### Parameters: - uid: User id ### Return: - User information  # [示例/Example] uid &#x3D; \&quot;7277477906\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WeiboWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    WeiboWebApiApi apiInstance = new WeiboWebApiApi(defaultClient);
    String uid = 7277477906; // String | 用户id/User id
    try {
      ResponseModel result = apiInstance.fetchUserInfoApiV1WeiboWebFetchUserInfoGet_0(uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WeiboWebApiApi#fetchUserInfoApiV1WeiboWebFetchUserInfoGet_0");
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
 **uid** | **String**| 用户id/User id |

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

<a name="fetchUserPostsApiV1WeiboWebFetchUserPostsGet"></a>
# **fetchUserPostsApiV1WeiboWebFetchUserPostsGet**
> ResponseModel fetchUserPostsApiV1WeiboWebFetchUserPostsGet(uid, page, feature)

获取微博用户文章数据/Get Weibo user article data

# [中文] ### 用途: - 获取微博用户文章数据 ### 参数: - uid: 用户id - page: 页数 - feature: 特征 ### 返回: - 用户文章数据  # [English] ### Purpose: - Get Weibo user article data ### Parameters: - uid: User id - page: Page number - feature: Feature ### Return: - User article data  # [示例/Example] uid &#x3D; \&quot;7277477906\&quot; page &#x3D; 1 feature &#x3D; 0

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WeiboWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    WeiboWebApiApi apiInstance = new WeiboWebApiApi(defaultClient);
    String uid = 7277477906; // String | 用户id/User id
    Integer page = 1; // Integer | 页数/Page number
    Integer feature = 0; // Integer | 特征/Feature
    try {
      ResponseModel result = apiInstance.fetchUserPostsApiV1WeiboWebFetchUserPostsGet(uid, page, feature);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WeiboWebApiApi#fetchUserPostsApiV1WeiboWebFetchUserPostsGet");
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
 **uid** | **String**| 用户id/User id |
 **page** | **Integer**| 页数/Page number | [optional] [default to 1]
 **feature** | **Integer**| 特征/Feature | [optional] [default to 0]

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

<a name="fetchUserPostsApiV1WeiboWebFetchUserPostsGet_0"></a>
# **fetchUserPostsApiV1WeiboWebFetchUserPostsGet_0**
> ResponseModel fetchUserPostsApiV1WeiboWebFetchUserPostsGet_0(uid, page, feature)

获取微博用户文章数据/Get Weibo user article data

# [中文] ### 用途: - 获取微博用户文章数据 ### 参数: - uid: 用户id - page: 页数 - feature: 特征 ### 返回: - 用户文章数据  # [English] ### Purpose: - Get Weibo user article data ### Parameters: - uid: User id - page: Page number - feature: Feature ### Return: - User article data  # [示例/Example] uid &#x3D; \&quot;7277477906\&quot; page &#x3D; 1 feature &#x3D; 0

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WeiboWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    WeiboWebApiApi apiInstance = new WeiboWebApiApi(defaultClient);
    String uid = 7277477906; // String | 用户id/User id
    Integer page = 1; // Integer | 页数/Page number
    Integer feature = 0; // Integer | 特征/Feature
    try {
      ResponseModel result = apiInstance.fetchUserPostsApiV1WeiboWebFetchUserPostsGet_0(uid, page, feature);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WeiboWebApiApi#fetchUserPostsApiV1WeiboWebFetchUserPostsGet_0");
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
 **uid** | **String**| 用户id/User id |
 **page** | **Integer**| 页数/Page number | [optional] [default to 1]
 **feature** | **Integer**| 特征/Feature | [optional] [default to 0]

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

