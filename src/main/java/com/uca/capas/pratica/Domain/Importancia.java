package com.uca.capas.pratica.Domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "public",name="importancia")
public class Importancia {

    @Id
    @Column(name = "c_importancia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoImportancia;

    @OneToMany(mappedBy = "importancia",fetch = FetchType.EAGER)
    private List<Contribuyente> Contribuyentes;

    public Importancia(){

    }

    public Integer getCodigoImportancia() {
        return codigoImportancia;
    }

    public void setCodigoImportancia(Integer codigoImportancia) {
        this.codigoImportancia = codigoImportancia;
    }

    public List<Contribuyente> getContribuyentes() {
        return Contribuyentes;
    }

    public void setContribuyentes(List<Contribuyente> contribuyentes) {
        Contribuyentes = contribuyentes;
    }
}
