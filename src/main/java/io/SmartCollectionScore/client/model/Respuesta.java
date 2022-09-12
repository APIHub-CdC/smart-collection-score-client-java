package io.SmartCollectionScore.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;



public class Respuesta {
  @SerializedName("folioConsulta")
  private String folioConsulta = null;
  @SerializedName("folioOtorgante")
  private String folioOtorgante = null;
  @SerializedName("score")
  private BigDecimal score = null;
  @SerializedName("fronteraDeImpago")
  private CatalogoVentanaTiempo fronteraDeImpago = null;
  @SerializedName("errorCode")
  private CatalogoErrorCode errorCode = null;
  @SerializedName("fechaDeCalculo")
  private String fechaDeCalculo = null;
  public Respuesta folioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
    return this;
  }
   
  
  public String getFolioConsulta() {
    return folioConsulta;
  }
  public void setFolioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
  }
  public Respuesta folioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
    return this;
  }
   
  
  public String getFolioOtorgante() {
    return folioOtorgante;
  }
  public void setFolioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
  }
  public Respuesta score(BigDecimal score) {
    this.score = score;
    return this;
  }
   
  
  public BigDecimal getScore() {
    return score;
  }
  public void setScore(BigDecimal score) {
    this.score = score;
  }

  public Respuesta fronteraDeImpago(CatalogoVentanaTiempo fronteraDeImpago) {
    this.fronteraDeImpago = fronteraDeImpago;
    return this;
  }
   
  
  public CatalogoVentanaTiempo getFronteraDeImpago() {
    return fronteraDeImpago;
  }
  public void setFronteraDeImpago(CatalogoVentanaTiempo fronteraDeImpago) {
    this.fronteraDeImpago = fronteraDeImpago;
  }
  public Respuesta errorCode(CatalogoErrorCode errorCode) {
    this.errorCode = errorCode;
    return this;
  }
   
  
  public CatalogoErrorCode getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(CatalogoErrorCode errorCode) {
    this.errorCode = errorCode;
  }
  public Respuesta fechaDeCalculo(String fechaDeCalculo) {
    this.fechaDeCalculo = fechaDeCalculo;
    return this;
  }
   
  
  public String getFechaDeCalculo() {
    return fechaDeCalculo;
  }
  public void setFechaDeCalculo(String fechaDeCalculo) {
    this.fechaDeCalculo = fechaDeCalculo;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Respuesta respuesta = (Respuesta) o;
    return Objects.equals(this.folioConsulta, respuesta.folioConsulta) &&
        Objects.equals(this.folioOtorgante, respuesta.folioOtorgante) &&
        Objects.equals(this.score, respuesta.score) &&
        Objects.equals(this.fronteraDeImpago, respuesta.fronteraDeImpago) &&
        Objects.equals(this.errorCode, respuesta.errorCode) &&
        Objects.equals(this.fechaDeCalculo, respuesta.fechaDeCalculo);
  }
  @Override
  public int hashCode() {
    return Objects.hash(folioConsulta, folioOtorgante, score,  fronteraDeImpago, errorCode, fechaDeCalculo);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Respuesta {\n");
    
    sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
    sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    fronteraDeImpago: ").append(toIndentedString(fronteraDeImpago)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    fechaDeCalculo: ").append(toIndentedString(fechaDeCalculo)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
