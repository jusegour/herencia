package com.clearminds.test;

import com.clearminds.exepciones.InstanceException;
import com.clearminds.impl.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {

		PersonaManager p;
		try {
			p = new PersonaManager();
			p.insertarPersona(new Persona("Juan", "Gomez", 18));
		} catch (InstanceException e) {
			e.getMessage();
			e.printStackTrace();
		}

	}

}
