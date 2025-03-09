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
 * ReplyCommentRequest
 */
@ApiModel(description = "ReplyCommentRequest")
@JsonPropertyOrder({
  ReplyCommentRequest.JSON_PROPERTY_AWEME_ID,
  ReplyCommentRequest.JSON_PROPERTY_REPLY_ID,
  ReplyCommentRequest.JSON_PROPERTY_TEXT,
  ReplyCommentRequest.JSON_PROPERTY_COOKIE,
  ReplyCommentRequest.JSON_PROPERTY_DEVICE_ID,
  ReplyCommentRequest.JSON_PROPERTY_IID,
  ReplyCommentRequest.JSON_PROPERTY_PROXY
})

public class ReplyCommentRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AWEME_ID = "aweme_id";
  private String awemeId = "7419966340443819295";

  public static final String JSON_PROPERTY_REPLY_ID = "reply_id";
  private String replyId = "7420673787547419435";

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text = "Hello, TikTok!";

  public static final String JSON_PROPERTY_COOKIE = "cookie";
  private String cookie = "Your_Cookie_From_Browser";

  public static final String JSON_PROPERTY_DEVICE_ID = "device_id";
  private String deviceId = "";

  public static final String JSON_PROPERTY_IID = "iid";
  private String iid = "";

  public static final String JSON_PROPERTY_PROXY = "proxy";
  private String proxy = "";


  public ReplyCommentRequest awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * AKA Video ID，Video ID, which can be obtained from the sharing link, for example: https://www.tiktok.com/@username/video/7419966340443819295
   * @return awemeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AKA Video ID，Video ID, which can be obtained from the sharing link, for example: https://www.tiktok.com/@username/video/7419966340443819295")
  @JsonProperty(JSON_PROPERTY_AWEME_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public ReplyCommentRequest replyId(String replyId) {
    
    this.replyId = replyId;
    return this;
  }

   /**
   * Reply Comment ID AKA CID，Comment ID, which can be obtained from the comment data of the specified video.
   * @return replyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reply Comment ID AKA CID，Comment ID, which can be obtained from the comment data of the specified video.")
  @JsonProperty(JSON_PROPERTY_REPLY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReplyId() {
    return replyId;
  }


  public void setReplyId(String replyId) {
    this.replyId = replyId;
  }


  public ReplyCommentRequest text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Comment Content，Comment content, TikTok comment content needs to comply with the specifications, do not contain illegal keywords, otherwise, even if the request is successful, it will be judged as spam comments by the system and will not be displayed.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comment Content，Comment content, TikTok comment content needs to comply with the specifications, do not contain illegal keywords, otherwise, even if the request is successful, it will be judged as spam comments by the system and will not be displayed.")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public ReplyCommentRequest cookie(String cookie) {
    
    this.cookie = cookie;
    return this;
  }

   /**
   * User Cookie，User Cookie, you can log in to your TikTok account in the browser and then copy the Cookie information, please use URL-encoded Cookie string when submitting.
   * @return cookie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User Cookie，User Cookie, you can log in to your TikTok account in the browser and then copy the Cookie information, please use URL-encoded Cookie string when submitting.")
  @JsonProperty(JSON_PROPERTY_COOKIE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCookie() {
    return cookie;
  }


  public void setCookie(String cookie) {
    this.cookie = cookie;
  }


  public ReplyCommentRequest deviceId(String deviceId) {
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Device ID，Device id, optional, if not filled in, it will be automatically generated, if you need to customize the device id, please use the device information interface to get the device id.
   * @return deviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Device ID，Device id, optional, if not filled in, it will be automatically generated, if you need to customize the device id, please use the device information interface to get the device id.")
  @JsonProperty(JSON_PROPERTY_DEVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  public ReplyCommentRequest iid(String iid) {
    
    this.iid = iid;
    return this;
  }

   /**
   * Device Install ID，Device install id, optional, if not filled in, it will be automatically generated, if you need to customize the device iid, please use the device information interface to get the device iid.
   * @return iid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Device Install ID，Device install id, optional, if not filled in, it will be automatically generated, if you need to customize the device iid, please use the device information interface to get the device iid.")
  @JsonProperty(JSON_PROPERTY_IID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIid() {
    return iid;
  }


  public void setIid(String iid) {
    this.iid = iid;
  }


  public ReplyCommentRequest proxy(String proxy) {
    
    this.proxy = proxy;
    return this;
  }

   /**
   * Proxy IP，Proxy IP, optional, if not filled in, it will be automatically generated, if you need to customize the proxy IP, please use the proxy IP interface to get the proxy IP.
   * @return proxy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Proxy IP，Proxy IP, optional, if not filled in, it will be automatically generated, if you need to customize the proxy IP, please use the proxy IP interface to get the proxy IP.")
  @JsonProperty(JSON_PROPERTY_PROXY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProxy() {
    return proxy;
  }


  public void setProxy(String proxy) {
    this.proxy = proxy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplyCommentRequest replyCommentRequest = (ReplyCommentRequest) o;
    return Objects.equals(this.awemeId, replyCommentRequest.awemeId) &&
        Objects.equals(this.replyId, replyCommentRequest.replyId) &&
        Objects.equals(this.text, replyCommentRequest.text) &&
        Objects.equals(this.cookie, replyCommentRequest.cookie) &&
        Objects.equals(this.deviceId, replyCommentRequest.deviceId) &&
        Objects.equals(this.iid, replyCommentRequest.iid) &&
        Objects.equals(this.proxy, replyCommentRequest.proxy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeId, replyId, text, cookie, deviceId, iid, proxy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplyCommentRequest {\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    replyId: ").append(toIndentedString(replyId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    cookie: ").append(toIndentedString(cookie)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    iid: ").append(toIndentedString(iid)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
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

