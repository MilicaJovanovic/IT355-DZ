/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milica.dao;

import com.milica.entities.Gost;
import java.util.List;

/**
 *
 * @author Milica
 */
public interface GostDao {
    public boolean addGost(Gost gost);
    public boolean editGost(Gost gost);
    public boolean deleteGost(Gost gost);
    public Gost getGostById(int id);
    public List<Gost> getGosti();
}
