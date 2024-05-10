package uao.edu.project.refugioAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.web.bind.annotation.*;
import uao.edu.project.refugioAPI.entities.Personas;
import uao.edu.project.refugioAPI.repositories.PersonasRepository;
import uao.edu.project.refugioAPI.services.PersonasService;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@RestController/*comunicar la aplicacion con el cliente (postman o app frontend)*/
@RequestMapping("api/personas")/*crea un endpoint (el contexto de la url)*/
@CrossOrigin("*")/*Para que el api pueda ser consultado desde cualquier origen*/
public class PersonasController {
    @Autowired /* Permite inyectar una dependencia sin necesidad de implementar sus abstracciones
    (No necesito traer todos m'etodos que contiene, solo una referencia de esa clase*/
    PersonasService personasService;


    @GetMapping
    public List<Personas> getAllPersonas(){
        return personasService.getAllPersonas();
    }

    @PostMapping("/save")
    public Personas savePersona(@RequestBody Personas persona){
        return personasService.savePersonas(persona);
    }

    @GetMapping("/{id}")
    public Personas getPersonaById(@PathVariable("id") Integer id){
        return personasService.getPersonaById(id);
    }

    @PutMapping("/update/{id}")
    public Personas updatePersona(@PathVariable("id") Integer id, @RequestBody Personas persona){
        return personasService.updatePersona(id, persona);
    }


}
