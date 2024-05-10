package uao.edu.project.refugioAPI.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Crea los getter y setter de la clase
@NoArgsConstructor /* Crea un constructor vacio */
@AllArgsConstructor /* Crear un constructor con los atributos de la clase. */

public class PersonasDTO {
    String nombre;
    String direccion;
    String telefono;
}
