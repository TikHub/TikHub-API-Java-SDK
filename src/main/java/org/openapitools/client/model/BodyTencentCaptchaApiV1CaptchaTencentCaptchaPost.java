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
 * Body_tencent_captcha_api_v1_captcha_tencent_captcha_post
 */
@ApiModel(description = "Body_tencent_captcha_api_v1_captcha_tencent_captcha_post")
@JsonPropertyOrder({
  BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost.JSON_PROPERTY_APP_ID,
  BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost.JSON_PROPERTY_URL,
  BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost.JSON_PROPERTY_PROXY
})

public class BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_APP_ID = "app_id";
  private String appId;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_PROXY = "proxy";
  private Object proxy;


  public BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * App Id，App ID
   * @return appId
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "App Id，App ID")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Url，URL
   * @return url
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Url，URL")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost proxy(Object proxy) {
    
    this.proxy = proxy;
    return this;
  }

   /**
   * Proxy，Proxy
   * @return proxy
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "Proxy，Proxy")
  @JsonProperty(JSON_PROPERTY_PROXY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getProxy() {
    return proxy;
  }


  public void setProxy(Object proxy) {
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
    BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost bodyTencentCaptchaApiV1CaptchaTencentCaptchaPost = (BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost) o;
    return Objects.equals(this.appId, bodyTencentCaptchaApiV1CaptchaTencentCaptchaPost.appId) &&
        Objects.equals(this.url, bodyTencentCaptchaApiV1CaptchaTencentCaptchaPost.url) &&
        Objects.equals(this.proxy, bodyTencentCaptchaApiV1CaptchaTencentCaptchaPost.proxy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, url, proxy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodyTencentCaptchaApiV1CaptchaTencentCaptchaPost {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

