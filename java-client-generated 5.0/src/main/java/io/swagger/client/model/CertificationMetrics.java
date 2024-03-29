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
import io.swagger.client.model.CertificationMetric;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Response object for /certification-metrics API
 */
@Schema(description = "Response object for /certification-metrics API")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-16T18:27:34.841Z[GMT]")
public class CertificationMetrics {
  @SerializedName("metrics")
  private List<CertificationMetric> metrics = null;

  public CertificationMetrics metrics(List<CertificationMetric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public CertificationMetrics addMetricsItem(CertificationMetric metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<CertificationMetric>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Zero or more certification performance metrics
   * @return metrics
  **/
  @Schema(description = "Zero or more certification performance metrics")
  public List<CertificationMetric> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<CertificationMetric> metrics) {
    this.metrics = metrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificationMetrics certificationMetrics = (CertificationMetrics) o;
    return Objects.equals(this.metrics, certificationMetrics.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificationMetrics {\n");
    
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
