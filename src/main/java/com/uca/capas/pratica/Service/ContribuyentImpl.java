package com.uca.capas.pratica.Service;


import com.uca.capas.pratica.DAO.ContribuyenteDAO;
import com.uca.capas.pratica.Domain.Contribuyente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class ContribuyentImpl implements ContribuyenteService{
    @Autowired
    ContribuyenteDAO contribuyenteDAO;

    @Override
    public List<Contribuyente> findAll() throws DataAccessException {
        return contribuyenteDAO.findAll();
    }

    @Override
    public Contribuyente finOne(Integer code) throws DataAccessException {
        return contribuyenteDAO.finOne(code);
    }

    @Override
    public void save(Contribuyente contribuyente) throws DataAccessException {
    contribuyenteDAO.save(contribuyente);
    }
}
