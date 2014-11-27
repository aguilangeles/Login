package dao.impl;

import java.util.ArrayList;
import java.util.List;

import entidad.Persona;

public class PersonaDao {
	public List<Persona> findAll() {
		List<Persona> personas = new ArrayList<Persona>();

		personas.add(new Persona("Ana", "Clara", "san juan 1", 20));
		personas.add(new Persona("Luis", "Ruiz", "san juan 44", 22));
		personas.add(new Persona("Lucio", "Garcia", "corrientes 1200", 50));
		personas.add(new Persona("Maria", "Gabriel", "alem 33", 79));
		personas.add(new Persona("Susana", "Somoza", "peru 70", 15));
		personas.add(new Persona("Patricia", "Herrera", "iza 3", 66));

		return personas;
	}

	public Persona getByName(String name) {
		Persona persona =null;
		for(Persona p : findAll()){
			if(p.getNombre().equals(name)){
				persona = p;
			}
		}
		return persona;
	}
}
