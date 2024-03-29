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
import io.swagger.client.model.PageMetadata;
import io.swagger.client.model.PageMetadataLinks;
import io.swagger.client.model.PaginatedArray;
import io.swagger.client.model.RewardCategory;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * An optionally paginated array of reward categories
 */
@Schema(description = "An optionally paginated array of reward categories")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class RewardCategories extends PaginatedArray {
  @SerializedName("rewardCategories")
  private List<RewardCategory> rewardCategories = null;

  public RewardCategories rewardCategories(List<RewardCategory> rewardCategories) {
    this.rewardCategories = rewardCategories;
    return this;
  }

  public RewardCategories addRewardCategoriesItem(RewardCategory rewardCategoriesItem) {
    if (this.rewardCategories == null) {
      this.rewardCategories = new ArrayList<RewardCategory>();
    }
    this.rewardCategories.add(rewardCategoriesItem);
    return this;
  }

   /**
   * Array of reward categories
   * @return rewardCategories
  **/
  @Schema(description = "Array of reward categories")
  public List<RewardCategory> getRewardCategories() {
    return rewardCategories;
  }

  public void setRewardCategories(List<RewardCategory> rewardCategories) {
    this.rewardCategories = rewardCategories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardCategories rewardCategories = (RewardCategories) o;
    return Objects.equals(this.rewardCategories, rewardCategories.rewardCategories) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rewardCategories, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardCategories {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    rewardCategories: ").append(toIndentedString(rewardCategories)).append("\n");
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
