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
 * The type of an investment balance
 */
@JsonAdapter(InvestmentBalanceType.Adapter.class)
public enum InvestmentBalanceType {
  AMOUNT("AMOUNT"),
  PERCENTAGE("PERCENTAGE");

  private String value;

  InvestmentBalanceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InvestmentBalanceType fromValue(String input) {
    for (InvestmentBalanceType b : InvestmentBalanceType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<InvestmentBalanceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final InvestmentBalanceType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public InvestmentBalanceType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return InvestmentBalanceType.fromValue((String)(value));
    }
  }
}
