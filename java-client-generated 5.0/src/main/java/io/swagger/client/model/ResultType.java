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
 * Flag to indicate if you want a lightweight array of metadata (AccountDescriptor or Tax or Operations) or full item details (Account or a Tax subclass or Availability details). If set to &#x27;lightweight&#x27;, should only return the fields associated with the metadata entity.
 */
@JsonAdapter(ResultType.Adapter.class)
public enum ResultType {
  LIGHTWEIGHT("lightweight"),
  DETAILS("details");

  private String value;

  ResultType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ResultType fromValue(String input) {
    for (ResultType b : ResultType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ResultType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResultType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ResultType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ResultType.fromValue((String)(value));
    }
  }
}