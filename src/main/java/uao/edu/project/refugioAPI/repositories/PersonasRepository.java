package uao.edu.project.refugioAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uao.edu.project.refugioAPI.entities.Personas;

@Repository /*Es el modelo de datos, la capa que negocea con la BD y mantiene la persistencia*/
public interface PersonasRepository extends JpaRepository<Personas,Integer> {
}
