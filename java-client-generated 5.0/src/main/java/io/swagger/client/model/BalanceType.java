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
 * &lt;br/&gt; * &#x60;ASSET&#x60;: Positive transaction amount increases balance&lt;br/&gt; * &#x60;LIABILITY&#x60;: Positive transaction amount decreases balance
 */
@JsonAdapter(BalanceType.Adapter.class)
public enum BalanceType {
  ASSET("ASSET"),
  LIABILITY("LIABILITY");

  private String value;

  BalanceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BalanceType fromValue(String input) {
    for (BalanceType b : BalanceType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BalanceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BalanceType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public BalanceType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return BalanceType.fromValue((String)(value));
    }
  }
}