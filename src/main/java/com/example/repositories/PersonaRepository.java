package com.example.repositories;

import com.example.models.PersonaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaModel, Long>{
    
}
