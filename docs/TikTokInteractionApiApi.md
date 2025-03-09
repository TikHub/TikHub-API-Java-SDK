# TikTokInteractionApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyForScopeApiV1TiktokInteractionApplyGet**](TikTokInteractionApiApi.md#applyForScopeApiV1TiktokInteractionApplyGet) | **GET** /api/v1/tiktok/interaction/apply | 申请使用TikTok交互API权限（Scope）/Apply for TikTok Interaction API permission (Scope)
[**applyForScopeApiV1TiktokInteractionApplyGet_0**](TikTokInteractionApiApi.md#applyForScopeApiV1TiktokInteractionApplyGet_0) | **GET** /api/v1/tiktok/interaction/apply | 申请使用TikTok交互API权限（Scope）/Apply for TikTok Interaction API permission (Scope)
[**collectApiV1TiktokInteractionCollectPost**](TikTokInteractionApiApi.md#collectApiV1TiktokInteractionCollectPost) | **POST** /api/v1/tiktok/interaction/collect | 收藏/Collect
[**collectApiV1TiktokInteractionCollectPost_0**](TikTokInteractionApiApi.md#collectApiV1TiktokInteractionCollectPost_0) | **POST** /api/v1/tiktok/interaction/collect | 收藏/Collect
[**followApiV1TiktokInteractionFollowPost**](TikTokInteractionApiApi.md#followApiV1TiktokInteractionFollowPost) | **POST** /api/v1/tiktok/interaction/follow | 关注/Follow
[**followApiV1TiktokInteractionFollowPost_0**](TikTokInteractionApiApi.md#followApiV1TiktokInteractionFollowPost_0) | **POST** /api/v1/tiktok/interaction/follow | 关注/Follow
[**forwardApiV1TiktokInteractionForwardPost**](TikTokInteractionApiApi.md#forwardApiV1TiktokInteractionForwardPost) | **POST** /api/v1/tiktok/interaction/forward | 转发/Forward
[**forwardApiV1TiktokInteractionForwardPost_0**](TikTokInteractionApiApi.md#forwardApiV1TiktokInteractionForwardPost_0) | **POST** /api/v1/tiktok/interaction/forward | 转发/Forward
[**likeApiV1TiktokInteractionLikePost**](TikTokInteractionApiApi.md#likeApiV1TiktokInteractionLikePost) | **POST** /api/v1/tiktok/interaction/like | 点赞/Like
[**likeApiV1TiktokInteractionLikePost_0**](TikTokInteractionApiApi.md#likeApiV1TiktokInteractionLikePost_0) | **POST** /api/v1/tiktok/interaction/like | 点赞/Like
[**postCommentApiV1TiktokInteractionPostCommentPost**](TikTokInteractionApiApi.md#postCommentApiV1TiktokInteractionPostCommentPost) | **POST** /api/v1/tiktok/interaction/post_comment | 发送评论/Post comment
[**postCommentApiV1TiktokInteractionPostCommentPost_0**](TikTokInteractionApiApi.md#postCommentApiV1TiktokInteractionPostCommentPost_0) | **POST** /api/v1/tiktok/interaction/post_comment | 发送评论/Post comment
[**replyCommentApiV1TiktokInteractionReplyCommentPost**](TikTokInteractionApiApi.md#replyCommentApiV1TiktokInteractionReplyCommentPost) | **POST** /api/v1/tiktok/interaction/reply_comment | 回复评论/Reply to comment
[**replyCommentApiV1TiktokInteractionReplyCommentPost_0**](TikTokInteractionApiApi.md#replyCommentApiV1TiktokInteractionReplyCommentPost_0) | **POST** /api/v1/tiktok/interaction/reply_comment | 回复评论/Reply to comment



## applyForScopeApiV1TiktokInteractionApplyGet

> ResponseModel applyForScopeApiV1TiktokInteractionApplyGet(apiKey, inviteCode)

申请使用TikTok交互API权限（Scope）/Apply for TikTok Interaction API permission (Scope)

# [通知] - 此接口已经废弃，用户现在无需手动申请调用权限，只需要在用户后台更新API Key的对应权限即可，即API Key对应的的Scope。 # [中文] ### 接口用途: - 申请使用TikTok交互API的接口权限（Scope），请在使用交互类接口之前申请，否则将无法正常请求。 ### 申请流程: - 申请接口权限需要邀请码，如果你没有邀请码，可以在Discord服务器中联系管理员获取。 - Discord服务器链接: [TikHub Discord](https://discord.gg/aMEAS8Xsvz) ### 申请须知: - 此权限仅限于当前提交的API Key，不可跨API Key使用。 - 用户需要使用美国地区注册且有效的的TikTok账号进行登录，否则保证将无法正常请求。 - 用户需要使用美国地区的代理IP进行获取Cookie，否则将保证无法正常请求。 - 用户需要使用美国地区的代理IP进行请求，否则将无法保证正常请求。 ### 用户守则以及责任: - 请不要使用交互类接口对他人造成骚扰，或进行违法违规的操作，否则我们将会停止对你的服务，并且所有责任由你自己承担。 - 请不要将接口权限分享给他人，否则我们将会停止对你的服务。 - 接口请求目前暂时定为每秒5次请求。 ### 返回: - 申请结果以及申请的邀请码，请自行保留邀请码，以便后续使用。  # [Notice] - This interface has been deprecated, users no longer need to apply for permission to call the API, just update the corresponding permission of the API Key in the user background, that is, the Scope corresponding to the API Key. # [English] ### Purpose: - Apply for the interface permission (Scope) of TikTok Interaction API, please apply before using the interactive interface, otherwise the request will not be made normally. ### Application process: - Applying for interface permissions requires an invitation code, if you do not have an invitation code, you can contact the administrator on the Discord server. - Discord server link: [TikHub Discord](https://discord.gg/aMEAS8Xsvz) ### Application notes: - This permission is limited to the API Key submitted, and cannot be used across API Keys. - Users need to log in with a registered and valid TikTok account in the United States, otherwise the request will not be made normally. - Users need to use a proxy IP in the United States to obtain cookies, otherwise the request will not be made normally. - Users need to use a proxy IP in the United States for requests, otherwise the request will not be made normally. ### User guidelines and responsibilities: - Please do not use interactive interfaces to harass others, or engage in illegal or irregular operations, otherwise we will stop providing services to you, and all responsibilities will be borne by you. - Please do not share the interface permission with others, otherwise we will stop providing services to you. - The interface request is currently set to 5 requests per second. ### Return: - Application results and the invitation code applied for, please keep the invitation code for subsequent use.  # [示例/Example] &#x60;&#x60;&#x60;python # Python Code invite_code &#x3D; \&quot;Your_Invite_Code\&quot; &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TikTokInteractionApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TikTokInteractionApiApi apiInstance = new TikTokInteractionApiApi(defaultClient);
        String apiKey = "apiKey_example"; // String | 
        String inviteCode = "inviteCode_example"; // String | 
        try {
            ResponseModel result = apiInstance.applyForScopeApiV1TiktokInteractionApplyGet(apiKey, inviteCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TikTokInteractionApiApi#applyForScopeApiV1TiktokInteractionApplyGet");
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
 **apiKey** | **String**|  |
 **inviteCode** | **String**|  |

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


## applyForScopeApiV1TiktokInteractionApplyGet_0

> ResponseModel applyForScopeApiV1TiktokInteractionApplyGet_0(apiKey, inviteCode)

申请使用TikTok交互API权限（Scope）/Apply for TikTok Interaction API permission (Scope)

# [通知] - 此接口已经废弃，用户现在无需手动申请调用权限，只需要在用户后台更新API Key的对应权限即可，即API Key对应的的Scope。 # [中文] ### 接口用途: - 申请使用TikTok交互API的接口权限（Scope），请在使用交互类接口之前申请，否则将无法正常请求。 ### 申请流程: - 申请接口权限需要邀请码，如果你没有邀请码，可以在Discord服务器中联系管理员获取。 - Discord服务器链接: [TikHub Discord](https://discord.gg/aMEAS8Xsvz) ### 申请须知: - 此权限仅限于当前提交的API Key，不可跨API Key使用。 - 用户需要使用美国地区注册且有效的的TikTok账号进行登录，否则保证将无法正常请求。 - 用户需要使用美国地区的代理IP进行获取Cookie，否则将保证无法正常请求。 - 用户需要使用美国地区的代理IP进行请求，否则将无法保证正常请求。 ### 用户守则以及责任: - 请不要使用交互类接口对他人造成骚扰，或进行违法违规的操作，否则我们将会停止对你的服务，并且所有责任由你自己承担。 - 请不要将接口权限分享给他人，否则我们将会停止对你的服务。 - 接口请求目前暂时定为每秒5次请求。 ### 返回: - 申请结果以及申请的邀请码，请自行保留邀请码，以便后续使用。  # [Notice] - This interface has been deprecated, users no longer need to apply for permission to call the API, just update the corresponding permission of the API Key in the user background, that is, the Scope corresponding to the API Key. # [English] ### Purpose: - Apply for the interface permission (Scope) of TikTok Interaction API, please apply before using the interactive interface, otherwise the request will not be made normally. ### Application process: - Applying for interface permissions requires an invitation code, if you do not have an invitation code, you can contact the administrator on the Discord server. - Discord server link: [TikHub Discord](https://discord.gg/aMEAS8Xsvz) ### Application notes: - This permission is limited to the API Key submitted, and cannot be used across API Keys. - Users need to log in with a registered and valid TikTok account in the United States, otherwise the request will not be made normally. - Users need to use a proxy IP in the United States to obtain cookies, otherwise the request will not be made normally. - Users need to use a proxy IP in the United States for requests, otherwise the request will not be made normally. ### User guidelines and responsibilities: - Please do not use interactive interfaces to harass others, or engage in illegal or irregular operations, otherwise we will stop providing services to you, and all responsibilities will be borne by you. - Please do not share the interface permission with others, otherwise we will stop providing services to you. - The interface request is currently set to 5 requests per second. ### Return: - Application results and the invitation code applied for, please keep the invitation code for subsequent use.  # [示例/Example] &#x60;&#x60;&#x60;python # Python Code invite_code &#x3D; \&quot;Your_Invite_Code\&quot; &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TikTokInteractionApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TikTokInteractionApiApi apiInstance = new TikTokInteractionApiApi(defaultClient);
        String apiKey = "apiKey_example"; // String | 
        String inviteCode = "inviteCode_example"; // String | 
        try {
            ResponseModel result = apiInstance.applyForScopeApiV1TiktokInteractionApplyGet_0(apiKey, inviteCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TikTokInteractionApiApi#applyForScopeApiV1TiktokInteractionApplyGet_0");
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
 **apiKey** | **String**|  |
 **inviteCode** | **String**|  |

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


## collectApiV1TiktokInteractionCollectPost

> ResponseModel collectApiV1TiktokInteractionCollectPost(collectRequest)

收藏/Collect

# [中文] ### 用途: - 使用用户Cookie收藏指定视频，当前请尽可能使用美国地区的TikTok账号，并且在获取Cookie时请使用美国地区的代理IP。 ### 注意: - 交互类接口都需要使用用户的Cookie，因此请确保你的Cookie是有效的，否则将无法正常请求。 - 交互类的接口可能会导致账号异常或封禁，因此请谨慎使用，建议使用代理IP进行请求。 - 交互类接口的最终结果可能会受到TikTok风控系统的影响，大多数情况跟你所使用的账号有关，比如新注册的账号可能无法关注用户或点赞视频，我们无法处理基于账号的风控问题。 - 请不要使用交互类接口对他人造成骚扰，或进行违法违规的操作，否则我们将会停止对你的服务，并且所有责任由你自己承担。 ### 参数: - aweme_id: 视频id，可以从分享链接中获取，例如：https://www.tiktok.com/@username/video/7419966340443819295 - cookie: 用户Cookie，可以从浏览器中登录自己的TikTok账号，然后复制Cookie信息，提交时请使用URL编码Cookie字符串。 - device_id: 设备id，可选，如果不填写则会自动生成，如果需要自定义设备id，请使用设备信息接口获取设备id。 - iid: 设备安装id，可选，如果不填写则会自动生成，如果需要自定义设备iid，请使用设备信息接口获取设备iid。 - proxy: 代理IP，可选，如果不填写则会使用服务器IP进行请求（不推荐），建议使用代理IP进行请求防止账号异常获被封禁，支持格式如下：     - 代理IP:端口     - 用户名:密码@代理IP:端口 ### 返回: - 点赞结果以及评论数据和设备信息，请自行保留设备信息，如请求时使用的&#x60;device_id&#x60;以及&#x60;iid&#x60;，以便后续调用接口时使用，频繁更换设备信息可能会导致账号异常或封禁。  # [English] ### Purpose: - Collect a specified video using user cookies, please try to use TikTok accounts in the United States as much as possible, and use proxy IPs in the United States when obtaining cookies. ### Note: - Interactive interfaces all need to use the user&#39;s Cookie, so please make sure that your Cookie is valid, otherwise the request will not be made normally. - Interactive interfaces may cause account exceptions or bans, so please use them with caution, and it is recommended to use proxy IPs for requests. - The final result of the interactive interface may be affected by the TikTok risk control system, and in most cases it is related to the account you are using, for example, a newly registered account may not be able to follow users or like videos, and we cannot handle risk control issues based on accounts. - Please do not use interactive interfaces to harass others, or engage in illegal or irregular operations, otherwise we will stop providing services to you, and all responsibilities will be borne by you. ### Parameters: - aweme_id: Video id, which can be obtained from the sharing link, for example: https://www.tiktok.com/@username/video/7419966340443819295 - cookie: User Cookie, you can log in to your TikTok account in the browser and then copy the Cookie information, please use URL-encoded Cookie string when submitting. - device_id: Device id, optional, if not filled in, it will be automatically generated, if you need to customize the device id, please use the device information interface to get the device id. - iid: Device install id, optional, if not filled in, it will be automatically generated, if you need to customize the device iid, please use the device information interface to get the device iid. - proxy: Proxy IP, optional, if not filled in, the server IP will be used for the request (not recommended), it is recommended to use a proxy IP for the request to prevent account exceptions or bans, support the following formats:     - Proxy IP:Port     - Username:Password@Proxy IP:Port ### Return: - Like results, comment data and device information, please keep the device information, such as the &#x60;device_id&#x60; and &#x60;iid&#x60; used when requesting, for subsequent calls to the interface, frequent replacement of device information may cause account exceptions or bans.  # [示例/Example] &#x60;&#x60;&#x60;python # Python Code cookie &#x3D; urllib.parse.quote(\&quot;Your_Cookie_From_Browser\&quot;) payload &#x3D; {     \&quot;aweme_id\&quot;: \&quot;7419966340443819295\&quot;,     \&quot;cookie\&quot;: cookie,     \&quot;proxy\&quot;: \&quot;\&quot;, } &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TikTokInteractionApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TikTokInteractionApiApi apiInstance = new TikTokInteractionApiApi(defaultClient);
        CollectRequest collectRequest = new CollectRequest(); // CollectRequest | 
        try {
            ResponseModel result = apiInstance.collectApiV1TiktokInteractionCollectPost(collectRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TikTokInteractionApiApi#collectApiV1TiktokInteractionCollectPost");
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
 **collectRequest** | [**CollectRequest**](CollectRequest.md)|  | [optional]

### Return type

[**ResponseModel**](ResponseModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## collectApiV1TiktokInteractionCollectPost_0

> ResponseModel collectApiV1TiktokInteractionCollectPost_0(collectRequest)

收藏/Collect

# [中文] ### 用途: - 使用用户Cookie收藏指定视频，当前请尽可能使用美国地区的TikTok账号，并且在获取Cookie时请使用美国地区的代理IP。 ### 注意: - 交互类接口都需要使用用户的Cookie，因此请确保你的Cookie是有效的，否则将无法正常请求。 - 交互类的接口可能会导致账号异常或封禁，因此请谨慎使用，建议使用代理IP进行请求。 - 交互类接口的最终结果可能会受到TikTok风控系统的影响，大多数情况跟你所使用的账号有关，比如新注册的账号可能无法关注用户或点赞视频，我们无法处理基于账号的风控问题。 - 请不要使用交互类接口对他人造成骚扰，或进行违法违规的操作，否则我们将会停止对你的服务，并且所有责任由你自己承担。 ### 参数: - aweme_id: 视频id，可以从分享链接中获取，例如：https://www.tiktok.com/@username/video/7419966340443819295 - cookie: 用户Cookie，可以从浏览器中登录自己的TikTok账号，然后复制Cookie信息，提交时请使用URL编码Cookie字符串。 - device_id: 设备id，可选，如果不填写则会自动生成，如果需要自定义设备id，请使用设备信息接口获取设备id。 - iid: 设备安装id，可选，如果不填写则会自动生成，如果需要自定义设备iid，请使用设备信息接口获取设备iid。 - proxy: 代理IP，可选，如果不填写则会使用服务器IP进行请求（不推荐），建议使用代理IP进行请求防止账号异常获被封禁，支持格式如下：     - 代理IP:端口     - 用户名:密码@代理IP:端口 ### 返回: - 点赞结果以及评论数据和设备信息，请自行保留设备信息，如请求时使用的&#x60;device_id&#x60;以及&#x60;iid&#x60;，以便后续调用接口时使用，频繁更换设备信息可能会导致账号异常或封禁。  # [English] ### Purpose: - Collect a specified video using user cookies, please try to use TikTok accounts in the United States as much as possible, and use proxy IPs in the United States when obtaining cookies. ### Note: - Interactive interfaces all need to use the user&#39;s Cookie, so please make sure that your Cookie is valid, otherwise the request will not be made normally. - Interactive interfaces may cause account exceptions or bans, so please use them with caution, and it is recommended to use proxy IPs for requests. - The final result of the interactive interface may be affected by the TikTok risk control system, and in most cases it is related to the account you are using, for example, a newly registered account may not be able to follow users or like videos, and we cannot handle risk control issues based on accounts. - Please do not use interactive interfaces to harass others, or engage in illegal or irregular operations, otherwise we will stop providing services to you, and all responsibilities will be borne by you. ### Parameters: - aweme_id: Video id, which can be obtained from the sharing link, for example: https://www.tiktok.com/@username/video/7419966340443819295 - cookie: User Cookie, you can log in to your TikTok account in the browser and then copy the Cookie information, please use URL-encoded Cookie string when submitting. - device_id: Device id, optional, if not filled in, it will be automatically generated, if you need to customize the device id, please use the device information interface to get the device id. - iid: Device install id, optional, if not filled in, it will be automatically generated, if you need to customize the device iid, please use the device information interface to get the device iid. - proxy: Proxy IP, optional, if not filled in, the server IP will be used for the request (not recommended), it is recommended to use a proxy IP for the request to prevent account exceptions or bans, support the following formats:     - Proxy IP:Port     - Username:Password@Proxy IP:Port ### Return: - Like results, comment data and device information, please keep the device information, such as the &#x60;device_id&#x60; and &#x60;iid&#x60; used when requesting, for subsequent calls to the interface, frequent replacement of device information may cause account exceptions or bans.  # [示例/Example] &#x60;&#x60;&#x60;python # Python Code cookie &#x3D; urllib.parse.quote(\&quot;Your_Cookie_From_Browser\&quot;) payload &#x3D; {     \&quot;aweme_id\&quot;: \&quot;7419966340443819295\&quot;,     \&quot;cookie\&quot;: cookie,     \&quot;proxy\&quot;: \&quot;\&quot;, } &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TikTokInteractionApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TikTokInteractionApiApi apiInstance = new TikTokInteractionApiApi(defaultClient);
        CollectRequest collectRequest = new CollectRequest(); // CollectRequest | 
        try {
            ResponseModel result = apiInstance.collectApiV1TiktokInteractionCollectPost_0(collectRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TikTokInteractionApiApi#collectApiV1TiktokInteractionCollectPost_0");
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
 **collectRequest** | [**CollectRequest**](CollectRequest.md)|  | [optional]

### Return type

[**ResponseModel**](ResponseModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## followApiV1TiktokInteractionFollowPost

> ResponseModel followApiV1TiktokInteractionFollowPost(followRequest)

关注/Follow

# [中文] ### 用途: - 使用用户Cookie关注指定用户，当前请尽可能使用美国地区的TikTok账号，并且在获取Cookie时请使用美国地区的代理IP。 ### 注意: - 交互类接口都需要使用用户的Cookie，因此请确保你的Cookie是有效的，否则将无法正常请求。 - 交互类的接口可能会导致账号异常或封禁，因此请谨慎使用，建议使用代理IP进行请求。 - 交互类接口的最终结果可能会受到TikTok风控系统的影响，大多数情况跟你所使用的账号有关，比如新注册的账号可能无法关注用户或点赞视频，我们无法处理基于账号的风控问题。 - 请不要使用交互类接口对他人造成骚扰，或进行违法违规的操作，否则我们将会停止对你的服务，并且所有责任由你自己承担。 ### 参数: - user_id: 用户id，可以从接口&#x60;/api/v1/tiktok/app/v3/handler_user_profile&#x60;获取。 - sec_user_id: 用户sec_id，可以从分接口&#x60;/api/v1/tiktok/web/get_sec_user_id&#x60;获取。 - cookie: 用户Cookie，可以从浏览器中登录自己的TikTok账号，然后复制Cookie信息，提交时请使用URL编码Cookie字符串。 - device_id: 设备id，可选，如果不填写则会自动生成，如果需要自定义设备id，请使用设备信息接口获取设备id。 - iid: 设备安装id，可选，如果不填写则会自动生成，如果需要自定义设备iid，请使用设备信息接口获取设备iid。 - proxy: 代理IP，可选，如果不填写则会使用服务器IP进行请求（不推荐），建议使用代理IP进行请求防止账号异常获被封禁，支持格式如下：     - 代理IP:端口     - 用户名:密码@代理IP:端口 ### 返回: - 关注结果以及评论数据和设备信息，请自行保留设备信息，如请求时使用的&#x60;device_id&#x60;以及&#x60;iid&#x60;，以便后续调用接口时使用，频繁更换设备信息可能会导致账号异常或封禁。  # [English] ### Purpose: - Follow a specified user using user cookies, please try to use TikTok accounts in the United States as much as possible, and use proxy IPs in the United States when obtaining cookies. ### Note: - Interactive interfaces all need to use the user&#39;s Cookie, so please make sure that your Cookie is valid, otherwise the request will not be made normally. - Interactive interfaces may cause account exceptions or bans, so please use them with caution, and it is recommended to use proxy IPs for requests. - The final result of the interactive interface may be affected by the TikTok risk control system, and in most cases it is related to the account you are using, for example, a newly registered account may not be able to follow users or like videos, and we cannot handle risk control issues based on accounts. - Please do not use interactive interfaces to harass others, or engage in illegal or irregular operations, otherwise we will stop providing services to you, and all responsibilities will be borne by you. ### Parameters: - user_id: User id, which can be obtained from the sub-interface &#x60;/api/v1/tiktok/app/v3/handler_user_profile&#x60;. - sec_user_id: User sec_id, which can be obtained from the sub-interface &#x60;/api/v1/tiktok/web/get_sec_user_id&#x60;. - cookie: User Cookie, you can log in to your TikTok account in the browser and then copy the Cookie information, please use URL-encoded Cookie string when submitting. - device_id: Device id, optional, if not filled in, it will be automatically generated, if you need to customize the device id, please use the device information interface to get the device id. - iid: Device install id, optional, if not filled in, it will be automatically generated, if you need to customize the device iid, please use the device information interface to get the device iid. - proxy: Proxy IP, optional, if not filled in, the server IP will be used for the request (not recommended), it is recommended to use a proxy IP for the request to prevent account exceptions or bans, support the following formats:     - Proxy IP:Port     - Username:Password@Proxy IP:Port ### Return: - Follow results, comment data and device information, please keep the device information, such as the &#x60;device_id&#x60; and &#x60;iid&#x60; used when requesting, for subsequent calls to the interface, frequent replacement of device information may cause account exceptions or bans.  # [示例/Example] &#x60;&#x60;&#x60;python # Python Code cookie &#x3D; urllib.parse.quote(\&quot;Your_Cookie_From_Browser\&quot;) payload &#x3D; {     \&quot;user_id\&quot;: \&quot;6881290705605477381\&quot;,     \&quot;sec_user_id\&quot;: \&quot;MS4wLjABAAAAqB08cUbXaDWqbD6MCga2RbGTuhfO2EsHayBYx08NDrN7IE3jQuRDNNN6YwyfH6_6\&quot;,     \&quot;cookie\&quot;: cookie,     \&quot;proxy\&quot;: \&quot;\&quot;, } &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TikTokInteractionApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TikTokInteractionApiApi apiInstance = new TikTokInteractionApiApi(defaultClient);
        FollowRequest followRequest = new FollowRequest(); // FollowRequest | 
        try {
            ResponseModel result = apiInstance.followApiV1TiktokInteractionFollowPost(followRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TikTokInteractionApiApi#followApiV1TiktokInteractionFollowPost");
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
 **followRequest** | [**FollowRequest**](FollowRequest.md)|  | [optional]

### Return type

[**ResponseModel**](ResponseModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## followApiV1TiktokInteractionFollowPost_0

> ResponseModel followApiV1TiktokInteractionFollowPost_0(followRequest)

关注/Follow

# [中文] ### 用途: - 使用用户Cookie关注指定用户，当前请尽可能使用美国地区的TikTok账号，并且在获取Cookie时请使用美国地区的代理IP。 ### 注意: - 交互类接口都需要使用用户的Cookie，因此请确保你的Cookie是有效的，否则将无法正常请求。 - 交互类的接口可能会导致账号异常或封禁，因此请谨慎使用，建议使用代理IP进行请求。 - 交互类接口的最终结果可能会受到TikTok风控系统的影响，大多数情况跟你所使用的账号有关，比如新注册的账号可能无法关注用户或点赞视频，我们无法处理基于账号的风控问题。 - 请不要使用交互类接口对他人造成骚扰，或进行违法违规的操作，否则我们将会停止对你的服务，并且所有责任由你自己承担。 ### 参数: - user_id: 用户id，可以从接口&#x60;/api/v1/tiktok/app/v3/handler_user_profile&#x60;获取。 - sec_user_id: 用户sec_id，可以从分接口&#x60;/api/v1/tiktok/web/get_sec_user_id&#x60;获取。 - cookie: 用户Cookie，可以从浏览器中登录自己的TikTok账号，然后复制Cookie信息，提交时请使用URL编码Cookie字符串。 - device_id: 设备id，可选，如果不填写则会自动生成，如果需要自定义设备id，请使用设备信息接口获取设备id。 - iid: 设备安装id，可选，如果不填写则会自动生成，如果需要自定义设备iid，请使用设备信息接口获取设备iid。 - proxy: 代理IP，可选，如果不填写则会使用服务器IP进行请求（不推荐），建议使用代理IP进行请求防止账号异常获被封禁，支持格式如下：     - 代理IP:端口     - 用户名:密码@代理IP:端口 ### 返回: - 关注结果以及评论数据和设备信息，请自行保留设备信息，如请求时使用的&#x60;device_id&#x60;以及&#x60;iid&#x60;，以便后续调用接口时使用，频繁更换设备信息可能会导致账号异常或封禁。  # [English] ### Purpose: - Follow a specified user using user cookies, please try to use TikTok accounts in the United States as much as possible, and use proxy IPs in the United States when obtaining cookies. ### Note: - Interactive interfaces all need to use the user&#39;s Cookie, so please make sure that your Cookie is valid, otherwise the request will not be made normally. - Interactive interfaces may cause account exceptions or bans, so please use them with caution, and it is recommended to use proxy IPs for requests. - The final result of the interactive interface may be affected by the TikTok risk control system, and in most cases it is related to the account you are using, for example, a newly registered account may not be able to follow users or like videos, and we cannot handle risk control issues based on accounts. - Please do not use interactive interfaces to harass others, or engage in illegal or irregular operations, otherwise we will stop providing services to you, and all responsibilities will be borne by you. ### Parameters: - user_id: User id, which can be obtained from the sub-interface &#x60;/api/v1/tiktok/app/v3/handler_user_profile&#x60;. - sec_user_id: User sec_id, which can be obtained from the sub-interface &#x60;/api/v1/tiktok/web/get_sec_user_id&#x60;. - cookie: User Cookie, you can log in to your TikTok account in the browser and then copy the Cookie information, please use URL-encoded Cookie string when submitting. - device_id: Device id, optional, if not filled in, it will be automatically generated, if you need to customize the device id, please use the device information interface to get the device id. - iid: Device install id, optional, if not filled in, it will be automatically generated, if you need to customize the device iid, please use the device information interface to get the device iid. - proxy: Proxy IP, optional, if not filled in, the server IP will be used for the request (not recommended), it is recommended to use a proxy IP for the request to prevent account exceptions or bans, support the following formats:     - Proxy IP:Port     - Username:Password@Proxy IP:Port ### Return: - Follow results, comment data and device information, please keep the device information, such as the &#x60;device_id&#x60; and &#x60;iid&#x60; used when requesting, for subsequent calls to the interface, frequent replacement of device information may cause account exceptions or bans.  # [示例/Example] &#x60;&#x60;&#x60;python # Python Code cookie &#x3D; urllib.parse.quote(\&quot;Your_Cookie_From_Browser\&quot;) payload &#x3D; {     \&quot;user_id\&quot;: \&quot;6881290705605477381\&quot;,     \&quot;sec_user_id\&quot;: \&quot;MS4wLjABAAAAqB08cUbXaDWqbD6MCga2RbGTuhfO2EsHayBYx08NDrN7IE3jQuRDNNN6YwyfH6_6\&quot;,     \&quot;cookie\&quot;: cookie,     \&quot;proxy\&quot;: \&quot;\&quot;, } &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TikTokInteractionApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TikTokInteractionApiApi apiInstance = new TikTokInteractionApiApi(defaultClient);
        FollowRequest followRequest = new FollowRequest(); // FollowRequest | 
        try {
            ResponseModel result = apiInstance.followApiV1TiktokInteractionFollowPost_0(followRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TikTokInteractionApiApi#followApiV1TiktokInteractionFollowPost_0");
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
 **followRequest** | [**FollowRequest**](FollowRequest.md)|  | [optional]

### Return type

[**ResponseModel**](ResponseModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## forwardApiV1TiktokInteractionForwardPost

> ResponseModel forwardApiV1TiktokInteractionForwardPost(forwardRequest)

转发/Forward

# [中文] ### 用途: - 使用用户Cookie转发指定作品，当前请尽可能使用美国地区的TikTok账号，并且在获取Cookie时请使用美国地区的代理IP。 ### 注意: - 交互类接口都需要使用用户的Cookie，因此请确保你的Cookie是有效的，否则将无法正常请求。 - 交互类的接口可能会导致账号异常或封禁，因此请谨慎使用，建议使用代理IP进行请求。 - 交互类接口的最终结果可能会受到TikTok风控系统的影响，大多数情况跟你所使用的账号有关，比如新注册的账号可能无法关注用户或点赞视频，我们无法处理基于账号的风控问题。 - 请不要使用交互类接口对他人造成骚扰，或进行违法违规的操作，否则我们将会停止对你的服务，并且所有责任由你自己承担。 ### 参数: - aweme_id: 视频id，可以从分享链接中获取，例如：https://www.tiktok.com/@username/video/7419966340443819295 - cookie: 用户Cookie，可以从浏览器中登录自己的TikTok账号，然后复制Cookie信息，提交时请使用URL编码Cookie字符串。 - device_id: 设备id，可选，如果不填写则会自动生成，如果需要自定义设备id，请使用设备信息接口获取设备id。 - iid: 设备安装id，可选，如果不填写则会自动生成，如果需要自定义设备iid，请使用设备信息接口获取设备iid。 - proxy: 代理IP，可选，如果不填写则会使用服务器IP进行请求（不推荐），建议使用代理IP进行请求防止账号异常获被封禁，支持格式如下：     - 代理IP:端口     - 用户名:密码@代理IP:端口 ### 返回: - 关注结果以及评论数据和设备信息，请自行保留设备信息，如请求时使用的&#x60;device_id&#x60;以及&#x60;iid&#x60;，以便后续调用接口时使用，频繁更换设备信息可能会导致账号异常或封禁。  # [English] ### Purpose: - Forward a specified post using user cookies, please try to use TikTok accounts in the United States as much as possible, and use proxy IPs in the United States when obtaining cookies. ### Note: - Interactive interfaces all need to use the user&#39;s Cookie, so please make sure that your Cookie is valid, otherwise the request will not be made normally. - Interactive interfaces may cause account exceptions or bans, so please use them with caution, and it is recommended to use proxy IPs for requests. - The final result of the interactive interface may be affected by the TikTok risk control system, and in most cases it is related to the account you are using, for example, a newly registered account may not be able to follow users or like videos, and we cannot handle risk control issues based on accounts. - Please do not use interactive interfaces to harass others, or engage in illegal or irregular operations, otherwise we will stop providing services to you, and all responsibilities will be borne by you. ### Parameters: - aweme_id: Video id, which can be obtained from the sharing link, for example: https://www.tiktok.com/@username/video/7419966340443819295 - sec_user_id: User sec_id, which can be obtained from the sub-interface &#x60;/api/v1/tiktok/web/get_sec_user_id&#x60;. - cookie: User Cookie, you can log in to your TikTok account in the browser and then copy the Cookie information, please use URL-encoded Cookie string when submitting. - device_id: Device id, optional, if not filled in, it will be automatically generated, if you need to customize the device id, please use the device information interface to get the device id. - iid: Device install id, optional, if not filled in, it will be automatically generated, if you need to customize the device iid, please use the device information interface to get the device iid. - proxy: Proxy IP, optional, if not filled in, the server IP will be used for the request (not recommended), it is recommended to use a proxy IP for the request to prevent account exceptions or bans, support the following formats:     - Proxy IP:Port     - Username:Password@Proxy IP:Port ### Return: - Follow results, comment data and device information, please keep the device information, such as the &#x60;device_id&#x60; and &#x60;iid&#x60; used when requesting, for subsequent calls to the interface, frequent replacement of device information may cause account exceptions or bans.  # [示例/Example] &#x60;&#x60;&#x60;python # Python Code cookie &#x3D; urllib.parse.quote(\&quot;Your_Cookie_From_Browser\&quot;) payload &#x3D; {     \&quot;user_id\&quot;: \&quot;6881290705605477381\&quot;,     \&quot;sec_user_id\&quot;: \&quot;MS4wLjABAAAAqB08cUbXaDWqbD6MCga2RbGTuhfO2EsHayBYx08NDrN7IE3jQuRDNNN6YwyfH6_6\&quot;,     \&quot;cookie\&quot;: cookie,     \&quot;proxy\&quot;: \&quot;\&quot;, } &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TikTokInteractionApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TikTokInteractionApiApi apiInstance = new TikTokInteractionApiApi(defaultClient);
        ForwardRequest forwardRequest = new ForwardRequest(); // ForwardRequest | 
        try {
            ResponseModel result = apiInstance.forwardApiV1TiktokInteractionForwardPost(forwardRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TikTokInteractionApiApi#forwardApiV1TiktokInteractionForwardPost");
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
 **forwardRequest** | [**ForwardRequest**](ForwardRequest.md)|  | [optional]

### Return type

[**ResponseModel**](ResponseModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## forwardApiV1TiktokInteractionForwardPost_0

> ResponseModel forwardApiV1TiktokInteractionForwardPost_0(forwardRequest)

转发/Forward

# [中文] ### 用途: - 使用用户Cookie转发指定作品，当前请尽可能使用美国地区的TikTok账号，并且在获取Cookie时请使用美国地区的代理IP。 ### 注意: - 交互类接口都需要使用用户的Cookie，因此请确保你的Cookie是有效的，否则将无法正常请求。 - 交互类的接口可能会导致账号异常或封禁，因此请谨慎使用，建议使用代理IP进行请求。 - 交互类接口的最终结果可能会受到TikTok风控系统的影响，大多数情况跟你所使用的账号有关，比如新注册的账号可能无法关注用户或点赞视频，我们无法处理基于账号的风控问题。 - 请不要使用交互类接口对他人造成骚扰，或进行违法违规的操作，否则我们将会停止对你的服务，并且所有责任由你自己承担。 ### 参数: - aweme_id: 视频id，可以从分享链接中获取，例如：https://www.tiktok.com/@username/video/7419966340443819295 - cookie: 用户Cookie，可以从浏览器中登录自己的TikTok账号，然后复制Cookie信息，提交时请使用URL编码Cookie字符串。 - device_id: 设备id，可选，如果不填写则会自动生成，如果需要自定义设备id，请使用设备信息接口获取设备id。 - iid: 设备安装id，可选，如果不填写则会自动生成，如果需要自定义设备iid，请使用设备信息接口获取设备iid。 - proxy: 代理IP，可选，如果不填写则会使用服务器IP进行请求（不推荐），建议使用代理IP进行请求防止账号异常获被封禁，支持格式如下：     - 代理IP:端口     - 用户名:密码@代理IP:端口 ### 返回: - 关注结果以及评论数据和设备信息，请自行保留设备信息，如请求时使用的&#x60;device_id&#x60;以及&#x60;iid&#x60;，以便后续调用接口时使用，频繁更换设备信息可能会导致账号异常或封禁。  # [English] ### Purpose: - Forward a specified post using user cookies, please try to use TikTok accounts in the United States as much as possible, and use proxy IPs in the United States when obtaining cookies. ### Note: - Interactive interfaces all need to use the user&#39;s Cookie, so please make sure that your Cookie is valid, otherwise the request will not be made normally. - Interactive interfaces may cause account exceptions or bans, so please use them with caution, and it is recommended to use proxy IPs for requests. - The final result of the interactive interface may be affected by the TikTok risk control system, and in most cases it is related to the account you are using, for example, a newly registered account may not be able to follow users or like videos, and we cannot handle risk control issues based on accounts. - Please do not use interactive interfaces to harass others, or engage in illegal or irregular operations, otherwise we will stop providing services to you, and all responsibilities will be borne by you. ### Parameters: - aweme_id: Video id, which can be obtained from the sharing link, for example: https://www.tiktok.com/@username/video/7419966340443819295 - sec_user_id: User sec_id, which can be obtained from the sub-interface &#x60;/api/v1/tiktok/web/get_sec_user_id&#x60;. - cookie: User Cookie, you can log in to your TikTok account in the browser and then copy the Cookie information, please use URL-encoded Cookie string when submitting. - device_id: Device id, optional, if not filled in, it will be automatically generated, if you need to customize the device id, please use the device information interface to get the device id. - iid: Device install id, optional, if not filled in, it will be automatically generated, if you need to customize the device iid, please use the device information interface to get the device iid. - proxy: Proxy IP, optional, if not filled in, the server IP will be used for the request (not recommended), it is recommended to use a proxy IP for the request to prevent account exceptions or bans, support the following formats:     - Proxy IP:Port     - Username:Password@Proxy IP:Port ### Return: - Follow results, comment data and device information, please keep the device information, such as the &#x60;device_id&#x60; and &#x60;iid&#x60; used when requesting, for subsequent calls to the interface, frequent replacement of device information may cause account exceptions or bans.  # [示例/Example] &#x60;&#x60;&#x60;python # Python Code cookie &#x3D; urllib.parse.quote(\&quot;Your_Cookie_From_Browser\&quot;) payload &#x3D; {     \&quot;user_id\&quot;: \&quot;6881290705605477381\&quot;,     \&quot;sec_user_id\&quot;: \&quot;MS4wLjABAAAAqB08cUbXaDWqbD6MCga2RbGTuhfO2EsHayBYx08NDrN7IE3jQuRDNNN6YwyfH6_6\&quot;,     \&quot;cookie\&quot;: cookie,     \&quot;proxy\&quot;: \&quot;\&quot;, } &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TikTokInteractionApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TikTokInteractionApiApi apiInstance = new TikTokInteractionApiApi(defaultClient);
        ForwardRequest forwardRequest = new ForwardRequest(); // ForwardRequest | 
        try {
            ResponseModel result = apiInstance.forwardApiV1TiktokInteractionForwardPost_0(forwardRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TikTokInteractionApiApi#forwardApiV1TiktokInteractionForwardPost_0");
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
 **forwardRequest** | [**ForwardRequest**](ForwardRequest.md)|  | [optional]

### Return type

[**ResponseModel**](ResponseModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## likeApiV1TiktokInteractionLikePost

> ResponseModel likeApiV1TiktokInteractionLikePost(likeRequest)

点赞/Like

# [中文] ### 用途: - 使用用户Cookie点赞指定视频，当前请尽可能使用美国地区的TikTok账号，并且在获取Cookie时请使用美国地区的代理IP。 ### 注意: - 交互类接口都需要使用用户的Cookie，因此请确保你的Cookie是有效的，否则将无法正常请求。 - 交互类的接口可能会导致账号异常或封禁，因此请谨慎使用，建议使用代理IP进行请求。 - 交互类接口的最终结果可能会受到TikTok风控系统的影响，大多数情况跟你所使用的账号有关，比如新注册的账号可能无法关注用户或点赞视频，我们无法处理基于账号的风控问题。 - 请不要使用交互类接口对他人造成骚扰，或进行违法违规的操作，否则我们将会停止对你的服务，并且所有责任由你自己承担。 ### 参数: - aweme_id: 视频id，可以从分享链接中获取，例如：https://www.tiktok.com/@username/video/7419966340443819295 - cookie: 用户Cookie，可以从浏览器中登录自己的TikTok账号，然后复制Cookie信息，提交时请使用URL编码Cookie字符串。 - device_id: 设备id，可选，如果不填写则会自动生成，如果需要自定义设备id，请使用设备信息接口获取设备id。 - iid: 设备安装id，可选，如果不填写则会自动生成，如果需要自定义设备iid，请使用设备信息接口获取设备iid。 - proxy: 代理IP，可选，如果不填写则会使用服务器IP进行请求（不推荐），建议使用代理IP进行请求防止账号异常获被封禁，支持格式如下：     - 代理IP:端口     - 用户名:密码@代理IP:端口 ### 返回: - 点赞结果以及评论数据和设备信息，请自行保留设备信息，如请求时使用的&#x60;device_id&#x60;以及&#x60;iid&#x60;，以便后续调用接口时使用，频繁更换设备信息可能会导致账号异常或封禁。  # [English] ### Purpose: - Like a specified video using user cookies, please try to use TikTok accounts in the United States as much as possible, and use proxy IPs in the United States when obtaining cookies. ### Note: - Interactive interfaces all need to use the user&#39;s Cookie, so please make sure that your Cookie is valid, otherwise the request will not be made normally. - Interactive interfaces may cause account exceptions or bans, so please use them with caution, and it is recommended to use proxy IPs for requests. - The final result of the interactive interface may be affected by the TikTok risk control system, and in most cases it is related to the account you are using, for example, a newly registered account may not be able to follow users or like videos, and we cannot handle risk control issues based on accounts. - Please do not use interactive interfaces to harass others, or engage in illegal or irregular operations, otherwise we will stop providing services to you, and all responsibilities will be borne by you. ### Parameters: - aweme_id: Video id, which can be obtained from the sharing link, for example: https://www.tiktok.com/@username/video/7419966340443819295 - cookie: User Cookie, you can log in to your TikTok account in the browser and then copy the Cookie information, please use URL-encoded Cookie string when submitting. - device_id: Device id, optional, if not filled in, it will be automatically generated, if you need to customize the device id, please use the device information interface to get the device id. - iid: Device install id, optional, if not filled in, it will be automatically generated, if you need to customize the device iid, please use the device information interface to get the device iid. - proxy: Proxy IP, optional, if not filled in, the server IP will be used for the request (not recommended), it is recommended to use a proxy IP for the request to prevent account exceptions or bans, support the following formats:     - Proxy IP:Port     - Username:Password@Proxy IP:Port ### Return: - Like results, comment data and device information, please keep the device information, such as the &#x60;device_id&#x60; and &#x60;iid&#x60; used when requesting, for subsequent calls to the interface, frequent replacement of device information may cause account exceptions or bans.  # [示例/Example] &#x60;&#x60;&#x60;python # Python Code cookie &#x3D; urllib.parse.quote(\&quot;Your_Cookie_From_Browser\&quot;) payload &#x3D; {     \&quot;aweme_id\&quot;: \&quot;7419966340443819295\&quot;,     \&quot;cookie\&quot;: cookie,     \&quot;proxy\&quot;: \&quot;\&quot;, } &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TikTokInteractionApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TikTokInteractionApiApi apiInstance = new TikTokInteractionApiApi(defaultClient);
        LikeRequest likeRequest = new LikeRequest(); // LikeRequest | 
        try {
            ResponseModel result = apiInstance.likeApiV1TiktokInteractionLikePost(likeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TikTokInteractionApiApi#likeApiV1TiktokInteractionLikePost");
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
 **likeRequest** | [**LikeRequest**](LikeRequest.md)|  | [optional]

### Return type

[**ResponseModel**](ResponseModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## likeApiV1TiktokInteractionLikePost_0

> ResponseModel likeApiV1TiktokInteractionLikePost_0(likeRequest)

点赞/Like

# [中文] ### 用途: - 使用用户Cookie点赞指定视频，当前请尽可能使用美国地区的TikTok账号，并且在获取Cookie时请使用美国地区的代理IP。 ### 注意: - 交互类接口都需要使用用户的Cookie，因此请确保你的Cookie是有效的，否则将无法正常请求。 - 交互类的接口可能会导致账号异常或封禁，因此请谨慎使用，建议使用代理IP进行请求。 - 交互类接口的最终结果可能会受到TikTok风控系统的影响，大多数情况跟你所使用的账号有关，比如新注册的账号可能无法关注用户或点赞视频，我们无法处理基于账号的风控问题。 - 请不要使用交互类接口对他人造成骚扰，或进行违法违规的操作，否则我们将会停止对你的服务，并且所有责任由你自己承担。 ### 参数: - aweme_id: 视频id，可以从分享链接中获取，例如：https://www.tiktok.com/@username/video/7419966340443819295 - cookie: 用户Cookie，可以从浏览器中登录自己的TikTok账号，然后复制Cookie信息，提交时请使用URL编码Cookie字符串。 - device_id: 设备id，可选，如果不填写则会自动生成，如果需要自定义设备id，请使用设备信息接口获取设备id。 - iid: 设备安装id，可选，如果不填写则会自动生成，如果需要自定义设备iid，请使用设备信息接口获取设备iid。 - proxy: 代理IP，可选，如果不填写则会使用服务器IP进行请求（不推荐），建议使用代理IP进行请求防止账号异常获被封禁，支持格式如下：     - 代理IP:端口     - 用户名:密码@代理IP:端口 ### 返回: - 点赞结果以及评论数据和设备信息，请自行保留设备信息，如请求时使用的&#x60;device_id&#x60;以及&#x60;iid&#x60;，以便后续调用接口时使用，频繁更换设备信息可能会导致账号异常或封禁。  # [English] ### Purpose: - Like a specified video using user cookies, please try to use TikTok accounts in the United States as much as possible, and use proxy IPs in the United States when obtaining cookies. ### Note: - Interactive interfaces all need to use the user&#39;s Cookie, so please make sure that your Cookie is valid, otherwise the request will not be made normally. - Interactive interfaces may cause account exceptions or bans, so please use them with caution, and it is recommended to use proxy IPs for requests. - The final result of the interactive interface may be affected by the TikTok risk control system, and in most cases it is related to the account you are using, for example, a newly registered account may not be able to follow users or like videos, and we cannot handle risk control issues based on accounts. - Please do not use interactive interfaces to harass others, or engage in illegal or irregular operations, otherwise we will stop providing services to you, and all responsibilities will be borne by you. ### Parameters: - aweme_id: Video id, which can be obtained from the sharing link, for example: https://www.tiktok.com/@username/video/7419966340443819295 - cookie: User Cookie, you can log in to your TikTok account in the browser and then copy the Cookie information, please use URL-encoded Cookie string when submitting. - device_id: Device id, optional, if not filled in, it will be automatically generated, if you need to customize the device id, please use the device information interface to get the device id. - iid: Device install id, optional, if not filled in, it will be automatically generated, if you need to customize the device iid, please use the device information interface to get the device iid. - proxy: Proxy IP, optional, if not filled in, the server IP will be used for the request (not recommended), it is recommended to use a proxy IP for the request to prevent account exceptions or bans, support the following formats:     - Proxy IP:Port     - Username:Password@Proxy IP:Port ### Return: - Like results, comment data and device information, please keep the device information, such as the &#x60;device_id&#x60; and &#x60;iid&#x60; used when requesting, for subsequent calls to the interface, frequent replacement of device information may cause account exceptions or bans.  # [示例/Example] &#x60;&#x60;&#x60;python # Python Code cookie &#x3D; urllib.parse.quote(\&quot;Your_Cookie_From_Browser\&quot;) payload &#x3D; {     \&quot;aweme_id\&quot;: \&quot;7419966340443819295\&quot;,     \&quot;cookie\&quot;: cookie,     \&quot;proxy\&quot;: \&quot;\&quot;, } &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TikTokInteractionApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TikTokInteractionApiApi apiInstance = new TikTokInteractionApiApi(defaultClient);
        LikeRequest likeRequest = new LikeRequest(); // LikeRequest | 
        try {
            ResponseModel result = apiInstance.likeApiV1TiktokInteractionLikePost_0(likeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TikTokInteractionApiApi#likeApiV1TiktokInteractionLikePost_0");
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
 **likeRequest** | [**LikeRequest**](LikeRequest.md)|  | [optional]

### Return type

[**ResponseModel**](ResponseModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## postCommentApiV1TiktokInteractionPostCommentPost

> ResponseModel postCommentApiV1TiktokInteractionPostCommentPost(postCommentRequest)

发送评论/Post comment

# [中文] ### 用途: - 使用用户Cookie发送评论到指定视频，当前请尽可能使用美国地区的TikTok账号，并且在获取Cookie时请使用美国地区的代理IP。 ### 注意: - 交互类接口都需要使用用户的Cookie，因此请确保你的Cookie是有效的，否则将无法正常请求。 - 交互类的接口可能会导致账号异常或封禁，因此请谨慎使用，建议使用代理IP进行请求。 - 交互类接口的最终结果可能会受到TikTok风控系统的影响，大多数情况跟你所使用的账号有关，比如新注册的账号可能无法关注用户或点赞视频，我们无法处理基于账号的风控问题。 - 请不要使用交互类接口对他人造成骚扰，或进行违法违规的操作，否则我们将会停止对你的服务，并且所有责任由你自己承担。 ### 参数: - aweme_id: 视频id，可以从分享链接中获取，例如：https://www.tiktok.com/@username/video/7419966340443819295 - text: 评论内容，TikTok评论内容需要符合规范，不要带有违规的关键词，否则即使请求成功也会被系统判定为垃圾评论从而不被展示，提交时请使用URL编码评论字符串。 - cookie: 用户Cookie，可以从浏览器中登录自己的TikTok账号，然后复制Cookie信息，提交时请使用URL编码Cookie字符串。 - device_id: 设备id，可选，如果不填写则会自动生成，如果需要自定义设备id，请使用设备信息接口获取设备id。 - iid: 设备安装id，可选，如果不填写则会自动生成，如果需要自定义设备iid，请使用设备信息接口获取设备iid。 - proxy: 代理IP，可选，如果不填写则会使用服务器IP进行请求（不推荐），建议使用代理IP进行请求防止账号异常获被封禁，支持格式如下：     - 代理IP:端口     - 用户名:密码@代理IP:端口 ### 返回: - 发送评论结果以及评论数据和设备信息，请自行保留设备信息，如请求时使用的&#x60;device_id&#x60;以及&#x60;iid&#x60;，以便后续调用接口时使用，频繁更换设备信息可能会导致账号异常或封禁。  # [English] ### Purpose: - Post comments to the specified video using user cookies, please try to use TikTok accounts in the United States as much as possible, and use proxy IPs in the United States when obtaining cookies. ### Note: - Interactive interfaces all need to use the user&#39;s Cookie, so please make sure that your Cookie is valid, otherwise the request will not be made normally. - Interactive interfaces may cause account exceptions or bans, so please use them with caution, and it is recommended to use proxy IPs for requests. - The final result of the interactive interface may be affected by the TikTok risk control system, and in most cases it is related to the account you are using, for example, a newly registered account may not be able to follow users or like videos, and we cannot handle risk control issues based on accounts. - Please do not use interactive interfaces to harass others, or engage in illegal or irregular operations, otherwise we will stop providing services to you, and all responsibilities will be borne by you. ### Parameters: - aweme_id: Video id, which can be obtained from the sharing link, for example: https://www.tiktok.com/@username/video/7419966340443819295 - text: Comment content, TikTok comment content needs to comply with the specifications, do not contain illegal keywords, otherwise, even if the request is successful, it will be judged as spam comments by the system and will not be displayed, please use URL-encoded comment string when submitting. - cookie: User Cookie, you can log in to your TikTok account in the browser and then copy the Cookie information, please use URL-encoded Cookie string when submitting. - device_id: Device id, optional, if not filled in, it will be automatically generated, if you need to customize the device id, please use the device information interface to get the device id. - iid: Device install id, optional, if not filled in, it will be automatically generated, if you need to customize the device iid, please use the device information interface to get the device iid. - proxy: Proxy IP, optional, if not filled in, the server IP will be used for the request (not recommended), it is recommended to use a proxy IP for the request to prevent account exceptions or bans, support the following formats:     - Proxy IP:Port     - Username:Password@Proxy IP:Port ### Return: - Post comment results, comment data and device information, please keep the device information, such as the &#x60;device_id&#x60; and &#x60;iid&#x60; used when requesting, for subsequent calls to the interface, frequent replacement of device information may cause account exceptions or bans.  # [示例/Example] &#x60;&#x60;&#x60;python # Python Code text &#x3D; urllib.parse.quote(\&quot;Hello, TikTok!\&quot;) cookie &#x3D; urllib.parse.quote(\&quot;Your_Cookie_From_Browser\&quot;) payload &#x3D; {     \&quot;aweme_id\&quot;: \&quot;7419966340443819295\&quot;,     \&quot;text\&quot;: text,     \&quot;cookie\&quot;: cookie,     \&quot;proxy\&quot;: \&quot;\&quot;, } &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TikTokInteractionApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TikTokInteractionApiApi apiInstance = new TikTokInteractionApiApi(defaultClient);
        PostCommentRequest postCommentRequest = new PostCommentRequest(); // PostCommentRequest | 
        try {
            ResponseModel result = apiInstance.postCommentApiV1TiktokInteractionPostCommentPost(postCommentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TikTokInteractionApiApi#postCommentApiV1TiktokInteractionPostCommentPost");
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
 **postCommentRequest** | [**PostCommentRequest**](PostCommentRequest.md)|  | [optional]

### Return type

[**ResponseModel**](ResponseModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## postCommentApiV1TiktokInteractionPostCommentPost_0

> ResponseModel postCommentApiV1TiktokInteractionPostCommentPost_0(postCommentRequest)

发送评论/Post comment

# [中文] ### 用途: - 使用用户Cookie发送评论到指定视频，当前请尽可能使用美国地区的TikTok账号，并且在获取Cookie时请使用美国地区的代理IP。 ### 注意: - 交互类接口都需要使用用户的Cookie，因此请确保你的Cookie是有效的，否则将无法正常请求。 - 交互类的接口可能会导致账号异常或封禁，因此请谨慎使用，建议使用代理IP进行请求。 - 交互类接口的最终结果可能会受到TikTok风控系统的影响，大多数情况跟你所使用的账号有关，比如新注册的账号可能无法关注用户或点赞视频，我们无法处理基于账号的风控问题。 - 请不要使用交互类接口对他人造成骚扰，或进行违法违规的操作，否则我们将会停止对你的服务，并且所有责任由你自己承担。 ### 参数: - aweme_id: 视频id，可以从分享链接中获取，例如：https://www.tiktok.com/@username/video/7419966340443819295 - text: 评论内容，TikTok评论内容需要符合规范，不要带有违规的关键词，否则即使请求成功也会被系统判定为垃圾评论从而不被展示，提交时请使用URL编码评论字符串。 - cookie: 用户Cookie，可以从浏览器中登录自己的TikTok账号，然后复制Cookie信息，提交时请使用URL编码Cookie字符串。 - device_id: 设备id，可选，如果不填写则会自动生成，如果需要自定义设备id，请使用设备信息接口获取设备id。 - iid: 设备安装id，可选，如果不填写则会自动生成，如果需要自定义设备iid，请使用设备信息接口获取设备iid。 - proxy: 代理IP，可选，如果不填写则会使用服务器IP进行请求（不推荐），建议使用代理IP进行请求防止账号异常获被封禁，支持格式如下：     - 代理IP:端口     - 用户名:密码@代理IP:端口 ### 返回: - 发送评论结果以及评论数据和设备信息，请自行保留设备信息，如请求时使用的&#x60;device_id&#x60;以及&#x60;iid&#x60;，以便后续调用接口时使用，频繁更换设备信息可能会导致账号异常或封禁。  # [English] ### Purpose: - Post comments to the specified video using user cookies, please try to use TikTok accounts in the United States as much as possible, and use proxy IPs in the United States when obtaining cookies. ### Note: - Interactive interfaces all need to use the user&#39;s Cookie, so please make sure that your Cookie is valid, otherwise the request will not be made normally. - Interactive interfaces may cause account exceptions or bans, so please use them with caution, and it is recommended to use proxy IPs for requests. - The final result of the interactive interface may be affected by the TikTok risk control system, and in most cases it is related to the account you are using, for example, a newly registered account may not be able to follow users or like videos, and we cannot handle risk control issues based on accounts. - Please do not use interactive interfaces to harass others, or engage in illegal or irregular operations, otherwise we will stop providing services to you, and all responsibilities will be borne by you. ### Parameters: - aweme_id: Video id, which can be obtained from the sharing link, for example: https://www.tiktok.com/@username/video/7419966340443819295 - text: Comment content, TikTok comment content needs to comply with the specifications, do not contain illegal keywords, otherwise, even if the request is successful, it will be judged as spam comments by the system and will not be displayed, please use URL-encoded comment string when submitting. - cookie: User Cookie, you can log in to your TikTok account in the browser and then copy the Cookie information, please use URL-encoded Cookie string when submitting. - device_id: Device id, optional, if not filled in, it will be automatically generated, if you need to customize the device id, please use the device information interface to get the device id. - iid: Device install id, optional, if not filled in, it will be automatically generated, if you need to customize the device iid, please use the device information interface to get the device iid. - proxy: Proxy IP, optional, if not filled in, the server IP will be used for the request (not recommended), it is recommended to use a proxy IP for the request to prevent account exceptions or bans, support the following formats:     - Proxy IP:Port     - Username:Password@Proxy IP:Port ### Return: - Post comment results, comment data and device information, please keep the device information, such as the &#x60;device_id&#x60; and &#x60;iid&#x60; used when requesting, for subsequent calls to the interface, frequent replacement of device information may cause account exceptions or bans.  # [示例/Example] &#x60;&#x60;&#x60;python # Python Code text &#x3D; urllib.parse.quote(\&quot;Hello, TikTok!\&quot;) cookie &#x3D; urllib.parse.quote(\&quot;Your_Cookie_From_Browser\&quot;) payload &#x3D; {     \&quot;aweme_id\&quot;: \&quot;7419966340443819295\&quot;,     \&quot;text\&quot;: text,     \&quot;cookie\&quot;: cookie,     \&quot;proxy\&quot;: \&quot;\&quot;, } &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TikTokInteractionApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TikTokInteractionApiApi apiInstance = new TikTokInteractionApiApi(defaultClient);
        PostCommentRequest postCommentRequest = new PostCommentRequest(); // PostCommentRequest | 
        try {
            ResponseModel result = apiInstance.postCommentApiV1TiktokInteractionPostCommentPost_0(postCommentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TikTokInteractionApiApi#postCommentApiV1TiktokInteractionPostCommentPost_0");
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
 **postCommentRequest** | [**PostCommentRequest**](PostCommentRequest.md)|  | [optional]

### Return type

[**ResponseModel**](ResponseModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## replyCommentApiV1TiktokInteractionReplyCommentPost

> ResponseModel replyCommentApiV1TiktokInteractionReplyCommentPost(replyCommentRequest)

回复评论/Reply to comment

# [中文] ### 用途: - 使用用户Cookie回复指定视频的一个评论，当前请尽可能使用美国地区的TikTok账号，并且在获取Cookie时请使用美国地区的代理IP。 ### 注意: - 交互类接口都需要使用用户的Cookie，因此请确保你的Cookie是有效的，否则将无法正常请求。 - 交互类的接口可能会导致账号异常或封禁，因此请谨慎使用，建议使用代理IP进行请求。 - 交互类接口的最终结果可能会受到TikTok风控系统的影响，大多数情况跟你所使用的账号有关，比如新注册的账号可能无法关注用户或点赞视频，我们无法处理基于账号的风控问题。 - 请不要使用交互类接口对他人造成骚扰，或进行违法违规的操作，否则我们将会停止对你的服务，并且所有责任由你自己承担。 ### 参数: - aweme_id: 视频id，可以从分享链接中获取，例如：https://www.tiktok.com/@username/video/7419966340443819295 - reply_id: 要回复的目标评论ID，可以从指定视频的评论数据接口中获取，通常关键字为&#x60;cid&#x60;或&#x60;comment_id&#x60;或&#x60;reply_id&#x60;。 - text: 评论内容，TikTok评论内容需要符合规范，不要带有违规的关键词，否则即使请求成功也会被系统判定为垃圾评论从而不被展示，提交时请使用URL编码评论字符串。 - cookie: 用户Cookie，可以从浏览器中登录自己的TikTok账号，然后复制Cookie信息，提交时请使用URL编码Cookie字符串。 - device_id: 设备id，可选，如果不填写则会自动生成，如果需要自定义设备id，请使用设备信息接口获取设备id。 - iid: 设备安装id，可选，如果不填写则会自动生成，如果需要自定义设备iid，请使用设备信息接口获取设备iid。 - proxy: 代理IP，可选，如果不填写则会使用服务器IP进行请求（不推荐），建议使用代理IP进行请求防止账号异常获被封禁，支持格式如下：     - 代理IP:端口     - 用户名:密码@代理IP:端口 ### 返回: - 回复评论结果以及评论数据和设备信息，请自行保留设备信息，如请求时使用的&#x60;device_id&#x60;以及&#x60;iid&#x60;，以便后续调用接口时使用，频繁更换设备信息可能会导致账号异常或封禁。  # [English] ### Purpose: - Reply to a comment on a specified video using user cookies, please try to use TikTok accounts in the United States as much as possible, and use proxy IPs in the United States when obtaining cookies. ### Note: - Interactive interfaces all need to use the user&#39;s Cookie, so please make sure that your Cookie is valid, otherwise the request will not be made normally. - Interactive interfaces may cause account exceptions or bans, so please use them with caution, and it is recommended to use proxy IPs for requests. - The final result of the interactive interface may be affected by the TikTok risk control system, and in most cases it is related to the account you are using, for example, a newly registered account may not be able to follow users or like videos, and we cannot handle risk control issues based on accounts. - Please do not use interactive interfaces to harass others, or engage in illegal or irregular operations, otherwise we will stop providing services to you, and all responsibilities will be borne by you. ### Parameters: - aweme_id: Video id, which can be obtained from the sharing link, for example: https://www.tiktok.com/@username/video/7419966340443819295 - reply_id: The target comment ID to reply to, which can be obtained from the comment data interface of the specified video, usually the keyword is &#x60;cid&#x60; or &#x60;comment_id&#x60; or &#x60;reply_id&#x60;. - text: Comment content, TikTok comment content needs to comply with the specifications, do not contain illegal keywords, otherwise, even if the request is successful, it will be judged as spam comments by the system and will not be displayed, please use URL-encoded comment string when submitting. - cookie: User Cookie, you can log in to your TikTok account in the browser and then copy the Cookie information, please use URL-encoded Cookie string when submitting. - device_id: Device id, optional, if not filled in, it will be automatically generated, if you need to customize the device id, please use the device information interface to get the device id. - iid: Device install id, optional, if not filled in, it will be automatically generated, if you need to customize the device iid, please use the device information interface to get the device iid. - proxy: Proxy IP, optional, if not filled in, the server IP will be used for the request (not recommended), it is recommended to use a proxy IP for the request to prevent account exceptions or bans, support the following formats:     - Proxy IP:Port     - Username:Password@Proxy IP:Port ### Return: - Reply comment results, comment data and device information, please keep the device information, such as the &#x60;device_id&#x60; and &#x60;iid&#x60; used when requesting, for subsequent calls to the interface, frequent replacement of device information may cause account exceptions or bans.  # [示例/Example] &#x60;&#x60;&#x60;python # Python Code text &#x3D; urllib.parse.quote(\&quot;Hello, TikTok!\&quot;) cookie &#x3D; urllib.parse.quote(\&quot;Your_Cookie_From_Browser\&quot;) payload &#x3D; {     \&quot;aweme_id\&quot;: \&quot;7419966340443819295\&quot;,     \&quot;reply_id\&quot;: \&quot;7420673787547419435\&quot;,     \&quot;text\&quot;: text,     \&quot;cookie\&quot;: cookie,     \&quot;proxy\&quot;: \&quot;\&quot;, } &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TikTokInteractionApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TikTokInteractionApiApi apiInstance = new TikTokInteractionApiApi(defaultClient);
        ReplyCommentRequest replyCommentRequest = new ReplyCommentRequest(); // ReplyCommentRequest | 
        try {
            ResponseModel result = apiInstance.replyCommentApiV1TiktokInteractionReplyCommentPost(replyCommentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TikTokInteractionApiApi#replyCommentApiV1TiktokInteractionReplyCommentPost");
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
 **replyCommentRequest** | [**ReplyCommentRequest**](ReplyCommentRequest.md)|  | [optional]

### Return type

[**ResponseModel**](ResponseModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## replyCommentApiV1TiktokInteractionReplyCommentPost_0

> ResponseModel replyCommentApiV1TiktokInteractionReplyCommentPost_0(replyCommentRequest)

回复评论/Reply to comment

# [中文] ### 用途: - 使用用户Cookie回复指定视频的一个评论，当前请尽可能使用美国地区的TikTok账号，并且在获取Cookie时请使用美国地区的代理IP。 ### 注意: - 交互类接口都需要使用用户的Cookie，因此请确保你的Cookie是有效的，否则将无法正常请求。 - 交互类的接口可能会导致账号异常或封禁，因此请谨慎使用，建议使用代理IP进行请求。 - 交互类接口的最终结果可能会受到TikTok风控系统的影响，大多数情况跟你所使用的账号有关，比如新注册的账号可能无法关注用户或点赞视频，我们无法处理基于账号的风控问题。 - 请不要使用交互类接口对他人造成骚扰，或进行违法违规的操作，否则我们将会停止对你的服务，并且所有责任由你自己承担。 ### 参数: - aweme_id: 视频id，可以从分享链接中获取，例如：https://www.tiktok.com/@username/video/7419966340443819295 - reply_id: 要回复的目标评论ID，可以从指定视频的评论数据接口中获取，通常关键字为&#x60;cid&#x60;或&#x60;comment_id&#x60;或&#x60;reply_id&#x60;。 - text: 评论内容，TikTok评论内容需要符合规范，不要带有违规的关键词，否则即使请求成功也会被系统判定为垃圾评论从而不被展示，提交时请使用URL编码评论字符串。 - cookie: 用户Cookie，可以从浏览器中登录自己的TikTok账号，然后复制Cookie信息，提交时请使用URL编码Cookie字符串。 - device_id: 设备id，可选，如果不填写则会自动生成，如果需要自定义设备id，请使用设备信息接口获取设备id。 - iid: 设备安装id，可选，如果不填写则会自动生成，如果需要自定义设备iid，请使用设备信息接口获取设备iid。 - proxy: 代理IP，可选，如果不填写则会使用服务器IP进行请求（不推荐），建议使用代理IP进行请求防止账号异常获被封禁，支持格式如下：     - 代理IP:端口     - 用户名:密码@代理IP:端口 ### 返回: - 回复评论结果以及评论数据和设备信息，请自行保留设备信息，如请求时使用的&#x60;device_id&#x60;以及&#x60;iid&#x60;，以便后续调用接口时使用，频繁更换设备信息可能会导致账号异常或封禁。  # [English] ### Purpose: - Reply to a comment on a specified video using user cookies, please try to use TikTok accounts in the United States as much as possible, and use proxy IPs in the United States when obtaining cookies. ### Note: - Interactive interfaces all need to use the user&#39;s Cookie, so please make sure that your Cookie is valid, otherwise the request will not be made normally. - Interactive interfaces may cause account exceptions or bans, so please use them with caution, and it is recommended to use proxy IPs for requests. - The final result of the interactive interface may be affected by the TikTok risk control system, and in most cases it is related to the account you are using, for example, a newly registered account may not be able to follow users or like videos, and we cannot handle risk control issues based on accounts. - Please do not use interactive interfaces to harass others, or engage in illegal or irregular operations, otherwise we will stop providing services to you, and all responsibilities will be borne by you. ### Parameters: - aweme_id: Video id, which can be obtained from the sharing link, for example: https://www.tiktok.com/@username/video/7419966340443819295 - reply_id: The target comment ID to reply to, which can be obtained from the comment data interface of the specified video, usually the keyword is &#x60;cid&#x60; or &#x60;comment_id&#x60; or &#x60;reply_id&#x60;. - text: Comment content, TikTok comment content needs to comply with the specifications, do not contain illegal keywords, otherwise, even if the request is successful, it will be judged as spam comments by the system and will not be displayed, please use URL-encoded comment string when submitting. - cookie: User Cookie, you can log in to your TikTok account in the browser and then copy the Cookie information, please use URL-encoded Cookie string when submitting. - device_id: Device id, optional, if not filled in, it will be automatically generated, if you need to customize the device id, please use the device information interface to get the device id. - iid: Device install id, optional, if not filled in, it will be automatically generated, if you need to customize the device iid, please use the device information interface to get the device iid. - proxy: Proxy IP, optional, if not filled in, the server IP will be used for the request (not recommended), it is recommended to use a proxy IP for the request to prevent account exceptions or bans, support the following formats:     - Proxy IP:Port     - Username:Password@Proxy IP:Port ### Return: - Reply comment results, comment data and device information, please keep the device information, such as the &#x60;device_id&#x60; and &#x60;iid&#x60; used when requesting, for subsequent calls to the interface, frequent replacement of device information may cause account exceptions or bans.  # [示例/Example] &#x60;&#x60;&#x60;python # Python Code text &#x3D; urllib.parse.quote(\&quot;Hello, TikTok!\&quot;) cookie &#x3D; urllib.parse.quote(\&quot;Your_Cookie_From_Browser\&quot;) payload &#x3D; {     \&quot;aweme_id\&quot;: \&quot;7419966340443819295\&quot;,     \&quot;reply_id\&quot;: \&quot;7420673787547419435\&quot;,     \&quot;text\&quot;: text,     \&quot;cookie\&quot;: cookie,     \&quot;proxy\&quot;: \&quot;\&quot;, } &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TikTokInteractionApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TikTokInteractionApiApi apiInstance = new TikTokInteractionApiApi(defaultClient);
        ReplyCommentRequest replyCommentRequest = new ReplyCommentRequest(); // ReplyCommentRequest | 
        try {
            ResponseModel result = apiInstance.replyCommentApiV1TiktokInteractionReplyCommentPost_0(replyCommentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TikTokInteractionApiApi#replyCommentApiV1TiktokInteractionReplyCommentPost_0");
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
 **replyCommentRequest** | [**ReplyCommentRequest**](ReplyCommentRequest.md)|  | [optional]

### Return type

[**ResponseModel**](ResponseModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

