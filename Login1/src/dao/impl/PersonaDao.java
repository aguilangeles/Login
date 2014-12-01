package dao.impl;

import java.util.ArrayList;
import java.util.List;

import entidad.Persona;

public class PersonaDao {
	private List<Persona> personas = new ArrayList<Persona>();
	
	
	public PersonaDao() {
		super();
		poblarPersonas();
	}

	private void poblarPersonas(){
		personas.add(new Persona("Ana", "Clara", "san juan 1", 20));
		personas.add(new Persona("Luis", "Ruiz", "san juan 44", 22));
		personas.add(new Persona("Lucio", "Garcia", "corrientes 12", 50));
		personas.add(new Persona("Maria", "Gabriel", "alem 33", 79));
		personas.add(new Persona("Susana", "Somoza", "peru 70", 15));
		personas.add(new Persona("Patricia", "Herrera", "Ibiza 3", 66));
	}
	
	public void insertarPersona(Persona unapersona){
		
		personas.add(unapersona);
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public Persona getByName(String name) {
		Persona persona =null;
		for(Persona p : getPersonas()){
			if(p.getNombre().equals(name)){
				persona = p;
			}
		}
		return persona;
	}

	
}
