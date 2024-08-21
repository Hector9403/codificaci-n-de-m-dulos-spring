
package com.proyecto.Asmevet.services;

import com.proyecto.Asmevet.model.Cliente;
import com.proyecto.Asmevet.repository.ClienteRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente newCliente(Cliente newCliente) {
        return clienteRepository.save(newCliente);
    }

    @Override
    public Iterable<Cliente> getAll() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente modifyCliente(Cliente cliente) {
        
         Optional<Cliente> clienteEncontrado=this.clienteRepository.findById(cliente.getIduser());
        if(clienteEncontrado.get()!=null) {
            clienteEncontrado.get().setNombre(cliente.getNombre());
            clienteEncontrado.get().setApellido(cliente.getApellido());
            clienteEncontrado.get().setEmail(cliente.getEmail());
            clienteEncontrado.get().setCelular(cliente.getCelular());
            return this.newCliente(clienteEncontrado.get());
        }
        
        return null;
    }

    @Override
    public Boolean deleteCliente(Long iduser) {
        this.clienteRepository.deleteById(iduser);
        return true;
    }
    
}
