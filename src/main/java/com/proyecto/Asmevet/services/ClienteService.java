
package com.proyecto.Asmevet.services;

import com.proyecto.Asmevet.model.Cliente;


public interface ClienteService {
    Cliente newCliente (Cliente newCliente); //generacion de nuevo registro
    Iterable<Cliente> getAll(); //barra todos los contenidos y registros para mostralos cuando el usuario consulte
    Cliente modifyCliente (Cliente cliente); //modificacion o actualizacion de un registro
    Boolean deleteCliente (Long iduser); //eliminar un registro
}
