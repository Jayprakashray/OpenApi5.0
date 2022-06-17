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
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Indicates a type of payout such as immediate or deferred.&lt;br/&gt; &lt;br/&gt; | Value | Description |&lt;br/&gt; |-----|-----|&lt;br/&gt; | DEFERRED | Deferred payout starts at a predetermined date in the future |&lt;br/&gt; | IMMEDIATE | Immediate payout begins paying out shortly after the annuity is purchased |
 */
@JsonAdapter(PayoutType.Adapter.class)
public enum PayoutType {
  DEFERRED("DEFERRED"),
  IMMEDIATE("IMMEDIATE");

  private String value;

  PayoutType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PayoutType fromValue(String input) {
    for (PayoutType b : PayoutType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PayoutType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PayoutType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public PayoutType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return PayoutType.fromValue((String)(value));
    }
  }
}
