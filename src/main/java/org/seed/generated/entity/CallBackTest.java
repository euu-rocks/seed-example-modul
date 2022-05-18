package org.seed.generated.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import org.seed.core.codegen.GeneratedCode;
import org.seed.core.entity.value.AbstractValueObject;
import org.seed.core.entity.value.ValueEntity;

@Entity
public class CallBackTest extends AbstractValueObject implements GeneratedCode,ValueEntity {

	private String feld1;

	private String feld2;

	private Integer wert1;

	private Integer wert2;

	private Integer summe;

	private String feld_bei_erstellung;

	private String feld_nach_aenderung;

	private String feld_bei_statuswechsel;

	private String feld_vor_einfuegen;

	private String feld_nach_einfuegen;

	private String feld_vor_speichern;

	private String feld_nach_speichern;

	private String feld_vor_loeschen;

	private String feld_nach_loeschen;

	private String feld_bei_benutzeraktion;

	@JsonIgnore
	public Long getEntityId() {
		return 1103L;
	}

	public String getFeld1() {
		return feld1;
	}

	public void setFeld1(String feld1) {
		this.feld1=feld1;
	}

	public String getFeld2() {
		return feld2;
	}

	public void setFeld2(String feld2) {
		this.feld2=feld2;
	}

	public Integer getWert1() {
		return wert1;
	}

	public void setWert1(Integer wert1) {
		this.wert1=wert1;
	}

	public Integer getWert2() {
		return wert2;
	}

	public void setWert2(Integer wert2) {
		this.wert2=wert2;
	}

	public Integer getSumme() {
		return summe;
	}

	public void setSumme(Integer summe) {
		this.summe=summe;
	}

	public String getFeld_bei_erstellung() {
		return feld_bei_erstellung;
	}

	public void setFeld_bei_erstellung(String feld_bei_erstellung) {
		this.feld_bei_erstellung=feld_bei_erstellung;
	}

	public String getFeld_nach_aenderung() {
		return feld_nach_aenderung;
	}

	public void setFeld_nach_aenderung(String feld_nach_aenderung) {
		this.feld_nach_aenderung=feld_nach_aenderung;
	}

	public String getFeld_bei_statuswechsel() {
		return feld_bei_statuswechsel;
	}

	public void setFeld_bei_statuswechsel(String feld_bei_statuswechsel) {
		this.feld_bei_statuswechsel=feld_bei_statuswechsel;
	}

	public String getFeld_vor_einfuegen() {
		return feld_vor_einfuegen;
	}

	public void setFeld_vor_einfuegen(String feld_vor_einfuegen) {
		this.feld_vor_einfuegen=feld_vor_einfuegen;
	}

	public String getFeld_nach_einfuegen() {
		return feld_nach_einfuegen;
	}

	public void setFeld_nach_einfuegen(String feld_nach_einfuegen) {
		this.feld_nach_einfuegen=feld_nach_einfuegen;
	}

	public String getFeld_vor_speichern() {
		return feld_vor_speichern;
	}

	public void setFeld_vor_speichern(String feld_vor_speichern) {
		this.feld_vor_speichern=feld_vor_speichern;
	}

	public String getFeld_nach_speichern() {
		return feld_nach_speichern;
	}

	public void setFeld_nach_speichern(String feld_nach_speichern) {
		this.feld_nach_speichern=feld_nach_speichern;
	}

	public String getFeld_vor_loeschen() {
		return feld_vor_loeschen;
	}

	public void setFeld_vor_loeschen(String feld_vor_loeschen) {
		this.feld_vor_loeschen=feld_vor_loeschen;
	}

	public String getFeld_nach_loeschen() {
		return feld_nach_loeschen;
	}

	public void setFeld_nach_loeschen(String feld_nach_loeschen) {
		this.feld_nach_loeschen=feld_nach_loeschen;
	}

	public String getFeld_bei_benutzeraktion() {
		return feld_bei_benutzeraktion;
	}

	public void setFeld_bei_benutzeraktion(String feld_bei_benutzeraktion) {
		this.feld_bei_benutzeraktion=feld_bei_benutzeraktion;
	}

}
