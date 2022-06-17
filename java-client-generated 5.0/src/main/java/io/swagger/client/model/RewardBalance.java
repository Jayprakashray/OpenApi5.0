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
import io.swagger.client.model.FiAttribute;
import io.swagger.client.model.RewardType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Reward program balance
 */
@Schema(description = "Reward program balance")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class RewardBalance {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private RewardType type = null;

  @SerializedName("balance")
  private BigDecimal balance = null;

  @SerializedName("accruedYtd")
  private BigDecimal accruedYtd = null;

  @SerializedName("redeemedYtd")
  private BigDecimal redeemedYtd = null;

  @SerializedName("qualifying")
  private Boolean qualifying = false;

  @SerializedName("fiAttributes")
  private List<FiAttribute> fiAttributes = null;

  public RewardBalance name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name used to denominate the balance
   * @return name
  **/
  @Schema(description = "Name used to denominate the balance")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RewardBalance type(RewardType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public RewardType getType() {
    return type;
  }

  public void setType(RewardType type) {
    this.type = type;
  }

  public RewardBalance balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Total units available for redemption at time of download
   * @return balance
  **/
  @Schema(description = "Total units available for redemption at time of download")
  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public RewardBalance accruedYtd(BigDecimal accruedYtd) {
    this.accruedYtd = accruedYtd;
    return this;
  }

   /**
   * Total units accrued in the current program year at time of download
   * minimum: 0
   * @return accruedYtd
  **/
  @Schema(description = "Total units accrued in the current program year at time of download")
  public BigDecimal getAccruedYtd() {
    return accruedYtd;
  }

  public void setAccruedYtd(BigDecimal accruedYtd) {
    this.accruedYtd = accruedYtd;
  }

  public RewardBalance redeemedYtd(BigDecimal redeemedYtd) {
    this.redeemedYtd = redeemedYtd;
    return this;
  }

   /**
   * Total units redeemed in the current program year at time of download
   * minimum: 0
   * @return redeemedYtd
  **/
  @Schema(description = "Total units redeemed in the current program year at time of download")
  public BigDecimal getRedeemedYtd() {
    return redeemedYtd;
  }

  public void setRedeemedYtd(BigDecimal redeemedYtd) {
    this.redeemedYtd = redeemedYtd;
  }

  public RewardBalance qualifying(Boolean qualifying) {
    this.qualifying = qualifying;
    return this;
  }

   /**
   * Balance used for qualifying purposes
   * @return qualifying
  **/
  @Schema(description = "Balance used for qualifying purposes")
  public Boolean isQualifying() {
    return qualifying;
  }

  public void setQualifying(Boolean qualifying) {
    this.qualifying = qualifying;
  }

  public RewardBalance fiAttributes(List<FiAttribute> fiAttributes) {
    this.fiAttributes = fiAttributes;
    return this;
  }

  public RewardBalance addFiAttributesItem(FiAttribute fiAttributesItem) {
    if (this.fiAttributes == null) {
      this.fiAttributes = new ArrayList<FiAttribute>();
    }
    this.fiAttributes.add(fiAttributesItem);
    return this;
  }

   /**
   * Array of FI-specific attributes
   * @return fiAttributes
  **/
  @Schema(description = "Array of FI-specific attributes")
  public List<FiAttribute> getFiAttributes() {
    return fiAttributes;
  }

  public void setFiAttributes(List<FiAttribute> fiAttributes) {
    this.fiAttributes = fiAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardBalance rewardBalance = (RewardBalance) o;
    return Objects.equals(this.name, rewardBalance.name) &&
        Objects.equals(this.type, rewardBalance.type) &&
        Objects.equals(this.balance, rewardBalance.balance) &&
        Objects.equals(this.accruedYtd, rewardBalance.accruedYtd) &&
        Objects.equals(this.redeemedYtd, rewardBalance.redeemedYtd) &&
        Objects.equals(this.qualifying, rewardBalance.qualifying) &&
        Objects.equals(this.fiAttributes, rewardBalance.fiAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, balance, accruedYtd, redeemedYtd, qualifying, fiAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardBalance {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    accruedYtd: ").append(toIndentedString(accruedYtd)).append("\n");
    sb.append("    redeemedYtd: ").append(toIndentedString(redeemedYtd)).append("\n");
    sb.append("    qualifying: ").append(toIndentedString(qualifying)).append("\n");
    sb.append("    fiAttributes: ").append(toIndentedString(fiAttributes)).append("\n");
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
