/*
 * ORY Keto
 * Ory Keto is a cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: Latest
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.keto.model;

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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * RemoveOryAccessControlPolicyRoleMembersInternalServerErrorBody remove ory access control policy role members internal server error body
 */
@ApiModel(description = "RemoveOryAccessControlPolicyRoleMembersInternalServerErrorBody remove ory access control policy role members internal server error body")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-13T18:03:34.403700Z[GMT]")
public class RemoveOryAccessControlPolicyRoleMembersInternalServerErrorBody {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Long code;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<Map<String, Object>> details = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private String request;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;


  public RemoveOryAccessControlPolicyRoleMembersInternalServerErrorBody code(Long code) {
    
    this.code = code;
    return this;
  }

   /**
   * code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "code")

  public Long getCode() {
    return code;
  }


  public void setCode(Long code) {
    this.code = code;
  }


  public RemoveOryAccessControlPolicyRoleMembersInternalServerErrorBody details(List<Map<String, Object>> details) {
    
    this.details = details;
    return this;
  }

  public RemoveOryAccessControlPolicyRoleMembersInternalServerErrorBody addDetailsItem(Map<String, Object> detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<Map<String, Object>>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "details")

  public List<Map<String, Object>> getDetails() {
    return details;
  }


  public void setDetails(List<Map<String, Object>> details) {
    this.details = details;
  }


  public RemoveOryAccessControlPolicyRoleMembersInternalServerErrorBody message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "message")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public RemoveOryAccessControlPolicyRoleMembersInternalServerErrorBody reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "reason")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public RemoveOryAccessControlPolicyRoleMembersInternalServerErrorBody request(String request) {
    
    this.request = request;
    return this;
  }

   /**
   * request
   * @return request
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "request")

  public String getRequest() {
    return request;
  }


  public void setRequest(String request) {
    this.request = request;
  }


  public RemoveOryAccessControlPolicyRoleMembersInternalServerErrorBody status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "status")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveOryAccessControlPolicyRoleMembersInternalServerErrorBody removeOryAccessControlPolicyRoleMembersInternalServerErrorBody = (RemoveOryAccessControlPolicyRoleMembersInternalServerErrorBody) o;
    return Objects.equals(this.code, removeOryAccessControlPolicyRoleMembersInternalServerErrorBody.code) &&
        Objects.equals(this.details, removeOryAccessControlPolicyRoleMembersInternalServerErrorBody.details) &&
        Objects.equals(this.message, removeOryAccessControlPolicyRoleMembersInternalServerErrorBody.message) &&
        Objects.equals(this.reason, removeOryAccessControlPolicyRoleMembersInternalServerErrorBody.reason) &&
        Objects.equals(this.request, removeOryAccessControlPolicyRoleMembersInternalServerErrorBody.request) &&
        Objects.equals(this.status, removeOryAccessControlPolicyRoleMembersInternalServerErrorBody.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, message, reason, request, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveOryAccessControlPolicyRoleMembersInternalServerErrorBody {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

