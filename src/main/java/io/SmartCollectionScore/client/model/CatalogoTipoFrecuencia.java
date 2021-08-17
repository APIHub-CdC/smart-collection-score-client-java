package io.SmartCollectionScore.client.model;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(CatalogoTipoFrecuencia.Adapter.class)
public enum CatalogoTipoFrecuencia {
  
  S("S"),
  
  C("C"),
  
  Q("Q"),
  
  M("M"),
  
  B("B"),
  
  T("T"),
  
  A("A"),
  
  U("U");
  private String value;
  CatalogoTipoFrecuencia(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoTipoFrecuencia fromValue(String text) {
    for (CatalogoTipoFrecuencia b : CatalogoTipoFrecuencia.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoTipoFrecuencia> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoTipoFrecuencia enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoTipoFrecuencia read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoTipoFrecuencia.fromValue(String.valueOf(value));
    }
  }
}
