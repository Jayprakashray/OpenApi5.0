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
import io.swagger.client.model.DebitCreditMemo;
import io.swagger.client.model.DepositTransactionType;
import io.swagger.client.model.FiAttribute;
import io.swagger.client.model.HateoasLinks;
import io.swagger.client.model.Iso4217Code;
import io.swagger.client.model.LineItem;
import io.swagger.client.model.Transaction;
import io.swagger.client.model.TransactionReward;
import io.swagger.client.model.TransactionStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * A transaction on a deposit account type
 */
@Schema(description = "A transaction on a deposit account type")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class DepositTransaction extends Transaction {
  @SerializedName("transactionType")
  private DepositTransactionType transactionType = null;

  @SerializedName("payee")
  private String payee = null;

  @SerializedName("checkNumber")
  private Integer checkNumber = null;

  public DepositTransaction transactionType(DepositTransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @Schema(description = "")
  public DepositTransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(DepositTransactionType transactionType) {
    this.transactionType = transactionType;
  }

  public DepositTransaction payee(String payee) {
    this.payee = payee;
    return this;
  }

   /**
   * Get payee
   * @return payee
  **/
  @Schema(description = "")
  public String getPayee() {
    return payee;
  }

  public void setPayee(String payee) {
    this.payee = payee;
  }

  public DepositTransaction checkNumber(Integer checkNumber) {
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * Check number
   * @return checkNumber
  **/
  @Schema(description = "Check number")
  public Integer getCheckNumber() {
    return checkNumber;
  }

  public void setCheckNumber(Integer checkNumber) {
    this.checkNumber = checkNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositTransaction depositTransaction = (DepositTransaction) o;
    return Objects.equals(this.transactionType, depositTransaction.transactionType) &&
        Objects.equals(this.payee, depositTransaction.payee) &&
        Objects.equals(this.checkNumber, depositTransaction.checkNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, payee, checkNumber, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
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
