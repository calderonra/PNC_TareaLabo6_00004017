package com.uca.capas.pratica.DAO;

import com.uca.capas.pratica.Domain.Contribuyente;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class ContribuyentDAOImpl implements ContribuyenteDAO {
    @PersistenceContext(unitName = "practica")
    private EntityManager entityManager;
    @Override
    public List<Contribuyente> findAll() throws DataAccessException {
        StringBuffer sb = new StringBuffer();
        sb.append("SELECT * FROM public.contribuyente");
        Query query = entityManager.createNativeQuery(sb.toString(), Contribuyente.class);
        List <Contribuyente> resulset = query.getResultList();
        return resulset;
    }

    @Override
    public Contribuyente finOne(Integer code) throws DataAccessException {
        return null;
    }


    @Transactional
    @Override
    public void save(Contribuyente contribuyente) throws DataAccessException {
        entityManager.persist(contribuyente);
    }
}
