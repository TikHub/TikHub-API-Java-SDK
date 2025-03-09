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

package io.tikhub.client.api;

import io.tikhub.client.ApiClient;
import io.tikhub.client.ApiException;
import io.tikhub.client.Pair;

import org.openapitools.client.model.HttpValidationError;
import org.openapitools.client.model.ResponseModel;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;

import java.util.concurrent.CompletableFuture;


public class KuaishouWebApiApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  
  public KuaishouWebApiApi() {
    this(new ApiClient());
  }

  public KuaishouWebApiApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
  }

  /**
   * 根据链接获取单个作品数据/Fetch single video by URL
   * # [中文] ### 用途: - 根据链接获取单个作品数据 ### 参数: - url: 作品链接 ### 返回: - 视频数据  # [English] ### Purpose: - Fetch single video by URL ### Parameters: - url: Photo URL ### Returns: - Video data  # [示例/Example] url &#x3D; \&quot;https://v.kuaishou.com/GKTpYm\&quot;
   * @param url  (required)
   * @return ResponseModel
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ResponseModel> fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet (String url) throws ApiException {
    // verify the required parameter 'url' is set
    if (url == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'url' when calling fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/kuaishou/web/fetch_one_video_by_url";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("url", url));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ResponseModel>() {})
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
          }
      });
  }
  /**
   * 根据链接获取单个作品数据/Fetch single video by URL
   * # [中文] ### 用途: - 根据链接获取单个作品数据 ### 参数: - url: 作品链接 ### 返回: - 视频数据  # [English] ### Purpose: - Fetch single video by URL ### Parameters: - url: Photo URL ### Returns: - Video data  # [示例/Example] url &#x3D; \&quot;https://v.kuaishou.com/GKTpYm\&quot;
   * @param url  (required)
   * @return ResponseModel
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ResponseModel> fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet_0 (String url) throws ApiException {
    // verify the required parameter 'url' is set
    if (url == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'url' when calling fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet_0"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/kuaishou/web/fetch_one_video_by_url";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("url", url));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "fetchOneVideoByUrlApiV1KuaishouWebFetchOneVideoByUrlGet_0 call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ResponseModel>() {})
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
          }
      });
  }
  /**
   * 快手单一视频查询接口V2/Kuaishou single video query API V2
   * # [中文] ### 用途: - 快手单一视频查询接口V2 ### 参数: - photo_id: 作品ID，作品ID可以从作品链接中提取 ### 返回: - 视频数据  # [English] ### Purpose: - Kuaishou single video query API V2 ### Parameters: - photo_id: Photo ID, the photo ID can be extracted from the photo link ### Returns: - Video data  # [示例/Example] photo_id &#x3D; \&quot;3xtdqvdnqd3psuc\&quot;
   * @param photoId  (required)
   * @return ResponseModel
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ResponseModel> fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get (String photoId) throws ApiException {
    // verify the required parameter 'photoId' is set
    if (photoId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'photoId' when calling fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/kuaishou/web/fetch_one_video_v2";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("photo_id", photoId));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ResponseModel>() {})
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
          }
      });
  }
  /**
   * 快手单一视频查询接口V2/Kuaishou single video query API V2
   * # [中文] ### 用途: - 快手单一视频查询接口V2 ### 参数: - photo_id: 作品ID，作品ID可以从作品链接中提取 ### 返回: - 视频数据  # [English] ### Purpose: - Kuaishou single video query API V2 ### Parameters: - photo_id: Photo ID, the photo ID can be extracted from the photo link ### Returns: - Video data  # [示例/Example] photo_id &#x3D; \&quot;3xtdqvdnqd3psuc\&quot;
   * @param photoId  (required)
   * @return ResponseModel
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ResponseModel> fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get_0 (String photoId) throws ApiException {
    // verify the required parameter 'photoId' is set
    if (photoId == null) {
        return CompletableFuture.failedFuture(new ApiException(400, "Missing the required parameter 'photoId' when calling fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get_0"));
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/kuaishou/web/fetch_one_video_v2";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("photo_id", photoId));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      return memberVarHttpClient.sendAsync(
              localVarRequestBuilder.build(),
              HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
          if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(new ApiException(localVarResponse.statusCode(),
                  "fetchOneVideoV2ApiV1KuaishouWebFetchOneVideoV2Get_0 call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ResponseModel>() {})
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
          }
      });
  }
}
