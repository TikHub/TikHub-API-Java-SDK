

# Pet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | 宠物ID编号 | 
**category** | [**Category**](Category.md) |  | 
**name** | **String** | 名称 | 
**photoUrls** | **List&lt;String&gt;** | 照片URL | 
**tags** | [**List&lt;Tag&gt;**](Tag.md) | 标签 | 
**status** | [**StatusEnum**](#StatusEnum) | 宠物销售状态 | 



## Enum: StatusEnum

Name | Value
---- | -----
AVAILABLE | &quot;available&quot;
PENDING | &quot;pending&quot;
SOLD | &quot;sold&quot;



