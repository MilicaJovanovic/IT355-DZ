package com.milica.service;

import com.milica.model.Gost;
import java.util.List;

/**
 *
 * @author Milica
 */
public interface GostService {
    public int getCount();
    public List<Gost> getAllGost();
    public boolean addGost(Gost gost);
}
