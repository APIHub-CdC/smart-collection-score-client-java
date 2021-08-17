package io.SmartCollectionScore.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;



public class Peticion {
  @SerializedName("folioOtorgante")
  private String folioOtorgante = null;
  @SerializedName("numeroCuenta")
  private String numeroCuenta = null;
  @SerializedName("tipoContrato")
  private CatalogoTipoContrato tipoContrato = null;
  @SerializedName("tipoCuenta")
  private CatalogoTipoCuenta tipoCuenta = null;
  @SerializedName("tipoFrecuencia")
  private CatalogoTipoFrecuencia tipoFrecuencia = null;
  @SerializedName("ventanaDeTiempo")
  private CatalogoVentanaTiempo ventanaDeTiempo = null;
  @SerializedName("fronteraDeImpago")
  private CatalogoFronteraDeImpago fronteraDeImpago = null;
  @SerializedName("periodosVencidos")
  private CatalogoPeriodosVencidos periodosVencidos = null;
  @SerializedName("saldoVencido")
  private String saldoVencido = null;
  @SerializedName("saldoActual")
  private String saldoActual = null;
  public Peticion folioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
    return this;
  }
   
  
  public String getFolioOtorgante() {
    return folioOtorgante;
  }
  public void setFolioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
  }
  public Peticion numeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
    return this;
  }
   
  
  public String getNumeroCuenta() {
    return numeroCuenta;
  }
  public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }
  public Peticion tipoContrato(CatalogoTipoContrato tipoContrato) {
    this.tipoContrato = tipoContrato;
    return this;
  }
   
  
  public CatalogoTipoContrato getTipoContrato() {
    return tipoContrato;
  }
  public void setTipoContrato(CatalogoTipoContrato tipoContrato) {
    this.tipoContrato = tipoContrato;
  }
  public Peticion tipoCuenta(CatalogoTipoCuenta tipoCuenta) {
    this.tipoCuenta = tipoCuenta;
    return this;
  }
   
  
  public CatalogoTipoCuenta getTipoCuenta() {
    return tipoCuenta;
  }
  public void setTipoCuenta(CatalogoTipoCuenta tipoCuenta) {
    this.tipoCuenta = tipoCuenta;
  }
  public Peticion tipoFrecuencia(CatalogoTipoFrecuencia tipoFrecuencia) {
    this.tipoFrecuencia = tipoFrecuencia;
    return this;
  }
   
  
  public CatalogoTipoFrecuencia getTipoFrecuencia() {
    return tipoFrecuencia;
  }
  public void setTipoFrecuencia(CatalogoTipoFrecuencia tipoFrecuencia) {
    this.tipoFrecuencia = tipoFrecuencia;
  }
  public Peticion ventanaDeTiempo(CatalogoVentanaTiempo ventanaDeTiempo) {
    this.ventanaDeTiempo = ventanaDeTiempo;
    return this;
  }
   
  
  public CatalogoVentanaTiempo getVentanaDeTiempo() {
    return ventanaDeTiempo;
  }
  public void setVentanaDeTiempo(CatalogoVentanaTiempo ventanaDeTiempo) {
    this.ventanaDeTiempo = ventanaDeTiempo;
  }
  public Peticion fronteraDeImpago(CatalogoFronteraDeImpago fronteraDeImpago) {
    this.fronteraDeImpago = fronteraDeImpago;
    return this;
  }
   
  
  public CatalogoFronteraDeImpago getFronteraDeImpago() {
    return fronteraDeImpago;
  }
  public void setFronteraDeImpago(CatalogoFronteraDeImpago fronteraDeImpago) {
    this.fronteraDeImpago = fronteraDeImpago;
  }
  public Peticion periodosVencidos(CatalogoPeriodosVencidos periodosVencidos) {
    this.periodosVencidos = periodosVencidos;
    return this;
  }
   
  
  public CatalogoPeriodosVencidos getPeriodosVencidos() {
    return periodosVencidos;
  }
  public void setPeriodosVencidos(CatalogoPeriodosVencidos periodosVencidos) {
    this.periodosVencidos = periodosVencidos;
  }
  public Peticion saldoVencido(String saldoVencido) {
    this.saldoVencido = saldoVencido;
    return this;
  }
   
  
  public String getSaldoVencido() {
    return saldoVencido;
  }
  public void setSaldoVencido(String saldoVencido) {
    this.saldoVencido = saldoVencido;
  }
  public Peticion saldoActual(String saldoActual) {
    this.saldoActual = saldoActual;
    return this;
  }
   
  
  public String getSaldoActual() {
    return saldoActual;
  }
  public void setSaldoActual(String saldoActual) {
    this.saldoActual = saldoActual;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Peticion peticion = (Peticion) o;
    return Objects.equals(this.folioOtorgante, peticion.folioOtorgante) &&
        Objects.equals(this.numeroCuenta, peticion.numeroCuenta) &&
        Objects.equals(this.tipoContrato, peticion.tipoContrato) &&
        Objects.equals(this.tipoCuenta, peticion.tipoCuenta) &&
        Objects.equals(this.tipoFrecuencia, peticion.tipoFrecuencia) &&
        Objects.equals(this.ventanaDeTiempo, peticion.ventanaDeTiempo) &&
        Objects.equals(this.fronteraDeImpago, peticion.fronteraDeImpago) &&
        Objects.equals(this.periodosVencidos, peticion.periodosVencidos) &&
        Objects.equals(this.saldoVencido, peticion.saldoVencido) &&
        Objects.equals(this.saldoActual, peticion.saldoActual);
  }
  @Override
  public int hashCode() {
    return Objects.hash(folioOtorgante, numeroCuenta, tipoContrato, tipoCuenta, tipoFrecuencia, ventanaDeTiempo, fronteraDeImpago, periodosVencidos, saldoVencido, saldoActual);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Peticion {\n");
    
    sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
    sb.append("    numeroCuenta: ").append(toIndentedString(numeroCuenta)).append("\n");
    sb.append("    tipoContrato: ").append(toIndentedString(tipoContrato)).append("\n");
    sb.append("    tipoCuenta: ").append(toIndentedString(tipoCuenta)).append("\n");
    sb.append("    tipoFrecuencia: ").append(toIndentedString(tipoFrecuencia)).append("\n");
    sb.append("    ventanaDeTiempo: ").append(toIndentedString(ventanaDeTiempo)).append("\n");
    sb.append("    fronteraDeImpago: ").append(toIndentedString(fronteraDeImpago)).append("\n");
    sb.append("    periodosVencidos: ").append(toIndentedString(periodosVencidos)).append("\n");
    sb.append("    saldoVencido: ").append(toIndentedString(saldoVencido)).append("\n");
    sb.append("    saldoActual: ").append(toIndentedString(saldoActual)).append("\n");
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
