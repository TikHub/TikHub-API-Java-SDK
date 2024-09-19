# YouTubeWebApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShortVideoInfoApiV1YoutubeWebGetShortVideoInfoGet**](YouTubeWebApiApi.md#getShortVideoInfoApiV1YoutubeWebGetShortVideoInfoGet) | **GET** /api/v1/youtube/web/get_short_video_info | 获取短视频信息/Get short video information
[**getShortVideoInfoApiV1YoutubeWebGetShortVideoInfoGet_0**](YouTubeWebApiApi.md#getShortVideoInfoApiV1YoutubeWebGetShortVideoInfoGet_0) | **GET** /api/v1/youtube/web/get_short_video_info | 获取短视频信息/Get short video information
[**getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet**](YouTubeWebApiApi.md#getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet) | **GET** /api/v1/youtube/web/get_video_comments | 获取视频评论/Get video comments
[**getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet_0**](YouTubeWebApiApi.md#getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet_0) | **GET** /api/v1/youtube/web/get_video_comments | 获取视频评论/Get video comments
[**getVideoInfoApiV1YoutubeWebGetVideoInfoGet**](YouTubeWebApiApi.md#getVideoInfoApiV1YoutubeWebGetVideoInfoGet) | **GET** /api/v1/youtube/web/get_video_info | 获取视频信息/Get video information
[**getVideoInfoApiV1YoutubeWebGetVideoInfoGet_0**](YouTubeWebApiApi.md#getVideoInfoApiV1YoutubeWebGetVideoInfoGet_0) | **GET** /api/v1/youtube/web/get_video_info | 获取视频信息/Get video information
[**getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet**](YouTubeWebApiApi.md#getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet) | **GET** /api/v1/youtube/web/get_video_subtitles | 获取视频字幕/Get video subtitles
[**getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet_0**](YouTubeWebApiApi.md#getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet_0) | **GET** /api/v1/youtube/web/get_video_subtitles | 获取视频字幕/Get video subtitles


<a name="getShortVideoInfoApiV1YoutubeWebGetShortVideoInfoGet"></a>
# **getShortVideoInfoApiV1YoutubeWebGetShortVideoInfoGet**
> ResponseModel getShortVideoInfoApiV1YoutubeWebGetShortVideoInfoGet(id)

获取短视频信息/Get short video information

# [中文] ### 用途: - 获取单个短视频的信息。 ### 参数: - id: 视频ID，从URL中获取，例如：https://www.youtube.com/shorts/r9O6jShqvUQ，这里的id就是r9O6jShqvUQ。 ### 返回: - 短视频信息。  # [English] ### Purpose: - Get information of a single short video. ### Parameters: - id: Video ID, get it from the URL, for example: https://www.youtube.com/shorts/r9O6jShqvUQ, the id is r9O6jShqvUQ. ### Returns: - Short video information.  # [示例/Example] id &#x3D; \&quot;r9O6jShqvUQ\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.YouTubeWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
    String id = r9O6jShqvUQ; // String | 视频ID/Video ID
    try {
      ResponseModel result = apiInstance.getShortVideoInfoApiV1YoutubeWebGetShortVideoInfoGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YouTubeWebApiApi#getShortVideoInfoApiV1YoutubeWebGetShortVideoInfoGet");
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
 **id** | **String**| 视频ID/Video ID |

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

<a name="getShortVideoInfoApiV1YoutubeWebGetShortVideoInfoGet_0"></a>
# **getShortVideoInfoApiV1YoutubeWebGetShortVideoInfoGet_0**
> ResponseModel getShortVideoInfoApiV1YoutubeWebGetShortVideoInfoGet_0(id)

获取短视频信息/Get short video information

# [中文] ### 用途: - 获取单个短视频的信息。 ### 参数: - id: 视频ID，从URL中获取，例如：https://www.youtube.com/shorts/r9O6jShqvUQ，这里的id就是r9O6jShqvUQ。 ### 返回: - 短视频信息。  # [English] ### Purpose: - Get information of a single short video. ### Parameters: - id: Video ID, get it from the URL, for example: https://www.youtube.com/shorts/r9O6jShqvUQ, the id is r9O6jShqvUQ. ### Returns: - Short video information.  # [示例/Example] id &#x3D; \&quot;r9O6jShqvUQ\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.YouTubeWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
    String id = r9O6jShqvUQ; // String | 视频ID/Video ID
    try {
      ResponseModel result = apiInstance.getShortVideoInfoApiV1YoutubeWebGetShortVideoInfoGet_0(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YouTubeWebApiApi#getShortVideoInfoApiV1YoutubeWebGetShortVideoInfoGet_0");
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
 **id** | **String**| 视频ID/Video ID |

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

<a name="getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet"></a>
# **getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet**
> ResponseModel getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet(id, continuation, sortBy)

获取视频评论/Get video comments

# [中文] ### 用途: - 获取单个视频的评论。 ### 参数: - id: 视频ID，从URL中获取，例如：https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc，这里的id就是LuIL5JATZsc。 - continuation: 用于继续获取评论的令牌。默认为None。 - sort_by: 选项：top, newest ### 返回: - 视频评论。  # [English] ### Purpose: - Get comments of a single video. ### Parameters: - id: Video ID, get it from the URL, for example: https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc, the id is LuIL5JATZsc. - continuation: Token to continue fetching comments. Default is None. - sort_by: Options: top, newest ### Returns: - Video comments.  # [示例/Example] id &#x3D; \&quot;LuIL5JATZsc\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.YouTubeWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
    String id = LuIL5JATZsc; // String | 视频ID/Video ID
    String continuation = "continuation_example"; // String | Token to continue fetching comments
    String sortBy = "sortBy_example"; // String | Options: top, newest
    try {
      ResponseModel result = apiInstance.getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet(id, continuation, sortBy);
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
 **id** | **String**| 视频ID/Video ID |
 **continuation** | **String**| Token to continue fetching comments | [optional]
 **sortBy** | **String**| Options: top, newest | [optional]

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

<a name="getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet_0"></a>
# **getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet_0**
> ResponseModel getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet_0(id, continuation, sortBy)

获取视频评论/Get video comments

# [中文] ### 用途: - 获取单个视频的评论。 ### 参数: - id: 视频ID，从URL中获取，例如：https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc，这里的id就是LuIL5JATZsc。 - continuation: 用于继续获取评论的令牌。默认为None。 - sort_by: 选项：top, newest ### 返回: - 视频评论。  # [English] ### Purpose: - Get comments of a single video. ### Parameters: - id: Video ID, get it from the URL, for example: https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc, the id is LuIL5JATZsc. - continuation: Token to continue fetching comments. Default is None. - sort_by: Options: top, newest ### Returns: - Video comments.  # [示例/Example] id &#x3D; \&quot;LuIL5JATZsc\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.YouTubeWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
    String id = LuIL5JATZsc; // String | 视频ID/Video ID
    String continuation = "continuation_example"; // String | Token to continue fetching comments
    String sortBy = "sortBy_example"; // String | Options: top, newest
    try {
      ResponseModel result = apiInstance.getVideoCommentsApiV1YoutubeWebGetVideoCommentsGet_0(id, continuation, sortBy);
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
 **id** | **String**| 视频ID/Video ID |
 **continuation** | **String**| Token to continue fetching comments | [optional]
 **sortBy** | **String**| Options: top, newest | [optional]

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

<a name="getVideoInfoApiV1YoutubeWebGetVideoInfoGet"></a>
# **getVideoInfoApiV1YoutubeWebGetVideoInfoGet**
> ResponseModel getVideoInfoApiV1YoutubeWebGetVideoInfoGet(id)

获取视频信息/Get video information

# [中文] ### 用途: - 获取单个视频的信息。 ### 参数: - id: 视频ID，从URL中获取，例如：https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc，这里的id就是LuIL5JATZsc。 ### 返回: - 视频信息。  # [English] ### Purpose: - Get information of a single video. ### Parameters: - id: Video ID, get it from the URL, for example: https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc, the id is LuIL5JATZsc. ### Returns: - Video information.  # [示例/Example] id &#x3D; \&quot;LuIL5JATZsc\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.YouTubeWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
    String id = LuIL5JATZsc; // String | 视频ID/Video ID
    try {
      ResponseModel result = apiInstance.getVideoInfoApiV1YoutubeWebGetVideoInfoGet(id);
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
 **id** | **String**| 视频ID/Video ID |

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

<a name="getVideoInfoApiV1YoutubeWebGetVideoInfoGet_0"></a>
# **getVideoInfoApiV1YoutubeWebGetVideoInfoGet_0**
> ResponseModel getVideoInfoApiV1YoutubeWebGetVideoInfoGet_0(id)

获取视频信息/Get video information

# [中文] ### 用途: - 获取单个视频的信息。 ### 参数: - id: 视频ID，从URL中获取，例如：https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc，这里的id就是LuIL5JATZsc。 ### 返回: - 视频信息。  # [English] ### Purpose: - Get information of a single video. ### Parameters: - id: Video ID, get it from the URL, for example: https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc, the id is LuIL5JATZsc. ### Returns: - Video information.  # [示例/Example] id &#x3D; \&quot;LuIL5JATZsc\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.YouTubeWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
    String id = LuIL5JATZsc; // String | 视频ID/Video ID
    try {
      ResponseModel result = apiInstance.getVideoInfoApiV1YoutubeWebGetVideoInfoGet_0(id);
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
 **id** | **String**| 视频ID/Video ID |

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

<a name="getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet"></a>
# **getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet**
> ResponseModel getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet(id, format)

获取视频字幕/Get video subtitles

# [中文] ### 用途: - 获取单个视频的字幕。 ### 参数: - id: 视频ID，从URL中获取，例如：https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc，这里的id就是LuIL5JATZsc。 - format: 字幕格式， - 字幕可选项：     - json3     - srv1     - srv2     - srv3     - ttml     - vtt ### 返回: - 视频字幕。  # [English] ### Purpose: - Get subtitles of a single video. ### Parameters: - id: Video ID, get it from the URL, for example: https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc, the id is LuIL5JATZsc. - format: Subtitle format, - Subtitle format options:     - json3     - srv1     - srv2     - srv3     - ttml     - vtt ### Returns: - Video subtitles.  # [示例/Example] id &#x3D; \&quot;LuIL5JATZsc\&quot; format &#x3D; \&quot;json3\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.YouTubeWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
    String id = LuIL5JATZsc; // String | 视频ID/Video ID
    String format = "\"json3\""; // String | 字幕格式/Subtitle format
    try {
      ResponseModel result = apiInstance.getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet(id, format);
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
 **id** | **String**| 视频ID/Video ID |
 **format** | **String**| 字幕格式/Subtitle format | [optional] [default to &quot;json3&quot;]

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

<a name="getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet_0"></a>
# **getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet_0**
> ResponseModel getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet_0(id, format)

获取视频字幕/Get video subtitles

# [中文] ### 用途: - 获取单个视频的字幕。 ### 参数: - id: 视频ID，从URL中获取，例如：https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc，这里的id就是LuIL5JATZsc。 - format: 字幕格式， - 字幕可选项：     - json3     - srv1     - srv2     - srv3     - ttml     - vtt ### 返回: - 视频字幕。  # [English] ### Purpose: - Get subtitles of a single video. ### Parameters: - id: Video ID, get it from the URL, for example: https://www.youtube.com/watch?v&#x3D;LuIL5JATZsc, the id is LuIL5JATZsc. - format: Subtitle format, - Subtitle format options:     - json3     - srv1     - srv2     - srv3     - ttml     - vtt ### Returns: - Video subtitles.  # [示例/Example] id &#x3D; \&quot;LuIL5JATZsc\&quot; format &#x3D; \&quot;json3\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.YouTubeWebApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    YouTubeWebApiApi apiInstance = new YouTubeWebApiApi(defaultClient);
    String id = LuIL5JATZsc; // String | 视频ID/Video ID
    String format = "\"json3\""; // String | 字幕格式/Subtitle format
    try {
      ResponseModel result = apiInstance.getVideoSubtitlesApiV1YoutubeWebGetVideoSubtitlesGet_0(id, format);
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
 **id** | **String**| 视频ID/Video ID |
 **format** | **String**| 字幕格式/Subtitle format | [optional] [default to &quot;json3&quot;]

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

