package com.m2i.formationjava;

import java.util.*;

public class Cart {

	private List<IMedia> medias = new ArrayList<IMedia>();

	public List<IMedia> getMedias() {
		return medias;
	}
	
	public double getTotalPrice() {
		double total = 0;
		for(IMedia m : medias) {
			total += m.getVATPrice();
		}
		return total;
	}
	

}
