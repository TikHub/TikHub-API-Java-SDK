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

import org.openapitools.client.model.HealthCheckResponse;

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


public class HealthCheckApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  
  public HealthCheckApi() {
    this(new ApiClient());
  }

  public HealthCheckApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
  }

  /**
   * 检查服务器是否正确响应请求 / Check if the server responds to requests correctly
   * # [中文]  ### 用途说明:  - 检查服务器是否正确响应请求。  ### 参数说明:  - 无参数。  ### 返回结果:  - &#x60;status&#x60;: 服务器状态，正常为 &#x60;ok&#x60;。  # [English]  ### Purpose:  - Check if the server responds to requests correctly.  ### Parameter Description:  - No parameters.  ### Return Result:  - &#x60;status&#x60;: Server status, normal is &#x60;ok&#x60;.
   * @return HealthCheckResponse
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<HealthCheckResponse> healthCheckApiV1HealthCheckGet () throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/health/check";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

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
                  "healthCheckApiV1HealthCheckGet call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<HealthCheckResponse>() {})
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
          }
      });
  }
  /**
   * 检查服务器是否正确响应请求 / Check if the server responds to requests correctly
   * # [中文]  ### 用途说明:  - 检查服务器是否正确响应请求。  ### 参数说明:  - 无参数。  ### 返回结果:  - &#x60;status&#x60;: 服务器状态，正常为 &#x60;ok&#x60;。  # [English]  ### Purpose:  - Check if the server responds to requests correctly.  ### Parameter Description:  - No parameters.  ### Return Result:  - &#x60;status&#x60;: Server status, normal is &#x60;ok&#x60;.
   * @return HealthCheckResponse
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<HealthCheckResponse> healthCheckApiV1HealthCheckGet_0 () throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/health/check";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

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
                  "healthCheckApiV1HealthCheckGet_0 call received non-success response",
                  localVarResponse.headers(),
                  localVarResponse.body())
              );
          } else {
               try {
                  return CompletableFuture.completedFuture(
                          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<HealthCheckResponse>() {})
                  );
              } catch (IOException e) {
                  return CompletableFuture.failedFuture(new ApiException(e));
              }
          }
      });
  }
}
