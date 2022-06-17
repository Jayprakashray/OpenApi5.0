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
import io.swagger.client.model.TelephoneNumber;
import io.swagger.client.model.TelephoneNumberType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * A telephone number that can contain optional text for an arbitrary length telephone extension number
 */
@Schema(description = "A telephone number that can contain optional text for an arbitrary length telephone extension number")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class TelephoneNumberPlusExtension extends TelephoneNumber {
  @SerializedName("extension")
  private String extension = null;

  public TelephoneNumberPlusExtension extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * An arbitrary length telephone number extension
   * @return extension
  **/
  @Schema(description = "An arbitrary length telephone number extension")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelephoneNumberPlusExtension telephoneNumberPlusExtension = (TelephoneNumberPlusExtension) o;
    return Objects.equals(this.extension, telephoneNumberPlusExtension.extension) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelephoneNumberPlusExtension {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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
