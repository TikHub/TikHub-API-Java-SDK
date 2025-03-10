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

import io.tikhub.client.ApiException;
import org.openapitools.client.model.HttpValidationError;
import org.openapitools.client.model.ResponseModel;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TempMailApiApi
 */
public class TempMailApiApiTest {

    private final TempMailApiApi api = new TempMailApiApi();

    /**
     * Get Email By Id
     *
     * # [中文] ### 用途: - 通过邮件ID获取邮件数据 ### 参数: - token: 邮箱Bearer Token - message_id: 邮件ID ### 返回: - 邮件数据  # [English] ### Purpose: - Get email data by email ID ### Parameters: - token: Email Bearer Token - message_id: Email ID ### Returns: - Email data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailByIdApiV1TempMailV1GetEmailByIdGetTest() throws ApiException {
        //
        //String token = null;
        //
        //String messageId = null;
        //
        //ResponseModel response = api.getEmailByIdApiV1TempMailV1GetEmailByIdGet(token, messageId);

        // TODO: test validations
    }
    /**
     * Get Email By Id
     *
     * # [中文] ### 用途: - 通过邮件ID获取邮件数据 ### 参数: - token: 邮箱Bearer Token - message_id: 邮件ID ### 返回: - 邮件数据  # [English] ### Purpose: - Get email data by email ID ### Parameters: - token: Email Bearer Token - message_id: Email ID ### Returns: - Email data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailByIdApiV1TempMailV1GetEmailByIdGet_0Test() throws ApiException {
        //
        //String token = null;
        //
        //String messageId = null;
        //
        //ResponseModel response = api.getEmailByIdApiV1TempMailV1GetEmailByIdGet_0(token, messageId);

        // TODO: test validations
    }
    /**
     * Get Emails
     *
     * # [中文] ### 用途: - 获取邮件列表 ### 参数: - token: 邮箱Bearer Token ### 返回: - emails: 邮件列表  # [English] ### Purpose: - Get a list of emails ### Parameters: - token: Email Bearer Token ### Returns: - emails: List of emails
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailsApiV1TempMailV1GetEmailsInboxGetTest() throws ApiException {
        //
        //String token = null;
        //
        //ResponseModel response = api.getEmailsApiV1TempMailV1GetEmailsInboxGet(token);

        // TODO: test validations
    }
    /**
     * Get Emails
     *
     * # [中文] ### 用途: - 获取邮件列表 ### 参数: - token: 邮箱Bearer Token ### 返回: - emails: 邮件列表  # [English] ### Purpose: - Get a list of emails ### Parameters: - token: Email Bearer Token ### Returns: - emails: List of emails
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailsApiV1TempMailV1GetEmailsInboxGet_0Test() throws ApiException {
        //
        //String token = null;
        //
        //ResponseModel response = api.getEmailsApiV1TempMailV1GetEmailsInboxGet_0(token);

        // TODO: test validations
    }
    /**
     * Get Temp Email
     *
     * # [中文] ### 用途: - 获取一个临时邮箱地址 - 用于注册或者接收邮件，该邮箱地址不会被删除，也不会被其他人使用。 - 该邮箱无法发送邮件，只能接收邮件。 - 请自行保存邮箱地址、用户名、密码、Bearer Token，我们无法帮助您找回这些关键信息。 ### 参数: - 无 ### 返回: - domain: 邮箱域名 - name: 邮箱用户名 - password: 邮箱密码 - email_address: 邮箱地址 - token: 邮箱Bearer Token  # [English] ### Purpose: - Get a temporary email address - Used for registration or receiving emails, this email address will not be deleted or used by others. - This email cannot send emails, only receive emails. - Please save the email address, username, password, and Bearer Token yourself, we cannot help you retrieve this critical information. ### Parameters: - None ### Returns: - domain: Email domain - name: Email username - password: Email password - email_address: Email address - token: Email Bearer Token
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTempEmailApiV1TempMailV1GetTempEmailAddressGetTest() throws ApiException {
        //
        //ResponseModel response = api.getTempEmailApiV1TempMailV1GetTempEmailAddressGet();

        // TODO: test validations
    }
    /**
     * Get Temp Email
     *
     * # [中文] ### 用途: - 获取一个临时邮箱地址 - 用于注册或者接收邮件，该邮箱地址不会被删除，也不会被其他人使用。 - 该邮箱无法发送邮件，只能接收邮件。 - 请自行保存邮箱地址、用户名、密码、Bearer Token，我们无法帮助您找回这些关键信息。 ### 参数: - 无 ### 返回: - domain: 邮箱域名 - name: 邮箱用户名 - password: 邮箱密码 - email_address: 邮箱地址 - token: 邮箱Bearer Token  # [English] ### Purpose: - Get a temporary email address - Used for registration or receiving emails, this email address will not be deleted or used by others. - This email cannot send emails, only receive emails. - Please save the email address, username, password, and Bearer Token yourself, we cannot help you retrieve this critical information. ### Parameters: - None ### Returns: - domain: Email domain - name: Email username - password: Email password - email_address: Email address - token: Email Bearer Token
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTempEmailApiV1TempMailV1GetTempEmailAddressGet_0Test() throws ApiException {
        //
        //ResponseModel response = api.getTempEmailApiV1TempMailV1GetTempEmailAddressGet_0();

        // TODO: test validations
    }
}
