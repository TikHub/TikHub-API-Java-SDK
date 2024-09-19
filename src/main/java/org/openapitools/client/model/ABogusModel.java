/*
 * Douyin(抖音) TikTok Xiaohongshu(小红书) Kuaishou(快手) Weibo(微博) Instagram YouTube(油管) Twitter(X) Captcha Solver(验证码解决器) Temp Mail(临时邮箱) API(接口).
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ABogusModel
 */
@ApiModel(description = "ABogusModel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-19T06:19:02.654880600-07:00[America/Los_Angeles]")
public class ABogusModel {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_USER_AGENT = "user_agent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;

  public static final String SERIALIZED_NAME_INDEX0 = "index_0";
  @SerializedName(SERIALIZED_NAME_INDEX0)
  private Integer index0 = 0;

  public static final String SERIALIZED_NAME_INDEX1 = "index_1";
  @SerializedName(SERIALIZED_NAME_INDEX1)
  private Integer index1 = 1;

  public static final String SERIALIZED_NAME_INDEX2 = "index_2";
  @SerializedName(SERIALIZED_NAME_INDEX2)
  private Integer index2 = 14;


  public ABogusModel url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Url，请求的API URL，需要使用urlencode(url, safe&#x3D;&#39;*&#39;)进行编码 | The requested API URL, needs to be encoded using urlencode(url, safe&#x3D;&#39;*&#39;)
   * @return url
  **/
  @ApiModelProperty(required = true, value = "Url，请求的API URL，需要使用urlencode(url, safe='*')进行编码 | The requested API URL, needs to be encoded using urlencode(url, safe='*')")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ABogusModel data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Data，POST请求API时的载荷数据，需要使用urlencode(data, safe&#x3D;&#39;*&#39;)进行编码 | The payload data when requesting the API with POST, needs to be encoded using urlencode(data, safe&#x3D;&#39;*&#39;)
   * @return data
  **/
  @ApiModelProperty(required = true, value = "Data，POST请求API时的载荷数据，需要使用urlencode(data, safe='*')进行编码 | The payload data when requesting the API with POST, needs to be encoded using urlencode(data, safe='*')")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public ABogusModel userAgent(String userAgent) {
    
    this.userAgent = userAgent;
    return this;
  }

   /**
   * User Agent，请求API时的User-Agent | User-Agent when requesting the API
   * @return userAgent
  **/
  @ApiModelProperty(required = true, value = "User Agent，请求API时的User-Agent | User-Agent when requesting the API")

  public String getUserAgent() {
    return userAgent;
  }


  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  public ABogusModel index0(Integer index0) {
    
    this.index0 = index0;
    return this;
  }

   /**
   * Index 0，加密明文列表的第一个值，无特殊要求，默认为0
   * @return index0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Index 0，加密明文列表的第一个值，无特殊要求，默认为0")

  public Integer getIndex0() {
    return index0;
  }


  public void setIndex0(Integer index0) {
    this.index0 = index0;
  }


  public ABogusModel index1(Integer index1) {
    
    this.index1 = index1;
    return this;
  }

   /**
   * Index 1，加密明文列表的第一个值，无特殊要求，默认为1
   * @return index1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Index 1，加密明文列表的第一个值，无特殊要求，默认为1")

  public Integer getIndex1() {
    return index1;
  }


  public void setIndex1(Integer index1) {
    this.index1 = index1;
  }


  public ABogusModel index2(Integer index2) {
    
    this.index2 = index2;
    return this;
  }

   /**
   * Index 2，加密明文列表的第一个值，无特殊要求，默认为14
   * @return index2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Index 2，加密明文列表的第一个值，无特殊要求，默认为14")

  public Integer getIndex2() {
    return index2;
  }


  public void setIndex2(Integer index2) {
    this.index2 = index2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ABogusModel abogusModel = (ABogusModel) o;
    return Objects.equals(this.url, abogusModel.url) &&
        Objects.equals(this.data, abogusModel.data) &&
        Objects.equals(this.userAgent, abogusModel.userAgent) &&
        Objects.equals(this.index0, abogusModel.index0) &&
        Objects.equals(this.index1, abogusModel.index1) &&
        Objects.equals(this.index2, abogusModel.index2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, data, userAgent, index0, index1, index2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABogusModel {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    index0: ").append(toIndentedString(index0)).append("\n");
    sb.append("    index1: ").append(toIndentedString(index1)).append("\n");
    sb.append("    index2: ").append(toIndentedString(index2)).append("\n");
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

