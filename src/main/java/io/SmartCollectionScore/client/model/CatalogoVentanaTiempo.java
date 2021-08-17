package io.SmartCollectionScore.client.model;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(CatalogoVentanaTiempo.Adapter.class)
public enum CatalogoVentanaTiempo {
  
  _2S("2S"),
  
  _4S("4S"),
  
  _8S("8S"),
  
  _1M("1M"),
  
  _3M("3M");
  private String value;
  CatalogoVentanaTiempo(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoVentanaTiempo fromValue(String text) {
    for (CatalogoVentanaTiempo b : CatalogoVentanaTiempo.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoVentanaTiempo> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoVentanaTiempo enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoVentanaTiempo read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoVentanaTiempo.fromValue(String.valueOf(value));
    }
  }
}
