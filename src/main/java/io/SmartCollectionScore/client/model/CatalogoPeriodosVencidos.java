package io.SmartCollectionScore.client.model;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(CatalogoPeriodosVencidos.Adapter.class)
public enum CatalogoPeriodosVencidos {
  
  V("V"),
  
  _1("1"),
  
  _2("2"),
  
  _3("3"),
  
  _84("84");
  private String value;
  CatalogoPeriodosVencidos(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoPeriodosVencidos fromValue(String text) {
    for (CatalogoPeriodosVencidos b : CatalogoPeriodosVencidos.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoPeriodosVencidos> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoPeriodosVencidos enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoPeriodosVencidos read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoPeriodosVencidos.fromValue(String.valueOf(value));
    }
  }
}
