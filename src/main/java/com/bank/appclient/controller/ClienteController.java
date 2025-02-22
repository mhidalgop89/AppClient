package com.bank.appclient.controller;

import com.bank.appclient.models.entities.Cliente;
import com.bank.appclient.models.service.ICliente;
import com.bank.appclient.models.service.impl.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {
    @Autowired
    private ICliente clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll(){
        return ResponseEntity.ok()
                .body(clienteService.findAll());
    }

    @GetMapping("/{identificacion}")
    public ResponseEntity<Cliente> findClienteByIdentificacion(@PathVariable String identificacion){
        return ResponseEntity.ok()
                .body(clienteService.findClienteByIdentificacion(identificacion));
    }

    @PostMapping
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
        return ResponseEntity.ok()
                .body(clienteService.save(cliente));
    }

    @PutMapping
    public  ResponseEntity<Cliente> update(@RequestBody Cliente cliente){
        return ResponseEntity.ok()
                .body(clienteService.update(cliente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        clienteService.delete(id);
        return ResponseEntity.ok().build();
    }
}
