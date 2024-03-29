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
import io.swagger.client.model.Availability;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Response object for /availability API
 */
@Schema(description = "Response object for /availability API")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class AvailabilityList {
  @SerializedName("availability")
  private List<Availability> availability = null;

  public AvailabilityList availability(List<Availability> availability) {
    this.availability = availability;
    return this;
  }

  public AvailabilityList addAvailabilityItem(Availability availabilityItem) {
    if (this.availability == null) {
      this.availability = new ArrayList<Availability>();
    }
    this.availability.add(availabilityItem);
    return this;
  }

   /**
   * Zero or more API availability metrics
   * @return availability
  **/
  @Schema(description = "Zero or more API availability metrics")
  public List<Availability> getAvailability() {
    return availability;
  }

  public void setAvailability(List<Availability> availability) {
    this.availability = availability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityList availabilityList = (AvailabilityList) o;
    return Objects.equals(this.availability, availabilityList.availability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityList {\n");
    
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
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
