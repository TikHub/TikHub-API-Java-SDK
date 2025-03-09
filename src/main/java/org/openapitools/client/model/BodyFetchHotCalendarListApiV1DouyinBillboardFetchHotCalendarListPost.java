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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * Body_fetch_hot_calendar_list_api_v1_douyin_billboard_fetch_hot_calendar_list_post
 */
@ApiModel(description = "Body_fetch_hot_calendar_list_api_v1_douyin_billboard_fetch_hot_calendar_list_post")
@JsonPropertyOrder({
  BodyFetchHotCalendarListApiV1DouyinBillboardFetchHotCalendarListPost.JSON_PROPERTY_CITY_CODE,
  BodyFetchHotCalendarListApiV1DouyinBillboardFetchHotCalendarListPost.JSON_PROPERTY_CATEGORY_CODE,
  BodyFetchHotCalendarListApiV1DouyinBillboardFetchHotCalendarListPost.JSON_PROPERTY_END_DATE,
  BodyFetchHotCalendarListApiV1DouyinBillboardFetchHotCalendarListPost.JSON_PROPERTY_START_DATE
})

public class BodyFetchHotCalendarListApiV1DouyinBillboardFetchHotCalendarListPost implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CITY_CODE = "city_code";
  private String cityCode = "";

  public static final String JSON_PROPERTY_CATEGORY_CODE = "category_code";
  private String categoryCode = "";

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private Integer endDate = 1735488000;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private Integer startDate = 1734902400;


  public BodyFetchHotCalendarListApiV1DouyinBillboardFetchHotCalendarListPost cityCode(String cityCode) {
    
    this.cityCode = cityCode;
    return this;
  }

   /**
   * City Code，城市编码，从城市列表获取，空为全部
   * @return cityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "City Code，城市编码，从城市列表获取，空为全部")
  @JsonProperty(JSON_PROPERTY_CITY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCityCode() {
    return cityCode;
  }


  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  public BodyFetchHotCalendarListApiV1DouyinBillboardFetchHotCalendarListPost categoryCode(String categoryCode) {
    
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * Category Code，热点榜分类编码，从热点榜分类获取，空为全部
   * @return categoryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Category Code，热点榜分类编码，从热点榜分类获取，空为全部")
  @JsonProperty(JSON_PROPERTY_CATEGORY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCategoryCode() {
    return categoryCode;
  }


  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }


  public BodyFetchHotCalendarListApiV1DouyinBillboardFetchHotCalendarListPost endDate(Integer endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End Date，快照结束时间 格式10位时间戳
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End Date，快照结束时间 格式10位时间戳")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndDate() {
    return endDate;
  }


  public void setEndDate(Integer endDate) {
    this.endDate = endDate;
  }


  public BodyFetchHotCalendarListApiV1DouyinBillboardFetchHotCalendarListPost startDate(Integer startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start Date，快照开始时间 格式10位时间戳
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start Date，快照开始时间 格式10位时间戳")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartDate() {
    return startDate;
  }


  public void setStartDate(Integer startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BodyFetchHotCalendarListApiV1DouyinBillboardFetchHotCalendarListPost bodyFetchHotCalendarListApiV1DouyinBillboardFetchHotCalendarListPost = (BodyFetchHotCalendarListApiV1DouyinBillboardFetchHotCalendarListPost) o;
    return Objects.equals(this.cityCode, bodyFetchHotCalendarListApiV1DouyinBillboardFetchHotCalendarListPost.cityCode) &&
        Objects.equals(this.categoryCode, bodyFetchHotCalendarListApiV1DouyinBillboardFetchHotCalendarListPost.categoryCode) &&
        Objects.equals(this.endDate, bodyFetchHotCalendarListApiV1DouyinBillboardFetchHotCalendarListPost.endDate) &&
        Objects.equals(this.startDate, bodyFetchHotCalendarListApiV1DouyinBillboardFetchHotCalendarListPost.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityCode, categoryCode, endDate, startDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodyFetchHotCalendarListApiV1DouyinBillboardFetchHotCalendarListPost {\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

