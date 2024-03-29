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
import io.swagger.client.model.AccountHolderRelationship;
import io.swagger.client.model.Customer;
import io.swagger.client.model.CustomerName;
import io.swagger.client.model.CustomerToAccountRelationship;
import io.swagger.client.model.DeliveryAddress;
import io.swagger.client.model.Iso3166CountryCode;
import io.swagger.client.model.TelephoneNumber;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
import org.threeten.bp.LocalDate;
/**
 * Extends &#x60;Customer&#x60; and adds a &#x60;relationship&#x60; field to define the customer&#x27;s relationship with an account
 */
@Schema(description = "Extends `Customer` and adds a `relationship` field to define the customer's relationship with an account")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class AccountHolder extends Customer {
  @SerializedName("relationship")
  private AccountHolderRelationship relationship = null;

  public AccountHolder relationship(AccountHolderRelationship relationship) {
    this.relationship = relationship;
    return this;
  }

   /**
   * Get relationship
   * @return relationship
  **/
  @Schema(description = "")
  public AccountHolderRelationship getRelationship() {
    return relationship;
  }

  public void setRelationship(AccountHolderRelationship relationship) {
    this.relationship = relationship;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountHolder accountHolder = (AccountHolder) o;
    return Objects.equals(this.relationship, accountHolder.relationship) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationship, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountHolder {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
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
