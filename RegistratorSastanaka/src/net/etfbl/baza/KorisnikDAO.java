package net.etfbl.baza;

import java.util.ArrayList;
import java.util.List;

import net.etfbl.model.Korisnik;

public class KorisnikDAO {
	private static List<Korisnik> lista;
	
	static {
		lista = new ArrayList<>();
		lista.add(new Korisnik("bojan", "bojan", "Bojan", "Suvajac"));
		lista.add(new Korisnik("tatjana", "tatjana", "Tatjana", "Cosic"));
		lista.add(new Korisnik("radana", "radana", "Radana", "Gavranovic"));
		lista.add(new Korisnik("a", "a", "a", "a"));
	}
	
	public synchronized static Korisnik login(String username,String password) {
		for(Korisnik k : lista) {
			if(k.getUsername().equals(username) && k.getPassword().equals(password))
				return k;
		}
		return null;
	}
}
