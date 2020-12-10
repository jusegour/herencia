package com.clearminds.test;

import com.clearminds.impl.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {

		PersonaManager p = new PersonaManager();
		
		p.insertarPersona(new Persona("Juan","Gomez",18));
	}

}
