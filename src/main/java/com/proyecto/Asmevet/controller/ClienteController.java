
package com.proyecto.Asmevet.controller;

import com.proyecto.Asmevet.model.Cliente;
import com.proyecto.Asmevet.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    @PostMapping("/nuevo")
    public Cliente newCliente(@RequestBody Cliente newCliente) {
        return this.clienteService.newCliente(newCliente);
    }
    
    @GetMapping("/mostrar")
    public Iterable<Cliente> getAll(){
        return clienteService.getAll();
    }
    //actualizacion
    @PostMapping("/modificar")
    public Cliente updatecliente(@RequestBody Cliente cliente){
        return this.clienteService.modifyCliente(cliente);
    }
    //eliminar
    @PostMapping(value="/{id}")
    public Boolean deleteCliente(@PathVariable(value="id") Long id) {
        return this.clienteService.deleteCliente(id);
    }
}
