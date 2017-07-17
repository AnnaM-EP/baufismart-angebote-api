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
import de.europace.eli.model.Bereitstellung;
import de.europace.eli.model.ProduktAnbieter;
import de.europace.eli.model.Provision;
import de.europace.eli.model.Tilgung;
import de.europace.eli.model.ZinsBindung;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.LocalDate;

/**
 * Darlehen
 */

public class Darlehen {
  @JsonProperty("auszahlungsBetrag")
  private BigDecimal auszahlungsBetrag = null;

  @JsonProperty("bereitstellung")
  private Bereitstellung bereitstellung = null;

  @JsonProperty("darlehensBetrag")
  private BigDecimal darlehensBetrag = null;

  /**
   * Gets or Sets darlehensTyp
   */
  public enum DarlehensTypEnum {
    ANNUITAETEN_DARLEHEN("ANNUITAETEN_DARLEHEN"),
    
    FORWARD_DARLEHEN("FORWARD_DARLEHEN"),
    
    KFW_DARLEHEN("KFW_DARLEHEN"),
    
    PRIVAT_DARLEHEN("PRIVAT_DARLEHEN"),
    
    ZWISCHEN_FINANZIERUNG("ZWISCHEN_FINANZIERUNG"),
    
    VARIABLES_DARLEHEN("VARIABLES_DARLEHEN");

    private String value;

    DarlehensTypEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DarlehensTypEnum fromValue(String text) {
      for (DarlehensTypEnum b : DarlehensTypEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("darlehensTyp")
  private DarlehensTypEnum darlehensTyp = null;

  @JsonProperty("effektivZins")
  private BigDecimal effektivZins = null;

  @JsonProperty("produktanbieter")
  private ProduktAnbieter produktanbieter = null;

  @JsonProperty("provision")
  private Provision provision = null;

  @JsonProperty("rateMonatlich")
  private BigDecimal rateMonatlich = null;

  @JsonProperty("sollZins")
  private BigDecimal sollZins = null;

  @JsonProperty("tilgung")
  private Tilgung tilgung = null;

  @JsonProperty("zinsZahlungsBeginnAm")
  private LocalDate zinsZahlungsBeginnAm = null;

  @JsonProperty("zinsbindung")
  private ZinsBindung zinsbindung = null;

  public Darlehen auszahlungsBetrag(BigDecimal auszahlungsBetrag) {
    this.auszahlungsBetrag = auszahlungsBetrag;
    return this;
  }

   /**
   * Der Auszahlungsbetrag ist der Nettodarlehensbetrag
   * @return auszahlungsBetrag
  **/
  @ApiModelProperty(example = "null", value = "Der Auszahlungsbetrag ist der Nettodarlehensbetrag")
  public BigDecimal getAuszahlungsBetrag() {
    return auszahlungsBetrag;
  }

  public void setAuszahlungsBetrag(BigDecimal auszahlungsBetrag) {
    this.auszahlungsBetrag = auszahlungsBetrag;
  }

  public Darlehen bereitstellung(Bereitstellung bereitstellung) {
    this.bereitstellung = bereitstellung;
    return this;
  }

   /**
   * Get bereitstellung
   * @return bereitstellung
  **/
  @ApiModelProperty(example = "null", value = "")
  public Bereitstellung getBereitstellung() {
    return bereitstellung;
  }

  public void setBereitstellung(Bereitstellung bereitstellung) {
    this.bereitstellung = bereitstellung;
  }

  public Darlehen darlehensBetrag(BigDecimal darlehensBetrag) {
    this.darlehensBetrag = darlehensBetrag;
    return this;
  }

   /**
   * Get darlehensBetrag
   * @return darlehensBetrag
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getDarlehensBetrag() {
    return darlehensBetrag;
  }

  public void setDarlehensBetrag(BigDecimal darlehensBetrag) {
    this.darlehensBetrag = darlehensBetrag;
  }

  public Darlehen darlehensTyp(DarlehensTypEnum darlehensTyp) {
    this.darlehensTyp = darlehensTyp;
    return this;
  }

   /**
   * Get darlehensTyp
   * @return darlehensTyp
  **/
  @ApiModelProperty(example = "null", value = "")
  public DarlehensTypEnum getDarlehensTyp() {
    return darlehensTyp;
  }

  public void setDarlehensTyp(DarlehensTypEnum darlehensTyp) {
    this.darlehensTyp = darlehensTyp;
  }

  public Darlehen effektivZins(BigDecimal effektivZins) {
    this.effektivZins = effektivZins;
    return this;
  }

   /**
   * Get effektivZins
   * @return effektivZins
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getEffektivZins() {
    return effektivZins;
  }

  public void setEffektivZins(BigDecimal effektivZins) {
    this.effektivZins = effektivZins;
  }

  public Darlehen produktanbieter(ProduktAnbieter produktanbieter) {
    this.produktanbieter = produktanbieter;
    return this;
  }

   /**
   * Get produktanbieter
   * @return produktanbieter
  **/
  @ApiModelProperty(example = "null", value = "")
  public ProduktAnbieter getProduktanbieter() {
    return produktanbieter;
  }

  public void setProduktanbieter(ProduktAnbieter produktanbieter) {
    this.produktanbieter = produktanbieter;
  }

  public Darlehen provision(Provision provision) {
    this.provision = provision;
    return this;
  }

   /**
   * Get provision
   * @return provision
  **/
  @ApiModelProperty(example = "null", value = "")
  public Provision getProvision() {
    return provision;
  }

  public void setProvision(Provision provision) {
    this.provision = provision;
  }

  public Darlehen rateMonatlich(BigDecimal rateMonatlich) {
    this.rateMonatlich = rateMonatlich;
    return this;
  }

   /**
   * Get rateMonatlich
   * @return rateMonatlich
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getRateMonatlich() {
    return rateMonatlich;
  }

  public void setRateMonatlich(BigDecimal rateMonatlich) {
    this.rateMonatlich = rateMonatlich;
  }

  public Darlehen sollZins(BigDecimal sollZins) {
    this.sollZins = sollZins;
    return this;
  }

   /**
   * Get sollZins
   * @return sollZins
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getSollZins() {
    return sollZins;
  }

  public void setSollZins(BigDecimal sollZins) {
    this.sollZins = sollZins;
  }

  public Darlehen tilgung(Tilgung tilgung) {
    this.tilgung = tilgung;
    return this;
  }

   /**
   * Get tilgung
   * @return tilgung
  **/
  @ApiModelProperty(example = "null", value = "")
  public Tilgung getTilgung() {
    return tilgung;
  }

  public void setTilgung(Tilgung tilgung) {
    this.tilgung = tilgung;
  }

  public Darlehen zinsZahlungsBeginnAm(LocalDate zinsZahlungsBeginnAm) {
    this.zinsZahlungsBeginnAm = zinsZahlungsBeginnAm;
    return this;
  }

   /**
   * Get zinsZahlungsBeginnAm
   * @return zinsZahlungsBeginnAm
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getZinsZahlungsBeginnAm() {
    return zinsZahlungsBeginnAm;
  }

  public void setZinsZahlungsBeginnAm(LocalDate zinsZahlungsBeginnAm) {
    this.zinsZahlungsBeginnAm = zinsZahlungsBeginnAm;
  }

  public Darlehen zinsbindung(ZinsBindung zinsbindung) {
    this.zinsbindung = zinsbindung;
    return this;
  }

   /**
   * Get zinsbindung
   * @return zinsbindung
  **/
  @ApiModelProperty(example = "null", value = "")
  public ZinsBindung getZinsbindung() {
    return zinsbindung;
  }

  public void setZinsbindung(ZinsBindung zinsbindung) {
    this.zinsbindung = zinsbindung;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Darlehen darlehen = (Darlehen) o;
    return Objects.equals(this.auszahlungsBetrag, darlehen.auszahlungsBetrag) &&
        Objects.equals(this.bereitstellung, darlehen.bereitstellung) &&
        Objects.equals(this.darlehensBetrag, darlehen.darlehensBetrag) &&
        Objects.equals(this.darlehensTyp, darlehen.darlehensTyp) &&
        Objects.equals(this.effektivZins, darlehen.effektivZins) &&
        Objects.equals(this.produktanbieter, darlehen.produktanbieter) &&
        Objects.equals(this.provision, darlehen.provision) &&
        Objects.equals(this.rateMonatlich, darlehen.rateMonatlich) &&
        Objects.equals(this.sollZins, darlehen.sollZins) &&
        Objects.equals(this.tilgung, darlehen.tilgung) &&
        Objects.equals(this.zinsZahlungsBeginnAm, darlehen.zinsZahlungsBeginnAm) &&
        Objects.equals(this.zinsbindung, darlehen.zinsbindung);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auszahlungsBetrag, bereitstellung, darlehensBetrag, darlehensTyp, effektivZins, produktanbieter, provision, rateMonatlich, sollZins, tilgung, zinsZahlungsBeginnAm, zinsbindung);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Darlehen {\n");
    
    sb.append("    auszahlungsBetrag: ").append(toIndentedString(auszahlungsBetrag)).append("\n");
    sb.append("    bereitstellung: ").append(toIndentedString(bereitstellung)).append("\n");
    sb.append("    darlehensBetrag: ").append(toIndentedString(darlehensBetrag)).append("\n");
    sb.append("    darlehensTyp: ").append(toIndentedString(darlehensTyp)).append("\n");
    sb.append("    effektivZins: ").append(toIndentedString(effektivZins)).append("\n");
    sb.append("    produktanbieter: ").append(toIndentedString(produktanbieter)).append("\n");
    sb.append("    provision: ").append(toIndentedString(provision)).append("\n");
    sb.append("    rateMonatlich: ").append(toIndentedString(rateMonatlich)).append("\n");
    sb.append("    sollZins: ").append(toIndentedString(sollZins)).append("\n");
    sb.append("    tilgung: ").append(toIndentedString(tilgung)).append("\n");
    sb.append("    zinsZahlungsBeginnAm: ").append(toIndentedString(zinsZahlungsBeginnAm)).append("\n");
    sb.append("    zinsbindung: ").append(toIndentedString(zinsbindung)).append("\n");
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
