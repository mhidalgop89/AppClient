package com.bank.appclient.controller;

import com.bank.appclient.models.entities.Cliente;
import com.bank.appclient.models.service.ICliente;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("clientes")
public class ClienteController {

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
