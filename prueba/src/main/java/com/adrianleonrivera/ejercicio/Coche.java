package com.adrianleonrivera.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Coche {
	
	private List<Persona>listaPersonas;

	public Coche() {
		super();
		listaPersonas=new ArrayList<Persona>();
	}

	public Coche(List<Persona> listaPersonas) {
		super();
		this.listaPersonas = listaPersonas;
	}

	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(List<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}
	
	
}
