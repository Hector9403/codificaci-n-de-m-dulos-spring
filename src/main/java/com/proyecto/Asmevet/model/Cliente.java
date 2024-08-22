
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
    @Column (name="Id usuario")
    private Long iduser;
    
    //nombre del cliente
    @Column (name="Nombre", nullable=false, length = 15)
    private String nombre;
    
    //apellido del cliente
    @Column (nullable=false, length = 15)
    private String apellido;
    
    //email del cliente
    @Column (unique=true, nullable=false, length =100)
    private String email;
    
    //celular del cliente
    @Column (name = "celular", nullable=false, length = 10)
    private String celular;
}
