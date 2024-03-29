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
import io.swagger.client.model.ConsentGrantParty;
import io.swagger.client.model.ConsentGrantResource;
import io.swagger.client.model.ConsentGrantStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Record of user consent
 */
@Schema(description = "Record of user consent")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class ConsentGrant {
  @SerializedName("id")
  private String id = null;

  @SerializedName("status")
  private ConsentGrantStatus status = null;

  @SerializedName("parties")
  private List<ConsentGrantParty> parties = null;

  @SerializedName("createdTime")
  private OffsetDateTime createdTime = null;

  @SerializedName("expirationTime")
  private OffsetDateTime expirationTime = null;

  @SerializedName("durationType")
  private ConsentDurationType durationType = null;

  @SerializedName("durationPeriod")
  private Integer durationPeriod = null;

  @SerializedName("lookbackPeriod")
  private Integer lookbackPeriod = null;

  @SerializedName("resources")
  private List<ConsentGrantResource> resources = null;

  public ConsentGrant id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConsentGrant status(ConsentGrantStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public ConsentGrantStatus getStatus() {
    return status;
  }

  public void setStatus(ConsentGrantStatus status) {
    this.status = status;
  }

  public ConsentGrant parties(List<ConsentGrantParty> parties) {
    this.parties = parties;
    return this;
  }

  public ConsentGrant addPartiesItem(ConsentGrantParty partiesItem) {
    if (this.parties == null) {
      this.parties = new ArrayList<ConsentGrantParty>();
    }
    this.parties.add(partiesItem);
    return this;
  }

   /**
   * The non-end user parties participating in the Consent Grant
   * @return parties
  **/
  @Schema(description = "The non-end user parties participating in the Consent Grant")
  public List<ConsentGrantParty> getParties() {
    return parties;
  }

  public void setParties(List<ConsentGrantParty> parties) {
    this.parties = parties;
  }

  public ConsentGrant createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public ConsentGrant expirationTime(OffsetDateTime expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * Get expirationTime
   * @return expirationTime
  **/
  @Schema(description = "")
  public OffsetDateTime getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(OffsetDateTime expirationTime) {
    this.expirationTime = expirationTime;
  }

  public ConsentGrant durationType(ConsentDurationType durationType) {
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

  public ConsentGrant durationPeriod(Integer durationPeriod) {
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

  public ConsentGrant lookbackPeriod(Integer lookbackPeriod) {
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

  public ConsentGrant resources(List<ConsentGrantResource> resources) {
    this.resources = resources;
    return this;
  }

  public ConsentGrant addResourcesItem(ConsentGrantResource resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<ConsentGrantResource>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * The permissioned resource entities
   * @return resources
  **/
  @Schema(description = "The permissioned resource entities")
  public List<ConsentGrantResource> getResources() {
    return resources;
  }

  public void setResources(List<ConsentGrantResource> resources) {
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
    ConsentGrant consentGrant = (ConsentGrant) o;
    return Objects.equals(this.id, consentGrant.id) &&
        Objects.equals(this.status, consentGrant.status) &&
        Objects.equals(this.parties, consentGrant.parties) &&
        Objects.equals(this.createdTime, consentGrant.createdTime) &&
        Objects.equals(this.expirationTime, consentGrant.expirationTime) &&
        Objects.equals(this.durationType, consentGrant.durationType) &&
        Objects.equals(this.durationPeriod, consentGrant.durationPeriod) &&
        Objects.equals(this.lookbackPeriod, consentGrant.lookbackPeriod) &&
        Objects.equals(this.resources, consentGrant.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, parties, createdTime, expirationTime, durationType, durationPeriod, lookbackPeriod, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentGrant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    parties: ").append(toIndentedString(parties)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
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
