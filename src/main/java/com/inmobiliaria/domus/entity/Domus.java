package com.inmobiliaria.domus.entity;
import com.inmobiliaria.domus.entity.Cliente;
import com.inmobiliaria.domus.entity.Cita;


import javax.persistence.*;
import java.util.*;


@Embeddable
public class Domus {
    

    private List<Cliente> clientes;

    private List<Cita> citas;

    /**
     * @return List<Cliente> return the clientes
     */
    public List<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * @return List<Cita> return the citas
     */
    public List<Cita> getCitas() {
        return citas;
    }

    /**
     * @param citas the citas to set
     */
    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

}
