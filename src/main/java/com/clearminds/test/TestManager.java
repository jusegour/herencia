package com.clearminds.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.exepciones.InstanceException;
import com.clearminds.impl.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) throws ClassNotFoundException {

		Properties propiedades = new Properties();
		String claseCargada = "";
		PersonaManager p = null;
		try {
			propiedades.load(new FileReader("config.properties"));
			claseCargada = propiedades.getProperty("ClaseServicio");

			p = new PersonaManager(claseCargada);
			p.insertarPersona(new Persona("Juan", "Gomez", 18));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InstanceException e) {
			e.getMessage();
			e.printStackTrace();
		}

	}

}
