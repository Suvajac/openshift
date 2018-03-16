package net.etfbl.baza;

import java.util.ArrayList;
import java.util.List;

import net.etfbl.model.Korisnik;
import net.etfbl.model.Sastanak;

public class SastanakDAO {
	private static List<Sastanak> lista;
	
	static {
		lista = new ArrayList<>();
	}
	
	public synchronized static void dodaj(Sastanak s) {
		lista.add(s);
	}
	
	public synchronized static List<Sastanak> getByUsername(String username){
		List<Sastanak> temp = new ArrayList<>();
		for(Sastanak s : lista) {
			if(s.getKreator().getUsername().equals(username)) {
				temp.add(s);
			}
		}
		return temp;
	}
	
	public synchronized static List<Sastanak> getJavniSastanci(Korisnik k){
		List<Sastanak> temp = new ArrayList<>();
		for(Sastanak s : lista) {
			if(s.getStatus().equals("javno") && !s.getKreator().equals(k)) {
				temp.add(s);
			}
		}
		return temp;
	}
}
