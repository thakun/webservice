package com.example.services;

import com.example.repositories.PersonaRepository;
import com.example.models.PersonaModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public ArrayList<PersonaModel> getPersons(){
        return (ArrayList<PersonaModel>) personaRepository.findAll();
    }

    public PersonaModel savePerson(PersonaModel persona){
        return personaRepository.save(persona);
    }

    public boolean deletePerson(PersonaModel persona){
        personaRepository.delete(persona);
        return true;
    }

}
