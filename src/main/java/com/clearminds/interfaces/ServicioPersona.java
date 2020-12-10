package com.clearminds.interfaces;

import com.clearminds.model.Persona;

public interface ServicioPersona {

	public abstract boolean insertar(Persona p);

	public abstract boolean actualizar(Persona p);

	public abstract boolean eliminar(Persona p);

}
