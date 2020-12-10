package com.clearminds.impl;

import com.clearminds.exepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {

	private ServicioPersona serv;

	public PersonaManager(String nombreClase) throws InstanceException {
		super();

		String clasePorCargar = "com.clearminds.impl." + nombreClase;

		try {
			Class<?> clase = Class.forName(clasePorCargar);
			serv = (ServicioPersona) clase.newInstance();
		} catch (Exception e) {
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
	}

	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}

}
