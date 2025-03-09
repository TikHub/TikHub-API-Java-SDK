# CaptchaSolverApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**amazonCaptchaApiV1CaptchaAmazonCaptchaPost**](CaptchaSolverApi.md#amazonCaptchaApiV1CaptchaAmazonCaptchaPost) | **POST** /api/v1/captcha/amazon_captcha | Amazon Captcha Solver/Amazon验证码解决器
[**amazonCaptchaApiV1CaptchaAmazonCaptchaPost_0**](CaptchaSolverApi.md#amazonCaptchaApiV1CaptchaAmazonCaptchaPost_0) | **POST** /api/v1/captcha/amazon_captcha | Amazon Captcha Solver/Amazon验证码解决器
[**cloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost**](CaptchaSolverApi.md#cloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost) | **POST** /api/v1/captcha/cloudflare_turnstile | Cloudflare Turnstile Solver/Cloudflare Turnstile解决器
[**cloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost_0**](CaptchaSolverApi.md#cloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost_0) | **POST** /api/v1/captcha/cloudflare_turnstile | Cloudflare Turnstile Solver/Cloudflare Turnstile解决器
[**hcaptchaApiV1CaptchaHcaptchaPost**](CaptchaSolverApi.md#hcaptchaApiV1CaptchaHcaptchaPost) | **POST** /api/v1/captcha/hcaptcha | hCaptcha Solver/hCaptcha解决器
[**hcaptchaApiV1CaptchaHcaptchaPost_0**](CaptchaSolverApi.md#hcaptchaApiV1CaptchaHcaptchaPost_0) | **POST** /api/v1/captcha/hcaptcha | hCaptcha Solver/hCaptcha解决器
[**recaptchaV2ApiV1CaptchaRecaptchaV2Post**](CaptchaSolverApi.md#recaptchaV2ApiV1CaptchaRecaptchaV2Post) | **POST** /api/v1/captcha/recaptcha_v2 | Recaptcha V2 Solver/Recaptcha V2解决器
[**recaptchaV2ApiV1CaptchaRecaptchaV2Post_0**](CaptchaSolverApi.md#recaptchaV2ApiV1CaptchaRecaptchaV2Post_0) | **POST** /api/v1/captcha/recaptcha_v2 | Recaptcha V2 Solver/Recaptcha V2解决器
[**recaptchaV3ApiV1CaptchaRecaptchaV3Post**](CaptchaSolverApi.md#recaptchaV3ApiV1CaptchaRecaptchaV3Post) | **POST** /api/v1/captcha/recaptcha_v3 | Recaptcha V3 Solver/Recaptcha V3解决器
[**recaptchaV3ApiV1CaptchaRecaptchaV3Post_0**](CaptchaSolverApi.md#recaptchaV3ApiV1CaptchaRecaptchaV3Post_0) | **POST** /api/v1/captcha/recaptcha_v3 | Recaptcha V3 Solver/Recaptcha V3解决器
[**tencentCaptchaApiV1CaptchaTencentCaptchaPost**](CaptchaSolverApi.md#tencentCaptchaApiV1CaptchaTencentCaptchaPost) | **POST** /api/v1/captcha/tencent_captcha | Tencent Captcha Solver/Tencent验证码解决器
[**tencentCaptchaApiV1CaptchaTencentCaptchaPost_0**](CaptchaSolverApi.md#tencentCaptchaApiV1CaptchaTencentCaptchaPost_0) | **POST** /api/v1/captcha/tencent_captcha | Tencent Captcha Solver/Tencent验证码解决器



## amazonCaptchaApiV1CaptchaAmazonCaptchaPost

> ResponseModel amazonCaptchaApiV1CaptchaAmazonCaptchaPost(bodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost)

Amazon Captcha Solver/Amazon验证码解决器

# [中文] ### 用途: - Amazon Captcha验证码解决器 ### 参数: - app_id: 在HTML中可以找到网站对应的app_id - url: 需要解决验证码的URL - proxy: 默认为None ### 返回: - 返回验证码解决结果  # [English] ### Purpose: - Amazon Captcha solver ### Parameters: - app_id: The app_id corresponding to the website can be found in the HTML - url: URL that needs to solve the captcha - proxy: Default is None ### Return: - Return the captcha solution result  # [Example/示例] app_id &#x3D; \&quot;10000000\&quot; url &#x3D; \&quot;https://www.amazon.com/\&quot; proxy &#x3D; None

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.CaptchaSolverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        CaptchaSolverApi apiInstance = new CaptchaSolverApi(defaultClient);
        BodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost bodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost = new BodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost(); // BodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost | 
        try {
            ResponseModel result = apiInstance.amazonCaptchaApiV1CaptchaAmazonCaptchaPost(bodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CaptchaSolverApi#amazonCaptchaApiV1CaptchaAmazonCaptchaPost");
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
 **bodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost** | [**BodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost**](BodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost.md)|  | [optional]

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


## amazonCaptchaApiV1CaptchaAmazonCaptchaPost_0

> ResponseModel amazonCaptchaApiV1CaptchaAmazonCaptchaPost_0(bodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost)

Amazon Captcha Solver/Amazon验证码解决器

# [中文] ### 用途: - Amazon Captcha验证码解决器 ### 参数: - app_id: 在HTML中可以找到网站对应的app_id - url: 需要解决验证码的URL - proxy: 默认为None ### 返回: - 返回验证码解决结果  # [English] ### Purpose: - Amazon Captcha solver ### Parameters: - app_id: The app_id corresponding to the website can be found in the HTML - url: URL that needs to solve the captcha - proxy: Default is None ### Return: - Return the captcha solution result  # [Example/示例] app_id &#x3D; \&quot;10000000\&quot; url &#x3D; \&quot;https://www.amazon.com/\&quot; proxy &#x3D; None

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.CaptchaSolverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        CaptchaSolverApi apiInstance = new CaptchaSolverApi(defaultClient);
        BodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost bodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost = new BodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost(); // BodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost | 
        try {
            ResponseModel result = apiInstance.amazonCaptchaApiV1CaptchaAmazonCaptchaPost_0(bodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CaptchaSolverApi#amazonCaptchaApiV1CaptchaAmazonCaptchaPost_0");
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
 **bodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost** | [**BodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost**](BodyAmazonCaptchaApiV1CaptchaAmazonCaptchaPost.md)|  | [optional]

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


## cloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost

> ResponseModel cloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost(bodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost)

Cloudflare Turnstile Solver/Cloudflare Turnstile解决器

# [中文] ### 用途: - Cloudflare Turnstile验证码解决器 ### 参数: - sitekey: 在HTML中可以找到网站对应的sitekey - url: 需要解决验证码的URL - proxy: 默认为None ### 返回: - 返回验证码解决结果  # [English] ### Purpose: - Cloudflare Turnstile captcha solver ### Parameters: - sitekey: The sitekey corresponding to the website can be found in the HTML - url: URL that needs to solve the captcha - action: Default is None - data: Default is None - proxy: Default is None ### Return: - Return the captcha solution result  # [Example/示例] sitekey &#x3D; \&quot;1x00000000000000000000AA\&quot; url &#x3D; \&quot;https://demo.turnstile.workers.dev\&quot; proxy &#x3D; None

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.CaptchaSolverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        CaptchaSolverApi apiInstance = new CaptchaSolverApi(defaultClient);
        BodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost bodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost = new BodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost(); // BodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost | 
        try {
            ResponseModel result = apiInstance.cloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost(bodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CaptchaSolverApi#cloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost");
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
 **bodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost** | [**BodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost**](BodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost.md)|  | [optional]

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


## cloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost_0

> ResponseModel cloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost_0(bodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost)

Cloudflare Turnstile Solver/Cloudflare Turnstile解决器

# [中文] ### 用途: - Cloudflare Turnstile验证码解决器 ### 参数: - sitekey: 在HTML中可以找到网站对应的sitekey - url: 需要解决验证码的URL - proxy: 默认为None ### 返回: - 返回验证码解决结果  # [English] ### Purpose: - Cloudflare Turnstile captcha solver ### Parameters: - sitekey: The sitekey corresponding to the website can be found in the HTML - url: URL that needs to solve the captcha - action: Default is None - data: Default is None - proxy: Default is None ### Return: - Return the captcha solution result  # [Example/示例] sitekey &#x3D; \&quot;1x00000000000000000000AA\&quot; url &#x3D; \&quot;https://demo.turnstile.workers.dev\&quot; proxy &#x3D; None

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.CaptchaSolverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        CaptchaSolverApi apiInstance = new CaptchaSolverApi(defaultClient);
        BodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost bodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost = new BodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost(); // BodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost | 
        try {
            ResponseModel result = apiInstance.cloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost_0(bodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CaptchaSolverApi#cloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost_0");
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
 **bodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost** | [**BodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost**](BodyCloudflareTurnstileApiV1CaptchaCloudflareTurnstilePost.md)|  | [optional]

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


## hcaptchaApiV1CaptchaHcaptchaPost

> ResponseModel hcaptchaApiV1CaptchaHcaptchaPost(bodyHcaptchaApiV1CaptchaHcaptchaPost)

hCaptcha Solver/hCaptcha解决器

# [中文] ### 用途: - hCaptcha验证码解决器 ### 参数: - sitekey: 在HTML中可以找到网站对应的sitekey - url: 需要解决验证码的URL - proxy: 默认为None ### 返回: - 返回验证码解决结果  # [English] ### Purpose: - hCaptcha captcha solver ### Parameters: - sitekey: The sitekey corresponding to the website can be found in the HTML - url: URL that needs to solve the captcha - proxy: Default is None ### Return: - Return the captcha solution result  # [Example/示例] sitekey &#x3D; \&quot;10000000-ffff-ffff-ffff-000000000001\&quot; url &#x3D; \&quot;https://www.hcaptcha.com/\&quot; proxy &#x3D; None

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.CaptchaSolverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        CaptchaSolverApi apiInstance = new CaptchaSolverApi(defaultClient);
        BodyHcaptchaApiV1CaptchaHcaptchaPost bodyHcaptchaApiV1CaptchaHcaptchaPost = new BodyHcaptchaApiV1CaptchaHcaptchaPost(); // BodyHcaptchaApiV1CaptchaHcaptchaPost | 
        try {
            ResponseModel result = apiInstance.hcaptchaApiV1CaptchaHcaptchaPost(bodyHcaptchaApiV1CaptchaHcaptchaPost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CaptchaSolverApi#hcaptchaApiV1CaptchaHcaptchaPost");
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
 **bodyHcaptchaApiV1CaptchaHcaptchaPost** | [**BodyHcaptchaApiV1CaptchaHcaptchaPost**](BodyHcaptchaApiV1CaptchaHcaptchaPost.md)|  | [optional]

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


## hcaptchaApiV1CaptchaHcaptchaPost_0

> ResponseModel hcaptchaApiV1CaptchaHcaptchaPost_0(bodyHcaptchaApiV1CaptchaHcaptchaPost)

hCaptcha Solver/hCaptcha解决器

# [中文] ### 用途: - hCaptcha验证码解决器 ### 参数: - sitekey: 在HTML中可以找到网站对应的sitekey - url: 需要解决验证码的URL - proxy: 默认为None ### 返回: - 返回验证码解决结果  # [English] ### Purpose: - hCaptcha captcha solver ### Parameters: - sitekey: The sitekey corresponding to the website can be found in the HTML - url: URL that needs to solve the captcha - proxy: Default is None ### Return: - Return the captcha solution result  # [Example/示例] sitekey &#x3D; \&quot;10000000-ffff-ffff-ffff-000000000001\&quot; url &#x3D; \&quot;https://www.hcaptcha.com/\&quot; proxy &#x3D; None

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.CaptchaSolverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        CaptchaSolverApi apiInstance = new CaptchaSolverApi(defaultClient);
        BodyHcaptchaApiV1CaptchaHcaptchaPost bodyHcaptchaApiV1CaptchaHcaptchaPost = new BodyHcaptchaApiV1CaptchaHcaptchaPost(); // BodyHcaptchaApiV1CaptchaHcaptchaPost | 
        try {
            ResponseModel result = apiInstance.hcaptchaApiV1CaptchaHcaptchaPost_0(bodyHcaptchaApiV1CaptchaHcaptchaPost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CaptchaSolverApi#hcaptchaApiV1CaptchaHcaptchaPost_0");
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
 **bodyHcaptchaApiV1CaptchaHcaptchaPost** | [**BodyHcaptchaApiV1CaptchaHcaptchaPost**](BodyHcaptchaApiV1CaptchaHcaptchaPost.md)|  | [optional]

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


## recaptchaV2ApiV1CaptchaRecaptchaV2Post

> ResponseModel recaptchaV2ApiV1CaptchaRecaptchaV2Post(bodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post)

Recaptcha V2 Solver/Recaptcha V2解决器

# [中文] ### 用途: - Recaptcha V2验证码解决器 ### 参数: - sitekey: 在HTML中可以找到网站对应的sitekey - url: 需要解决验证码的URL - proxy: 默认为None ### 返回: - 返回验证码解决结果  # [English] ### Purpose: - Recaptcha V2 captcha solver ### Parameters: - sitekey: The sitekey corresponding to the website can be found in the HTML - url: URL that needs to solve the captcha - proxy: Default is None ### Return: - Return the captcha solution result  # [Example/示例] sitekey &#x3D; \&quot;6Le-wvkSAAAAAPBMRTvw0Q4Muexq9bi0DJwx_mJ-\&quot; url &#x3D; \&quot;https://www.google.com/recaptcha/api2/demo\&quot; proxy &#x3D; None

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.CaptchaSolverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        CaptchaSolverApi apiInstance = new CaptchaSolverApi(defaultClient);
        BodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post bodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post = new BodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post(); // BodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post | 
        try {
            ResponseModel result = apiInstance.recaptchaV2ApiV1CaptchaRecaptchaV2Post(bodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CaptchaSolverApi#recaptchaV2ApiV1CaptchaRecaptchaV2Post");
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
 **bodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post** | [**BodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post**](BodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post.md)|  | [optional]

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


## recaptchaV2ApiV1CaptchaRecaptchaV2Post_0

> ResponseModel recaptchaV2ApiV1CaptchaRecaptchaV2Post_0(bodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post)

Recaptcha V2 Solver/Recaptcha V2解决器

# [中文] ### 用途: - Recaptcha V2验证码解决器 ### 参数: - sitekey: 在HTML中可以找到网站对应的sitekey - url: 需要解决验证码的URL - proxy: 默认为None ### 返回: - 返回验证码解决结果  # [English] ### Purpose: - Recaptcha V2 captcha solver ### Parameters: - sitekey: The sitekey corresponding to the website can be found in the HTML - url: URL that needs to solve the captcha - proxy: Default is None ### Return: - Return the captcha solution result  # [Example/示例] sitekey &#x3D; \&quot;6Le-wvkSAAAAAPBMRTvw0Q4Muexq9bi0DJwx_mJ-\&quot; url &#x3D; \&quot;https://www.google.com/recaptcha/api2/demo\&quot; proxy &#x3D; None

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.CaptchaSolverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        CaptchaSolverApi apiInstance = new CaptchaSolverApi(defaultClient);
        BodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post bodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post = new BodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post(); // BodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post | 
        try {
            ResponseModel result = apiInstance.recaptchaV2ApiV1CaptchaRecaptchaV2Post_0(bodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CaptchaSolverApi#recaptchaV2ApiV1CaptchaRecaptchaV2Post_0");
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
 **bodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post** | [**BodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post**](BodyRecaptchaV2ApiV1CaptchaRecaptchaV2Post.md)|  | [optional]

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


## recaptchaV3ApiV1CaptchaRecaptchaV3Post

> ResponseModel recaptchaV3ApiV1CaptchaRecaptchaV3Post(bodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post)

Recaptcha V3 Solver/Recaptcha V3解决器

# [中文] ### 用途: - Recaptcha V3验证码解决器 ### 参数: - sitekey: 在HTML中可以找到网站对应的sitekey - url: 需要解决验证码的URL - proxy: 默认为None ### 返回: - 返回验证码解决结果  # [English] ### Purpose: - Recaptcha V3 captcha solver ### Parameters: - sitekey: The sitekey corresponding to the website can be found in the HTML - url: URL that needs to solve the captcha - proxy: Default is None ### Return: - Return the captcha solution result  # [Example/示例] sitekey &#x3D; \&quot;6Le-wvkSAAAAAPBMRTvw0Q4Muexq9bi0DJwx_mJ-\&quot; url &#x3D; \&quot;https://www.google.com/recaptcha/api2/demo\&quot; proxy &#x3D; None

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.CaptchaSolverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        CaptchaSolverApi apiInstance = new CaptchaSolverApi(defaultClient);
        BodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post bodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post = new BodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post(); // BodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post | 
        try {
            ResponseModel result = apiInstance.recaptchaV3ApiV1CaptchaRecaptchaV3Post(bodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CaptchaSolverApi#recaptchaV3ApiV1CaptchaRecaptchaV3Post");
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
 **bodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post** | [**BodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post**](BodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post.md)|  | [optional]

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


## recaptchaV3ApiV1CaptchaRecaptchaV3Post_0

> ResponseModel recaptchaV3ApiV1CaptchaRecaptchaV3Post_0(bodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post)

Recaptcha V3 Solver/Recaptcha V3解决器

# [中文] ### 用途: - Recaptcha V3验证码解决器 ### 参数: - sitekey: 在HTML中可以找到网站对应的sitekey - url: 需要解决验证码的URL - proxy: 默认为None ### 返回: - 返回验证码解决结果  # [English] ### Purpose: - Recaptcha V3 captcha solver ### Parameters: - sitekey: The sitekey corresponding to the website can be found in the HTML - url: URL that needs to solve the captcha - proxy: Default is None ### Return: - Return the captcha solution result  # [Example/示例] sitekey &#x3D; \&quot;6Le-wvkSAAAAAPBMRTvw0Q4Muexq9bi0DJwx_mJ-\&quot; url &#x3D; \&quot;https://www.google.com/recaptcha/api2/demo\&quot; proxy &#x3D; None

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.CaptchaSolverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        CaptchaSolverApi apiInstance = new CaptchaSolverApi(defaultClient);
        BodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post bodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post = new BodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post(); // BodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post | 
        try {
            ResponseModel result = apiInstance.recaptchaV3ApiV1CaptchaRecaptchaV3Post_0(bodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CaptchaSolverApi#recaptchaV3ApiV1CaptchaRecaptchaV3Post_0");
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
 **bodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post** | [**BodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post**](BodyRecaptchaV3ApiV1CaptchaRecaptchaV3Post.md)|  | [optional]

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


## tencentCaptchaApiV1CaptchaTencentCaptchaPost

> ResponseModel tencentCaptchaApiV1CaptchaTencentCaptchaPost(bodyTencentCaptchaApiV1CaptchaTencentCaptchaPost)

Tencent Captcha Solver/Tencent验证码解决器

# [中文] ### 用途: - Tencent Captcha验证码解决器 ### 参数: - app_id: 在HTML中可以找到网站对应的app_id - url: 需要解决验证码的URL - proxy: 默认为None ### 返回: - 返回验证码解决结果  # [English] ### Purpose: - Tencent Captcha solver ### Parameters: - app_id: The app_id corresponding to the website can be found in the HTML - url: URL that needs to solve the captcha - proxy: Default is None ### Return: - Return the captcha solution result  # [Example/示例] app_id &#x3D; \&quot;10000000\&quot; url &#x3D; \&quot;https://www.tencent.com/\&quot; proxy &#x3D; None

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.CaptchaSolverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        CaptchaSolverApi apiInstance = new CaptchaSolverApi(defaultClient);
        BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost bodyTencentCaptchaApiV1CaptchaTencentCaptchaPost = new BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost(); // BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost | 
        try {
            ResponseModel result = apiInstance.tencentCaptchaApiV1CaptchaTencentCaptchaPost(bodyTencentCaptchaApiV1CaptchaTencentCaptchaPost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CaptchaSolverApi#tencentCaptchaApiV1CaptchaTencentCaptchaPost");
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
 **bodyTencentCaptchaApiV1CaptchaTencentCaptchaPost** | [**BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost**](BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost.md)|  | [optional]

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


## tencentCaptchaApiV1CaptchaTencentCaptchaPost_0

> ResponseModel tencentCaptchaApiV1CaptchaTencentCaptchaPost_0(bodyTencentCaptchaApiV1CaptchaTencentCaptchaPost)

Tencent Captcha Solver/Tencent验证码解决器

# [中文] ### 用途: - Tencent Captcha验证码解决器 ### 参数: - app_id: 在HTML中可以找到网站对应的app_id - url: 需要解决验证码的URL - proxy: 默认为None ### 返回: - 返回验证码解决结果  # [English] ### Purpose: - Tencent Captcha solver ### Parameters: - app_id: The app_id corresponding to the website can be found in the HTML - url: URL that needs to solve the captcha - proxy: Default is None ### Return: - Return the captcha solution result  # [Example/示例] app_id &#x3D; \&quot;10000000\&quot; url &#x3D; \&quot;https://www.tencent.com/\&quot; proxy &#x3D; None

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.CaptchaSolverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        CaptchaSolverApi apiInstance = new CaptchaSolverApi(defaultClient);
        BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost bodyTencentCaptchaApiV1CaptchaTencentCaptchaPost = new BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost(); // BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost | 
        try {
            ResponseModel result = apiInstance.tencentCaptchaApiV1CaptchaTencentCaptchaPost_0(bodyTencentCaptchaApiV1CaptchaTencentCaptchaPost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CaptchaSolverApi#tencentCaptchaApiV1CaptchaTencentCaptchaPost_0");
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
 **bodyTencentCaptchaApiV1CaptchaTencentCaptchaPost** | [**BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost**](BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost.md)|  | [optional]

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

