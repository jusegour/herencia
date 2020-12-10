package com.clearminds.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.exepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {

	private ServicioPersona serv;

	public PersonaManager() throws InstanceException {
		super();
		try {
			Class<?> clase = Class.forName(obtenerServicio());
			serv = (ServicioPersona) clase.newInstance();
		} catch (Exception e) {
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
	}

	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}

	public String obtenerServicio() {
		Properties propiedades = new Properties();
		String clasePorCargar = "";
		String paquete = "";

		try {
			propiedades.load(new FileReader("config.properties"));
			clasePorCargar = propiedades.getProperty("ClaseServicio");
			paquete = propiedades.getProperty("paquete");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return paquete + clasePorCargar;
	}

}
