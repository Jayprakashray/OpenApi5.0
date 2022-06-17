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
import io.swagger.client.model.ConsentResourceType;
import io.swagger.client.model.DataCluster;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Details of requested resource and data clusters
 */
@Schema(description = "Details of requested resource and data clusters")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class ConsentRequestedResource {
  @SerializedName("resourceType")
  private ConsentResourceType resourceType = null;

  @SerializedName("dataClusters")
  private List<DataCluster> dataClusters = new ArrayList<DataCluster>();

  public ConsentRequestedResource resourceType(ConsentResourceType resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @Schema(required = true, description = "")
  public ConsentResourceType getResourceType() {
    return resourceType;
  }

  public void setResourceType(ConsentResourceType resourceType) {
    this.resourceType = resourceType;
  }

  public ConsentRequestedResource dataClusters(List<DataCluster> dataClusters) {
    this.dataClusters = dataClusters;
    return this;
  }

  public ConsentRequestedResource addDataClustersItem(DataCluster dataClustersItem) {
    this.dataClusters.add(dataClustersItem);
    return this;
  }

   /**
   * Names of clusters of data elements requested
   * @return dataClusters
  **/
  @Schema(required = true, description = "Names of clusters of data elements requested")
  public List<DataCluster> getDataClusters() {
    return dataClusters;
  }

  public void setDataClusters(List<DataCluster> dataClusters) {
    this.dataClusters = dataClusters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentRequestedResource consentRequestedResource = (ConsentRequestedResource) o;
    return Objects.equals(this.resourceType, consentRequestedResource.resourceType) &&
        Objects.equals(this.dataClusters, consentRequestedResource.dataClusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, dataClusters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentRequestedResource {\n");
    
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    dataClusters: ").append(toIndentedString(dataClusters)).append("\n");
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