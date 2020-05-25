package com.uca.capas.pratica.Domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(schema = "public",name="importancia")
public class Importancia {
    @Id
    @Column(name="c_importancia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoImportancia;

    @Size(max = 30,message="El nombre no debe tener mas de 30 caracteres")
    @NotEmpty(message="Este campo no puede quedar vacio")
    @Column(name="s_importancia")
    private String importancia;

    @OneToMany(mappedBy="importancia", fetch = FetchType.EAGER)
    private List<Contribuyente> contribuyentes;

    public Importancia(){

    }

    public Integer getCodigoImportancia() {
        return codigoImportancia;
    }
    public void setCodigoImportancia(Integer codigoImportancia) {
        this.codigoImportancia = codigoImportancia;
    }
    public String getImportancia() {
        return importancia;
    }
    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }
    public List<Contribuyente> getContribuyentes() {
        return contribuyentes;
    }
    public void setContribuyentes(List<Contribuyente> contribuyentes) {
        this.contribuyentes = contribuyentes;
    }
}
