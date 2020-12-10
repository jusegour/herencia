package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class ServicioPersonaArchivos implements ServicioPersona {

	@Override
	public boolean insertar(Persona p) {
		System.out.println("Insertando persona en un archivo: " + p);
		return true;
	}

	@Override
	public boolean actualizar(Persona p) {
		System.out.println("Actualizando persona de un archivo: " + p);
		return true;
	}

	@Override
	public boolean eliminar(Persona p) {
		System.out.println("Eliminando persona de un archivo: " + p);
		return true;
	}

}
