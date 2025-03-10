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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * UserData
 */
@ApiModel(description = "UserData")
@JsonPropertyOrder({
  UserData.JSON_PROPERTY_EMAIL,
  UserData.JSON_PROPERTY_BALANCE,
  UserData.JSON_PROPERTY_FREE_CREDIT,
  UserData.JSON_PROPERTY_EMAIL_VERIFIED,
  UserData.JSON_PROPERTY_ACCOUNT_DISABLED,
  UserData.JSON_PROPERTY_IS_ACTIVE
})

public class UserData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_BALANCE = "balance";
  private BigDecimal balance;

  public static final String JSON_PROPERTY_FREE_CREDIT = "free_credit";
  private BigDecimal freeCredit;

  public static final String JSON_PROPERTY_EMAIL_VERIFIED = "email_verified";
  private Boolean emailVerified;

  public static final String JSON_PROPERTY_ACCOUNT_DISABLED = "account_disabled";
  private Boolean accountDisabled;

  public static final String JSON_PROPERTY_IS_ACTIVE = "is_active";
  private Boolean isActive;


  public UserData email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email
   * @return email
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Email")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UserData balance(BigDecimal balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Balance
   * @return balance
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "Balance")
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getBalance() {
    return balance;
  }


  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  public UserData freeCredit(BigDecimal freeCredit) {
    
    this.freeCredit = freeCredit;
    return this;
  }

   /**
   * Free Credit
   * @return freeCredit
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "Free Credit")
  @JsonProperty(JSON_PROPERTY_FREE_CREDIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getFreeCredit() {
    return freeCredit;
  }


  public void setFreeCredit(BigDecimal freeCredit) {
    this.freeCredit = freeCredit;
  }


  public UserData emailVerified(Boolean emailVerified) {
    
    this.emailVerified = emailVerified;
    return this;
  }

   /**
   * Email Verified
   * @return emailVerified
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Email Verified")
  @JsonProperty(JSON_PROPERTY_EMAIL_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isEmailVerified() {
    return emailVerified;
  }


  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }


  public UserData accountDisabled(Boolean accountDisabled) {
    
    this.accountDisabled = accountDisabled;
    return this;
  }

   /**
   * Account Disabled
   * @return accountDisabled
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Account Disabled")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_DISABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isAccountDisabled() {
    return accountDisabled;
  }


  public void setAccountDisabled(Boolean accountDisabled) {
    this.accountDisabled = accountDisabled;
  }


  public UserData isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Is Active
   * @return isActive
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Is Active")
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserData userData = (UserData) o;
    return Objects.equals(this.email, userData.email) &&
        Objects.equals(this.balance, userData.balance) &&
        Objects.equals(this.freeCredit, userData.freeCredit) &&
        Objects.equals(this.emailVerified, userData.emailVerified) &&
        Objects.equals(this.accountDisabled, userData.accountDisabled) &&
        Objects.equals(this.isActive, userData.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, balance, freeCredit, emailVerified, accountDisabled, isActive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserData {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    freeCredit: ").append(toIndentedString(freeCredit)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    accountDisabled: ").append(toIndentedString(accountDisabled)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

