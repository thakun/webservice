package com.example.controllers;

import java.util.ArrayList;

import com.example.models.PersonaModel;
import com.example.services.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping
    public String getPersons(){
        ArrayList<PersonaModel> personas = personaService.getPersons();

        String html = "<html>\n" + "<header><title>Welcome</title></header>\n" + "<body>\n<table>";
        html += "<tr>\n<th>Nombre</th>\n<th>Apellido paterno</th>\n<th>Apellido materno</th>\n<th>Edad</th>\n<th>Peso</th>\n<th>Altura</th>\n<th>Estado civil</th></tr>";

        for (PersonaModel persona : personas) {
            html += "<tr>\n<td>"+persona.getName()+"</td>\n<td>"+persona.getPaternal()+"</td>\n<td>"+persona.getMaternal()+"</td>\n<td>"+persona.getAge()+"</td>\n<td>"+persona.getWeight()+"</td>\n<td>"+persona.getHeight()+"</td>\n<td>"+persona.getMarital_status()+"</td></tr>";
        }

        html += "</table></body>\n" + "</html>";

        return html;
    }

    @PostMapping
    public PersonaModel savePerson(@RequestBody PersonaModel persona){
        return this.personaService.savePerson(persona);        
    }

    @DeleteMapping
    public boolean deletePerson(@RequestBody PersonaModel persona){
        return this.personaService.deletePerson(persona);
    }
}
