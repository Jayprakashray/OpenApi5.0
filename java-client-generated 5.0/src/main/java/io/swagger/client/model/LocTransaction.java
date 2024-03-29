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
import io.swagger.client.model.FiAttribute;
import io.swagger.client.model.HateoasLinks;
import io.swagger.client.model.Iso4217Code;
import io.swagger.client.model.LineItem;
import io.swagger.client.model.LocTransactionType;
import io.swagger.client.model.PaymentDetails;
import io.swagger.client.model.Transaction;
import io.swagger.client.model.TransactionReward;
import io.swagger.client.model.TransactionStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * A line-of-credit transaction
 */
@Schema(description = "A line-of-credit transaction")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class LocTransaction extends Transaction {
  @SerializedName("transactionType")
  private LocTransactionType transactionType = null;

  @SerializedName("checkNumber")
  private Integer checkNumber = null;

  @SerializedName("paymentDetails")
  private PaymentDetails paymentDetails = null;

  public LocTransaction transactionType(LocTransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @Schema(description = "")
  public LocTransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(LocTransactionType transactionType) {
    this.transactionType = transactionType;
  }

  public LocTransaction checkNumber(Integer checkNumber) {
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

  public LocTransaction paymentDetails(PaymentDetails paymentDetails) {
    this.paymentDetails = paymentDetails;
    return this;
  }

   /**
   * Get paymentDetails
   * @return paymentDetails
  **/
  @Schema(description = "")
  public PaymentDetails getPaymentDetails() {
    return paymentDetails;
  }

  public void setPaymentDetails(PaymentDetails paymentDetails) {
    this.paymentDetails = paymentDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocTransaction locTransaction = (LocTransaction) o;
    return Objects.equals(this.transactionType, locTransaction.transactionType) &&
        Objects.equals(this.checkNumber, locTransaction.checkNumber) &&
        Objects.equals(this.paymentDetails, locTransaction.paymentDetails) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, checkNumber, paymentDetails, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    paymentDetails: ").append(toIndentedString(paymentDetails)).append("\n");
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
