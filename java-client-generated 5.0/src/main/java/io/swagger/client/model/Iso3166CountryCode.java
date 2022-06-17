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
 * ISO 3166 Codes for the representation of names of countries and their subdivisions
 */
@JsonAdapter(Iso3166CountryCode.Adapter.class)
public enum Iso3166CountryCode {
  AD("AD"),
  AE("AE"),
  AF("AF"),
  AG("AG"),
  AI("AI"),
  AL("AL"),
  AM("AM"),
  AN("AN"),
  AO("AO"),
  AQ("AQ"),
  AR("AR"),
  AS("AS"),
  AT("AT"),
  AU("AU"),
  AW("AW"),
  AX("AX"),
  AZ("AZ"),
  BA("BA"),
  BB("BB"),
  BD("BD"),
  BE("BE"),
  BF("BF"),
  BG("BG"),
  BH("BH"),
  BI("BI"),
  BJ("BJ"),
  BM("BM"),
  BN("BN"),
  BO("BO"),
  BR("BR"),
  BS("BS"),
  BT("BT"),
  BV("BV"),
  BW("BW"),
  BY("BY"),
  BZ("BZ"),
  CA("CA"),
  CC("CC"),
  CD("CD"),
  CF("CF"),
  CG("CG"),
  CH("CH"),
  CI("CI"),
  CK("CK"),
  CL("CL"),
  CM("CM"),
  CN("CN"),
  CO("CO"),
  CR("CR"),
  CS("CS"),
  CU("CU"),
  CV("CV"),
  CX("CX"),
  CY("CY"),
  CZ("CZ"),
  DE("DE"),
  DJ("DJ"),
  DK("DK"),
  DM("DM"),
  DO("DO"),
  DZ("DZ"),
  EC("EC"),
  EE("EE"),
  EG("EG"),
  EH("EH"),
  ER("ER"),
  ES("ES"),
  ET("ET"),
  FI("FI"),
  FJ("FJ"),
  FK("FK"),
  FM("FM"),
  FO("FO"),
  FR("FR"),
  GA("GA"),
  GB("GB"),
  GD("GD"),
  GE("GE"),
  GF("GF"),
  GG("GG"),
  GH("GH"),
  GI("GI"),
  GL("GL"),
  GM("GM"),
  GN("GN"),
  GP("GP"),
  GQ("GQ"),
  GR("GR"),
  GS("GS"),
  GT("GT"),
  GU("GU"),
  GW("GW"),
  GY("GY"),
  HK("HK"),
  HM("HM"),
  HN("HN"),
  HR("HR"),
  HT("HT"),
  HU("HU"),
  ID("ID"),
  IE("IE"),
  IL("IL"),
  IM("IM"),
  IN("IN"),
  IO("IO"),
  IQ("IQ"),
  IR("IR"),
  IS("IS"),
  IT("IT"),
  JE("JE"),
  JM("JM"),
  JO("JO"),
  JP("JP"),
  KE("KE"),
  KG("KG"),
  KH("KH"),
  KI("KI"),
  KM("KM"),
  KN("KN"),
  KP("KP"),
  KR("KR"),
  KW("KW"),
  KY("KY"),
  KZ("KZ"),
  LA("LA"),
  LB("LB"),
  LC("LC"),
  LI("LI"),
  LK("LK"),
  LR("LR"),
  LS("LS"),
  LT("LT"),
  LU("LU"),
  LV("LV"),
  LY("LY"),
  MA("MA"),
  MC("MC"),
  MD("MD"),
  MG("MG"),
  MH("MH"),
  MK("MK"),
  ML("ML"),
  MM("MM"),
  MN("MN"),
  MO("MO"),
  MP("MP"),
  MQ("MQ"),
  MR("MR"),
  MS("MS"),
  MT("MT"),
  MU("MU"),
  MV("MV"),
  MW("MW"),
  MX("MX"),
  MY("MY"),
  MZ("MZ"),
  NA("NA"),
  NC("NC"),
  NE("NE"),
  NF("NF"),
  NG("NG"),
  NI("NI"),
  NL("NL"),
  NO("NO"),
  NP("NP"),
  NR("NR"),
  NU("NU"),
  NZ("NZ"),
  OM("OM"),
  PA("PA"),
  PE("PE"),
  PF("PF"),
  PG("PG"),
  PH("PH"),
  PK("PK"),
  PL("PL"),
  PM("PM"),
  PN("PN"),
  PR("PR"),
  PS("PS"),
  PT("PT"),
  PW("PW"),
  PY("PY"),
  QA("QA"),
  RE("RE"),
  RO("RO"),
  RU("RU"),
  RW("RW"),
  SA("SA"),
  SB("SB"),
  SC("SC"),
  SD("SD"),
  SE("SE"),
  SG("SG"),
  SH("SH"),
  SI("SI"),
  SJ("SJ"),
  SK("SK"),
  SL("SL"),
  SM("SM"),
  SN("SN"),
  SO("SO"),
  SR("SR"),
  ST("ST"),
  SV("SV"),
  SY("SY"),
  SZ("SZ"),
  TC("TC"),
  TD("TD"),
  TF("TF"),
  TG("TG"),
  TH("TH"),
  TJ("TJ"),
  TK("TK"),
  TL("TL"),
  TM("TM"),
  TN("TN"),
  TO("TO"),
  TR("TR"),
  TT("TT"),
  TV("TV"),
  TW("TW"),
  TZ("TZ"),
  UA("UA"),
  UG("UG"),
  UM("UM"),
  US("US"),
  UY("UY"),
  UZ("UZ"),
  VA("VA"),
  VC("VC"),
  VE("VE"),
  VG("VG"),
  VI("VI"),
  VN("VN"),
  VU("VU"),
  WF("WF"),
  WS("WS"),
  YE("YE"),
  YT("YT"),
  ZA("ZA"),
  ZM("ZM"),
  ZW("ZW");

  private String value;

  Iso3166CountryCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Iso3166CountryCode fromValue(String input) {
    for (Iso3166CountryCode b : Iso3166CountryCode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Iso3166CountryCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final Iso3166CountryCode enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public Iso3166CountryCode read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return Iso3166CountryCode.fromValue((String)(value));
    }
  }
}