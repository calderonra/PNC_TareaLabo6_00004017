package com.uca.capas.pratica.Service;

import com.uca.capas.pratica.DAO.ImportanciaDAO;
import com.uca.capas.pratica.Domain.Importancia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImportanciaImp implements ImportanciaService {

    @Autowired
    ImportanciaDAO importanciaDAO;

    @Override
    public List<Importancia> findAll() throws DataAccessException {
        return importanciaDAO.findAll();
    }
}
