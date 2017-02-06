/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milica.dao.impl;

import com.milica.dao.GostDao;
import com.milica.entities.Gost;
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
public class GostDaoImpl implements GostDao {
     
    @Autowired
    private SessionFactory sessionFactory;
    
    public GostDaoImpl() {}
    
    public GostDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public boolean addGost(Gost gost) {
        sessionFactory.getCurrentSession().save(gost);
        return true;
    }

    @Override
    @Transactional
    public boolean editGost(Gost gost) {
        sessionFactory.getCurrentSession().saveOrUpdate(gost);
        return true;
    }

    @Override
    @Transactional
    public boolean deleteGost(Gost gost) {
        sessionFactory.getCurrentSession().delete(gost);
        return true;
    }
    
    @Override
    @Transactional
    public Gost getGostById(int id) {
        Gost gost = (Gost) sessionFactory.getCurrentSession().createCriteria(Gost.class).add(Restrictions.eq("gostId", id)).uniqueResult();
        return gost;
    }
    
    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<Gost> getGosti() {
        List<Gost> results = (List<Gost>) sessionFactory.getCurrentSession().createCriteria(Gost.class).list();
        return results;
    }
}
