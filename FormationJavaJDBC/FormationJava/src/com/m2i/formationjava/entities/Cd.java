package com.m2i.formationjava.entities;

public class Cd extends Media {

	public Cd(int id, String title) {
		super(id, title);
	}

	public Cd() {
	}
	
	private int nbTrack;

	public int getNbTrack() {
		return nbTrack;
	}

	public void setNbTrack(int nbTrack) {
		this.nbTrack = nbTrack;
	}

	@Override
	public double getVATPrice() {
		return getPrice() * 1.2;
	}
	
	
	

}
