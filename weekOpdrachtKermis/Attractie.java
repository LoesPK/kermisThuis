package weekOpdrachtKermis;

import java.util.ArrayList;

public class Attractie {
	Prompter prompter = new Prompter();
	private String naam;
	private double prijs;
	private double oppervlakte;
	private double kassa;
	private int aantalKaartjes;
	
	ArrayList<Attractie> attracties = new ArrayList<Attractie>();
	
	void attractieList() {
		attracties.add(new Botsauto("Botsauto's", 2.50));
		attracties.add(new Spin("Spin", 2.25));
		attracties.add(new Spiegelpaleis("Spiegelpaleis", 2.75));
		attracties.add(new Spookhuis("Spookhuis", 3.20));
		attracties.add(new Hawaii("Hawaii", 2.90));
		attracties.add(new Hawaii("Ladderklimmen", 5.00));
		
		
	}
	
	Attractie(String naam, double prijs){
		this.naam = naam;
		this.prijs = prijs;
	}
	
	String getNaam() {
		return this.naam;
	}
	
	double getKassa() {
		return this.kassa;
	}
	
	public double getPrijs() {
		return this.prijs;
	}
	
	public int getKaartjes() {
		return this.aantalKaartjes;
	}
	
	
	String draaien(int i) {
		this.kassa+=this.prijs;
		this.aantalKaartjes++;

		return this.naam + " draait";
//				en heeft "+ this.aantalKaartjes + " kaartjes verkocht en €" + this.kassa + " in de kassa.";
		
	}
}
