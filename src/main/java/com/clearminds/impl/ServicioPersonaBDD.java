package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class ServicioPersonaBDD implements ServicioPersona {

	@Override
	public boolean insertar(Persona p) {
		System.out.println("Insertando persona en la BDD: " + p);
		return true;
	}

	@Override
	public boolean actualizar(Persona p) {
		System.out.println("Actualizando persona de la BDD: " + p);
		return true;
	}

	@Override
	public boolean eliminar(Persona p) {
		System.out.println("Eliminando persona de la BDD: " + p);
		return true;
	}

}
