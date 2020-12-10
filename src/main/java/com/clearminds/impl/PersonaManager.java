package com.clearminds.impl;

import java.io.FileReader;
import java.util.Properties;

import com.clearminds.exepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {

	private ServicioPersona serv;

	public PersonaManager() throws InstanceException {
		super();
		try {
			Properties propiedades = new Properties();
			String clasePorCargar = "";
			String paquete = "";

			propiedades.load(new FileReader("config.properties"));
			clasePorCargar = propiedades.getProperty("ClaseServicio");
			paquete = propiedades.getProperty("paquete");

			Class<?> clase = Class.forName(paquete + clasePorCargar);
			serv = (ServicioPersona) clase.newInstance();
		} catch (Exception e) {
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
	}

	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}

}
