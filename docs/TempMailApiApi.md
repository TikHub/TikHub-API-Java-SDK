# TempMailApiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEmailByIdApiV1TempMailV1GetEmailByIdGet**](TempMailApiApi.md#getEmailByIdApiV1TempMailV1GetEmailByIdGet) | **GET** /api/v1/temp_mail/v1/get_email_by_id | Get Email By Id
[**getEmailByIdApiV1TempMailV1GetEmailByIdGet_0**](TempMailApiApi.md#getEmailByIdApiV1TempMailV1GetEmailByIdGet_0) | **GET** /api/v1/temp_mail/v1/get_email_by_id | Get Email By Id
[**getEmailsApiV1TempMailV1GetEmailsInboxGet**](TempMailApiApi.md#getEmailsApiV1TempMailV1GetEmailsInboxGet) | **GET** /api/v1/temp_mail/v1/get_emails_inbox | Get Emails
[**getEmailsApiV1TempMailV1GetEmailsInboxGet_0**](TempMailApiApi.md#getEmailsApiV1TempMailV1GetEmailsInboxGet_0) | **GET** /api/v1/temp_mail/v1/get_emails_inbox | Get Emails
[**getTempEmailApiV1TempMailV1GetTempEmailAddressGet**](TempMailApiApi.md#getTempEmailApiV1TempMailV1GetTempEmailAddressGet) | **GET** /api/v1/temp_mail/v1/get_temp_email_address | Get Temp Email
[**getTempEmailApiV1TempMailV1GetTempEmailAddressGet_0**](TempMailApiApi.md#getTempEmailApiV1TempMailV1GetTempEmailAddressGet_0) | **GET** /api/v1/temp_mail/v1/get_temp_email_address | Get Temp Email



## getEmailByIdApiV1TempMailV1GetEmailByIdGet

> ResponseModel getEmailByIdApiV1TempMailV1GetEmailByIdGet(token, messageId)

Get Email By Id

# [中文] ### 用途: - 通过邮件ID获取邮件数据 ### 参数: - token: 邮箱Bearer Token - message_id: 邮件ID ### 返回: - 邮件数据  # [English] ### Purpose: - Get email data by email ID ### Parameters: - token: Email Bearer Token - message_id: Email ID ### Returns: - Email data

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TempMailApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TempMailApiApi apiInstance = new TempMailApiApi(defaultClient);
        String token = "token_example"; // String | Bearer Token
        String messageId = "messageId_example"; // String | Message ID
        try {
            ResponseModel result = apiInstance.getEmailByIdApiV1TempMailV1GetEmailByIdGet(token, messageId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TempMailApiApi#getEmailByIdApiV1TempMailV1GetEmailByIdGet");
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
 **token** | **String**| Bearer Token |
 **messageId** | **String**| Message ID |

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


## getEmailByIdApiV1TempMailV1GetEmailByIdGet_0

> ResponseModel getEmailByIdApiV1TempMailV1GetEmailByIdGet_0(token, messageId)

Get Email By Id

# [中文] ### 用途: - 通过邮件ID获取邮件数据 ### 参数: - token: 邮箱Bearer Token - message_id: 邮件ID ### 返回: - 邮件数据  # [English] ### Purpose: - Get email data by email ID ### Parameters: - token: Email Bearer Token - message_id: Email ID ### Returns: - Email data

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TempMailApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TempMailApiApi apiInstance = new TempMailApiApi(defaultClient);
        String token = "token_example"; // String | Bearer Token
        String messageId = "messageId_example"; // String | Message ID
        try {
            ResponseModel result = apiInstance.getEmailByIdApiV1TempMailV1GetEmailByIdGet_0(token, messageId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TempMailApiApi#getEmailByIdApiV1TempMailV1GetEmailByIdGet_0");
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
 **token** | **String**| Bearer Token |
 **messageId** | **String**| Message ID |

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


## getEmailsApiV1TempMailV1GetEmailsInboxGet

> ResponseModel getEmailsApiV1TempMailV1GetEmailsInboxGet(token)

Get Emails

# [中文] ### 用途: - 获取邮件列表 ### 参数: - token: 邮箱Bearer Token ### 返回: - emails: 邮件列表  # [English] ### Purpose: - Get a list of emails ### Parameters: - token: Email Bearer Token ### Returns: - emails: List of emails

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TempMailApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TempMailApiApi apiInstance = new TempMailApiApi(defaultClient);
        String token = "token_example"; // String | Bearer Token
        try {
            ResponseModel result = apiInstance.getEmailsApiV1TempMailV1GetEmailsInboxGet(token);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TempMailApiApi#getEmailsApiV1TempMailV1GetEmailsInboxGet");
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
 **token** | **String**| Bearer Token |

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


## getEmailsApiV1TempMailV1GetEmailsInboxGet_0

> ResponseModel getEmailsApiV1TempMailV1GetEmailsInboxGet_0(token)

Get Emails

# [中文] ### 用途: - 获取邮件列表 ### 参数: - token: 邮箱Bearer Token ### 返回: - emails: 邮件列表  # [English] ### Purpose: - Get a list of emails ### Parameters: - token: Email Bearer Token ### Returns: - emails: List of emails

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TempMailApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TempMailApiApi apiInstance = new TempMailApiApi(defaultClient);
        String token = "token_example"; // String | Bearer Token
        try {
            ResponseModel result = apiInstance.getEmailsApiV1TempMailV1GetEmailsInboxGet_0(token);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TempMailApiApi#getEmailsApiV1TempMailV1GetEmailsInboxGet_0");
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
 **token** | **String**| Bearer Token |

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


## getTempEmailApiV1TempMailV1GetTempEmailAddressGet

> ResponseModel getTempEmailApiV1TempMailV1GetTempEmailAddressGet()

Get Temp Email

# [中文] ### 用途: - 获取一个临时邮箱地址 - 用于注册或者接收邮件，该邮箱地址不会被删除，也不会被其他人使用。 - 该邮箱无法发送邮件，只能接收邮件。 - 请自行保存邮箱地址、用户名、密码、Bearer Token，我们无法帮助您找回这些关键信息。 ### 参数: - 无 ### 返回: - domain: 邮箱域名 - name: 邮箱用户名 - password: 邮箱密码 - email_address: 邮箱地址 - token: 邮箱Bearer Token  # [English] ### Purpose: - Get a temporary email address - Used for registration or receiving emails, this email address will not be deleted or used by others. - This email cannot send emails, only receive emails. - Please save the email address, username, password, and Bearer Token yourself, we cannot help you retrieve this critical information. ### Parameters: - None ### Returns: - domain: Email domain - name: Email username - password: Email password - email_address: Email address - token: Email Bearer Token

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TempMailApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TempMailApiApi apiInstance = new TempMailApiApi(defaultClient);
        try {
            ResponseModel result = apiInstance.getTempEmailApiV1TempMailV1GetTempEmailAddressGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TempMailApiApi#getTempEmailApiV1TempMailV1GetTempEmailAddressGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

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


## getTempEmailApiV1TempMailV1GetTempEmailAddressGet_0

> ResponseModel getTempEmailApiV1TempMailV1GetTempEmailAddressGet_0()

Get Temp Email

# [中文] ### 用途: - 获取一个临时邮箱地址 - 用于注册或者接收邮件，该邮箱地址不会被删除，也不会被其他人使用。 - 该邮箱无法发送邮件，只能接收邮件。 - 请自行保存邮箱地址、用户名、密码、Bearer Token，我们无法帮助您找回这些关键信息。 ### 参数: - 无 ### 返回: - domain: 邮箱域名 - name: 邮箱用户名 - password: 邮箱密码 - email_address: 邮箱地址 - token: 邮箱Bearer Token  # [English] ### Purpose: - Get a temporary email address - Used for registration or receiving emails, this email address will not be deleted or used by others. - This email cannot send emails, only receive emails. - Please save the email address, username, password, and Bearer Token yourself, we cannot help you retrieve this critical information. ### Parameters: - None ### Returns: - domain: Email domain - name: Email username - password: Email password - email_address: Email address - token: Email Bearer Token

### Example

```java
// Import classes:
import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Configuration;
import io.tikhub.client.auth.*;
import io.tikhub.client.models.*;
import io.tikhub.client.api.TempMailApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        TempMailApiApi apiInstance = new TempMailApiApi(defaultClient);
        try {
            ResponseModel result = apiInstance.getTempEmailApiV1TempMailV1GetTempEmailAddressGet_0();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TempMailApiApi#getTempEmailApiV1TempMailV1GetTempEmailAddressGet_0");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

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

