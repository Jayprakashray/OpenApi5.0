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
import io.swagger.client.model.AccountHolder;
import io.swagger.client.model.DeliveryAddress;
import io.swagger.client.model.TelephoneNumber;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Contact information for the account
 */
@Schema(description = "Contact information for the account")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class AccountContact {
  @SerializedName("holders")
  private List<AccountHolder> holders = null;

  @SerializedName("emails")
  private List<String> emails = null;

  @SerializedName("addresses")
  private List<DeliveryAddress> addresses = null;

  @SerializedName("telephones")
  private List<TelephoneNumber> telephones = null;

  public AccountContact holders(List<AccountHolder> holders) {
    this.holders = holders;
    return this;
  }

  public AccountContact addHoldersItem(AccountHolder holdersItem) {
    if (this.holders == null) {
      this.holders = new ArrayList<AccountHolder>();
    }
    this.holders.add(holdersItem);
    return this;
  }

   /**
   * Owners of the acount
   * @return holders
  **/
  @Schema(description = "Owners of the acount")
  public List<AccountHolder> getHolders() {
    return holders;
  }

  public void setHolders(List<AccountHolder> holders) {
    this.holders = holders;
  }

  public AccountContact emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public AccountContact addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<String>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Email addresses associated with the account
   * @return emails
  **/
  @Schema(description = "Email addresses associated with the account")
  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  public AccountContact addresses(List<DeliveryAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public AccountContact addAddressesItem(DeliveryAddress addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<DeliveryAddress>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Physical mail addresses associated with the account
   * @return addresses
  **/
  @Schema(description = "Physical mail addresses associated with the account")
  public List<DeliveryAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<DeliveryAddress> addresses) {
    this.addresses = addresses;
  }

  public AccountContact telephones(List<TelephoneNumber> telephones) {
    this.telephones = telephones;
    return this;
  }

  public AccountContact addTelephonesItem(TelephoneNumber telephonesItem) {
    if (this.telephones == null) {
      this.telephones = new ArrayList<TelephoneNumber>();
    }
    this.telephones.add(telephonesItem);
    return this;
  }

   /**
   * Telephone numbers associated with the account
   * @return telephones
  **/
  @Schema(description = "Telephone numbers associated with the account")
  public List<TelephoneNumber> getTelephones() {
    return telephones;
  }

  public void setTelephones(List<TelephoneNumber> telephones) {
    this.telephones = telephones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountContact accountContact = (AccountContact) o;
    return Objects.equals(this.holders, accountContact.holders) &&
        Objects.equals(this.emails, accountContact.emails) &&
        Objects.equals(this.addresses, accountContact.addresses) &&
        Objects.equals(this.telephones, accountContact.telephones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holders, emails, addresses, telephones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountContact {\n");
    
    sb.append("    holders: ").append(toIndentedString(holders)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    telephones: ").append(toIndentedString(telephones)).append("\n");
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