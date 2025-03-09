# XiguaAppV2ApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchOneVideoApiV1XiguaAppV2FetchOneVideoGet**](XiguaAppV2ApiApi.md#fetchOneVideoApiV1XiguaAppV2FetchOneVideoGet) | **GET** /api/v1/xigua/app/v2/fetch_one_video | 获取单个作品数据/Get single video data
[**fetchOneVideoApiV1XiguaAppV2FetchOneVideoGet_0**](XiguaAppV2ApiApi.md#fetchOneVideoApiV1XiguaAppV2FetchOneVideoGet_0) | **GET** /api/v1/xigua/app/v2/fetch_one_video | 获取单个作品数据/Get single video data
[**fetchOneVideoPlayUrlApiV1XiguaAppV2FetchOneVideoPlayUrlGet**](XiguaAppV2ApiApi.md#fetchOneVideoPlayUrlApiV1XiguaAppV2FetchOneVideoPlayUrlGet) | **GET** /api/v1/xigua/app/v2/fetch_one_video_play_url | 获取单个作品的播放链接/Get single video play URL
[**fetchOneVideoPlayUrlApiV1XiguaAppV2FetchOneVideoPlayUrlGet_0**](XiguaAppV2ApiApi.md#fetchOneVideoPlayUrlApiV1XiguaAppV2FetchOneVideoPlayUrlGet_0) | **GET** /api/v1/xigua/app/v2/fetch_one_video_play_url | 获取单个作品的播放链接/Get single video play URL
[**fetchOneVideoV2ApiV1XiguaAppV2FetchOneVideoV2Get**](XiguaAppV2ApiApi.md#fetchOneVideoV2ApiV1XiguaAppV2FetchOneVideoV2Get) | **GET** /api/v1/xigua/app/v2/fetch_one_video_v2 | 获取单个作品数据 V2/Get single video data V2
[**fetchOneVideoV2ApiV1XiguaAppV2FetchOneVideoV2Get_0**](XiguaAppV2ApiApi.md#fetchOneVideoV2ApiV1XiguaAppV2FetchOneVideoV2Get_0) | **GET** /api/v1/xigua/app/v2/fetch_one_video_v2 | 获取单个作品数据 V2/Get single video data V2
[**fetchUserInfoApiV1XiguaAppV2FetchUserInfoGet**](XiguaAppV2ApiApi.md#fetchUserInfoApiV1XiguaAppV2FetchUserInfoGet) | **GET** /api/v1/xigua/app/v2/fetch_user_info | 个人信息/Personal information
[**fetchUserInfoApiV1XiguaAppV2FetchUserInfoGet_0**](XiguaAppV2ApiApi.md#fetchUserInfoApiV1XiguaAppV2FetchUserInfoGet_0) | **GET** /api/v1/xigua/app/v2/fetch_user_info | 个人信息/Personal information
[**fetchUserPostListApiV1XiguaAppV2FetchUserPostListGet**](XiguaAppV2ApiApi.md#fetchUserPostListApiV1XiguaAppV2FetchUserPostListGet) | **GET** /api/v1/xigua/app/v2/fetch_user_post_list | 获取个人作品列表/Get user post list
[**fetchUserPostListApiV1XiguaAppV2FetchUserPostListGet_0**](XiguaAppV2ApiApi.md#fetchUserPostListApiV1XiguaAppV2FetchUserPostListGet_0) | **GET** /api/v1/xigua/app/v2/fetch_user_post_list | 获取个人作品列表/Get user post list
[**fetchVideoCommentListApiV1XiguaAppV2FetchVideoCommentListGet**](XiguaAppV2ApiApi.md#fetchVideoCommentListApiV1XiguaAppV2FetchVideoCommentListGet) | **GET** /api/v1/xigua/app/v2/fetch_video_comment_list | 视频评论列表/Video comment list
[**fetchVideoCommentListApiV1XiguaAppV2FetchVideoCommentListGet_0**](XiguaAppV2ApiApi.md#fetchVideoCommentListApiV1XiguaAppV2FetchVideoCommentListGet_0) | **GET** /api/v1/xigua/app/v2/fetch_video_comment_list | 视频评论列表/Video comment list
[**searchVideoApiV1XiguaAppV2SearchVideoGet**](XiguaAppV2ApiApi.md#searchVideoApiV1XiguaAppV2SearchVideoGet) | **GET** /api/v1/xigua/app/v2/search_video | 搜索视频/Search video
[**searchVideoApiV1XiguaAppV2SearchVideoGet_0**](XiguaAppV2ApiApi.md#searchVideoApiV1XiguaAppV2SearchVideoGet_0) | **GET** /api/v1/xigua/app/v2/search_video | 搜索视频/Search video



## fetchOneVideoApiV1XiguaAppV2FetchOneVideoGet

> ResponseModel fetchOneVideoApiV1XiguaAppV2FetchOneVideoGet(itemId)

获取单个作品数据/Get single video data

# [中文] ### 用途: - 获取单个作品数据（信息较少，不包含标题等信息，但是包含相关视频的信息） ### 参数: - item_id: 作品id ### 返回: - 作品数据，其中包含视频链接的Base64编码播放地址，需要前端解码后使用，或者使用 /fetch_one_video_play_url 获取播放链接。  # [English] ### Purpose: - Get single video data (less information, does not include title and other information, but includes information about related videos) ### Parameters: - item_id: Video id ### Return: - Video data, which contains the Base64 encoded playback address of the video link, which needs to be decoded and used by the front end, or use /fetch_one_video_play_url to get the playback link.  # [示例/Example] item_id: \&quot;7354954305222377999\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiguaAppV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiguaAppV2ApiApi apiInstance = new XiguaAppV2ApiApi(defaultClient);
        String itemId = 7354954305222377999; // String | 作品id/Video id
        try {
            ResponseModel result = apiInstance.fetchOneVideoApiV1XiguaAppV2FetchOneVideoGet(itemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiguaAppV2ApiApi#fetchOneVideoApiV1XiguaAppV2FetchOneVideoGet");
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
 **itemId** | **String**| 作品id/Video id |

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


## fetchOneVideoApiV1XiguaAppV2FetchOneVideoGet_0

> ResponseModel fetchOneVideoApiV1XiguaAppV2FetchOneVideoGet_0(itemId)

获取单个作品数据/Get single video data

# [中文] ### 用途: - 获取单个作品数据（信息较少，不包含标题等信息，但是包含相关视频的信息） ### 参数: - item_id: 作品id ### 返回: - 作品数据，其中包含视频链接的Base64编码播放地址，需要前端解码后使用，或者使用 /fetch_one_video_play_url 获取播放链接。  # [English] ### Purpose: - Get single video data (less information, does not include title and other information, but includes information about related videos) ### Parameters: - item_id: Video id ### Return: - Video data, which contains the Base64 encoded playback address of the video link, which needs to be decoded and used by the front end, or use /fetch_one_video_play_url to get the playback link.  # [示例/Example] item_id: \&quot;7354954305222377999\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiguaAppV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiguaAppV2ApiApi apiInstance = new XiguaAppV2ApiApi(defaultClient);
        String itemId = 7354954305222377999; // String | 作品id/Video id
        try {
            ResponseModel result = apiInstance.fetchOneVideoApiV1XiguaAppV2FetchOneVideoGet_0(itemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiguaAppV2ApiApi#fetchOneVideoApiV1XiguaAppV2FetchOneVideoGet_0");
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
 **itemId** | **String**| 作品id/Video id |

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


## fetchOneVideoPlayUrlApiV1XiguaAppV2FetchOneVideoPlayUrlGet

> ResponseModel fetchOneVideoPlayUrlApiV1XiguaAppV2FetchOneVideoPlayUrlGet(itemId)

获取单个作品的播放链接/Get single video play URL

# [中文] ### 用途: - 获取单个作品的播放链接，此接口返回的是已经解码后的播放链接，可以直接使用。 ### 参数: - item_id: 作品id ### 返回: - 作品的播放链接的明文链接。  # [English] ### Purpose: - Get single video play URL, the interface returns the decoded play URL, which can be used directly. ### Parameters: - item_id: Video id ### Return: - Play URL of the video, plaintext link.  # [示例/Example] item_id: \&quot;7354954305222377999\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiguaAppV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiguaAppV2ApiApi apiInstance = new XiguaAppV2ApiApi(defaultClient);
        String itemId = 7354954305222377999; // String | 作品id/Video id
        try {
            ResponseModel result = apiInstance.fetchOneVideoPlayUrlApiV1XiguaAppV2FetchOneVideoPlayUrlGet(itemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiguaAppV2ApiApi#fetchOneVideoPlayUrlApiV1XiguaAppV2FetchOneVideoPlayUrlGet");
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
 **itemId** | **String**| 作品id/Video id |

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


## fetchOneVideoPlayUrlApiV1XiguaAppV2FetchOneVideoPlayUrlGet_0

> ResponseModel fetchOneVideoPlayUrlApiV1XiguaAppV2FetchOneVideoPlayUrlGet_0(itemId)

获取单个作品的播放链接/Get single video play URL

# [中文] ### 用途: - 获取单个作品的播放链接，此接口返回的是已经解码后的播放链接，可以直接使用。 ### 参数: - item_id: 作品id ### 返回: - 作品的播放链接的明文链接。  # [English] ### Purpose: - Get single video play URL, the interface returns the decoded play URL, which can be used directly. ### Parameters: - item_id: Video id ### Return: - Play URL of the video, plaintext link.  # [示例/Example] item_id: \&quot;7354954305222377999\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiguaAppV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiguaAppV2ApiApi apiInstance = new XiguaAppV2ApiApi(defaultClient);
        String itemId = 7354954305222377999; // String | 作品id/Video id
        try {
            ResponseModel result = apiInstance.fetchOneVideoPlayUrlApiV1XiguaAppV2FetchOneVideoPlayUrlGet_0(itemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiguaAppV2ApiApi#fetchOneVideoPlayUrlApiV1XiguaAppV2FetchOneVideoPlayUrlGet_0");
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
 **itemId** | **String**| 作品id/Video id |

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


## fetchOneVideoV2ApiV1XiguaAppV2FetchOneVideoV2Get

> ResponseModel fetchOneVideoV2ApiV1XiguaAppV2FetchOneVideoV2Get(itemId)

获取单个作品数据 V2/Get single video data V2

# [中文] ### 用途: - 获取单个作品数据（信息全面，包含标题等信息，但是不包含相关视频推荐信息） ### 参数: - item_id: 作品id ### 返回: - 作品数据，其中包含视频链接的Base64编码播放地址，需要前端解码后使用，或者使用 /fetch_one_video_play_url 获取播放链接。  # [English] ### Purpose: - Get single video data (more comprehensive information, including title and other information, but not including information about related video recommendations) ### Parameters: - item_id: Video id ### Return: - Video data, which contains the Base64 encoded playback address of the video link, which needs to be decoded and used by the front end, or use /fetch_one_video_play_url to get the playback link.  # [示例/Example] item_id: \&quot;7354954305222377999\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiguaAppV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiguaAppV2ApiApi apiInstance = new XiguaAppV2ApiApi(defaultClient);
        String itemId = 7354954305222377999; // String | 作品id/Video id
        try {
            ResponseModel result = apiInstance.fetchOneVideoV2ApiV1XiguaAppV2FetchOneVideoV2Get(itemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiguaAppV2ApiApi#fetchOneVideoV2ApiV1XiguaAppV2FetchOneVideoV2Get");
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
 **itemId** | **String**| 作品id/Video id |

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


## fetchOneVideoV2ApiV1XiguaAppV2FetchOneVideoV2Get_0

> ResponseModel fetchOneVideoV2ApiV1XiguaAppV2FetchOneVideoV2Get_0(itemId)

获取单个作品数据 V2/Get single video data V2

# [中文] ### 用途: - 获取单个作品数据（信息全面，包含标题等信息，但是不包含相关视频推荐信息） ### 参数: - item_id: 作品id ### 返回: - 作品数据，其中包含视频链接的Base64编码播放地址，需要前端解码后使用，或者使用 /fetch_one_video_play_url 获取播放链接。  # [English] ### Purpose: - Get single video data (more comprehensive information, including title and other information, but not including information about related video recommendations) ### Parameters: - item_id: Video id ### Return: - Video data, which contains the Base64 encoded playback address of the video link, which needs to be decoded and used by the front end, or use /fetch_one_video_play_url to get the playback link.  # [示例/Example] item_id: \&quot;7354954305222377999\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiguaAppV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiguaAppV2ApiApi apiInstance = new XiguaAppV2ApiApi(defaultClient);
        String itemId = 7354954305222377999; // String | 作品id/Video id
        try {
            ResponseModel result = apiInstance.fetchOneVideoV2ApiV1XiguaAppV2FetchOneVideoV2Get_0(itemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiguaAppV2ApiApi#fetchOneVideoV2ApiV1XiguaAppV2FetchOneVideoV2Get_0");
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
 **itemId** | **String**| 作品id/Video id |

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


## fetchUserInfoApiV1XiguaAppV2FetchUserInfoGet

> ResponseModel fetchUserInfoApiV1XiguaAppV2FetchUserInfoGet(userId)

个人信息/Personal information

# [中文] ### 用途: - 个人信息 ### 参数: - user_id: 用户id ### 返回: - 个人信息  # [English] ### Purpose: - Personal information ### Parameters: - user_id: User id ### Return: - Personal information  # [示例/Example] user_id: \&quot;52712347586\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiguaAppV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiguaAppV2ApiApi apiInstance = new XiguaAppV2ApiApi(defaultClient);
        String userId = 52712347586; // String | 用户id/User id
        try {
            ResponseModel result = apiInstance.fetchUserInfoApiV1XiguaAppV2FetchUserInfoGet(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiguaAppV2ApiApi#fetchUserInfoApiV1XiguaAppV2FetchUserInfoGet");
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
 **userId** | **String**| 用户id/User id |

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


## fetchUserInfoApiV1XiguaAppV2FetchUserInfoGet_0

> ResponseModel fetchUserInfoApiV1XiguaAppV2FetchUserInfoGet_0(userId)

个人信息/Personal information

# [中文] ### 用途: - 个人信息 ### 参数: - user_id: 用户id ### 返回: - 个人信息  # [English] ### Purpose: - Personal information ### Parameters: - user_id: User id ### Return: - Personal information  # [示例/Example] user_id: \&quot;52712347586\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiguaAppV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiguaAppV2ApiApi apiInstance = new XiguaAppV2ApiApi(defaultClient);
        String userId = 52712347586; // String | 用户id/User id
        try {
            ResponseModel result = apiInstance.fetchUserInfoApiV1XiguaAppV2FetchUserInfoGet_0(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiguaAppV2ApiApi#fetchUserInfoApiV1XiguaAppV2FetchUserInfoGet_0");
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
 **userId** | **String**| 用户id/User id |

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


## fetchUserPostListApiV1XiguaAppV2FetchUserPostListGet

> ResponseModel fetchUserPostListApiV1XiguaAppV2FetchUserPostListGet(userId, maxBehotTime)

获取个人作品列表/Get user post list

# [中文] ### 用途: - 获取个人作品列表 ### 参数: - user_id: 用户id - max_behot_time: 最大行为时间，默认空，第一次请求传空，后续请求传上一次请求返回数据中的JSON中的值。 - max_behot_time的值可以是JSON路径为：$.data.data.[-1].behot_time - 也就是data中的最后一个元素的cursor值 ### 返回: - 作品列表  # [English] ### Purpose: - Get user post list ### Parameters: - user_id: User id - max_behot_time: Maximum behavior time, default empty, pass empty for the first request, pass the max_behot_time returned by the previous request for subsequent requests - The value of max_behot_time can be the JSON path: $.data.data.[-1].behot_time - That is, the cursor value of the last element in data ### Return: - Post list  # [示例/Example] user_id &#x3D; \&quot;1922379661976311\&quot; max_behot_time &#x3D; \&quot;\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiguaAppV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiguaAppV2ApiApi apiInstance = new XiguaAppV2ApiApi(defaultClient);
        String userId = 1922379661976311; // String | 用户id/User id
        String maxBehotTime = "maxBehotTime_example"; // String | 最大行为时间/Maximum behavior time
        try {
            ResponseModel result = apiInstance.fetchUserPostListApiV1XiguaAppV2FetchUserPostListGet(userId, maxBehotTime);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiguaAppV2ApiApi#fetchUserPostListApiV1XiguaAppV2FetchUserPostListGet");
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
 **userId** | **String**| 用户id/User id |
 **maxBehotTime** | **String**| 最大行为时间/Maximum behavior time | [optional]

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


## fetchUserPostListApiV1XiguaAppV2FetchUserPostListGet_0

> ResponseModel fetchUserPostListApiV1XiguaAppV2FetchUserPostListGet_0(userId, maxBehotTime)

获取个人作品列表/Get user post list

# [中文] ### 用途: - 获取个人作品列表 ### 参数: - user_id: 用户id - max_behot_time: 最大行为时间，默认空，第一次请求传空，后续请求传上一次请求返回数据中的JSON中的值。 - max_behot_time的值可以是JSON路径为：$.data.data.[-1].behot_time - 也就是data中的最后一个元素的cursor值 ### 返回: - 作品列表  # [English] ### Purpose: - Get user post list ### Parameters: - user_id: User id - max_behot_time: Maximum behavior time, default empty, pass empty for the first request, pass the max_behot_time returned by the previous request for subsequent requests - The value of max_behot_time can be the JSON path: $.data.data.[-1].behot_time - That is, the cursor value of the last element in data ### Return: - Post list  # [示例/Example] user_id &#x3D; \&quot;1922379661976311\&quot; max_behot_time &#x3D; \&quot;\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiguaAppV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiguaAppV2ApiApi apiInstance = new XiguaAppV2ApiApi(defaultClient);
        String userId = 1922379661976311; // String | 用户id/User id
        String maxBehotTime = "maxBehotTime_example"; // String | 最大行为时间/Maximum behavior time
        try {
            ResponseModel result = apiInstance.fetchUserPostListApiV1XiguaAppV2FetchUserPostListGet_0(userId, maxBehotTime);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiguaAppV2ApiApi#fetchUserPostListApiV1XiguaAppV2FetchUserPostListGet_0");
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
 **userId** | **String**| 用户id/User id |
 **maxBehotTime** | **String**| 最大行为时间/Maximum behavior time | [optional]

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


## fetchVideoCommentListApiV1XiguaAppV2FetchVideoCommentListGet

> ResponseModel fetchVideoCommentListApiV1XiguaAppV2FetchVideoCommentListGet(itemId, offset, count)

视频评论列表/Video comment list

# [中文] ### 用途: - 视频评论列表 ### 参数: - item_id: 作品id - offset: 偏移量，第一次请求传0，后续请求传上一次请求返回的offset - count: 数量，默认20，建议保持默认。 ### 返回: - 评论列表  # [English] ### Purpose: - Video comment list ### Parameters: - item_id: Video id - offset: Offset, pass 0 for the first request, pass the offset returned by the previous request for subsequent requests - count: Quantity, default 20, it is recommended to keep the default. ### Return: - Comment list  # [示例/Example] item_id: \&quot;7354954305222377999\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiguaAppV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiguaAppV2ApiApi apiInstance = new XiguaAppV2ApiApi(defaultClient);
        String itemId = 7354954305222377999; // String | 作品id/Video id
        Integer offset = 0; // Integer | 偏移量/Offset
        Integer count = 20; // Integer | 数量/Count
        try {
            ResponseModel result = apiInstance.fetchVideoCommentListApiV1XiguaAppV2FetchVideoCommentListGet(itemId, offset, count);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiguaAppV2ApiApi#fetchVideoCommentListApiV1XiguaAppV2FetchVideoCommentListGet");
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
 **itemId** | **String**| 作品id/Video id |
 **offset** | **Integer**| 偏移量/Offset | [optional] [default to 0]
 **count** | **Integer**| 数量/Count | [optional] [default to 20]

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


## fetchVideoCommentListApiV1XiguaAppV2FetchVideoCommentListGet_0

> ResponseModel fetchVideoCommentListApiV1XiguaAppV2FetchVideoCommentListGet_0(itemId, offset, count)

视频评论列表/Video comment list

# [中文] ### 用途: - 视频评论列表 ### 参数: - item_id: 作品id - offset: 偏移量，第一次请求传0，后续请求传上一次请求返回的offset - count: 数量，默认20，建议保持默认。 ### 返回: - 评论列表  # [English] ### Purpose: - Video comment list ### Parameters: - item_id: Video id - offset: Offset, pass 0 for the first request, pass the offset returned by the previous request for subsequent requests - count: Quantity, default 20, it is recommended to keep the default. ### Return: - Comment list  # [示例/Example] item_id: \&quot;7354954305222377999\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiguaAppV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiguaAppV2ApiApi apiInstance = new XiguaAppV2ApiApi(defaultClient);
        String itemId = 7354954305222377999; // String | 作品id/Video id
        Integer offset = 0; // Integer | 偏移量/Offset
        Integer count = 20; // Integer | 数量/Count
        try {
            ResponseModel result = apiInstance.fetchVideoCommentListApiV1XiguaAppV2FetchVideoCommentListGet_0(itemId, offset, count);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiguaAppV2ApiApi#fetchVideoCommentListApiV1XiguaAppV2FetchVideoCommentListGet_0");
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
 **itemId** | **String**| 作品id/Video id |
 **offset** | **Integer**| 偏移量/Offset | [optional] [default to 0]
 **count** | **Integer**| 数量/Count | [optional] [default to 20]

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


## searchVideoApiV1XiguaAppV2SearchVideoGet

> ResponseModel searchVideoApiV1XiguaAppV2SearchVideoGet(keyword, offset, orderType, minDuration, maxDuration)

搜索视频/Search video

# [中文] ### 用途: - 搜索视频 ### 参数: - keyword: 关键词 - offset: 偏移量，第一次请求传0，后续请求传上一次请求返回的offset - order_type: 排序方式，为空时按照默认排序，以下为可选排序方式。     - 最新: publish_time     - 最热: play_count - min_duration: 最小时长，默认空，单位秒。 - max_duration: 最大时长，默认空，单位秒。 ### 返回: - 视频列表  # [English] ### Purpose: - Search video ### Parameters: - keyword: Keyword - offset: Offset, pass 0 for the first request, pass the offset returned by the previous request for subsequent requests - order_type: Order type, empty for default sorting, the following are optional sorting methods.     - Newest: publish_time     - Hottest: play_count - min_duration: Minimum duration, default empty, in seconds. - max_duration: Maximum duration, default empty, in seconds. ### Return: - Video list  # [示例/Example] &gt; 搜索关键字为“抖音”的视频，按照播放量排序，时长1-180秒(1-3分钟) &gt; Search for videos with the keyword \&quot;抖音\&quot;, sorted by play count, duration 1-180 seconds (1-3 minutes) keyword: \&quot;抖音\&quot; order_type: \&quot;play_count\&quot; min_duration: 1 max_duration: 180

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiguaAppV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiguaAppV2ApiApi apiInstance = new XiguaAppV2ApiApi(defaultClient);
        String keyword = 抖音; // String | 关键词/Keyword
        Integer offset = 0; // Integer | 偏移量/Offset
        String orderType = "orderType_example"; // String | 排序方式/Order type
        Integer minDuration = 56; // Integer | 最小时长/Minimum duration
        Integer maxDuration = 56; // Integer | 最大时长/Maximum duration
        try {
            ResponseModel result = apiInstance.searchVideoApiV1XiguaAppV2SearchVideoGet(keyword, offset, orderType, minDuration, maxDuration);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiguaAppV2ApiApi#searchVideoApiV1XiguaAppV2SearchVideoGet");
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
 **keyword** | **String**| 关键词/Keyword |
 **offset** | **Integer**| 偏移量/Offset | [optional] [default to 0]
 **orderType** | **String**| 排序方式/Order type | [optional]
 **minDuration** | **Integer**| 最小时长/Minimum duration | [optional]
 **maxDuration** | **Integer**| 最大时长/Maximum duration | [optional]

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


## searchVideoApiV1XiguaAppV2SearchVideoGet_0

> ResponseModel searchVideoApiV1XiguaAppV2SearchVideoGet_0(keyword, offset, orderType, minDuration, maxDuration)

搜索视频/Search video

# [中文] ### 用途: - 搜索视频 ### 参数: - keyword: 关键词 - offset: 偏移量，第一次请求传0，后续请求传上一次请求返回的offset - order_type: 排序方式，为空时按照默认排序，以下为可选排序方式。     - 最新: publish_time     - 最热: play_count - min_duration: 最小时长，默认空，单位秒。 - max_duration: 最大时长，默认空，单位秒。 ### 返回: - 视频列表  # [English] ### Purpose: - Search video ### Parameters: - keyword: Keyword - offset: Offset, pass 0 for the first request, pass the offset returned by the previous request for subsequent requests - order_type: Order type, empty for default sorting, the following are optional sorting methods.     - Newest: publish_time     - Hottest: play_count - min_duration: Minimum duration, default empty, in seconds. - max_duration: Maximum duration, default empty, in seconds. ### Return: - Video list  # [示例/Example] &gt; 搜索关键字为“抖音”的视频，按照播放量排序，时长1-180秒(1-3分钟) &gt; Search for videos with the keyword \&quot;抖音\&quot;, sorted by play count, duration 1-180 seconds (1-3 minutes) keyword: \&quot;抖音\&quot; order_type: \&quot;play_count\&quot; min_duration: 1 max_duration: 180

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiguaAppV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiguaAppV2ApiApi apiInstance = new XiguaAppV2ApiApi(defaultClient);
        String keyword = 抖音; // String | 关键词/Keyword
        Integer offset = 0; // Integer | 偏移量/Offset
        String orderType = "orderType_example"; // String | 排序方式/Order type
        Integer minDuration = 56; // Integer | 最小时长/Minimum duration
        Integer maxDuration = 56; // Integer | 最大时长/Maximum duration
        try {
            ResponseModel result = apiInstance.searchVideoApiV1XiguaAppV2SearchVideoGet_0(keyword, offset, orderType, minDuration, maxDuration);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiguaAppV2ApiApi#searchVideoApiV1XiguaAppV2SearchVideoGet_0");
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
 **keyword** | **String**| 关键词/Keyword |
 **offset** | **Integer**| 偏移量/Offset | [optional] [default to 0]
 **orderType** | **String**| 排序方式/Order type | [optional]
 **minDuration** | **Integer**| 最小时长/Minimum duration | [optional]
 **maxDuration** | **Integer**| 最大时长/Maximum duration | [optional]

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

