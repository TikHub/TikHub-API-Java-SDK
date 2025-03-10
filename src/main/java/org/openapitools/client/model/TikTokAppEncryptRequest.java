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
 * TikTok_APP_Encrypt_Request
 */
@ApiModel(description = "TikTok_APP_Encrypt_Request")
@JsonPropertyOrder({
  TikTokAppEncryptRequest.JSON_PROPERTY_URL,
  TikTokAppEncryptRequest.JSON_PROPERTY_DATA,
  TikTokAppEncryptRequest.JSON_PROPERTY_DEVICE_INFO
})

public class TikTokAppEncryptRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_URL = "url";
  private String url = "https://api16-normal-useast5.tiktokv.us/tiktok/v1/upvote/item/list?user_id=6726034365602628610&offset=0&count=21&scene=0&iid=7425045478163400491&device_id=7349721034012280362&ac=WIFI&channel=googleplay&aid=1233&app_name=musical_ly&version_code=360704&version_name=36.7.4&device_platform=android&os=android&ab_version=36.7.4&ssmix=a&device_type=Pixel+6+Pro&device_brand=google&language=zh&os_api=33&os_version=13&openudid=711192517a8bbf03&manifest_version_code=2023607040&resolution=1440*2891&dpi=560&update_version_code=2023607040&_rticket=1728977220468&is_pad=0&app_type=normal&sys_region=CN&last_install_time=1728977141&timezone_name=America%2FLos_Angeles&app_language=zh-Hans&ac2=wifi5g&uoo=0&op_region=CN&timezone_offset=-28800&build_number=36.7.4&host_abi=arm64-v8a&locale=zh-Hans&region=CN&content_language=en%2C&ts=1728977220&cdid=aa21524b-8633-49ca-8e6e-3275fe1672db";

  public static final String JSON_PROPERTY_DATA = "data";
  private String data = "";

  public static final String JSON_PROPERTY_DEVICE_INFO = "device_info";
  private Object deviceInfo = {"aid":"1233","cdid":"b820f79c-c74a-47b0-912f-ee3002ce60dc","channel":"googleplay","cookies":{},"device_brand":"HONOR","device_id":"7423364899755607598","device_manufacturer":"HUAWEI","device_model":"HONOR V30","device_platform":"android","device_type":"OXF-AN00","dpi":480,"host_abi":"arm64-v8a","iid":"7423365134775469866","lanusk":"","manifest_version_code":"2023604040","mc":"7E:EE:BA:BC:5E:40","mssdk_token":"","openudid":"63401ab5140125d1","os_api":29,"os_version":"10","resolution":"2400*1080","rom":"11.0.0.185C00","rom_version":"OXF-AN00-user 11.0.0 HUAWEIOXF-AN00 185-CHN-LGRP3 release-keys","server_time":1728386909,"ua":"com.zhiliaoapp.musically/2023604040 (Linux; U; Android 10; zh_CN; OXF-AN00; Build/185-CHN-LGRP3;tt-ok/3.12.13.4-tiktok)","update_version_code":"2023604040","uuid":"350244698061054","version_code":"360404","version_name":"36.4.4"};


  public TikTokAppEncryptRequest url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Url，需要加密的URL/URL to be encrypted
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Url，需要加密的URL/URL to be encrypted")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public TikTokAppEncryptRequest data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Data，如果有POST请求，请填写POST请求的数据参与加密计算/If there is a POST request, please fill in the data of the POST request to participate in the encryption calculation
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data，如果有POST请求，请填写POST请求的数据参与加密计算/If there is a POST request, please fill in the data of the POST request to participate in the encryption calculation")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public TikTokAppEncryptRequest deviceInfo(Object deviceInfo) {
    
    this.deviceInfo = deviceInfo;
    return this;
  }

   /**
   * Device Info，设备信息，可选参数，如果不填写则使用默认设备信息/Device information, optional parameter, if not filled in, the default device information is used
   * @return deviceInfo
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "Device Info，设备信息，可选参数，如果不填写则使用默认设备信息/Device information, optional parameter, if not filled in, the default device information is used")
  @JsonProperty(JSON_PROPERTY_DEVICE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getDeviceInfo() {
    return deviceInfo;
  }


  public void setDeviceInfo(Object deviceInfo) {
    this.deviceInfo = deviceInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TikTokAppEncryptRequest tikTokAppEncryptRequest = (TikTokAppEncryptRequest) o;
    return Objects.equals(this.url, tikTokAppEncryptRequest.url) &&
        Objects.equals(this.data, tikTokAppEncryptRequest.data) &&
        Objects.equals(this.deviceInfo, tikTokAppEncryptRequest.deviceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, data, deviceInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TikTokAppEncryptRequest {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    deviceInfo: ").append(toIndentedString(deviceInfo)).append("\n");
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

