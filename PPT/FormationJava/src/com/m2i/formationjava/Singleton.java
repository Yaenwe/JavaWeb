package com.m2i.formationjava;
public class Singleton {

	private static Singleton singleton = null;
	
	private Singleton() {
		// Code très couteux
	}
	
	public static Singleton getInstance()  {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
}
