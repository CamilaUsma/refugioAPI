package uao.edu.project.refugioAPI.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uao.edu.project.refugioAPI.dto.PersonasDTO;
import uao.edu.project.refugioAPI.entities.Personas;
import uao.edu.project.refugioAPI.repositories.PersonasRepository;

import java.util.List;
import java.util.Optional;

@Service /*Es un pueste entre el controlador y repositorio, se maneja toda la logica de negocio*/
public class PersonasService {
    @Autowired
    PersonasRepository personasRepository;

    public List<Personas> getAllPersonas(){
        return personasRepository.findAll();
    }

    public Personas savePersonas(Personas persona){
        return personasRepository.save(persona);
    }

    public Personas getPersonaById(Integer id){
        Optional<Personas> persona = personasRepository.findById(id);
        if (persona.isPresent()) {
            return persona.get();
        }
        return null;
    }


    public Personas updatePersona(Integer id, Personas persona) {
        Optional<Personas> existPersona = personasRepository.findById(id);

        if (existPersona.isPresent()) {
            return personasRepository.save(persona);
        }
        return null;
    }


}
