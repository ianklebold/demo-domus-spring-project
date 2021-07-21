package com.inmobiliaria.domus.repository;
import com.inmobiliaria.domus.entity.Cliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Con este hacemos la conexion con la BD utilizando los metodos de la interfaz
 * Por eso es importante que esta interfaz conozca el modelo osea los datos
 * Con lo que va a trabajar desde la BD
 */
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
}
