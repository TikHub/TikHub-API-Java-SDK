# WeiboWebApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchPostDetailApiV1WeiboWebFetchPostDetailGet**](WeiboWebApiApi.md#fetchPostDetailApiV1WeiboWebFetchPostDetailGet) | **GET** /api/v1/weibo/web/fetch_post_detail | 获取单个作品数据/Get single video data
[**fetchPostDetailApiV1WeiboWebFetchPostDetailGet_0**](WeiboWebApiApi.md#fetchPostDetailApiV1WeiboWebFetchPostDetailGet_0) | **GET** /api/v1/weibo/web/fetch_post_detail | 获取单个作品数据/Get single video data
[**fetchSearchDataApiV1WeiboWebFetchSearchDataGet**](WeiboWebApiApi.md#fetchSearchDataApiV1WeiboWebFetchSearchDataGet) | **GET** /api/v1/weibo/web/fetch_search_data | 获取搜索数据/Get search data
[**fetchSearchDataApiV1WeiboWebFetchSearchDataGet_0**](WeiboWebApiApi.md#fetchSearchDataApiV1WeiboWebFetchSearchDataGet_0) | **GET** /api/v1/weibo/web/fetch_search_data | 获取搜索数据/Get search data
[**fetchShortVideoDataApiV1WeiboWebFetchShortVideoDataGet**](WeiboWebApiApi.md#fetchShortVideoDataApiV1WeiboWebFetchShortVideoDataGet) | **GET** /api/v1/weibo/web/fetch_short_video_data | 获取短视频数据/Get short video data
[**fetchShortVideoDataApiV1WeiboWebFetchShortVideoDataGet_0**](WeiboWebApiApi.md#fetchShortVideoDataApiV1WeiboWebFetchShortVideoDataGet_0) | **GET** /api/v1/weibo/web/fetch_short_video_data | 获取短视频数据/Get short video data
[**fetchTopicDetailApiV1WeiboWebFetchTopicDetailGet**](WeiboWebApiApi.md#fetchTopicDetailApiV1WeiboWebFetchTopicDetailGet) | **GET** /api/v1/weibo/web/fetch_topic_detail | 获取话题详情/Get topic details
[**fetchTopicDetailApiV1WeiboWebFetchTopicDetailGet_0**](WeiboWebApiApi.md#fetchTopicDetailApiV1WeiboWebFetchTopicDetailGet_0) | **GET** /api/v1/weibo/web/fetch_topic_detail | 获取话题详情/Get topic details
[**fetchTopicStatsApiV1WeiboWebFetchTopicStatsGet**](WeiboWebApiApi.md#fetchTopicStatsApiV1WeiboWebFetchTopicStatsGet) | **GET** /api/v1/weibo/web/fetch_topic_stats | 获取话题统计数据/Get topic statistics
[**fetchTopicStatsApiV1WeiboWebFetchTopicStatsGet_0**](WeiboWebApiApi.md#fetchTopicStatsApiV1WeiboWebFetchTopicStatsGet_0) | **GET** /api/v1/weibo/web/fetch_topic_stats | 获取话题统计数据/Get topic statistics
[**fetchUserInfoApiV1WeiboWebFetchUserInfoGet**](WeiboWebApiApi.md#fetchUserInfoApiV1WeiboWebFetchUserInfoGet) | **GET** /api/v1/weibo/web/fetch_user_info | 获取用户信息/Get user information
[**fetchUserInfoApiV1WeiboWebFetchUserInfoGet_0**](WeiboWebApiApi.md#fetchUserInfoApiV1WeiboWebFetchUserInfoGet_0) | **GET** /api/v1/weibo/web/fetch_user_info | 获取用户信息/Get user information
[**fetchUserInfoV2ApiV1WeiboWebFetchUserInfoV2Get**](WeiboWebApiApi.md#fetchUserInfoV2ApiV1WeiboWebFetchUserInfoV2Get) | **GET** /api/v1/weibo/web/fetch_user_info_v2 | 获取用户信息V2/Get user information V2
[**fetchUserInfoV2ApiV1WeiboWebFetchUserInfoV2Get_0**](WeiboWebApiApi.md#fetchUserInfoV2ApiV1WeiboWebFetchUserInfoV2Get_0) | **GET** /api/v1/weibo/web/fetch_user_info_v2 | 获取用户信息V2/Get user information V2
[**fetchUserPostsApiV1WeiboWebFetchUserPostsGet**](WeiboWebApiApi.md#fetchUserPostsApiV1WeiboWebFetchUserPostsGet) | **GET** /api/v1/weibo/web/fetch_user_posts | 获取微博用户文章数据/Get Weibo user article data
[**fetchUserPostsApiV1WeiboWebFetchUserPostsGet_0**](WeiboWebApiApi.md#fetchUserPostsApiV1WeiboWebFetchUserPostsGet_0) | **GET** /api/v1/weibo/web/fetch_user_posts | 获取微博用户文章数据/Get Weibo user article data



## fetchPostDetailApiV1WeiboWebFetchPostDetailGet

> ResponseModel fetchPostDetailApiV1WeiboWebFetchPostDetailGet(id)

获取单个作品数据/Get single video data

# [中文] ### 用途: - 获取单个作品数据 ### 参数: - id: 作品id，从分享链接中获取  - https://weibo.com/5819018196/5092682368025584  - 作品id为：5092682368025584 ### 返回: - 作品数据  # [English] ### Purpose: - Get single video data ### Parameters: - id: Post id, obtained from the sharing link     - https://weibo.com/5819018196/5092682368025584     - The post id is: 5092682368025584 ### Return: - Post data  # [示例/Example] id &#x3D; \&quot;5092682368025584\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.WeiboWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        WeiboWebApiApi apiInstance = new WeiboWebApiApi(defaultClient);
        String id = 5092682368025584; // String | 作品id/Post id
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
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## fetchPostDetailApiV1WeiboWebFetchPostDetailGet_0

> ResponseModel fetchPostDetailApiV1WeiboWebFetchPostDetailGet_0(id)

获取单个作品数据/Get single video data

# [中文] ### 用途: - 获取单个作品数据 ### 参数: - id: 作品id，从分享链接中获取  - https://weibo.com/5819018196/5092682368025584  - 作品id为：5092682368025584 ### 返回: - 作品数据  # [English] ### Purpose: - Get single video data ### Parameters: - id: Post id, obtained from the sharing link     - https://weibo.com/5819018196/5092682368025584     - The post id is: 5092682368025584 ### Return: - Post data  # [示例/Example] id &#x3D; \&quot;5092682368025584\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.WeiboWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        WeiboWebApiApi apiInstance = new WeiboWebApiApi(defaultClient);
        String id = 5092682368025584; // String | 作品id/Post id
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
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## fetchSearchDataApiV1WeiboWebFetchSearchDataGet

> ResponseModel fetchSearchDataApiV1WeiboWebFetchSearchDataGet(keyword, page, searchType)

获取搜索数据/Get search data

# [中文] ### 用途: - 获取搜索数据 ### 参数: - keyword: 关键词 - page: 页数 - search_type: 搜索类型     - **1**: 综合     - **61**: 实时     - **3**: 用户     - **60**: 热门     - **64**: 视频     - **63**: 图片     - **21**: 文章     - **38**: 话题     - **98**: 超话 ### 返回: - 搜索数据  # [English] ### Purpose: - Get search data ### Parameters: - keyword: Keyword - page: Page number - search_type: Search type     - **1**: Comprehensive     - **61**: Real-time     - **3**: User     - **60**: Hot     - **64**: Video     - **63**: Picture     - **21**: Article     - **38**: Topic     - **98**: Super topic ### Return: - Search data  # [示例/Example] keyword &#x3D; \&quot;游戏\&quot; page &#x3D; \&quot;1\&quot; search_type &#x3D; \&quot;1\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.WeiboWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        WeiboWebApiApi apiInstance = new WeiboWebApiApi(defaultClient);
        String keyword = 游戏; // String | 关键词/Keyword
        String page = 1; // String | 页数/Page number
        String searchType = 1; // String | 搜索类型/Search type
        try {
            ResponseModel result = apiInstance.fetchSearchDataApiV1WeiboWebFetchSearchDataGet(keyword, page, searchType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WeiboWebApiApi#fetchSearchDataApiV1WeiboWebFetchSearchDataGet");
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
 **page** | **String**| 页数/Page number | [optional] [default to &quot;1&quot;]
 **searchType** | **String**| 搜索类型/Search type | [optional] [default to &quot;1&quot;]

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


## fetchSearchDataApiV1WeiboWebFetchSearchDataGet_0

> ResponseModel fetchSearchDataApiV1WeiboWebFetchSearchDataGet_0(keyword, page, searchType)

获取搜索数据/Get search data

# [中文] ### 用途: - 获取搜索数据 ### 参数: - keyword: 关键词 - page: 页数 - search_type: 搜索类型     - **1**: 综合     - **61**: 实时     - **3**: 用户     - **60**: 热门     - **64**: 视频     - **63**: 图片     - **21**: 文章     - **38**: 话题     - **98**: 超话 ### 返回: - 搜索数据  # [English] ### Purpose: - Get search data ### Parameters: - keyword: Keyword - page: Page number - search_type: Search type     - **1**: Comprehensive     - **61**: Real-time     - **3**: User     - **60**: Hot     - **64**: Video     - **63**: Picture     - **21**: Article     - **38**: Topic     - **98**: Super topic ### Return: - Search data  # [示例/Example] keyword &#x3D; \&quot;游戏\&quot; page &#x3D; \&quot;1\&quot; search_type &#x3D; \&quot;1\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.WeiboWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        WeiboWebApiApi apiInstance = new WeiboWebApiApi(defaultClient);
        String keyword = 游戏; // String | 关键词/Keyword
        String page = 1; // String | 页数/Page number
        String searchType = 1; // String | 搜索类型/Search type
        try {
            ResponseModel result = apiInstance.fetchSearchDataApiV1WeiboWebFetchSearchDataGet_0(keyword, page, searchType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WeiboWebApiApi#fetchSearchDataApiV1WeiboWebFetchSearchDataGet_0");
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
 **page** | **String**| 页数/Page number | [optional] [default to &quot;1&quot;]
 **searchType** | **String**| 搜索类型/Search type | [optional] [default to &quot;1&quot;]

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


## fetchShortVideoDataApiV1WeiboWebFetchShortVideoDataGet

> ResponseModel fetchShortVideoDataApiV1WeiboWebFetchShortVideoDataGet(shareText)

获取短视频数据/Get short video data

# [中文] ### 用途: - 获取短视频数据 ### 参数: - share_text: 视频分享链接 ### 返回: - 短视频数据  # [English] ### Purpose: - Get short video data ### Parameters: - share_text: Video sharing link ### Return: - Short video data  # [示例/Example] share_text &#x3D; \&quot;https://video.weibo.com/show?fid&#x3D;1034:4986069612167172\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.WeiboWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        WeiboWebApiApi apiInstance = new WeiboWebApiApi(defaultClient);
        String shareText = https://video.weibo.com/show?fid=1034:4986069612167172; // String | 视频分享链接/Video sharing link
        try {
            ResponseModel result = apiInstance.fetchShortVideoDataApiV1WeiboWebFetchShortVideoDataGet(shareText);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WeiboWebApiApi#fetchShortVideoDataApiV1WeiboWebFetchShortVideoDataGet");
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
 **shareText** | **String**| 视频分享链接/Video sharing link |

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


## fetchShortVideoDataApiV1WeiboWebFetchShortVideoDataGet_0

> ResponseModel fetchShortVideoDataApiV1WeiboWebFetchShortVideoDataGet_0(shareText)

获取短视频数据/Get short video data

# [中文] ### 用途: - 获取短视频数据 ### 参数: - share_text: 视频分享链接 ### 返回: - 短视频数据  # [English] ### Purpose: - Get short video data ### Parameters: - share_text: Video sharing link ### Return: - Short video data  # [示例/Example] share_text &#x3D; \&quot;https://video.weibo.com/show?fid&#x3D;1034:4986069612167172\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.WeiboWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        WeiboWebApiApi apiInstance = new WeiboWebApiApi(defaultClient);
        String shareText = https://video.weibo.com/show?fid=1034:4986069612167172; // String | 视频分享链接/Video sharing link
        try {
            ResponseModel result = apiInstance.fetchShortVideoDataApiV1WeiboWebFetchShortVideoDataGet_0(shareText);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WeiboWebApiApi#fetchShortVideoDataApiV1WeiboWebFetchShortVideoDataGet_0");
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
 **shareText** | **String**| 视频分享链接/Video sharing link |

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


## fetchTopicDetailApiV1WeiboWebFetchTopicDetailGet

> ResponseModel fetchTopicDetailApiV1WeiboWebFetchTopicDetailGet(topicName, page)

获取话题详情/Get topic details

# [中文] ### 用途: - 获取话题详情 ### 参数: - topic_name: 话题名称 - page: 页数 ### 返回: - 话题详情  # [English] ### Purpose: - Get topic details ### Parameters: - topic_name: Topic name - page: Page number ### Return: - Topic details  # [示例/Example] topic_name &#x3D; \&quot;游戏\&quot; page &#x3D; \&quot;\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.WeiboWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        WeiboWebApiApi apiInstance = new WeiboWebApiApi(defaultClient);
        String topicName = 游戏; // String | 话题名称/Topic name
        String page = "\"\""; // String | 页数/Page number
        try {
            ResponseModel result = apiInstance.fetchTopicDetailApiV1WeiboWebFetchTopicDetailGet(topicName, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WeiboWebApiApi#fetchTopicDetailApiV1WeiboWebFetchTopicDetailGet");
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
 **topicName** | **String**| 话题名称/Topic name |
 **page** | **String**| 页数/Page number | [optional] [default to &quot;&quot;]

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


## fetchTopicDetailApiV1WeiboWebFetchTopicDetailGet_0

> ResponseModel fetchTopicDetailApiV1WeiboWebFetchTopicDetailGet_0(topicName, page)

获取话题详情/Get topic details

# [中文] ### 用途: - 获取话题详情 ### 参数: - topic_name: 话题名称 - page: 页数 ### 返回: - 话题详情  # [English] ### Purpose: - Get topic details ### Parameters: - topic_name: Topic name - page: Page number ### Return: - Topic details  # [示例/Example] topic_name &#x3D; \&quot;游戏\&quot; page &#x3D; \&quot;\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.WeiboWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        WeiboWebApiApi apiInstance = new WeiboWebApiApi(defaultClient);
        String topicName = 游戏; // String | 话题名称/Topic name
        String page = "\"\""; // String | 页数/Page number
        try {
            ResponseModel result = apiInstance.fetchTopicDetailApiV1WeiboWebFetchTopicDetailGet_0(topicName, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WeiboWebApiApi#fetchTopicDetailApiV1WeiboWebFetchTopicDetailGet_0");
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
 **topicName** | **String**| 话题名称/Topic name |
 **page** | **String**| 页数/Page number | [optional] [default to &quot;&quot;]

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


## fetchTopicStatsApiV1WeiboWebFetchTopicStatsGet

> ResponseModel fetchTopicStatsApiV1WeiboWebFetchTopicStatsGet(topicName)

获取话题统计数据/Get topic statistics

# [中文] ### 用途: - 获取话题统计数据 ### 参数: - topic_name: 话题名称 ### 返回: - 话题统计数据  # [English] ### Purpose: - Get topic statistics ### Parameters: - topic_name: Topic name ### Return: - Topic statistics  # [示例/Example] topic_name &#x3D; \&quot;游戏\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.WeiboWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        WeiboWebApiApi apiInstance = new WeiboWebApiApi(defaultClient);
        String topicName = 游戏; // String | 话题名称/Topic name
        try {
            ResponseModel result = apiInstance.fetchTopicStatsApiV1WeiboWebFetchTopicStatsGet(topicName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WeiboWebApiApi#fetchTopicStatsApiV1WeiboWebFetchTopicStatsGet");
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
 **topicName** | **String**| 话题名称/Topic name |

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


## fetchTopicStatsApiV1WeiboWebFetchTopicStatsGet_0

> ResponseModel fetchTopicStatsApiV1WeiboWebFetchTopicStatsGet_0(topicName)

获取话题统计数据/Get topic statistics

# [中文] ### 用途: - 获取话题统计数据 ### 参数: - topic_name: 话题名称 ### 返回: - 话题统计数据  # [English] ### Purpose: - Get topic statistics ### Parameters: - topic_name: Topic name ### Return: - Topic statistics  # [示例/Example] topic_name &#x3D; \&quot;游戏\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.WeiboWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        WeiboWebApiApi apiInstance = new WeiboWebApiApi(defaultClient);
        String topicName = 游戏; // String | 话题名称/Topic name
        try {
            ResponseModel result = apiInstance.fetchTopicStatsApiV1WeiboWebFetchTopicStatsGet_0(topicName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WeiboWebApiApi#fetchTopicStatsApiV1WeiboWebFetchTopicStatsGet_0");
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
 **topicName** | **String**| 话题名称/Topic name |

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


## fetchUserInfoApiV1WeiboWebFetchUserInfoGet

> ResponseModel fetchUserInfoApiV1WeiboWebFetchUserInfoGet(uid)

获取用户信息/Get user information

# [中文] ### 用途: - 获取用户信息 ### 参数: - uid: 用户id ### 返回: - 用户信息  # [English] ### Purpose: - Get user information ### Parameters: - uid: User id ### Return: - User information  # [示例/Example] uid &#x3D; \&quot;7277477906\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.WeiboWebApiApi;

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
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## fetchUserInfoApiV1WeiboWebFetchUserInfoGet_0

> ResponseModel fetchUserInfoApiV1WeiboWebFetchUserInfoGet_0(uid)

获取用户信息/Get user information

# [中文] ### 用途: - 获取用户信息 ### 参数: - uid: 用户id ### 返回: - 用户信息  # [English] ### Purpose: - Get user information ### Parameters: - uid: User id ### Return: - User information  # [示例/Example] uid &#x3D; \&quot;7277477906\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.WeiboWebApiApi;

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
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## fetchUserInfoV2ApiV1WeiboWebFetchUserInfoV2Get

> ResponseModel fetchUserInfoV2ApiV1WeiboWebFetchUserInfoV2Get(uid)

获取用户信息V2/Get user information V2

# [中文] ### 用途: - 获取用户信息V2 ### 参数: - uid: 用户id ### 返回: - 用户信息  # [English] ### Purpose: - Get user information V2 ### Parameters: - uid: User id ### Return: - User information  # [示例/Example] uid &#x3D; \&quot;7277477906\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.WeiboWebApiApi;

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
            ResponseModel result = apiInstance.fetchUserInfoV2ApiV1WeiboWebFetchUserInfoV2Get(uid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WeiboWebApiApi#fetchUserInfoV2ApiV1WeiboWebFetchUserInfoV2Get");
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
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## fetchUserInfoV2ApiV1WeiboWebFetchUserInfoV2Get_0

> ResponseModel fetchUserInfoV2ApiV1WeiboWebFetchUserInfoV2Get_0(uid)

获取用户信息V2/Get user information V2

# [中文] ### 用途: - 获取用户信息V2 ### 参数: - uid: 用户id ### 返回: - 用户信息  # [English] ### Purpose: - Get user information V2 ### Parameters: - uid: User id ### Return: - User information  # [示例/Example] uid &#x3D; \&quot;7277477906\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.WeiboWebApiApi;

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
            ResponseModel result = apiInstance.fetchUserInfoV2ApiV1WeiboWebFetchUserInfoV2Get_0(uid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WeiboWebApiApi#fetchUserInfoV2ApiV1WeiboWebFetchUserInfoV2Get_0");
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
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## fetchUserPostsApiV1WeiboWebFetchUserPostsGet

> ResponseModel fetchUserPostsApiV1WeiboWebFetchUserPostsGet(uid, page, feature)

获取微博用户文章数据/Get Weibo user article data

# [中文] ### 用途: - 获取微博用户文章数据 ### 参数: - uid: 用户id - page: 页数 - feature: 特征 ### 返回: - 用户文章数据  # [English] ### Purpose: - Get Weibo user article data ### Parameters: - uid: User id - page: Page number - feature: Feature ### Return: - User article data  # [示例/Example] uid &#x3D; \&quot;7277477906\&quot; page &#x3D; 1 feature &#x3D; 0

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.WeiboWebApiApi;

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
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## fetchUserPostsApiV1WeiboWebFetchUserPostsGet_0

> ResponseModel fetchUserPostsApiV1WeiboWebFetchUserPostsGet_0(uid, page, feature)

获取微博用户文章数据/Get Weibo user article data

# [中文] ### 用途: - 获取微博用户文章数据 ### 参数: - uid: 用户id - page: 页数 - feature: 特征 ### 返回: - 用户文章数据  # [English] ### Purpose: - Get Weibo user article data ### Parameters: - uid: User id - page: Page number - feature: Feature ### Return: - User article data  # [示例/Example] uid &#x3D; \&quot;7277477906\&quot; page &#x3D; 1 feature &#x3D; 0

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.WeiboWebApiApi;

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
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

