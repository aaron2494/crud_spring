package com.ejemplo2.SpringBoot.services;

import com.ejemplo2.SpringBoot.model.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {

    public List<Persona> verPersonas();

    public void crearPersona(Persona per);

    public void borrarPersona(Long id);

    public Optional<Persona> buscarPersona(Long id);
    public void editarPersona(Persona per);

}
