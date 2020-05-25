package com.uca.capas.pratica.DAO;

import com.uca.capas.pratica.Domain.Importancia;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ImporatanciaDAOImp implements ImportanciaDAO{
@PersistenceContext(unitName = "pratica")
private EntityManager entityManager;


    @Override
    public List<Importancia> findAll() throws DataAccessException {
        StringBuffer sb = new StringBuffer();
        sb.append("select * from public.importancia");
        Query query = entityManager.createNativeQuery(sb.toString(), Importancia.class);
        List <Importancia> resultset = query.getResultList();
        return resultset;
    }
}
