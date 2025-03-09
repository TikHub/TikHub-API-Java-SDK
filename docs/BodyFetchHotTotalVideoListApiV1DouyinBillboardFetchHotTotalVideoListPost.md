

# BodyFetchHotTotalVideoListApiV1DouyinBillboardFetchHotTotalVideoListPost

Body_fetch_hot_total_video_list_api_v1_douyin_billboard_fetch_hot_total_video_list_post
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**page** | **Integer** | Page，页码，默认1 |  [optional]
**pageSize** | **Integer** | Page Size，每页数量，默认10 |  [optional]
**dateWindow** | **Integer** | Date Window，时间窗口，1 按小时 2 按天 |  [optional]
**tags** | **List&lt;Object&gt;** | Tags，子级垂类标签，空则为全部，多个标签需传入{\&quot;value\&quot;: \&quot;{顶级垂类标签id}\&quot;, \&quot;children\&quot;: [{\&quot;value\&quot;: \&quot;{子级垂类标签id}\&quot;}, {\&quot;value\&quot;: \&quot;{子级垂类标签id}\&quot;}]} |  [optional]


## Implemented Interfaces

* Serializable


