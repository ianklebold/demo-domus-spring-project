package com.inmobiliaria.domus.services;
import com.inmobiliaria.domus.repository.ClienteRepository;
import com.inmobiliaria.domus.entity.Cliente;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
/**
 * Servicio ejecuta
 * La logica de la aplicacion
 * 
 */
@Service
public class DomusService {
    @Autowired
    ClienteRepository clienteRepository;

    //Aca creamos todos los metodos para obtener, generar, crear, etc.

    public ArrayList<Cliente> obtenerCliente(){
        /**
         * Este metodo devuelve la lista de clientes registrados
         */
        //clienteRepository.findAll() devuelve un iterable con (ArrayList<Cliente>)
        //Lo "casteamos"
        return (ArrayList<Cliente>) clienteRepository.findAll();
    }

    public ArrayList<Cliente> clientePorApellido(String apellido){
        /**
         * Hacer esto es equivalente a :
         * Select * 
         * From Cliente
         * Where Cliente.apellido == apellido(Por parametro)
         */
        return (ArrayList<Cliente>) clienteRepository.findByApellidoLike(apellido);
    }

    public Cliente guardarCliente(Cliente clienteNuevo){
        /**
         * Este metodo guarda en la BD un nuevo cliente
         */
        return clienteRepository.save(clienteNuevo);
    }


}
