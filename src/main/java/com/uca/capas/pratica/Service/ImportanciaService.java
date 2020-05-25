package com.uca.capas.pratica.Service;

import com.uca.capas.pratica.Domain.Importancia;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface ImportanciaService {
    public List<Importancia> findAll() throws DataAccessException;
}
