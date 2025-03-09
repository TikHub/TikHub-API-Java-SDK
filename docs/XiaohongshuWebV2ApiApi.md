# XiaohongshuWebV2ApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchFeedNotesApiV1XiaohongshuWebV2FetchFeedNotesGet**](XiaohongshuWebV2ApiApi.md#fetchFeedNotesApiV1XiaohongshuWebV2FetchFeedNotesGet) | **GET** /api/v1/xiaohongshu/web_v2/fetch_feed_notes | 获取推荐笔记/Fetch feed notes
[**fetchFeedNotesApiV1XiaohongshuWebV2FetchFeedNotesGet_0**](XiaohongshuWebV2ApiApi.md#fetchFeedNotesApiV1XiaohongshuWebV2FetchFeedNotesGet_0) | **GET** /api/v1/xiaohongshu/web_v2/fetch_feed_notes | 获取推荐笔记/Fetch feed notes
[**fetchFollowerListApiV1XiaohongshuWebV2FetchFollowerListGet**](XiaohongshuWebV2ApiApi.md#fetchFollowerListApiV1XiaohongshuWebV2FetchFollowerListGet) | **GET** /api/v1/xiaohongshu/web_v2/fetch_follower_list | 获取用户粉丝列表/Fetch follower list
[**fetchFollowerListApiV1XiaohongshuWebV2FetchFollowerListGet_0**](XiaohongshuWebV2ApiApi.md#fetchFollowerListApiV1XiaohongshuWebV2FetchFollowerListGet_0) | **GET** /api/v1/xiaohongshu/web_v2/fetch_follower_list | 获取用户粉丝列表/Fetch follower list
[**fetchFollowingListApiV1XiaohongshuWebV2FetchFollowingListGet**](XiaohongshuWebV2ApiApi.md#fetchFollowingListApiV1XiaohongshuWebV2FetchFollowingListGet) | **GET** /api/v1/xiaohongshu/web_v2/fetch_following_list | 获取用户关注列表/Fetch following list
[**fetchFollowingListApiV1XiaohongshuWebV2FetchFollowingListGet_0**](XiaohongshuWebV2ApiApi.md#fetchFollowingListApiV1XiaohongshuWebV2FetchFollowingListGet_0) | **GET** /api/v1/xiaohongshu/web_v2/fetch_following_list | 获取用户关注列表/Fetch following list
[**fetchHomeNotesApiV1XiaohongshuWebV2FetchHomeNotesGet**](XiaohongshuWebV2ApiApi.md#fetchHomeNotesApiV1XiaohongshuWebV2FetchHomeNotesGet) | **GET** /api/v1/xiaohongshu/web_v2/fetch_home_notes | 获取主页笔记/Fetch home notes
[**fetchHomeNotesApiV1XiaohongshuWebV2FetchHomeNotesGet_0**](XiaohongshuWebV2ApiApi.md#fetchHomeNotesApiV1XiaohongshuWebV2FetchHomeNotesGet_0) | **GET** /api/v1/xiaohongshu/web_v2/fetch_home_notes | 获取主页笔记/Fetch home notes
[**fetchNoteCommentsApiV1XiaohongshuWebV2FetchNoteCommentsGet**](XiaohongshuWebV2ApiApi.md#fetchNoteCommentsApiV1XiaohongshuWebV2FetchNoteCommentsGet) | **GET** /api/v1/xiaohongshu/web_v2/fetch_note_comments | 获取笔记评论/Fetch note comments
[**fetchNoteCommentsApiV1XiaohongshuWebV2FetchNoteCommentsGet_0**](XiaohongshuWebV2ApiApi.md#fetchNoteCommentsApiV1XiaohongshuWebV2FetchNoteCommentsGet_0) | **GET** /api/v1/xiaohongshu/web_v2/fetch_note_comments | 获取笔记评论/Fetch note comments
[**fetchSearchNotesApiV1XiaohongshuWebV2FetchSearchNotesGet**](XiaohongshuWebV2ApiApi.md#fetchSearchNotesApiV1XiaohongshuWebV2FetchSearchNotesGet) | **GET** /api/v1/xiaohongshu/web_v2/fetch_search_notes | 获取搜索笔记/Fetch search notes
[**fetchSearchNotesApiV1XiaohongshuWebV2FetchSearchNotesGet_0**](XiaohongshuWebV2ApiApi.md#fetchSearchNotesApiV1XiaohongshuWebV2FetchSearchNotesGet_0) | **GET** /api/v1/xiaohongshu/web_v2/fetch_search_notes | 获取搜索笔记/Fetch search notes
[**fetchSubCommentsApiV1XiaohongshuWebV2FetchSubCommentsGet**](XiaohongshuWebV2ApiApi.md#fetchSubCommentsApiV1XiaohongshuWebV2FetchSubCommentsGet) | **GET** /api/v1/xiaohongshu/web_v2/fetch_sub_comments | 获取子评论/Fetch sub comments
[**fetchSubCommentsApiV1XiaohongshuWebV2FetchSubCommentsGet_0**](XiaohongshuWebV2ApiApi.md#fetchSubCommentsApiV1XiaohongshuWebV2FetchSubCommentsGet_0) | **GET** /api/v1/xiaohongshu/web_v2/fetch_sub_comments | 获取子评论/Fetch sub comments
[**fetchUserInfoApiV1XiaohongshuWebV2FetchUserInfoGet**](XiaohongshuWebV2ApiApi.md#fetchUserInfoApiV1XiaohongshuWebV2FetchUserInfoGet) | **GET** /api/v1/xiaohongshu/web_v2/fetch_user_info | 获取用户信息/Fetch user info
[**fetchUserInfoApiV1XiaohongshuWebV2FetchUserInfoGet_0**](XiaohongshuWebV2ApiApi.md#fetchUserInfoApiV1XiaohongshuWebV2FetchUserInfoGet_0) | **GET** /api/v1/xiaohongshu/web_v2/fetch_user_info | 获取用户信息/Fetch user info



## fetchFeedNotesApiV1XiaohongshuWebV2FetchFeedNotesGet

> ResponseModel fetchFeedNotesApiV1XiaohongshuWebV2FetchFeedNotesGet(noteId)

获取推荐笔记/Fetch feed notes

# [中文] ### 用途: - 获取推荐笔记 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 ### 返回: - 推荐笔记  # [English] ### Purpose: - Get feed notes ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. ### Return: - Feed notes  # [示例/Example] note_id &#x3D; \&quot;66c9cc31000000001f03a4bc\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiaohongshuWebV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiaohongshuWebV2ApiApi apiInstance = new XiaohongshuWebV2ApiApi(defaultClient);
        String noteId = 66c9cc31000000001f03a4bc; // String | 笔记ID/Note ID
        try {
            ResponseModel result = apiInstance.fetchFeedNotesApiV1XiaohongshuWebV2FetchFeedNotesGet(noteId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiaohongshuWebV2ApiApi#fetchFeedNotesApiV1XiaohongshuWebV2FetchFeedNotesGet");
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
 **noteId** | **String**| 笔记ID/Note ID |

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


## fetchFeedNotesApiV1XiaohongshuWebV2FetchFeedNotesGet_0

> ResponseModel fetchFeedNotesApiV1XiaohongshuWebV2FetchFeedNotesGet_0(noteId)

获取推荐笔记/Fetch feed notes

# [中文] ### 用途: - 获取推荐笔记 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 ### 返回: - 推荐笔记  # [English] ### Purpose: - Get feed notes ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. ### Return: - Feed notes  # [示例/Example] note_id &#x3D; \&quot;66c9cc31000000001f03a4bc\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiaohongshuWebV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiaohongshuWebV2ApiApi apiInstance = new XiaohongshuWebV2ApiApi(defaultClient);
        String noteId = 66c9cc31000000001f03a4bc; // String | 笔记ID/Note ID
        try {
            ResponseModel result = apiInstance.fetchFeedNotesApiV1XiaohongshuWebV2FetchFeedNotesGet_0(noteId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiaohongshuWebV2ApiApi#fetchFeedNotesApiV1XiaohongshuWebV2FetchFeedNotesGet_0");
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
 **noteId** | **String**| 笔记ID/Note ID |

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


## fetchFollowerListApiV1XiaohongshuWebV2FetchFollowerListGet

> ResponseModel fetchFollowerListApiV1XiaohongshuWebV2FetchFollowerListGet(userId, cursor)

获取用户粉丝列表/Fetch follower list

# [中文] ### 用途: - 获取用户粉丝列表 ### 参数: - user_id: 用户ID - cursor: 游标 ### 返回: - 用户粉丝列表  # [English] ### Purpose: - Get follower list ### Parameters: - user_id: User ID - cursor: Cursor ### Return: - Follower list  # [示例/Example] user_id &#x3D; \&quot;604a28420000000001005211\&quot; cursor &#x3D; \&quot;\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiaohongshuWebV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiaohongshuWebV2ApiApi apiInstance = new XiaohongshuWebV2ApiApi(defaultClient);
        String userId = 604a28420000000001005211; // String | 用户ID/User ID
        String cursor = "\"\""; // String | 游标/Cursor
        try {
            ResponseModel result = apiInstance.fetchFollowerListApiV1XiaohongshuWebV2FetchFollowerListGet(userId, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiaohongshuWebV2ApiApi#fetchFollowerListApiV1XiaohongshuWebV2FetchFollowerListGet");
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
 **cursor** | **String**| 游标/Cursor | [optional] [default to &quot;&quot;]

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


## fetchFollowerListApiV1XiaohongshuWebV2FetchFollowerListGet_0

> ResponseModel fetchFollowerListApiV1XiaohongshuWebV2FetchFollowerListGet_0(userId, cursor)

获取用户粉丝列表/Fetch follower list

# [中文] ### 用途: - 获取用户粉丝列表 ### 参数: - user_id: 用户ID - cursor: 游标 ### 返回: - 用户粉丝列表  # [English] ### Purpose: - Get follower list ### Parameters: - user_id: User ID - cursor: Cursor ### Return: - Follower list  # [示例/Example] user_id &#x3D; \&quot;604a28420000000001005211\&quot; cursor &#x3D; \&quot;\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiaohongshuWebV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiaohongshuWebV2ApiApi apiInstance = new XiaohongshuWebV2ApiApi(defaultClient);
        String userId = 604a28420000000001005211; // String | 用户ID/User ID
        String cursor = "\"\""; // String | 游标/Cursor
        try {
            ResponseModel result = apiInstance.fetchFollowerListApiV1XiaohongshuWebV2FetchFollowerListGet_0(userId, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiaohongshuWebV2ApiApi#fetchFollowerListApiV1XiaohongshuWebV2FetchFollowerListGet_0");
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
 **cursor** | **String**| 游标/Cursor | [optional] [default to &quot;&quot;]

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


## fetchFollowingListApiV1XiaohongshuWebV2FetchFollowingListGet

> ResponseModel fetchFollowingListApiV1XiaohongshuWebV2FetchFollowingListGet(userId, cursor)

获取用户关注列表/Fetch following list

# [中文] ### 用途: - 获取用户关注列表 ### 参数: - user_id: 用户ID - cursor: 游标 ### 返回: - 用户关注列表  # [English] ### Purpose: - Get following list ### Parameters: - user_id: User ID - cursor: Cursor ### Return: - Following list  # [示例/Example] user_id &#x3D; \&quot;604a28420000000001005211\&quot; cursor &#x3D; \&quot;\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiaohongshuWebV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiaohongshuWebV2ApiApi apiInstance = new XiaohongshuWebV2ApiApi(defaultClient);
        String userId = 604a28420000000001005211; // String | 用户ID/User ID
        String cursor = "\"\""; // String | 游标/Cursor
        try {
            ResponseModel result = apiInstance.fetchFollowingListApiV1XiaohongshuWebV2FetchFollowingListGet(userId, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiaohongshuWebV2ApiApi#fetchFollowingListApiV1XiaohongshuWebV2FetchFollowingListGet");
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
 **cursor** | **String**| 游标/Cursor | [optional] [default to &quot;&quot;]

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


## fetchFollowingListApiV1XiaohongshuWebV2FetchFollowingListGet_0

> ResponseModel fetchFollowingListApiV1XiaohongshuWebV2FetchFollowingListGet_0(userId, cursor)

获取用户关注列表/Fetch following list

# [中文] ### 用途: - 获取用户关注列表 ### 参数: - user_id: 用户ID - cursor: 游标 ### 返回: - 用户关注列表  # [English] ### Purpose: - Get following list ### Parameters: - user_id: User ID - cursor: Cursor ### Return: - Following list  # [示例/Example] user_id &#x3D; \&quot;604a28420000000001005211\&quot; cursor &#x3D; \&quot;\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiaohongshuWebV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiaohongshuWebV2ApiApi apiInstance = new XiaohongshuWebV2ApiApi(defaultClient);
        String userId = 604a28420000000001005211; // String | 用户ID/User ID
        String cursor = "\"\""; // String | 游标/Cursor
        try {
            ResponseModel result = apiInstance.fetchFollowingListApiV1XiaohongshuWebV2FetchFollowingListGet_0(userId, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiaohongshuWebV2ApiApi#fetchFollowingListApiV1XiaohongshuWebV2FetchFollowingListGet_0");
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
 **cursor** | **String**| 游标/Cursor | [optional] [default to &quot;&quot;]

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


## fetchHomeNotesApiV1XiaohongshuWebV2FetchHomeNotesGet

> ResponseModel fetchHomeNotesApiV1XiaohongshuWebV2FetchHomeNotesGet(userId, cursor)

获取主页笔记/Fetch home notes

# [中文] ### 用途: - 获取主页笔记 ### 参数: - user_id: 用户ID - cursor: 游标 ### 返回: - 主页笔记  # [English] ### Purpose: - Get home notes ### Parameters: - user_id: User ID - cursor: Cursor ### Return: - Home notes  # [示例/Example] user_id &#x3D; \&quot;5f3e0d00000000001f03a4bc\&quot; cursor &#x3D; \&quot;\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiaohongshuWebV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiaohongshuWebV2ApiApi apiInstance = new XiaohongshuWebV2ApiApi(defaultClient);
        String userId = 5e3a8ee700000000010070c6; // String | 用户ID/User ID
        String cursor = "\"\""; // String | 游标/Cursor
        try {
            ResponseModel result = apiInstance.fetchHomeNotesApiV1XiaohongshuWebV2FetchHomeNotesGet(userId, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiaohongshuWebV2ApiApi#fetchHomeNotesApiV1XiaohongshuWebV2FetchHomeNotesGet");
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
 **cursor** | **String**| 游标/Cursor | [optional] [default to &quot;&quot;]

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


## fetchHomeNotesApiV1XiaohongshuWebV2FetchHomeNotesGet_0

> ResponseModel fetchHomeNotesApiV1XiaohongshuWebV2FetchHomeNotesGet_0(userId, cursor)

获取主页笔记/Fetch home notes

# [中文] ### 用途: - 获取主页笔记 ### 参数: - user_id: 用户ID - cursor: 游标 ### 返回: - 主页笔记  # [English] ### Purpose: - Get home notes ### Parameters: - user_id: User ID - cursor: Cursor ### Return: - Home notes  # [示例/Example] user_id &#x3D; \&quot;5f3e0d00000000001f03a4bc\&quot; cursor &#x3D; \&quot;\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiaohongshuWebV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiaohongshuWebV2ApiApi apiInstance = new XiaohongshuWebV2ApiApi(defaultClient);
        String userId = 5e3a8ee700000000010070c6; // String | 用户ID/User ID
        String cursor = "\"\""; // String | 游标/Cursor
        try {
            ResponseModel result = apiInstance.fetchHomeNotesApiV1XiaohongshuWebV2FetchHomeNotesGet_0(userId, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiaohongshuWebV2ApiApi#fetchHomeNotesApiV1XiaohongshuWebV2FetchHomeNotesGet_0");
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
 **cursor** | **String**| 游标/Cursor | [optional] [default to &quot;&quot;]

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


## fetchNoteCommentsApiV1XiaohongshuWebV2FetchNoteCommentsGet

> ResponseModel fetchNoteCommentsApiV1XiaohongshuWebV2FetchNoteCommentsGet(noteId, cursor)

获取笔记评论/Fetch note comments

# [中文] ### 用途: - 获取笔记评论 ### 参数: - note_id: 笔记ID - cursor: 游标 ### 返回: - 笔记评论  # [English] ### Purpose: - Get note comments ### Parameters: - note_id: Note ID - cursor: Cursor ### Return: - Note comments  # [示例/Example] note_id &#x3D; \&quot;651ccaa9000000001f03d7f7\&quot; cursor &#x3D; \&quot;\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiaohongshuWebV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiaohongshuWebV2ApiApi apiInstance = new XiaohongshuWebV2ApiApi(defaultClient);
        String noteId = 651ccaa9000000001f03d7f7; // String | 笔记ID/Note ID
        String cursor = "\"\""; // String | 游标/Cursor
        try {
            ResponseModel result = apiInstance.fetchNoteCommentsApiV1XiaohongshuWebV2FetchNoteCommentsGet(noteId, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiaohongshuWebV2ApiApi#fetchNoteCommentsApiV1XiaohongshuWebV2FetchNoteCommentsGet");
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
 **noteId** | **String**| 笔记ID/Note ID |
 **cursor** | **String**| 游标/Cursor | [optional] [default to &quot;&quot;]

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


## fetchNoteCommentsApiV1XiaohongshuWebV2FetchNoteCommentsGet_0

> ResponseModel fetchNoteCommentsApiV1XiaohongshuWebV2FetchNoteCommentsGet_0(noteId, cursor)

获取笔记评论/Fetch note comments

# [中文] ### 用途: - 获取笔记评论 ### 参数: - note_id: 笔记ID - cursor: 游标 ### 返回: - 笔记评论  # [English] ### Purpose: - Get note comments ### Parameters: - note_id: Note ID - cursor: Cursor ### Return: - Note comments  # [示例/Example] note_id &#x3D; \&quot;651ccaa9000000001f03d7f7\&quot; cursor &#x3D; \&quot;\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiaohongshuWebV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiaohongshuWebV2ApiApi apiInstance = new XiaohongshuWebV2ApiApi(defaultClient);
        String noteId = 651ccaa9000000001f03d7f7; // String | 笔记ID/Note ID
        String cursor = "\"\""; // String | 游标/Cursor
        try {
            ResponseModel result = apiInstance.fetchNoteCommentsApiV1XiaohongshuWebV2FetchNoteCommentsGet_0(noteId, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiaohongshuWebV2ApiApi#fetchNoteCommentsApiV1XiaohongshuWebV2FetchNoteCommentsGet_0");
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
 **noteId** | **String**| 笔记ID/Note ID |
 **cursor** | **String**| 游标/Cursor | [optional] [default to &quot;&quot;]

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


## fetchSearchNotesApiV1XiaohongshuWebV2FetchSearchNotesGet

> ResponseModel fetchSearchNotesApiV1XiaohongshuWebV2FetchSearchNotesGet(keywords, page, sortType, noteType)

获取搜索笔记/Fetch search notes

# [中文] ### 用途: - 获取搜索笔记 ### 参数: - keywords：搜索关键词 - sort_type：排序方式     - general：综合     - time_descending：最新     - popularity_descending：最热 - note_type: 笔记类型     - 0：全部     - 1：视频     - 2：图文 ### 返回: - 搜索笔记  # [English] ### Purpose: - Get search notes ### Parameters: - keywords: Search keywords - sort_type: Sort type     - general: General     - time_descending: Latest     - popularity_descending: Popular - note_type: Note type     - 0: All     - 1: Video     - 2: Note ### Return: - Search notes  # [示例/Example] keywords &#x3D; \&quot;口红\&quot; page &#x3D; 1 sort_type &#x3D; \&quot;general\&quot; note_type &#x3D; \&quot;1\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiaohongshuWebV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiaohongshuWebV2ApiApi apiInstance = new XiaohongshuWebV2ApiApi(defaultClient);
        String keywords = 口红; // String | 搜索关键词/Search keywords
        Integer page = 1; // Integer | 页码/Page number
        String sortType = "\"general\""; // String | 排序方式/Sort type
        String noteType = "\"0\""; // String | 笔记类型/Note type
        try {
            ResponseModel result = apiInstance.fetchSearchNotesApiV1XiaohongshuWebV2FetchSearchNotesGet(keywords, page, sortType, noteType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiaohongshuWebV2ApiApi#fetchSearchNotesApiV1XiaohongshuWebV2FetchSearchNotesGet");
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
 **keywords** | **String**| 搜索关键词/Search keywords |
 **page** | **Integer**| 页码/Page number | [optional] [default to 1]
 **sortType** | **String**| 排序方式/Sort type | [optional] [default to &quot;general&quot;]
 **noteType** | **String**| 笔记类型/Note type | [optional] [default to &quot;0&quot;]

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


## fetchSearchNotesApiV1XiaohongshuWebV2FetchSearchNotesGet_0

> ResponseModel fetchSearchNotesApiV1XiaohongshuWebV2FetchSearchNotesGet_0(keywords, page, sortType, noteType)

获取搜索笔记/Fetch search notes

# [中文] ### 用途: - 获取搜索笔记 ### 参数: - keywords：搜索关键词 - sort_type：排序方式     - general：综合     - time_descending：最新     - popularity_descending：最热 - note_type: 笔记类型     - 0：全部     - 1：视频     - 2：图文 ### 返回: - 搜索笔记  # [English] ### Purpose: - Get search notes ### Parameters: - keywords: Search keywords - sort_type: Sort type     - general: General     - time_descending: Latest     - popularity_descending: Popular - note_type: Note type     - 0: All     - 1: Video     - 2: Note ### Return: - Search notes  # [示例/Example] keywords &#x3D; \&quot;口红\&quot; page &#x3D; 1 sort_type &#x3D; \&quot;general\&quot; note_type &#x3D; \&quot;1\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiaohongshuWebV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiaohongshuWebV2ApiApi apiInstance = new XiaohongshuWebV2ApiApi(defaultClient);
        String keywords = 口红; // String | 搜索关键词/Search keywords
        Integer page = 1; // Integer | 页码/Page number
        String sortType = "\"general\""; // String | 排序方式/Sort type
        String noteType = "\"0\""; // String | 笔记类型/Note type
        try {
            ResponseModel result = apiInstance.fetchSearchNotesApiV1XiaohongshuWebV2FetchSearchNotesGet_0(keywords, page, sortType, noteType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiaohongshuWebV2ApiApi#fetchSearchNotesApiV1XiaohongshuWebV2FetchSearchNotesGet_0");
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
 **keywords** | **String**| 搜索关键词/Search keywords |
 **page** | **Integer**| 页码/Page number | [optional] [default to 1]
 **sortType** | **String**| 排序方式/Sort type | [optional] [default to &quot;general&quot;]
 **noteType** | **String**| 笔记类型/Note type | [optional] [default to &quot;0&quot;]

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


## fetchSubCommentsApiV1XiaohongshuWebV2FetchSubCommentsGet

> ResponseModel fetchSubCommentsApiV1XiaohongshuWebV2FetchSubCommentsGet(noteId, commentId, cursor)

获取子评论/Fetch sub comments

# [中文] ### 用途: - 获取子评论 ### 参数: - note_id: 笔记ID - comment_id: 评论ID - cursor: 游标 ### 返回: - 子评论  # [English] ### Purpose: - Get sub comments ### Parameters: - note_id: Note ID - comment_id: Comment ID - cursor: Cursor ### Return: - Sub comments  # [示例/Example] note_id &#x3D; \&quot;673c894c0000000007033f92\&quot; comment_id &#x3D; \&quot;673ecdfc000000001503bf8b\&quot; cursor &#x3D; \&quot;\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiaohongshuWebV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiaohongshuWebV2ApiApi apiInstance = new XiaohongshuWebV2ApiApi(defaultClient);
        String noteId = 673c894c0000000007033f92; // String | 笔记ID/Note ID
        String commentId = 673ecdfc000000001503bf8b; // String | 评论ID/Comment ID
        String cursor = "\"\""; // String | 游标/Cursor
        try {
            ResponseModel result = apiInstance.fetchSubCommentsApiV1XiaohongshuWebV2FetchSubCommentsGet(noteId, commentId, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiaohongshuWebV2ApiApi#fetchSubCommentsApiV1XiaohongshuWebV2FetchSubCommentsGet");
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
 **noteId** | **String**| 笔记ID/Note ID |
 **commentId** | **String**| 评论ID/Comment ID |
 **cursor** | **String**| 游标/Cursor | [optional] [default to &quot;&quot;]

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


## fetchSubCommentsApiV1XiaohongshuWebV2FetchSubCommentsGet_0

> ResponseModel fetchSubCommentsApiV1XiaohongshuWebV2FetchSubCommentsGet_0(noteId, commentId, cursor)

获取子评论/Fetch sub comments

# [中文] ### 用途: - 获取子评论 ### 参数: - note_id: 笔记ID - comment_id: 评论ID - cursor: 游标 ### 返回: - 子评论  # [English] ### Purpose: - Get sub comments ### Parameters: - note_id: Note ID - comment_id: Comment ID - cursor: Cursor ### Return: - Sub comments  # [示例/Example] note_id &#x3D; \&quot;673c894c0000000007033f92\&quot; comment_id &#x3D; \&quot;673ecdfc000000001503bf8b\&quot; cursor &#x3D; \&quot;\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiaohongshuWebV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiaohongshuWebV2ApiApi apiInstance = new XiaohongshuWebV2ApiApi(defaultClient);
        String noteId = 673c894c0000000007033f92; // String | 笔记ID/Note ID
        String commentId = 673ecdfc000000001503bf8b; // String | 评论ID/Comment ID
        String cursor = "\"\""; // String | 游标/Cursor
        try {
            ResponseModel result = apiInstance.fetchSubCommentsApiV1XiaohongshuWebV2FetchSubCommentsGet_0(noteId, commentId, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiaohongshuWebV2ApiApi#fetchSubCommentsApiV1XiaohongshuWebV2FetchSubCommentsGet_0");
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
 **noteId** | **String**| 笔记ID/Note ID |
 **commentId** | **String**| 评论ID/Comment ID |
 **cursor** | **String**| 游标/Cursor | [optional] [default to &quot;&quot;]

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


## fetchUserInfoApiV1XiaohongshuWebV2FetchUserInfoGet

> ResponseModel fetchUserInfoApiV1XiaohongshuWebV2FetchUserInfoGet(userId)

获取用户信息/Fetch user info

# [中文] ### 用途: - 获取用户信息 ### 参数: - user_id: 用户ID ### 返回: - 用户信息  # [English] ### Purpose: - Get user info ### Parameters: - user_id: User ID ### Return: - User info  # [示例/Example] user_id &#x3D; \&quot;5e3a8ee700000000010070c6\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiaohongshuWebV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiaohongshuWebV2ApiApi apiInstance = new XiaohongshuWebV2ApiApi(defaultClient);
        String userId = 5e3a8ee700000000010070c6; // String | 用户ID/User ID
        try {
            ResponseModel result = apiInstance.fetchUserInfoApiV1XiaohongshuWebV2FetchUserInfoGet(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiaohongshuWebV2ApiApi#fetchUserInfoApiV1XiaohongshuWebV2FetchUserInfoGet");
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


## fetchUserInfoApiV1XiaohongshuWebV2FetchUserInfoGet_0

> ResponseModel fetchUserInfoApiV1XiaohongshuWebV2FetchUserInfoGet_0(userId)

获取用户信息/Fetch user info

# [中文] ### 用途: - 获取用户信息 ### 参数: - user_id: 用户ID ### 返回: - 用户信息  # [English] ### Purpose: - Get user info ### Parameters: - user_id: User ID ### Return: - User info  # [示例/Example] user_id &#x3D; \&quot;5e3a8ee700000000010070c6\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.XiaohongshuWebV2ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        XiaohongshuWebV2ApiApi apiInstance = new XiaohongshuWebV2ApiApi(defaultClient);
        String userId = 5e3a8ee700000000010070c6; // String | 用户ID/User ID
        try {
            ResponseModel result = apiInstance.fetchUserInfoApiV1XiaohongshuWebV2FetchUserInfoGet_0(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XiaohongshuWebV2ApiApi#fetchUserInfoApiV1XiaohongshuWebV2FetchUserInfoGet_0");
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

