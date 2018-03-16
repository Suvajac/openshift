package net.etfbl.beans;

import java.util.List;

import net.etfbl.baza.SastanakDAO;
import net.etfbl.model.Korisnik;
import net.etfbl.model.Sastanak;

public class KorisnikBean {
	private Korisnik korisnik;
	private boolean logged;
	public KorisnikBean() {
		super();
	}
	public KorisnikBean(Korisnik korisnik, boolean logged) {
		super();
		this.korisnik = korisnik;
		this.logged = logged;
	}
	
	public List<Sastanak> mojiSastanci(){
		return SastanakDAO.getByUsername(korisnik.getUsername());
	}
	
	public List<Sastanak> tudjiSastanci(){
		return SastanakDAO.getJavniSastanci(korisnik);
	}
	
	public Korisnik getKorisnik() {
		return korisnik;
	}
	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	public boolean isLogged() {
		return logged;
	}
	public void setLogged(boolean logged) {
		this.logged = logged;
	}
}
