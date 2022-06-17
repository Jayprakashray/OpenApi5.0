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
import io.swagger.client.model.IndividualName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The name of an individual in their role as a customer
 */
@Schema(description = "The name of an individual in their role as a customer")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class CustomerName extends IndividualName {
  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("company")
  private String company = null;

  public CustomerName prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Name prefix, e.g. Mr.
   * @return prefix
  **/
  @Schema(description = "Name prefix, e.g. Mr.")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public CustomerName company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Company name
   * @return company
  **/
  @Schema(description = "Company name")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerName customerName = (CustomerName) o;
    return Objects.equals(this.prefix, customerName.prefix) &&
        Objects.equals(this.company, customerName.company) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, company, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerName {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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
