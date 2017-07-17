/*
 * Ergebnislisten API
 * Ein Service um eine Ergebnisliste mit Finanzierungsvorschlägen zu ermitteln.
 *
 * OpenAPI spec version: 0.1
 * Contact: helpdesk@europace2.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.europace.eli.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.LocalDate;

/**
 * BausparWunsch
 */

public class BausparWunsch {
  @JsonProperty("bausparSummeAbsolut")
  private BigDecimal bausparSummeAbsolut = null;

  @JsonProperty("bausparSummeRelativ")
  private BigDecimal bausparSummeRelativ = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("sonderZahlungEinmalig")
  private BigDecimal sonderZahlungEinmalig = null;

  @JsonProperty("sparBeitragMonatlichAbsolut")
  private BigDecimal sparBeitragMonatlichAbsolut = null;

  @JsonProperty("sparBeitragMonatlichRelativ")
  private BigDecimal sparBeitragMonatlichRelativ = null;

  @JsonProperty("tilgungsBeitragMonatlich")
  private BigDecimal tilgungsBeitragMonatlich = null;

  @JsonProperty("zuteilungsDatum")
  private LocalDate zuteilungsDatum = null;

  public BausparWunsch bausparSummeAbsolut(BigDecimal bausparSummeAbsolut) {
    this.bausparSummeAbsolut = bausparSummeAbsolut;
    return this;
  }

   /**
   * Get bausparSummeAbsolut
   * @return bausparSummeAbsolut
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getBausparSummeAbsolut() {
    return bausparSummeAbsolut;
  }

  public void setBausparSummeAbsolut(BigDecimal bausparSummeAbsolut) {
    this.bausparSummeAbsolut = bausparSummeAbsolut;
  }

  public BausparWunsch bausparSummeRelativ(BigDecimal bausparSummeRelativ) {
    this.bausparSummeRelativ = bausparSummeRelativ;
    return this;
  }

   /**
   * Get bausparSummeRelativ
   * @return bausparSummeRelativ
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getBausparSummeRelativ() {
    return bausparSummeRelativ;
  }

  public void setBausparSummeRelativ(BigDecimal bausparSummeRelativ) {
    this.bausparSummeRelativ = bausparSummeRelativ;
  }

  public BausparWunsch id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BausparWunsch sonderZahlungEinmalig(BigDecimal sonderZahlungEinmalig) {
    this.sonderZahlungEinmalig = sonderZahlungEinmalig;
    return this;
  }

   /**
   * Get sonderZahlungEinmalig
   * @return sonderZahlungEinmalig
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getSonderZahlungEinmalig() {
    return sonderZahlungEinmalig;
  }

  public void setSonderZahlungEinmalig(BigDecimal sonderZahlungEinmalig) {
    this.sonderZahlungEinmalig = sonderZahlungEinmalig;
  }

  public BausparWunsch sparBeitragMonatlichAbsolut(BigDecimal sparBeitragMonatlichAbsolut) {
    this.sparBeitragMonatlichAbsolut = sparBeitragMonatlichAbsolut;
    return this;
  }

   /**
   * Get sparBeitragMonatlichAbsolut
   * @return sparBeitragMonatlichAbsolut
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getSparBeitragMonatlichAbsolut() {
    return sparBeitragMonatlichAbsolut;
  }

  public void setSparBeitragMonatlichAbsolut(BigDecimal sparBeitragMonatlichAbsolut) {
    this.sparBeitragMonatlichAbsolut = sparBeitragMonatlichAbsolut;
  }

  public BausparWunsch sparBeitragMonatlichRelativ(BigDecimal sparBeitragMonatlichRelativ) {
    this.sparBeitragMonatlichRelativ = sparBeitragMonatlichRelativ;
    return this;
  }

   /**
   * Get sparBeitragMonatlichRelativ
   * @return sparBeitragMonatlichRelativ
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getSparBeitragMonatlichRelativ() {
    return sparBeitragMonatlichRelativ;
  }

  public void setSparBeitragMonatlichRelativ(BigDecimal sparBeitragMonatlichRelativ) {
    this.sparBeitragMonatlichRelativ = sparBeitragMonatlichRelativ;
  }

  public BausparWunsch tilgungsBeitragMonatlich(BigDecimal tilgungsBeitragMonatlich) {
    this.tilgungsBeitragMonatlich = tilgungsBeitragMonatlich;
    return this;
  }

   /**
   * Get tilgungsBeitragMonatlich
   * @return tilgungsBeitragMonatlich
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getTilgungsBeitragMonatlich() {
    return tilgungsBeitragMonatlich;
  }

  public void setTilgungsBeitragMonatlich(BigDecimal tilgungsBeitragMonatlich) {
    this.tilgungsBeitragMonatlich = tilgungsBeitragMonatlich;
  }

  public BausparWunsch zuteilungsDatum(LocalDate zuteilungsDatum) {
    this.zuteilungsDatum = zuteilungsDatum;
    return this;
  }

   /**
   * Get zuteilungsDatum
   * @return zuteilungsDatum
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getZuteilungsDatum() {
    return zuteilungsDatum;
  }

  public void setZuteilungsDatum(LocalDate zuteilungsDatum) {
    this.zuteilungsDatum = zuteilungsDatum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BausparWunsch bausparWunsch = (BausparWunsch) o;
    return Objects.equals(this.bausparSummeAbsolut, bausparWunsch.bausparSummeAbsolut) &&
        Objects.equals(this.bausparSummeRelativ, bausparWunsch.bausparSummeRelativ) &&
        Objects.equals(this.id, bausparWunsch.id) &&
        Objects.equals(this.sonderZahlungEinmalig, bausparWunsch.sonderZahlungEinmalig) &&
        Objects.equals(this.sparBeitragMonatlichAbsolut, bausparWunsch.sparBeitragMonatlichAbsolut) &&
        Objects.equals(this.sparBeitragMonatlichRelativ, bausparWunsch.sparBeitragMonatlichRelativ) &&
        Objects.equals(this.tilgungsBeitragMonatlich, bausparWunsch.tilgungsBeitragMonatlich) &&
        Objects.equals(this.zuteilungsDatum, bausparWunsch.zuteilungsDatum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bausparSummeAbsolut, bausparSummeRelativ, id, sonderZahlungEinmalig, sparBeitragMonatlichAbsolut, sparBeitragMonatlichRelativ, tilgungsBeitragMonatlich, zuteilungsDatum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BausparWunsch {\n");
    
    sb.append("    bausparSummeAbsolut: ").append(toIndentedString(bausparSummeAbsolut)).append("\n");
    sb.append("    bausparSummeRelativ: ").append(toIndentedString(bausparSummeRelativ)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sonderZahlungEinmalig: ").append(toIndentedString(sonderZahlungEinmalig)).append("\n");
    sb.append("    sparBeitragMonatlichAbsolut: ").append(toIndentedString(sparBeitragMonatlichAbsolut)).append("\n");
    sb.append("    sparBeitragMonatlichRelativ: ").append(toIndentedString(sparBeitragMonatlichRelativ)).append("\n");
    sb.append("    tilgungsBeitragMonatlich: ").append(toIndentedString(tilgungsBeitragMonatlich)).append("\n");
    sb.append("    zuteilungsDatum: ").append(toIndentedString(zuteilungsDatum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
