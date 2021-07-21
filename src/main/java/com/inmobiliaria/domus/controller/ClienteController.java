package com.inmobiliaria.domus.controller;
import com.inmobiliaria.domus.services.DomusService;
import com.inmobiliaria.domus.entity.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

/**
 * Aqui se recibe la peticion POST, GET, ETC..
 * 
 * RestController ejecuta el metodo del servicio, lo mapea en Json 
 * Y lo muestra en la pagina que indique RequestMapping
 */
@RestController
@RequestMapping("/clientes") //Indica en que pagina se va a ejecutar una peticion
public class ClienteController {
    @Autowired
    DomusService domusService; 

    @GetMapping() //Me lo mapea en Json
    public ArrayList<Cliente> obtenerCliente(){
        return domusService.obtenerCliente();
    }
    


    @PostMapping()
    public Cliente guardarUsuario(@RequestBody Cliente clienteNuevo){
        return this.guardarUsuario(clienteNuevo);

    }
    
}
