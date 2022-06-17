/*
 * FDX V5.0
 * Financial Data Exchange V5.0 Core API
 *
 * OpenAPI spec version: 5.0.0
 * Contact: fdxsupport@financialdataexchange.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ConsentDurationType;
import io.swagger.client.model.ConsentRequestedResource;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Details of request to create new consent grant. This schema is to be used in POST request to Data Provider’s &#x27;POST /par&#x27; endpoint using the Pushed Authorization Request (PAR) method
 */
@Schema(description = "Details of request to create new consent grant. This schema is to be used in POST request to Data Provider’s 'POST /par' endpoint using the Pushed Authorization Request (PAR) method")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class ConsentRequest {
  @SerializedName("durationType")
  private ConsentDurationType durationType = null;

  @SerializedName("durationPeriod")
  private Integer durationPeriod = null;

  @SerializedName("lookbackPeriod")
  private Integer lookbackPeriod = null;

  @SerializedName("resources")
  private List<ConsentRequestedResource> resources = null;

  public ConsentRequest durationType(ConsentDurationType durationType) {
    this.durationType = durationType;
    return this;
  }

   /**
   * Get durationType
   * @return durationType
  **/
  @Schema(description = "")
  public ConsentDurationType getDurationType() {
    return durationType;
  }

  public void setDurationType(ConsentDurationType durationType) {
    this.durationType = durationType;
  }

  public ConsentRequest durationPeriod(Integer durationPeriod) {
    this.durationPeriod = durationPeriod;
    return this;
  }

   /**
   * Get durationPeriod
   * @return durationPeriod
  **/
  @Schema(description = "")
  public Integer getDurationPeriod() {
    return durationPeriod;
  }

  public void setDurationPeriod(Integer durationPeriod) {
    this.durationPeriod = durationPeriod;
  }

  public ConsentRequest lookbackPeriod(Integer lookbackPeriod) {
    this.lookbackPeriod = lookbackPeriod;
    return this;
  }

   /**
   * Get lookbackPeriod
   * @return lookbackPeriod
  **/
  @Schema(description = "")
  public Integer getLookbackPeriod() {
    return lookbackPeriod;
  }

  public void setLookbackPeriod(Integer lookbackPeriod) {
    this.lookbackPeriod = lookbackPeriod;
  }

  public ConsentRequest resources(List<ConsentRequestedResource> resources) {
    this.resources = resources;
    return this;
  }

  public ConsentRequest addResourcesItem(ConsentRequestedResource resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<ConsentRequestedResource>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * The requested resource entities
   * @return resources
  **/
  @Schema(description = "The requested resource entities")
  public List<ConsentRequestedResource> getResources() {
    return resources;
  }

  public void setResources(List<ConsentRequestedResource> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentRequest consentRequest = (ConsentRequest) o;
    return Objects.equals(this.durationType, consentRequest.durationType) &&
        Objects.equals(this.durationPeriod, consentRequest.durationPeriod) &&
        Objects.equals(this.lookbackPeriod, consentRequest.lookbackPeriod) &&
        Objects.equals(this.resources, consentRequest.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationType, durationPeriod, lookbackPeriod, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentRequest {\n");
    
    sb.append("    durationType: ").append(toIndentedString(durationType)).append("\n");
    sb.append("    durationPeriod: ").append(toIndentedString(durationPeriod)).append("\n");
    sb.append("    lookbackPeriod: ").append(toIndentedString(lookbackPeriod)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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