package com.inmobiliaria.domus.entity;
import com.inmobiliaria.domus.entity.Cliente;


import javax.persistence.*;


@Entity
public class Cita {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY) //Muchas citas para un solo cliente.
    @JoinColumn(name = "idcliente")
    private Cliente cliente;

    private String descripcion;
    private String fechaCita;
    private String horaCita;
    private Boolean confirmado;



    //Falta añadir un agente inmobiliario
    


    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return Cliente return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return String return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return String return the fechaCita
     */
    public String getFechaCita() {
        return fechaCita;
    }

    /**
     * @param fechaCita the fechaCita to set
     */
    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    /**
     * @return String return the horaCita
     */
    public String getHoraCita() {
        return horaCita;
    }

    /**
     * @param horaCita the horaCita to set
     */
    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    /**
     * @return Boolean return the confirmado
     */
    public Boolean isConfirmado() {
        return confirmado;
    }

    /**
     * @param confirmado the confirmado to set
     */
    public void setConfirmado(Boolean confirmado) {
        this.confirmado = confirmado;
    }

}
