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
import io.swagger.client.model.Availability;
import io.swagger.client.model.FdxVersion;
import io.swagger.client.model.HateoasLink;
import io.swagger.client.model.OperationId;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Definition of a supported API for the /capability response object
 */
@Schema(description = "Definition of a supported API for the /capability response object")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class Operation {
  @SerializedName("id")
  private OperationId id = null;

  @SerializedName("availability")
  private Availability availability = null;

  @SerializedName("alsoSupported")
  private List<OperationId> alsoSupported = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("fdxVersions")
  private List<FdxVersion> fdxVersions = null;

  @SerializedName("cutOffTime")
  private OffsetDateTime cutOffTime = null;

  @SerializedName("link")
  private HateoasLink link = null;

  public Operation id(OperationId id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public OperationId getId() {
    return id;
  }

  public void setId(OperationId id) {
    this.id = id;
  }

  public Operation availability(Availability availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  @Schema(description = "")
  public Availability getAvailability() {
    return availability;
  }

  public void setAvailability(Availability availability) {
    this.availability = availability;
  }

  public Operation alsoSupported(List<OperationId> alsoSupported) {
    this.alsoSupported = alsoSupported;
    return this;
  }

  public Operation addAlsoSupportedItem(OperationId alsoSupportedItem) {
    if (this.alsoSupported == null) {
      this.alsoSupported = new ArrayList<OperationId>();
    }
    this.alsoSupported.add(alsoSupportedItem);
    return this;
  }

   /**
   * Additional FDX API endpoints supported at this API, e.g. Transactions within Accounts, or TxImages within Transactions
   * @return alsoSupported
  **/
  @Schema(description = "Additional FDX API endpoints supported at this API, e.g. Transactions within Accounts, or TxImages within Transactions")
  public List<OperationId> getAlsoSupported() {
    return alsoSupported;
  }

  public void setAlsoSupported(List<OperationId> alsoSupported) {
    this.alsoSupported = alsoSupported;
  }

  public Operation version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Data provider&#x27;s implementation version number for this operation, which is unrelated to the FDX API version
   * @return version
  **/
  @Schema(description = "Data provider's implementation version number for this operation, which is unrelated to the FDX API version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Operation fdxVersions(List<FdxVersion> fdxVersions) {
    this.fdxVersions = fdxVersions;
    return this;
  }

  public Operation addFdxVersionsItem(FdxVersion fdxVersionsItem) {
    if (this.fdxVersions == null) {
      this.fdxVersions = new ArrayList<FdxVersion>();
    }
    this.fdxVersions.add(fdxVersionsItem);
    return this;
  }

   /**
   * FDX schema versions supported at this endpoint
   * @return fdxVersions
  **/
  @Schema(description = "FDX schema versions supported at this endpoint")
  public List<FdxVersion> getFdxVersions() {
    return fdxVersions;
  }

  public void setFdxVersions(List<FdxVersion> fdxVersions) {
    this.fdxVersions = fdxVersions;
  }

  public Operation cutOffTime(OffsetDateTime cutOffTime) {
    this.cutOffTime = cutOffTime;
    return this;
  }

   /**
   * Get cutOffTime
   * @return cutOffTime
  **/
  @Schema(description = "")
  public OffsetDateTime getCutOffTime() {
    return cutOffTime;
  }

  public void setCutOffTime(OffsetDateTime cutOffTime) {
    this.cutOffTime = cutOffTime;
  }

  public Operation link(HateoasLink link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @Schema(description = "")
  public HateoasLink getLink() {
    return link;
  }

  public void setLink(HateoasLink link) {
    this.link = link;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operation operation = (Operation) o;
    return Objects.equals(this.id, operation.id) &&
        Objects.equals(this.availability, operation.availability) &&
        Objects.equals(this.alsoSupported, operation.alsoSupported) &&
        Objects.equals(this.version, operation.version) &&
        Objects.equals(this.fdxVersions, operation.fdxVersions) &&
        Objects.equals(this.cutOffTime, operation.cutOffTime) &&
        Objects.equals(this.link, operation.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, availability, alsoSupported, version, fdxVersions, cutOffTime, link);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    alsoSupported: ").append(toIndentedString(alsoSupported)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    fdxVersions: ").append(toIndentedString(fdxVersions)).append("\n");
    sb.append("    cutOffTime: ").append(toIndentedString(cutOffTime)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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