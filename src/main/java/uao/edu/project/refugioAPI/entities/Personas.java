package uao.edu.project.refugioAPI.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Crea los getter y setter de la clase
@NoArgsConstructor /* Crea un constructor vacio */
@AllArgsConstructor /* Crear un constructor con los atributos de la clase. */
@Entity/*Son las entidades que tengo en la BD*/
@Table(name="personas") /*para indicar a que tabla pertenece esta entidad*/
public class Personas {
    @Id/*indicar que es un llave primaria se pone justo arriba de la llave primartia*/
    //@GeneratedValue(strategy = GenerationType.)/*es para autogenerar el valor del id*/
    Integer id;
    String nombre;
    String direccion;
    String telefono;
}
