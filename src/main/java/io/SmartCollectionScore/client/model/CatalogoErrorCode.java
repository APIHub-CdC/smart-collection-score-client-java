package io.SmartCollectionScore.client.model;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(CatalogoErrorCode.Adapter.class)
public enum CatalogoErrorCode {
  
  E1("E1"),
  E2("E2"),
  E3("E3"),
  E4("E4"),
  E5("E5"),
  E6("E6"),
  E7("E7"),
  E8("E8"),
  E9("E9");
  
  private String value;
  CatalogoErrorCode(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoErrorCode fromValue(String text) {
    for (CatalogoErrorCode b : CatalogoErrorCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoErrorCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoErrorCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoErrorCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoErrorCode.fromValue(String.valueOf(value));
    }
  }
}
