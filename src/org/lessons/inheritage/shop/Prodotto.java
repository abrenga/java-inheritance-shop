package org.lessons.inheritage.shop;

import java.util.Random;

public abstract class Prodotto implements IProdotto {

	private int codiceProdotto;
	private String nome;
	private String marca;
	private float prezzo;
	final private static float IVA = 22;

	protected Prodotto( String nome, String marca, float prezzo) {
		this.codiceProdotto = calcolaCodice();
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;

	}

	public int getCodiceProdotto() {
		return this.codiceProdotto;
	}

	public String getNome() {
		return this.nome;
	}

	public String getMarca() {
		return this.marca;
	}

	public float getprezzo() {
		return this.prezzo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	
	static int calcolaCodice() {
		Random numeroCasuale = new Random();
		int numero = numeroCasuale.nextInt(100);
		return numero;
	}
	
	@Override
	public float calcolaPrezzoSenzaIva(float prezzo) {
		float numeroSenzaIva = this.prezzo/100 - IVA;
		return numeroSenzaIva;
	}
	
	
	public String toString() {
		return "Codice prodotto: "+ this.codiceProdotto+", Nome: " + this.nome+", Marca: " + this.marca+", Prezzo: " + this.prezzo;
	}

}
