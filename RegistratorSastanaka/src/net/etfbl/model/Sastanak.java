package net.etfbl.model;


public class Sastanak {
	private String naziv;
	private String mjesto;
	private String vrijemePocetka;
	private double vrijemeTrajanja;
	private Korisnik kreator;
	private String status;
	public Sastanak() {
		super();
	}
	public Sastanak(String naziv, String mjesto, String vrijemePocetka, double vrijemeTrajanja, Korisnik kreator,
			String status) {
		super();
		this.naziv = naziv;
		this.mjesto = mjesto;
		this.vrijemePocetka = vrijemePocetka;
		this.vrijemeTrajanja = vrijemeTrajanja;
		this.kreator = kreator;
		this.status = status;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getMjesto() {
		return mjesto;
	}
	public void setMjesto(String mjesto) {
		this.mjesto = mjesto;
	}
	public String getVrijemePocetka() {
		return vrijemePocetka;
	}
	public void setVrijemePocetka(String vrijemePocetka) {
		this.vrijemePocetka = vrijemePocetka;
	}
	public double getVrijemeTrajanja() {
		return vrijemeTrajanja;
	}
	public void setVrijemeTrajanja(double vrijemeTrajanja) {
		this.vrijemeTrajanja = vrijemeTrajanja;
	}
	public Korisnik getKreator() {
		return kreator;
	}
	public void setKreator(Korisnik kreator) {
		this.kreator = kreator;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
