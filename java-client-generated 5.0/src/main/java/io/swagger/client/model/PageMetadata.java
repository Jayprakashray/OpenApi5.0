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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Offset IDs for paginated result sets
 */
@Schema(description = "Offset IDs for paginated result sets")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class PageMetadata {
  @SerializedName("nextOffset")
  private String nextOffset = null;

  @SerializedName("prevOffset")
  private String prevOffset = null;

  @SerializedName("totalElements")
  private Integer totalElements = null;

  public PageMetadata nextOffset(String nextOffset) {
    this.nextOffset = nextOffset;
    return this;
  }

   /**
   * Opaque identifier. Does not need to be numeric or have any specific pattern. Implementation specific
   * @return nextOffset
  **/
  @Schema(example = "2", description = "Opaque identifier. Does not need to be numeric or have any specific pattern. Implementation specific")
  public String getNextOffset() {
    return nextOffset;
  }

  public void setNextOffset(String nextOffset) {
    this.nextOffset = nextOffset;
  }

  public PageMetadata prevOffset(String prevOffset) {
    this.prevOffset = prevOffset;
    return this;
  }

   /**
   * Opaque identifier. Does not need to be numeric or have any specific pattern. Implementation specific
   * @return prevOffset
  **/
  @Schema(example = "1", description = "Opaque identifier. Does not need to be numeric or have any specific pattern. Implementation specific")
  public String getPrevOffset() {
    return prevOffset;
  }

  public void setPrevOffset(String prevOffset) {
    this.prevOffset = prevOffset;
  }

  public PageMetadata totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

   /**
   * Total number of elements
   * @return totalElements
  **/
  @Schema(example = "3", description = "Total number of elements")
  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageMetadata pageMetadata = (PageMetadata) o;
    return Objects.equals(this.nextOffset, pageMetadata.nextOffset) &&
        Objects.equals(this.prevOffset, pageMetadata.prevOffset) &&
        Objects.equals(this.totalElements, pageMetadata.totalElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextOffset, prevOffset, totalElements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageMetadata {\n");
    
    sb.append("    nextOffset: ").append(toIndentedString(nextOffset)).append("\n");
    sb.append("    prevOffset: ").append(toIndentedString(prevOffset)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
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
