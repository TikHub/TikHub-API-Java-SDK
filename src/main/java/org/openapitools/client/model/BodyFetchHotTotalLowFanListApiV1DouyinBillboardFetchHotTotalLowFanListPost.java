/*
 * TikHub.io - Your Ultimate Social Media Data & API Marketplace
 * High-performance asynchronous Douyin(抖音) TikTok Xiaohongshu(小红书) Kuaishou(快手) Weibo(微博) Instagram YouTube(油管) Twitter(X) Captcha Solver(验证码解决器) Temp Mail(临时邮箱) API(接口).
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * Body_fetch_hot_total_low_fan_list_api_v1_douyin_billboard_fetch_hot_total_low_fan_list_post
 */
@ApiModel(description = "Body_fetch_hot_total_low_fan_list_api_v1_douyin_billboard_fetch_hot_total_low_fan_list_post")
@JsonPropertyOrder({
  BodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost.JSON_PROPERTY_PAGE,
  BodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost.JSON_PROPERTY_PAGE_SIZE,
  BodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost.JSON_PROPERTY_DATE_WINDOW,
  BodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost.JSON_PROPERTY_TAGS
})

public class BodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page = 1;

  public static final String JSON_PROPERTY_PAGE_SIZE = "page_size";
  private Integer pageSize = 10;

  public static final String JSON_PROPERTY_DATE_WINDOW = "date_window";
  private Integer dateWindow = 24;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<Object> tags = null;


  public BodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Page，页码
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Page，页码")
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public BodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Page Size，每页数量
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Page Size，每页数量")
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public BodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost dateWindow(Integer dateWindow) {
    
    this.dateWindow = dateWindow;
    return this;
  }

   /**
   * Date Window，时间窗口，1 按小时 2 按天
   * @return dateWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date Window，时间窗口，1 按小时 2 按天")
  @JsonProperty(JSON_PROPERTY_DATE_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDateWindow() {
    return dateWindow;
  }


  public void setDateWindow(Integer dateWindow) {
    this.dateWindow = dateWindow;
  }


  public BodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost tags(List<Object> tags) {
    
    this.tags = tags;
    return this;
  }

  public BodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost addTagsItem(Object tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags，子级垂类标签，空则为全部，多个标签需传入{\&quot;value\&quot;: \&quot;{顶级垂类标签id}\&quot;, \&quot;children\&quot;: [{\&quot;value\&quot;: \&quot;{子级垂类标签id}\&quot;}, {\&quot;value\&quot;: \&quot;{子级垂类标签id}\&quot;}]}
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags，子级垂类标签，空则为全部，多个标签需传入{\"value\": \"{顶级垂类标签id}\", \"children\": [{\"value\": \"{子级垂类标签id}\"}, {\"value\": \"{子级垂类标签id}\"}]}")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getTags() {
    return tags;
  }


  public void setTags(List<Object> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost bodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost = (BodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost) o;
    return Objects.equals(this.page, bodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost.page) &&
        Objects.equals(this.pageSize, bodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost.pageSize) &&
        Objects.equals(this.dateWindow, bodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost.dateWindow) &&
        Objects.equals(this.tags, bodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, dateWindow, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodyFetchHotTotalLowFanListApiV1DouyinBillboardFetchHotTotalLowFanListPost {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    dateWindow: ").append(toIndentedString(dateWindow)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

