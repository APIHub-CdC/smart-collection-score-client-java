package io.SmartCollectionScore.client.model;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(CatalogoFronteraDeImpago.Adapter.class)
public enum CatalogoFronteraDeImpago {
  
  NUMBER_15(15),
  
  NUMBER_30(30),
  
  NUMBER_60(60),
  
  NUMBER_90(90);
  private Integer value;
  CatalogoFronteraDeImpago(Integer value) {
    this.value = value;
  }
  public Integer getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoFronteraDeImpago fromValue(String text) {
    for (CatalogoFronteraDeImpago b : CatalogoFronteraDeImpago.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoFronteraDeImpago> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoFronteraDeImpago enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoFronteraDeImpago read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return CatalogoFronteraDeImpago.fromValue(String.valueOf(value));
    }
  }
}
