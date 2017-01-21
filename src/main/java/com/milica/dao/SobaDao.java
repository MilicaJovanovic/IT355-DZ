package com.milica.dao;

import com.milica.model.Soba;
import java.util.List;

/**
 *
 * @author Milica
 */
public interface SobaDao {
    public int getCount();
    public List<Soba> getAllSoba();
    public boolean addSoba(Soba soba);
}
