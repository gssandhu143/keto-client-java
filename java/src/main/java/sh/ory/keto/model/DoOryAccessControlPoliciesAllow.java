/*
 * ORY Keto
 * A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.37
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
import sh.ory.keto.model.OryAccessControlPolicyAllowedInput;

/**
 * DoOryAccessControlPoliciesAllow do ory access control policies allow
 */
@ApiModel(description = "DoOryAccessControlPoliciesAllow do ory access control policies allow")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T17:03:47.630236+01:00[Europe/Berlin]")
public class DoOryAccessControlPoliciesAllow {
  public static final String SERIALIZED_NAME_BODY = "Body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private OryAccessControlPolicyAllowedInput body;

  public static final String SERIALIZED_NAME_FLAVOR = "flavor";
  @SerializedName(SERIALIZED_NAME_FLAVOR)
  private String flavor;


  public DoOryAccessControlPoliciesAllow body(OryAccessControlPolicyAllowedInput body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OryAccessControlPolicyAllowedInput getBody() {
    return body;
  }


  public void setBody(OryAccessControlPolicyAllowedInput body) {
    this.body = body;
  }


  public DoOryAccessControlPoliciesAllow flavor(String flavor) {
    
    this.flavor = flavor;
    return this;
  }

   /**
   * The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.  in: path
   * @return flavor
  **/
  @ApiModelProperty(required = true, value = "The ORY Access Control Policy flavor. Can be \"regex\", \"glob\", and \"exact\".  in: path")

  public String getFlavor() {
    return flavor;
  }


  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoOryAccessControlPoliciesAllow doOryAccessControlPoliciesAllow = (DoOryAccessControlPoliciesAllow) o;
    return Objects.equals(this.body, doOryAccessControlPoliciesAllow.body) &&
        Objects.equals(this.flavor, doOryAccessControlPoliciesAllow.flavor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, flavor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoOryAccessControlPoliciesAllow {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
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

