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
import io.swagger.client.model.AccountWithDetails;
import io.swagger.client.model.PageMetadata;
import io.swagger.client.model.PageMetadataLinks;
import io.swagger.client.model.PaginatedArray;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * An optionally paginated array of accounts
 */
@Schema(description = "An optionally paginated array of accounts")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class Accounts extends PaginatedArray {
  @SerializedName("accounts")
  private List<AccountWithDetails> accounts = null;

  public Accounts accounts(List<AccountWithDetails> accounts) {
    this.accounts = accounts;
    return this;
  }

  public Accounts addAccountsItem(AccountWithDetails accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<AccountWithDetails>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * An array of accounts with entity types dependent on the account type (deposit, investment, loan, line of credit, annuity or insurance)
   * @return accounts
  **/
  @Schema(description = "An array of accounts with entity types dependent on the account type (deposit, investment, loan, line of credit, annuity or insurance)")
  public List<AccountWithDetails> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<AccountWithDetails> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Accounts accounts = (Accounts) o;
    return Objects.equals(this.accounts, accounts.accounts) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Accounts {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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
