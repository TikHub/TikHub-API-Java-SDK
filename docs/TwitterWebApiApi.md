# TwitterWebApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchPostCommentsApiV1TwitterWebFetchPostCommentsGet**](TwitterWebApiApi.md#fetchPostCommentsApiV1TwitterWebFetchPostCommentsGet) | **GET** /api/v1/twitter/web/fetch_post_comments | 获取评论/Get comments
[**fetchPostCommentsApiV1TwitterWebFetchPostCommentsGet_0**](TwitterWebApiApi.md#fetchPostCommentsApiV1TwitterWebFetchPostCommentsGet_0) | **GET** /api/v1/twitter/web/fetch_post_comments | 获取评论/Get comments
[**fetchSearchTimelineApiV1TwitterWebFetchSearchTimelineGet**](TwitterWebApiApi.md#fetchSearchTimelineApiV1TwitterWebFetchSearchTimelineGet) | **GET** /api/v1/twitter/web/fetch_search_timeline | 搜索/Search
[**fetchSearchTimelineApiV1TwitterWebFetchSearchTimelineGet_0**](TwitterWebApiApi.md#fetchSearchTimelineApiV1TwitterWebFetchSearchTimelineGet_0) | **GET** /api/v1/twitter/web/fetch_search_timeline | 搜索/Search
[**fetchTweetDetailApiV1TwitterWebFetchTweetDetailGet**](TwitterWebApiApi.md#fetchTweetDetailApiV1TwitterWebFetchTweetDetailGet) | **GET** /api/v1/twitter/web/fetch_tweet_detail | 获取单个推文数据/Get single tweet data
[**fetchTweetDetailApiV1TwitterWebFetchTweetDetailGet_0**](TwitterWebApiApi.md#fetchTweetDetailApiV1TwitterWebFetchTweetDetailGet_0) | **GET** /api/v1/twitter/web/fetch_tweet_detail | 获取单个推文数据/Get single tweet data
[**fetchUserHighlightsTweetsApiV1TwitterWebFetchUserHighlightsTweetsGet**](TwitterWebApiApi.md#fetchUserHighlightsTweetsApiV1TwitterWebFetchUserHighlightsTweetsGet) | **GET** /api/v1/twitter/web/fetch_user_highlights_tweets | 获取用户高光推文/Get user highlights tweets
[**fetchUserHighlightsTweetsApiV1TwitterWebFetchUserHighlightsTweetsGet_0**](TwitterWebApiApi.md#fetchUserHighlightsTweetsApiV1TwitterWebFetchUserHighlightsTweetsGet_0) | **GET** /api/v1/twitter/web/fetch_user_highlights_tweets | 获取用户高光推文/Get user highlights tweets
[**fetchUserMediaApiV1TwitterWebFetchUserMediaGet**](TwitterWebApiApi.md#fetchUserMediaApiV1TwitterWebFetchUserMediaGet) | **GET** /api/v1/twitter/web/fetch_user_media | 获取用户媒体/Get user media
[**fetchUserMediaApiV1TwitterWebFetchUserMediaGet_0**](TwitterWebApiApi.md#fetchUserMediaApiV1TwitterWebFetchUserMediaGet_0) | **GET** /api/v1/twitter/web/fetch_user_media | 获取用户媒体/Get user media
[**fetchUserPostTweetApiV1TwitterWebFetchUserPostTweetGet**](TwitterWebApiApi.md#fetchUserPostTweetApiV1TwitterWebFetchUserPostTweetGet) | **GET** /api/v1/twitter/web/fetch_user_post_tweet | 获取用户发帖/Get user post
[**fetchUserPostTweetApiV1TwitterWebFetchUserPostTweetGet_0**](TwitterWebApiApi.md#fetchUserPostTweetApiV1TwitterWebFetchUserPostTweetGet_0) | **GET** /api/v1/twitter/web/fetch_user_post_tweet | 获取用户发帖/Get user post
[**fetchUserProfileApiV1TwitterWebFetchUserProfileGet**](TwitterWebApiApi.md#fetchUserProfileApiV1TwitterWebFetchUserProfileGet) | **GET** /api/v1/twitter/web/fetch_user_profile | 获取用户资料/Get user profile
[**fetchUserProfileApiV1TwitterWebFetchUserProfileGet_0**](TwitterWebApiApi.md#fetchUserProfileApiV1TwitterWebFetchUserProfileGet_0) | **GET** /api/v1/twitter/web/fetch_user_profile | 获取用户资料/Get user profile
[**fetchUserTweetRepliesApiV1TwitterWebFetchUserTweetRepliesGet**](TwitterWebApiApi.md#fetchUserTweetRepliesApiV1TwitterWebFetchUserTweetRepliesGet) | **GET** /api/v1/twitter/web/fetch_user_tweet_replies | 获取用户推文回复/Get user tweet replies
[**fetchUserTweetRepliesApiV1TwitterWebFetchUserTweetRepliesGet_0**](TwitterWebApiApi.md#fetchUserTweetRepliesApiV1TwitterWebFetchUserTweetRepliesGet_0) | **GET** /api/v1/twitter/web/fetch_user_tweet_replies | 获取用户推文回复/Get user tweet replies


<a name="fetchPostCommentsApiV1TwitterWebFetchPostCommentsGet"></a>
# **fetchPostCommentsApiV1TwitterWebFetchPostCommentsGet**
> ResponseModel fetchPostCommentsApiV1TwitterWebFetchPostCommentsGet(tweetId, rankingModel, cursor)

获取评论/Get comments

# [中文] ### 用途: - 获取推文下的评论 ### 参数: - tweetId: 推文ID - rankingModel: 排序模式，默认为Relevance，其他可选值为Latest，Likes - cursor: 游标，默认为None，用于翻页，后续从上一次请求的返回结果中获取     - JSONPath: $.data.data.threaded_conversation_with_injections_v2.instructions.[0].entries.[-1].content.itemContent.value ### 返回: - 评论  # [English] ### Purpose: - Get comments under the tweet ### Parameters: - tweetId: Tweet ID - rankingModel: Sorting mode, default is Relevance, other optional values are Latest, Likes - cursor: Cursor, default is None, used for paging, obtained from the last request     - JSONPath: $.data.data.threaded_conversation_with_injections_v2.instructions.[0].entries.[-1].content.itemContent.value ### Return: - Comments  # [示例/Example] tweetId &#x3D; \&quot;1835124037934367098\&quot; rankingModel &#x3D; \&quot;Relevance\&quot; cursor &#x3D; None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    TwitterWebApiApi apiInstance = new TwitterWebApiApi(defaultClient);
    String tweetId = 1835124037934367098; // String | 推文ID/Tweet ID
    String rankingModel = Relevance; // String | 排序模式/Sorting mode
    String cursor = "cursor_example"; // String | 游标/Cursor
    try {
      ResponseModel result = apiInstance.fetchPostCommentsApiV1TwitterWebFetchPostCommentsGet(tweetId, rankingModel, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwitterWebApiApi#fetchPostCommentsApiV1TwitterWebFetchPostCommentsGet");
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
 **tweetId** | **String**| 推文ID/Tweet ID |
 **rankingModel** | **String**| 排序模式/Sorting mode | [optional] [default to &quot;Relevance&quot;]
 **cursor** | **String**| 游标/Cursor | [optional]

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

<a name="fetchPostCommentsApiV1TwitterWebFetchPostCommentsGet_0"></a>
# **fetchPostCommentsApiV1TwitterWebFetchPostCommentsGet_0**
> ResponseModel fetchPostCommentsApiV1TwitterWebFetchPostCommentsGet_0(tweetId, rankingModel, cursor)

获取评论/Get comments

# [中文] ### 用途: - 获取推文下的评论 ### 参数: - tweetId: 推文ID - rankingModel: 排序模式，默认为Relevance，其他可选值为Latest，Likes - cursor: 游标，默认为None，用于翻页，后续从上一次请求的返回结果中获取     - JSONPath: $.data.data.threaded_conversation_with_injections_v2.instructions.[0].entries.[-1].content.itemContent.value ### 返回: - 评论  # [English] ### Purpose: - Get comments under the tweet ### Parameters: - tweetId: Tweet ID - rankingModel: Sorting mode, default is Relevance, other optional values are Latest, Likes - cursor: Cursor, default is None, used for paging, obtained from the last request     - JSONPath: $.data.data.threaded_conversation_with_injections_v2.instructions.[0].entries.[-1].content.itemContent.value ### Return: - Comments  # [示例/Example] tweetId &#x3D; \&quot;1835124037934367098\&quot; rankingModel &#x3D; \&quot;Relevance\&quot; cursor &#x3D; None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    TwitterWebApiApi apiInstance = new TwitterWebApiApi(defaultClient);
    String tweetId = 1835124037934367098; // String | 推文ID/Tweet ID
    String rankingModel = Relevance; // String | 排序模式/Sorting mode
    String cursor = "cursor_example"; // String | 游标/Cursor
    try {
      ResponseModel result = apiInstance.fetchPostCommentsApiV1TwitterWebFetchPostCommentsGet_0(tweetId, rankingModel, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwitterWebApiApi#fetchPostCommentsApiV1TwitterWebFetchPostCommentsGet_0");
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
 **tweetId** | **String**| 推文ID/Tweet ID |
 **rankingModel** | **String**| 排序模式/Sorting mode | [optional] [default to &quot;Relevance&quot;]
 **cursor** | **String**| 游标/Cursor | [optional]

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

<a name="fetchSearchTimelineApiV1TwitterWebFetchSearchTimelineGet"></a>
# **fetchSearchTimelineApiV1TwitterWebFetchSearchTimelineGet**
> ResponseModel fetchSearchTimelineApiV1TwitterWebFetchSearchTimelineGet(rawQuery, count, product, cursor)

搜索/Search

# [中文] ### 用途: - 搜索 ### 参数: - rawQuery: 搜索关键字 - count: 数量，默认为20 - product: 产品，默认为Top，其他可选值为Latest，People，Media，Lists - cursor: 游标，默认为None，用于翻页，后续从上一次请求的返回结果中的最后一个item中获取     - JSONPath: $.data.data.search_by_raw_query.search_timeline.timeline.instructions.[0].entries.[-1].content.value ### 返回: - 搜索结果  # [English] ### Purpose: - Search ### Parameters: - rawQuery: Search keyword - count: Count, default is 20 - product: Product, default is Top, other optional values are Latest, People, Media, Lists - cursor: Cursor, default is None, used for paging, obtained from the last item in the last request     - JSONPath: $.data.search_by_raw_query.search_timeline.timeline.instructions.[0].entries.[-1].content.value ### Return: - Search results  # [示例/Example] rawQuery &#x3D; \&quot;Elon Musk\&quot; count &#x3D; 20 product &#x3D; \&quot;Top\&quot; cursor &#x3D; None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    TwitterWebApiApi apiInstance = new TwitterWebApiApi(defaultClient);
    String rawQuery = Elon Musk; // String | 搜索关键字/Search Keyword
    Integer count = 20; // Integer | 数量/Count
    String product = Top; // String | 产品/Product
    String cursor = "cursor_example"; // String | 游标/Cursor
    try {
      ResponseModel result = apiInstance.fetchSearchTimelineApiV1TwitterWebFetchSearchTimelineGet(rawQuery, count, product, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwitterWebApiApi#fetchSearchTimelineApiV1TwitterWebFetchSearchTimelineGet");
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
 **rawQuery** | **String**| 搜索关键字/Search Keyword |
 **count** | **Integer**| 数量/Count | [optional] [default to 20]
 **product** | **String**| 产品/Product | [optional] [default to &quot;Top&quot;]
 **cursor** | **String**| 游标/Cursor | [optional]

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

<a name="fetchSearchTimelineApiV1TwitterWebFetchSearchTimelineGet_0"></a>
# **fetchSearchTimelineApiV1TwitterWebFetchSearchTimelineGet_0**
> ResponseModel fetchSearchTimelineApiV1TwitterWebFetchSearchTimelineGet_0(rawQuery, count, product, cursor)

搜索/Search

# [中文] ### 用途: - 搜索 ### 参数: - rawQuery: 搜索关键字 - count: 数量，默认为20 - product: 产品，默认为Top，其他可选值为Latest，People，Media，Lists - cursor: 游标，默认为None，用于翻页，后续从上一次请求的返回结果中的最后一个item中获取     - JSONPath: $.data.data.search_by_raw_query.search_timeline.timeline.instructions.[0].entries.[-1].content.value ### 返回: - 搜索结果  # [English] ### Purpose: - Search ### Parameters: - rawQuery: Search keyword - count: Count, default is 20 - product: Product, default is Top, other optional values are Latest, People, Media, Lists - cursor: Cursor, default is None, used for paging, obtained from the last item in the last request     - JSONPath: $.data.search_by_raw_query.search_timeline.timeline.instructions.[0].entries.[-1].content.value ### Return: - Search results  # [示例/Example] rawQuery &#x3D; \&quot;Elon Musk\&quot; count &#x3D; 20 product &#x3D; \&quot;Top\&quot; cursor &#x3D; None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    TwitterWebApiApi apiInstance = new TwitterWebApiApi(defaultClient);
    String rawQuery = Elon Musk; // String | 搜索关键字/Search Keyword
    Integer count = 20; // Integer | 数量/Count
    String product = Top; // String | 产品/Product
    String cursor = "cursor_example"; // String | 游标/Cursor
    try {
      ResponseModel result = apiInstance.fetchSearchTimelineApiV1TwitterWebFetchSearchTimelineGet_0(rawQuery, count, product, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwitterWebApiApi#fetchSearchTimelineApiV1TwitterWebFetchSearchTimelineGet_0");
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
 **rawQuery** | **String**| 搜索关键字/Search Keyword |
 **count** | **Integer**| 数量/Count | [optional] [default to 20]
 **product** | **String**| 产品/Product | [optional] [default to &quot;Top&quot;]
 **cursor** | **String**| 游标/Cursor | [optional]

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

<a name="fetchTweetDetailApiV1TwitterWebFetchTweetDetailGet"></a>
# **fetchTweetDetailApiV1TwitterWebFetchTweetDetailGet**
> ResponseModel fetchTweetDetailApiV1TwitterWebFetchTweetDetailGet(focalTweetId)

获取单个推文数据/Get single tweet data

# [中文] ### 用途: - 获取单个推文数据 ### 参数: - focalTweetId: 推文ID，可以从推文链接中获取。例如：https://x.com/elonmusk/status/1808168603721650364 中的 1808168603721650364。 ### 返回: - 推文数据  # [English] ### Purpose: - Get single tweet data ### Parameters: - focalTweetId: Tweet ID, can be obtained from the tweet link. For example: 1808168603721650364 in https://x.com/elonmusk/status/1808168603721650364 ### Return: - Tweet data  # [示例/Example] focalTweetId &#x3D; \&quot;1808168603721650364\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    TwitterWebApiApi apiInstance = new TwitterWebApiApi(defaultClient);
    String focalTweetId = 1808168603721650364; // String | 推文ID/Tweet ID
    try {
      ResponseModel result = apiInstance.fetchTweetDetailApiV1TwitterWebFetchTweetDetailGet(focalTweetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwitterWebApiApi#fetchTweetDetailApiV1TwitterWebFetchTweetDetailGet");
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
 **focalTweetId** | **String**| 推文ID/Tweet ID |

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

<a name="fetchTweetDetailApiV1TwitterWebFetchTweetDetailGet_0"></a>
# **fetchTweetDetailApiV1TwitterWebFetchTweetDetailGet_0**
> ResponseModel fetchTweetDetailApiV1TwitterWebFetchTweetDetailGet_0(focalTweetId)

获取单个推文数据/Get single tweet data

# [中文] ### 用途: - 获取单个推文数据 ### 参数: - focalTweetId: 推文ID，可以从推文链接中获取。例如：https://x.com/elonmusk/status/1808168603721650364 中的 1808168603721650364。 ### 返回: - 推文数据  # [English] ### Purpose: - Get single tweet data ### Parameters: - focalTweetId: Tweet ID, can be obtained from the tweet link. For example: 1808168603721650364 in https://x.com/elonmusk/status/1808168603721650364 ### Return: - Tweet data  # [示例/Example] focalTweetId &#x3D; \&quot;1808168603721650364\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    TwitterWebApiApi apiInstance = new TwitterWebApiApi(defaultClient);
    String focalTweetId = 1808168603721650364; // String | 推文ID/Tweet ID
    try {
      ResponseModel result = apiInstance.fetchTweetDetailApiV1TwitterWebFetchTweetDetailGet_0(focalTweetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwitterWebApiApi#fetchTweetDetailApiV1TwitterWebFetchTweetDetailGet_0");
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
 **focalTweetId** | **String**| 推文ID/Tweet ID |

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

<a name="fetchUserHighlightsTweetsApiV1TwitterWebFetchUserHighlightsTweetsGet"></a>
# **fetchUserHighlightsTweetsApiV1TwitterWebFetchUserHighlightsTweetsGet**
> ResponseModel fetchUserHighlightsTweetsApiV1TwitterWebFetchUserHighlightsTweetsGet(userId, count, cursor)

获取用户高光推文/Get user highlights tweets

# [中文] ### 用途: - 获取用户高光推文 ### 参数: - userId: 用户ID - count: 数量，默认为20 - cursor: 游标，默认为None，用于翻页，后续从上一次请求的返回结果中获取     - JSONPath: $.data.data.user.result.timeline_v2.timeline.instructions.[1].entries.[-1].content.value ### 返回: - 用户高光推文  # [English] ### Purpose: - Get user highlights tweets ### Parameters: - userId: User ID - count: Count, default is 20 - cursor: Cursor, default is None, used for paging, obtained from the last request     - JSONPath: $.data.data.user.result.timeline_v2.timeline.instructions.[1].entries.[-1].content.value ### Return: - User highlights tweets  # [示例/Example] userId &#x3D; \&quot;44196397\&quot; count &#x3D; 20 cursor &#x3D; None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    TwitterWebApiApi apiInstance = new TwitterWebApiApi(defaultClient);
    String userId = 44196397; // String | 用户ID/User ID
    Integer count = 20; // Integer | 数量/Count
    String cursor = "cursor_example"; // String | 游标/Cursor
    try {
      ResponseModel result = apiInstance.fetchUserHighlightsTweetsApiV1TwitterWebFetchUserHighlightsTweetsGet(userId, count, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwitterWebApiApi#fetchUserHighlightsTweetsApiV1TwitterWebFetchUserHighlightsTweetsGet");
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
 **count** | **Integer**| 数量/Count | [optional] [default to 20]
 **cursor** | **String**| 游标/Cursor | [optional]

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

<a name="fetchUserHighlightsTweetsApiV1TwitterWebFetchUserHighlightsTweetsGet_0"></a>
# **fetchUserHighlightsTweetsApiV1TwitterWebFetchUserHighlightsTweetsGet_0**
> ResponseModel fetchUserHighlightsTweetsApiV1TwitterWebFetchUserHighlightsTweetsGet_0(userId, count, cursor)

获取用户高光推文/Get user highlights tweets

# [中文] ### 用途: - 获取用户高光推文 ### 参数: - userId: 用户ID - count: 数量，默认为20 - cursor: 游标，默认为None，用于翻页，后续从上一次请求的返回结果中获取     - JSONPath: $.data.data.user.result.timeline_v2.timeline.instructions.[1].entries.[-1].content.value ### 返回: - 用户高光推文  # [English] ### Purpose: - Get user highlights tweets ### Parameters: - userId: User ID - count: Count, default is 20 - cursor: Cursor, default is None, used for paging, obtained from the last request     - JSONPath: $.data.data.user.result.timeline_v2.timeline.instructions.[1].entries.[-1].content.value ### Return: - User highlights tweets  # [示例/Example] userId &#x3D; \&quot;44196397\&quot; count &#x3D; 20 cursor &#x3D; None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    TwitterWebApiApi apiInstance = new TwitterWebApiApi(defaultClient);
    String userId = 44196397; // String | 用户ID/User ID
    Integer count = 20; // Integer | 数量/Count
    String cursor = "cursor_example"; // String | 游标/Cursor
    try {
      ResponseModel result = apiInstance.fetchUserHighlightsTweetsApiV1TwitterWebFetchUserHighlightsTweetsGet_0(userId, count, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwitterWebApiApi#fetchUserHighlightsTweetsApiV1TwitterWebFetchUserHighlightsTweetsGet_0");
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
 **count** | **Integer**| 数量/Count | [optional] [default to 20]
 **cursor** | **String**| 游标/Cursor | [optional]

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

<a name="fetchUserMediaApiV1TwitterWebFetchUserMediaGet"></a>
# **fetchUserMediaApiV1TwitterWebFetchUserMediaGet**
> ResponseModel fetchUserMediaApiV1TwitterWebFetchUserMediaGet(userId, count, cursor)

获取用户媒体/Get user media

# [中文] ### 用途: - 获取用户媒体 ### 参数: - userId: 用户ID - count: 数量，默认为20 - cursor: 游标，默认为None，用于翻页，后续从上一次请求的返回结果中获取     - JSONPath: $.data.data.user.result.timeline_v2.timeline.instructions.[-1].entries.[-1].content.value ### 返回: - 用户媒体  # [English] ### Purpose: - Get user media ### Parameters: - userId: User ID - count: Count, default is 20 - cursor: Cursor, default is None, used for paging, obtained from the last request     - JSONPath: $.data.data.user.result.timeline_v2.timeline.instructions.[-1].entries.[-1].content.value ### Return: - User media  # [示例/Example] userId &#x3D; \&quot;44196397\&quot; count &#x3D; 20 cursor &#x3D; None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    TwitterWebApiApi apiInstance = new TwitterWebApiApi(defaultClient);
    String userId = 44196397; // String | 用户ID/User ID
    Integer count = 20; // Integer | 数量/Count
    String cursor = "cursor_example"; // String | 游标/Cursor
    try {
      ResponseModel result = apiInstance.fetchUserMediaApiV1TwitterWebFetchUserMediaGet(userId, count, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwitterWebApiApi#fetchUserMediaApiV1TwitterWebFetchUserMediaGet");
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
 **count** | **Integer**| 数量/Count | [optional] [default to 20]
 **cursor** | **String**| 游标/Cursor | [optional]

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

<a name="fetchUserMediaApiV1TwitterWebFetchUserMediaGet_0"></a>
# **fetchUserMediaApiV1TwitterWebFetchUserMediaGet_0**
> ResponseModel fetchUserMediaApiV1TwitterWebFetchUserMediaGet_0(userId, count, cursor)

获取用户媒体/Get user media

# [中文] ### 用途: - 获取用户媒体 ### 参数: - userId: 用户ID - count: 数量，默认为20 - cursor: 游标，默认为None，用于翻页，后续从上一次请求的返回结果中获取     - JSONPath: $.data.data.user.result.timeline_v2.timeline.instructions.[-1].entries.[-1].content.value ### 返回: - 用户媒体  # [English] ### Purpose: - Get user media ### Parameters: - userId: User ID - count: Count, default is 20 - cursor: Cursor, default is None, used for paging, obtained from the last request     - JSONPath: $.data.data.user.result.timeline_v2.timeline.instructions.[-1].entries.[-1].content.value ### Return: - User media  # [示例/Example] userId &#x3D; \&quot;44196397\&quot; count &#x3D; 20 cursor &#x3D; None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    TwitterWebApiApi apiInstance = new TwitterWebApiApi(defaultClient);
    String userId = 44196397; // String | 用户ID/User ID
    Integer count = 20; // Integer | 数量/Count
    String cursor = "cursor_example"; // String | 游标/Cursor
    try {
      ResponseModel result = apiInstance.fetchUserMediaApiV1TwitterWebFetchUserMediaGet_0(userId, count, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwitterWebApiApi#fetchUserMediaApiV1TwitterWebFetchUserMediaGet_0");
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
 **count** | **Integer**| 数量/Count | [optional] [default to 20]
 **cursor** | **String**| 游标/Cursor | [optional]

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

<a name="fetchUserPostTweetApiV1TwitterWebFetchUserPostTweetGet"></a>
# **fetchUserPostTweetApiV1TwitterWebFetchUserPostTweetGet**
> ResponseModel fetchUserPostTweetApiV1TwitterWebFetchUserPostTweetGet(userId, count, cursor)

获取用户发帖/Get user post

# [中文] ### 用途: - 获取用户发帖 ### 参数: - userId: 用户ID - count: 数量，默认为20 - cursor: 游标，默认为None，用于翻页，后续从上一次请求的返回结果中的$.data.user.result.timeline_v2.timeline.instructions.[1].entries.[-1].content.value获取 ### 返回: - 用户发帖  # [English] ### Purpose: - Get user post ### Parameters: - userId: User ID - count: Count, default is 20 - cursor: Cursor, default is None, used for paging, obtained from the $.data.user.result.timeline_v2.timeline.instructions.[1].entries.[-1].content.value of the last request ### Return: - User post  # [示例/Example] userId &#x3D; \&quot;44196397\&quot; count &#x3D; 20 cursor &#x3D; None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    TwitterWebApiApi apiInstance = new TwitterWebApiApi(defaultClient);
    String userId = 44196397; // String | 用户ID/User ID
    Integer count = 20; // Integer | 数量/Count
    String cursor = DAABCgABGRwYjyr__-kKAAIZF-w1-5ehIAgAAwAAAAIAAA; // String | 游标/Cursor
    try {
      ResponseModel result = apiInstance.fetchUserPostTweetApiV1TwitterWebFetchUserPostTweetGet(userId, count, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwitterWebApiApi#fetchUserPostTweetApiV1TwitterWebFetchUserPostTweetGet");
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
 **count** | **Integer**| 数量/Count | [optional] [default to 20]
 **cursor** | **String**| 游标/Cursor | [optional]

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

<a name="fetchUserPostTweetApiV1TwitterWebFetchUserPostTweetGet_0"></a>
# **fetchUserPostTweetApiV1TwitterWebFetchUserPostTweetGet_0**
> ResponseModel fetchUserPostTweetApiV1TwitterWebFetchUserPostTweetGet_0(userId, count, cursor)

获取用户发帖/Get user post

# [中文] ### 用途: - 获取用户发帖 ### 参数: - userId: 用户ID - count: 数量，默认为20 - cursor: 游标，默认为None，用于翻页，后续从上一次请求的返回结果中的$.data.user.result.timeline_v2.timeline.instructions.[1].entries.[-1].content.value获取 ### 返回: - 用户发帖  # [English] ### Purpose: - Get user post ### Parameters: - userId: User ID - count: Count, default is 20 - cursor: Cursor, default is None, used for paging, obtained from the $.data.user.result.timeline_v2.timeline.instructions.[1].entries.[-1].content.value of the last request ### Return: - User post  # [示例/Example] userId &#x3D; \&quot;44196397\&quot; count &#x3D; 20 cursor &#x3D; None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    TwitterWebApiApi apiInstance = new TwitterWebApiApi(defaultClient);
    String userId = 44196397; // String | 用户ID/User ID
    Integer count = 20; // Integer | 数量/Count
    String cursor = DAABCgABGRwYjyr__-kKAAIZF-w1-5ehIAgAAwAAAAIAAA; // String | 游标/Cursor
    try {
      ResponseModel result = apiInstance.fetchUserPostTweetApiV1TwitterWebFetchUserPostTweetGet_0(userId, count, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwitterWebApiApi#fetchUserPostTweetApiV1TwitterWebFetchUserPostTweetGet_0");
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
 **count** | **Integer**| 数量/Count | [optional] [default to 20]
 **cursor** | **String**| 游标/Cursor | [optional]

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

<a name="fetchUserProfileApiV1TwitterWebFetchUserProfileGet"></a>
# **fetchUserProfileApiV1TwitterWebFetchUserProfileGet**
> ResponseModel fetchUserProfileApiV1TwitterWebFetchUserProfileGet(screenName)

获取用户资料/Get user profile

# [中文] ### 用途: - 获取用户资料 ### 参数: - screen_name: 用户名，例如：elonmusk，可以从用户主页链接中获取，例如：https://twitter.com/elonmusk 中的 elonmusk。 ### 返回: - 用户资料  # [English] ### Purpose: - Get user profile ### Parameters: - screen_name: Screen Name, for example: elonmusk, can be obtained from the user&#39;s homepage link, for example: elonmusk in https://twitter.com/elonmusk ### Return: - User profile  # [示例/Example] screen_name &#x3D; \&quot;elonmusk\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    TwitterWebApiApi apiInstance = new TwitterWebApiApi(defaultClient);
    String screenName = elonmusk; // String | 用户名/Screen Name
    try {
      ResponseModel result = apiInstance.fetchUserProfileApiV1TwitterWebFetchUserProfileGet(screenName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwitterWebApiApi#fetchUserProfileApiV1TwitterWebFetchUserProfileGet");
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
 **screenName** | **String**| 用户名/Screen Name |

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

<a name="fetchUserProfileApiV1TwitterWebFetchUserProfileGet_0"></a>
# **fetchUserProfileApiV1TwitterWebFetchUserProfileGet_0**
> ResponseModel fetchUserProfileApiV1TwitterWebFetchUserProfileGet_0(screenName)

获取用户资料/Get user profile

# [中文] ### 用途: - 获取用户资料 ### 参数: - screen_name: 用户名，例如：elonmusk，可以从用户主页链接中获取，例如：https://twitter.com/elonmusk 中的 elonmusk。 ### 返回: - 用户资料  # [English] ### Purpose: - Get user profile ### Parameters: - screen_name: Screen Name, for example: elonmusk, can be obtained from the user&#39;s homepage link, for example: elonmusk in https://twitter.com/elonmusk ### Return: - User profile  # [示例/Example] screen_name &#x3D; \&quot;elonmusk\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    TwitterWebApiApi apiInstance = new TwitterWebApiApi(defaultClient);
    String screenName = elonmusk; // String | 用户名/Screen Name
    try {
      ResponseModel result = apiInstance.fetchUserProfileApiV1TwitterWebFetchUserProfileGet_0(screenName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwitterWebApiApi#fetchUserProfileApiV1TwitterWebFetchUserProfileGet_0");
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
 **screenName** | **String**| 用户名/Screen Name |

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

<a name="fetchUserTweetRepliesApiV1TwitterWebFetchUserTweetRepliesGet"></a>
# **fetchUserTweetRepliesApiV1TwitterWebFetchUserTweetRepliesGet**
> ResponseModel fetchUserTweetRepliesApiV1TwitterWebFetchUserTweetRepliesGet(userId, count, cursor)

获取用户推文回复/Get user tweet replies

# [中文] ### 用途: - 获取用户推文回复 ### 参数: - userId: 用户ID - count: 数量，默认为20 - cursor: 游标，默认为None，用于翻页，后续从上一次请求的返回结果中获取     - JSONPath: $.data.data.user.result.timeline_v2.timeline.instructions.[1].entries.[-1].content.value ### 返回: - 用户推文回复  # [English] ### Purpose: - Get user tweet replies ### Parameters: - userId: User ID - count: Count, default is 20 - cursor: Cursor, default is None, used for paging, obtained from the last request     - JSONPath: $.data.data.user.result.timeline_v2.timeline.instructions.[1].entries.[-1].content.value ### Return: - User tweet replies  # [示例/Example] userId &#x3D; \&quot;44196397\&quot; count &#x3D; 20 cursor &#x3D; None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    TwitterWebApiApi apiInstance = new TwitterWebApiApi(defaultClient);
    String userId = 44196397; // String | 用户ID/User ID
    Integer count = 20; // Integer | 数量/Count
    String cursor = "cursor_example"; // String | 游标/Cursor
    try {
      ResponseModel result = apiInstance.fetchUserTweetRepliesApiV1TwitterWebFetchUserTweetRepliesGet(userId, count, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwitterWebApiApi#fetchUserTweetRepliesApiV1TwitterWebFetchUserTweetRepliesGet");
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
 **count** | **Integer**| 数量/Count | [optional] [default to 20]
 **cursor** | **String**| 游标/Cursor | [optional]

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

<a name="fetchUserTweetRepliesApiV1TwitterWebFetchUserTweetRepliesGet_0"></a>
# **fetchUserTweetRepliesApiV1TwitterWebFetchUserTweetRepliesGet_0**
> ResponseModel fetchUserTweetRepliesApiV1TwitterWebFetchUserTweetRepliesGet_0(userId, count, cursor)

获取用户推文回复/Get user tweet replies

# [中文] ### 用途: - 获取用户推文回复 ### 参数: - userId: 用户ID - count: 数量，默认为20 - cursor: 游标，默认为None，用于翻页，后续从上一次请求的返回结果中获取     - JSONPath: $.data.data.user.result.timeline_v2.timeline.instructions.[1].entries.[-1].content.value ### 返回: - 用户推文回复  # [English] ### Purpose: - Get user tweet replies ### Parameters: - userId: User ID - count: Count, default is 20 - cursor: Cursor, default is None, used for paging, obtained from the last request     - JSONPath: $.data.data.user.result.timeline_v2.timeline.instructions.[1].entries.[-1].content.value ### Return: - User tweet replies  # [示例/Example] userId &#x3D; \&quot;44196397\&quot; count &#x3D; 20 cursor &#x3D; None

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    TwitterWebApiApi apiInstance = new TwitterWebApiApi(defaultClient);
    String userId = 44196397; // String | 用户ID/User ID
    Integer count = 20; // Integer | 数量/Count
    String cursor = "cursor_example"; // String | 游标/Cursor
    try {
      ResponseModel result = apiInstance.fetchUserTweetRepliesApiV1TwitterWebFetchUserTweetRepliesGet_0(userId, count, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwitterWebApiApi#fetchUserTweetRepliesApiV1TwitterWebFetchUserTweetRepliesGet_0");
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
 **count** | **Integer**| 数量/Count | [optional] [default to 20]
 **cursor** | **String**| 游标/Cursor | [optional]

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

