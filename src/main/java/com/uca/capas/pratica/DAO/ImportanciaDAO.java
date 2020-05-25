package com.uca.capas.pratica.DAO;

import com.uca.capas.pratica.Domain.Importancia;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface ImportanciaDAO {

    public List<Importancia> findAll() throws DataAccessException;

}
