package com.ejemplo2.SpringBoot.Controller;


import com.ejemplo2.SpringBoot.model.Persona;
import com.ejemplo2.SpringBoot.services.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private IPersonaService persoServ;

    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }

    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas() {
         return persoServ.verPersonas();
    }

    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    @PutMapping("/editar/{id}")
    public void editarPersona(@PathVariable Long id, @RequestBody Persona pers) {

        persoServ.editarPersona(pers);
    }
}
