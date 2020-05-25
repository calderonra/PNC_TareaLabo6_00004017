package com.uca.capas.pratica.DAO;

import com.uca.capas.pratica.Domain.Contribuyente;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface ContribuyenteDAO {


    public List<Contribuyente> findAll() throws DataAccessException;
    public Contribuyente finOne(Integer code) throws DataAccessException;
    public void save(Contribuyente contribuyente) throws DataAccessException;

}
