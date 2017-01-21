package com.milica.service.impl;

import com.milica.dao.GostDao;
import com.milica.model.Gost;
import com.milica.service.GostService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Milica
 */
public class GostServiceImpl implements GostService {
    @Autowired
    GostDao gostDao;
    
    @Override
    public int getCount() {
    return gostDao.getCount();
    }
    
    @Override
    public List<Gost> getAllGost() {
    return gostDao.getAllGost();
    }
    
    @Override
    public boolean addGost(Gost gost) {
    return gostDao.addGost(gost);
    }
}
