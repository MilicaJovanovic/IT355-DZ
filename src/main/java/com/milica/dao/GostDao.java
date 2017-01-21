package com.milica.dao;

import com.milica.model.Gost;
import java.util.List;

/**
 *
 * @author Milica
 */
public interface GostDao {
    public int getCount();
    public List<Gost> getAllGost();
    public boolean addGost(Gost gost);
}
