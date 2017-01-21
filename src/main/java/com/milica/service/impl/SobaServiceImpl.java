package com.milica.service.impl;

import com.milica.dao.SobaDao;
import com.milica.model.Soba;
import com.milica.service.SobaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Milica
 */
public class SobaServiceImpl implements SobaService {
    @Autowired
    SobaDao sobaDao;
    
    @Override
    public int getCount() {
    return sobaDao.getCount();
    }
    
    @Override
    public List<Soba> getAllSoba() {
    return sobaDao.getAllSoba();
    }
    
    @Override
    public boolean addSoba(Soba soba) {
    return sobaDao.addSoba(soba);
    }
}
