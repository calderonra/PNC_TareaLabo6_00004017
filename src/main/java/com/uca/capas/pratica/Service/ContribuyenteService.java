package com.uca.capas.pratica.Service;

import com.uca.capas.pratica.Domain.Contribuyente;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface ContribuyenteService {

    public List<Contribuyente> findAll() throws DataAccessException;
    public Contribuyente finOne(Integer code) throws DataAccessException;
    public void save(Contribuyente contribuyente) throws DataAccessException;


}
