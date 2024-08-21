
package com.proyecto.Asmevet.repository;

import com.proyecto.Asmevet.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
