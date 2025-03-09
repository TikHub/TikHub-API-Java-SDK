# ToutiaoAppApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getArticleInfoApiV1ToutiaoAppGetArticleInfoGet**](ToutiaoAppApiApi.md#getArticleInfoApiV1ToutiaoAppGetArticleInfoGet) | **GET** /api/v1/toutiao/app/get_article_info | 获取指定文章的信息/Get information of specified article
[**getArticleInfoApiV1ToutiaoAppGetArticleInfoGet_0**](ToutiaoAppApiApi.md#getArticleInfoApiV1ToutiaoAppGetArticleInfoGet_0) | **GET** /api/v1/toutiao/app/get_article_info | 获取指定文章的信息/Get information of specified article
[**getCommentsApiV1ToutiaoAppGetCommentsGet**](ToutiaoAppApiApi.md#getCommentsApiV1ToutiaoAppGetCommentsGet) | **GET** /api/v1/toutiao/app/get_comments | 获取指定作品的评论/Get comments of specified post
[**getCommentsApiV1ToutiaoAppGetCommentsGet_0**](ToutiaoAppApiApi.md#getCommentsApiV1ToutiaoAppGetCommentsGet_0) | **GET** /api/v1/toutiao/app/get_comments | 获取指定作品的评论/Get comments of specified post
[**getUserIdApiV1ToutiaoAppGetUserIdGet**](ToutiaoAppApiApi.md#getUserIdApiV1ToutiaoAppGetUserIdGet) | **GET** /api/v1/toutiao/app/get_user_id | 从头条用户主页获取用户user_id/Get user_id from user profile
[**getUserIdApiV1ToutiaoAppGetUserIdGet_0**](ToutiaoAppApiApi.md#getUserIdApiV1ToutiaoAppGetUserIdGet_0) | **GET** /api/v1/toutiao/app/get_user_id | 从头条用户主页获取用户user_id/Get user_id from user profile
[**getUserInfoApiV1ToutiaoAppGetUserInfoGet**](ToutiaoAppApiApi.md#getUserInfoApiV1ToutiaoAppGetUserInfoGet) | **GET** /api/v1/toutiao/app/get_user_info | 获取指定用户的信息/Get information of specified user
[**getUserInfoApiV1ToutiaoAppGetUserInfoGet_0**](ToutiaoAppApiApi.md#getUserInfoApiV1ToutiaoAppGetUserInfoGet_0) | **GET** /api/v1/toutiao/app/get_user_info | 获取指定用户的信息/Get information of specified user
[**getVideoInfoApiV1ToutiaoAppGetVideoInfoGet**](ToutiaoAppApiApi.md#getVideoInfoApiV1ToutiaoAppGetVideoInfoGet) | **GET** /api/v1/toutiao/app/get_video_info | 获取指定视频的信息/Get information of specified video
[**getVideoInfoApiV1ToutiaoAppGetVideoInfoGet_0**](ToutiaoAppApiApi.md#getVideoInfoApiV1ToutiaoAppGetVideoInfoGet_0) | **GET** /api/v1/toutiao/app/get_video_info | 获取指定视频的信息/Get information of specified video



## getArticleInfoApiV1ToutiaoAppGetArticleInfoGet

> ResponseModel getArticleInfoApiV1ToutiaoAppGetArticleInfoGet(groupId)

获取指定文章的信息/Get information of specified article

# [中文] ### 用途: - 获取指定文章的信息 ### 参数: - group_id: 作品ID，可以从链接中获取     - 例如: https://www.toutiao.com/article/7450114952884503059/ ### 返回: - 作品信息  # [English] ### Purpose: - Get information of specified post ### Parameters: - group_id: Post ID, can be obtained from the link     - For example: https://www.toutiao.com/article/7450114952884503059/ ### Return: - Post information  # [示例/Example] group_id &#x3D; \&quot;7450114952884503059\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.ToutiaoAppApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ToutiaoAppApiApi apiInstance = new ToutiaoAppApiApi(defaultClient);
        String groupId = 7450114952884503059; // String | 作品ID/Post ID
        try {
            ResponseModel result = apiInstance.getArticleInfoApiV1ToutiaoAppGetArticleInfoGet(groupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToutiaoAppApiApi#getArticleInfoApiV1ToutiaoAppGetArticleInfoGet");
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
 **groupId** | **String**| 作品ID/Post ID |

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


## getArticleInfoApiV1ToutiaoAppGetArticleInfoGet_0

> ResponseModel getArticleInfoApiV1ToutiaoAppGetArticleInfoGet_0(groupId)

获取指定文章的信息/Get information of specified article

# [中文] ### 用途: - 获取指定文章的信息 ### 参数: - group_id: 作品ID，可以从链接中获取     - 例如: https://www.toutiao.com/article/7450114952884503059/ ### 返回: - 作品信息  # [English] ### Purpose: - Get information of specified post ### Parameters: - group_id: Post ID, can be obtained from the link     - For example: https://www.toutiao.com/article/7450114952884503059/ ### Return: - Post information  # [示例/Example] group_id &#x3D; \&quot;7450114952884503059\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.ToutiaoAppApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ToutiaoAppApiApi apiInstance = new ToutiaoAppApiApi(defaultClient);
        String groupId = 7450114952884503059; // String | 作品ID/Post ID
        try {
            ResponseModel result = apiInstance.getArticleInfoApiV1ToutiaoAppGetArticleInfoGet_0(groupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToutiaoAppApiApi#getArticleInfoApiV1ToutiaoAppGetArticleInfoGet_0");
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
 **groupId** | **String**| 作品ID/Post ID |

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


## getCommentsApiV1ToutiaoAppGetCommentsGet

> ResponseModel getCommentsApiV1ToutiaoAppGetCommentsGet(groupId, offset)

获取指定作品的评论/Get comments of specified post

# [中文] ### 用途: - 获取指定作品的评论 ### 参数: - group_id: 作品ID，可以从链接中获取     - 例如: https://www.toutiao.com/i7453372680222523931/ - offset: 偏移量，用于分页，默认为0，然后每次加20 ### 返回: - 评论列表  # [English] ### Purpose: - Get comments of specified post ### Parameters: - group_id: Post ID, can be obtained from the link     - For example: https://www.toutiao.com/i7453372680222523931/ - offset: Offset, used for pagination, default is 0, then add 20 each time ### Return: - Comment list  # [示例/Example] group_id &#x3D; \&quot;7453372680222523931\&quot; offset &#x3D; \&quot;0\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.ToutiaoAppApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ToutiaoAppApiApi apiInstance = new ToutiaoAppApiApi(defaultClient);
        String groupId = 7453372680222523931; // String | 作品ID/Post ID
        String offset = 0; // String | 偏移量/Offset
        try {
            ResponseModel result = apiInstance.getCommentsApiV1ToutiaoAppGetCommentsGet(groupId, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToutiaoAppApiApi#getCommentsApiV1ToutiaoAppGetCommentsGet");
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
 **groupId** | **String**| 作品ID/Post ID |
 **offset** | **String**| 偏移量/Offset |

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


## getCommentsApiV1ToutiaoAppGetCommentsGet_0

> ResponseModel getCommentsApiV1ToutiaoAppGetCommentsGet_0(groupId, offset)

获取指定作品的评论/Get comments of specified post

# [中文] ### 用途: - 获取指定作品的评论 ### 参数: - group_id: 作品ID，可以从链接中获取     - 例如: https://www.toutiao.com/i7453372680222523931/ - offset: 偏移量，用于分页，默认为0，然后每次加20 ### 返回: - 评论列表  # [English] ### Purpose: - Get comments of specified post ### Parameters: - group_id: Post ID, can be obtained from the link     - For example: https://www.toutiao.com/i7453372680222523931/ - offset: Offset, used for pagination, default is 0, then add 20 each time ### Return: - Comment list  # [示例/Example] group_id &#x3D; \&quot;7453372680222523931\&quot; offset &#x3D; \&quot;0\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.ToutiaoAppApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ToutiaoAppApiApi apiInstance = new ToutiaoAppApiApi(defaultClient);
        String groupId = 7453372680222523931; // String | 作品ID/Post ID
        String offset = 0; // String | 偏移量/Offset
        try {
            ResponseModel result = apiInstance.getCommentsApiV1ToutiaoAppGetCommentsGet_0(groupId, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToutiaoAppApiApi#getCommentsApiV1ToutiaoAppGetCommentsGet_0");
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
 **groupId** | **String**| 作品ID/Post ID |
 **offset** | **String**| 偏移量/Offset |

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


## getUserIdApiV1ToutiaoAppGetUserIdGet

> ResponseModel getUserIdApiV1ToutiaoAppGetUserIdGet(userProfileUrl)

从头条用户主页获取用户user_id/Get user_id from user profile

# [中文] ### 用途: - 从头条用户主页获取用户user_id ### 参数: - user_profile_url: 用户主页链接     - 例如: https://www.toutiao.com/c/user/token/MS4wLjABAAAAwK6echNksY69R8l2vcZudupfhTItbGSGt-8ineO5UaB4L-djqkYDgB6TkAdMvrmW/ ### 返回: - 用户ID  # [English] ### Purpose: - Get user_id from user profile ### Parameters: - user_profile_url: User profile URL     - For example: https://www.toutiao.com/c/user/token/MS4wLjABAAAAwK6echNksY69R8l2vcZudupfhTItbGSGt-8ineO5UaB4L-djqkYDgB6TkAdMvrmW/ ### Return: - User ID  # [示例/Example] user_profile_url &#x3D; \&quot;https://www.toutiao.com/c/user/token/MS4wLjABAAAAwK6echNksY69R8l2vcZudupfhTItbGSGt-8ineO5UaB4L-djqkYDgB6TkAdMvrmW/\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.ToutiaoAppApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ToutiaoAppApiApi apiInstance = new ToutiaoAppApiApi(defaultClient);
        String userProfileUrl = https://www.toutiao.com/c/user/token/MS4wLjABAAAAwK6echNksY69R8l2vcZudupfhTItbGSGt-8ineO5UaB4L-djqkYDgB6TkAdMvrmW/; // String | 用户主页链接/User profile URL
        try {
            ResponseModel result = apiInstance.getUserIdApiV1ToutiaoAppGetUserIdGet(userProfileUrl);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToutiaoAppApiApi#getUserIdApiV1ToutiaoAppGetUserIdGet");
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
 **userProfileUrl** | **String**| 用户主页链接/User profile URL |

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


## getUserIdApiV1ToutiaoAppGetUserIdGet_0

> ResponseModel getUserIdApiV1ToutiaoAppGetUserIdGet_0(userProfileUrl)

从头条用户主页获取用户user_id/Get user_id from user profile

# [中文] ### 用途: - 从头条用户主页获取用户user_id ### 参数: - user_profile_url: 用户主页链接     - 例如: https://www.toutiao.com/c/user/token/MS4wLjABAAAAwK6echNksY69R8l2vcZudupfhTItbGSGt-8ineO5UaB4L-djqkYDgB6TkAdMvrmW/ ### 返回: - 用户ID  # [English] ### Purpose: - Get user_id from user profile ### Parameters: - user_profile_url: User profile URL     - For example: https://www.toutiao.com/c/user/token/MS4wLjABAAAAwK6echNksY69R8l2vcZudupfhTItbGSGt-8ineO5UaB4L-djqkYDgB6TkAdMvrmW/ ### Return: - User ID  # [示例/Example] user_profile_url &#x3D; \&quot;https://www.toutiao.com/c/user/token/MS4wLjABAAAAwK6echNksY69R8l2vcZudupfhTItbGSGt-8ineO5UaB4L-djqkYDgB6TkAdMvrmW/\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.ToutiaoAppApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ToutiaoAppApiApi apiInstance = new ToutiaoAppApiApi(defaultClient);
        String userProfileUrl = https://www.toutiao.com/c/user/token/MS4wLjABAAAAwK6echNksY69R8l2vcZudupfhTItbGSGt-8ineO5UaB4L-djqkYDgB6TkAdMvrmW/; // String | 用户主页链接/User profile URL
        try {
            ResponseModel result = apiInstance.getUserIdApiV1ToutiaoAppGetUserIdGet_0(userProfileUrl);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToutiaoAppApiApi#getUserIdApiV1ToutiaoAppGetUserIdGet_0");
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
 **userProfileUrl** | **String**| 用户主页链接/User profile URL |

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


## getUserInfoApiV1ToutiaoAppGetUserInfoGet

> ResponseModel getUserInfoApiV1ToutiaoAppGetUserInfoGet(userId)

获取指定用户的信息/Get information of specified user

# [中文] ### 用途: - 获取指定用户的信息 ### 参数: - user_id: 用户ID，可以从以下接口获取：     - &#x60;/api/v1/toutiao/app/get_user_id&#x60; ### 返回: - 用户信息  # [English] ### Purpose: - Get information of specified user ### Parameters: - user_id: User ID, can be obtained from the following API:     - &#x60;/api/v1/toutiao/app/get_user_id&#x60; ### Return: - User information  # [示例/Example] user_id &#x3D; \&quot;1352838578180211\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.ToutiaoAppApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ToutiaoAppApiApi apiInstance = new ToutiaoAppApiApi(defaultClient);
        String userId = 1352838578180211; // String | 用户ID/User ID
        try {
            ResponseModel result = apiInstance.getUserInfoApiV1ToutiaoAppGetUserInfoGet(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToutiaoAppApiApi#getUserInfoApiV1ToutiaoAppGetUserInfoGet");
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
 **userId** | **String**| 用户ID/User ID |

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


## getUserInfoApiV1ToutiaoAppGetUserInfoGet_0

> ResponseModel getUserInfoApiV1ToutiaoAppGetUserInfoGet_0(userId)

获取指定用户的信息/Get information of specified user

# [中文] ### 用途: - 获取指定用户的信息 ### 参数: - user_id: 用户ID，可以从以下接口获取：     - &#x60;/api/v1/toutiao/app/get_user_id&#x60; ### 返回: - 用户信息  # [English] ### Purpose: - Get information of specified user ### Parameters: - user_id: User ID, can be obtained from the following API:     - &#x60;/api/v1/toutiao/app/get_user_id&#x60; ### Return: - User information  # [示例/Example] user_id &#x3D; \&quot;1352838578180211\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.ToutiaoAppApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ToutiaoAppApiApi apiInstance = new ToutiaoAppApiApi(defaultClient);
        String userId = 1352838578180211; // String | 用户ID/User ID
        try {
            ResponseModel result = apiInstance.getUserInfoApiV1ToutiaoAppGetUserInfoGet_0(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToutiaoAppApiApi#getUserInfoApiV1ToutiaoAppGetUserInfoGet_0");
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
 **userId** | **String**| 用户ID/User ID |

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


## getVideoInfoApiV1ToutiaoAppGetVideoInfoGet

> ResponseModel getVideoInfoApiV1ToutiaoAppGetVideoInfoGet(groupId)

获取指定视频的信息/Get information of specified video

# [中文] ### 用途: - 获取指定视频的信息 ### 参数: - group_id: 作品ID，可以从链接中获取     - 例如: https://www.toutiao.com/video/7431543350882206242/ ### 返回: - 作品信息  # [English] ### Purpose: - Get information of specified video ### Parameters: - group_id: Post ID, can be obtained from the link     - For example: https://www.toutiao.com/video/7431543350882206242/ ### Return: - Post information  # [示例/Example] group_id &#x3D; \&quot;7431543350882206242\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.ToutiaoAppApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ToutiaoAppApiApi apiInstance = new ToutiaoAppApiApi(defaultClient);
        String groupId = 7431543350882206242; // String | 作品ID/Post ID
        try {
            ResponseModel result = apiInstance.getVideoInfoApiV1ToutiaoAppGetVideoInfoGet(groupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToutiaoAppApiApi#getVideoInfoApiV1ToutiaoAppGetVideoInfoGet");
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
 **groupId** | **String**| 作品ID/Post ID |

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


## getVideoInfoApiV1ToutiaoAppGetVideoInfoGet_0

> ResponseModel getVideoInfoApiV1ToutiaoAppGetVideoInfoGet_0(groupId)

获取指定视频的信息/Get information of specified video

# [中文] ### 用途: - 获取指定视频的信息 ### 参数: - group_id: 作品ID，可以从链接中获取     - 例如: https://www.toutiao.com/video/7431543350882206242/ ### 返回: - 作品信息  # [English] ### Purpose: - Get information of specified video ### Parameters: - group_id: Post ID, can be obtained from the link     - For example: https://www.toutiao.com/video/7431543350882206242/ ### Return: - Post information  # [示例/Example] group_id &#x3D; \&quot;7431543350882206242\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.ToutiaoAppApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ToutiaoAppApiApi apiInstance = new ToutiaoAppApiApi(defaultClient);
        String groupId = 7431543350882206242; // String | 作品ID/Post ID
        try {
            ResponseModel result = apiInstance.getVideoInfoApiV1ToutiaoAppGetVideoInfoGet_0(groupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToutiaoAppApiApi#getVideoInfoApiV1ToutiaoAppGetVideoInfoGet_0");
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
 **groupId** | **String**| 作品ID/Post ID |

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

