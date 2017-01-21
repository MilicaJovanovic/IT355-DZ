package com.milica.service;

import com.milica.model.Soba;
import java.util.List;

/**
 *
 * @author Milica
 */
public interface SobaService {
    public int getCount();
    public List<Soba> getAllSoba();
    public boolean addSoba(Soba soba);
}
