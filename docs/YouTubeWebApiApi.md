# YouTubeWebApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChannelIdApiV1YoutubeWebGetChannelIdGet**](YouTubeWebApiApi.md#getChannelIdApiV1YoutubeWebGetChannelIdGet) | **GET** /api/v1/youtube/web/get_channel_id | 获取频道ID/Get channel ID
[**getChannelIdApiV1YoutubeWebGetChannelIdGet_0**](YouTubeWebApiApi.md#getChannelIdApiV1YoutubeWebGetChannelIdGet_0) | **GET** /api/v1/youtube/web/get_channel_id | 获取频道ID/Get channel ID
[**getChannelInfoApiV1YoutubeWebGetChannelInfoGet**](YouTubeWebApiApi.md#getChannelInfoApiV1YoutubeWebGetChannelInfoGet) | **GET** /api/v1/youtube/web/get_channel_info | 获取频道信息/Get channel information
[**getChannelInfoApiV1YoutubeWebGetChannelInfoGet_0**](YouTubeWebApiApi.md#getChannelInfoApiV1YoutubeWebGetChannelInfoGet_0) | **GET** /api/v1/youtube/web/get_channel_info | 获取频道信息/Get channel information
[**getChannelShortVideosApiV1YoutubeWebGetChannelShortVideosGet**](YouTubeWebApiApi.md#getChannelShortVideosApiV1YoutubeWebGetChannelShortVideosGet) | **GET** /api/v1/youtube/web/get_channel_short_videos | 获取频道短视频/Get channel short videos
[**getChannelShortVideosApiV1YoutubeWebGetChannelShortVideosGet_0**](YouTubeWebApiApi.md#getChannelShortVideosApiV1YoutubeWebGetChannelShortVideosGet_0) | **GET** /api/v1/youtube/web/get_channel_short_videos | 获取频道短视频/Get channel short videos
[**getChannelVideosApiV1YoutubeWebGetChannelVideosGet**](YouTubeWebApiApi.md#getChannelVideosApiV1YoutubeWebGetChannelVideosGet) | **GET** /api/v1/youtube/web/get_channel_videos | 获取频道视频/Get channel videos
[**getChannelVideosApiV1YoutubeWebGetChannelVideosGet_0**](YouTubeWebApiApi.md#getChannelVideosApiV1YoutubeWebGetChannelVideosGet_0) | **GET** /api/v1/youtube/web/get_channel_videos | 获取频道视频/Get channel videos
[**getRelateVideoApiV1YoutubeWebGetRelateVideoGet**](YouTubeWebApiApi.md#getRelateVideoApiV1YoutubeWebGetRelateVideoGet) | **GET** /api/v1/youtube/web/get_relate_video | 获取推荐视频/Get related videos
[**getRelateVideoApiV1YoutubeWebGetRelateVideoGet_0**](YouTubeWebApiApi.md#getRelateVideoApiV1YoutubeWebGetRelateVideoGet_0) | **GET** /api/v1/youtube/web/get_relate_video | 获取推荐视频/Get related videos
[**getTrendingVideosApiV1YoutubeWebGetTrendingVideosGet**](YouTubeWebApiApi.md#getTrendingVideosApiV1YoutubeWebGetTrendingVideosGet) | **GET** /api/v1/youtube/web/get_trending_videos | 获取趋势视频/Get trending videos
[**getTrendingVideosApiV1YoutubeWebGetTrendingVideosGet_0**](YouTubeWebApiApi.md#getTrendingVideosApiV1YoutubeWebGetTrendingVideosGet_0) | **GET** /api/v1/youtube/web/get_trending_videos | 获取趋势视频/Get trending videos
[**getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet**](YouTubeWebApiApi.md#getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet) | **GET** /api/v1/youtube/web/get_video_comments | 获取视频评论/Get video comments
[**getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet_0**](YouTubeWebApiApi.md#getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet_0) | **GET** /api/v1/youtube/web/get_video_comments | 获取视频评论/Get video comments
[**getVideoInfoApiV1YoutubeWebGetVideoInfoGet**](YouTubeWebApiApi.md#getVideoInfoApiV1YoutubeWebGetVideoInfoGet) | **GET** /api/v1/youtube/web/get_video_info | 获取视频信息/Get video information
[**getVideoInfoApiV1YoutubeWebGetVideoInfoGet_0**](YouTubeWebApiApi.md#getVideoInfoApiV1YoutubeWebGetVideoInfoGet_0) | **GET** /api/v1/youtube/web/get_video_info | 获取视频信息/Get video information
[**getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet**](YouTubeWebApiApi.md#getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet) | **GET** /api/v1/youtube/web/get_video_subtitles | 获取视频字幕/Get video subtitles
[**getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet_0**](YouTubeWebApiApi.md#getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet_0) | **GET** /api/v1/youtube/web/get_video_subtitles | 获取视频字幕/Get video subtitles
[**searchChannelApiV1YoutubeWebSearchChannelGet**](YouTubeWebApiApi.md#searchChannelApiV1YoutubeWebSearchChannelGet) | **GET** /api/v1/youtube/web/search_channel | 搜索频道/Search channel
[**searchChannelApiV1YoutubeWebSearchChannelGet_0**](YouTubeWebApiApi.md#searchChannelApiV1YoutubeWebSearchChannelGet_0) | **GET** /api/v1/youtube/web/search_channel | 搜索频道/Search channel
[**searchVideoApiV1YoutubeWebSearchVideoGet**](YouTubeWebApiApi.md#searchVideoApiV1YoutubeWebSearchVideoGet) | **GET** /api/v1/youtube/web/search_video | 搜索视频/Search video
[**searchVideoApiV1YoutubeWebSearchVideoGet_0**](YouTubeWebApiApi.md#searchVideoApiV1YoutubeWebSearchVideoGet_0) | **GET** /api/v1/youtube/web/search_video | 搜索视频/Search video



## getChannelIdApiV1YoutubeWebGetChannelIdGet

> ResponseModel getChannelIdApiV1YoutubeWebGetChannelIdGet(channelName)

获取频道ID/Get channel ID

# [中文] ### 用途: - 获取频道ID。 ### 参数: - channel_name: 频道名称。 ### 返回: - 频道ID。  # [English] ### Purpose: - Get channel ID. ### Parameters: - channel_name: Channel name. ### Returns: - Channel ID.  # [示例/Example] channel_name &#x3D; \&quot;LinusTechTips\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String channelName = LinusTechTips; // String | 频道名称/Channel name
        try {
            ResponseModel result = apiInstance.getChannelIdApiV1YoutubeWebGetChannelIdGet(channelName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getChannelIdApiV1YoutubeWebGetChannelIdGet");
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
 **channelName** | **String**| 频道名称/Channel name |

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


## getChannelIdApiV1YoutubeWebGetChannelIdGet_0

> ResponseModel getChannelIdApiV1YoutubeWebGetChannelIdGet_0(channelName)

获取频道ID/Get channel ID

# [中文] ### 用途: - 获取频道ID。 ### 参数: - channel_name: 频道名称。 ### 返回: - 频道ID。  # [English] ### Purpose: - Get channel ID. ### Parameters: - channel_name: Channel name. ### Returns: - Channel ID.  # [示例/Example] channel_name &#x3D; \&quot;LinusTechTips\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String channelName = LinusTechTips; // String | 频道名称/Channel name
        try {
            ResponseModel result = apiInstance.getChannelIdApiV1YoutubeWebGetChannelIdGet_0(channelName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getChannelIdApiV1YoutubeWebGetChannelIdGet_0");
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
 **channelName** | **String**| 频道名称/Channel name |

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


## getChannelInfoApiV1YoutubeWebGetChannelInfoGet

> ResponseModel getChannelInfoApiV1YoutubeWebGetChannelInfoGet(channelId)

获取频道信息/Get channel information

# [中文] ### 用途: - 获取频道信息。 ### 参数: - channel_id: 频道ID。 ### 返回: - 频道信息。  # [English] ### Purpose: - Get channel information. ### Parameters: - channel_id: Channel ID. ### Returns: - Channel information.  # [示例/Example] channel_id &#x3D; \&quot;UCXuqSBlHAE6Xw-yeJA0Tunw\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String channelId = UCXuqSBlHAE6Xw-yeJA0Tunw; // String | 频道ID/Channel ID
        try {
            ResponseModel result = apiInstance.getChannelInfoApiV1YoutubeWebGetChannelInfoGet(channelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getChannelInfoApiV1YoutubeWebGetChannelInfoGet");
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
 **channelId** | **String**| 频道ID/Channel ID |

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


## getChannelInfoApiV1YoutubeWebGetChannelInfoGet_0

> ResponseModel getChannelInfoApiV1YoutubeWebGetChannelInfoGet_0(channelId)

获取频道信息/Get channel information

# [中文] ### 用途: - 获取频道信息。 ### 参数: - channel_id: 频道ID。 ### 返回: - 频道信息。  # [English] ### Purpose: - Get channel information. ### Parameters: - channel_id: Channel ID. ### Returns: - Channel information.  # [示例/Example] channel_id &#x3D; \&quot;UCXuqSBlHAE6Xw-yeJA0Tunw\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String channelId = UCXuqSBlHAE6Xw-yeJA0Tunw; // String | 频道ID/Channel ID
        try {
            ResponseModel result = apiInstance.getChannelInfoApiV1YoutubeWebGetChannelInfoGet_0(channelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getChannelInfoApiV1YoutubeWebGetChannelInfoGet_0");
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
 **channelId** | **String**| 频道ID/Channel ID |

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


## getChannelShortVideosApiV1YoutubeWebGetChannelShortVideosGet

> ResponseModel getChannelShortVideosApiV1YoutubeWebGetChannelShortVideosGet(channelId, continuationToken)

获取频道短视频/Get channel short videos

# [中文] ### 用途: - 获取频道短视频。 ### 参数: - channel_id: 频道ID。 - continuation_token: 用于继续获取频道短视频的令牌。默认为None。 ### 返回: - 频道短视频。  # [English] ### Purpose: - Get channel short videos. ### Parameters: - channel_id: Channel ID. - continuation_token: Token to continue fetching channel short videos. Default is None. ### Returns: - Channel short videos.  # [示例/Example] channel_id &#x3D; \&quot;UCXuqSBlHAE6Xw-yeJA0Tunw\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String channelId = UCXuqSBlHAE6Xw-yeJA0Tunw; // String | 频道ID/Channel ID
        String continuationToken = "continuationToken_example"; // String | 翻页令牌/Pagination token
        try {
            ResponseModel result = apiInstance.getChannelShortVideosApiV1YoutubeWebGetChannelShortVideosGet(channelId, continuationToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getChannelShortVideosApiV1YoutubeWebGetChannelShortVideosGet");
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
 **channelId** | **String**| 频道ID/Channel ID |
 **continuationToken** | **String**| 翻页令牌/Pagination token | [optional]

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


## getChannelShortVideosApiV1YoutubeWebGetChannelShortVideosGet_0

> ResponseModel getChannelShortVideosApiV1YoutubeWebGetChannelShortVideosGet_0(channelId, continuationToken)

获取频道短视频/Get channel short videos

# [中文] ### 用途: - 获取频道短视频。 ### 参数: - channel_id: 频道ID。 - continuation_token: 用于继续获取频道短视频的令牌。默认为None。 ### 返回: - 频道短视频。  # [English] ### Purpose: - Get channel short videos. ### Parameters: - channel_id: Channel ID. - continuation_token: Token to continue fetching channel short videos. Default is None. ### Returns: - Channel short videos.  # [示例/Example] channel_id &#x3D; \&quot;UCXuqSBlHAE6Xw-yeJA0Tunw\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String channelId = UCXuqSBlHAE6Xw-yeJA0Tunw; // String | 频道ID/Channel ID
        String continuationToken = "continuationToken_example"; // String | 翻页令牌/Pagination token
        try {
            ResponseModel result = apiInstance.getChannelShortVideosApiV1YoutubeWebGetChannelShortVideosGet_0(channelId, continuationToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getChannelShortVideosApiV1YoutubeWebGetChannelShortVideosGet_0");
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
 **channelId** | **String**| 频道ID/Channel ID |
 **continuationToken** | **String**| 翻页令牌/Pagination token | [optional]

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


## getChannelVideosApiV1YoutubeWebGetChannelVideosGet

> ResponseModel getChannelVideosApiV1YoutubeWebGetChannelVideosGet(channelId, continuationToken)

获取频道视频/Get channel videos

# [中文] ### 用途: - 获取频道视频。 ### 参数: - channel_id: 频道ID。 - continuation_token: 用于继续获取频道视频的令牌。默认为None。 ### 返回: - 频道视频。  # [English] ### Purpose: - Get channel videos. ### Parameters: - channel_id: Channel ID. - continuation_token: Token to continue fetching channel videos. Default is None. ### Returns: - Channel videos.  # [示例/Example] channel_id &#x3D; \&quot;UCXuqSBlHAE6Xw-yeJA0Tunw\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String channelId = UCXuqSBlHAE6Xw-yeJA0Tunw; // String | 频道ID/Channel ID
        String continuationToken = "continuationToken_example"; // String | 翻页令牌/Pagination token
        try {
            ResponseModel result = apiInstance.getChannelVideosApiV1YoutubeWebGetChannelVideosGet(channelId, continuationToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getChannelVideosApiV1YoutubeWebGetChannelVideosGet");
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
 **channelId** | **String**| 频道ID/Channel ID |
 **continuationToken** | **String**| 翻页令牌/Pagination token | [optional]

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


## getChannelVideosApiV1YoutubeWebGetChannelVideosGet_0

> ResponseModel getChannelVideosApiV1YoutubeWebGetChannelVideosGet_0(channelId, continuationToken)

获取频道视频/Get channel videos

# [中文] ### 用途: - 获取频道视频。 ### 参数: - channel_id: 频道ID。 - continuation_token: 用于继续获取频道视频的令牌。默认为None。 ### 返回: - 频道视频。  # [English] ### Purpose: - Get channel videos. ### Parameters: - channel_id: Channel ID. - continuation_token: Token to continue fetching channel videos. Default is None. ### Returns: - Channel videos.  # [示例/Example] channel_id &#x3D; \&quot;UCXuqSBlHAE6Xw-yeJA0Tunw\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String channelId = UCXuqSBlHAE6Xw-yeJA0Tunw; // String | 频道ID/Channel ID
        String continuationToken = "continuationToken_example"; // String | 翻页令牌/Pagination token
        try {
            ResponseModel result = apiInstance.getChannelVideosApiV1YoutubeWebGetChannelVideosGet_0(channelId, continuationToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getChannelVideosApiV1YoutubeWebGetChannelVideosGet_0");
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
 **channelId** | **String**| 频道ID/Channel ID |
 **continuationToken** | **String**| 翻页令牌/Pagination token | [optional]

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


## getRelateVideoApiV1YoutubeWebGetRelateVideoGet

> ResponseModel getRelateVideoApiV1YoutubeWebGetRelateVideoGet(videoId, continuationToken)

获取推荐视频/Get related videos

# [中文] ### 用途: - 根据视频ID获取推荐视频数据。 ### 参数: - video_id: 视频ID，从URL中获取，例如：https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc，这里的video_id就是LuIL5JATZsc。 - continuation_token: 用于继续获取推荐视频的令牌。默认为None。 ### 返回: - 推荐视频数据。  # [English] ### Purpose: - Get related videos by video ID. ### Parameters: - video_id: Video ID, get it from the URL, for example: https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc, the id is LuIL5JATZsc. - continuation_token: Token to continue fetching related videos. Default is None. ### Returns: - Related videos.  # [示例/Example] video_id &#x3D; \&quot;LuIL5JATZsc\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String videoId = LuIL5JATZsc; // String | 视频ID/Video ID
        String continuationToken = "continuationToken_example"; // String | 翻页令牌/Pagination token
        try {
            ResponseModel result = apiInstance.getRelateVideoApiV1YoutubeWebGetRelateVideoGet(videoId, continuationToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getRelateVideoApiV1YoutubeWebGetRelateVideoGet");
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
 **videoId** | **String**| 视频ID/Video ID |
 **continuationToken** | **String**| 翻页令牌/Pagination token | [optional]

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


## getRelateVideoApiV1YoutubeWebGetRelateVideoGet_0

> ResponseModel getRelateVideoApiV1YoutubeWebGetRelateVideoGet_0(videoId, continuationToken)

获取推荐视频/Get related videos

# [中文] ### 用途: - 根据视频ID获取推荐视频数据。 ### 参数: - video_id: 视频ID，从URL中获取，例如：https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc，这里的video_id就是LuIL5JATZsc。 - continuation_token: 用于继续获取推荐视频的令牌。默认为None。 ### 返回: - 推荐视频数据。  # [English] ### Purpose: - Get related videos by video ID. ### Parameters: - video_id: Video ID, get it from the URL, for example: https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc, the id is LuIL5JATZsc. - continuation_token: Token to continue fetching related videos. Default is None. ### Returns: - Related videos.  # [示例/Example] video_id &#x3D; \&quot;LuIL5JATZsc\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String videoId = LuIL5JATZsc; // String | 视频ID/Video ID
        String continuationToken = "continuationToken_example"; // String | 翻页令牌/Pagination token
        try {
            ResponseModel result = apiInstance.getRelateVideoApiV1YoutubeWebGetRelateVideoGet_0(videoId, continuationToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getRelateVideoApiV1YoutubeWebGetRelateVideoGet_0");
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
 **videoId** | **String**| 视频ID/Video ID |
 **continuationToken** | **String**| 翻页令牌/Pagination token | [optional]

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


## getTrendingVideosApiV1YoutubeWebGetTrendingVideosGet

> ResponseModel getTrendingVideosApiV1YoutubeWebGetTrendingVideosGet(languageCode, countryCode, section)

获取趋势视频/Get trending videos

# [中文] ### 用途: - 获取趋势视频。 ### 参数: - language_code: 语言代码，默认为en。 - country_code: 国家代码，默认为us。 - section: 类型，默认为Now，可选值为Music, Gaming, Movies。 ### 返回: - 趋势视频。  # [English] ### Purpose: - Get trending videos. ### Parameters: - language_code: Language code, default is en. - country_code: Country code, default is us. - section: Section, default is Now, optional values are Music, Gaming, Movies. ### Returns: - Trending videos.  # [示例/Example]

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String languageCode = "\"en\""; // String | 语言代码/Language code
        String countryCode = "\"us\""; // String | 国家代码/Country code
        String section = "\"Now\""; // String | 类型/Section
        try {
            ResponseModel result = apiInstance.getTrendingVideosApiV1YoutubeWebGetTrendingVideosGet(languageCode, countryCode, section);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getTrendingVideosApiV1YoutubeWebGetTrendingVideosGet");
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
 **languageCode** | **String**| 语言代码/Language code | [optional] [default to &quot;en&quot;]
 **countryCode** | **String**| 国家代码/Country code | [optional] [default to &quot;us&quot;]
 **section** | **String**| 类型/Section | [optional] [default to &quot;Now&quot;]

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


## getTrendingVideosApiV1YoutubeWebGetTrendingVideosGet_0

> ResponseModel getTrendingVideosApiV1YoutubeWebGetTrendingVideosGet_0(languageCode, countryCode, section)

获取趋势视频/Get trending videos

# [中文] ### 用途: - 获取趋势视频。 ### 参数: - language_code: 语言代码，默认为en。 - country_code: 国家代码，默认为us。 - section: 类型，默认为Now，可选值为Music, Gaming, Movies。 ### 返回: - 趋势视频。  # [English] ### Purpose: - Get trending videos. ### Parameters: - language_code: Language code, default is en. - country_code: Country code, default is us. - section: Section, default is Now, optional values are Music, Gaming, Movies. ### Returns: - Trending videos.  # [示例/Example]

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String languageCode = "\"en\""; // String | 语言代码/Language code
        String countryCode = "\"us\""; // String | 国家代码/Country code
        String section = "\"Now\""; // String | 类型/Section
        try {
            ResponseModel result = apiInstance.getTrendingVideosApiV1YoutubeWebGetTrendingVideosGet_0(languageCode, countryCode, section);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getTrendingVideosApiV1YoutubeWebGetTrendingVideosGet_0");
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
 **languageCode** | **String**| 语言代码/Language code | [optional] [default to &quot;en&quot;]
 **countryCode** | **String**| 国家代码/Country code | [optional] [default to &quot;us&quot;]
 **section** | **String**| 类型/Section | [optional] [default to &quot;Now&quot;]

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


## getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet

> ResponseModel getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet(videoId, continuationToken)

获取视频评论/Get video comments

# [中文] ### 用途: - 获取单个视频的评论。 ### 参数: - video_id: 视频ID，从URL中获取，例如：https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc，这里的id就是LuIL5JATZsc。 - continuation_token: 用于继续获取评论的令牌。默认为None。 ### 返回: - 视频评论。  # [English] ### Purpose: - Get comments of a single video. ### Parameters: - id: Video ID, get it from the URL, for example: https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc, the id is LuIL5JATZsc. - continuation_token: Token to continue fetching comments. Default is None. ### Returns: - Video comments.  # [示例/Example] id &#x3D; \&quot;LuIL5JATZsc\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String videoId = LuIL5JATZsc; // String | 视频ID/Video ID
        String continuationToken = "continuationToken_example"; // String | 翻页令牌/Pagination token
        try {
            ResponseModel result = apiInstance.getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet(videoId, continuationToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet");
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
 **videoId** | **String**| 视频ID/Video ID |
 **continuationToken** | **String**| 翻页令牌/Pagination token | [optional]

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


## getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet_0

> ResponseModel getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet_0(videoId, continuationToken)

获取视频评论/Get video comments

# [中文] ### 用途: - 获取单个视频的评论。 ### 参数: - video_id: 视频ID，从URL中获取，例如：https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc，这里的id就是LuIL5JATZsc。 - continuation_token: 用于继续获取评论的令牌。默认为None。 ### 返回: - 视频评论。  # [English] ### Purpose: - Get comments of a single video. ### Parameters: - id: Video ID, get it from the URL, for example: https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc, the id is LuIL5JATZsc. - continuation_token: Token to continue fetching comments. Default is None. ### Returns: - Video comments.  # [示例/Example] id &#x3D; \&quot;LuIL5JATZsc\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String videoId = LuIL5JATZsc; // String | 视频ID/Video ID
        String continuationToken = "continuationToken_example"; // String | 翻页令牌/Pagination token
        try {
            ResponseModel result = apiInstance.getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet_0(videoId, continuationToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet_0");
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
 **videoId** | **String**| 视频ID/Video ID |
 **continuationToken** | **String**| 翻页令牌/Pagination token | [optional]

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


## getVideoInfoApiV1YoutubeWebGetVideoInfoGet

> ResponseModel getVideoInfoApiV1YoutubeWebGetVideoInfoGet(videoId)

获取视频信息/Get video information

# [中文] ### 用途: - 获取单个视频的信息，包括视频下载链接、标题、作者、发布日期、观看次数、点赞次数、不喜欢次数、评论次数、时长、描述等。 ### 参数: - video_id: 视频ID，从URL中获取，例如：https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc，这里的video_id就是LuIL5JATZsc。 ### 返回: - 视频信息。  # [English] ### Purpose: - Get information of a single video, including video download link, title, author, publish date, view count, like count, dislike count, comment count, duration, description, etc. ### Parameters: - video_id: Video ID, get it from the URL, for example: https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc, the id is LuIL5JATZsc. ### Returns: - Video information.  # [示例/Example] video_id &#x3D; \&quot;LuIL5JATZsc\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String videoId = LuIL5JATZsc; // String | 视频ID/Video ID
        try {
            ResponseModel result = apiInstance.getVideoInfoApiV1YoutubeWebGetVideoInfoGet(videoId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getVideoInfoApiV1YoutubeWebGetVideoInfoGet");
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
 **videoId** | **String**| 视频ID/Video ID |

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


## getVideoInfoApiV1YoutubeWebGetVideoInfoGet_0

> ResponseModel getVideoInfoApiV1YoutubeWebGetVideoInfoGet_0(videoId)

获取视频信息/Get video information

# [中文] ### 用途: - 获取单个视频的信息，包括视频下载链接、标题、作者、发布日期、观看次数、点赞次数、不喜欢次数、评论次数、时长、描述等。 ### 参数: - video_id: 视频ID，从URL中获取，例如：https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc，这里的video_id就是LuIL5JATZsc。 ### 返回: - 视频信息。  # [English] ### Purpose: - Get information of a single video, including video download link, title, author, publish date, view count, like count, dislike count, comment count, duration, description, etc. ### Parameters: - video_id: Video ID, get it from the URL, for example: https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc, the id is LuIL5JATZsc. ### Returns: - Video information.  # [示例/Example] video_id &#x3D; \&quot;LuIL5JATZsc\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String videoId = LuIL5JATZsc; // String | 视频ID/Video ID
        try {
            ResponseModel result = apiInstance.getVideoInfoApiV1YoutubeWebGetVideoInfoGet_0(videoId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getVideoInfoApiV1YoutubeWebGetVideoInfoGet_0");
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
 **videoId** | **String**| 视频ID/Video ID |

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


## getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet

> ResponseModel getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet(videoId)

获取视频字幕/Get video subtitles

# [中文] ### 用途: - 获取单个视频的字幕。 ### 参数: - video_id: 视频ID，从URL中获取，例如：https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc，这里的video_id就是LuIL5JATZsc。 ### 返回: - 视频字幕。  # [English] ### Purpose: - Get subtitles of a single video. ### Parameters: - video_id: Video ID, get it from the URL, for example: https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc, the id is LuIL5JATZsc.  ### Returns: - Video subtitles.  # [示例/Example] video_id &#x3D; \&quot;LuIL5JATZsc\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String videoId = LuIL5JATZsc; // String | 视频ID/Video ID
        try {
            ResponseModel result = apiInstance.getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet(videoId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet");
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
 **videoId** | **String**| 视频ID/Video ID |

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


## getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet_0

> ResponseModel getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet_0(videoId)

获取视频字幕/Get video subtitles

# [中文] ### 用途: - 获取单个视频的字幕。 ### 参数: - video_id: 视频ID，从URL中获取，例如：https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc，这里的video_id就是LuIL5JATZsc。 ### 返回: - 视频字幕。  # [English] ### Purpose: - Get subtitles of a single video. ### Parameters: - video_id: Video ID, get it from the URL, for example: https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc, the id is LuIL5JATZsc.  ### Returns: - Video subtitles.  # [示例/Example] video_id &#x3D; \&quot;LuIL5JATZsc\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String videoId = LuIL5JATZsc; // String | 视频ID/Video ID
        try {
            ResponseModel result = apiInstance.getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet_0(videoId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet_0");
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
 **videoId** | **String**| 视频ID/Video ID |

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


## searchChannelApiV1YoutubeWebSearchChannelGet

> ResponseModel searchChannelApiV1YoutubeWebSearchChannelGet(channelId, searchQuery, languageCode, countryCode, continuationToken)

搜索频道/Search channel

# [中文] ### 用途: - 搜索频道。 ### 参数: - search_query: 搜索关键字。 - language_code: 语言代码，默认为en。 - country_code: 国家代码，默认为us。 - continuation_token: 用于继续获取搜索结果的令牌。默认为None。 ### 返回: - 搜索结果。  # [English] ### Purpose: - Search channel. ### Parameters: - search_query: Search keyword. - language_code: Language code, default is en. - country_code: Country code, default is us. - continuation_token: Token to continue fetching search results. Default is None. ### Returns: - Search results.  # [示例/Example] channel_id &#x3D; \&quot;UCXuqSBlHAE6Xw-yeJA0Tunw\&quot; search_query &#x3D; \&quot;AMD\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String channelId = UCXuqSBlHAE6Xw-yeJA0Tunw; // String | 频道ID/Channel ID
        String searchQuery = AMD; // String | 搜索关键字/Search keyword
        String languageCode = "\"en\""; // String | 语言代码/Language code
        String countryCode = "\"us\""; // String | 国家代码/Country code
        String continuationToken = "continuationToken_example"; // String | 翻页令牌/Pagination token
        try {
            ResponseModel result = apiInstance.searchChannelApiV1YoutubeWebSearchChannelGet(channelId, searchQuery, languageCode, countryCode, continuationToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#searchChannelApiV1YoutubeWebSearchChannelGet");
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
 **channelId** | **String**| 频道ID/Channel ID |
 **searchQuery** | **String**| 搜索关键字/Search keyword |
 **languageCode** | **String**| 语言代码/Language code | [optional] [default to &quot;en&quot;]
 **countryCode** | **String**| 国家代码/Country code | [optional] [default to &quot;us&quot;]
 **continuationToken** | **String**| 翻页令牌/Pagination token | [optional]

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


## searchChannelApiV1YoutubeWebSearchChannelGet_0

> ResponseModel searchChannelApiV1YoutubeWebSearchChannelGet_0(channelId, searchQuery, languageCode, countryCode, continuationToken)

搜索频道/Search channel

# [中文] ### 用途: - 搜索频道。 ### 参数: - search_query: 搜索关键字。 - language_code: 语言代码，默认为en。 - country_code: 国家代码，默认为us。 - continuation_token: 用于继续获取搜索结果的令牌。默认为None。 ### 返回: - 搜索结果。  # [English] ### Purpose: - Search channel. ### Parameters: - search_query: Search keyword. - language_code: Language code, default is en. - country_code: Country code, default is us. - continuation_token: Token to continue fetching search results. Default is None. ### Returns: - Search results.  # [示例/Example] channel_id &#x3D; \&quot;UCXuqSBlHAE6Xw-yeJA0Tunw\&quot; search_query &#x3D; \&quot;AMD\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String channelId = UCXuqSBlHAE6Xw-yeJA0Tunw; // String | 频道ID/Channel ID
        String searchQuery = AMD; // String | 搜索关键字/Search keyword
        String languageCode = "\"en\""; // String | 语言代码/Language code
        String countryCode = "\"us\""; // String | 国家代码/Country code
        String continuationToken = "continuationToken_example"; // String | 翻页令牌/Pagination token
        try {
            ResponseModel result = apiInstance.searchChannelApiV1YoutubeWebSearchChannelGet_0(channelId, searchQuery, languageCode, countryCode, continuationToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#searchChannelApiV1YoutubeWebSearchChannelGet_0");
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
 **channelId** | **String**| 频道ID/Channel ID |
 **searchQuery** | **String**| 搜索关键字/Search keyword |
 **languageCode** | **String**| 语言代码/Language code | [optional] [default to &quot;en&quot;]
 **countryCode** | **String**| 国家代码/Country code | [optional] [default to &quot;us&quot;]
 **continuationToken** | **String**| 翻页令牌/Pagination token | [optional]

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


## searchVideoApiV1YoutubeWebSearchVideoGet

> ResponseModel searchVideoApiV1YoutubeWebSearchVideoGet(searchQuery, languageCode, orderBy, countryCode, continuationToken)

搜索视频/Search video

# [中文] ### 用途: - 搜索视频。 ### 参数: - search_query: 搜索关键字。 - language_code: 语言代码，默认为en。 - order_by: 排序方式，默��为this_month。 - country_code: 国家代码，默认为us。 - continuation_token: 用于继续获取搜索结果的令牌。默认为None。 ### 返回: - 搜索结果。  # [English] ### Purpose: - Search video. ### Parameters: - search_query: Search keyword. - language_code: Language code, default is en. - order_by: Order by, default is this_month. - country_code: Country code, default is us. - continuation_token: Token to continue fetching search results. Default is None. ### Returns: - Search results.  # [示例/Example] search_query &#x3D; \&quot;Minecraft\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String searchQuery = Minecraft; // String | 搜索关键字/Search keyword
        String languageCode = "\"en\""; // String | 语言代码/Language code
        String orderBy = "\"this_month\""; // String | 排序方式/Order by
        String countryCode = "\"us\""; // String | 国家代码/Country code
        String continuationToken = "continuationToken_example"; // String | 翻页令牌/Pagination token
        try {
            ResponseModel result = apiInstance.searchVideoApiV1YoutubeWebSearchVideoGet(searchQuery, languageCode, orderBy, countryCode, continuationToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#searchVideoApiV1YoutubeWebSearchVideoGet");
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
 **searchQuery** | **String**| 搜索关键字/Search keyword |
 **languageCode** | **String**| 语言代码/Language code | [optional] [default to &quot;en&quot;]
 **orderBy** | **String**| 排序方式/Order by | [optional] [default to &quot;this_month&quot;]
 **countryCode** | **String**| 国家代码/Country code | [optional] [default to &quot;us&quot;]
 **continuationToken** | **String**| 翻页令牌/Pagination token | [optional]

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


## searchVideoApiV1YoutubeWebSearchVideoGet_0

> ResponseModel searchVideoApiV1YoutubeWebSearchVideoGet_0(searchQuery, languageCode, orderBy, countryCode, continuationToken)

搜索视频/Search video

# [中文] ### 用途: - 搜索视频。 ### 参数: - search_query: 搜索关键字。 - language_code: 语言代码，默认为en。 - order_by: 排序方式，默��为this_month。 - country_code: 国家代码，默认为us。 - continuation_token: 用于继续获取搜索结果的令牌。默认为None。 ### 返回: - 搜索结果。  # [English] ### Purpose: - Search video. ### Parameters: - search_query: Search keyword. - language_code: Language code, default is en. - order_by: Order by, default is this_month. - country_code: Country code, default is us. - continuation_token: Token to continue fetching search results. Default is None. ### Returns: - Search results.  # [示例/Example] search_query &#x3D; \&quot;Minecraft\&quot;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.YouTubeWebApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
        String searchQuery = Minecraft; // String | 搜索关键字/Search keyword
        String languageCode = "\"en\""; // String | 语言代码/Language code
        String orderBy = "\"this_month\""; // String | 排序方式/Order by
        String countryCode = "\"us\""; // String | 国家代码/Country code
        String continuationToken = "continuationToken_example"; // String | 翻页令牌/Pagination token
        try {
            ResponseModel result = apiInstance.searchVideoApiV1YoutubeWebSearchVideoGet_0(searchQuery, languageCode, orderBy, countryCode, continuationToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling YouTubeWebApiApi#searchVideoApiV1YoutubeWebSearchVideoGet_0");
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
 **searchQuery** | **String**| 搜索关键字/Search keyword |
 **languageCode** | **String**| 语言代码/Language code | [optional] [default to &quot;en&quot;]
 **orderBy** | **String**| 排序方式/Order by | [optional] [default to &quot;this_month&quot;]
 **countryCode** | **String**| 国家代码/Country code | [optional] [default to &quot;us&quot;]
 **continuationToken** | **String**| 翻页令牌/Pagination token | [optional]

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

