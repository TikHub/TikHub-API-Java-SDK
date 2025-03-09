

# ABogusModel

ABogusModel
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | Url，请求的API URL，需要使用urlencode(url, safe&#x3D;&#39;*&#39;)进行编码 | The requested API URL, needs to be encoded using urlencode(url, safe&#x3D;&#39;*&#39;) | 
**data** | **String** | Data，POST请求API时的载荷数据，需要使用urlencode(data, safe&#x3D;&#39;*&#39;)进行编码 | The payload data when requesting the API with POST, needs to be encoded using urlencode(data, safe&#x3D;&#39;*&#39;) | 
**userAgent** | **String** | User Agent，请求API时的User-Agent | User-Agent when requesting the API | 
**index0** | **Integer** | Index 0，加密明文列表的第一个值，无特殊要求，默认为0 |  [optional]
**index1** | **Integer** | Index 1，加密明文列表的第一个值，无特殊要求，默认为1 |  [optional]
**index2** | **Integer** | Index 2，加密明文列表的第一个值，无特殊要求，默认为14 |  [optional]


## Implemented Interfaces

* Serializable


