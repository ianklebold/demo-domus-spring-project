package com.inmobiliaria.domus.controller;
import com.inmobiliaria.domus.services.DomusService;
import com.inmobiliaria.domus.entity.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import java.util.*;

/**
 * Aqui se recibe la peticion POST, GET, ETC..
 * 
 * RestController ejecuta el metodo del servicio, lo mapea en Json 
 * Y lo muestra en la pagina que indique RequestMapping
 * 
 *La declaración de anotación @Controller se usa para definir un 
 *controlador SpringMVC en la clase para procesar la solicitud 
 *enviada por el front-end.
 *Cuando el método de la clase devuelve el resultado de String, 
 *devolverá una vista (página), que es analizada por el analizador 
 *de vistas SpringMVC y devuelta al front end.
 * 
 *La declaracion @RestController se usa solo si todos los metodos
 *Van a devolver un Json. Si no todos los metodos devolveran Json
 *Podemos indicar que será un Controller y en el metodo espcifico
 *dejar un @ResponseBody
 * 
 * 
 */
@Controller
@RequestMapping("/clientes") //Indica en que pagina se va a ejecutar una peticion
public class ClienteController {
    @Autowired
    DomusService domusService; 

    @ResponseBody
    @GetMapping("/{apellido}") //Me lo mapea en Json
    public ArrayList<Cliente> obtenerCliente(@PathVariable ("apellido") String apellido ){
        return domusService.obtenerCliente();
    }

    @ResponseBody
    @GetMapping("/orderDescId")
    public ArrayList<Cliente> obtenerOrdenadoDescClienteId(){
        return domusService.obtenerOrdenadoDescClienteId();
    }

    @RequestMapping("/orderAscId")
    public String obtenerOrdenadoAscClienteId(Model model){
        model.addAttribute("c",mostrarDatosAscId());
        return "listaClientes";
    }

    @RequestMapping("/hola")
    public String hola(Model modelo) {
      
      
      modelo.addAttribute("mensaje","hola desde thymeleaf");
      return "prueba/hola";
    }


    private ArrayList<Cliente> mostrarDatosAscId(){
        return domusService.obtenerOrdenadoAscClienteId();
    }

    @PostMapping()
    public Cliente guardarUsuario(@RequestBody Cliente clienteNuevo){
        return this.guardarUsuario(clienteNuevo);

    }
    
}
