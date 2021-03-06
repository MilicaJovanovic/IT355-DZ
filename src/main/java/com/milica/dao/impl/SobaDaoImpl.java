/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milica.dao.impl;

import com.milica.dao.SobaDao;
import com.milica.entities.Soba;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Milica
 */
@Repository
public class SobaDaoImpl implements SobaDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public SobaDaoImpl() {}
    
    public SobaDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public boolean addSoba(Soba soba) {
        sessionFactory.getCurrentSession().save(soba);
        return true;
    }

    @Override
    @Transactional
    public boolean editSoba(Soba soba) {
        sessionFactory.getCurrentSession().saveOrUpdate(soba);
        return true;
    }

    @Override
    @Transactional
    public boolean deleteSoba(Soba soba) {
        sessionFactory.getCurrentSession().delete(soba);
        return true;
    }
    
    @Override
    @Transactional
    public Soba getSobaById(int id) {
        Soba soba = (Soba) sessionFactory.getCurrentSession().createCriteria(Soba.class).add(Restrictions.eq("sobaId", id)).uniqueResult();
        return soba;
    }
    
    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<Soba> getSobe() {
        List<Soba> results = (List<Soba>) sessionFactory.getCurrentSession().createCriteria(Soba.class).list();
        return results;
    }
}
