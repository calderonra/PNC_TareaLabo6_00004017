package com.uca.capas.pratica.Domain;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(schema = "public",name = "contribuyente")
public class Contribuyente {
    @Id
    @Column(name = "c_contribuyente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer c_contribuyente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "s_importancia")
    private Importancia importancia;

    @Column(name = "s_nombre")
    @Size(max = 30,message = "El nombre no debe tener mas de 30 de caracteres")
    private String nombre;

    @Column(name = "s_apellido")
    @Size(max = 30,message = "El nombre no debe tener mas de 30 de caracteres")
    private  String apellido;

    @Column(name = "s_nit")
    private String nit;

    @Column(name="f_fecha")
    private Date date;

    public Contribuyente(){

    }

    public Integer getC_contribuyente() {
        return c_contribuyente;
    }

    public void setC_contribuyente(Integer c_contribuyente) {
        this.c_contribuyente = c_contribuyente;
    }

    public Importancia getImportancia() {
        return importancia;
    }

    public void setImportancia(Importancia importancia) {
        this.importancia = importancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
