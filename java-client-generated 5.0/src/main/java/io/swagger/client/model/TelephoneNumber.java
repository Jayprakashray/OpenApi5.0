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
import io.swagger.client.model.TelephoneNumberType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Standard for international phone numbers
 */
@Schema(description = "Standard for international phone numbers")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class TelephoneNumber {
  @SerializedName("type")
  private TelephoneNumberType type = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("number")
  private String number = null;

  public TelephoneNumber type(TelephoneNumberType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TelephoneNumberType getType() {
    return type;
  }

  public void setType(TelephoneNumberType type) {
    this.type = type;
  }

  public TelephoneNumber country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country calling codes defined by ITU-T recommendations E.123 and E.164
   * @return country
  **/
  @Schema(description = "Country calling codes defined by ITU-T recommendations E.123 and E.164")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public TelephoneNumber number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Telephone subscriber number defined by ITU-T recommendation E.164
   * @return number
  **/
  @Schema(description = "Telephone subscriber number defined by ITU-T recommendation E.164")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelephoneNumber telephoneNumber = (TelephoneNumber) o;
    return Objects.equals(this.type, telephoneNumber.type) &&
        Objects.equals(this.country, telephoneNumber.country) &&
        Objects.equals(this.number, telephoneNumber.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, country, number);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelephoneNumber {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
