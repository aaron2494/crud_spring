package com.ejemplo2.SpringBoot.services;

import com.ejemplo2.SpringBoot.model.Persona;
import com.ejemplo2.SpringBoot.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Optional<Persona> buscarPersona(Long id) {
        return persoRepo.findById(id);
    }

    @Override
    public void editarPersona(Persona per) {
        persoRepo.save(per);
    }

}