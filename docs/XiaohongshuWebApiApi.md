# XiaohongshuWebApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGet**](XiaohongshuWebApiApi.md#getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGet) | **GET** /api/v1/xiaohongshu/web/get_note_comment_replies | 获取笔记评论回复/Get note comment replies
[**getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGet_0**](XiaohongshuWebApiApi.md#getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGet_0) | **GET** /api/v1/xiaohongshu/web/get_note_comment_replies | 获取笔记评论回复/Get note comment replies
[**getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGet**](XiaohongshuWebApiApi.md#getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGet) | **GET** /api/v1/xiaohongshu/web/get_note_comments | 获取笔记评论/Get note comments
[**getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGet_0**](XiaohongshuWebApiApi.md#getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGet_0) | **GET** /api/v1/xiaohongshu/web/get_note_comments | 获取笔记评论/Get note comments
[**getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGet**](XiaohongshuWebApiApi.md#getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGet) | **GET** /api/v1/xiaohongshu/web/get_note_info | 获取笔记信息/Get note info
[**getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGet_0**](XiaohongshuWebApiApi.md#getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGet_0) | **GET** /api/v1/xiaohongshu/web/get_note_info | 获取笔记信息/Get note info
[**getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2Get**](XiaohongshuWebApiApi.md#getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2Get) | **GET** /api/v1/xiaohongshu/web/get_note_info_v2 | 获取笔记信息/Get note info
[**getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2Get_0**](XiaohongshuWebApiApi.md#getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2Get_0) | **GET** /api/v1/xiaohongshu/web/get_note_info_v2 | 获取笔记信息/Get note info
[**getUserInfoApiV1XiaohongshuWebGetUserInfoGet**](XiaohongshuWebApiApi.md#getUserInfoApiV1XiaohongshuWebGetUserInfoGet) | **GET** /api/v1/xiaohongshu/web/get_user_info | 获取用户信息/Get user info
[**getUserInfoApiV1XiaohongshuWebGetUserInfoGet_0**](XiaohongshuWebApiApi.md#getUserInfoApiV1XiaohongshuWebGetUserInfoGet_0) | **GET** /api/v1/xiaohongshu/web/get_user_info | 获取用户信息/Get user info
[**getUserNotesApiV1XiaohongshuWebGetUserNotesGet**](XiaohongshuWebApiApi.md#getUserNotesApiV1XiaohongshuWebGetUserNotesGet) | **GET** /api/v1/xiaohongshu/web/get_user_notes | 获取用户的笔记/Get user notes
[**getUserNotesApiV1XiaohongshuWebGetUserNotesGet_0**](XiaohongshuWebApiApi.md#getUserNotesApiV1XiaohongshuWebGetUserNotesGet_0) | **GET** /api/v1/xiaohongshu/web/get_user_notes | 获取用户的笔记/Get user notes
[**searchNotesApiV1XiaohongshuWebSearchNotesGet**](XiaohongshuWebApiApi.md#searchNotesApiV1XiaohongshuWebSearchNotesGet) | **GET** /api/v1/xiaohongshu/web/search_notes | 搜索笔记/Search notes
[**searchNotesApiV1XiaohongshuWebSearchNotesGet_0**](XiaohongshuWebApiApi.md#searchNotesApiV1XiaohongshuWebSearchNotesGet_0) | **GET** /api/v1/xiaohongshu/web/search_notes | 搜索笔记/Search notes
[**searchUsersApiV1XiaohongshuWebSearchUsersGet**](XiaohongshuWebApiApi.md#searchUsersApiV1XiaohongshuWebSearchUsersGet) | **GET** /api/v1/xiaohongshu/web/search_users | 搜索用户/Search users
[**searchUsersApiV1XiaohongshuWebSearchUsersGet_0**](XiaohongshuWebApiApi.md#searchUsersApiV1XiaohongshuWebSearchUsersGet_0) | **GET** /api/v1/xiaohongshu/web/search_users | 搜索用户/Search users


<a name="getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGet"></a>
# **getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGet**
> ResponseModel getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGet(noteId, commentId, lastCursor)

获取笔记评论回复/Get note comment replies

# [中文] ### 用途: - 获取笔记评论回复 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 - comment_id: 评论ID - lastCursor: 第一次请求时为空，之后请求时使用上一次请求响应中返回的游标 ### 返回: - 笔记评论回复列表  # [English] ### Purpose: - Get note comment replies ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. - comment_id: Comment ID - lastCursor: Last cursor, empty for the first request, use the cursor returned in the last response for subsequent requests ### Return: - Note comment replies list  # [示例/Example] note_id&#x3D;\&quot;6683b283000000001f0052bf\&quot; comment_id&#x3D;\&quot;6683ec5b000000000303b91a\&quot; lastCursor&#x3D;None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XiaohongshuWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    XiaohongshuWebApiApi apiInstance = new XiaohongshuWebApiApi(defaultClient);
    String noteId = 6683b283000000001f0052bf; // String | 笔记ID/Note ID
    String commentId = 6683ec5b000000000303b91a; // String | 评论ID/Comment ID
    String lastCursor = "lastCursor_example"; // String | 上一页的游标/Last cursor
    try {
      ResponseModel result = apiInstance.getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGet(noteId, commentId, lastCursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XiaohongshuWebApiApi#getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGet");
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
 **lastCursor** | **String**| 上一页的游标/Last cursor | [optional]

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

<a name="getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGet_0"></a>
# **getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGet_0**
> ResponseModel getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGet_0(noteId, commentId, lastCursor)

获取笔记评论回复/Get note comment replies

# [中文] ### 用途: - 获取笔记评论回复 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 - comment_id: 评论ID - lastCursor: 第一次请求时为空，之后请求时使用上一次请求响应中返回的游标 ### 返回: - 笔记评论回复列表  # [English] ### Purpose: - Get note comment replies ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. - comment_id: Comment ID - lastCursor: Last cursor, empty for the first request, use the cursor returned in the last response for subsequent requests ### Return: - Note comment replies list  # [示例/Example] note_id&#x3D;\&quot;6683b283000000001f0052bf\&quot; comment_id&#x3D;\&quot;6683ec5b000000000303b91a\&quot; lastCursor&#x3D;None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XiaohongshuWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    XiaohongshuWebApiApi apiInstance = new XiaohongshuWebApiApi(defaultClient);
    String noteId = 6683b283000000001f0052bf; // String | 笔记ID/Note ID
    String commentId = 6683ec5b000000000303b91a; // String | 评论ID/Comment ID
    String lastCursor = "lastCursor_example"; // String | 上一页的游标/Last cursor
    try {
      ResponseModel result = apiInstance.getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGet_0(noteId, commentId, lastCursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XiaohongshuWebApiApi#getNoteCommentRepliesApiV1XiaohongshuWebGetNoteCommentRepliesGet_0");
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
 **lastCursor** | **String**| 上一页的游标/Last cursor | [optional]

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

<a name="getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGet"></a>
# **getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGet**
> ResponseModel getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGet(noteId, lastCursor)

获取笔记评论/Get note comments

# [中文] ### 用途: - 获取笔记评论 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 - lastCursor: 第一次请求时为空，之后请求时使用上一次请求响应中返回的游标 ### 返回: - 笔记评论列表  # [English] ### Purpose: - Get note comments ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. - lastCursor: Last cursor, empty for the first request, use the cursor returned in the last response for subsequent requests ### Return: - Note comments list  # [示例/Example] note_id&#x3D;\&quot;6683b283000000001f0052bf\&quot; lastCursor&#x3D;None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XiaohongshuWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    XiaohongshuWebApiApi apiInstance = new XiaohongshuWebApiApi(defaultClient);
    String noteId = 6683b283000000001f0052bf; // String | 笔记ID/Note ID
    String lastCursor = "lastCursor_example"; // String | 上一页的游标/Last cursor
    try {
      ResponseModel result = apiInstance.getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGet(noteId, lastCursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XiaohongshuWebApiApi#getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGet");
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
 **lastCursor** | **String**| 上一页的游标/Last cursor | [optional]

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

<a name="getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGet_0"></a>
# **getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGet_0**
> ResponseModel getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGet_0(noteId, lastCursor)

获取笔记评论/Get note comments

# [中文] ### 用途: - 获取笔记评论 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 - lastCursor: 第一次请求时为空，之后请求时使用上一次请求响应中返回的游标 ### 返回: - 笔记评论列表  # [English] ### Purpose: - Get note comments ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. - lastCursor: Last cursor, empty for the first request, use the cursor returned in the last response for subsequent requests ### Return: - Note comments list  # [示例/Example] note_id&#x3D;\&quot;6683b283000000001f0052bf\&quot; lastCursor&#x3D;None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XiaohongshuWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    XiaohongshuWebApiApi apiInstance = new XiaohongshuWebApiApi(defaultClient);
    String noteId = 6683b283000000001f0052bf; // String | 笔记ID/Note ID
    String lastCursor = "lastCursor_example"; // String | 上一页的游标/Last cursor
    try {
      ResponseModel result = apiInstance.getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGet_0(noteId, lastCursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XiaohongshuWebApiApi#getNoteCommentsApiV1XiaohongshuWebGetNoteCommentsGet_0");
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
 **lastCursor** | **String**| 上一页的游标/Last cursor | [optional]

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

<a name="getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGet"></a>
# **getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGet**
> ResponseModel getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGet(noteId)

获取笔记信息/Get note info

# [中文] ### 用途: - 获取笔记信息V1 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 ### 返回: - 笔记信息  # [English] ### Purpose: - Get note info V1 ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. ### Return: - Note info  # [示例/Example] note_id&#x3D;\&quot;665f95200000000006005624\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XiaohongshuWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    XiaohongshuWebApiApi apiInstance = new XiaohongshuWebApiApi(defaultClient);
    String noteId = 665f95200000000006005624; // String | 笔记ID/Note ID
    try {
      ResponseModel result = apiInstance.getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGet(noteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XiaohongshuWebApiApi#getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGet");
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
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

<a name="getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGet_0"></a>
# **getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGet_0**
> ResponseModel getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGet_0(noteId)

获取笔记信息/Get note info

# [中文] ### 用途: - 获取笔记信息V1 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 ### 返回: - 笔记信息  # [English] ### Purpose: - Get note info V1 ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. ### Return: - Note info  # [示例/Example] note_id&#x3D;\&quot;665f95200000000006005624\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XiaohongshuWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    XiaohongshuWebApiApi apiInstance = new XiaohongshuWebApiApi(defaultClient);
    String noteId = 665f95200000000006005624; // String | 笔记ID/Note ID
    try {
      ResponseModel result = apiInstance.getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGet_0(noteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XiaohongshuWebApiApi#getNoteInfoV1ApiV1XiaohongshuWebGetNoteInfoGet_0");
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
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

<a name="getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2Get"></a>
# **getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2Get**
> ResponseModel getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2Get(noteId)

获取笔记信息/Get note info

# [中文] ### 用途: - 获取笔记信息V2 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 ### 返回: - 笔记信息  # [English] ### Purpose: - Get note info V2 ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. ### Return: - Note info  # [示例/Example] note_id&#x3D;\&quot;665f95200000000006005624\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XiaohongshuWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    XiaohongshuWebApiApi apiInstance = new XiaohongshuWebApiApi(defaultClient);
    String noteId = 665f95200000000006005624; // String | 笔记ID/Note ID
    try {
      ResponseModel result = apiInstance.getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2Get(noteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XiaohongshuWebApiApi#getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2Get");
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
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

<a name="getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2Get_0"></a>
# **getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2Get_0**
> ResponseModel getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2Get_0(noteId)

获取笔记信息/Get note info

# [中文] ### 用途: - 获取笔记信息V2 ### 参数: - note_id: 笔记ID，可以从小红书的分享链接中获取 ### 返回: - 笔记信息  # [English] ### Purpose: - Get note info V2 ### Parameters: - note_id: Note ID, can be obtained from the sharing link of Xiaohongshu website. ### Return: - Note info  # [示例/Example] note_id&#x3D;\&quot;665f95200000000006005624\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XiaohongshuWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    XiaohongshuWebApiApi apiInstance = new XiaohongshuWebApiApi(defaultClient);
    String noteId = 665f95200000000006005624; // String | 笔记ID/Note ID
    try {
      ResponseModel result = apiInstance.getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2Get_0(noteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XiaohongshuWebApiApi#getNoteInfoV2ApiV1XiaohongshuWebGetNoteInfoV2Get_0");
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
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

<a name="getUserInfoApiV1XiaohongshuWebGetUserInfoGet"></a>
# **getUserInfoApiV1XiaohongshuWebGetUserInfoGet**
> ResponseModel getUserInfoApiV1XiaohongshuWebGetUserInfoGet(userId)

获取用户信息/Get user info

# [中文] ### 用途: - 获取用户信息 ### 参数: - user_id: 用户ID，可以从小红书的分享链接中获取 ### 返回: - 用户信息  # [English] ### Purpose: - Get user info ### Parameters: - user_id: User ID, can be obtained from the sharing link of Xiaohongshu website. ### Return: - User info  # [示例/Example] user_id&#x3D;\&quot;5f4a10070000000001006fc7\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XiaohongshuWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    XiaohongshuWebApiApi apiInstance = new XiaohongshuWebApiApi(defaultClient);
    String userId = 5f4a10070000000001006fc7; // String | 用户ID/User ID
    try {
      ResponseModel result = apiInstance.getUserInfoApiV1XiaohongshuWebGetUserInfoGet(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XiaohongshuWebApiApi#getUserInfoApiV1XiaohongshuWebGetUserInfoGet");
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
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

<a name="getUserInfoApiV1XiaohongshuWebGetUserInfoGet_0"></a>
# **getUserInfoApiV1XiaohongshuWebGetUserInfoGet_0**
> ResponseModel getUserInfoApiV1XiaohongshuWebGetUserInfoGet_0(userId)

获取用户信息/Get user info

# [中文] ### 用途: - 获取用户信息 ### 参数: - user_id: 用户ID，可以从小红书的分享链接中获取 ### 返回: - 用户信息  # [English] ### Purpose: - Get user info ### Parameters: - user_id: User ID, can be obtained from the sharing link of Xiaohongshu website. ### Return: - User info  # [示例/Example] user_id&#x3D;\&quot;5f4a10070000000001006fc7\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XiaohongshuWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    XiaohongshuWebApiApi apiInstance = new XiaohongshuWebApiApi(defaultClient);
    String userId = 5f4a10070000000001006fc7; // String | 用户ID/User ID
    try {
      ResponseModel result = apiInstance.getUserInfoApiV1XiaohongshuWebGetUserInfoGet_0(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XiaohongshuWebApiApi#getUserInfoApiV1XiaohongshuWebGetUserInfoGet_0");
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
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

<a name="getUserNotesApiV1XiaohongshuWebGetUserNotesGet"></a>
# **getUserNotesApiV1XiaohongshuWebGetUserNotesGet**
> ResponseModel getUserNotesApiV1XiaohongshuWebGetUserNotesGet(userId, lastCursor)

获取用户的笔记/Get user notes

# [中文] ### 用途: - 获取用户的笔记 ### 参数: - user_id: 用户ID，可以从小红书的分享链接中获取 - lastCursor: 第一次请求时为空，之后请求时使用上一次请求响应中返回的最后一个NoteID     - 例如: \&quot;662908190000000001007366\&quot;     - JSON Path: $.data.data.notes.[-1].id ### 返回: - 用户的笔记列表  # [English] ### Purpose: - Get user notes ### Parameters: - user_id: User ID, can be obtained from the sharing link of Xiaohongshu website. - lastCursor: Last cursor, empty for the first request, use the last NoteID returned in the last response for subsequent requests     - Example: \&quot;662908190000000001007366\&quot;     - JSON Path: $.data.data.notes.[-1].id ### Return: - User notes list  # [示例/Example] user_id&#x3D;\&quot;5f4a10070000000001006fc7\&quot; lastCursor&#x3D;None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XiaohongshuWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    XiaohongshuWebApiApi apiInstance = new XiaohongshuWebApiApi(defaultClient);
    String userId = 5f4a10070000000001006fc7; // String | 用户ID/User ID
    String lastCursor = "lastCursor_example"; // String | 上一页的游标/Last cursor
    try {
      ResponseModel result = apiInstance.getUserNotesApiV1XiaohongshuWebGetUserNotesGet(userId, lastCursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XiaohongshuWebApiApi#getUserNotesApiV1XiaohongshuWebGetUserNotesGet");
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
 **lastCursor** | **String**| 上一页的游标/Last cursor | [optional]

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

<a name="getUserNotesApiV1XiaohongshuWebGetUserNotesGet_0"></a>
# **getUserNotesApiV1XiaohongshuWebGetUserNotesGet_0**
> ResponseModel getUserNotesApiV1XiaohongshuWebGetUserNotesGet_0(userId, lastCursor)

获取用户的笔记/Get user notes

# [中文] ### 用途: - 获取用户的笔记 ### 参数: - user_id: 用户ID，可以从小红书的分享链接中获取 - lastCursor: 第一次请求时为空，之后请求时使用上一次请求响应中返回的最后一个NoteID     - 例如: \&quot;662908190000000001007366\&quot;     - JSON Path: $.data.data.notes.[-1].id ### 返回: - 用户的笔记列表  # [English] ### Purpose: - Get user notes ### Parameters: - user_id: User ID, can be obtained from the sharing link of Xiaohongshu website. - lastCursor: Last cursor, empty for the first request, use the last NoteID returned in the last response for subsequent requests     - Example: \&quot;662908190000000001007366\&quot;     - JSON Path: $.data.data.notes.[-1].id ### Return: - User notes list  # [示例/Example] user_id&#x3D;\&quot;5f4a10070000000001006fc7\&quot; lastCursor&#x3D;None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XiaohongshuWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    XiaohongshuWebApiApi apiInstance = new XiaohongshuWebApiApi(defaultClient);
    String userId = 5f4a10070000000001006fc7; // String | 用户ID/User ID
    String lastCursor = "lastCursor_example"; // String | 上一页的游标/Last cursor
    try {
      ResponseModel result = apiInstance.getUserNotesApiV1XiaohongshuWebGetUserNotesGet_0(userId, lastCursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XiaohongshuWebApiApi#getUserNotesApiV1XiaohongshuWebGetUserNotesGet_0");
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
 **lastCursor** | **String**| 上一页的游标/Last cursor | [optional]

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

<a name="searchNotesApiV1XiaohongshuWebSearchNotesGet"></a>
# **searchNotesApiV1XiaohongshuWebSearchNotesGet**
> ResponseModel searchNotesApiV1XiaohongshuWebSearchNotesGet(keyword, page, sort, noteType)

搜索笔记/Search notes

# [中文] ### 用途: - 搜索笔记 ### 参数: - keyword: 搜索关键词 - page: 页码，默认为1 - sort: 排序方式     - 综合排序（默认参数）: general     - 最热排序: popularity_descending     - 最新排序: time_descending - noteType: 笔记类型     - 综合笔记（默认参数）: _0     - 视频笔记: _1     - 图文笔记: _2 ### 返回: - 笔记列表  # [English] ### Purpose: - Search notes ### Parameters: - keyword: Keyword - page: Page, default is 1 - sort: Sort     - General sort (default): general     - Popularity sort: popularity_descending     - Latest sort: time_descending - noteType: Note type     - General note (default): _0     - Video note: _1     - Image note: _2 ### Return: - Note list  # [示例/Example] keyword&#x3D;\&quot;美食\&quot; page&#x3D;1 sort&#x3D;\&quot;general\&quot; noteType&#x3D;\&quot;_0\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XiaohongshuWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    XiaohongshuWebApiApi apiInstance = new XiaohongshuWebApiApi(defaultClient);
    String keyword = 美食; // String | 搜索关键词/Keyword
    Integer page = 1; // Integer | 页码/Page
    String sort = general; // String | 排序方式/Sort
    String noteType = _0; // String | 笔记类型/Note type
    try {
      ResponseModel result = apiInstance.searchNotesApiV1XiaohongshuWebSearchNotesGet(keyword, page, sort, noteType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XiaohongshuWebApiApi#searchNotesApiV1XiaohongshuWebSearchNotesGet");
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
 **keyword** | **String**| 搜索关键词/Keyword |
 **page** | **Integer**| 页码/Page | [optional] [default to 1]
 **sort** | **String**| 排序方式/Sort | [optional] [default to &quot;general&quot;]
 **noteType** | **String**| 笔记类型/Note type | [optional] [default to &quot;_0&quot;]

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

<a name="searchNotesApiV1XiaohongshuWebSearchNotesGet_0"></a>
# **searchNotesApiV1XiaohongshuWebSearchNotesGet_0**
> ResponseModel searchNotesApiV1XiaohongshuWebSearchNotesGet_0(keyword, page, sort, noteType)

搜索笔记/Search notes

# [中文] ### 用途: - 搜索笔记 ### 参数: - keyword: 搜索关键词 - page: 页码，默认为1 - sort: 排序方式     - 综合排序（默认参数）: general     - 最热排序: popularity_descending     - 最新排序: time_descending - noteType: 笔记类型     - 综合笔记（默认参数）: _0     - 视频笔记: _1     - 图文笔记: _2 ### 返回: - 笔记列表  # [English] ### Purpose: - Search notes ### Parameters: - keyword: Keyword - page: Page, default is 1 - sort: Sort     - General sort (default): general     - Popularity sort: popularity_descending     - Latest sort: time_descending - noteType: Note type     - General note (default): _0     - Video note: _1     - Image note: _2 ### Return: - Note list  # [示例/Example] keyword&#x3D;\&quot;美食\&quot; page&#x3D;1 sort&#x3D;\&quot;general\&quot; noteType&#x3D;\&quot;_0\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XiaohongshuWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    XiaohongshuWebApiApi apiInstance = new XiaohongshuWebApiApi(defaultClient);
    String keyword = 美食; // String | 搜索关键词/Keyword
    Integer page = 1; // Integer | 页码/Page
    String sort = general; // String | 排序方式/Sort
    String noteType = _0; // String | 笔记类型/Note type
    try {
      ResponseModel result = apiInstance.searchNotesApiV1XiaohongshuWebSearchNotesGet_0(keyword, page, sort, noteType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XiaohongshuWebApiApi#searchNotesApiV1XiaohongshuWebSearchNotesGet_0");
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
 **keyword** | **String**| 搜索关键词/Keyword |
 **page** | **Integer**| 页码/Page | [optional] [default to 1]
 **sort** | **String**| 排序方式/Sort | [optional] [default to &quot;general&quot;]
 **noteType** | **String**| 笔记类型/Note type | [optional] [default to &quot;_0&quot;]

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

<a name="searchUsersApiV1XiaohongshuWebSearchUsersGet"></a>
# **searchUsersApiV1XiaohongshuWebSearchUsersGet**
> ResponseModel searchUsersApiV1XiaohongshuWebSearchUsersGet(keyword, page)

搜索用户/Search users

# [中文] ### 用途: - 搜索用户 ### 参数: - keyword: 搜索关键词 - page: 页码，默认为1 ### 返回: - 用户列表  # [English] ### Purpose: - Search users ### Parameters: - keyword: Keyword - page: Page, default is 1 ### Return: - User list  # [示例/Example] keyword&#x3D;\&quot;美食\&quot; page&#x3D;1

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XiaohongshuWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    XiaohongshuWebApiApi apiInstance = new XiaohongshuWebApiApi(defaultClient);
    String keyword = 美食; // String | 搜索关键词/Keyword
    Integer page = 1; // Integer | 页码/Page
    try {
      ResponseModel result = apiInstance.searchUsersApiV1XiaohongshuWebSearchUsersGet(keyword, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XiaohongshuWebApiApi#searchUsersApiV1XiaohongshuWebSearchUsersGet");
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
 **keyword** | **String**| 搜索关键词/Keyword |
 **page** | **Integer**| 页码/Page | [optional] [default to 1]

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

<a name="searchUsersApiV1XiaohongshuWebSearchUsersGet_0"></a>
# **searchUsersApiV1XiaohongshuWebSearchUsersGet_0**
> ResponseModel searchUsersApiV1XiaohongshuWebSearchUsersGet_0(keyword, page)

搜索用户/Search users

# [中文] ### 用途: - 搜索用户 ### 参数: - keyword: 搜索关键词 - page: 页码，默认为1 ### 返回: - 用户列表  # [English] ### Purpose: - Search users ### Parameters: - keyword: Keyword - page: Page, default is 1 ### Return: - User list  # [示例/Example] keyword&#x3D;\&quot;美食\&quot; page&#x3D;1

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XiaohongshuWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    XiaohongshuWebApiApi apiInstance = new XiaohongshuWebApiApi(defaultClient);
    String keyword = 美食; // String | 搜索关键词/Keyword
    Integer page = 1; // Integer | 页码/Page
    try {
      ResponseModel result = apiInstance.searchUsersApiV1XiaohongshuWebSearchUsersGet_0(keyword, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XiaohongshuWebApiApi#searchUsersApiV1XiaohongshuWebSearchUsersGet_0");
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
 **keyword** | **String**| 搜索关键词/Keyword |
 **page** | **Integer**| 页码/Page | [optional] [default to 1]

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

