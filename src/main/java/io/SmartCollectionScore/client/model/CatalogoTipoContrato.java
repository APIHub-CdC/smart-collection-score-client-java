package io.SmartCollectionScore.client.model;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoTipoContrato.Adapter.class)
public enum CatalogoTipoContrato {

  AB("AB"), AE("AE"), AM("AM"), AR("AR"), BR("BR"), CA("CA"), CC("CC"), CF("CF"), CO("CO"), CP("CP"), HB("HB"),
  HE("HE"), HV("HV"), LC("LC"), LR("LR"), MC("MC"), NG("NG"), OT("OT"), PB("PB"), PE("PE"), PG("PG"), PM("PM"),
  PN("PN"), PP("PP"), SH("SH"), TC("TC"), TD("TD");

  private String value;

  CatalogoTipoContrato(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CatalogoTipoContrato fromValue(String text) {
    for (CatalogoTipoContrato b : CatalogoTipoContrato.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CatalogoTipoContrato> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoTipoContrato enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CatalogoTipoContrato read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoTipoContrato.fromValue(String.valueOf(value));
    }
  }
}
