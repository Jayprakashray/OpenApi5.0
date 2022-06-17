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
import io.swagger.client.model.Transaction;
import io.swagger.client.model.TransactionReward;
import io.swagger.client.model.TransactionStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * An insurance transaction type
 */
@Schema(description = "An insurance transaction type")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class InsuranceTransaction extends Transaction {
  /**
   * Type of insurance transaction
   */
  @JsonAdapter(TransactionTypeEnum.Adapter.class)
  public enum TransactionTypeEnum {
    PAYMENT("PAYMENT"),
    FEE("FEE"),
    ADJUSTMENT("ADJUSTMENT"),
    INTEREST("INTEREST");

    private String value;

    TransactionTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TransactionTypeEnum fromValue(String input) {
      for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TransactionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TransactionTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TransactionTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("transactionType")
  private TransactionTypeEnum transactionType = null;

  public InsuranceTransaction transactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Type of insurance transaction
   * @return transactionType
  **/
  @Schema(description = "Type of insurance transaction")
  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceTransaction insuranceTransaction = (InsuranceTransaction) o;
    return Objects.equals(this.transactionType, insuranceTransaction.transactionType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
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
