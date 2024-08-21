
package com.proyecto.Asmevet.model;

//Clase para crear la entidad de la aplicacion

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cliente {//nombre de la tabla
    @Id
    @Column
    //id del cliente
    private Long iduser;
    
    //nombre del cliente
    @Column
    private String nombre;
    
    //apellido del cliente
    @Column
    private String apellido;
    
    //email del cliente
    @Column
    private String email;
    
    //celular del cliente
    @Column
    private String celular;
}
