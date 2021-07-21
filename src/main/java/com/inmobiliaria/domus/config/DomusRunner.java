package com.inmobiliaria.domus.config;
import com.inmobiliaria.domus.services.*;
import com.inmobiliaria.domus.entity.Cliente;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DomusRunner implements CommandLineRunner{
    @Autowired
    DomusService domusService;
    @Override
    public void run(String... args) throws Exception{
      /*
        Cliente cliente = new Cliente();

        cliente.setNombre("Ian");
        cliente.setApellido("Fernandez");
        cliente.setEmail("ianstgo@gmail.com");
        cliente.setTelefono(1231);

        domusService.guardarCliente(cliente);
        
        Cliente cliente2 = new Cliente();

        cliente2.setNombre("Juan");
        cliente2.setApellido("Martinez");
        cliente2.setEmail("CorreoFalse@gmail.com");
        cliente2.setTelefono(1234);

        domusService.guardarCliente(cliente2);
      */



    }


}
